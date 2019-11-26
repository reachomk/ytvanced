package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: itu */
final class itu implements OnClickListener {
    private final /* synthetic */ itv a;

    itu(itv itv) {
        this.a = itv;
    }

    public final void onClick(View view) {
        itv itv = this.a;
        ards ards = itv.b;
        if (ards != null && (ards.a & 8) != 0) {
            ardr ardr = (ardr) ((anxo) ards.toBuilder());
            itv itv2 = this.a;
            acvx acvx = itv2.c.a;
            apxu apxu = itv2.b.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            apxu = acvx.a(apxu);
            ardr.copyOnWrite();
            ards ards2 = (ards) ardr.instance;
            if (apxu != null) {
                ards2.e = apxu;
                ards2.a |= 8;
                itv.b = (ards) ((anxl) ardr.build());
                itv = this.a;
                aaas aaas = itv.a;
                apxu apxu2 = itv.b.e;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, null);
                return;
            }
            throw new NullPointerException();
        }
    }
}
