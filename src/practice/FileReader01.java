package practice;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
	public static void main(String[] args) {

		// try-with-resourcesを使用
		try (FileReader fr = new FileReader("/Applications/Eclipse_2021-12.app/Contents/workspace/test.txt")) {
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}
}
