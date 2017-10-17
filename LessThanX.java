package implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LessThanX  {

	public static void main(String[] args) throws IOException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = keyboard.readLine().split(" ");
		
		//배열의 길이
		int N = Integer.parseInt(str[0]);
		//작아야 하는 기준
		int X = Integer.parseInt(str[1]);
		
		String[] str2 = keyboard.readLine().split(" ");
		//작으면 바로 출력
		for(int i=0; i<N; i++) {
			int k = Integer.parseInt(str2[i]);
			if(X > k) {
				print.write(k + " ");
			}
			
		}
		print.flush();
		keyboard.close();
		print.close();
		
		
	}

}
