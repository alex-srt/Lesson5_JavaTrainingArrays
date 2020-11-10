package AbstractClassesAndInterfaces;

public class Phone90x extends AbstractPhone {

    private int numOfButtons;
    private String display;

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void ring(){
        System.out.println("Incoming...");
    }

    public Phone90x(int numOfButtons, String display){
        this.numOfButtons=numOfButtons;
        this.display=display;
    }

    public static void main(String[] args) {
        Phone90x phone90x = new Phone90x(10,"Grey");
        phone90x.call();
        phone90x.ring();

        System.out.println("Number of buttons: "+ phone90x.numOfButtons + "\nColor of display: "+ phone90x.display);


    }
}
