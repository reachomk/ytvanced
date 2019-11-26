package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: adru */
final class adru extends BroadcastReceiver {
    private final /* synthetic */ adro a;

    adru(adro adro) {
        this.a = adro;
    }

    public final void onReceive(Context context, Intent intent) {
        int ordinal = adij.a(intent.getAction()).ordinal();
        if (ordinal == 7) {
            this.a.a(adpr.NETWORK, 5);
        } else if (ordinal == 11) {
            if (this.a.p.c()) {
                this.a.a(adpr.LOUNGE_SERVER_CONNECTION_ERROR, 5);
            } else {
                this.a.a(adpr.NETWORK, 5);
            }
        }
    }
}
