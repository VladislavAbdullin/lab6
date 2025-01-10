public class A {
    String stringField;

    public A(String str) {
        this.stringField = str;
    }

    public int cacheTest() {
        System.out.println("original method");
        return 42;
    }

    public void setStringField(String newField) {
        this.stringField = newField;
    }

    public String getStringField() {
        return stringField;
    }
}