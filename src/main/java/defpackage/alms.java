package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: alms */
public final class alms implements akox {
    private final Context a;
    private final akkq b;
    private final almv c;

    public alms(Context context, akkq akkq, almv almv) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (almv) amqw.a((Object) almv);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new almr(this.a, this.b, this.c);
    }
}
