package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Environment;

/* renamed from: amcf */
public final class amcf extends ambz {
    private static final amcl b = amcl.a(2);
    private final BroadcastReceiver c = new amci(this);
    private final Application d;

    public amcf(Context context) {
        super(2);
        this.d = (Application) ((Context) amqw.a((Object) context)).getApplicationContext();
    }

    public final amcl e() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            return amcl.a;
        }
        amcl amcl;
        if ("mounted_ro".equals(externalStorageState)) {
            amcl = amcl.a;
        } else {
            amcl = b;
        }
        return amcl;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        this.d.registerReceiver(this.c, intentFilter);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.d.unregisterReceiver(this.c);
    }
}
