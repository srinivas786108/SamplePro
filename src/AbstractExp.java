public abstract class AbstractExp {

    void login(){
        System.out.println("ths is login");
    }

    void inbox(){
        System.out.println("ths is inbox");
    }

  abstract  void outbox() ;

    abstract  void logout() ;
}
