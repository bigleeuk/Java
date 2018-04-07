
public class Ex10_d {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		SubstitutionCipher substiCiper= new SubstitutionCipher(4);
		System.out.println(substiCiper.encode("leewook"));

		ShuffleCipher test2 =new ShuffleCipher(3);
		System.out.println(test2.encode("nonono"));
	}

}


