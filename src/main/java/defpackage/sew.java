package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.deepauth.ConsentActivity;

/* renamed from: sew */
public final class sew implements OnClickListener {
    private final /* synthetic */ ConsentActivity a;

    public final void onClick(View view) {
        this.a.i.a(view, ConsentActivity.g, aodi.EVENT_PROVIDER_CONSENT_LINK);
        this.a.h.a();
    }

    public /* synthetic */ sew(ConsentActivity consentActivity) {
        this.a = consentActivity;
    }
}
