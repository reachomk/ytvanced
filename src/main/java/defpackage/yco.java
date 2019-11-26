package defpackage;

/* renamed from: yco */
public final class yco implements akmw {
    public final String a;
    public final aqpp b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final aqpp f;

    public final akmw a(akmw akmw) {
        yco yco = (yco) akmw;
        ycn ycn = new ycn(yco);
        ycn.d = yco.d;
        if (yco.c == this.c && !this.d) {
            ycn.d = false;
        }
        aqpp aqpp = yco.b;
        if (aqpp == null) {
            aqpp = this.b;
        }
        ycn.b = aqpp;
        String str = yco.a;
        if (str == null) {
            str = this.a;
        }
        ycn.a = str;
        ycn.e = yco.e;
        ycn.f = yco.f;
        return ycn.a();
    }

    /* synthetic */ yco(String str, aqpp aqpp, long j, boolean z, boolean z2, aqpp aqpp2) {
        this.a = str;
        this.b = aqpp;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = aqpp2;
    }
}
