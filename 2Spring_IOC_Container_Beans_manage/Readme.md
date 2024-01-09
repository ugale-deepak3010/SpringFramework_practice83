


I created simple Spring project
Then added Car & Bike class
Then added Engine Interface and implemented Start() method in Car & Bike.

I created Key class and run simple method, I created first Tight couple for Car 
  	***	then Loose couple using Interface	**
  	
After that I want manage more easy way to change Loose coupling.
I will just change in XML so no code level change will happen.
So created Beans.xml file and added Beans->Bean element.  	
I used Id as Interface name "Engine" and class name is Car (only one support)

I used ClassPathXmlApplicationContext (beans.xml name ) and stored result in Application Context

then I pull bean using getBeans from context.



