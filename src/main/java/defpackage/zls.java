package defpackage;

import android.database.DataSetObserver;

/* renamed from: zls */
final class zls extends DataSetObserver {
    private final /* synthetic */ zld a;

    zls(zld zld) {
        this.a = zld;
    }

    public final void onChanged() {
        this.a.p();
    }
}
