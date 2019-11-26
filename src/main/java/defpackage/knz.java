package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: knz */
public final class knz implements akox {
    private final Context a;
    private final kny b;

    public knz(Context context, kny kny) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (kny) amqw.a((Object) kny);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new knx(this.a, this.b);
    }
}
