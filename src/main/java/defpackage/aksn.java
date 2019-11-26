package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: aksn */
final /* synthetic */ class aksn implements OnClickListener {
    private final aksi a;

    aksn(aksi aksi) {
        this.a = aksi;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aksi aksi = this.a;
        aksi.c.a(aksi, aksi.f.a(), aksi.d.e.isChecked());
    }
}
