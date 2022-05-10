public class Wykladowca extends Osoba{

    String degree;

    public String getDegree(){
        return degree;
    }

    public void setDegree(String degree){
        this.degree = degree;
    }

    public String toString(){
        return getClass() + ", " + getName() + " " + getSurname() + " ,czy jest mezczyzna: " + getIsMan() + ", Urodzony/a: " + getDateOfBirth() + " ,"
                + "Stopien: " + getDegree();
    }

}
