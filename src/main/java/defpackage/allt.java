package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: allt */
public final class allt implements akox {
    private final Context a;
    private final akvp b;
    private final aaas c;
    private final acvx d;

    public allt(Context context, akvp akvp, aaas aaas, acvx acvx) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akvp) amqw.a((Object) akvp);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (acvx) amqw.a((Object) acvx);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new allr(this.a, viewGroup, this.b, this.c, this.d);
    }
}
