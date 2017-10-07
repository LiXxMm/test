package cn.itcast.chapter2;

/**
 * @author 作者QQ E-mail:
 * @veersion 创建时间：2017年3月6日 下午3:39:10 类说明
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
			// 判断条件成立，num被2整除
			System.out.println("num是一个偶数");

		} else {
			System.out.println("num是一个奇数");

		}
		int grade = 75;// 定义学生的成绩
		if (grade > 80) {
			// 满足条件grade >80
			System.out.println("该成绩的等级为优");

		} else if (grade > 70) {
			// 不满足条件grade >80，但满足条件grade >70

			System.out.println("该成绩的等级为良");

		} else if (grade > 60) {
			// 不满足条件grade >70，但满足条件grade >60

			System.out.println("该成绩的等级为良");

		} else {
			// 不满足条件grade >60
			System.out.println("该成绩的等级为差");

		}
	}
}
