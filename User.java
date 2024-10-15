public class User {
    public String getEmail() {
        return email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private String lastName;
    private String firstName;
    private String middleName;
    private int birthYear;
    private String email;

    // Конструктор
    public User(String lastName, String firstName, String middleName, int birthYear, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }

    // Метод для вывода информации о пользователе
    public void printInfo() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
    }

    // Метод для проверки возраста (старше 40 лет)
    public boolean isOlderThan40(int currentYear) {
        return (currentYear - birthYear) > 40;
    }

    public static void main(String[] args) {
        int currentYear = 2024;

        // Создаем массив пользователей
        User[] users = new User[10];

        // Заполняем массив объектами
        users[0] = new User("Кукешев", "Кайрат", "Сисенбиевич", 1979, "kukesev79@mail.com");
        users[1] = new User("Кайратов", "Асет", "Кайратович",2003 , "kairatovaset2706@gmail.com");
        users[2] = new User("Кукешева", "Камшат", "Темирхановна", 1980, "kukesovs80@mail.com");
        users[3] = new User("Кукешев", "Есет", "Кайратович", 2013, "kukesev13@mail.com");
        users[4] = new User("Кукешев", "Римма", "Кайратовна", 2006, "kukesevo1006@mail.com");
        users[5] = new User("Кукешев", "Рита", "Кайратовна", 2006, "kukeseva0610@mail.com");
        users[6] = new User("Кукешев", "Амина", "Кайратовна", 2021, "kukeseva21@mail.com");
        users[7] = new User("Симбиотов", "Карнаж", "Веномич", 1945, "Deadguard@mail.com");
        users[8] = new User("Паркер", "Питер", "Паукович", 1964, "spiderman@mail.com");
        users[9] = new User("Городской", "Актобек", "Казахстанович", 1969, "white1869@mail.com");
        // Выводим информацию о пользователях старше 40 лет
        for (User user : users) {
            if (user != null && user.isOlderThan40(currentYear)) {
                user.printInfo();
                System.out.println();
            }
        }
    }
}
