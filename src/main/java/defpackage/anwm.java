package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: anwm */
public abstract class anwm extends anvr {
    private static final Logger a = Logger.getLogger(anwm.class.getName());
    public static final boolean e = aoax.c;
    public anwu f = this;
    public boolean g;

    private static int a(int i) {
        return (i >> 31) ^ (i + i);
    }

    private static long a(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static anwm a(OutputStream outputStream) {
        return anwm.a(outputStream, 4096);
    }

    public static int b() {
        return 4;
    }

    public static int c() {
        return 4;
    }

    static int c(int i) {
        return i <= 4096 ? i : 4096;
    }

    public static int d() {
        return 8;
    }

    public static int e() {
        return 8;
    }

    public static int f() {
        return 4;
    }

    public static int f(long j) {
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

    public static int g() {
        return 8;
    }

    public static int h() {
        return 1;
    }

    public static int q(int i) {
        return (i & -128) != 0 ? (i & -16384) != 0 ? (-2097152 & i) != 0 ? (i & -268435456) != 0 ? 5 : 4 : 3 : 2 : 1;
    }

    public abstract int a();

    public abstract void a(int i, long j);

    public abstract void a(int i, anvu anvu);

    public abstract void a(int i, anze anze);

    public abstract void a(int i, anze anze, anzz anzz);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(int i, byte[] bArr);

    public abstract void a(anvu anvu);

    public abstract void a(anze anze);

    public abstract void a(String str);

    public abstract void a(byte[] bArr, int i);

    public abstract void b(byte b);

    public abstract void b(int i, int i2);

    public abstract void b(int i, anvu anvu);

    public abstract void b(int i, anze anze);

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void c(byte[] bArr, int i, int i2);

    public abstract void d(int i);

    public abstract void d(int i, int i2);

    public abstract void e(int i);

    public abstract void e(long j);

    public abstract void f(int i, int i2);

    public abstract void g(int i);

    public abstract void i();

    public static anwm a(OutputStream outputStream, int i) {
        return new anwp(outputStream, i);
    }

    public static anwm a(byte[] bArr) {
        return anwm.b(bArr, 0, bArr.length);
    }

    public static anwm b(byte[] bArr, int i, int i2) {
        return new anwo(bArr, i, i2);
    }

    public static anwm a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new anwn(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        anwm anwr;
        if (aoax.b) {
            anwr = new anwr(byteBuffer);
        } else {
            anwr = new anws(byteBuffer);
        }
        return anwr;
    }

    private anwm() {
    }

    public final void e(int i, int i2) {
        d(i, anwm.a(i2));
    }

    public final void b(int i, long j) {
        a(i, anwm.a(j));
    }

    public final void a(int i, float f) {
        f(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d) {
        c(i, Double.doubleToRawLongBits(d));
    }

    public final void f(int i) {
        e(anwm.a(i));
    }

    public final void d(long j) {
        c(anwm.a(j));
    }

    public final void a(float f) {
        g(Float.floatToRawIntBits(f));
    }

    public final void a(double d) {
        e(Double.doubleToRawLongBits(d));
    }

    public static int g(int i, int i2) {
        return anwm.o(i) + anwm.p(i2);
    }

    public static int h(int i, int i2) {
        return anwm.o(i) + anwm.q(i2);
    }

    public static int i(int i, int i2) {
        return anwm.o(i) + anwm.r(i2);
    }

    public static int h(int i) {
        return anwm.o(i) + 4;
    }

    public static int i(int i) {
        return anwm.o(i) + 4;
    }

    public static int d(int i, long j) {
        return anwm.o(i) + anwm.f(j);
    }

    public static int e(int i, long j) {
        return anwm.o(i) + anwm.f(j);
    }

    public static int f(int i, long j) {
        return anwm.o(i) + anwm.g(j);
    }

    public static int j(int i) {
        return anwm.o(i) + 8;
    }

    public static int k(int i) {
        return anwm.o(i) + 8;
    }

    public static int l(int i) {
        return anwm.o(i) + 4;
    }

    public static int m(int i) {
        return anwm.o(i) + 8;
    }

    public static int n(int i) {
        return anwm.o(i) + 1;
    }

    public static int j(int i, int i2) {
        return anwm.o(i) + anwm.p(i2);
    }

    public static int b(int i, String str) {
        return anwm.o(i) + anwm.b(str);
    }

    public static int c(int i, anvu anvu) {
        return anwm.o(i) + anwm.b(anvu);
    }

    public static int a(int i, anym anym) {
        return anwm.o(i) + anwm.a(anym);
    }

    public static int c(int i, anze anze) {
        return anwm.o(i) + anwm.b(anze);
    }

    public static int o(int i) {
        return anwm.q(aobj.a(i, 0));
    }

    public static int p(int i) {
        return i < 0 ? 10 : anwm.q(i);
    }

    public static int r(int i) {
        return anwm.q(anwm.a(i));
    }

    public static int g(long j) {
        return anwm.f(anwm.a(j));
    }

    public static int b(String str) {
        int a;
        try {
            a = aobd.a((CharSequence) str);
        } catch (aobh unused) {
            a = str.getBytes(anxw.a).length;
        }
        return anwm.s(a);
    }

    public static int a(anym anym) {
        int b;
        if (anym.c != null) {
            b = anym.c.b();
        } else {
            anvu anvu = anym.a;
            b = anym.b != null ? anym.b.getSerializedSize() : 0;
        }
        return anwm.s(b);
    }

    public static int b(anvu anvu) {
        return anwm.s(anvu.b());
    }

    public static int b(byte[] bArr) {
        return anwm.s(bArr.length);
    }

    public static int b(anze anze) {
        return anwm.s(anze.getSerializedSize());
    }

    static int a(anze anze, anzz anzz) {
        return anwm.s(((anvf) anze).getSerializedSize(anzz));
    }

    static int s(int i) {
        return anwm.q(i) + i;
    }

    public final void j() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, aobh aobh) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", aobh);
        byte[] bytes = str.getBytes(anxw.a);
        try {
            int length = bytes.length;
            e(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new anwq(e);
        } catch (anwq e2) {
            throw e2;
        }
    }

    @Deprecated
    public final void c(anze anze) {
        anze.writeTo(this);
    }

    @Deprecated
    static int b(int i, anze anze, anzz anzz) {
        i = anwm.o(i);
        return (i + i) + ((anvf) anze).getSerializedSize(anzz);
    }

    @Deprecated
    public static int d(anze anze) {
        return anze.getSerializedSize();
    }

    /* synthetic */ anwm(byte b) {
    }
}
