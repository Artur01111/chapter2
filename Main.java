public class Main {
    public static void main(String[] args) {
        // Создаем объекты классов с помощью метода createObject
        Printable obj2 = createObject("Class2");
        Printable obj3 = createObject("Class3");
        Printable obj4 = createObject("Class4");

        // Создаем массив объектов
        Printable[] objects = {obj2, obj3, obj4};

        // Вызываем метод print() для каждого объекта
        for (Printable obj : objects) {
            obj.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Class2":
                return new Class2("Object2", 10);
            case "Class3":
                return new Class3("Object3", "Description3");
            case "Class4":
                return new Class4("Object4", 20.5);
            default:
                return null;
        }
    }
}
