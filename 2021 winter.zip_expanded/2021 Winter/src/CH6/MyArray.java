package CH6;

public class MyArray {
    
    private int[] arr = new int[5];

    public void put(int idx,int value) {
        if(idx>=0 && idx <arr.length) {
            arr[idx] = value;
        } else {
            System.out.println(idx + "는 범위 밖ㅇ입니다");
        }

    }

    public int get(int idx) {
        return arr[idx];
    }
}
