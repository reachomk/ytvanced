package defpackage;

import android.content.Context;

/* renamed from: tey */
public abstract class tey implements teq {
    public final Context a;
    public final ptf b;
    public final tfy c;

    public tey(Context context) {
        tfy tfy = new tfy();
        this.a = context;
        this.b = new ptf(context);
        this.c = tfy;
    }

    public final teq a(tep tep, teo teo) {
        this.b.a(tfy.a(tep), teo instanceof tfh ? ((tfh) teo).a() : null);
        return this;
    }

    public final teq a(tep tep) {
        this.b.a(tfy.a(tep));
        return this;
    }

    public final teq a(tes tes) {
        pth pth;
        ptf ptf = this.b;
        tfy tfy = this.c;
        synchronized (tfy.a) {
            if (tfy.b.containsKey(tes)) {
                pth = (pth) tfy.b.get(tes);
            } else {
                tfi tfi = new tfi(tfy, tes);
                tfy.b.put(tes, tfi);
                pth = tfi;
            }
        }
        ptf.a(pth);
        return this;
    }
}
