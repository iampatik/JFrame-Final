package medicineapp;

public class SeniorCitizen extends Customer{
    
    public SeniorCitizen(){
        this(new User());
    }
    
    public SeniorCitizen(String userName, String passWord, int age, double money){
        super(userName, passWord, age, money);
    }
    
    public SeniorCitizen(User e){
        this(e.getId(),e.getUserName(), e.getPassWord(), e.getAge(),e.getMoney());
    }
    
    public SeniorCitizen(int id, String userName, String passWord, int age, double money){
        super(id ,userName, passWord, age, money);     
    }
   
    public User payWithDiscount(User e, Pharmacy a, int inputs){
        int count = 0;
        for(int i = 0; i<a.getOrderList().size();i++){
            if(e.getId() == a.getOrderList().get(i).getUserId() && a.getOrderList().get(i).getId() == inputs){
                if(e.getMoney()>a.getOrderList().get(i).getAmount()){
                    double price = a.getOrderList().get(i).getAmount()*0.8;
                    System.out.println("You're payment is discounted by 20% and now it is: "+price);
                    e.setMoney(e.getMoney()-price);
                    System.out.println("Order is paid successfully!");
                    return e;
                }
                else {
                    insufficientBalance();             
                }
            }
            else {
                count++;
            }
        }
        if(count==a.getOrderList().size()){
            noOrder();           
        }
        return e;
    }
    
    public void noOrder(){
        System.out.println("Sorry you have no order! Order first!");
    }
    
    public void insufficientBalance(){
        System.out.println("Sorry! Insufficient balance!");
    }

    
    @Override
    public String toString() {
        return String.format(super.getUserName(), super.getPassWord(), super.getAge(), super.getMoney());
    }
    
}
