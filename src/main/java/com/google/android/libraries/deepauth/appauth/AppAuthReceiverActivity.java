package com.google.android.libraries.deepauth.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.youtube.R;
import defpackage.aej;
import defpackage.sfe;
import defpackage.sfq;
import defpackage.sfz;
import defpackage.sga;
import defpackage.sgz;
import defpackage.sij;
import defpackage.sik;
import defpackage.sjp;
import defpackage.sjq;

public class AppAuthReceiverActivity extends aej implements sik {
    private static final sfz g = sfz.a(7);
    private sjp h;
    private sij i;
    private sgz j;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.gdi_app_auth_receiver);
        String str = "EXTRA_FLOW_CONFIG";
        if (bundle == null) {
            this.j = (sgz) getIntent().getBundleExtra("EXTRA_BUNDLE").getParcelable(str);
        } else {
            this.j = (sgz) bundle.getParcelable(str);
        }
        if (!sjq.a((Activity) this, this.j)) {
            this.h = new sjp(this, new sfe(getApplication(), this.j, sga.b.a()));
            if (k() != null) {
                this.i = (sij) k();
                this.i.a((sik) this);
                return;
            }
            this.i = new sij(getApplication(), this.j);
            this.i.a((sik) this);
            this.i.a(getIntent());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        sgz sgz = this.j;
        if (sgz != null) {
            bundle.putParcelable("EXTRA_FLOW_CONFIG", sgz);
        }
        super.onSaveInstanceState(bundle);
    }

    public final Object x_() {
        return this.i;
    }

    public final void c(sfq sfq) {
        this.h.a(this, g, -1, sfq, this.j);
        finish();
    }

    public static PendingIntent a(Context context, sgz sgz) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_FLOW_CONFIG", sgz);
        return PendingIntent.getActivity(context, 0, new Intent(context, AppAuthReceiverActivity.class).putExtra("EXTRA_BUNDLE", bundle), 268435456);
    }
}
