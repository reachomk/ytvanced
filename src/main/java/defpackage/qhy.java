package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: qhy */
final class qhy extends BroadcastReceiver {
    private final /* synthetic */ qhu a;

    qhy(qhu qhu) {
        this.a = qhu;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(intent);
    }
}
