package collectionExample;
 class P {
		public static void main(String[]args){
		int a=1;
		int b=50;
		for(int i=a;i<=b;i++)
		{
		    int fc=0;
		    for(int j=1;j<=i;j++)
		    {
		        if(i%j==0)
		        {
		            fc++;
		        }
		    }  
		    if(fc==2)
		    {
		    	
		        System.out.print(i+" ");
		    } 
		}    
	} 

}
