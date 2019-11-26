package defpackage;

import android.app.Activity;
import android.util.Pair;

/* renamed from: fni */
public final class fni extends wsa {
    public final exu a;
    public lci b;
    public final exw c = new fnl(this);
    private final Activity g;
    private final fga h;

    public fni(Activity activity, akpe akpe, akpb akpb, exu exu, fga fga) {
        super(activity, akpe, akpb);
        this.g = activity;
        this.a = exu;
        this.h = fga;
    }

    public final void a(Object obj, Pair pair) {
        lci lci = this.b;
        if (lci != null) {
            lci.g();
        }
        this.h.a(3);
        super.a(obj, pair);
        fpl.a(this.g, false);
    }

    public final void a() {
        super.a();
        fpl.a(this.g, true);
        this.h.b(3);
    }
}
