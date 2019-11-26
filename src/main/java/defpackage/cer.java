package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cer */
final class cer extends BroadcastReceiver {
    private final /* synthetic */ ces a;

    cer(ces ces) {
        this.a = ces;
    }

    public final void onReceive(Context context, Intent intent) {
        ces ces = this.a;
        boolean z = ces.b;
        ces.b = ces.a(context);
        ces ces2 = this.a;
        boolean z2 = ces2.b;
        if (z != z2) {
            ces2.a.a(z2);
        }
    }
}
