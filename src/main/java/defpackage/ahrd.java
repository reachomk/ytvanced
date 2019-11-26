package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* renamed from: ahrd */
public final class ahrd {
    private final ViewGroup a;
    private final Context b;
    private final Handler c;
    private final bcaa d;

    public ahrd(ViewGroup viewGroup, Context context, Handler handler, bcaa bcaa) {
        this.a = (ViewGroup) amqw.a((Object) viewGroup);
        this.b = (Context) amqw.a((Object) context);
        this.c = (Handler) amqw.a((Object) handler);
        this.d = (bcaa) amqw.a((Object) bcaa);
    }

    public final ahqt a(ahpn ahpn, float f, float f2) {
        return new ahqt(this.a, this.b, this.c, this.d, ahpn, f, f2);
    }
}
