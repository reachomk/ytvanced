package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: alnu */
public final class alnu implements akox {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final akvp d;
    private final alnx e;

    public alnu(Context context, akkq akkq, aaas aaas, akvp akvp, alnx alnx) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (akvp) amqw.a((Object) akvp);
        this.e = (alnx) amqw.a((Object) alnx);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new alnt(this.a, this.b, this.c, this.d, this.e);
    }
}
