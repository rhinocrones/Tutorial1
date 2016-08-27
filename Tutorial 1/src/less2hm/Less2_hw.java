package less2hm;

public class Less2_hw {

	public static void main(String[] args) {
		ifelse1();
		ifelse2();
		ifelse3();
		loops1();
		loops2a();
		loops2b();
		loops3();
		loops4();
		loops5();
		loops6();
		loops7();
		loops8();
		loops9();
		loops10();
		loops11a();
		loops11b();
		loops12();
	}
	
	public static void ifelse1() {
		System.out.println("________________________________");
		System.out.println("Домашнє завдання №1");
		System.out.println("________________________________");
		int n = 9;
		if ((n%2)==0){
			System.out.println(n+"- число є парним");
		} else {
			System.out.println(n+"- число є непарним");
		}

		System.out.println("////////////////////////////////////");
	}
		
	public static void ifelse2() {
		System.out.println("________________________________");
		System.out.println("Домашнє завдання №2");
		System.out.println("________________________________");
        double c = 10;
		double n = 19;
        double m = -8;
        //Реально взнаеємо наскільки вони віддалені!!! 
        double a = Math.abs(n - c);
        double b = Math.abs(m - c);
        //Є два випадки коли вони рівновіддалені коли по відстані взнані рівні або коли з самого початку n i m рівні
        if ((n == m) | (a == b)){
            System.out.println("Числа n i m рівновіддалені від 10");
        } else if (a > b) {
        	System.out.println("Число m= "+m+" ближче до 10");
        } else {
        	System.out.println("Число n= "+n+" ближче до 10");
        } 
		System.out.println("////////////////////////////////////");
	}
		
