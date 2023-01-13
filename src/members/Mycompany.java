package members;

//import java.awt.Choice;
import java.util.Scanner;

public class Mycompany {

	public static void main(String[] args)
	{
		String[] List = new String[10]; 
		AllMembers AM = new AllMembers();
		MathMebers MM = new MathMebers();
		EnglishMembers EM = new EnglishMembers();
		boolean next = true;
		
		
		
		System.out.println
		("반갑습니다 김재형 학원입니다.\n"
				+ "저희는 수학반과 영어반이 있습니다.\n"
				+ "현재 수강생들은 이렇습니다.\n");
		
		System.out.println("계속 하시려면 엔터키 -> \n");
		while(next)
		{
			String scan;
			Scanner sc = new Scanner(System.in);
			scan = sc.nextLine();
			break;
		}
		
		// 모든 기본 학생 받고 출력
		MM.mathMembers();
		EM.englishMembers();
		//AM.allMembersList(); (파기)
		
		System.out.println("계속 하시려면 엔터키 -> \n");
		while(next)
		{
			String scan;
			Scanner sc = new Scanner(System.in);
			scan = sc.nextLine();
			break;
		}
		
		System.out.println("\n"
				+ "들어가시고 싶으신 반이 있으실까요? \n"
				+ "수학반이시면 1번을 영어반이시라면 2번을 눌러주세요");
		
		start : while(true)
		{
			String userName =null;
			int choice = 0,choice2=0;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			name : while(true)
			{
			System.out.println("아참! 이름을 안물어보았네요! ㅠㅠ 성함이....");
			userName = sc.nextLine(); // 엔터키 방지
			userName = sc.nextLine();
			System.out.println(userName + " 이 이름이 맞나요...? Y=1 F=0");
			choice2 = sc.nextInt();
			
			if(choice2 == 1)
			{
				System.out.println(userName+" 좋은 이름인데요!!!");
			}
			else
			{
				continue name;
			}
			
			break name;
			}
			
			if (choice == 1)
			{
				System.out.println("수학반... 맞으십니까? Y=1 F=0");
				choice = sc.nextInt();
				if(choice == 1)
				{
					System.out.println
					("축하합니다 수학반에 들어가는중입니다.!!!");
					MM.mathMemberAdd(userName);
				}
				else
				{
					System.out.println("흠 처음으로 돌아가야 겠어요"
							+ "영어라면 2번 눌르시 \n\n");
					continue start;
				}
			}
			else
			{
				System.out.println("영어반... 맞으십니까? Y=1 F=0");
				choice = sc.nextInt();
				if(choice == 1)
				{
					System.out.println
					("축하합니다 영어반에 들어가는중입니다.!!!");
					EM.englishMemberAdd(userName);
				}
				else
				{
					System.out.println("흠 처음으로 돌아가야 겠어요 "
							+ "수학이라면 1번 누르시요\n\n");
					continue start;
				}
			}
			
			break start;
		}
		
		System.out.println("학원 학생들을 소개합니다 !!!n");
		
		AM.allMembersList();
		
//		MM.mathMembers();
//		EM.englishMembers();
		
	}

}
