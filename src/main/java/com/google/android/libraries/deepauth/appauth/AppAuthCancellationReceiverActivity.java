package com.google.android.libraries.deepauth.appauth;

import android.app.Activity;
import android.os.Bundle;
import defpackage.aej;
import defpackage.aodi;
import defpackage.sfd;
import defpackage.sfe;
import defpackage.sfq;
import defpackage.sfz;
import defpackage.sga;
import defpackage.sgz;
import defpackage.sjp;
import defpackage.sjq;

public class AppAuthCancellationReceiverActivity extends aej {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sgz sgz = (sgz) getIntent().getBundleExtra("EXTRA_BUNDLE").getParcelable("EXTRA_FLOW_CONFIG");
        if (!sjq.a((Activity) this, sgz)) {
            sfe sfe = new sfe(getApplication(), sgz, sga.b.a());
            sfe.a(sfz.a(7), aodi.EVENT_APP_AUTH_DISMISS);
            new sjp(this, sfe).a(this, sfz.a(7), 0, new sfq(1, new sfd()), sgz);
            finish();
        }
    }
}
