package AbstractClassesAndInterfaces;

public abstract class AbstractPhone {
    private int year;
    private String company;
    public abstract void ring();
    public abstract void call();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
