package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: adki */
final class adki extends BroadcastReceiver {
    private final /* synthetic */ adkk a;
    private final /* synthetic */ adkj b;

    adki(adkj adkj, adkk adkk) {
        this.b = adkj;
        this.a = adkk;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!this.a.e()) {
            this.b.e();
        }
    }
}
