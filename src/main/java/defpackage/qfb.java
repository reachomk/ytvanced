package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.gcm.PendingCallback;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: qfb */
public abstract class qfb extends Service {
    public final Object a = new Object();
    public int b;
    public ComponentName c;
    public qey d;
    private ExecutorService e;
    private Messenger f;

    public abstract int a(qfk qfk);

    public void onCreate() {
        super.onCreate();
        this.d = qey.a((Context) this);
        this.e = Executors.newFixedThreadPool(2, new qfn());
        this.f = new Messenger(new qfa(this, Looper.getMainLooper()));
        this.c = new ComponentName(this, getClass());
    }

    public final void onDestroy() {
        super.onDestroy();
        List shutdownNow = this.e.shutdownNow();
        if (!shutdownNow.isEmpty()) {
            int size = shutdownNow.size();
            StringBuilder stringBuilder = new StringBuilder(79);
            stringBuilder.append("Shutting down, but not all tasks are finished executing. Remaining: ");
            stringBuilder.append(size);
            Log.e("GcmTaskService", stringBuilder.toString());
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                String str = "GcmTaskService";
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    action = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundleExtra = intent.getBundleExtra("extras");
                    intent.getParcelableArrayListExtra("triggered_uris");
                    if (!(parcelableExtra instanceof PendingCallback)) {
                        String packageName = getPackageName();
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(packageName).length() + 47) + String.valueOf(action).length());
                        stringBuilder.append(packageName);
                        stringBuilder.append(" ");
                        stringBuilder.append(action);
                        stringBuilder.append(": Could not process request, invalid callback.");
                        Log.e(str, stringBuilder.toString());
                        a(i2);
                        return 2;
                    } else if (a(action)) {
                        a(i2);
                        return 2;
                    } else {
                        a(new qfd(this, action, ((PendingCallback) parcelableExtra).a, bundleExtra));
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(action).length() + 37);
                    stringBuilder2.append("Unknown action received ");
                    stringBuilder2.append(action);
                    stringBuilder2.append(", terminating");
                    Log.e(str, stringBuilder2.toString());
                }
                a(i2);
                return 2;
            } catch (Throwable th) {
                a(i2);
            }
        } else {
            a(i2);
            return 2;
        }
    }

    public final boolean a(String str) {
        int a;
        synchronized (this.a) {
            a = this.d.a(str, this.c.getClassName()) ^ 1;
            if (a != 0) {
                String packageName = getPackageName();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(packageName).length() + 44) + String.valueOf(str).length());
                stringBuilder.append(packageName);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(": Task already running, won't start another");
                Log.w("GcmTaskService", stringBuilder.toString());
            }
        }
        return a;
    }

    private final void a(int i) {
        synchronized (this.a) {
            this.b = i;
            if (!this.d.c(this.c.getClassName())) {
                stopSelf(this.b);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null && qbf.b()) {
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
                return this.f.getBinder();
            }
        }
        return null;
    }

    public final void a(qfd qfd) {
        try {
            this.e.execute(qfd);
        } catch (RejectedExecutionException e) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            qfd.a(1);
        }
    }
}
