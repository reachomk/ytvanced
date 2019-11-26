package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: rea */
final class rea extends rdt {
    private final ByteBuffer c;
    private final ByteBuffer d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private long i = this.f;

    rea(ByteBuffer byteBuffer) {
        super();
        this.c = byteBuffer;
        this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long a = rhv.a(byteBuffer);
        this.e = a;
        this.f = a + ((long) byteBuffer.position());
        a = this.e + ((long) byteBuffer.limit());
        this.g = a;
        this.h = a - 10;
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
        long j = this.i;
        if (j < this.g) {
            this.i = 1 + j;
            rhv.a(j, b);
            return;
        }
        throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.g), Integer.valueOf(1)}));
    }

    public final void a(rdg rdg) {
        b(rdg.a());
        rdg.a((rdd) this);
    }

    public final void a(byte[] bArr, int i) {
        b(i);
        b(bArr, 0, i);
    }

    public final void a(int i) {
        if (i < 0) {
            a((long) i);
        } else {
            b(i);
        }
    }

    public final void b(int i) {
        long j;
        if (this.i <= this.h) {
            while ((i & -128) != 0) {
                j = this.i;
                this.i = j + 1;
                rhv.a(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            j = this.i;
            this.i = 1 + j;
            rhv.a(j, (byte) i);
            return;
        }
        while (true) {
            j = this.i;
            if (j >= this.g) {
                throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.g), Integer.valueOf(1)}));
            } else if ((i & -128) != 0) {
                this.i = j + 1;
                rhv.a(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            } else {
                this.i = 1 + j;
                rhv.a(j, (byte) i);
                return;
            }
        }
    }

    public final void d(int i) {
        this.d.putInt((int) (this.i - this.e), i);
        this.i += 4;
    }

    public final void a(long j) {
        long j2;
        if (this.i <= this.h) {
            while ((j & -128) != 0) {
                j2 = this.i;
                this.i = j2 + 1;
                rhv.a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            j2 = this.i;
            this.i = 1 + j2;
            rhv.a(j2, (byte) ((int) j));
            return;
        }
        while (true) {
            j2 = this.i;
            if (j2 >= this.g) {
                throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.g), Integer.valueOf(1)}));
            } else if ((j & -128) != 0) {
                this.i = j2 + 1;
                rhv.a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } else {
                this.i = 1 + j2;
                rhv.a(j2, (byte) ((int) j));
                return;
            }
        }
    }

    public final void c(long j) {
        this.d.putLong((int) (this.i - this.e), j);
        this.i += 8;
    }

    public final void b(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j = this.g;
            long j2 = (long) i2;
            long j3 = this.i;
            if (j - j2 >= j3) {
                rhv.a.a(bArr, (long) i, j3, j2);
                this.i += j2;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        throw new rdy(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.i), Long.valueOf(this.g), Integer.valueOf(i2)}));
    }

    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
    }

    public final void a(String str) {
        long j = this.i;
        try {
            int n = rdt.n(str.length() * 3);
            int n2 = rdt.n(str.length());
            if (n2 == n) {
                n = ((int) (this.i - this.e)) + n2;
                this.d.position(n);
                rib.a((CharSequence) str, this.d);
                n2 = this.d.position() - n;
                b(n2);
                this.i += (long) n2;
                return;
            }
            n = rib.a((CharSequence) str);
            b(n);
            f(this.i);
            rib.a((CharSequence) str, this.d);
            this.i += (long) n;
        } catch (rig e) {
            this.i = j;
            f(j);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new rdy(e2);
        } catch (IndexOutOfBoundsException e22) {
            throw new rdy(e22);
        }
    }

    public final void h() {
        this.c.position((int) (this.i - this.e));
    }

    public final int i() {
        return (int) (this.g - this.i);
    }

    private final void f(long j) {
        this.d.position((int) (j - this.e));
    }
}
