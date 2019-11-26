package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: adfr */
final /* synthetic */ class adfr implements OnClickListener {
    private final adfo a;

    adfr(adfo adfo) {
        this.a = adfo;
    }

    public final void onClick(View view) {
        adfo adfo = this.a;
        if (adfo.V.a()) {
            ((adgw) adfo.W.get()).f();
        }
        adfo.dismiss();
    }
}
