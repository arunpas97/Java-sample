class google
	{
		public void web()
		{
			System.out.println("SEARCH ENGINE");
		}

	}

class yahoo extends google
	{
		public void old()
		{
			System.out.println("ALSO AN SEARCH_ENGINE");
		}
	
	}
class sam
	{
		public static void main(String args[])
		{
			System.out.println("===ENGINE===");
			
			yahoo obj = new yahoo();
			obj.web();
			
			obj.old();

			
		}

	}