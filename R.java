//.find no of even and odd digits in a given number.
class R {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = i;
		int even = 0;
		int odd = 0;
		while (j != 0){
			int k = j % 10;
			if (k % 2 == 0)
			{
				even++;
			}
			else{
				odd++;
			}
			j = j / 10;
		}
		System.out.println("no.of even digits are: "+even);
		System.out.println("no.of odd digits are: "+odd);
	}
}
