public class Main {
    public static void main(String[] args) {
        Day day = Day.Friday;

        switch (day) {
            case Monday:
                System.out.println("Учеба в понедельник"); break;
            case Friday:
                System.out.println("Учеба в пятницу"); break;
            case Tuesday:
                System.out.println("Во вторник я не учусь"); break;
            case Wednesday:
                System.out.println("Учеба в среду"); break;
            case Thursday:
                System.out.println("В четверг я не учусь"); break;
            case Sunday:
                System.out.println("В субботу я не учусь"); break;
            case Saturday:
                System.out.println("В воскресенье я не учусь"); break;
        }
    }
}
