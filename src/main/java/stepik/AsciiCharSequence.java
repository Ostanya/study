package stepik;
import  java.lang.CharSequence;

public class AsciiCharSequence implements CharSequence {
    public byte[] arr;

    public AsciiCharSequence(byte[] arr) {
        this.arr = arr;
    }

    @Override
    public int length() {
        return this.arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char)this.arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] n = new byte[end - start];
        if (end - start >= 0) System.arraycopy(arr, 0 + start, n, 0, end - start);
        return new AsciiCharSequence(n);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte b : arr) {
            sb.append((char) b);
        }
        return sb.toString();
    }
}
