package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: uas */
public final class uas extends tzs {
    private uas() {
    }

    public final void a(Context context, tzu tzu) {
        tzu uar = new uar(context);
        a(uar);
        if (!this.a) {
            context.registerReceiver(new uaq(this, uar, tzu), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        }
    }

    public /* synthetic */ uas(byte b) {
    }
}
