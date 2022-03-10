
package Decorator;


public class milk extends decorator {
    public milk (Drinks drinks){
        super(drinks);
    }

   
    

    @Override
    public double cost() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return super.drinks.cost()+10.0;
    }
    
}
