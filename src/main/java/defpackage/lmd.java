package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: lmd */
public final class lmd extends aoq {
    private final RecyclerView c;

    public lmd(RecyclerView recyclerView) {
        this.c = recyclerView;
        ffs ffs = new ffs("SWPS");
    }

    public final int[] a(apn apn, View view) {
        this.c.a(view);
        apn.c(view);
        Object[] objArr = new Object[]{"view=", view};
        return llr.a(this.c, view);
    }

    public final View a(apn apn) {
        View a = super.a(apn);
        if (a != null) {
            this.c.a(a);
        }
        if (a != null) {
            apn.c(a);
        }
        return a;
    }

    /* Access modifiers changed, original: protected|final */
    public final any b(apn apn) {
        RecyclerView recyclerView = this.c;
        return new lme("SLPSS", recyclerView, recyclerView);
    }
}
