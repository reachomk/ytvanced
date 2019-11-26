package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: hmg */
public final class hmg implements akox {
    private final Context a;
    private final akkl b;
    private final xci c;
    private final agvx d;
    private final xhv e;
    private final agvs f;
    private final eqf g;
    private final aaas h;

    public hmg(Context context, akkl akkl, xci xci, agvx agvx, xhv xhv, agvs agvs, eqf eqf, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkl) amqw.a((Object) akkl);
        this.c = (xci) amqw.a((Object) xci);
        this.d = (agvx) amqw.a((Object) agvx);
        this.e = (xhv) amqw.a((Object) xhv);
        this.f = (agvs) amqw.a((Object) agvs);
        this.g = (eqf) amqw.a((Object) eqf);
        this.h = (aaas) amqw.a((Object) aaas);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        Context context = this.a;
        hmf hmf = new hmf(context, new flu(context), this.b, this.d, this.e, this.f, this.g, this.h);
        this.c.a((Object) hmf);
        return hmf;
    }
}
