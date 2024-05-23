class Solution {
    public int solution(int price) {
        if(100000 <= price && price < 300000){
            return (int)(price - (price * 0.05));
        }
        if(300000 <= price && price < 500000){
            return (int)(price - (price * 0.1));
        }
        if(500000 <= price){
            return (int)(price - (price * 0.2));
        }
        return price;
    }
}