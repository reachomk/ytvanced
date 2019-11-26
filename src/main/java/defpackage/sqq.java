package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: sqq */
public final class sqq implements sxm {
    public static final WeakHashMap a = new WeakHashMap();
    public final swf b;
    public final bbma c;
    private final amqp d;
    private final boolean e;

    public sqq(swf swf, swi swi, amqp amqp, amqp amqp2) {
        this.b = swf;
        this.c = swi;
        this.d = amqp;
        this.e = ((Boolean) amqp2.a(Boolean.valueOf(false))).booleanValue();
    }

    /* Access modifiers changed, original: final */
    public final swg a(View view, syj syj, swn swn) {
        return a(view, null, syj, swn);
    }

    /* Access modifiers changed, original: final */
    public final swg a(View view, View view2, syj syj, swn swn) {
        skk g = skh.g();
        if (view != null) {
            g.a(view);
        }
        if (view2 != null) {
            g.b(view2);
        }
        if (syj != null) {
            g.a(syj);
        }
        if (this.d.a()) {
            Object a = ((swe) this.d.b()).a(swn);
            if (a != null) {
                g.a(a);
            }
        }
        g.a(swn);
        return g.a();
    }

    public final aobz a() {
        return bdgn.a;
    }
}