	public static void ifelse3() {
		System.out.println("________________________________");
		System.out.println("Домашнє завдання №3");
		System.out.println("________________________________");
		double a = 10;
		double b = 100;
		double c = 10;
		double x1;
		double x2;
		double sqrt;
		double D = ((b * b) - (4 * a * c));
		System.out.println("D= " + D);
		if (D < 0) {
			System.out.println("Кінець");
		} else if (D > 0) {
				sqrt = Math.sqrt(D);
				System.out.println("Корінь з D= " + sqrt);
				x1 = ((-b) + sqrt) / (2 * a);
				x2 = ((-b) - sqrt) / (2 * a);
				System.out.println("x1= " + x1);
				System.out.println("x2= " + x2);
			} else {
				x1 = x2 = -(b / (2 * a));
				System.out.println("x1=x2= " + x1);
			}
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops1() {
		System.out.println("________________________________");
		System.out.println("Loops №1");
		System.out.println("________________________________");
		for (int i = 1000; i <= 1015;) {
			System.out.println("i= "+i);
			i+=3;
		}
		
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops2a() {
		System.out.println("________________________________");
		System.out.println("Loops №2a");
		System.out.println("________________________________");
		int i = 1;
		for (int k = 1; k <= 55; k++) {
			System.out.println("i"+k+"="+i);
			i+= 2;
		}
		
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops2b() {
		System.out.println("________________________________");
		System.out.println("Loops №2b");
		System.out.println("________________________________");
		int i = 1;
		int k = 1;
		while (k <= 55) {
			System.out.println("i"+k+"="+i);
			k+= 1;
			i+= 2;
		}
		
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops3() {
		System.out.println("________________________________");
		System.out.println("Loops №3");
		System.out.println("________________________________");
		int i = 90;
		do {
			System.out.println("i= "+i);
			i-= 5;
		} while (i > 0);
		
		System.out.println("////////////////////////////////////");
	}
		
	public static void loops4() {
		System.out.println("________________________________");
		System.out.println("Loops №4");
		System.out.println("________________________________");
		int  i = 2;
		for (int k = 1; k <= 20; k++) {
			System.out.println("i"+k+"="+i);
			i*= 2;
		}
		
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops5() {
		System.out.println("________________________________");
		System.out.println("Loops №5");
		System.out.println("________________________________");
		for (int a = 2; a < 10000; a = (2 * a) - 1) {
			System.out.println("a= "+a);
		}
		
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops6() {
		System.out.println("________________________________");
		System.out.println("Loops №6");
		System.out.println("________________________________");
		for (int a = -166; a < 100; a = (2 * a) + 200) {
			if (a > -100)
				
			System.out.println("a= "+a);
		}
		
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops7() {
		System.out.println("________________________________");
		System.out.println("Loops №7");
		System.out.println("________________________________");
		long b = 1;
        for(long a = 10; a > 0; a--){
            b=b * a;
            System.out.println(b);
        }
        System.out.println("Факторіал числа 10 = "+b);
		
        
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops8() {
		System.out.println("________________________________");
		System.out.println("Loops №8");
		System.out.println("________________________________");
		int a = 49;
        for(int i = 49; i > 0; i--){
            int b = a % i;
            if (b == 0)
          System.out.println("Позитивний дільник числа 49 це: "+i);
        }

		System.out.println("////////////////////////////////////");
	}
	
	public static void loops9() {
		System.out.println("________________________________");
		System.out.println("Loops №9");
		System.out.println("________________________________");
		int a = 578;
        for (int i = (int)Math.sqrt(a); i >= 1; i--){
        	System.out.println(a+" поділити на "+i);
            if( a % i == 0 & i != 1){
                System.out.println("Число "+a+" складене!");
                break;
                }
            else if ( i == 1) System.out.println("Число "+a+" просте!");
        }
        //Умова коли складене!! Якщо 578 ділиться на корінь з 578(заокруглене ціле число) - 1 і не дорівнює 1  то воно складене!
		System.out.println("////////////////////////////////////");
	}
	
	public static void loops10() {
		System.out.println("________________________________");
		System.out.println("Loops №10");
		System.out.println("________________________________");
        int a1 = 3, a2 = 2;
        System.out.print(a1+" "+a2+" ");
        for (int i = 3; i <= 12; i++){
            if ( (i % 2) != 0) {
                a1 = (2 * a1) - 2;
                System.out.print(a1+" ");
            }
            else{
                a2 = (2 * a2) - 2;
                System.out.print(a2+" ");
            }
            // Другу половину взагалі не зрозумів!    
        }
	}
	
	public static void loops11a() {
		System.out.println(" ");
		System.out.println("////////////////////////////////////");
		System.out.println("________________________________");
		System.out.println("Loops №11a");
		System.out.println("________________________________");
		int a = 1;
		int b = 1;
		int c;
		System.out.println("n1 = "+a);
		System.out.println("n2 = "+b);
		for (byte i = 3; i <= 11; i++) {
			c = a + b;
			System.out.println("n"+i+" = "+c);
			if (i >= 11) {
				break;
			}
			a = c;
			System.out.println("Нове a = "+a);
			b = c - b;
			System.out.println("Нове b = "+b);
		}		

		System.out.println("////////////////////////////////////");
	}
	
	public static void loops11b() {
		System.out.println(" ");
		System.out.println("________________________________");
		System.out.println("Loops №11b");
		System.out.println("________________________________");
        int a = 1, b = 1, c;
		System.out.println("n1 = "+a);
		System.out.println("n2 = "+b);
        for(int i = 3; i <= 11; i++){
            c = a + b;
            a = b;
            System.out.println("Нове a = "+a);
            b = c;
            System.out.println("Нове b = "+b);
            System.out.println("n"+i+" = "+c);
        }

		System.out.println("////////////////////////////////////");
	}
	
	public static void loops12() {
		System.out.println(" ");
		System.out.println("________________________________");
		System.out.println("Loops №12");
		System.out.println("________________________________");
		int k = 12345; int x = k;
        int s = 0;
        while (x != 0 ){
            s = s + (x % 10);
            System.out.println(s);
            x = x / 10;
            System.out.println(x);
        }
        System.out.println("Сума цифр в числі " + k + " = " + s);

		System.out.println("////////////////////////////////////");
	}
}

