package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zvo */
final class zvo implements OnClickListener {
    private final /* synthetic */ zvi a;

    zvo(zvi zvi) {
        this.a = zvi;
    }

    public final void onClick(View view) {
        zwj zwj = this.a.d;
        if (zwj != null) {
            zwj.c();
            this.a.d.g();
        }
    }
}
