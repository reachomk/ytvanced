package defpackage;

import java.util.Arrays;

/* renamed from: nuf */
final class nuf {
    public boolean a;
    public byte[] b = new byte[131];
    public int c;
    private final int d;
    private boolean e;

    public nuf(int i) {
        this.d = i;
        this.b[2] = (byte) 1;
    }

    public final void a() {
        this.e = false;
        this.a = false;
    }

    public final void a(int i) {
        boolean z = true;
        nwf.b(this.e ^ 1);
        if (i != this.d) {
            z = false;
        }
        this.e = z;
        if (z) {
            this.c = 3;
            this.a = false;
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            i2 -= i;
            byte[] bArr2 = this.b;
            int i3 = this.c + i2;
            if (bArr2.length < i3) {
                this.b = Arrays.copyOf(bArr2, i3 + i3);
            }
            System.arraycopy(bArr, i, this.b, this.c, i2);
            this.c += i2;
        }
    }

    public final boolean b(int i) {
        if (!this.e) {
            return false;
        }
        this.c -= i;
        this.e = false;
        this.a = true;
        return true;
    }
}
