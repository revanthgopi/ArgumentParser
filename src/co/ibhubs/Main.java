package co.ibhubs;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
//        runSolution(args);
        runDraft(args);
    }

    public static void runSolution(String[] args) {
        try {
            co.ibhubs.solution.Args arg = new co.ibhubs.solution.Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            System.out.println("Solution");
            System.out.println("l: "+Boolean.toString(logging));
            System.out.println("p: "+Integer.toString(port));
            System.out.println("d: "+directory);

        }  catch (co.ibhubs.solution.ArgsException e) {
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }

    public static void runDraft(String[] args) {
        try {
            co.ibhubs.draft.Args arg = new co.ibhubs.draft.Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            System.out.println("Draft");
            System.out.println("l: "+Boolean.toString(logging));
            System.out.println("p: "+Integer.toString(port));
            System.out.println("d: "+directory);

        }  catch (ParseException e) {
            System.out.printf("Argument error: %s\n", e.getMessage());
        }
    }
}
