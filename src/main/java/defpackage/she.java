package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.accountcreation.ui.BbbConsentActivity;

/* renamed from: she */
public final class she implements OnClickListener {
    private final /* synthetic */ BbbConsentActivity a;

    public final void onClick(View view) {
        this.a.i.a(view, BbbConsentActivity.g, aodi.EVENT_PROVIDER_CONSENT_LINK);
        this.a.h.a();
    }

    public /* synthetic */ she(BbbConsentActivity bbbConsentActivity) {
        this.a = bbbConsentActivity;
    }
}
