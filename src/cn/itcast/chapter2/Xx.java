package cn.itcast.chapter2;

/**
 * @author ����QQ E-mail:
 * @veersion ����ʱ�䣺2017��3��6�� ����3:39:10 ��˵��
 */
public class Xx {
	public static void main(String[] arge) {
		/*
		 * // Byte a = 0; // Short b = 0; // int c = 0; // long d = 0;
		 * 
		 * // char m = 'a'; // char n = 97; // System.out.println(m); //
		 * System.out.println(n); // int num = 298; // byte b = (byte) num; //
		 * System.out.println(b); byte a; byte b; byte c; a = 1; b = 2; c = a +
		 * b;
		 */
		int x = 5;
		if (x < 10) {
			x++;

		}
		System.out.println("x=" + x);
		int num = 19;
		if (num % 2 == 0) {
			// �ж�����������num��2����
			System.out.println("num��һ��ż��");

		} else {
			System.out.println("num��һ������");

		}
		int grade = 75;// ����ѧ���ĳɼ�
		if (grade > 80) {
			// ��������grade >80
			System.out.println("�óɼ��ĵȼ�Ϊ��");

		} else if (grade > 70) {
			// ����������grade >80������������grade >70

			System.out.println("�óɼ��ĵȼ�Ϊ��");

		} else if (grade > 60) {
			// ����������grade >70������������grade >60

			System.out.println("�óɼ��ĵȼ�Ϊ��");

		} else {
			// ����������grade >60
			System.out.println("�óɼ��ĵȼ�Ϊ��");

		}
	}
}
