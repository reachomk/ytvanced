package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kdq */
final /* synthetic */ class kdq implements OnClickListener {
    private final kdr a;
    private final arye b;

    kdq(kdr kdr, arye arye) {
        this.a = kdr;
        this.b = arye;
    }

    public final void onClick(View view) {
        apxu apxu;
        kdr kdr = this.a;
        arye arye = this.b;
        aaas aaas = kdr.b;
        if ((arye.a & 16) != 0) {
            apxu = arye.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        aaas.a(apxu, null);
    }
}
