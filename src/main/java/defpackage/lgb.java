package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lgb */
public final class lgb implements lgg, lgm {
    private final bcaa b;
    private final Set c = new CopyOnWriteArraySet();
    private lge d = new lge();
    private ajcp e;

    public lgb(bcaa bcaa) {
        this.b = bcaa;
    }

    public final void a(lgj lgj) {
        this.c.add(lgj);
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            lge lge = (lge) bundle.getParcelable("watch_history_list_iterator");
            if (lge == null) {
                this.e = null;
            } else {
                this.d = lge;
                this.e = (ajcp) bundle.getParcelable("playback_service_state");
            }
        }
    }

    public final void a(lgo lgo) {
        aiqq g = g();
        if (g != null) {
            g.a(true);
            ((huj) lgo).a.a(g, this.e, null);
            this.e = null;
        }
    }

    public final void a(boolean z) {
        if (g() != null) {
            ajcp a = lgp.a((aizy) this.b.get(), z);
            if (!a(a)) {
                a = null;
            }
            this.e = a;
        }
    }

    public final void b(Bundle bundle) {
        amqw.a((Object) bundle);
        bundle.putParcelable("watch_history_list_iterator", this.d);
        bundle.putParcelable("playback_service_state", a ? this.e : null);
    }

    public final boolean a() {
        return this.d.hasPrevious();
    }

    public final void b() {
        h();
        aiqq aiqq = (aiqq) this.d.previous();
        for (lgj a : this.c) {
            a.a(aiqq);
        }
    }

    public final boolean c() {
        return this.d.hasNext();
    }

    public final void d() {
        h();
        aiqq aiqq = (aiqq) this.d.next();
        for (lgj b : this.c) {
            b.b(aiqq);
        }
    }

    public final void a(aiqq aiqq, boolean z) {
        String c = aiqq.c();
        aiqq g = g();
        CharSequence c2 = g != null ? g.c() : null;
        if (TextUtils.isEmpty(c) || !TextUtils.equals(c, c2)) {
            if (z) {
                e();
            } else {
                h();
                this.d.d();
            }
            lge lge = this.d;
            amqw.a((Object) aiqq);
            if (!lge.a()) {
                lge.a.offerFirst(lge.c);
            }
            lge.c = aiqq;
        }
    }

    public final void e() {
        this.d.b();
    }

    public final void f() {
        this.d.c();
        this.d.d();
    }

    private final aiqq g() {
        return !this.d.a() ? (aiqq) this.d.c : null;
    }

    private final void h() {
        a(null);
    }

    private final boolean a(ajcp ajcp) {
        aiqq g = g();
        if (g != null) {
            aizy aizy = (aizy) this.b.get();
            if (aizy.b(g)) {
                lgp.a(g, aizy);
                return true;
            }
            String c = g.c();
            if (!(ajcp == null || TextUtils.isEmpty(c) || !TextUtils.equals(c, aizy.m()))) {
                aiqq aiqq = ajcp.a;
                if (aiqq != null) {
                    this.d.set(aiqq);
                    if (aizy.b(aiqq)) {
                        lgp.a(aiqq, aizy);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
