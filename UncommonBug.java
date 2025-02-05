public class UncommonBug {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            // Additional handling or logging here
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed."); //Ensuring this always prints
        }
        // Dead code or logic error after exception handling
        System.out.println("This line might not be reached if an exception occurs");
    }
}