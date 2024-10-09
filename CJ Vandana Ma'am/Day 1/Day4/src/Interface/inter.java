package Interface;


	interface myinter
	{
		public void display();
	}
	
	class Test implements myinter
	{
		void show()
		{
			System.out.println("Test");
		}
		
		public void display()
		{
			System.out.println("interface method");
		}
	}


