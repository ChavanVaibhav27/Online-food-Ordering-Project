package FoodApp;
import java.util.Scanner;


class Restaurant {
	
	public static void Login()
	{
		 System.out.println("=====##=============##=============##=====");
		 System.out.println("");
		 
		 System.out.println("=================$$$$..........Login............ $$$$$$===========");
		 System.out.println("");
		 System.out.println("=====##============##=================##==========");
		 System.out.println("");
		 System.out.println("");
		 System.out.println("_________...........Enter Username............__________");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("____**___**___**__**____");
		 String name=sc.nextLine();
		 String a;
			do {
			System.out.println("......ENTER USER PASSWORD......");
			Scanner sa = new Scanner(System.in);
			System.out.println("(...Enter The 8 DIGIT PASSWORD...)");
			System.out.println(" --**--**--**--**--  ");

			a = sa.nextLine();
			} while (a.length() != 8);
		 String b;
		 	do {
		 		System.out.println("......Enter your Mobile number.......");
		 		Scanner sb= new Scanner(System.in);
		 		System.out.println("....Enter Your 10 digit number....");
		 		System.out.println("       --**--**--**--**--**--");
		 		
				b = sb.nextLine();
				} while (b.length() != 10);
				
				System.out.println("");
				System.out.println("");
				System.out.println("=/*/=/*/=/*/=/*/=/*/=/*/=/*/=/*/=");
				System.out.println();
				System.out.println("... LOGIN SUCCESSFULL ..");
				System.out.println("");
				System.out.println("=/*/=/*/=/*/=/*/=/*/=/*/=/*/=/*/=");
	}
	
	public static void main(String[]args)
	{
		Login();
		SwaroopResort ref=new SwaroopResort();
		ref.hotel();
	}
	
