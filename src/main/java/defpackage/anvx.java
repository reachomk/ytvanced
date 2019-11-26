package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: anvx */
final class anvx extends anwe {
    public static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    anvx(byte[] bArr, int i, int i2) {
        super(bArr);
        anvu.c(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    public final byte a(int i) {
        anvu.b(i, this.e);
        return this.c[this.d + i];
    }

    /* Access modifiers changed, original: final */
    public final byte b(int i) {
        return this.c[this.d + i];
    }

    public final int b() {
        return this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final int k() {
        return this.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, this.d + i, bArr, i2, i3);
    }

    /* Access modifiers changed, original: final */
    public final Object writeReplace() {
        return anvu.b(d());
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
}
