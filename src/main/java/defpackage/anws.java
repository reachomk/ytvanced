package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anws */
final class anws extends anwm {
    private final ByteBuffer a;
    private final ByteBuffer b;

    anws(ByteBuffer byteBuffer) {
        super();
        this.a = byteBuffer;
        this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
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
        try {
            this.b.put(b);
        } catch (BufferOverflowException e) {
            throw new anwq(e);
        }
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
        while ((i & -128) != 0) {
            try {
                this.b.put((byte) ((i & 127) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new anwq(e);
            }
        }
        this.b.put((byte) i);
    }

    public final void g(int i) {
        try {
            this.b.putInt(i);
        } catch (BufferOverflowException e) {
            throw new anwq(e);
        }
    }

    public final void c(long j) {
        while ((-128 & j) != 0) {
            try {
                this.b.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new anwq(e);
            }
        }
        this.b.put((byte) ((int) j));
    }

    public final void e(long j) {
        try {
            this.b.putLong(j);
        } catch (BufferOverflowException e) {
            throw new anwq(e);
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        try {
            this.b.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new anwq(e);
        } catch (BufferOverflowException e2) {
            throw new anwq(e2);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public final void a(String str) {
        int position = this.b.position();
        try {
            int q = anwm.q(str.length() * 3);
            int q2 = anwm.q(str.length());
            if (q2 == q) {
                q = this.b.position() + q2;
                this.b.position(q);
                c(str);
                q2 = this.b.position();
                this.b.position(position);
                e(q2 - q);
                this.b.position(q2);
                return;
            }
            e(aobd.a((CharSequence) str));
            c(str);
        } catch (aobh e) {
            this.b.position(position);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new anwq(e2);
        }
    }

    public final void i() {
        this.a.position(this.b.position());
    }

    public final int a() {
        return this.b.remaining();
    }

    private final void c(String str) {
        try {
            aobd.a((CharSequence) str, this.b);
        } catch (IndexOutOfBoundsException e) {
            throw new anwq(e);
        }
    }
}
