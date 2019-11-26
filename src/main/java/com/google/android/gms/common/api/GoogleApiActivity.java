package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import defpackage.psa;
import defpackage.psf;
import defpackage.pty;

public class GoogleApiActivity extends Activity implements OnCancelListener {
    private int a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            bundle = getIntent().getExtras();
            String str = "GoogleApiActivity";
            if (bundle == null) {
                Log.e(str, "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.get("pending_intent");
            Integer num = (Integer) bundle.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e(str, "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.a = 1;
                } catch (SendIntentException e) {
                    Log.e(str, "Failed to launch pendingIntent", e);
                    finish();
                }
            } else {
                psf.a.b(this, num.intValue(), 2, this);
                this.a = 1;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                pty a = pty.a((Context) this);
                if (i2 == -1) {
                    a.b();
                } else if (i2 == 0) {
                    a.b(new psa(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }
}
