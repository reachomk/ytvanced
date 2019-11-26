package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* renamed from: anvf */
public abstract class anvf implements anze {
    public int memoizedHashCode = 0;

    /* Access modifiers changed, original: 0000 */
    public int getMemoizedSerializedSize() {
        throw null;
    }

    /* Access modifiers changed, original: 0000 */
    public void setMemoizedSerializedSize(int i) {
        throw null;
    }

    public anvu toByteString() {
        try {
            anwc c = anvu.c(getSerializedSize());
            writeTo(c.a);
            return c.a();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            anwm a = anwm.a(bArr);
            writeTo(a);
            a.j();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public void writeTo(OutputStream outputStream) {
        anwm a = anwm.a(outputStream, anwm.c(getSerializedSize()));
        writeTo(a);
        a.i();
    }

    /* Access modifiers changed, original: 0000 */
    public int getSerializedSize(anzz anzz) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int b = anzz.b(this);
        setMemoizedSerializedSize(b);
        return b;
    }

    /* Access modifiers changed, original: 0000 */
    public aoas newUninitializedMessageException() {
        return new aoas();
    }

    private String getSerializingExceptionMessage(String str) {
        String name = getClass().getName();
        StringBuilder stringBuilder = new StringBuilder((name.length() + 62) + String.valueOf(str).length());
        stringBuilder.append("Serializing ");
        stringBuilder.append(name);
        stringBuilder.append(" to a ");
        stringBuilder.append(str);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    public static void addAll(Iterable iterable, List list) {
        anvi.addAll(iterable, list);
    }
}
