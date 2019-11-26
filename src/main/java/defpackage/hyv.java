package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: hyv */
public final class hyv implements akox {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final boolean d;

    public hyv(Context context, akkq akkq, aaas aaas, boolean z) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = z;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new hyt(this.a, viewGroup, this.b, this.c, this.d);
    }
}
