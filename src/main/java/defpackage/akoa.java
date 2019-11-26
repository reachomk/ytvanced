package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Space;

/* renamed from: akoa */
public final class akoa implements akot {
    private final Context a;
    private final aaas b;
    private View c;

    public akoa(Context context, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = aaas;
    }

    public final void a(akpb akpb) {
    }

    /* renamed from: a */
    public final void a_(akor akor, aqqg aqqg) {
        akor.a.a(aqqg.b.d(), null);
        aabd.a(this.b, aqqg.c, (Object) aqqg);
    }

    public final View K_() {
        if (this.c == null) {
            this.c = new Space(this.a);
        }
        return this.c;
    }
}
