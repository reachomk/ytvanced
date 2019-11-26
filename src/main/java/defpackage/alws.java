package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alws */
public final class alws {
    public final Object a = new Object();
    public final Map b;
    public boolean c;
    private final Context d;
    private final bcaa e;

    public alws(Context context, bcaa bcaa) {
        this.d = context;
        this.e = bcaa;
        this.b = new HashMap();
    }

    public final void a(aycm aycm, boolean z, boolean z2) {
        if (z) {
            ((alwv) this.e.get()).a((aycn) ((anxl) aycm.build()), true);
            return;
        }
        int z22;
        synchronized (this.a) {
            for (alvy alvy : this.b.values()) {
                if (alvy.a()) {
                    z22 |= alvy.a(this.d, aycm);
                }
            }
        }
        if (z22 != 0) {
            ((alwv) this.e.get()).a((aycn) ((anxl) aycm.build()), false);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, int i) {
        if (this.c) {
            alxs alxs = new alxs(str, i);
            txd a = txd.a();
            a.a.a(alxs.toString());
            return;
        }
        a(i);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        aycm aycm = (aycm) aycn.i.createBuilder();
        if (i != 0) {
            aycm.a(i);
        }
        a(aycm, false, false);
    }
}
