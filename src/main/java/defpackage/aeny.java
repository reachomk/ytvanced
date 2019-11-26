package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: aeny */
public final class aeny extends ByteArrayOutputStream {
    public aeny() {
        super(102400);
    }

    public final void a(int i, int i2, byte[] bArr, int i3) {
        System.arraycopy(this.buf, i, bArr, i3, i2);
    }
}
