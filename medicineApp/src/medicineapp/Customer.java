package medicineapp;


public class Customer extends User{
    
    public Customer(){
        this(new Customer());
    }
    
    public Customer(String userName, String passWord, int age, double money){
        super(userName, passWord, age, money);
    }
    
    public Customer(User e){
        this(e.getId(),e.getUserName(), e.getPassWord(), e.getAge(),e.getMoney());
    }
    
    public Customer(int id, String userName, String passWord, int age, double money){
        super(id ,userName, passWord, age, money);     
    }
    
    
    public Customer deposit(Customer e){
        System.out.print("Enter amount to deposit: ");
        double deposit = input.nextInt();
        e.setMoney(e.getMoney() + deposit);
        System.out.println("Your balance now is: " + e.getMoney());
        return e;
    }
    
    public void viewOptions(){
        System.out.println("Choose transaction:\n0. View balance \n1. Deposit balance\n2. Order\n3. View Medicines\n4. View Orders\n5. Change Password\n6. Pay Order\n7. Log out");
//        System.out.println("Choose transaction:\n0. View balance \n1. Deposit balance\n2. Order\n3. View Medicines\n4. View Orders\n5. Pay Order\n6. Log out");
    }
    
    public Orders orderItem(Pharmacy med, User a){
        int count = 0;
        Orders order = new Orders();
        a.viewMedicines(med);
        int max = 150;
        int min = 15;
        int range = max - min + 1;
        int num = (int) (Math.random() * range) + min;
        System.out.println("Choose by entering item ID!");
        System.out.print("Enter ID for the item: ");
        int option123 = input.nextInt();
        System.out.print("Enter quantity: ");
        int qty = input.nextInt();
        for (int i = 0; i < med.getMedicineList().size(); i++) {
            if (option123 == med.getMedicineList().get(i).getId()) {
                order = new Orders(num, a.getId(), med.getMedicineList().get(i).getId(), med.getMedicineList().get(i).getBrandName(), qty, qty * med.getMedicineList().get(i).getPrice());
                    System.out.println("Successfully Ordered! ");
                    return order;
            }
            count++;
        }
        if(count == med.getMedicineList().size()){
            noExisting();
        }
        return order;
    }  
    
    public void noExisting(){
        System.out.println("No existing medicine!");
    
    }
  
}
