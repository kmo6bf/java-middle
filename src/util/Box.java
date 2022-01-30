package util;

// Box 는 가상클래스 E를 사용한다.
// E는 실제로 존재하지 않는 가상 클래스이다.
public class Box<E> {
    private E obj;

    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }
}
