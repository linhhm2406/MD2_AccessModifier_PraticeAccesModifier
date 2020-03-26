package PracticePrivate;

public class PracticePrivate {
    public static void main(String[] args) {
        A testA = new A(){};
        System.out.print(testA.a);
        testA.method1;
    }
}

    class A {
        private int a = 40;

        private void method1(){
            System.out.println(a);
        }
    }
