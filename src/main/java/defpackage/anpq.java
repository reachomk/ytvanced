package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: anpq */
public abstract class anpq extends Service {
    private Binder a;
    private final Object b;
    private int c;
    public final ExecutorService d;
    private int e;

    public anpq() {
        String simpleName = getClass().getSimpleName();
        String str = "Firebase-";
        if (simpleName.length() == 0) {
            simpleName = new String(str);
        } else {
            simpleName = str.concat(simpleName);
        }
        this.d = Executors.newSingleThreadExecutor(new qpe(simpleName));
        this.b = new Object();
        this.e = 0;
    }

    public Intent a() {
        throw null;
    }

    public abstract void a(Intent intent);

    public boolean c(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new anpu(this);
        }
        return this.a;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.e++;
        }
        Intent a = a();
        if (a == null) {
            b(intent);
            return 2;
        } else if (c(a)) {
            b(intent);
            return 2;
        } else {
            this.d.execute(new anpp(this, a, intent));
            return 3;
        }
    }

    public final void b(Intent intent) {
        if (intent != null) {
            rm.a(intent);
        }
        synchronized (this.b) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }
}
