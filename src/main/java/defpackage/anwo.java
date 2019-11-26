package defpackage;

/* renamed from: anwo */
class anwo extends anwm {
    public final int a;
    public int b;
    private final byte[] c;
    private final int d;

    anwo(byte[] bArr, int i, int i2) {
        super();
        if (bArr != null) {
            int i3 = i + i2;
            if (((i | i2) | (bArr.length - i3)) >= 0) {
                this.c = bArr;
                this.a = i;
                this.b = i;
                this.d = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    public void i() {
    }

    public final void b(int i, int i2) {
        e(aobj.a(i, i2));
    }

    public final void c(int i, int i2) {
        b(i, 0);
        d(i2);
    }

    public final void d(int i, int i2) {
        b(i, 0);
        e(i2);
    }

    public final void f(int i, int i2) {
        b(i, 5);
        g(i2);
    }

    public final void a(int i, long j) {
        b(i, 0);
        c(j);
    }

    public final void c(int i, long j) {
        b(i, 1);
        e(j);
    }

    public final void a(int i, boolean z) {
        b(i, 0);
        b((byte) z);
    }

    public final void a(int i, String str) {
        b(i, 2);
        a(str);
    }

    public final void a(int i, anvu anvu) {
        b(i, 2);
        a(anvu);
    }

    public final void a(int i, byte[] bArr) {
        int length = bArr.length;
        b(i, 2);
        a(bArr, length);
    }

    public final void a(anvu anvu) {
        e(anvu.b());
        anvu.a((anvr) this);
    }

    public final void a(byte[] bArr, int i) {
        e(i);
        c(bArr, 0, i);
    }

    public final void a(int i, anze anze) {
        b(i, 2);
        a(anze);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, anze anze, anzz anzz) {
        b(i, 2);
        e(((anvf) anze).getSerializedSize(anzz));
        anzz.a((Object) anze, this.f);
    }

    public final void b(int i, anze anze) {
        b(1, 3);
        d(2, i);
        a(3, anze);
        b(1, 4);
    }

    public final void b(int i, anvu anvu) {
        b(1, 3);
        d(2, i);
        a(3, anvu);
        b(1, 4);
    }

    public final void a(anze anze) {
        e(anze.getSerializedSize());
        anze.writeTo((anwm) this);
    }

    public final void b(byte b) {
        try {
            byte[] bArr = this.c;
            int i = this.b;
            this.b = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(1)}), e);
        }
    }

    public final void d(int i) {
        if (i < 0) {
            c((long) i);
        } else {
            e(i);
        }
    }

    public final void e(int i) {
        byte[] bArr;
        int i2;
        if (!anwm.e || anvm.a() || a() < 5) {
            while ((i & -128) != 0) {
                bArr = this.c;
                i2 = this.b;
                this.b = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                bArr = this.c;
                i2 = this.b;
                this.b = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(1)}), e);
            }
        } else if ((i & -128) != 0) {
            bArr = this.c;
            i2 = this.b;
            this.b = i2 + 1;
            aoax.a(bArr, (long) i2, (byte) (i | 128));
            i >>>= 7;
            if ((i & -128) == 0) {
                bArr = this.c;
                i2 = this.b;
                this.b = i2 + 1;
                aoax.a(bArr, (long) i2, (byte) i);
                return;
            }
            bArr = this.c;
            i2 = this.b;
            this.b = i2 + 1;
            aoax.a(bArr, (long) i2, (byte) (i | 128));
            i >>>= 7;
            if ((i & -128) == 0) {
                bArr = this.c;
                i2 = this.b;
                this.b = i2 + 1;
                aoax.a(bArr, (long) i2, (byte) i);
                return;
            }
            bArr = this.c;
            i2 = this.b;
            this.b = i2 + 1;
            aoax.a(bArr, (long) i2, (byte) (i | 128));
            i >>>= 7;
            if ((i & -128) == 0) {
                bArr = this.c;
                i2 = this.b;
                this.b = i2 + 1;
                aoax.a(bArr, (long) i2, (byte) i);
                return;
            }
            bArr = this.c;
            i2 = this.b;
            this.b = i2 + 1;
            aoax.a(bArr, (long) i2, (byte) (i | 128));
            bArr = this.c;
            i2 = this.b;
            this.b = i2 + 1;
            aoax.a(bArr, (long) i2, (byte) (i >>> 7));
        } else {
            bArr = this.c;
            i2 = this.b;
            this.b = i2 + 1;
            aoax.a(bArr, (long) i2, (byte) i);
        }
    }

    public final void g(int i) {
        try {
            byte[] bArr = this.c;
            int i2 = this.b;
            int i3 = i2 + 1;
            this.b = i3;
            bArr[i2] = (byte) i;
            i2 = i3 + 1;
            this.b = i2;
            bArr[i3] = (byte) (i >> 8);
            i3 = i2 + 1;
            this.b = i3;
            bArr[i2] = (byte) (i >> 16);
            this.b = i3 + 1;
            bArr[i3] = (byte) (i >> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(1)}), e);
        }
    }

    public final void c(long j) {
        byte[] bArr;
        int i;
        int i2;
        if (!anwm.e || a() < 10) {
            while ((j & -128) != 0) {
                bArr = this.c;
                i = this.b;
                this.b = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                bArr = this.c;
                i2 = this.b;
                this.b = i2 + 1;
                bArr[i2] = (byte) ((int) j);
                return;
            } catch (IndexOutOfBoundsException e) {
                throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(1)}), e);
            }
        }
        while ((j & -128) != 0) {
            bArr = this.c;
            i = this.b;
            this.b = i + 1;
            aoax.a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        bArr = this.c;
        i2 = this.b;
        this.b = i2 + 1;
        aoax.a(bArr, (long) i2, (byte) ((int) j));
    }

    public final void e(long j) {
        try {
            byte[] bArr = this.c;
            int i = this.b;
            int i2 = i + 1;
            this.b = i2;
            bArr[i] = (byte) ((int) j);
            i = i2 + 1;
            this.b = i;
            bArr[i2] = (byte) ((int) (j >> 8));
            i2 = i + 1;
            this.b = i2;
            bArr[i] = (byte) ((int) (j >> 16));
            i = i2 + 1;
            this.b = i;
            bArr[i2] = (byte) ((int) (j >> 24));
            i2 = i + 1;
            this.b = i2;
            bArr[i] = (byte) ((int) (j >> 32));
            i = i2 + 1;
            this.b = i;
            bArr[i2] = (byte) ((int) (j >> 40));
            i2 = i + 1;
            this.b = i2;
            bArr[i] = (byte) ((int) (j >> 48));
            this.b = i2 + 1;
            bArr[i2] = (byte) ((int) (j >> 56));
        } catch (IndexOutOfBoundsException e) {
            throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(1)}), e);
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.c, this.b, i2);
            this.b += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(i2)}), e);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public final void a(String str) {
        int i = this.b;
        try {
            int q = anwm.q(str.length() * 3);
            int q2 = anwm.q(str.length());
            if (q2 == q) {
                q = i + q2;
                this.b = q;
                q = aobd.a(str, this.c, q, a());
                this.b = i;
                e((q - i) - q2);
                this.b = q;
                return;
            }
            e(aobd.a((CharSequence) str));
            this.b = aobd.a(str, this.c, this.b, a());
        } catch (aobh e) {
            this.b = i;
            a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new anwq(e2);
        }
    }

    public final int a() {
        return this.d - this.b;
    }
}
