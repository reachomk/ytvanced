package defpackage;

import android.database.DataSetObserver;

/* renamed from: avj */
final class avj extends DataSetObserver {
    private final /* synthetic */ avh a;

    avj(avh avh) {
        this.a = avh;
    }

    public final void onChanged() {
        avh avh = this.a;
        avh.b = true;
        avh.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        avh avh = this.a;
        avh.b = false;
        avh.notifyDataSetInvalidated();
    }
}
