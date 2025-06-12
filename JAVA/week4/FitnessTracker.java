package week4;
public class FitnessTracker {
    private static final double CALORIES_PER_STEP = 0.04;
    private static final double STANDARD_WEIGHT = 70.0;
    // Method to calculate calories burned
    public double calculateCaloriesBurned(int steps, double weight) {
        // Calories = (steps * weight * caloriesPerStep) / standard weight
        return (steps * weight * CALORIES_PER_STEP) / STANDARD_WEIGHT;
    }
    public String suggestWorkoutPlan(int age, double BMI) {
        String plan = "Suggested Workout Plan: ";
        if (BMI < 18.5) {
            plan += "Focus on strength training and healthy eating to gain weight.";
        } else if (BMI >= 18.5 && BMI < 25) {
            plan += "Maintain your healthy weight with moderate cardio and strength training.";
        } else if (BMI >= 25 && BMI < 30) {
            plan += "Add more cardio workouts to help reduce body fat.";
        } else {
            plan += "Combine cardio with resistance training and consult a nutritionist for a safe plan.";
        }
        if (age < 30) {
            plan += " Make sure to include some high-intensity workouts for cardiovascular health.";
        } else if (age >= 30 && age < 50) {
            plan += " Include flexibility and core strength exercises.";
        } else {
            plan += " Focus on low-impact activities like walking and swimming to protect joints.";
        }
        return plan;
    }

    // Main method to test the fitness tracker
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        int steps = 10000;
        double weight = 68.0; // in kg
        double caloriesBurned = tracker.calculateCaloriesBurned(steps, weight);
        System.out.println("Calories burned for " + steps + " steps: " + caloriesBurned + " kcal");
        int age = 35;
        double BMI = 27.0;
        String workoutPlan = tracker.suggestWorkoutPlan(age, BMI);
        System.out.println(workoutPlan);
    }
}
