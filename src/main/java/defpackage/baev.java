package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* renamed from: baev */
final class baev implements OnClickListener {
    private final /* synthetic */ Context a;

    baev(Context context) {
        this.a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
        intent.setPackage("com.android.vending");
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.e(baew.a, "Google Play Services is not installed, unable to download VrCore.");
        }
    }
}
