package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: htk */
final class htk extends BroadcastReceiver {
    private final /* synthetic */ hth a;

    htk(hth hth) {
        this.a = hth;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a.a.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            hth hth = this.a;
            htf htf = hth.b;
            htf.a(hth.a, htf.a());
        }
    }
}
