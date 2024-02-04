package Object_And_Classes;


class Account{
    int acc_no;
    String name;
    float balance;

    void insert(String name , int acc_no , float amount){
        this.acc_no = acc_no;
        this.balance= amount;
        this.name =name;
    }

    void deposit(float amount){
        balance+=amount;
        System.out.println(amount+" deposited");
    }

    void withdraw(float amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
        }else{
            balance = balance - amount;
            System.out.println(amount + " is taken");
        }
    }

    void display(){
        System.out.println("Account No : "+acc_no);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }
}

public class Banking {
    public static void main(String[] args) {
        Account account = new Account();
        account.insert("maki" , 123 , 1000);
        account.display();
        account.deposit(100);
        account.withdraw(1000);
        account.display();
        account.withdraw(200);
    }
}
