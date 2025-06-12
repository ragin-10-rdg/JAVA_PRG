package week6;
class OuterClass{
    int x=2;
    class InnerClass{
        int y=5;
    }
}

public class Innerclass {
    public static void main(String[] args) {
        OuterClass o=new OuterClass();
        OuterClass.InnerClass i=o.new InnerClass();
        i.y=10;
        o.x=5;
    }
}
