public class Kids {
    String firstName;
    String secondName;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public Kids(String firstName,String secondName,int age){
        this.firstName=  firstName;
        this.secondName=secondName;
        this.age=age;

    }
}
