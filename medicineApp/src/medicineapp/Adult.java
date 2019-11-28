package medicineapp;

public class Adult extends Customer{
    
    public Adult(){
        this(new User());
    }
    
    public Adult(String userName, String passWord, int age, double money){
        super(userName, passWord, age, money);
    }
    
    public Adult(User e){
        this(e.getId(),e.getUserName(), e.getPassWord(), e.getAge(),e.getMoney());
    }
    
    public Adult(int id, String userName, String passWord, int age, double money){
        super(id ,userName, passWord, age, money);     
    }
    
    
    public User payOrder(User e, Pharmacy a, int inputs){
        int count = 0;
        for(int i = 0; i<a.getOrderList().size();i++){
            if(e.getId() == a.getOrderList().get(i).getUserId() && a.getOrderList().get(i).getId() == inputs){
                if(e.getMoney()>a.getOrderList().get(i).getAmount()){
                    System.out.println("You have no discount!");
                    e.setMoney(e.getMoney()-a.getOrderList().get(i).getAmount());
                    System.out.println("Order is paid sucessfully!");
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
        System.out.println("Sorry you have no order or invalid input of Order ID!");
    }
    
    public void insufficientBalance(){
        System.out.println("Sorry! Insufficient balance!");
    }
    
    @Override
    public String toString() {
        return String.format(super.getUserName(), super.getAge(), super.getPassWord(), super.getMoney());
    }
}
