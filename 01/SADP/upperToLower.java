import java.io.*;

class LowerCaseInputStream extends FilterInputStream {
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}
}

class upperToLower {
	public static void main(String arg[]) throws IOException {
		int c;

		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("a.txt")));

		while ((c = in.read()) >= 0) {
			System.out.print((char) c);
		}

		in.close();
	}
}