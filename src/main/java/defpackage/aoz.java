package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aoz */
public final class aoz implements asw {
    private final /* synthetic */ RecyclerView a;

    public aoz(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(aqj aqj, api api, api api2) {
        this.a.e.b(aqj);
        RecyclerView recyclerView = this.a;
        recyclerView.a(aqj);
        aqj.a(false);
        if (recyclerView.D.a(aqj, api, api2)) {
            recyclerView.o();
        }
    }

    public final void b(aqj aqj, api api, api api2) {
        RecyclerView recyclerView = this.a;
        aqj.a(false);
        if (recyclerView.D.b(aqj, api, api2)) {
            recyclerView.o();
        }
    }

    public final void c(aqj aqj, api api, api api2) {
        aqj.a(false);
        RecyclerView recyclerView = this.a;
        if (recyclerView.x) {
            if (recyclerView.D.a(aqj, aqj, api, api2)) {
                this.a.o();
            }
        } else if (recyclerView.D.c(aqj, api, api2)) {
            this.a.o();
        }
    }

    public final void a(aqj aqj) {
        RecyclerView recyclerView = this.a;
        apn apn = recyclerView.n;
        View view = aqj.a;
        apw apw = recyclerView.e;
        amc amc = apn.i;
        int a = amc.a.a(view);
        if (a >= 0) {
            if (amc.b.d(a)) {
                amc.b(view);
            }
            amc.a.a(a);
        }
        apw.a(view);
    }
}
