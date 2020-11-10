package AbstractClassesAndInterfaces;

public class PhoneEnd90x extends Phone90x implements Chatting{

    private boolean music;

    public PhoneEnd90x(int year, boolean music, String company, String display, int buttons ){
        super(buttons, display);
        this.setYear(year);
        this.setCompany(company);

        this.music = music;
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void ring(){
        System.out.println("Incoming...");
    }

    @Override
    public void messenger1(){
        System.out.println("Messenger1 is messaging... ");
    };

    @Override
    public void sms(){
        System.out.println("Incoming sms... ");
    };

    public static void main(String[] args) {
        PhoneEnd90x phoneEnd90x = new PhoneEnd90x(2000,true,"Sony", "Colored", 4);
        phoneEnd90x.call();
        phoneEnd90x.ring();

        System.out.println("Manufacturer (Company) name: " + phoneEnd90x.getCompany());
        System.out.println("Year of manufacture: " + phoneEnd90x.getYear());

        phoneEnd90x.messenger1();
        phoneEnd90x.sms();
        System.out.println("With music? " + phoneEnd90x.music);
    }
}