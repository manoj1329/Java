class Prime 
{ 
static boolean isPrime(int n) 
{  
if (n <= 1) 
	return false; 
for (int i = 2; i < n; i++) 
	if (n % i == 0) 
		return false; 

return true; 
} 
static void printPrime(int n) 
{ 
	int sum=0;
for (int i = 2; i <= n; i++) 
{ 
	if (isPrime(i)) {
		sum=sum+i;
	}	 
}
System.out.println(sum);
} 
public static void main(String[] args) 
{ 
	int n = 7; 
	printPrime(n); 
} 
} 
