import Controller.LoginController;
import Model.Admin;

public class Main
{
    private void run()
    {
        LoginController loginController = new LoginController();
        loginController.redirect();
    }


    private static void Datajalan()
    {
        Admin.Data();
    }
    public static void main(String[] args) {
        Datajalan();

        new Main().run();
    }
}
