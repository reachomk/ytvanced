package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bcs */
final class bcs extends BroadcastReceiver {
    private final /* synthetic */ bcp a;

    bcs(bcp bcp) {
        this.a = bcp;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a();
    }
}
