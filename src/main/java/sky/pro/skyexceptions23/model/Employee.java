package sky.pro.skyexceptions23.model;

public class Employee extends Person{

    public Employee(String firstname, String lastName) {
        super(firstname, lastName);
    }

    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public void setFirstname(String firstname) {
        super.setFirstname(firstname);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
