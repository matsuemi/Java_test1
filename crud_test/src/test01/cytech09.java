package test01;

public class cytech09 {

	public static void main(String[] args) {
		int[][] scores = {{80, 75, 90, 85},{70, 88, 65, 78},{95, 92, 88, 90},{60, 72, 80, 68},{85, 90, 75, 82}};

	        String[] subjects = {"国語", "数学", "理科", "社会"};

	        for (int i = 0; i < scores.length; i++) {
	            System.out.println((i + 1) + "人目の学生");

	            for (int j = 0; j < scores[i].length; j++) {
	                System.out.println(subjects[j] + "：" + scores[i][j] + "点");
	            }
	            System.out.println();
	        }
	}
}
