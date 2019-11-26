package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: drd */
public final class drd implements akox {
    private final Context a;
    private final uyd b;

    public drd(Context context, uyd uyd) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (uyd) amqw.a((Object) uyd);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new drb(this.a, this.b);
    }
}
