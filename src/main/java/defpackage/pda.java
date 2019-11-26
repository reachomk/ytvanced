package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: pda */
public abstract class pda extends Service {
    private IBinder a;
    public volatile int c = -1;
    public ExecutorService d;
    public final Object e = new Object();
    public boolean f;

    public abstract void a();

    public void onCreate() {
        super.onCreate();
        this.d = Executors.newSingleThreadExecutor();
        this.a = new pcz(this);
    }

    public final void onDestroy() {
        synchronized (this.e) {
            this.f = true;
            this.d.shutdown();
        }
        super.onDestroy();
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.ads.identifier.BIND_LISTENER".equals(intent.getAction())) {
            return this.a;
        }
        return null;
    }
}
