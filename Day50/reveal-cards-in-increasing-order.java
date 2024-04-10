class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int[] result=new int[n];
        Deque<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        for(int card:deck){
            int index=list.poll();
            result[index]=card;
            if(!list.isEmpty()){
                list.add(list.poll());

            }

        }
        return result;

    }
}