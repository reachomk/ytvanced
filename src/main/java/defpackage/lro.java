package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: lro */
final class lro extends apv implements ejc, leq, lrm {
    public final len a;
    public final lrh b;
    public final eif c;
    public final RecyclerView d;
    private final int e;
    private final apn f;
    private final ltx g;
    private final ltn h;
    private final emd i;
    private final akwy j;
    private String k;

    lro(Context context, len len, lrh lrh, eif eif, ltx ltx, ltn ltn, emd emd, RecyclerView recyclerView, akwy akwy) {
        this.e = context.getResources().getDimensionPixelSize(R.dimen.autonav_scroll_cancel_padding);
        this.a = (len) amqw.a((Object) len);
        this.b = (lrh) amqw.a((Object) lrh);
        this.c = (eif) amqw.a((Object) eif);
        this.g = (ltx) amqw.a((Object) ltx);
        this.i = (emd) amqw.a((Object) emd);
        this.h = (ltn) amqw.a((Object) ltn);
        this.d = (RecyclerView) amqw.a((Object) recyclerView);
        this.f = (apn) amqw.a(recyclerView.n);
        this.j = (akwy) amqw.a((Object) akwy);
    }

    public final void a(leh leh, xqa xqa) {
        b();
    }

    public final void a(ejd ejd, ejd ejd2) {
        b();
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        b();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        String str = this.k;
        if (str != null) {
            this.i.a(str);
            this.k = null;
        }
    }

    private final void b() {
        int i = 0;
        int i2 = this.k == null ? 0 : 1;
        String b = this.a.b();
        Object obj = (b == null || !(this.a.a(b) instanceof lfk)) ? null : 1;
        if (lrh.a(this.b.b) && this.c.c() == ejd.WATCH_WHILE_MAXIMIZED) {
            View c = this.f.c(0);
            View c2 = this.f.c(1);
            akoh akoh = this.j.d;
            akpk akpk = this.h.a;
            if (akoh != null && akpk.d() > 0 && akoh.c(0) == akpk.c(0) && c2 != null) {
                c = c2;
            }
            if (c == null || c.getTop() < (-this.e) || (this.g.a(8) && obj == null)) {
                i = 1;
            }
        }
        if (i2 != i) {
            if (i == 0) {
                a();
                return;
            }
            this.k = this.i.b();
        }
    }

    public final void a(int i, int i2) {
        boolean b = lrh.b(i);
        boolean b2 = lrh.b(i2);
        if (!b && b2) {
            this.c.a(this);
        } else if (b && !b2) {
            this.c.b(this);
        }
    }
}
