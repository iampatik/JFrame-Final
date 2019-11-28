package medicineapp;

import java.util.Scanner;


public class Pharmacist extends User{
    
    public Pharmacist(){
        this(new User());
    }
    
    Scanner input = new Scanner(System.in);
    
    public Pharmacist(String userName, String passWord){
        super(userName,passWord);
    }
    
    public Pharmacist(User e){
        this(e.getUserName(),e.getPassWord());
    }
    
    @Override
    public void error(){
        System.out.println("Sorry try again to add medicine from the start!");
    }
    
//    public void viewAllOrders(Pharmacy a){
//        System.out.printf("%10s %5s %10s %5s %25s %5s %15s %5s %10s", "ID", "|", "User ID", "|", "Ordered Generic Name", "|", "Quantity", "|", "Amount\n");
//        System.out.printf("%s", "-------------------------------------------------------------------------------------------------------------------------------\n");
//        for (int i = 0; i < a.getOrderList().size(); i++) {
//            System.out.printf("%10s %5s %10s %5s %25s %5s %15s %5s %10s \n", a.getOrderList().get(i).getId(), "|", a.getOrderList().get(i).getUserId(), "|", a.getOrderList().get(i).getOrderedName(), "|", a.getOrderList().get(i).getQuantity(), "|", a.getOrderList().get(i).getAmount());
//        }
//    
//    }
    
    
    public Medicine addMedicine(Medicine e, Pharmacy a){
        int size = a.getMedicineList().size()+1;
        System.out.print("Input Generic Name: ");
        String genName = input.nextLine();
        System.out.print("Input price: ");
        String price = input.nextLine();
        System.out.print("Input Brand Name: ");
        String bName = input.nextLine();
        System.out.print("Input Quantity: ");
        String qty = input.nextLine();
        System.out.println("Choose Type of Medicine: \n1. Body Pain\n2. Cough\n3. Allergies\n4. Headache");
        System.out.print("Choose Medicine Type: ");
        int option1 = input.nextInt();
        if(option1 == 1){
            e = new BodyPain(size,genName, bName, "Body Pain", Double.valueOf(price), Integer.valueOf(qty));
            return e;
        }
        else if(option1 == 2){
            e = new Cough(size, genName, bName, "Cough", Double.valueOf(price), Integer.valueOf(qty));
            return e;
        }
        else if(option1 == 3){
            e = new Allergies(size,genName, bName, "Allergies", Double.valueOf(price), Integer.valueOf(qty));
            return e;
        }
        else if(option1 == 4){
            e = new Headache(size,genName, bName, "Headache", Double.valueOf(price), Integer.valueOf(qty));
            return e;
        }
        else{
            error();
        }
        return e;
    }
    
    public Medicine removeMedicine(Medicine e, Pharmacy a){
        Medicine b = new Medicine();
        System.out.printf("%10s %5s %30s %5s %20s %5s %20s %5s %15s %5s %10s", "ID","|","Generic Name", "|", "Brand Name", "|", "Type of Medicine", "|", "Price", "|", "Stock (Pieces)\n");
        System.out.printf("%s", "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < a.getMedicineList().size(); i++) {
            System.out.printf("%10s %5s %30s %5s %20s %5s %20s %5s %15s %5s %10s \n",a.getMedicineList().get(i).getId(),"|", a.getMedicineList().get(i).getGenericName(), "|", a.getMedicineList().get(i).getBrandName(), "|", a.getMedicineList().get(i).getMedicineType(), "|", a.getMedicineList().get(i).getPrice(), "|", a.getMedicineList().get(i).getStock());
        }
        
        System.out.print("Input ID of the medicine: ");
        int choice = input.nextInt();
        for (int i = 0; i < a.getMedicineList().size(); i++) {
            if (a.getMedicineList().get(i).getId() == choice) {
                b = a.getMedicineList().get(i);

            }
        }  
        return b;
    }
    
    public void addAllInfo(Pharmacy pat){
        pat.getUserList().add(new Adult(1, "Patchan", "Gwapoako", 19, 1000));
        pat.getUserList().add(new Adult(2, "Patrick", "Pogiako", 19, 5000));
        pat.getUserList().add(new SeniorCitizen(3, "Patik", "P@ssw0rd", 62, 5000));
        pat.getMedicineList().add(new BodyPain(1, "Ibuprofen + Paracetamol", "Alaxan", "Body Pain", 8.25, 100));
        pat.getMedicineList().add(new BodyPain(2, "Paracetamol Caffeine", "Rexidol", "Body Pain", 15.50, 75));
        pat.getMedicineList().add(new BodyPain(3, "Ibuprofen", "Medicol Advance", "Body Pain", 6.00, 100));
        pat.getMedicineList().add(new Allergies(4, "Cetirizine", "Allerkid", "Allergies", 8, 50));
        pat.getMedicineList().add(new Allergies(5, "Loratadine", "Allerta", "Allergies", 16, 50));
        pat.getMedicineList().add(new Allergies(6, "Mometasone Furoate", "Allerta Dermatec", "Allergies", 24, 50));
        pat.getMedicineList().add(new Cough(7, "Carbocisteine", "Solmux", "Cough", 17, 50));
        pat.getMedicineList().add(new Cough(8, "Ambroxol", "Myracof", "Cough", 22, 50));
        pat.getMedicineList().add(new Cough(9, "Ambroxol", "Expel OD", "Cough", 29, 50));
        pat.getMedicineList().add(new Headache(10, "Paracetamol", "Biogesic 325", "Headache", 6, 50));
        pat.getMedicineList().add(new Headache(11, "Paracetamol", "Biogesic", "Headache", 8, 50));
        pat.getMedicineList().add(new Headache(12, "Paracetamol", "UHP Fevertab", "Headache", 5, 50));     
    }
    
    
    public void updateMedicine(Pharmacy pat, Medicine replaceMed){
        int count = 0;
        for (int i = 0; i < pat.getMedicineList().size(); i++) {
            if (replaceMed.getId() == pat.getMedicineList().get(i).getId()) {
                count = i;
                pat.getMedicineList().get(i).setStock(replaceMed.getStock());
            }
        }
        if(pat.getMedicineList().get(count).getStock() == 0){
            pat.getMedicineList().remove(pat.getMedicineList().get(count));
            updateId(pat);    
        }
    }
    
    public void updateId(Pharmacy phar){
        for (int i = 0; i < phar.getMedicineList().size(); i++) {
            phar.getMedicineList().get(i).setId(i + 1);
        }
    }
    
    public void updateMoney(Pharmacy pat, User replaceUser){
        for(int i = 0; i < pat.getUserList().size();i++){
            if(replaceUser.getId() == pat.getUserList().get(i).getId()){
                pat.getUserList().get(i).setMoney(replaceUser.getMoney());
            }
        }
    }
    
    @Override
    public String toString() {
        return String.format(super.getUserName(), super.getAge(), super.getPassWord(), super.getMoney());
    }
    
}
