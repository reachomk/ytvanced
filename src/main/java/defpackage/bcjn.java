package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bcjn */
final class bcjn extends BroadcastReceiver {
    private final /* synthetic */ Context a;
    private final /* synthetic */ bcjo b;

    bcjn(bcjo bcjo, Context context) {
        this.b = bcjo;
        this.a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        bcjo bcjo = this.b;
        bcjp bcjp = bcjo.a;
        bcjp.b.getAuthToken(bcjp.e, bcjp.d, bcjp.c, true, new bcjo(bcjo.b, bcjp), null);
    }
}
