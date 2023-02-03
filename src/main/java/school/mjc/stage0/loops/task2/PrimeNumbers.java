package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter=0, n=0, i=1, j=1;
        while(i<printToInclusive)
        {
            j=1;
            counter=0;
            while(j<=i)
            {
                if(i%j==0)
                    counter++;
                j++;
            }
            if(counter==2)
            {
                System.out.println(i);
                n++;
            }
            i++;
        }
    }
}
