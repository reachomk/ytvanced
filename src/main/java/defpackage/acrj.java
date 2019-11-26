package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: acrj */
public final class acrj implements akox {
    public akvq a;
    public akvr b;
    private final Context c;
    private final aaas d;
    private final akvp e;

    public acrj(Context context, aaas aaas, akvp akvp) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (akvp) amqw.a((Object) akvp);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        amqw.a(this.b);
        amqw.a(this.a);
        return new acrk(this.c, this.d, this.e, this.b, this.a);
    }
}
