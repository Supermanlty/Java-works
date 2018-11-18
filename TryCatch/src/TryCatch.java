import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		int result[]={0,1,2};
		int operand1=0;
		int operand2=0;
		Scanner in = new Scanner(System.in);
		try{		
			System.out.print("���������:");
			operand1 = in.nextInt(); 
			System.out.print("�����뱻����:");
			operand2 = in.nextInt(); 		
			result[2]=operand2/operand1;
			System.out.println("��������"+result[3]);
		} catch (InputMismatchException ie) {
			System.out.println("�쳣:���벻Ϊ����!");
		} catch (ArithmeticException ae) {
			System.out.println("�쳣:��������Ϊ��!");
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("�쳣:��������Խ��!");
		}catch (Exception e) {
			System.out.println("�����쳣:"+e.getMessage());
		}
	}

	}

