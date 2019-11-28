package medicineapp;


abstract class Account { 
    public abstract void viewMedicines(Pharmacy a);
    public abstract User login(User e, Pharmacy a);
    public abstract void register(User e, Pharmacy a);
    public abstract User logout(User e);
    public abstract User changePassword(User e);
}
