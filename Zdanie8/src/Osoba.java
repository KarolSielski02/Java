public class Osoba {
    String name;
    String surname;
    String dateOfBirth;
    boolean isMan;


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public boolean getIsMan() {
        return isMan;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public  void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setMan(Boolean isMan){
        this.isMan = isMan;
    }

    public String toString(){
        return getClass() + ", " + getName() + " " + getSurname() + " ,czy jest mezczyzna: " + getIsMan() + ", Urodzony/a: " + getDateOfBirth();
    }
}