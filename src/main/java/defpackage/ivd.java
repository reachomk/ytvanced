package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ivd */
public final class ivd implements akox {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final akvo d;
    private final gal e;
    private final hmc f;
    private final fas g;

    public ivd(Context context, akkq akkq, aaas aaas, gal gal, akvo akvo, hmc hmc, fas fas) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = akvo;
        this.e = gal;
        this.f = hmc;
        this.g = fas;
    }

    /* renamed from: b */
    public final iuw a(ViewGroup viewGroup) {
        Context context = this.a;
        return new iuw(context, this.b, new flu(context), this.c, this.d, this.e, this.f, this.g, viewGroup);
    }
}
