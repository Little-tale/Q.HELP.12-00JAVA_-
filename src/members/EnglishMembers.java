package members;

public class EnglishMembers implements EnglishMemberList
{
	String[] englishMembers = 
		{"김재형","송중기","손흥민","XXX","XXX","XXX","XXX"};
	int count = 3;
	
	@Override
	public void englishMemberAdd(String Name)
	{
		String List[] = englishMembers;
		//Random rd = new Random();
		//int index = rd.nextInt();
		System.out.println(Name + "님 ---영어반--- 입장");
		for(int i =0; i<List.length; ++i)
		{
			System.out.println(List[i]);
			//System.out.println(List[i]);
			
			 try
	            {
	                Thread.sleep(500);
	            }
	            catch (InterruptedException e)
	            {
	                e.printStackTrace();
	            }
			
		}
		englishMembers[count] = Name;
		++count;
		System.out.println();
	}
		
	

	@Override
	public String[] englishMembers()
	{
		System.out.println("\n영어반 학생들 리스트");
		for(int i = 0;i<(englishMembers.length); ++i)
		{
		 System.out.println(englishMembers[i]);
		}
		return englishMembers;
	}
	
}
