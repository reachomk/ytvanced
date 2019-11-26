package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: err */
final /* synthetic */ class err implements OnClickListener {
    private final erq a;
    private final eru b;

    err(erq erq, eru eru) {
        this.a = erq;
        this.b = eru;
    }

    public final void onClick(View view) {
        erq erq = this.a;
        eru eru = this.b;
        aaas aaas = erq.a;
        apxu apxu = eru.a.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
