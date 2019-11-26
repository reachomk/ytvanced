package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jte */
final /* synthetic */ class jte implements OnClickListener {
    private final jtf a;
    private final axyj b;

    jte(jtf jtf, axyj axyj) {
        this.a = jtf;
        this.b = axyj;
    }

    public final void onClick(View view) {
        apxu apxu;
        jtf jtf = this.a;
        axyj axyj = this.b;
        aaas aaas = jtf.a;
        if ((axyj.a & 128) == 0) {
            apxu = null;
        } else {
            apxu = axyj.i;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        aaas.a(apxu, null);
    }
}
