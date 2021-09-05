package wordMeanings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Read_Data_From_txt_File {

	static File file = new File("data\\dictionaryMeaning.txt");

	public static void main(String[] args) throws Throwable {
		doesFileExist();

		String path = "data\\dictionaryMeaning.txt";
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";

		while ((line = br.readLine()) != null && line.length() > 0) {
			String[] value1 = line.split("-");

			System.out.println(value1[0]);

			if (value1[1] != null && value1[1].contains(",")) {
				String[] value2 = value1[1].split(",");
				for (int i = 0; i < value1.length; i++) {
					System.out.println(value2[i].trim());
				}
			} else {
				System.out.println(line.indexOf(line));
			}

		}
	}

	public static void doesFileExist() {

		if (file.exists()) {
			System.out.println("File exists!");
		} else {
			System.out.println("File doesn't exist!");
		}
	}

}
