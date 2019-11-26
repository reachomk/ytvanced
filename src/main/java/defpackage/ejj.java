package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

/* renamed from: ejj */
public final class ejj extends BroadcastReceiver {
    public zyw a;
    public xlu b;
    private boolean c;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && VERSION.SDK_INT >= 26) {
            if (!this.c) {
                ((ejm) xse.a(context)).a(this);
                this.c = true;
            }
            if (this.a.a() != null) {
                aulu aulu = this.a.a().e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if (aulu.V) {
                    this.b.a();
                }
            }
        }
    }
}
