package defpackage;

/* renamed from: rdw */
class rdw extends rdt {
    public final int c;
    public int d;
    private final byte[] e;
    private final int f;

    rdw(byte[] bArr, int i, int i2) {
        super();
        if (bArr != null) {
            int i3 = i + i2;
            if (((i | i2) | (bArr.length - i3)) >= 0) {
                this.e = bArr;
                this.c = i;
                this.d = i;
                this.f = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    public void h() {
    }

    public final void a(int i, int i2) {
        b((i << 3) | i2);
    }

    public final void b(int i, int i2) {
        a(i, 0);
        a(i2);
    }

    public final void c(int i, int i2) {
        a(i, 0);
        b(i2);
    }

    public final void e(int i, int i2) {
        a(i, 5);
        d(i2);
    }

    public final void a(int i, long j) {
        a(i, 0);
        a(j);
    }

    public final void c(int i, long j) {
        a(i, 1);
        c(j);
    }

    public final void a(int i, boolean z) {
        a(i, 0);
        a((byte) z);
    }

    public final void a(int i, String str) {
        a(i, 2);
        a(str);
    }

    public final void a(int i, rdg rdg) {
        a(i, 2);
        a(rdg);
    }

    public final void a(rdg rdg) {
        b(rdg.a());
        rdg.a((rdd) this);
    }

    public final void a(byte[] bArr, int i) {
        b(i);
        b(bArr, 0, i);
    }

    public final void a(int i, rgh rgh) {
        a(i, 2);
        a(rgh);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, rgh rgh, rha rha) {
        a(i, 2);
        rcr rcr = (rcr) rgh;
        int f = rcr.f();
        if (f == -1) {
            f = rha.b(rcr);
            rcr.b(f);
        }
        b(f);
        rha.a((Object) rgh, this.b);
    }

    public final void b(int i, rgh rgh) {
        a(1, 3);
        c(2, i);
        a(3, rgh);
        a(1, 4);
    }

    public final void b(int i, rdg rdg) {
        a(1, 3);
        c(2, i);
        a(3, rdg);
        a(1, 4);
    }

    public final void a(rgh rgh) {
        b(rgh.h());
        rgh.a(this);
    }

    public final void a(byte b) {
        try {
            byte[] bArr = this.e;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
        }
    }

    public final void a(int i) {
        if (i < 0) {
            a((long) i);
        } else {
            b(i);
        }
    }

    public final void b(int i) {
        byte[] bArr;
        int i2;
        if (rdt.a && i() >= 10) {
            while ((i & -128) != 0) {
                bArr = this.e;
                i2 = this.d;
                this.d = i2 + 1;
                rhv.a(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            bArr = this.e;
            i2 = this.d;
            this.d = i2 + 1;
            rhv.a(bArr, (long) i2, (byte) i);
            return;
        }
        while ((i & -128) != 0) {
            bArr = this.e;
            i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            bArr = this.e;
            i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
        }
    }

    public final void d(int i) {
        try {
            byte[] bArr = this.e;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) i;
            i2 = i3 + 1;
            this.d = i2;
            bArr[i3] = (byte) (i >> 8);
            i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i >> 16);
            this.d = i3 + 1;
            bArr[i3] = (byte) (i >> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
        }
    }

    public final void a(long j) {
        byte[] bArr;
        int i;
        int i2;
        if (rdt.a && i() >= 10) {
            while ((j & -128) != 0) {
                bArr = this.e;
                i = this.d;
                this.d = i + 1;
                rhv.a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            bArr = this.e;
            i2 = this.d;
            this.d = i2 + 1;
            rhv.a(bArr, (long) i2, (byte) ((int) j));
            return;
        }
        while ((j & -128) != 0) {
            bArr = this.e;
            i = this.d;
            this.d = i + 1;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        try {
            bArr = this.e;
            i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) ((int) j);
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
        }
    }

    public final void c(long j) {
        try {
            byte[] bArr = this.e;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) ((int) j);
            i = i2 + 1;
            this.d = i;
            bArr[i2] = (byte) ((int) (j >> 8));
            i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) ((int) (j >> 16));
            i = i2 + 1;
            this.d = i;
            bArr[i2] = (byte) ((int) (j >> 24));
            i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) ((int) (j >> 32));
            i = i2 + 1;
            this.d = i;
            bArr[i2] = (byte) ((int) (j >> 40));
            i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) ((int) (j >> 48));
            this.d = i2 + 1;
            bArr[i2] = (byte) ((int) (j >> 56));
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.e, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(i2)}), e);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
    }

    public final void a(String str) {
        int i = this.d;
        try {
            int n = rdt.n(str.length() * 3);
            int n2 = rdt.n(str.length());
            if (n2 == n) {
                n = i + n2;
                this.d = n;
                n = rib.a(str, this.e, n, i());
                this.d = i;
                b((n - i) - n2);
                this.d = n;
                return;
            }
            b(rib.a((CharSequence) str));
            this.d = rib.a(str, this.e, this.d, i());
        } catch (rig e) {
            this.d = i;
            a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new rdy(e2);
        }
    }

    public final int i() {
        return this.f - this.d;
    }
}
