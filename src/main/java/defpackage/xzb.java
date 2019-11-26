package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: xzb */
public class xzb extends apv {
    public boolean a;
    private final xxp b;
    private final ans c;

    public xzb(xxp xxp, ans ans) {
        this.b = (xxp) amqw.a((Object) xxp);
        this.c = (ans) amqw.a((Object) ans);
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (!this.a && this.c.p() <= 0) {
            this.b.a(ajti.NEXT);
        }
    }
}
