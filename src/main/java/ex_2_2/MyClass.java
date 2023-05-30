package ex_2_2;

public class MyClass {
    private int field1;
    private String field2;
    private boolean field3;

    public MyClass(int field1) {
        this.field1 = field1;
    }

    public String setField2(String field2) {
        this.field2 = field2;
        return field2;
    }

    public void init(boolean field3) {
        this.field3 = field3;
    }

    public int getField1() {
        return field1;
    }


    public String getField2() {
        return field2;
    }

    public boolean isField3() {
        return field3;
    }
}