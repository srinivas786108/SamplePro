public class OtherClass extends AbstractExp{

    @Override
    void outbox() {
        System.out.println("ths is outbox");
    }

    void delete(){

    }

    @Override
    void logout() {

    }

    public static void main(String[] args) {

        AbstractExp obj=new OtherClass();



        OtherClass o=new OtherClass();
        o.login();
        o.inbox();
        o.outbox();
    }
}
