package defpackage;

/* renamed from: nwl */
public final class nwl {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;

    public nwl(byte[] bArr) {
        nxa nxa = new nxa(bArr);
        nxa.a(136);
        this.a = nxa.c(16);
        this.b = nxa.c(16);
        nxa.c(24);
        nxa.c(24);
        this.c = nxa.c(20);
        this.d = nxa.c(3) + 1;
        this.e = nxa.c(5) + 1;
        this.f = (long) nxa.c(36);
    }
}
