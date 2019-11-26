package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: uxx */
public final class uxx implements akox {
    private final Context a;
    private final uyd b;

    public uxx(Context context, uyd uyd) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (uyd) amqw.a((Object) uyd);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new uxv(this.a, this.b);
    }
}
