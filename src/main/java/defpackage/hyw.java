package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: hyw */
public final class hyw implements akox {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final boolean d;

    public hyw(Context context, akkq akkq, aaas aaas, boolean z) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = z;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new hyu(this.a, viewGroup, this.b, this.c, this.d);
    }
}
