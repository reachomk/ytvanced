package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: bsd */
public final class bsd {
    public final byte[] a = new byte[256];
    public ByteBuffer b;
    public bse c;
    public int d = 0;

    public final int[] a(int i) {
        int[] iArr;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((((bArr[i3] & 255) << 16) | -16777216) | ((bArr[i4] & 255) << 8)) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException unused) {
                    this.c.b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException unused2) {
            iArr = null;
            this.c.b = 1;
            return iArr;
        }
        return iArr;
    }

    public final void a() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }

    public final void b() {
        int c = c();
        this.d = c;
        if (c > 0) {
            c = 0;
            while (true) {
                try {
                    int i = this.d;
                    if (c < i) {
                        i -= c;
                        this.b.get(this.a, c, i);
                        c += i;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final int d() {
        return this.b.getShort();
    }

    public final boolean e() {
        return this.c.b != 0;
    }
}
