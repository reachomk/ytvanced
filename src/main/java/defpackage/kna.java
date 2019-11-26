package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kna */
final /* synthetic */ class kna implements OnClickListener {
    private final knb a;
    private final azdt b;

    kna(knb knb, azdt azdt) {
        this.a = knb;
        this.b = azdt;
    }

    public final void onClick(View view) {
        knb knb = this.a;
        azdt azdt = this.b;
        if (kmx.a(azdt) != null) {
            knb.c.c.a(kmx.a(azdt), null);
            return;
        }
        kmx kmx = knb.c;
        ham ham = kmx.n;
        if (ham != null) {
            apxu apxu = ham.a.b;
            if (apxu != null) {
                kmx.c.a(apxu, null);
            }
        }
    }
}
