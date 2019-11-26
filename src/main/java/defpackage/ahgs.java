package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.IBinder;

/* renamed from: ahgs */
final class ahgs implements ServiceConnection {
    private final /* synthetic */ ahgn a;

    ahgs(ahgn ahgn) {
        this.a = ahgn;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Intent intent = (Intent) this.a.b.get();
        if (VERSION.SDK_INT >= 26) {
            ahgn ahgn = this.a;
            if (ahgn.c.h) {
                ahgn.a.startForegroundService(intent);
                ((aisx) this.a.i.get()).a(true);
                return;
            }
        }
        this.a.a.startService(intent);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        ((aisx) this.a.i.get()).b(true);
        this.a.a.unbindService(this);
        this.a.r = false;
    }
}
