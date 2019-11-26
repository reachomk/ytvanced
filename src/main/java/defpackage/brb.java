package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* renamed from: brb */
public final class brb extends ContextWrapper {
    public static final brp a = new bqv();
    public final bwb b;
    public final brd c;
    public final cgn d;
    public final List e;
    public final Map f;
    public final buv g;
    public final boolean h = false;
    public final int i;
    private final bqx j;
    private cgg k;

    public brb(Context context, bwb bwb, brd brd, cgn cgn, bqx bqx, Map map, List list, buv buv, int i) {
        super(context.getApplicationContext());
        this.b = bwb;
        this.c = brd;
        this.d = cgn;
        this.j = bqx;
        this.e = list;
        this.f = map;
        this.g = buv;
        this.i = i;
    }

    public final synchronized cgg a() {
        if (this.k == null) {
            this.k = (cgg) this.j.a().j();
        }
        return this.k;
    }
}
