package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: iis */
public final class iis implements akox {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final acvx d;
    private final est e;
    private final eur f;
    private final boolean g;

    public iis(Context context, acvx acvx, akkq akkq, aaas aaas, est est, eur eur, zyw zyw) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = acvx;
        this.e = est;
        this.f = eur;
        this.g = foh.d(zyw);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new iiq(this.a, viewGroup, this.d, this.b, this.c, this.e, this.f, this.g);
    }
}
