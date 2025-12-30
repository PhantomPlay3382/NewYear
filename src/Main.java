public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "Іван", "Петренко", 1500.50);
        User u2 = new User(2, "Марія", "Коваль", 2800.00);
        User u3 = new User(3, "Олег", "Сидорчук", 450.75);
        User u4 = new User(4, "Анна", "Микитенко", 10200.00);

        User[] users = {u1, u2, u3, u4};

        showBalance(users, 2);
        showBalance(users, 5);
    }

    public static void showBalance(User[] users, int searchId) {
        boolean found = false;

        for (User i : users) {
            if (i.id == searchId) {
                System.out.println("Користувач: " + i.firstName + " " + i.lastName);
                System.out.println("Сума на рахунку: " + i.balance + " грн.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Користувача з ID " + searchId + " не знайдено.");
        }
    }
}