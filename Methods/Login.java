package Methods;

public class Login {

    String username , password;

    void set(String user , String pass){
        username = user;
        password = pass;
    }

    void out(){
        if(username.equalsIgnoreCase("maki") && password.equals("69")){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Failed");
        }
    }


    public static void main(String[] args) {
        Login obj = new Login();
        obj.set("maki","69");
        obj.out();
        obj.password="123";
        obj.out();
    }
}
