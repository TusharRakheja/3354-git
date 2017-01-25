package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide some integers to add");
        }
    }

    private static int addArguments(String[] args) 
		int sum = 0;
        for (String arg : args) {
			sum += Integer.valueOf(arg)
		}
		return sum;
    }
}
