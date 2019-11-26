package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abvs */
final /* synthetic */ class abvs implements OnClickListener {
    private final abvm a;
    private final abrc b;
    private final acvs c;

    abvs(abvm abvm, abrc abrc, acvs acvs) {
        this.a = abvm;
        this.b = abrc;
        this.c = acvs;
    }

    public final void onClick(View view) {
        abvm abvm = this.a;
        abrc abrc = this.b;
        acxf acxf = this.c;
        xpr.a(abvm.e());
        if (abvm.a instanceof nn) {
            abvm.e.c = abvm.q();
            abrk abrk = abvm.o;
            if (abrk != null) {
                abrk.a();
            }
            abrl abrl = abvm.i;
            if (abrl != null) {
                abrl.b();
            }
            absj.a(null, abrc).a(((nn) abvm.a).f(), "purchase_dialog_fragment");
        }
        abvm.k.b();
        abvm.b.a(3, acxf, null);
    }
}
