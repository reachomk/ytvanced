package defpackage;

import android.content.Context;

/* renamed from: akrx */
public final class akrx implements afsw {
    public amqp a = ampo.a;
    public Object b = this;
    private final Context c;
    private final aaas d;
    private final xoi e;
    private final bcaa f;

    public akrx(Context context, aaas aaas, xoi xoi, bcaa bcaa) {
        this.c = context;
        this.d = aaas;
        this.e = xoi;
        this.f = bcaa;
    }

    public final void a(bqn bqn) {
        this.e.c(bqn);
    }

    public final void a(asop asop) {
        if (asop != null) {
            atze atze;
            aril aril;
            asov asov = asop.e;
            if (asov == null) {
                asov = asov.c;
            }
            if (asov.a != 171313147) {
                atze = null;
            } else {
                asov = asop.e;
                if (asov == null) {
                    asov = asov.c;
                }
                if (asov.a == 171313147) {
                    atze = (atze) asov.b;
                } else {
                    atze = atze.q;
                }
            }
            if (atze != null) {
                ((akse) this.f.get()).a(atze, this.a, this.b);
            }
            asov = asop.e;
            if (asov == null) {
                asov = asov.c;
            }
            if (asov.a != 85374086) {
                aril = null;
            } else {
                asov = asop.e;
                if (asov == null) {
                    asov = asov.c;
                }
                if (asov.a == 85374086) {
                    aril = (aril) asov.b;
                } else {
                    aril = aril.g;
                }
            }
            if (aril != null) {
                akcr.a(this.c, aril, this.d, this.b);
            }
            if (asop.f.size() > 0) {
                this.d.a(asop.f, null);
            }
        }
    }
}
