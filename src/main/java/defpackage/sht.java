package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: sht */
final /* synthetic */ class sht implements OnClickListener {
    private final shr a;

    sht(shr shr) {
        this.a = shr;
    }

    public final void onClick(View view) {
        shr shr = this.a;
        shr.k.a(view, shr.g, aodi.EVENT_PROVIDER_CONSENT_LINK);
        shr.j.a();
    }
}
