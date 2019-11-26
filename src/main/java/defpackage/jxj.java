package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jxj */
final class jxj implements OnClickListener {
    private final /* synthetic */ aziu a;
    private final /* synthetic */ jxe b;

    jxj(jxe jxe, aziu aziu) {
        this.b = jxe;
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
