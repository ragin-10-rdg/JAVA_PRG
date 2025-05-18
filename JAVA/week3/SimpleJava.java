package week3;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class SimpleJava {
    private final Map<String, Integer> logLevelCounts = new HashMap<>();
    private final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for number of files
        System.out.print("Enter the number of log files to analyze: ");
        int numberOfFiles = Integer.parseInt(scanner.nextLine());

        if (numberOfFiles <= 0) {
            System.out.println("No files to analyze. Exiting...");
            return;
        }

        // Step 2: Collect file paths
        String[] logFiles = new String[numberOfFiles];
        for (int i = 0; i < numberOfFiles; i++) {
            System.out.print("Enter path for log file " + (i + 1) + ": ");
            logFiles[i] = scanner.nextLine();
        }

        SimpleJava analyzer = new SimpleJava();
        analyzer.analyzeLogs(logFiles);
        analyzer.printSummaryToConsole();
    }

    public void analyzeLogs(String[] logFiles) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(logFiles.length);

        for (String filePath : logFiles) {
            executor.submit(() -> processFile(filePath));
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);

        writeSummary("log_summary.txt");
        System.out.println("\nAnalysis complete. Summary written to 'log_summary.txt'.\n");
    }

    private void processFile(String filePath) {
        System.out.println("Processing file: " + filePath);
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String level = parseLogLevel(line);
                if (level != null) {
                    incrementCount(level);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + filePath + ": " + e.getMessage());
        }
    }

    private String parseLogLevel(String logLine) {
        if (logLine.contains("INFO")) return "INFO";
        if (logLine.contains("WARN")) return "WARN";
        if (logLine.contains("ERROR")) return "ERROR";
        return null;
    }

    private void incrementCount(String level) {
        synchronized (lock) {
            logLevelCounts.put(level, logLevelCounts.getOrDefault(level, 0) + 1);
        }
    }

    private void writeSummary(String outputFile) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
            writer.write("Log Level Summary:\n");
            synchronized (lock) {
                for (Map.Entry<String, Integer> entry : logLevelCounts.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing summary file: " + e.getMessage());
        }
    }

    private void printSummaryToConsole() {
        System.out.println("----- Log Level Summary (Console) -----");
        synchronized (lock) {
            for (Map.Entry<String, Integer> entry : logLevelCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println("---------------------------------------");
    }
}
