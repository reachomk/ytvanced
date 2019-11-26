package defpackage;

/* renamed from: vjj */
final class vjj implements Runnable {
    private final /* synthetic */ aakj a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ aett d;
    private final /* synthetic */ long e;
    private final /* synthetic */ int f;
    private final /* synthetic */ xvk g;
    private final /* synthetic */ String h;
    private final /* synthetic */ viz i;

    vjj(viz viz, aakj aakj, String str, String str2, aett aett, long j, int i, xvk xvk, String str3) {
        this.i = viz;
        this.a = aakj;
        this.b = str;
        this.c = str2;
        this.d = aett;
        this.e = j;
        this.f = i;
        this.g = xvk;
        this.h = str3;
    }

    public final void run() {
        vfk vfk = (vfk) this.i.f.get();
        aakj aakj = this.a;
        String str = this.b;
        String str2 = this.c;
        aett aett = this.d;
        vsi a = vfk.a(aakj, str, str2, aett.f, aett.b, this.e, this.f, this.g);
        this.i.a.a(this.h, a.b);
        viz viz = this.i;
        String str3 = this.h;
        viz.a(str3, this.b, a.c, viz.a.g(str3));
    }
}
