package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ivw */
public final class ivw implements akox {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final gal d;
    private final akvp e;

    public ivw(Context context, akkq akkq, aaas aaas, gal gal, akvp akvp) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (gal) amqw.a((Object) gal);
        this.e = (akvp) amqw.a((Object) akvp);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new ivu(this.a, this.b, this.c, this.d, viewGroup, this.e);
    }
}
