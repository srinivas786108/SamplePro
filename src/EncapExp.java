public class EncapExp {

    private int balance;
    private String name;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EncapExp e=new EncapExp();
        e.balance=6767;

        e.setName("java");
        System.out.println(e.getName());
    }
}
