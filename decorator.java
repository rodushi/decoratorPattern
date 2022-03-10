
package Decorator;


public abstract class decorator extends Drinks {
    public Drinks drinks;
    
    public decorator(Drinks drinks){
        this.drinks = drinks;
    }
}
