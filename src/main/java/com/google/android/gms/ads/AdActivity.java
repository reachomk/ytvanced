package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import defpackage.qct;
import defpackage.qld;
import defpackage.qml;
import defpackage.rlg;
import defpackage.rlj;

public class AdActivity extends Activity {
    private qld a;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        rlg rlg = new rlg(rlj.b(), this);
        Intent intent = getIntent();
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        boolean z = false;
        if (intent.hasExtra(str)) {
            z = intent.getBooleanExtra(str, false);
        } else {
            qml.a("useClientJar flag not found in activity intent extras.");
        }
        this.a = (qld) rlg.a(this, z);
        qld qld = this.a;
        String str2 = "#007 Could not call remote method.";
        if (qld != null) {
            try {
                qld.a(bundle);
                return;
            } catch (RemoteException e) {
                qml.c(str2, e);
                finish();
                return;
            }
        }
        qml.c(str2, null);
        finish();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestart() {
        super.onRestart();
        try {
            qld qld = this.a;
            if (qld != null) {
                qld.a();
            }
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        try {
            qld qld = this.a;
            if (qld != null) {
                qld.b();
            }
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        try {
            qld qld = this.a;
            if (qld != null) {
                qld.c();
            }
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        try {
            qld qld = this.a;
            if (qld != null) {
                qld.d();
            }
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            qld qld = this.a;
            if (qld != null) {
                qld.b(bundle);
            }
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        try {
            qld qld = this.a;
            if (qld != null) {
                qld.e();
            }
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDestroy() {
        try {
            qld qld = this.a;
            if (qld != null) {
                qld.f();
            }
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    private final void a() {
        qld qld = this.a;
        if (qld != null) {
            try {
                qld.g();
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
            }
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }

    public final void onBackPressed() {
        try {
            qld qld = this.a;
            if (!(qld == null || qld.h())) {
                return;
            }
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.a.a(i, i2, intent);
        } catch (Exception e) {
            qml.c("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.a.a(qct.a((Object) configuration));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }
}
