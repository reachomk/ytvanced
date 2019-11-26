package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: almf */
public final class almf implements akox {
    private final Context a;
    private final alme b;
    private final allh c;
    private final acvx d;

    public almf(Context context, alme alme, allh allh, acvx acvx) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (alme) amqw.a((Object) alme);
        this.c = (allh) amqw.a((Object) allh);
        this.d = (acvx) amqw.a((Object) acvx);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new almd(this.a, viewGroup, this.b, this.c, this.d);
    }
}
