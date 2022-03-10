
package Decorator;


public class main {
    public static void main(String[] args) {
        System.out.println(new milk(new suger(new espresso() {})).cost());
    }
}
