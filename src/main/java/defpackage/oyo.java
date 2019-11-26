package defpackage;

/* renamed from: oyo */
public final class oyo {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public oyo(byte[] bArr) {
        oyx oyx = new oyx(bArr);
        oyx.a(136);
        oyx.c(16);
        oyx.c(16);
        oyx.c(24);
        oyx.c(24);
        this.a = oyx.c(20);
        this.b = oyx.c(3) + 1;
        this.c = oyx.c(5) + 1;
        this.d = ((((long) oyx.c(4)) & 15) << 32) | (((long) oyx.c(32)) & 4294967295L);
    }
}
