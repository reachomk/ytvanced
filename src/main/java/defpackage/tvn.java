package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: tvn */
final class tvn extends BroadcastReceiver {
    public final /* synthetic */ tvm a;

    tvn(tvm tvm) {
        this.a = tvm;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            if (this.a.j.get()) {
                this.a.e();
            }
            return;
        }
        this.a.e();
        tvm tvm = this.a;
        tvm.k = ((ScheduledExecutorService) tvm.b.a()).schedule(new tvq(this, context), 5, TimeUnit.SECONDS);
    }
}
