package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fdt */
final /* synthetic */ class fdt implements OnClickListener {
    private final fdn a;
    private final fdl b;
    private final ayam c;

    fdt(fdn fdn, fdl fdl, ayam ayam) {
        this.a = fdn;
        this.b = fdl;
        this.c = ayam;
    }

    public final void onClick(View view) {
        fdn fdn = this.a;
        fdl fdl = this.b;
        ayam ayam = this.c;
        feb i = fdl.i();
        if (i != null) {
            apxu apxu = ayam.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            i.a(apxu);
        }
        fdn.a(1);
    }
}
