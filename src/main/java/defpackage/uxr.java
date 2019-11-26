package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: uxr */
public final class uxr implements akox {
    private final Context a;
    private final int b;
    private final acvx c;

    public uxr(Context context, int i, acvx acvx) {
        this.a = (Context) amqw.a((Object) context);
        this.b = i;
        this.c = (acvx) amqw.a((Object) acvx);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new uxo(this.a, this.b, this.c);
    }
}
