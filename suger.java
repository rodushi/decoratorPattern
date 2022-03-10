
package Decorator;


public class suger extends decorator {
    public suger(Drinks drinks){
        super(drinks);
    }

  
    @Override
    public double cost() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return super.drinks.cost()+10.0;
 
    
    }
    
}
