package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: anpo */
final class anpo extends BroadcastReceiver {
    public anpl a;

    public anpo(anpl anpl) {
        this.a = anpl;
    }

    public final void onReceive(Context context, Intent intent) {
        anpl anpl = this.a;
        if (anpl != null && anpl.b()) {
            FirebaseInstanceId.e();
            FirebaseInstanceId.a(this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
