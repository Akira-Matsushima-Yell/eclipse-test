package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Chapter19_Ex2 {
	public static void main(String[] args)   {
		// ファイルを開き、loadメソッドでプロパティを読み込む
		try (FileReader fr = new FileReader("/Applications/Eclipse_2021-12.app/Contents/workspace/personal.properties")) {
			Properties p = new Properties();
			p.load(fr);

			// 各設定内容を出力
			System.out.println("名前:" + p.getProperty("name"));
			System.out.println("年齢:" + p.getProperty("age"));
			System.out.println("性別:" + p.getProperty("gender"));
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			// printStackTraceで例外を出力
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("エラーです");
			// printStackTraceで例外を出力
			e.printStackTrace();
		}
	}
}