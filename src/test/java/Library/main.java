package Library;

public class main {

    public static void main(String[] args){
        Salary salary = new Salary();
        Address address = new Address();

        User user = new User(salary,address);
        user.printuserinfo();
    }
}
