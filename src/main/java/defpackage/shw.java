package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: shw */
final /* synthetic */ class shw implements OnClickListener {
    private final shr a;

    shw(shr shr) {
        this.a = shr;
    }

    public final void onClick(View view) {
        shr shr = this.a;
        shr.k.a(view, shr.g, aodi.EVENT_PROVIDER_CONSENT_CANCEL);
        shr.setResult(0);
        shr.finish();
    }
}
