package medicineapp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Medicine med = new Medicine();
        User user = new User();
        Pharmacy phar = new Pharmacy();
        phar.getPharmacist().addAllInfo(phar);
        System.out.println("Welcome to Patchan Pharmacy!\n");
        while(true){
            System.out.println("1. Log in\n2. Register \n");
            System.out.print("Enter choice: ");
            int regOrLogIn = input.nextInt();
            if (regOrLogIn == 2) {
                user.register(user,phar);
            }
            else if(regOrLogIn == 1){
                User a = user.login(user, phar);
                if(a == phar.getPharmacist()){
                    System.out.println("Your account is now logged in as a Pharmacist! \n-------------------------------------------------------------------------------");
                    while(true){
                        System.out.println("Choose transactions:\n0. Add Medicine\n1. Remove Medicine\n2. Display Medicines\n3. View Orders\n4. Change Password\n5. Logout");
                        System.out.print("Enter your choice: ");
                        int option = input.nextInt();
                        if (option == 0) {
                            phar.getMedicineList().add(phar.getPharmacist().addMedicine(med, phar));
                        } else if (option == 1) {
                            phar.getMedicineList().remove(phar.getPharmacist().removeMedicine(med, phar));
                            phar.getPharmacist().updateId(phar);
                        } else if (option == 2) {
                            phar.getPharmacist().viewMedicines(phar);
                        } else if (option == 3) {
                            phar.getPharmacist().displayOrders(phar, a);
                        } else if (option == 4) {
                            phar.getPharmacist().changePassword(a);
                        } else if(option == 5){
                            System.out.println("You are now logged out!");
                            phar.getPharmacist().logout(a);
                            break;
                        } else {
                            System.out.println("Invalid input!");
                        }
                    }
                } else {
                    System.out.println("You're logged in as " + a.getClass().getSimpleName() + "!\n-------------------------------------------------------------------------------");
                    while (true) {
                        ((Customer)a).viewOptions();
                        System.out.print("Enter your choice: ");
                        int option = input.nextInt();
                        if (option == 0) {
                            System.out.println("Your balance is: Php" + a.getMoney());
                        } else if (option == 1) {
                            ((Customer)a).deposit((Customer)a);
                        } else if (option == 2) {
                            phar.getOrderList().add(((Customer)a).orderItem(phar, a));
                        } else if (option == 3) {
                            a.viewMedicines(phar);
                        } else if (option == 4) {
                            a.displayOrders(phar, a);
                        } else if (option == 5) {
                            a.changePassword(a);
                        } else if (option == 6) {
                            a.displayOrders(phar, a);
                            System.out.print("Choose order by Order ID: ");
                            int inputs = input.nextInt();
                            if(a instanceof Adult){
                                phar.getPharmacist().updateMedicine(phar, phar.decMedicine(phar, inputs));
                                User replaceUser = new User(((Adult) a).payOrder(a, phar,inputs));
                                phar.getPharmacist().updateMoney(phar, replaceUser);
                            } else {
                                phar.getPharmacist().updateMedicine(phar, phar.decMedicine(phar, inputs));
                                User replaceUser = new User(((SeniorCitizen) a).payWithDiscount(a, phar,inputs));
                                phar.getPharmacist().updateMoney(phar, replaceUser);
                            }
                            phar.getOrderList().remove(phar.removeOrder(phar, inputs));
                        } else if (option == 7) {
                            System.out.println("You are now logged out!");
                            a.logout(a);
                            break;
                        } else {
                            System.out.println("Input Error!");
                        }
                    }
                }  
            } else { System.out.println("Invalid Input!"); }
        }
    }
}