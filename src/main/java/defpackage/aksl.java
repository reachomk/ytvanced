package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: aksl */
final /* synthetic */ class aksl implements OnCheckedChangeListener {
    private final aksi a;

    aksl(aksi aksi) {
        this.a = aksi;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        aksi aksi = this.a;
        aksi.c.a(aksi, aksi.b.a(), z);
    }
}
