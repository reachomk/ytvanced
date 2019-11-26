package defpackage;

import sun.misc.Unsafe;

/* renamed from: ria */
final class ria extends rhz {
    ria(Unsafe unsafe) {
        super(unsafe);
    }

    public final void a(long j, byte b) {
        this.a.putByte(j, b);
    }

    public final byte a(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    public final void a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    public final boolean b(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public final void a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public final float c(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    public final void a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public final double d(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public final void a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public final void a(byte[] bArr, long j, long j2, long j3) {
        this.a.copyMemory(bArr, rhv.d + j, null, j2, j3);
    }
}
