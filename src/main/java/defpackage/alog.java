package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: alog */
public final class alog implements akox {
    private final Context a;
    private final aloj b;
    private final akkq c;

    public alog(Context context, aloj aloj, akkq akkq) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aloj) amqw.a((Object) aloj);
        this.c = (akkq) amqw.a((Object) akkq);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new aloh(this.a, this.b, this.c);
    }
}
