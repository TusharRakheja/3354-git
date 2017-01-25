package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Please enter valid integers.");
        } catch (Exception e) {
			System.err.println("Some other error occurred.");			
		}
    }

    private static int addArguments(String[] args) {
		int sum = 0;
        for (String arg : args) {
			sum += Integer.valueOf(arg);
		}
		return sum;
    }
}
