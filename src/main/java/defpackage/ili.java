package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ili */
final /* synthetic */ class ili implements OnClickListener {
    private final ilf a;
    private final aaas b;
    private final iml c;

    ili(ilf ilf, aaas aaas, iml iml) {
        this.a = ilf;
        this.b = aaas;
        this.c = iml;
    }

    public final void onClick(View view) {
        ilf ilf = this.a;
        aaas aaas = this.b;
        iml iml = this.c;
        String str = null;
        if (ilf.b(ilf.h)) {
            aphg aphg = ilf.h.t.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        } else if (ilf.a(ilf.h)) {
            ajxx ajxx = ilf.h;
            String str2 = ajxx.a;
            arml arml = ajxx.b;
            if (arml != null) {
                str = ajqy.a(arml).toString();
            }
            iml.a(str2, str);
        }
    }
}
