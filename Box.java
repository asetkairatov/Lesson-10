public class Box {
    private int width;
    private int height;
    private int depth;
    private String color;
    private boolean isOpen;
    private String itemInside;

    // Конструктор
    public Box(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;
        this.itemInside = null;
    }

    // Метод для открытия коробки
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Коробка открыта.");
        } else {
            System.out.println("Коробка уже открыта.");
        }
    }

    // Метод для закрытия коробки
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Коробка закрыта.");
        } else {
            System.out.println("Коробка уже закрыта.");
        }
    }

    // Метод для перекрашивания коробки
    public void repaint(String newColor) {
        this.color = newColor;
        System.out.println("Коробка перекрашена в цвет: " + newColor);
    }

    // Метод для добавления предмета в коробку
    public void putItem(String item) {
        if (isOpen) {
            if (itemInside == null) {
                itemInside = item;
                System.out.println("Предмет \"" + item + "\" помещен в коробку.");
            } else {
                System.out.println("В коробке уже есть предмет.");
            }
        } else {
            System.out.println("Коробка закрыта. Нельзя положить предмет.");
        }
    }

    // Метод для удаления предмета из коробки
    public void removeItem() {
        if (isOpen) {
            if (itemInside != null) {
                System.out.println("Предмет \"" + itemInside + "\" удален из коробки.");
                itemInside = null;
            } else {
                System.out.println("В коробке нет предмета.");
            }
        } else {
            System.out.println("Коробка закрыта. Нельзя вынуть предмет.");
        }
    }

    // Метод для вывода информации о коробке
    public void printInfo() {
        System.out.println("Размеры коробки: " + width + "x" + height + "x" + depth);
        System.out.println("Цвет коробки: " + color);
        System.out.println("Коробка " + (isOpen ? "открыта" : "закрыта"));
        System.out.println("Предмет внутри: " + (itemInside == null ? "отсутствует" : itemInside));
    }

    public static void main(String[] args) {
        // Создаем коробку
        Box myBox = new Box(30, 20, 15, "красный");
        myBox.printInfo();

        // Открываем коробку и кладем предмет
        myBox.open();
        myBox.putItem("Слон");
        myBox.printInfo();

        // Закрываем коробку
        myBox.close();
        myBox.printInfo();

        // Перекрашиваем коробку и удаляем предмет
        myBox.open();
        myBox.removeItem();
        myBox.repaint("кровавый");
        myBox.printInfo();
    }
}

