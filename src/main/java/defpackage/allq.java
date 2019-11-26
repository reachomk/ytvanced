package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: allq */
final class allq implements OnClickListener {
    private final /* synthetic */ aykj a;
    private final /* synthetic */ allr b;

    allq(allr allr, aykj aykj) {
        this.b = allr;
        this.a = aykj;
    }

    public final void onClick(View view) {
        aykj aykj = this.a;
        if ((aykj.a & 4) != 0) {
            aaas aaas = this.b.a;
            apxu apxu = aykj.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
