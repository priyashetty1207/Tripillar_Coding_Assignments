package Module5;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}