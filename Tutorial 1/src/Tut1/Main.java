package Tut1;

public class Main {

	public static void main(String[] args) {
		String[] animals = {"Хаски","Морж"};// массив строк 1
		String[] food = {"колбаски","корж"}; // массив строк 2

		//составляем строки из элементов массивов и связующего слова
		String result1 = animals[0].concat(" ест ").concat(food[0]);
		String result2 = animals[1].concat(" ест ").concat(food[1]);

		//выводим на консоль
		System.out.println(result1);
		System.out.println(result2);
		
		String str = "Строка из букв, цифр 492 и специальных символов %*;№?";
		int length = str.length();
		System.out.println("Длина строки = " + length);
		
		String str1 = "Последний символ в этой строке - о";
		int last = str1.length()-3;//длина строки - 1, так как отсчет начинается с 0
		char ch = str1.charAt(last);
		System.out.println(ch);
		
		String str2 = "1 000 000 000";
		//преобразовываем строку в массив
		char[] chArray = str2.toCharArray();
		//перебираем все элементы массива
		for(int i = 0; i<chArray.length; i++){
		        //находим пробел	
			if(chArray[i] == ' '){
		                //заменяем на точку
				chArray[i] = '.';
			
		        }	
		}
		//выводим результат
		System.out.println(chArray);
		
		
		String s = "www.mysite.com";
		String name = s.substring(4, s.length()-4);
		System.out.println(name); // на консоль выведет "mysite"

		String domain = s.substring(4);
		System.out.println(domain); // на консоль выведет "mysite.com"
		
		String isbn = "978-3-16-148410-0";
		String[] isbnParts = isbn.split("-");

		System.out.println("префикс EAN.UCC: " + isbnParts[0]);
		System.out.println("номер регистрационной группы: " + isbnParts[1]);
		System.out.println("номер регистранта: " + isbnParts[2]);
		System.out.println("номер издания: " + isbnParts[3]);
		System.out.println("контрольная цифра: " + isbnParts[4]);
		
		String s1 = "www.mysite.com";
		boolean isContain1 = s1.contains("mysite");
		System.out.println(isContain1);// нашел - выведет true

		boolean isContain2 = s1.contains("mysite.ru");
		System.out.println(isContain2);// не нашел - выведет false
		System.out.println();
		System.out.println();
		
		String s2 = "www.mysite.com";

		//проверяем заканчивается ли строка суффиксом "com" 
		boolean isComEnding = s2.endsWith("com"); 
		System.out.println(isComEnding);//выведет true 

		//проверяем заканчивается ли строка суффиксом "ru" 
		boolean isRuEnding = s2.contains("ru"); 
		System.out.println(isRuEnding);//выведет false
		System.out.println();
		System.out.println();
		
		String s3 = "www.mysite.com";

		//Проверяем, начинается ли адрес с www
		boolean isWWW = s3.startsWith("www");
		System.out.println(isWWW);

		if(isWWW){
		/* Eсли да, проверяем начинается ли имя сайта
		с "my". Поскольку адрес начинается с www
		проверку начинаем с 4 символа*/
		boolean isNameStarts = s3.startsWith("my", 4);
		System.out.println(isNameStarts);
		}else{
		/* Eсли нет, проверяем начинается ли имя сайта
		с "my". Поскольку адрес не начинается с www
		проверку производим с начала строки*/
		boolean isNameStarts = s3.startsWith("my");
		System.out.println(isNameStarts);
		}
		
		String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
		//разбиваем строку на несколько подстрок на основании
		// встречаемого символа новой строки
		String[]lines=data.split("\n");

		//проходим каждую подстроку
		for (String line : lines){
		     //находим индекс первого вхождения символа ":" в подстроке
		     int pos = line.indexOf(":");
		     //вычленяем имя атрибута из подстроки
		     String attributeName= line.substring(0,pos);
		     //вычленяем значение атрибута
		     String value = line.substring(pos+1,line.length());
		     //вывод на экран вычлененных значений в нужном нам формате.
		     System.out.println(attributeName + " - " + value);
		}
		
		
		String str4 = " Я помню ЧУДНОЕ мгновенье ";

		//убрали символы пробела в начале и конце строки
		str4 = str4.trim();

		//я помню чудное мгновенье
		System.out.println(str4.toLowerCase());

		//Я ПОМНЮ ЧУДНОЕ МГНОВЕНЬЕ
		System.out.println(str4.toUpperCase());
		
		
		String str5 = "1 000 000 000";
		String newStr = str5.replace(" ", ".");
		System.out.println(newStr);
		
		
		String name1 = "abcdefg";
		String name2 = "abcdegf";
		System.out.println(name1.compareTo(name2)); //-8 
		System.out.println(name2.compareTo(name1)); //8
		
		String testString = "Котёнок";
		int myChar = testString.codePointAt(3);
		System.out.println(myChar); // возвращает 1105
		
	}
}
