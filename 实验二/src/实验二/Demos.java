package ʵ���;

public class Demos {
	void IntegerConstant() {
		final byte NMAXVALUE_1 = 100;
		final short NMAXVALUE_2 = 200;
		final int NMAXVALUE_3;
		final long NMAXVALUE_4 = 400;
		NMAXVALUE_3 = 300;
		System.out.println("��������NMAXVALUE_1��ֵ" + NMAXVALUE_1);
		System.out.println("��������NMAXVALUE_2��ֵ" + NMAXVALUE_2);
		System.out.println("��������NMAXVALUE_3��ֵ" + NMAXVALUE_3);
		System.out.println("��������NMAXVALUE_4��ֵ" + NMAXVALUE_4);
	}
	
	void IntegerVariable() {
		int nCounter = 100;
		short nAnotherCount = 200;
		nCounter = nCounter + 1;
		System.out.println("nCounter:" + nCounter);
		System.out.println("nAnotherCounter:" + nAnotherCount);
	}

	void DoubleVariable() {
		double dRadius = 2.0d;
		float fRadius = 2.0f;
		double dArea = Math.PI * dRadius * dRadius;
		double fArea = (float)Math.PI * fRadius * fRadius;
		System.out.println("�뾶Ϊ2��Բ�������" + dArea);
		System.out.println("�뾶Ϊ2��Բ�������" + fArea);
	}
	
	void Compute() {
		int i, j, m, n;
		i = 8;
		j = 10;
		m = ++i;
		n = j++;
		System.out.println(m);
		System.out.println(n);
	}
	
	void Compute_a() {
		int a = 5;
		a+=a;
		System.out.println("a+=a�Ľ��Ϊ" + a);
		a = 5;
		a -= 2;
		System.out.println("a-=2�Ľ��Ϊ" + a);
		a = 5;
		a *= 2 + 3;
		System.out.println("a*=2+3�Ľ��Ϊ" + a);
		a = 5;
		a /= a + a;
		System.out.println("a/=a+a�Ľ��Ϊ" + a);
		a = 5;
		a %= (5 % 2);
		System.out.println("a%=(5%2)�Ľ��Ϊ" + a);
		a = 5;
		a += a -= a *= a;
		System.out.println("a+=a-=a*=a�Ľ��Ϊ" + a);
	}
	
	void Bitmove() {
		int a = -7;
		a = a << 3;
		System.out.println(a);
		a = a >> 3;
		System.out.println(a);
		a = a >>> 3;
		System.out.println(a);
	}
	
	void FloatCompute() {
		double x = 5.2, y = 7, z = 2.3;
		float Y = (float)(x+y)/2 + (int)x/(int)z;
		System.out.println(Y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demos a = new Demos();
		a.IntegerConstant();
		a.IntegerVariable();
		a.DoubleVariable();
		a.Compute();
		a.Compute_a();
		a.FloatCompute();
	}

}
