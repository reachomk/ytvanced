package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anwr */
final class anwr extends anwm {
    private final ByteBuffer a;
    private final ByteBuffer b;
    private final long c;
    private final long d;
    private final long h;
    private final long i;
    private long j = this.d;

    anwr(ByteBuffer byteBuffer) {
        super();
        this.a = byteBuffer;
        this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long a = aoax.a(byteBuffer);
        this.c = a;
        this.d = a + ((long) byteBuffer.position());
        a = this.c + ((long) byteBuffer.limit());
        this.h = a;
        this.i = a - 10;
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
        long j = this.j;
        if (j < this.h) {
            this.j = 1 + j;
            aoax.a(j, b);
            return;
        }
        throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.h), Integer.valueOf(1)}));
    }

    public final void a(anvu anvu) {
        e(anvu.b());
        anvu.a((anvr) this);
    }

    public final void a(byte[] bArr, int i) {
        e(i);
        c(bArr, 0, i);
    }

    public final void d(int i) {
        if (i < 0) {
            c((long) i);
        } else {
            e(i);
        }
    }

    public final void e(int i) {
        long j;
        if (this.j <= this.i) {
            while ((i & -128) != 0) {
                j = this.j;
                this.j = j + 1;
                aoax.a(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            j = this.j;
            this.j = 1 + j;
            aoax.a(j, (byte) i);
            return;
        }
        while (true) {
            j = this.j;
            if (j >= this.h) {
                throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.h), Integer.valueOf(1)}));
            } else if ((i & -128) != 0) {
                this.j = j + 1;
                aoax.a(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            } else {
                this.j = 1 + j;
                aoax.a(j, (byte) i);
                return;
            }
        }
    }

    public final void g(int i) {
        this.b.putInt(b(this.j), i);
        this.j += 4;
    }

    public final void c(long j) {
        long j2;
        if (this.j <= this.i) {
            while ((j & -128) != 0) {
                j2 = this.j;
                this.j = j2 + 1;
                aoax.a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            j2 = this.j;
            this.j = 1 + j2;
            aoax.a(j2, (byte) ((int) j));
            return;
        }
        while (true) {
            j2 = this.j;
            if (j2 >= this.h) {
                throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.h), Integer.valueOf(1)}));
            } else if ((j & -128) != 0) {
                this.j = j2 + 1;
                aoax.a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } else {
                this.j = 1 + j2;
                aoax.a(j2, (byte) ((int) j));
                return;
            }
        }
    }

    public final void e(long j) {
        this.b.putLong(b(this.j), j);
        this.j += 8;
    }

    public final void c(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j = this.h;
            long j2 = (long) i2;
            long j3 = this.j;
            if (j - j2 >= j3) {
                aoax.a.a(bArr, (long) i, j3, j2);
                this.j += j2;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        throw new anwq(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(i2)}));
    }

    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public final void a(String str) {
        long j = this.j;
        try {
            int q = anwm.q(str.length() * 3);
            int q2 = anwm.q(str.length());
            if (q2 == q) {
                q = b(this.j) + q2;
                this.b.position(q);
                aobd.a((CharSequence) str, this.b);
                q2 = this.b.position() - q;
                e(q2);
                this.j += (long) q2;
                return;
            }
            q = aobd.a((CharSequence) str);
            e(q);
            a(this.j);
            aobd.a((CharSequence) str, this.b);
            this.j += (long) q;
        } catch (aobh e) {
            this.j = j;
            a(j);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new anwq(e2);
        } catch (IndexOutOfBoundsException e22) {
            throw new anwq(e22);
        }
    }

    public final void i() {
        this.a.position(b(this.j));
    }

    public final int a() {
        return (int) (this.h - this.j);
    }

    private final void a(long j) {
        this.b.position(b(j));
    }

    private final int b(long j) {
        return (int) (j - this.c);
    }
}
