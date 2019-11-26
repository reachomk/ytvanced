package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abtb */
final /* synthetic */ class abtb implements OnClickListener {
    private final absy a;
    private final audt b;

    abtb(absy absy, audt audt) {
        this.a = absy;
        this.b = audt;
    }

    public final void onClick(View view) {
        absy absy = this.a;
        audt audt = this.b;
        aaas aaas = absy.a;
        apxu apxu = audt.n;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
