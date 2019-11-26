package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: advn */
final class advn extends BroadcastReceiver {
    private final /* synthetic */ advb a;

    advn(advb advb) {
        this.a = advb;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.b();
        this.a.a();
    }
}
