package cn.itcast.chapter;

import java.util.Scanner;

/**
 * @author 作者QQ E-mail:
 * @veersion 创建时间：2017年3月19日 下午11:10:25 类说明
 */
public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, m;
		Scanner s = new Scanner(System.in);
		System.out.print("键入一个整数： ");
		a = s.nextInt();
		System.out.print("再键入一个整数： ");
		b = s.nextInt();
		deff cd = new deff();
		m = cd.deff(a, b);
		int n = a * b / m;
		System.out.println("最大公约数: " + m);
		System.out.println("最小公倍数: " + n);
	}
}

class deff {
	public int deff(int x, int y) {
		int t;
		if (x < y) {
			t = x;
			x = y;
			y = t;
		}
		while (y != 0) {
			if (x == y)
				return x;
			else {
				int k = x % y;
				x = y;
				y = k;
			}
		}
		return x;
	}
}
