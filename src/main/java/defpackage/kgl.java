package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kgl */
final class kgl implements OnClickListener {
    private final /* synthetic */ kgi a;

    kgl(kgi kgi) {
        this.a = kgi;
    }

    public final void onClick(View view) {
        kgi kgi = this.a;
        hal hal = kgi.b;
        if (hal != null) {
            apxu apxu = hal.a.b;
            if (apxu != null) {
                kgi.a.a(apxu, null);
            }
        }
    }
}
