package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: amch */
public final class amch extends ambz {
    private static final amcl b = amcl.a(1);
    private final BroadcastReceiver c = new amck(this);
    private final Context d;
    private final ConnectivityManager e;

    public amch(Context context) {
        super(1);
        this.d = context;
        this.e = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final amcl e() {
        NetworkInfo activeNetworkInfo = this.e.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return b;
        }
        return amcl.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.d.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.d.unregisterReceiver(this.c);
    }
}
