package Library;

public class User {
    private Salary salary;
    private Address address;

    public User(Salary salary, Address address) {
        this.salary = salary;
        this.address = address;
    }



    public void printuserinfo(){
        System.out.println(this.address.getHouseno());
        System.out.println(this.salary.getSal());
    }


}
