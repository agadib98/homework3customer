public class customer {
private  int id;
private  String name;
private  int phone;
private  int acctno;
private double currentbalance;

    public customer(int id, String name, int phone, int acctno, double currentbalance) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.acctno = acctno;
        this.currentbalance = currentbalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAcctno() {
        return acctno;
    }

    public void setAcctno(int acctno) {
        this.acctno = acctno;
    }

    public double getCurrentbalance() {
        return currentbalance;
    }

    public void setCurrentbalance(double currentbalance) {
        this.currentbalance = currentbalance;
    }
    public void DepositMoney(double balance){
    this.currentbalance = this.currentbalance+balance;
        System.out.println("the balance is "+currentbalance);
    }
    public void WithdrawMoney(double balance){
     this.currentbalance = this.currentbalance-balance;
     if(this.currentbalance<0)
         System.out.println(" not enough balance");

        System.out.println("the balance is "+currentbalance);
    }
    public void ApplyForLoan(){
    if(currentbalance>200000)
        System.out.println("the application for load is successful");
    else
        System.out.println("sorry,the application for load is unsuccessful");
    }
    public void RequestCard(){
        if(currentbalance>200000)
            System.out.println("the application for request card is successful");
        else
            System.out.println("sorry,the application for request card is unsuccessful");
    }
    }

