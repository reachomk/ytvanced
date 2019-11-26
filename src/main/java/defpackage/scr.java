package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* renamed from: scr */
public final class scr extends BroadcastReceiver {
    private final /* synthetic */ sco a;

    public scr(sco sco) {
        this.a = sco;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
            boolean isConnected = ((NetworkInfo) intent.getParcelableExtra("networkInfo")).isConnected();
            String a = isConnected ? sdh.a(context) : null;
            sco sco = this.a;
            String str = isConnected ? "enabled" : "disabled";
            String str2 = "WiFi connectivity changed to ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str2.concat(str);
            }
            if (!isConnected || sco.b) {
                sco.b = isConnected;
                return;
            }
            sco.b = true;
            sco.d.g();
            sco.d.a(15, a);
        }
    }
}
