package Final_test;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner input =new Scanner(System.in);
		int[][] data2 = new int[4][3];
		System.out.println("�п�J12�Ӽ�:");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				data2[i][j]=input.nextInt();
			}
		}
		
		for(int i=0; i<4; i++) {
			int count=0;
			for(int j=0; j<3; j++) {
				count+=data2[i][j];
				
			}
			System.out.println("��" + i + "�C���`�M="+count);
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			int count=0;
			for(int j=0; j<4; j++) {
				count+=data2[j][i];
				
			}
			System.out.println("��" + i + "�檺�`�M="+count);
		}
	}

}