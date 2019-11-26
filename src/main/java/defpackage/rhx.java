package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: rhx */
final class rhx extends rhz {
    rhx(Unsafe unsafe) {
        super(unsafe);
    }

    public final void a(long j, byte b) {
        Memory.pokeByte(j, b);
    }

    public final byte a(Object obj, long j) {
        if (rhv.e) {
            return rhv.g(obj, j);
        }
        return rhv.h(obj, j);
    }

    public final void a(Object obj, long j, byte b) {
        if (rhv.e) {
            rhv.a(obj, j, b);
        } else {
            rhv.b(obj, j, b);
        }
    }

    public final boolean b(Object obj, long j) {
        if (rhv.e) {
            return rhv.i(obj, j);
        }
        return rhv.j(obj, j);
    }

    public final void a(Object obj, long j, boolean z) {
        if (rhv.e) {
            rhv.a(obj, j, (byte) z);
        } else {
            rhv.b(obj, j, z);
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

    public final void a(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
    }
}
