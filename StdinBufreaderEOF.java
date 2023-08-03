import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.StringTokenizer;

public class StdinBufreaderEOF {
	public static void main(String []args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String inp;
		StringTokenizer st;
		StringBuilder sb;
		final Object EOF = null;
		while ((inp = in.readLine()) != EOF) {
			st = new StringTokenizer(inp);
			sb = new StringBuilder();
			while (st.hasMoreTokens()) {
				sb.append(st.nextToken());
				if (st.hasMoreTokens()) {
					sb.append("-+-");
				}
			}
			out.println(sb.toString());
			out.flush();
		}
	}
}