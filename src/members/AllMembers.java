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
		// 이부분에서 문제가 발생됨 . 
			//예상되는 문제점은 주소값을 통해 길이를 못받느냐 라고 볼수있다.
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
