package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wct */
final /* synthetic */ class wct implements OnClickListener {
    private final wcu a;
    private final ajri b;

    wct(wcu wcu, ajri ajri) {
        this.a = wcu;
        this.b = ajri;
    }

    public final void onClick(View view) {
        wcu wcu = this.a;
        ajri ajri = this.b;
        aaas aaas = wcu.a;
        aphg aphg = ajri.d.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
