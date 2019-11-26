package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: afb */
final class afb extends BroadcastReceiver {
    private final /* synthetic */ aey a;

    afb(aey aey) {
        this.a = aey;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}
