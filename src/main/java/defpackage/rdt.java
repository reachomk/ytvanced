package defpackage;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: rdt */
public abstract class rdt extends rdd {
    public static final boolean a = rhv.c;
    private static final Logger c = Logger.getLogger(rdt.class.getName());
    public rdz b = this;

    public static int a() {
        return 4;
    }

    public static rdt a(byte[] bArr) {
        return new rdw(bArr, 0, bArr.length);
    }

    public static int b() {
        return 4;
    }

    public static int c() {
        return 8;
    }

    public static int d() {
        return 8;
    }

    public static int d(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i;
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    public static int e() {
        return 4;
    }

    public static int f() {
        return 8;
    }

    private static long f(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static int g() {
        return 1;
    }

    public static int n(int i) {
        return (i & -128) != 0 ? (i & -16384) != 0 ? (-2097152 & i) != 0 ? (i & -268435456) != 0 ? 5 : 4 : 3 : 2 : 1;
    }

    private static int p(int i) {
        return (i >> 31) ^ (i + i);
    }

    public abstract void a(byte b);

    public abstract void a(int i);

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, String str);

    public abstract void a(int i, rdg rdg);

    public abstract void a(int i, rgh rgh);

    public abstract void a(int i, rgh rgh, rha rha);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(String str);

    public abstract void a(rdg rdg);

    public abstract void a(rgh rgh);

    public abstract void a(byte[] bArr, int i);

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, rdg rdg);

    public abstract void b(int i, rgh rgh);

    public abstract void b(byte[] bArr, int i, int i2);

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void d(int i);

    public abstract void e(int i, int i2);

    public abstract void h();

    public abstract int i();

    public static rdt a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new rdv(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (rhv.b) {
            return new rea(byteBuffer);
        } else {
            return new rdx(byteBuffer);
        }
    }

    private rdt() {
    }

    public final void d(int i, int i2) {
        c(i, rdt.p(i2));
    }

    public final void b(int i, long j) {
        a(i, rdt.f(j));
    }

    public final void a(int i, float f) {
        e(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d) {
        c(i, Double.doubleToRawLongBits(d));
    }

    public final void c(int i) {
        b(rdt.p(i));
    }

    public final void b(long j) {
        a(rdt.f(j));
    }

    public final void a(float f) {
        d(Float.floatToRawIntBits(f));
    }

    public final void a(double d) {
        c(Double.doubleToRawLongBits(d));
    }

    public static int f(int i, int i2) {
        return rdt.l(i) + rdt.m(i2);
    }

    public static int g(int i, int i2) {
        return rdt.l(i) + rdt.n(i2);
    }

    public static int h(int i, int i2) {
        return rdt.l(i) + rdt.n(rdt.p(i2));
    }

    public static int e(int i) {
        return rdt.l(i) + 4;
    }

    public static int f(int i) {
        return rdt.l(i) + 4;
    }

    public static int d(int i, long j) {
        return rdt.l(i) + rdt.d(j);
    }

    public static int e(int i, long j) {
        return rdt.l(i) + rdt.d(j);
    }

    public static int f(int i, long j) {
        return rdt.l(i) + rdt.d(rdt.f(j));
    }

    public static int g(int i) {
        return rdt.l(i) + 8;
    }

    public static int h(int i) {
        return rdt.l(i) + 8;
    }

    public static int i(int i) {
        return rdt.l(i) + 4;
    }

    public static int j(int i) {
        return rdt.l(i) + 8;
    }

    public static int k(int i) {
        return rdt.l(i) + 1;
    }

    public static int i(int i, int i2) {
        return rdt.l(i) + rdt.m(i2);
    }

    public static int b(int i, String str) {
        return rdt.l(i) + rdt.b(str);
    }

    public static int c(int i, rdg rdg) {
        i = rdt.l(i);
        int a = rdg.a();
        return i + (rdt.n(a) + a);
    }

    public static int a(int i, rfq rfq) {
        i = rdt.l(i);
        int b = rfq.b();
        return i + (rdt.n(b) + b);
    }

    public static int c(int i, rgh rgh) {
        return rdt.l(i) + rdt.b(rgh);
    }

    public static int l(int i) {
        return rdt.n(i << 3);
    }

    public static int m(int i) {
        return i < 0 ? 10 : rdt.n(i);
    }

    public static int o(int i) {
        return rdt.n(rdt.p(i));
    }

    public static int e(long j) {
        return rdt.d(rdt.f(j));
    }

    public static int b(String str) {
        int a;
        try {
            a = rib.a((CharSequence) str);
        } catch (rig unused) {
            a = str.getBytes(rfc.a).length;
        }
        return rdt.n(a) + a;
    }

    public static int a(rfq rfq) {
        int b = rfq.b();
        return rdt.n(b) + b;
    }

    public static int b(rdg rdg) {
        int a = rdg.a();
        return rdt.n(a) + a;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return rdt.n(length) + length;
    }

    public static int b(rgh rgh) {
        int h = rgh.h();
        return rdt.n(h) + h;
    }

    static int a(rgh rgh, rha rha) {
        rcr rcr = (rcr) rgh;
        int f = rcr.f();
        if (f == -1) {
            f = rha.b(rcr);
            rcr.b(f);
        }
        return rdt.n(f) + f;
    }

    public final void j() {
        if (i() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, rig rig) {
        c.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", rig);
        byte[] bytes = str.getBytes(rfc.a);
        try {
            int length = bytes.length;
            b(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new rdy(e);
        } catch (rdy e2) {
            throw e2;
        }
    }

    @Deprecated
    static int b(int i, rgh rgh, rha rha) {
        i = rdt.l(i);
        i += i;
        rcr rcr = (rcr) rgh;
        int f = rcr.f();
        if (f == -1) {
            f = rha.b(rcr);
            rcr.b(f);
        }
        return i + f;
    }

    @Deprecated
    public static int c(rgh rgh) {
        return rgh.h();
    }

    /* synthetic */ rdt(byte b) {
    }
}
