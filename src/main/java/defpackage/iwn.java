package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iwn */
final class iwn implements OnClickListener {
    private final /* synthetic */ azhk a;
    private final /* synthetic */ iwg b;

    iwn(iwg iwg, azhk azhk) {
        this.b = iwg;
        this.a = azhk;
    }

    public final void onClick(View view) {
        azhk azhk = this.a;
        if ((azhk.a & 8) != 0) {
            aaas aaas = this.b.a;
            apxu apxu = azhk.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
