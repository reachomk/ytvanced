package defpackage;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: aikq */
public final class aikq implements aikd {
    public final bcaa a;
    public WeakReference b;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());

    aikq(bcaa bcaa) {
        this.a = (bcaa) amqw.a((Object) bcaa);
    }

    public final Object a() {
        Object obj = new Object();
        this.c.add(obj);
        return obj;
    }

    public final void b(Object obj) {
        amqw.a(obj);
        this.c.remove(obj);
    }

    public final void a(aikr aikr, aiki aiki) {
        a(aikr, aiki, false);
    }

    public final void a(aikr aikr, aiki aiki, boolean z) {
        aizy aizy = (aizy) this.a.get();
        if (aikr == null) {
            if (aizy.q() != null) {
                aizy.i();
            }
            return;
        }
        aiqq e;
        if (aiki == null) {
            e = aikr.e();
        } else {
            e = aiki.a(aikr);
        }
        if (z) {
            aizy.h();
        } else if (aizy.b(e)) {
            return;
        }
        aizy.a(e);
    }

    public final /* synthetic */ void a(Object obj) {
        if (this.c.isEmpty()) {
            a(obj, new aikp(this));
        }
    }
}
