package defpackage;

/* renamed from: agxh */
public final class agxh {
    public final String a;
    public agrc b = agrc.PENDING;
    public int c = 1;
    public long d = 0;
    public long e = 0;
    public final agpw f;
    public agpw g = new agpw();
    public final String h;
    public final int i;
    public int j;

    public agxh(String str, String str2, int i, agpw agpw, int i2) {
        this.a = xvd.a(str2, (Object) "transferId may not be empty");
        this.f = (agpw) amqw.a((Object) agpw);
        this.h = str;
        this.i = i;
        this.j = i2;
    }

    public final agqz a() {
        return new agqz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean b() {
        return (this.b == agrc.COMPLETED || this.b == agrc.FAILED) ? false : true;
    }
}
