package defpackage;

import java.io.OutputStream;

/* renamed from: bsw */
public final class bsw extends OutputStream {
    private final OutputStream a;
    private byte[] b;
    private final bwb c;
    private int d;

    public bsw(OutputStream outputStream, bwb bwb) {
        this.a = outputStream;
        this.c = bwb;
        this.b = (byte[]) bwb.a(65536, byte[].class);
    }

    public final void write(int i) {
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.d;
            if (i6 != 0 || i4 < this.b.length) {
                i4 = Math.min(i4, this.b.length - i6);
                System.arraycopy(bArr, i5, this.b, this.d, i4);
                this.d += i4;
                i3 += i4;
                b();
                if (i3 >= i2) {
                    return;
                }
            } else {
                this.a.write(bArr, i5, i4);
                return;
            }
        }
    }

    public final void flush() {
        a();
        this.a.flush();
    }

    private final void a() {
        int i = this.d;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.d = 0;
        }
    }

    private final void b() {
        if (this.d == this.b.length) {
            a();
        }
    }

    public final void close() {
        try {
            flush();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.c.b(bArr);
                this.b = null;
            }
        } finally {
            this.a.close();
        }
    }
}
