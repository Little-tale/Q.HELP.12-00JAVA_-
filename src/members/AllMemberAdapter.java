package members;

public abstract class AllMemberAdapter implements EnglishMemberList,MethMermberList
{
	//모든 멤버를불러들이기 위한 인터페이스
	
	@Override
	public String[] mathMembers() {
		return null;
	}

	@Override
	public String[] englishMembers() {
		return null;
	}

	@Override
	public void mathMemberAdd(String memberName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void englishMemberAdd(String memberName) {
		// TODO Auto-generated method stub
		
	}
	
}
