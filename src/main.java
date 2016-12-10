import java.util.Arrays;
import java.util.Scanner;

public class main {
	/**
	 * ������������ ������ �� ���� �� ������ ����� �� 2 �� 9, ����� �����
	 * ������������ ������ ������ �� ��������� �������� ����� (�������).
	 * ���������� ������ �� ���� �� ��������� ����� � ����� �� ������������
	 * ��������, � ����� ���� �� �� ������� ����������� �������� ����� � ��
	 * ������� ��������� ����� � ���� �������. ������������ ������ �� ���� ��
	 * ������ ������� ���������, �� �� ������� ���������� �����. ���� ����
	 * ����������� ����� � ��������, ��� ������ �� ���� �������, �� �� ��
	 * ������� ������ ���� �� �������� �������� ���������. ������ �� �� ������
	 * �� ������. � ��������� ����� ������ �� �� �������� ����������� ��
	 * ����������. ����������� �� ��������� ����� ������ �� ����� ����������
	 * (������ �� ������).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert the size of matrix");
		int size = sc.nextInt();
		while (size < 2 || size > 10) {
			System.out.print("Insert the number beetween 2- 9");
			size = sc.nextInt();
		}
		int sum = 0;
		int[][] twoDimArray = new int[size][size];
		int[] array = new int[size * size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		System.out.println("Sum is " + sum);
		for (int i = 0; i < twoDimArray.length; i++) {

			for (int j = 0; j < size; j++) {
				twoDimArray[i][j] = array[(j * size) + i];
			}
		}

		for (int r = 0; r < twoDimArray.length; r++) {
			for (int c = 0; c < twoDimArray[r].length; c++)
				System.out.print(twoDimArray[r][c] + " ");
			System.out.println();
		}
	}
}