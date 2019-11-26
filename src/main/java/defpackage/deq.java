package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@Deprecated
/* renamed from: deq */
public abstract class deq extends Service {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public final ExecutorService b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new det(this));
    public final aac c = new aac(1);
    private final dej d = new des(this);

    public abstract boolean a();

    public abstract boolean a(der der);

    public final void onStart(Intent intent, int i) {
    }

    public final void a(der der, boolean z) {
        if (der != null) {
            this.b.execute(deu.a(this, der, z));
        } else {
            Log.e("FJD.JobService", "jobFinished called with a null JobParameters");
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }

    public final IBinder onBind(Intent intent) {
        return this.d;
    }

    public final boolean onUnbind(Intent intent) {
        this.b.execute(new deu(3, this, null, null, null, false, 0));
        return super.onUnbind(intent);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                printWriter.println("No running jobs");
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            printWriter.println("Running jobs:");
            int i = 0;
            while (true) {
                aac aac = this.c;
                if (i >= aac.b) {
                    return;
                }
                dev dev = (dev) aac.get(aac.b(i));
                String quote = JSONObject.quote(dev.a.c());
                String formatElapsedTime = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime - dev.b));
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(quote).length() + 28) + String.valueOf(formatElapsedTime).length());
                stringBuilder.append("    * ");
                stringBuilder.append(quote);
                stringBuilder.append(" has been running for ");
                stringBuilder.append(formatElapsedTime);
                printWriter.println(stringBuilder.toString());
                i++;
            }
        }
    }
}
