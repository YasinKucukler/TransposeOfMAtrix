public class Main {
	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3},
			{4,5,6}
		};
		int[][] transpose = new int[3][2];
		for (int i = 0; i< matrix.length; i++)
		{
			for (int k = 0; k< matrix[i].length; k++)
			{
				transpose[k][i] = matrix[i][k];
			}
		}
		
		for (int[] ints : transpose) {
			for (int anInt : ints) {
				System.out.print(anInt + " ");
			}
			System.out.println();
		}
	}
}