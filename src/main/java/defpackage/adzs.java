package defpackage;

import android.webkit.JavascriptInterface;

/* renamed from: adzs */
final class adzs {
    private final /* synthetic */ adzr a;

    adzs(adzr adzr) {
        this.a = adzr;
    }

    @JavascriptInterface
    public final void consentFlowCompleted(boolean z) {
        acwc acwc;
        if (z) {
            acwc = acwc.MDX_TV_SIGN_IN_PERMISSIONS_ALLOW_BUTTON;
        } else {
            acwc = acwc.MDX_TV_SIGN_IN_PERMISSIONS_DENY_BUTTON;
        }
        this.a.h.a(3, new acvs(acwc), null);
        String str = !z ? "denied" : "completed";
        adzr adzr = this.a;
        adzr.f.a(adzr.i, str);
        this.a.e.a(z);
    }
}
