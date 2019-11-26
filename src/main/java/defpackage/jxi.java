package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jxi */
final class jxi implements OnClickListener {
    private final /* synthetic */ azhk a;
    private final /* synthetic */ jxe b;

    jxi(jxe jxe, azhk azhk) {
        this.b = jxe;
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
