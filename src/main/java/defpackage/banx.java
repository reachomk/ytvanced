package defpackage;

/* renamed from: banx */
public final class banx extends bant {
    private final byte a;
    private final short b;

    public banx(int i, long j) {
        this.a = (byte) i;
        this.b = (short) ((int) j);
    }

    public final int a() {
        return this.a;
    }

    public final long b() {
        return (long) this.b;
    }
}
