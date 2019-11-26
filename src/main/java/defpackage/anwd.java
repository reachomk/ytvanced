package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: anwd */
public final class anwd extends OutputStream {
    private static final byte[] a = new byte[0];
    private final int b = 128;
    private final ArrayList c = new ArrayList();
    private int d;
    private byte[] e = new byte[128];
    private int f;

    anwd() {
    }

    public final synchronized void write(int i) {
        if (this.f == this.e.length) {
            a(1);
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i3 = this.f;
        length -= i3;
        if (i2 <= length) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, length);
        i2 -= length;
        a(i2);
        System.arraycopy(bArr, i + length, this.e, 0, i2);
        this.f = i2;
    }

    public final synchronized anvu a() {
        int i = this.f;
        byte[] bArr = this.e;
        int length = bArr.length;
        if (i >= length) {
            this.c.add(new anwe(bArr));
            this.e = a;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i));
            this.c.add(new anwe(bArr2));
        }
        this.d += this.f;
        this.f = 0;
        return anvu.a(this.c);
    }

    private final synchronized int b() {
        return this.d + this.f;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b())});
    }

    private final void a(int i) {
        this.c.add(new anwe(this.e));
        int length = this.d + this.e.length;
        this.d = length;
        this.e = new byte[Math.max(this.b, Math.max(i, length >>> 1))];
        this.f = 0;
    }
}
