package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kdc */
public final class kdc implements akox {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final akvo d;
    private final gal e;
    private final xsc f;
    private final jfw g;
    private final gsa h;
    private final hmc i;
    private final zzl j;
    private final fas k;

    public kdc(Context context, akkq akkq, aaas aaas, gal gal, akvo akvo, xsc xsc, jfw jfw, gsa gsa, hmc hmc, zzl zzl, fas fas) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = akvo;
        this.e = gal;
        this.f = xsc;
        this.g = jfw;
        this.h = gsa;
        this.i = hmc;
        this.j = zzl;
        this.k = fas;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        Context context = this.a;
        return new kda(context, this.b, new flu(context), this.c, this.d, this.e, this.f, viewGroup, this.g, this.h, this.i, this.j, this.k);
    }
}
