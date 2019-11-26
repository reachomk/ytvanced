package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ally */
public final class ally implements akox {
    private final Context a;
    private final aaas b;
    private final akpi c;
    private final acvx d;
    private final Runnable e;
    private final almb f;

    public ally(Context context, aaas aaas, akpi akpi, acvx acvx, Runnable runnable, almb almb) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (akpi) amqw.a((Object) akpi);
        this.d = (acvx) amqw.a((Object) acvx);
        this.e = (Runnable) amqw.a((Object) runnable);
        this.f = almb;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new allz(this.a, this.b, this.c, this.d, this.f, this.e);
    }
}
