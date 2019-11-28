package medicineapp;

import java.util.Scanner;

public class User extends Account{
    
    Scanner input = new Scanner(System.in);
    private String userName;
    private String passWord;
    private int age;
    private double money;
    private int id;
    
    
    public User() {
    }
    
    public User(User e){
        this(e.id,e.userName,e.passWord,e.age,e.money);
    
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String userName, String passWord, int age, double money) {
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
        this.money = money;
    }

    public User(int id, String userName, String passWord, int age, double money) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getId() {
        return id;
    }


    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    @Override
    public void viewMedicines(Pharmacy a) {
        System.out.printf("%10s %5s %30s %5s %20s %5s %20s %5s %15s %5s %10s", "ID", "|", "Generic Name", "|", "Brand Name", "|", "Type of Medicine", "|", "Price", "|", "Stock (Pieces)\n");
        System.out.printf("%s", "------------------------------------------------------------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < a.getMedicineList().size(); i++) {
            System.out.printf("%10s %5s %30s %5s %20s %5s %20s %5s %15s %5s %10s \n", a.getMedicineList().get(i).getId(), "|", a.getMedicineList().get(i).getGenericName(), "|", a.getMedicineList().get(i).getBrandName(), "|", a.getMedicineList().get(i).getMedicineType(), "|", a.getMedicineList().get(i).getPrice(), "|", a.getMedicineList().get(i).getStock());
        }  
    }

    @Override
    public User login(User e, Pharmacy a) {
        System.out.print("Input Username: ");
        String name = input.nextLine();
        int counts = 0;
        if(a.getPharmacist().getUserName().equals(name) == true){
            int count = 0;
            System.out.println("Username matched!");
            while (count != 3) {
                System.out.print("Input Password: ");
                String pass = input.nextLine();
                if(a.getPharmacist().getPassWord().equals(pass) == true){
                    e = a.getPharmacist();
                    return e;                     
                }
                else if(count == 3){
                    error();
                }
                else {
                    count++;
                }
            }
        }
        else {
            for (int i = 0; i < a.getUserList().size(); i++) {
                if (name.equals(a.getUserList().get(i).getUserName()) == false) {
                    counts += 1;
                    if (counts == a.getUserList().size()) {
                        error();
                    }
                } else {
                    int count = 0;
                    System.out.println("Username matched!");
                    while (count != 3) {
                        System.out.print("Input Password: ");
                        String pass = input.nextLine();
                        for (int j = 0; j < a.getUserList().size(); j++) {
                            if (pass.equals(a.getUserList().get(i).getPassWord()) == true) {
                                e = a.getUserList().get(i);
                                System.out.println("Logged in! \nWelcome "+ a.getUserList().get(i).getUserName() + "!");
                                return e;
                            }
                        }
                        count += 1;
                    }
                    if (count == 3) {
                        error();
                    }
                }
            }
        }   
        return e;  
    }

    @Override
    public void register(User e, Pharmacy a) {
        int count = 0;
        System.out.print("Enter Username: ");
        String uName = input.nextLine();
        while(count!=a.getUserList().size()){
            if(a.getUserList().get(count).getUserName().equals(uName)==true){
                count = 0;
                System.out.println("Username already exist!");
                System.out.print("Enter Username again: ");
                uName = input.nextLine();
            }
            else{
                count++;
            }
        }
        System.out.print("Enter Password: ");
        String pWord = input.nextLine();
        System.out.print("Confirm Password: ");
        String conPassword = input.nextLine();
        while(conPassword.equals(pWord) == false){
            System.out.println("Password did not match!");
            System.out.print("Confirm Password again: ");
            conPassword = input.nextLine();
            if(conPassword.equals(pWord)== true){
                break;
            }
        }
        System.out.print("Enter age: ");
        String userAge = input.nextLine();
        if(Integer.valueOf(userAge)>=18 && Integer.valueOf(userAge)<=59){
            System.out.print("Deposit money to your account: ");
            String userMoney = input.nextLine();
            e = new Adult(a.getUserList().size()+1,uName,pWord,Integer.valueOf(userAge),Integer.valueOf(userMoney));
            a.getUserList().add(e);
            System.out.println("Successfully registered!");
        }
        else if(Integer.valueOf(userAge)>=60){
            System.out.print("Deposit money to your account: ");
            String userMoney = input.nextLine();
            e = new SeniorCitizen(a.getUserList().size()+1,uName,pWord,Integer.valueOf(userAge),Integer.valueOf(userMoney));
            a.getUserList().add(e);
            System.out.println("Successfully registered!");
        }
        else{
            System.out.println("Too young to register!");
        }     
    }

    @Override
    public User logout(User e) {
        User b = new User();
        return b;
    }

    @Override
    public User changePassword(User e) {
        System.out.print("Type current password: ");
        String oldPass = input.nextLine();
        if (oldPass.equals(e.getPassWord())) {
            System.out.print("Enter new password: ");
            String newPass = input.nextLine();
            System.out.print("Confirm new password: ");
            String conpass = input.nextLine();
            if (newPass.equals(conpass) == true) {
                e.setPassWord(newPass);
                System.out.println("Successfully changed password!");
                return e;
            } else {
                wrong();
            }
        } else {
            wrong();
        }
        return e;
        
    }
    
    public void error() {
        System.out.println("Error Logging in! Please try again later!");
        System.exit(0);
    }
    
    public void wrong() {
        System.out.println("Wrong Password!");
    }
    
    public void displayOrders(Pharmacy a, User e) {
        if(e == a.getPharmacist()){
            System.out.printf("%10s %5s %10s %5s %25s %5s %15s %5s %10s", "ID", "|", "User ID", "|", "Ordered Generic Name", "|", "Quantity", "|", "Amount\n");
            System.out.printf("%s", "-------------------------------------------------------------------------------------------------------------------------------\n");
            for (int i = 0; i < a.getOrderList().size(); i++) {
                System.out.printf("%10s %5s %10s %5s %25s %5s %15s %5s %10s \n", a.getOrderList().get(i).getId(), "|", a.getOrderList().get(i).getUserId(), "|", a.getOrderList().get(i).getOrderedName(), "|", a.getOrderList().get(i).getQuantity(), "|", a.getOrderList().get(i).getAmount());
            }
            if(a.getOrderList().size() == 0){
                System.out.println("There are no orders currently!");
            }
        }
        else {
            int count = 0;
            System.out.println("Your orders: ");
            System.out.printf("| %10s %5s %10s %5s %20s %5s %10s %5s %10s |\n", "Order Id", "|", "User Id", "|", "Ordered Item", "|", "Quantity", "|", "Amount");
            System.out.printf("%s \n", "--------------------------------------------------------------------------------------------");
            for (int i = 0; i < a.getOrderList().size(); i++) {
                if (e.getId() == a.getOrderList().get(i).getUserId()) {
                    count += 1;
                    System.out.printf("| %10s %5s %10s %5s %20s %5s %10s %5s %10s |\n", a.getOrderList().get(i).getId(), "|", a.getOrderList().get(i).getUserId(), "|", a.getOrderList().get(i).getOrderedName(), "|", a.getOrderList().get(i).getQuantity(), "|", a.getOrderList().get(i).getAmount());
                }
            }
            if (count == 0) {
                System.out.println("You have no any orders!");
            }
        }   
    }
}