	static {
		 System.out.println("============================================");
		 System.out.println("Welcome To My Restaurant");
		 System.out.println("============================================"); 
	}
	
}	
//SuperMost class
		class SwaroopResort{
			
			public void hotel()
			{
				SwaroopResort f1= new Food();
				Food F1=(Food)f1;
				
				SwaroopResort r1=new Room();
				Room R1=(Room)r1;
				
				System.out.println("press 1 for Food");
				System.out.println("press 2 for Room booking");
				System.out.println("press 3 for Go back");
				System.out.println("-------------------------------------------------------------");
				
				Scanner sh=new Scanner(System.in);
				int option =sh.nextInt();
				if (option==1) 
				{
					F1.Food();
				}
				else if(option==2)
				{
					R1.Room();
				}
				else if(option==3)
				{
					Go_Home();
				}
			}
			
			public void Payment_For_Room()
			 {
				 System.out.println("Enter 1 For Credit Card");
				 System.out.println("=======================================================");
				 System.out.println("Enter 2 For Net Banking");
				 System.out.println("=========================================================");
				 System.out.println("Enter 3 for cash");
				 System.out.println("========================================================");
				 
				 Scanner sc = new Scanner(System.in);
				 int a = sc.nextInt();
				 
				 switch(a)
				 {
				 case 1:
					 String cardno;
					 String pin;
					 String cvv;
					 do 
					 {
						 System.out.println("Enter Your Credit Card No");
						 Scanner ca=new Scanner(System.in);
						 cardno=ca.nextLine();
					 }
					 while
						 (cardno.length() !=16);
					 System.out.println("--------------------------------------------------");
					 break;
				 case 2:
					 do 
					 {
						 System.out.println("Enter Your Pin");
						 Scanner b=new Scanner(System.in);
						 pin=b.nextLine();
					 }
					 while
						 (pin.length( ) !=4);
					 System.out.println("----------------------------------------");
					 break;
				 case 3:					
					 do
					{
					System.out.println("Enter 3 digit cvv pin");
					Scanner c=new Scanner(System.in);
					 cvv=c.nextLine();
					}
					while
						(cvv.length() !=3);
					 System.out.println("-------------------------------------------");
					 break;
					 
				 case 4:
					System.out.println("Enter Your Account Number");
					 long Acc_no=sc.nextLong();	
					 System.out.println("Enter Your IFSC Code");
					 long IFSC_Code=sc.nextLong();	
					 System.out.println("----------------------------------------");
					 break;
					 
				 case 5:
					 System.out.println(" Thanks For Cash Payment");
					 long Cash_=sc.nextLong();	
					 System.out.println("---------------------------------------------------");
					 break;
				 }	 
			 }
			public void Go_Home()
			{
				System.out.println("---------------------");
				System.out.println("");
				System.out.println(".........Thank you  ..............");
				System.out.println("");
				System.out.println("--------------");
			}
			
			
			
				double Num;
				int Price;
				public void Room_Details(double Num,int Price)
				{
					this.Price=Price;
					this.Num=Num;
				
					print_RoomDetails();
				
					SwaroopResort ref=new SwaroopResort();
				
					System.out.println();
					System.out.println("Enter 1 For Confirm Room Booking");
					System.out.println("-------------------------------------------------");
					System.out.println("Enter 2 For Go Home");
					System.out.println("-------------------------------------------------");

					System.out.println();
				
					Scanner sc=new Scanner(System.in);
					int i=sc.nextInt();
				switch(i)
				{
				case 1:
					ref.Payment_For_Room();
					System.out.println("==========================================");
					System.out.println();
					System.out.println("-------------------------------------------------");

					System.out.println("!!====Booking Has Been Done====!! ");
					System.out.println();
					System.out.println("||------Thank You For Visiting US------||");
					System.out.println("-------------------------------------------------");

					System.out.println();
					System.out.println("===========================================");
					 
					break;
				case 2:
					ref.Go_Home();
					System.out.println("-------------------------------------------------");
					System.out.println("");
					System.out.println();
					
					System.out.println("Thank you for visiting");
					
					System.out.println();
					System.out.println("");
					System.out.println("-------------------------------------------------");

				}	
		}
				
	
				public void print_RoomDetails()
				{
					System.out.println("-------------------------------------------------");
					System.out.println("=====================================================");

					System.out.println("Room Price        : "+ Price);
					System.out.println("Food Num         :"+ Num);
					System.out.println("-------------------------------------------------");

					System.out.println("==========================================");
				}
						
				String Name;
				int price;
				public void Payment_For_Food()
				 {
					 System.out.println("Enter 1 For Credit Card");
					 System.out.println("------------------------------------------------");
					 System.out.println("Enter 2 For Net Banking");
					 System.out.println("--------------------------------------------------");
					 System.out.println("Enter 3 for cash");
					 System.out.println("-----------------------------------------------");
					 Scanner sc = new Scanner(System.in);
					 int a = sc.nextInt();
					 
					 switch(a)
					 {
					 case 1:
						 String cardno;
						 String pin;
						 String cvv;
						 String ifsc;
						 int Cash;
						 
						 do 
						 {
							 
							 System.out.println("Enter Your Credit Card No");
							 Scanner ca=new Scanner(System.in);
							 cardno=ca.nextLine();
						 }
						 while
							 (cardno.length() !=16);
						 System.out.println("----------------------------------------");
						 
					 case 2:
						 do
						 {
							 System.out.println("Enter Your Pin");
							 Scanner b=new Scanner(System.in);
							 pin=b.nextLine();
						 }
						 while(pin.length( ) !=4);
						System.out.println("----------------------------------------");
						
					 
						do {
							System.out.println("Enter 3 digit cvv pin");
							Scanner c=new Scanner(System.in);
							cvv=c.nextLine();
							}	
							while(cvv.length() !=3);
						System.out.println("-------------------------------");
						 	
					 
						 
						 	System.out.println("Enter Your Account Number");
						 	long Acc_no=sc.nextLong();	
					 
						 do {
						 	System.out.println("Enter Your IFSC Code");
						 	Scanner sz=new Scanner(System.in);
							ifsc=sz.nextLine();
						 }
						 while(ifsc.length()!=11);
						 	System.out.println();
						 	System.out.println("------------Thank You for Payment---------");
						 	System.out.println("--------------------------------------");
					 }
					
				 }	 
					 
				 
				
				public void Food_Details(String Name,int Price)
				{
					this.Name=Name;
					this.Price=Price;
				print_FoodDetails();
				SwaroopResort ref=new SwaroopResort();
				System.out.println();
				System.out.println("Enter 1 For Confirm Order");
				System.out.println("-------------------------------------------------");

				System.out.println("Enter 2 For Go Home");
				System.out.println("-------------------------------------------------");

				
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				switch(a)
				{
				case 1:
					ref.Payment_For_Food();
					System.out.println("==========================================");
					System.out.println("-------------------------------------------------");

					System.out.println();
					System.out.println("!!====Your Order Has Been Completed====!! ");
					System.out.println();
					System.out.println("||------Thank You For Visiting US------||");
					System.out.println();
					System.out.println("-------------------------------------------------");

					System.out.println("===========================================");
					break;
				case 2:
					ref.Go_Home();
					System.out.println("-------------------------------------------------");
					System.out.println();
					System.out.println("-------------------------------------------------");

				}	
				
			}
				public void print_FoodDetails()
				{
					System.out.println("-------------------------------------------------");
					System.out.println("===========================================");

					System.out.println("Food Name       : "+ Name);
					System.out.println("Food Price          :"+ Price);
					System.out.println("-------------------------------------------------");

					System.out.println("==========================================");
				}
				
		}
	
		
		class Food extends SwaroopResort
		{
			
			public void Food()
			{
				
				Food f1 = new Veg();
				Veg v = (Veg) f1;

				Food f2 = new NonVeg();
				NonVeg nv = (NonVeg)f2;

				Food f3 = new Dessert();
				Dessert d = (Dessert) f3;

				System.out.println("Enter 1 for Veg");
				System.out.println("-------------------------------------------------");

				System.out.println("enter 2 for NonVeg");
				System.out.println("-------------------------------------------------");

				System.out.println("Enter 3 for Dessert");
				System.out.println("-------------------------------------------------");

				System.out.println(" =====================================");
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				switch (n) 
				{
				case 1:
					v.Veg();
					break;

				case 2:
					nv.NonVeg();
					break;

				case 3:
					d.Dessert();
					break;
				default:
					Food();
				}
			}
		
			
		
		class Veg extends Food
		{
			public void Veg()
			{
				Veg v1=new Sandwich();
				Sandwich m1=(Sandwich)v1;
				
				Veg v2=new MisalPav();
				MisalPav m2=(MisalPav)v2;
				
				Veg v3=new VadaPav();
				VadaPav m3=(VadaPav)v3;
				
				Veg v4=new PavBhaji();
				PavBhaji m4=(PavBhaji)v4;
				
				System.out.println("-------------------------------------------------");
				System.out.println("==============================================");

				System.out.println("");
				
				System.out.println("Enter 1 for Sandwich");
				System.out.println("-------------------------------------------------");

				System.out.println("Enter 2 for MisalPav");
				System.out.println("-------------------------------------------------");

				System.out.println("Enter 3 for VadaPav");
				System.out.println("-------------------------------------------------");

				System.out.println("Enter 4 for Pav Bhaji");
				System.out.println("-------------------------------------------------");

				
				System.out.println("");
				System.out.println("-------------------------------------------------");

				System.out.println("=============================");
				
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				switch (n)
				{
				case 1:
					m1.Sandwich();;
					break;

				case 2:
					m2.MisalPav();
					break;

				case 3:
					m3.VadaPav();
					break;
				case 4:
					m4.PavBhaji();
				default:
					Food();
			}
			
		}
		class Sandwich extends Veg
		{
			public void Sandwich()
			{
				Food ref=new Food();
				ref.Food_Details("SANDWICH",150);
			}
		}
		class MisalPav extends Veg
		 {
			public void MisalPav()
			{
			Food ref=new Food();
			ref.Food_Details("MISAL PAV",200);
		    }
		 }
		class VadaPav extends Veg
		{
			public void VadaPav()
			{
			Food ref=new Food();
			ref.Food_Details("VADA PAV",100);
			}
		}
		class PavBhaji extends Veg
		{
			public void PavBhaji() {
				Food ref=new Food();
				ref.Food_Details("PAV BHAJI",250);
		
		}
	}
}
		class NonVeg extends Food
		{
				public void NonVeg()
				{
					NonVeg nv1=new  ChikenLolipop();
					 ChikenLolipop n1=( ChikenLolipop)nv1;
					
					NonVeg nv2=new ChikenChilli();
					 ChikenChilli n2=(ChikenChilli)nv2;
					
					NonVeg nv3=new MatanPav();
					MatanPav n3=(MatanPav)nv3;
					
					NonVeg nb4=new Biryani();
					Biryani n4=(Biryani)nb4;				
					
					NonVeg nc5=new TandooriChiken();
					TandooriChiken n5=(TandooriChiken)nc5;
					
					System.out.println("");
					System.out.println("-------------------------------------------------");
					System.out.println("========================================");

					System.out.println("Enter 1 for Chiken Lolipop");
					System.out.println("Enter 2 for Chiken Chilli");
					System.out.println("Enter 3 for Matan pav");
					System.out.println("Enter 4 for Biryani");
					System.out.println("Enter 5 for Tandoori Chiken");
		
					System.out.println("");
					System.out.println("-------------------------------------------------");

					System.out.println("=============================");
					
					Scanner sc = new Scanner(System.in);
					int n = sc.nextInt();
					switch (n)
					{
					case 1:
						n1.ChikenLolipop();;
						break;

					case 2:
						n2.ChikenChilli();
						break;

					case 3:
						n3.MatanPav();
						break;
					case 4:
						n4.Biryani();
						break;
					case 5:
						n5.TandooriChiken();
					default:
						NonVeg();
				}
			}
				class ChikenLolipop extends NonVeg
				{
					public void ChikenLolipop()
					{
						Food ref=new Food();
						ref.Food_Details("ChikenLolipop",200);
					}
				}
				class ChikenChilli extends NonVeg
				 {
					public void ChikenChilli()
					{
					Food ref=new Food();
					ref.Food_Details("ChikenChilli",200);
				    }
				 }
				class MatanPav extends NonVeg
				{
					public void MatanPav()
					{
					Food ref=new Food();
					ref.Food_Details("MATAN PAV",200);
					}
				
				}
				class Biryani extends NonVeg
				{
					public void Biryani()
					{
					Food ref=new Food();
					ref.Food_Details("Biryani",200);
					}
				
				}
				class TandooriChiken extends NonVeg
				{
					public void TandooriChiken()
					{
					Food ref=new Food();
					ref.Food_Details("Tandoori Chiken",200);
					}
				
				}
		}	
		class Dessert extends Food
		{
			public void Dessert()
			{
					Dessert dv=new VanilaIcecream();
					VanilaIcecream d1=(VanilaIcecream)dv;
					
					Dessert dcd=new Brownie();
					Brownie d2=(Brownie)dcd;
					
					Dessert dj=new Juice();
					Juice d3=(Juice)dj;
					
					Dessert dc=new Cake();
					Cake d4=(Cake)dc;
					
					System.out.println("");
					System.out.println("==========================================");
					System.out.println("-------------------------------------------------");

					System.out.println("Enter 1 for VanilaIce-Cream");
					System.out.println("-------------------------------------------------");

					System.out.println("Enter 2 for Brownie");
					System.out.println("-------------------------------------------------");

					System.out.println("Enter 3 for Juice ");
					System.out.println("-------------------------------------------------");

					System.out.println("Enter 4 for cake");
					System.out.println("-------------------------------------------------");

					System.out.println("");
					System.out.println("-------------------------------------------------");

					System.out.println("=============================");
					
					Scanner sc = new Scanner(System.in);
					int n = sc.nextInt();
					switch (n)
					{
					case 1:
						d1.VanilaIcecream();
						break;

					case 2:
						d2.Brownie();
						break;

					case 3:
						d3.Juice();
						break;
					case 4:
						d4.Cake();
						break;
					default:
						Dessert();
				}
		}
			class VanilaIcecream extends Dessert
			{
				public void VanilaIcecream()
				{
					Food ref=new Food();
					ref.Food_Details("VanilaIce-Cream",150);
				}
			}
			class Brownie extends Dessert
			 {
				public void Brownie()
				{
				Food ref=new Food();
				ref.Food_Details("Brownie",200);
			    }
			 }
			class Juice extends Dessert
			{
				public void Juice()
				{
				Food ref=new Food();
				ref.Food_Details("Juice",100);
				}
			}
			class Cake extends Dessert
			{
				public void Cake() {
					Food ref=new Food();
					ref.Food_Details("Cake",250);
			
			}
		}
	}

}



