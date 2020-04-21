class StockItem
{
    private int sec;
    private int price;

    StockItem(int sec, int price)
    {
        this.sec = sec;
        this.price = price;
    }

    public void decreaseSec()
    {
        sec--;
    }

    public int getSec()
    {
        return sec;
    }

    public int getPrice()
    {
        return price;
    }
}

public class Stock 
{

    public static void main(String[] args)
     {
        int []prices = {1,2,3,2,3};
        for(int i: solution(prices))
        {
            System.out.print(i +"  ");
        }
    }

    //제출코드
    public static int[] solution(int []prices)
    {
        int []answer = new int[prices.length];
        int count =0;

        for(int i=0; i<prices.length-1;i++)
        {
            for(int j=i+1; j<prices.length; j++)
            {
                if(prices[i] <= prices[j])
                {
                    count++;
                } else if(prices[i]>prices[j]) {
                    count++;
                    break;
                }
            }
            answer[i] = count;
            count = 0;
        }
        return answer;

    }



    /*
    public static int[] solution(int []prices)
    {
        int []answer= new int[prices.length];
       
        Stack<StockItem> stack = new Stack<>();
        StockItem item = null;

        for(int i=0; i<prices.length; i++)
        {
            if(i < 1) {
                stack.add(new StockItem(i, prices[i]));
                //System.out.println("추가 : ");
                continue;
            } else if(stack.isEmpty()){
                break;
            } else if(stack.peek().getPrice() <= prices[i]){
                //System.out.println(i+ "넣고");
                stack.add(new StockItem(i, prices[i]));
                continue;
            } else if(stack.peek().getPrice()>prices[i]){
                //System.out.println(i+ "빼고넣고");
                item = stack.pop();
                item.decreaseSec();
                stack.add(item);
                stack.add(new StockItem(i, prices[i]));
            } 
        }
        
        int position = 0;
        while(!stack.isEmpty())
        {
            answer[position++] = stack.pop().getSec();
        }

        return answer;

    }*/
}