public class SchoolResult {

    public static void main(String[] args) {
        double points = 5;
        String results = points >= 7 ? "Approved" : points >= 5 && points < 7 ? "After-school classes" : "Held back";
        System.out.println(results);
    }
}
