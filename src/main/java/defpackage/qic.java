package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: qic */
public abstract class qic extends Service {
    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        throw null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        throw null;
    }
}
