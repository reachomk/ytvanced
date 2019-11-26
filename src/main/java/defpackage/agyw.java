package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;

/* renamed from: agyw */
final class agyw extends BroadcastReceiver {
    private volatile boolean a = Environment.getExternalStorageState().equals("mounted");
    private final agyt b;

    public agyw(agyt agyt) {
        this.b = agyt;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a = "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction());
        boolean z = this.a;
        this.b.e();
    }
}
