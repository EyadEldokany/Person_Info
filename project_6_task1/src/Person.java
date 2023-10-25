public class Person {
   private String name;
    private int age;
    private String job;
    private float salary;
    private String city;
    static long population;

    public String getName(){
        return name;
    }
    public void setName(String str){
        name=str;
    }
    public String getJob(){
        return job;
    }
    public void setJob(String str){
        job=str;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String str){
        city=str;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(){
        population++;
    }
    Person(String n , int x){
        age=x;
        name = n;
        population++;
    }
    Person(String s , int a , String c , float b , String j){
        name=s;
        age=a;
        city=c;
        job=j;
        salary = b;
        population++;
    }
}
