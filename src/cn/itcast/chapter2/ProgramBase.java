package cn.itcast.chapter2;

/**
 * @author ����QQ E-mail:
 * @veersion ����ʱ�䣺2017��2��28�� ����10:51:44 ��˵��
 */
public class ProgramBase {
	public static void main(String[] arge) {
		// float
		float fTmp1 = 3.14f;
		float fTmp2 = 2e3f;
		float fTmp3 = 5.022e+23f;
		// int

		int iTmp1 = 0b01010101;// bin
		int iTmp2 = 0342;// OCT
		int iTmp3 = 0xff;// HEX
		int iTmp4 = 0xFF;// HEX
		int iTmp5 = 1980;// DEC
		// �ַ�
		char cTmp = 'A';
		// �ַ���
		String stremp = "hello jave";
		// boolean
		boolean bBtn1 = false;
		boolean bBtn2 = true;
		// null
		String strTmp2 = null;
		System.out.println();
		int x = 0;
		int y;
		y = x + 3;
		add(x, y);
		System.out.print(x);
		// System.out.print(y);

	}

	private static void add(int x, int y) {
		x = x + 1;
		y = y + 1;
		System.out.print(x);

		System.out.print(y);
		System.out.print("----------");

	}

}
