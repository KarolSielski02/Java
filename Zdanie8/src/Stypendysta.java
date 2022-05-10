public class Stypendysta extends Student {

    Double scholarship;

    public Double getScholarship(){
        return scholarship;
    }

    public void setScholarship(Double scholarship){
        this.scholarship = scholarship;
    }

    public String toString(){
        return getClass() + ", " + getName() + " " + getSurname() + " ,czy jest mezczyzna: " + getIsMan() + ", Urodzony/a: " + getDateOfBirth() + " ,"
                + "index: " + getIndex() + ", Wysokosc stypendium = " + getScholarship() + " zl.";
    }
}
