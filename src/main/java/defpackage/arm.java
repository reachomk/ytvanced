package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* renamed from: arm */
public abstract class arm extends apt {
    public RecyclerView a;
    public Scroller b;
    private final apv c = new arp(this);

    public abstract int a(apn apn, int i, int i2);

    public abstract View a(apn apn);

    public abstract int[] a(apn apn, View view);

    public final boolean a(int i, int i2) {
        RecyclerView recyclerView = this.a;
        apn apn = recyclerView.n;
        if (!(apn == null || recyclerView.m == null)) {
            int i3 = recyclerView.G;
            if ((Math.abs(i2) > i3 || Math.abs(i) > i3) && (apn instanceof aqe)) {
                aqc b = b(apn);
                if (b != null) {
                    i = a(apn, i, i2);
                    if (i != -1) {
                        b.b = i;
                        apn.a(b);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b(this.c);
                this.a.F = null;
            }
            this.a = recyclerView;
            recyclerView = this.a;
            if (recyclerView != null) {
                if (recyclerView.F == null) {
                    recyclerView.a(this.c);
                    recyclerView = this.a;
                    recyclerView.F = this;
                    this.b = new Scroller(recyclerView.getContext(), new DecelerateInterpolator());
                    a();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            apn apn = recyclerView.n;
            if (apn != null) {
                View a = a(apn);
                if (a != null) {
                    int[] a2 = a(apn, a);
                    int i = a2[0];
                    if (i != 0 || a2[1] != 0) {
                        this.a.a(i, a2[1]);
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    @Deprecated
    public any b(apn apn) {
        return apn instanceof aqe ? new aro(this, this.a.getContext()) : null;
    }
}
