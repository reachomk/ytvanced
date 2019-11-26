package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: eim */
final /* synthetic */ class eim implements OnClickListener {
    private final ein a;

    eim(ein ein) {
        this.a = ein;
    }

    public final void onClick(View view) {
        eir eir = this.a.a;
        if (eir != null) {
            eir.a();
        }
    }
}
