package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iwk */
final class iwk implements OnClickListener {
    private final /* synthetic */ aziu a;
    private final /* synthetic */ iwg b;

    iwk(iwg iwg, aziu aziu) {
        this.b = iwg;
        this.a = aziu;
    }

    public final void onClick(View view) {
        aziu aziu = this.a;
        if ((aziu.a & 16) != 0) {
            aaas aaas = this.b.a;
            apxu apxu = aziu.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
