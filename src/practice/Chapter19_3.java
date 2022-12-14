package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter19_3 {
	public static void main(String[] args) {
		// try-with-resourcesを使用
		try(FileOutputStream fos = new FileOutputStream("/Applications/Eclipse_2021-12.app/Contents/workspace/test.txt")){
			fos.write(0x41); // 16進で41はAを表す

		}catch(FileNotFoundException s) {
			System.out.println("ファイルがありませんでした");
			s.printStackTrace();
		} catch(IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}
}
