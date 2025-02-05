public class UncommonBugSolution {
    public static void main(String[] args) {
        boolean exceptionOccurred = false; // Flag to track exception
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            exceptionOccurred = true; // Set flag
            // Additional handling or logging here
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            exceptionOccurred = true; // Set flag
        } finally {
            System.out.println("Finally block executed."); //Ensuring this always prints
        }
        if (!exceptionOccurred) {
            System.out.println("This line is reached only if no exception occurs");
        }
    }
}