package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: keb */
final /* synthetic */ class keb implements OnClickListener {
    private final kdw a;
    private final ayam b;

    keb(kdw kdw, ayam ayam) {
        this.a = kdw;
        this.b = ayam;
    }

    public final void onClick(View view) {
        kdw kdw = this.a;
        ayam ayam = this.b;
        aaas aaas = kdw.a;
        apxu apxu = ayam.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, kdw.e);
    }
}
