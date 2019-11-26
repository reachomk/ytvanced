package defpackage;

import java.io.PipedOutputStream;

/* renamed from: acip */
public final class acip extends PipedOutputStream {
    private final acim a;

    public acip(acim acim) {
        super(acim);
        this.a = acim;
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.a.a(bArr, i, i2);
    }
}
