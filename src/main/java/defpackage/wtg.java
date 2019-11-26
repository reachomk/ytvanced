package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: wtg */
public final class wtg implements akox {
    private final Context a;
    private final aaas b;

    public wtg(Context context, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new wtf(this.a, viewGroup, this.b);
    }
}
