package defpackage;

import android.database.DataSetObserver;

/* renamed from: aoe */
final class aoe extends DataSetObserver {
    private final /* synthetic */ aoa a;

    aoe(aoa aoa) {
        this.a = aoa;
    }

    public final void onChanged() {
        if (this.a.e()) {
            this.a.f_();
        }
    }

    public final void onInvalidated() {
        this.a.d();
    }
}
