import java.util.Scanner;

class account {
    Scanner sc = new Scanner(System.in);
    String name,acc,type;
    double balance;
    void setdata(String name,String acc,String type){
        this.name  = name;
        this.acc = acc;
        this.type = type;
        System.out.println("Enter the initial balance:");
        balance = sc.nextDouble();
    }
    void getdata() {
        System.out.println(name);
        System.out.println(acc);
        System.out.println(type);
    }
    void balance() {
        balance = balance + (balance*0.4);
        System.out.println(balance);
    }
}
class homeLoan extends account{
    double interest,loanAmt;
    int period;
    void setdata(String n, String a,String t,double loanAmt,double interest,int period) {
//        name = n;
//        acc = a;
//        type = t;
        super.setdata(n,a,t);
//        System.out.println("Enter the initial balance:");
//        balance = sc.nextDouble();
        this.loanAmt = loanAmt;
        this.interest = interest;
        this.period = period;
    }
    double EMI() {
        double monthlyInterest = interest/(12*100);
        int months = period*12;
        double emi = (loanAmt*monthlyInterest*Math.pow(1+monthlyInterest,months))/(Math.pow(1+monthlyInterest,months));
        return emi;
    }
    //    void getdata() {
//        System.out.println(name);
//        System.out.println(acc);
//        System.out.println(type);
//    }
    void display() {
        System.out.println(loanAmt);
        System.out.println(interest);
        System.out.println(period);
        super.balance();
        System.out.println(EMI());
    }
}

public class Bank {
    public static void main(String[] args) {
        homeLoan h1 = new homeLoan();
        h1.setdata("vivek","jbh34555","savings",1000000,10,3);
        h1.getdata();
        h1.display();
    }
}
