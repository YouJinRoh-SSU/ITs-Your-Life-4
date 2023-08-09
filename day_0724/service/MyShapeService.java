package day_0724.service;
import day_0724.MyLine;
import day_0724.MyShape;

/**MyShape 파생객체를 저장
 * 
 */
public class MyShapeService {
    private MyShape[] lines = new MyShape[100];
    private int count = 0;//저장될 위치, 저장갯수
    
//    public void add(MyLine ml) {
//        lines[count++] = ml;
//    }
//    public void add(MyCircle ml) {
//        lines[count++] = ml;
//    }
    public void add(MyShape ml) {
        lines[count++] = ml;
    }
    
    public int getCount() {
        return count;
    }

    public MyShape findByPosition(int startX, int startY) {
        //0~count까지만(실제저장 마지막위치)
        for (int i = 0; i < count; i++) {
            MyShape myShape = lines[i];
            if(myShape.getX() == startX && myShape.getY()==startY) {
                return myShape;
            }
        }
        return null;//못찾으면 null반환
    }

    public boolean remove(MyShape findShape) {
        for (int i = 0; i < count; i++) {
            MyShape myShape = lines[i];
            if(myShape.equals(findShape)) {
                remove(i);
                return true;
            }
        }
        return false;
    }
    /** i번째 객체 삭제 */
    private void remove(int i) {
        //  j -> i ~ <n
        for (int j = i; j < count; j++) {
            lines[i] = lines[i+1];
        }//end for
        count--;
    }

    public void printAll() {
        System.out.println("** 전체 출력 **");
        for (int i = 0; i < count; i++) {
            MyShape myShape = lines[i];
            System.out.println(myShape);
        }//end for
    }
}