class Room extends SwaroopResort
{
	
	public void Room()
	{
		
		Room r1 = new OneBHK();
		OneBHK b1 = (OneBHK) r1;

		Room r2 = new TwoBHK();
		TwoBHK b2 = (TwoBHK)r2;

		System.out.println("-------------------------------------------------");
		System.out.println("===================================================");

		System.out.println("Enter 1 for One BHK");
		System.out.println("-------------------------------------------------");

		System.out.println("enter 2 for Two BHK");
		System.out.println("-------------------------------------------------");
		
		
		System.out.println("");
		System.out.println("-------------------------------------------------");

		System.out.println(" =====================================");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();

		switch (a) 
		{
		case 1:
			b1.OneBHK();
			break;
		case 2:
			b2.TwoBHK();
			break;
		
		default:
			System.out.println("Invalid Input");
			System.out.println("-------------------------------------------------");

			System.out.println();
			Room();	
		}
		switch(n)
		 {
		 case 1:
			 String cardno;
			 String pin;
			 String cvv;
			 do {
				 
				 System.out.println("Enter Your Credit Card No");
				 Scanner ca=new Scanner(System.in);
				 cardno=ca.nextLine();
			 }
			 while(cardno.length() !=12);
			 
			 do {
				 
				 System.out.println("Enter Your Pin");
				 Scanner k=new Scanner(System.in);
				 pin=k.nextLine();
			 	}
			 while(pin.length( ) !=4);
			
			do 
			{
			System.out.println("Enter 3 digit cvv pin");
			Scanner c=new Scanner(System.in);
			 cvv=c.nextLine();
			}
			while(cvv.length() !=3);
			 break;
			 
		 case 2:
			 System.out.println("Enter Your Account Number");
			 long Acc_no=sc.nextLong();	
			 System.out.println("Enter Your IFSC Code");
			 long IFSC_Code=sc.nextLong();			  
			 break;
			 
		 case 3:
			 System.out.println(" Thanks For Cash Payment");
			 long Cash_=sc.nextLong();			  
			 break;
			 
		 }
	}
	
