package defpackage;

import android.content.Context;
import android.content.Intent;

@Deprecated
/* renamed from: qhs */
public final class qhs extends qic {
    public static void a(Context context, qhz qhz) {
        qhz.a();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    public final void handleIntent(Intent intent) {
        throw null;
    }
}
