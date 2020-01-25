package ca.cmpt213.as2;

import com.google.gson.Gson;

import java.io.File;

import static java.lang.System.exit;

public class PeerFeedbackProcessor {
    public static void main(String args[]) {
        if(args.length != 2){
            System.out.println("Expected Arguments: 2. Exiting...");
            exit(0);
        }
        // writes all files of the current directory
        String[] pathnames;
        File file = new File("F:\\CMPT213\\CMPT213_Assignment_2\\input");
        pathnames = file.list();


        Gson gson = new Gson();
    }
}