	class OneBHK extends Room
	{
		public void OneBHK()
		{
			OneBHK o1=new A401();
			A401 a=(A401)o1;
			
			OneBHK o2=new A402();
			A402 b=(A402)o2;
			
			OneBHK o3=new A403();
			A403 c=(A403)o3;
			
			OneBHK o4=new A404();
			A404 d=(A404)o4;
			
			OneBHK o5=new A405();
			A405 e=(A405)o5;
			
			System.out.println("Enter 1 for A401");
			System.out.println("Enter 2 for A402");
			System.out.println("Enter 3 for A403");
			System.out.println("Enter 4 for A404");
			System.out.println("Enter 5 for A405");
			System.out.println(" =====================================");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) 
			{
			case 1:
				a.A401();
				break;

			case 2:
				b.A402();
				break;

			case 3:
				c.A403();
				break;
			case 4:
				d.A404();
				break;
			case 5:
				e.A405();
				break;
			default:
				OneBHK();
			}
		}
	
	class A401 extends OneBHK
	{
		public void A401()
		{
			Room ref=new Room();
			ref.Room_Details(4000,401);
		}
	}
	class A402 extends OneBHK
	{
		public void A402()
		{
			Room ref=new Room();
			ref.Room_Details(4000,402);
		}
	}
	class A403 extends OneBHK
	{
		public void A403()
		{
			Room ref=new Room();
			ref.Room_Details(4000,403);
		}
	}
	class A404 extends OneBHK
	{
		public void A404()
		{
			Room ref=new Room();
			ref.Room_Details(4000,404);
		}
	}
	class A405 extends OneBHK
	{
		public void A405()
		{
			Room ref=new Room();
			ref.Room_Details(4000,405);
		}
	}
	}
	class TwoBHK extends Room
	{
		public void TwoBHK()
		{
			TwoBHK t1=new B501();
			B501 l=(B501)t1;
			
			TwoBHK t2=new B502();
			B502 m=(B502)t2;
			
			TwoBHK t3=new B503();
			B503 n=(B503)t3;
			
			TwoBHK t4=new B504();
			B504 p=(B504)t4;
			
			TwoBHK t5=new B505();
			B505 q=(B505)t5;
			System.out.println("");
			System.out.println("-------------------------------------------------");
			System.out.println("================================================");

			
			System.out.println("Enter 1 for B501");
			System.out.println("-------------------------------------------------");

			System.out.println("enter 2 for B502");
			System.out.println("-------------------------------------------------");

			System.out.println("Enter 3 for B503");
			System.out.println("-------------------------------------------------");

			System.out.println("Enter 4 for B504");
			System.out.println("-------------------------------------------------");

			System.out.println("Enter 5 for B505");
			System.out.println("-------------------------------------------------");

			System.out.println("");
			System.out.println("-------------------------------------------------");

			System.out.println(" =====================================");
			Scanner sc = new Scanner(System.in);
			int k = sc.nextInt();
			switch (k) 
			{
			case 1:
				l.B501();
				break;

			case 2:
				m.B502();
				break;

			case 3:
				n.B503();
				break;
			case 4:
				p.B504();
				break;
			case 5:
				q.B505();
				break;
			default:
				TwoBHK();
			}
		}
	
		class B501 extends TwoBHK
		{
			public void B501()
			{
				Room ref=new Room();
				ref.Room_Details(4000,501);
			}
		}
		class B502 extends TwoBHK
		{
			public void B502()
			{
				Room ref=new Room();
				ref.Room_Details(4000,502);
			}
		}
		class B503 extends TwoBHK
		{
			public void B503()
			{
				Room ref=new Room();
				ref.Room_Details(4000,503);
			}
		}
		class B504 extends TwoBHK
		{
			public void B504()
			{
				Room ref=new Room();
				ref.Room_Details(4000,504);
			}
		}
		class B505 extends TwoBHK
		{
			public void B505()
			{
				Room ref=new Room();
				ref.Room_Details(4000,505);
			}
		}
	}
}
	
