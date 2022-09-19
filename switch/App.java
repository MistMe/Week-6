public class App {
    public static void main(String[] args) throws Exception {

        String today = "monday";

        switch (today) {
            case "Monday":
                System.out.println("Face to face classes on Mondays!");
                break;
            case "Tuesday":
                System.out.println("Online class on Tuesdays!");
                break;
            case "Wednesday":
                System.out.println("I practice to draw on Wednesdays!");
                break;
            case "Thursday":
                System.out.println("Playing games on thursday!");
                break;
            case "Friday":
                System.out.println("My favorite is fridays!");
                break;
            case "Saturday":
                System.out.println("I do my assignement in saturday!");
                break;
            case "Sunday":
                System.out.println(" I sleep in sundays!");
                break;
            default:
                System.out.println("There is no such day");
                break;
        }

    }
}
