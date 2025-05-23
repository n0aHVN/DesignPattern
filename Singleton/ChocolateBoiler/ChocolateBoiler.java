package Singleton.ChocolateBoiler;

public class ChocolateBoiler{
	private boolean empty;
	private boolean boiled;
    //Static
	private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler(){
        empty = true;
        boiled =false;
    }
    //Static method
    //Synchronized way
	public static synchronized ChocolateBoiler getInstance(){
		if (chocolateBoiler == null){
			chocolateBoiler = new ChocolateBoiler();
		}
		return chocolateBoiler;
	}
    /* Normal way
    public static ChocolateBoiler getInstance(){
		if (chocolateBoiler == null){
			chocolateBoiler = new ChocolateBoiler();
		}
		return chocolateBoiler;
	}
    */

    /* Double-checked locking

    //This must be volatiled
    private static volatile ChocolateBoiler chocolateBoiler;

    public static ChocolateBoiler getInstance(){
		if (chocolateBoiler == null){
            synchronized(ChocolateBoiler.class){
                if (chocolateBoiler == null){
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
		}
		return chocolateBoiler;
	}
    */

	public void fill(){
		if (isEmpty()){
			empty = false;
			boiled = false;
            System.out.println("Filling");
		}
	}
    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("Draining");
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = true;
        }
        System.out.println("Boiling");
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}