package members;

import java.util.Random;

//import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

public class MathMebers implements MethMermberList
{
	//필드
	int count = 2; // 기본 필드 + 2명 기본깔고 +1한 인덱스값.
	public String[] methMemberList = new String[]
			{"김재형","김예찬","XXX","XXX","XXX","XXX"};
	
	
	// 멤버리스트 인터페이스 오버라이
	@Override
	// 문자열 주소값을 돌려받는 메소드 재정
	public String[] mathMembers()
	{
		//반복문을 통해 수학반 학생들 리스트 출력
		System.out.println("수학반 학생들 리스트");
		for(int i = 0;i<methMemberList.length; ++i)
		{
		 System.out.println(methMemberList[i]);
		}
		return methMemberList;
	}

	@Override
	// 문자열 [기본멤버+1] 에 추가하는 메소드 재정의
	public void mathMemberAdd(String Name)
	{
		String List[] = methMemberList;
		//Random rd = new Random();
		//int index = rd.nextInt();
		System.out.println(Name + "\n님 ---수학반--- 입장");
		methMemberList[count] = Name;
		for(int i =0; i<(List.length); ++i)
		{
			
			System.out.println(List[i]);
			//System.out.println(List[i]);
			// 추가됨. 천천히 출력해 박진감을 위한 메크로
			 try
	            {
	                Thread.sleep(500);
	            }
	            catch (InterruptedException e)
	            {
	                e.printStackTrace();
	            }
		}
		
		++count;
		System.out.println();
	}

}
