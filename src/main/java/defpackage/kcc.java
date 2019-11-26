package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kcc */
public final class kcc implements akox {
    private final Context a;
    private final akkq b;
    private final akvp c;
    private final aaas d;
    private final fmx e;

    public kcc(Context context, akkq akkq, akvp akvp, aaas aaas, fmx fmx) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (akvp) amqw.a((Object) akvp);
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (fmx) amqw.a((Object) fmx);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new kca(this.a, viewGroup, this.b, this.c, this.d, this.e);
    }
}
