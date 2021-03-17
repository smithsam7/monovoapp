package academy.learnprogramming.monovo.model;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class FormModel {
    static final int READ_BLOCK_SIZE = 100;
    static final String INTERNAL_DATA_FILE = "formdatafile.txt";

    public void saveFormInfo(String data) {
        // add-write text into file
        try {
//            FileOutputStream fileout= FileOutputStream openFileOutput(INTERNAL_DATA_FILE, MODE_PRIVATE);
//            OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
//            outputWriter.write(data);
//            outputWriter.close();

            //response with success

        } catch (Exception e) {
            // respond with failure message
            e.printStackTrace();
        }
    }

    public void retrieveFormInfo() {
        //reading text from file
        try {
//            FileInputStream fileIn = FileInputStream openFileInput(INTERNAL_DATA_FILE);
//            InputStreamReader InputRead = new InputStreamReader(fileIn);
//
//            char[] inputBuffer= new char[READ_BLOCK_SIZE];
//            String s = "";
//            int charRead;
//
//            while ((charRead=InputRead.read(inputBuffer))>0) {
//                // char to string conversion
//                String readstring = String.copyValueOf(inputBuffer,0,charRead);
//                s +=readstring;
//            }
//            InputRead.close();
            // Set form data from saved file

        } catch (Exception e) {
            // respond with failure message
            e.printStackTrace();
        }
    }
}
