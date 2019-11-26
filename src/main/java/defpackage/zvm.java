package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: zvm */
final class zvm extends apv {
    private final /* synthetic */ zvi a;

    zvm(zvi zvi) {
        this.a = zvi;
    }

    public final void a(RecyclerView recyclerView, int i) {
        zwj zwj = this.a.d;
        if (zwj != null) {
            zwj.d();
            if (i == 0) {
                zvi zvi = this.a;
                zwj zwj2 = zvi.d;
                ans ans = zvi.f;
                zwj2.a(ans != null ? ans.q() : -1);
            }
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        zwj zwj = this.a.d;
        if (zwj != null) {
            zwj.d();
        }
    }
}
