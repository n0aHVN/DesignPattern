package Singleton.ChocolateBoiler;

public class ChocolateBoiler{
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler(){
        empty = true;
        boiled =false;
    }
	public static synchronized ChocolateBoiler getInstance(){
		if (chocolateBoiler == null){
			chocolateBoiler = new ChocolateBoiler();
		}
		return chocolateBoiler;
	}
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