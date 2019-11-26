package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* renamed from: acrr */
public final class acrr implements akox {
    private final Context a;
    private final akkq b;
    private final akvp c;
    private final abzv d;
    private final aaas e;
    private final Executor f;
    private final acrt g;

    public acrr(Context context, akkq akkq, akvp akvp, abzv abzv, aaas aaas, Executor executor, acrt acrt) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (akvp) amqw.a((Object) akvp);
        this.d = (abzv) amqw.a((Object) abzv);
        this.e = (aaas) amqw.a((Object) aaas);
        this.f = (Executor) amqw.a((Object) executor);
        this.g = (acrt) amqw.a((Object) acrt);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new acrn(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
