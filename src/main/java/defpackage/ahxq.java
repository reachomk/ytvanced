package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ahxq */
final /* synthetic */ class ahxq implements OnClickListener {
    private final ahxo a;

    ahxq(ahxo ahxo) {
        this.a = ahxo;
    }

    public final void onClick(View view) {
        ahxo ahxo = this.a;
        ahxs ahxs = ahxo.aa;
        if (ahxs != null) {
            ahxs.b();
        }
        ahxo.dismiss();
    }
}
