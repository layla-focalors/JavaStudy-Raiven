package day02;

public class constructor {
    public static void main(String[] args){

    }
}
class Crayon{
    String color;
    String owner_name;
    int now_length;
    // A 생성자
    Crayon(String _color, int _now_length){
        color = _color;
        now_length = _now_length;
    }
    // B 생성자
    Crayon(String _color, int _now_length, String _owner_name){
        // this 키워드로 A 생성자 호출
        this(_color, _now_length);
        owner_name = _owner_name;
    }
}
