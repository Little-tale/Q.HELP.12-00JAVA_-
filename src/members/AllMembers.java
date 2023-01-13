package members;
import members.MathMebers;
import members.EnglishMembers;
public class AllMembers extends AllMemberAdapter
{

	//수학인원 영어인원 리스트들을 새로운 배열에 합치고 출력
	public String[] allMembersList()
	{
		
		 // 안됨....
		mathMembers();
		englishMembers();
		int length = (mathMembers().length) + (englishMembers().length);
		String allMemberList[] = new String [length]; 
		System.arraycopy(mathMembers(),0,allMemberList,0,allMemberList.length);
		System.arraycopy(englishMembers(), 0, allMemberList, 0, allMemberList.length);
		return allMemberList;
	}
	@Override
	public String[] mathMembers() {
		
			
		return super.mathMembers();
	}

	@Override
	public String[] englishMembers() {
		
		return super.englishMembers();
	}
	
	

}
