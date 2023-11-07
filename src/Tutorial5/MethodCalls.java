package Tutorial5;
public class MethodCalls {
    public static void main(String[] args) {
        displayMsg1();
        drawLine();
        displayMsg2();
        drawLine();
    }

    static void displayMsg1() {
        System.out.println("This is displayMsg1.");
    }

    static void displayMsg2() {
        System.out.println("This is displayMsg2.");
    }

    static void drawLine() {
        System.out.println("----------------------------");
    }
}
