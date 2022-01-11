package edu.java.array05;

public class ArrayMain05 {

	public static void main(String[] args) {
		//2차원 배열 연습
		String[][] groups = {
				{"RM","진","슈가","제이홉","지민","뷔","정국"},
				{"민영","유정","은지","유나"}
		};

		System.out.println(groups);
		System.out.println(groups[0]);
		System.out.println(groups.length);
		System.out.println(groups[0].length);
		System.out.println(groups[1].length);
	
	//for를 사용해서 groups의 내용 출력
		for (int i = 0; i < groups.length; i++) {
			for (int j = 0; j <groups[i].length; j++) {
				System.out.print(groups[i][j] + " ");
			}
			System.out.println();
		}
	
	//향상된 for를 사용해서 groups의 내용 출력
		for (String[] x : groups) {
			for (String y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
	

}
