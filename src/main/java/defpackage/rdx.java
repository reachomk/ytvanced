package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: rdx */
final class rdx extends rdt {
    private final ByteBuffer c;
    private final ByteBuffer d;

    rdx(ByteBuffer byteBuffer) {
        super();
        this.c = byteBuffer;
        this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
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
        try {
            this.d.put(b);
        } catch (BufferOverflowException e) {
            throw new rdy(e);
        }
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
        while ((i & -128) != 0) {
            try {
                this.d.put((byte) ((i & 127) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new rdy(e);
            }
        }
        this.d.put((byte) i);
    }

    public final void d(int i) {
        try {
            this.d.putInt(i);
        } catch (BufferOverflowException e) {
            throw new rdy(e);
        }
    }

    public final void a(long j) {
        while ((-128 & j) != 0) {
            try {
                this.d.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new rdy(e);
            }
        }
        this.d.put((byte) ((int) j));
    }

    public final void c(long j) {
        try {
            this.d.putLong(j);
        } catch (BufferOverflowException e) {
            throw new rdy(e);
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        try {
            this.d.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(e);
        } catch (BufferOverflowException e2) {
            throw new rdy(e2);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
    }

    public final void a(String str) {
        int position = this.d.position();
        try {
            int n = rdt.n(str.length() * 3);
            int n2 = rdt.n(str.length());
            if (n2 == n) {
                n = this.d.position() + n2;
                this.d.position(n);
                c(str);
                n2 = this.d.position();
                this.d.position(position);
                b(n2 - n);
                this.d.position(n2);
                return;
            }
            b(rib.a((CharSequence) str));
            c(str);
        } catch (rig e) {
            this.d.position(position);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new rdy(e2);
        }
    }

    public final void h() {
        this.c.position(this.d.position());
    }

    public final int i() {
        return this.d.remaining();
    }

    private final void c(String str) {
        try {
            rib.a((CharSequence) str, this.d);
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(e);
        }
    }
}
