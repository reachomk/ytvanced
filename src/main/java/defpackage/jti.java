package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jti */
final /* synthetic */ class jti implements OnClickListener {
    private final jtj a;
    private final axyo b;

    jti(jtj jtj, axyo axyo) {
        this.a = jtj;
        this.b = axyo;
    }

    public final void onClick(View view) {
        apxu apxu;
        jtj jtj = this.a;
        axyo axyo = this.b;
        aaas aaas = jtj.a;
        if ((axyo.a & 32) != 0) {
            apxu = axyo.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        aaas.a(apxu, null);
    }
}
