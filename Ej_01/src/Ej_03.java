
public class Ej_03 {
	static int inicial = 1;
	static void cuentaHasta(int n) {
		if (inicial <= n) {
			System.out.println(inicial);
			inicial++;
			cuentaHasta(n);
		}
	}
	static int mcd(int m, int n) {
		if (n <= m && m % n == 0)
			return n;
		else if (m < n)
			return mcd(n, m);
		else
			return mcd(n, m % n);
	}

	public static void main(String[] args) {
		System.out.println(mcd(8,12));
	}

}
