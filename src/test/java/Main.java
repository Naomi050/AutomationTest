import org.openqa.selenium.By;


public class Main {


    public static void main(String[] args) throws InterruptedException {
       LoginTest loginTest = new LoginTest();

       loginTest.loginWithValidData();

       WishlistTest wish = new WishlistTest();
       wish.addToWishlistTest();

       RegisterTest register = new RegisterTest();
       register.getRegisterTest();

    }


    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
