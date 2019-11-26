package defpackage;

/* renamed from: agum */
public final class agum implements aguh {
    private final zzl a;
    private final bcaa b;
    private final bcaa c;

    public agum(zzl zzl, bcaa bcaa, bcaa bcaa2) {
        this.a = zzl;
        this.b = bcaa;
        this.c = bcaa2;
    }

    public final int a(String str, agvz agvz) {
        avoa avoa = this.a.b().h;
        if (avoa == null) {
            avoa = avoa.w;
        }
        if (avoa.e) {
            return ((aguj) this.c.get()).a(str, agvz);
        }
        return ((agug) this.b.get()).a(str, agvz);
    }

    public final int b(String str, agvz agvz) {
        avoa avoa = this.a.b().h;
        if (avoa == null) {
            avoa = avoa.w;
        }
        if (avoa.e) {
            return ((aguj) this.c.get()).b(str, agvz);
        }
        return ((agug) this.b.get()).b(str, agvz);
    }
}
