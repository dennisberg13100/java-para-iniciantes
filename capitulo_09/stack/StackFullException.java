public class StackFullException extends Exception {
    int size;

    StackFullException (int size) {this.size = size;}

    public String toString() {return "\nStack is full. Maximum size is " + size;}
}