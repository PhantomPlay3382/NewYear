public class Main {
    private static User[] users = new User[4];

    public static void main(String[] args) {
        User u1 = new User(1, "Іван", "Петренко", 1500.50);
        User u2 = new User(2, "Марія", "Коваль", 2800.00);
        User u3 = new User(3, "Олег", "Сидорчук", 450.75);
        User u4 = new User(4, "Анна", "Микитенко", 10200.00);

        users = new User[]{u1, u2, u3, u4};
        showBalance(1);
        showBalance(5);

    }
    public static User isID(int searchId){
        boolean found = false;

        for (User i : users) {
            if (i.id == searchId) {
                return i;
            }
        }
        return null;
    }
    public static void showBalance(int id) {
        try {
            User user = isID(id);
            System.out.println("Користувач: " + user.firstName + " " + user.lastName);
            System.out.println("Сума на рахунку: " + user.balance + " грн.");
        } catch (NullPointerException e) {
            System.out.println("Такого користувача немає");
        }
    }
}
