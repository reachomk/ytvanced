package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ahxr */
final /* synthetic */ class ahxr implements OnClickListener {
    private final ahxo a;

    ahxr(ahxo ahxo) {
        this.a = ahxo;
    }

    public final void onClick(View view) {
        ahxo ahxo = this.a;
        ahxs ahxs = ahxo.aa;
        if (ahxs != null) {
            ahxu ahxu = ahxs.b;
            nn nnVar = ahxs.d;
            if (!(ahxu.F_() || ahxu.v())) {
                ahxu.aa = ahxs;
                ahxu.a(nnVar.f(), ahxu.Z);
            }
        }
        ahxo.dismiss();
    }
}
