package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: quh */
final class quh extends BroadcastReceiver {
    private final /* synthetic */ qui a;

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.a.p = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.a.p = false;
        }
    }

    /* synthetic */ quh(qui qui) {
        this.a = qui;
    }
}
