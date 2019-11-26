package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: anwf */
public abstract class anwf {
    public int a;
    public int b = 100;
    public int c = Integer.MAX_VALUE;
    public anwj d;

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static anwf a(InputStream inputStream) {
        if (inputStream != null) {
            return new anwh(inputStream);
        }
        return anwf.a(anxw.b);
    }

    public static int f(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a();

    public abstract anxl a(anxl anxl, anxa anxa);

    public abstract anze a(int i, anzq anzq, anxa anxa);

    public abstract anze a(anzq anzq, anxa anxa);

    public abstract void a(int i);

    public abstract double b();

    public abstract boolean b(int i);

    public abstract float c();

    public abstract int c(int i);

    public abstract long d();

    public abstract void d(int i);

    public abstract long e();

    public abstract void e(int i);

    public abstract int f();

    public abstract long g();

    public abstract int h();

    public abstract boolean i();

    public abstract String j();

    public abstract String k();

    public abstract anvu l();

    public abstract byte[] m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract boolean u();

    public abstract int v();

    public static anwf a(byte[] bArr) {
        return anwf.a(bArr, bArr.length);
    }

    public static anwf a(byte[] bArr, int i) {
        return anwf.a(bArr, 0, i, false);
    }

    static anwf a(byte[] bArr, int i, int i2, boolean z) {
        anwi anwi = new anwi(bArr, i, i2, z);
        try {
            anwi.c(i2);
            return anwi;
        } catch (anyg e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static anwf a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return anwf.a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        }
        if (byteBuffer.isDirect() && aoax.b) {
            return new anwk(byteBuffer);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.duplicate().get(bArr);
        return anwf.a(bArr, 0, bArr.length, true);
    }

    private anwf() {
    }

    /* synthetic */ anwf(byte b) {
    }
}
