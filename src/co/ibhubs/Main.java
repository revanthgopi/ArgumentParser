package co.ibhubs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            System.out.println("l: "+Boolean.toString(logging));
            System.out.println("p: "+Integer.toString(port));
            System.out.println("d: "+directory);

        }  catch (ArgsException e) {
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }
}
