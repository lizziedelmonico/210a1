package a1;

import java.io.*;
import java.util.Scanner;

/** Class containing a file reading demo */
public class ReadFile {
  /** The main method reads from a file and prints the contents. */
  public static void main(String[] args) {
    String filename = (args.length > 0) ? args[0]: "YUMA_2023.txt";
    Scanner file = null;
    try {
      file = new Scanner(new File(filename));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    int count=0;
    while (file.hasNextLine()) {
      String line = file.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    count++;
    }

    file.close();
    String filename2 = (args.length > 0) ? args[0]: "YUMA_2023.txt";
    Scanner file2 = null;
    try {
      file = new Scanner(new File(filename));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }

    float[] temp = new float[count];
    String[] days = new String[count];
    int i = 0;
    while (file.hasNextLine()){
      String line = file.nextLine();
      String[] fields = line.split("\\s");
      String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      temp[i] = temperature;
      days[i] = date;

      i++;

    }
    arrayMethods test = new arrayMethods();
    System.out.println("Annual mean temperature: " + test.mean(temp)+ "degrees Celsius");
    System.out.println("Minimum average daily temperature: " + test.min(temp, 0, count-1) + "degrees Celsius");
    System.out.println("Maximum average daily temperature: " + test.max(temp, 0, count-1) + "degrees Celsius");
    }

  }

