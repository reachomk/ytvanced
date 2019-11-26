package defpackage;

import android.database.DataSetObserver;

/* renamed from: aksm */
final class aksm extends DataSetObserver {
    private final /* synthetic */ aksi a;

    aksm(aksi aksi) {
        this.a = aksi;
    }

    public final void onChanged() {
        aksi aksi = this.a;
        aksi.c.a(aksi, aksi.f.a());
    }
}
