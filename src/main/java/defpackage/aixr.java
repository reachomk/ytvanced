package defpackage;

import android.text.TextUtils;

/* renamed from: aixr */
final class aixr implements aiye {
    private final /* synthetic */ aiye a;
    private final /* synthetic */ acxt b;
    private final /* synthetic */ aixn c;

    aixr(aixn aixn, aiye aiye, acxt acxt) {
        this.c = aixn;
        this.a = aiye;
        this.b = acxt;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(aakj aakj) {
        this.a.a(aakj);
        aixn aixn = this.c;
        aixn.a(aakj, aixn.k, this.b);
    }

    public final void a(ahjc ahjc) {
        this.a.a(ahjc);
    }

    public final void a(aafv aafv) {
        this.a.a(aafv);
        aixn aixn = this.c;
        aixn.m = aafv;
        if (aafv != null) {
            aiqq aiqq = aixn.k;
            if (aiqq != null) {
                aiqs s;
                if (TextUtils.isEmpty(aiqq.b())) {
                    s = aixn.k.s();
                    s.i = aafv.b;
                    aixn.k = s.b();
                }
                s = aiqq.a();
                s.a = aafv.c;
                aixn.j = s.b();
            } else {
                return;
            }
        }
        aixn.j = null;
        aixt aixt = aixn.f;
        if (aixt != null) {
            aixt.a(aafv);
        }
    }

    public final void b(ahjc ahjc) {
        this.a.b(ahjc);
    }

    public final void a(int i) {
        if (this.c.l == null) {
            boolean z = this.c.m != null;
            boolean z2 = this.c.n;
            boolean a = aixn.a(i);
            StringBuilder stringBuilder = new StringBuilder(171);
            stringBuilder.append("About to send VIDEO_WATCH_LOADED but do not have a currentPlayerResponse. WatchNext set: ");
            stringBuilder.append(z);
            stringBuilder.append(", initialShouldJoinWatchNextResponseOfSequence: ");
            stringBuilder.append(z2);
            stringBuilder.append(", requestPlayback: ");
            stringBuilder.append(a);
            xtl.c(stringBuilder.toString());
        } else {
            this.c.b(5);
        }
        this.a.a(i);
    }
}
