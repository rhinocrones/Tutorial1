package Tut1;

public class Main {

	public static void main(String[] args) {
		String[] animals = {"�����","����"};// ������ ����� 1
		String[] food = {"��������","����"}; // ������ ����� 2

		//���������� ������ �� ��������� �������� � ���������� �����
		String result1 = animals[0].concat(" ��� ").concat(food[0]);
		String result2 = animals[1].concat(" ��� ").concat(food[1]);

		//������� �� �������
		System.out.println(result1);
		System.out.println(result2);
		
		String str = "������ �� ����, ���� 492 � ����������� �������� %*;�?";
		int length = str.length();
		System.out.println("����� ������ = " + length);
		
		String str1 = "��������� ������ � ���� ������ - �";
		int last = str1.length()-3;//����� ������ - 1, ��� ��� ������ ���������� � 0
		char ch = str1.charAt(last);
		System.out.println(ch);
		
		String str2 = "1 000 000 000";
		//��������������� ������ � ������
		char[] chArray = str2.toCharArray();
		//���������� ��� �������� �������
		for(int i = 0; i<chArray.length; i++){
		        //������� ������	
			if(chArray[i] == ' '){
		                //�������� �� �����
				chArray[i] = '.';
			
		        }	
		}
		//������� ���������
		System.out.println(chArray);
		
		
		String s = "www.mysite.com";
		String name = s.substring(4, s.length()-4);
		System.out.println(name); // �� ������� ������� "mysite"

		String domain = s.substring(4);
		System.out.println(domain); // �� ������� ������� "mysite.com"
		
		String isbn = "978-3-16-148410-0";
		String[] isbnParts = isbn.split("-");

		System.out.println("������� EAN.UCC: " + isbnParts[0]);
		System.out.println("����� ��������������� ������: " + isbnParts[1]);
		System.out.println("����� �����������: " + isbnParts[2]);
		System.out.println("����� �������: " + isbnParts[3]);
		System.out.println("����������� �����: " + isbnParts[4]);
		
		String s1 = "www.mysite.com";
		boolean isContain1 = s1.contains("mysite");
		System.out.println(isContain1);// ����� - ������� true

		boolean isContain2 = s1.contains("mysite.ru");
		System.out.println(isContain2);// �� ����� - ������� false
		System.out.println();
		System.out.println();
		
		String s2 = "www.mysite.com";

		//��������� ������������� �� ������ ��������� "com" 
		boolean isComEnding = s2.endsWith("com"); 
		System.out.println(isComEnding);//������� true 

		//��������� ������������� �� ������ ��������� "ru" 
		boolean isRuEnding = s2.contains("ru"); 
		System.out.println(isRuEnding);//������� false
		System.out.println();
		System.out.println();
		
		String s3 = "www.mysite.com";

		//���������, ���������� �� ����� � www
		boolean isWWW = s3.startsWith("www");
		System.out.println(isWWW);

		if(isWWW){
		/* E��� ��, ��������� ���������� �� ��� �����
		� "my". ��������� ����� ���������� � www
		�������� �������� � 4 �������*/
		boolean isNameStarts = s3.startsWith("my", 4);
		System.out.println(isNameStarts);
		}else{
		/* E��� ���, ��������� ���������� �� ��� �����
		� "my". ��������� ����� �� ���������� � www
		�������� ���������� � ������ ������*/
		boolean isNameStarts = s3.startsWith("my");
		System.out.println(isNameStarts);
		}
		
		String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
		//��������� ������ �� ��������� �������� �� ���������
		// ������������ ������� ����� ������
		String[]lines=data.split("\n");

		//�������� ������ ���������
		for (String line : lines){
		     //������� ������ ������� ��������� ������� ":" � ���������
		     int pos = line.indexOf(":");
		     //��������� ��� �������� �� ���������
		     String attributeName= line.substring(0,pos);
		     //��������� �������� ��������
		     String value = line.substring(pos+1,line.length());
		     //����� �� ����� ����������� �������� � ������ ��� �������.
		     System.out.println(attributeName + " - " + value);
		}
		
		
		String str4 = " � ����� ������ ��������� ";

		//������ ������� ������� � ������ � ����� ������
		str4 = str4.trim();

		//� ����� ������ ���������
		System.out.println(str4.toLowerCase());

		//� ����� ������ ���������
		System.out.println(str4.toUpperCase());
		
		
		String str5 = "1 000 000 000";
		String newStr = str5.replace(" ", ".");
		System.out.println(newStr);
		
		
		String name1 = "abcdefg";
		String name2 = "abcdegf";
		System.out.println(name1.compareTo(name2)); //-8 
		System.out.println(name2.compareTo(name1)); //8
		
		String testString = "������";
		int myChar = testString.codePointAt(3);
		System.out.println(myChar); // ���������� 1105
		
	}
}
