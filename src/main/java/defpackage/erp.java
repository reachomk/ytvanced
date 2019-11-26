package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: erp */
final /* synthetic */ class erp implements OnClickListener {
    private final erq a;
    private final auwd b;

    erp(erq erq, auwd auwd) {
        this.a = erq;
        this.b = auwd;
    }

    public final void onClick(View view) {
        erq erq = this.a;
        Object obj = this.b;
        aaas aaas = erq.a;
        apxu apxu = obj.i;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, acwi.a(obj));
    }
}
