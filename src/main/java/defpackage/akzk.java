package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: akzk */
public final class akzk implements akxe {
    private final akei a;
    private final sxd b;
    private final acvx c;
    private final aket d;
    private final akhr e;
    private final syb f;

    public akzk(akei akei, sxd sxd, acvx acvx, aket aket, akhr akhr, syb syb) {
        this.a = akei;
        this.b = sxd;
        this.c = acvx;
        this.d = aket;
        this.e = akhr;
        this.f = syb;
    }

    public final akxf a(RecyclerView recyclerView, akpd akpd) {
        return new akzg(recyclerView, akpd, this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
