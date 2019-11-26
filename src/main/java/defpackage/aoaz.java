package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: aoaz */
final class aoaz extends aobe {
    aoaz(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    public final void a(long j, byte b) {
        Memory.pokeByte((int) j, b);
    }

    public final byte a(Object obj, long j) {
        return !aoax.e ? aoax.h(obj, j) : aoax.g(obj, j);
    }

    public final void a(Object obj, long j, byte b) {
        if (aoax.e) {
            aoax.a(obj, j, b);
        } else {
            aoax.b(obj, j, b);
        }
    }

    public final boolean b(Object obj, long j) {
        return !aoax.e ? aoax.j(obj, j) : aoax.i(obj, j);
    }

    public final void a(Object obj, long j, boolean z) {
        if (aoax.e) {
            aoax.a(obj, j, (byte) z);
        } else {
            aoax.b(obj, j, z);
        }
    }

    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(e(obj, j));
    }

    public final void a(Object obj, long j, float f) {
        a(obj, j, Float.floatToIntBits(f));
    }

    public final double d(Object obj, long j) {
        return Double.longBitsToDouble(f(obj, j));
    }

    public final void a(Object obj, long j, double d) {
        a(obj, j, Double.doubleToLongBits(d));
    }

    public final void a(long j, byte[] bArr, long j2) {
        Memory.peekByteArray((int) j, bArr, 0, (int) j2);
    }

    public final void a(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray((int) j2, bArr, (int) j, (int) j3);
    }
}
