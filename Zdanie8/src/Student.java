public class Student extends Osoba {

    String index;

    public String getIndex(){
        return index;
    }

    public void setIndex(String index){
        this.index = index;
    }

    public String toString(){
        return getClass() + ", " + getName() + " " + getSurname() + " ,czy jest mezczyzna: " + getIsMan() + ", Urodzony/a: " + getDateOfBirth() + " ,"
                + "index: " + getIndex();
    }
}
