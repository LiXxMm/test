package cn.itcast.chapter;

import java.util.Scanner;

/**
 * @author ����QQ E-mail:
 * @veersion ����ʱ�䣺2017��3��19�� ����11:10:25 ��˵��
 */
public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, m;
		Scanner s = new Scanner(System.in);
		System.out.print("����һ�������� ");
		a = s.nextInt();
		System.out.print("�ټ���һ�������� ");
		b = s.nextInt();
		deff cd = new deff();
		m = cd.deff(a, b);
		int n = a * b / m;
		System.out.println("���Լ��: " + m);
		System.out.println("��С������: " + n);
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
