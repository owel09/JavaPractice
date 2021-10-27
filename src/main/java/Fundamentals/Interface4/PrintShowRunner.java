package Fundamentals.Interface4;

/*
Output:
Printing..
Showing...

Pinapakita lang dito kung paano kami gamitin yun 2 Interface na Printable and Showable
Kumbaga multiple inheritance technique
 */
public class PrintShowRunner implements Printable,Showable {
    @Override
    public void print() {
        System.out.println("Printing..");
    }

    @Override
    public void show() {
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        PrintShowRunner a7 = new PrintShowRunner();
        a7.print();
        a7.show();

    }
}
