package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: dfz */
public final class dfz implements Runnable {
    private static final long f = TimeUnit.SECONDS.toMillis(3600);
    private static final long g = TimeUnit.SECONDS.toMillis(30);
    private static Object h = new Object();
    private static dfz i;
    public final dfw a;
    public final Object b = new Object();
    public final Set c;
    public final Map d;
    public long e;
    private final long j;
    private final long k;
    private final Context l;
    private final HandlerThread m;
    private final SharedPreferences n;
    private final Handler o;

    public static dfz a(Context context) {
        synchronized (h) {
            if (i == null) {
                try {
                    i = new dfz(context, f, g, new dfw(context));
                } catch (Exception e) {
                    Log.e("GoogleConversionReporter", "Error starting automated usage thread", e);
                }
            }
        }
        return i;
    }

    private dfz(Context context, long j, long j2, dfw dfw) {
        this.l = context;
        this.k = j;
        this.j = j2;
        this.a = dfw;
        this.d = new HashMap();
        this.c = new HashSet();
        this.n = this.l.getSharedPreferences("google_auto_usage", 0);
        if (this.e == 0) {
            this.e = this.n.getLong("end_of_interval", dgh.a() + this.k);
        }
        this.m = new HandlerThread("Google Conversion SDK", 10);
        this.m.start();
        this.o = new Handler(this.m.getLooper());
        b();
    }

    public final void run() {
        KeyguardManager keyguardManager = (KeyguardManager) this.l.getSystemService("keyguard");
        PowerManager powerManager = (PowerManager) this.l.getSystemService("power");
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.l.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn()) {
                    synchronized (this.b) {
                        for (Entry entry : this.d.entrySet()) {
                            String str = (String) entry.getKey();
                            long longValue = ((Long) entry.getValue()).longValue();
                            long j = this.e;
                            if (longValue < j) {
                                entry.setValue(Long.valueOf(j));
                                this.a.a(str, this.e);
                            }
                        }
                    }
                    b();
                    long a = a();
                    this.n.edit().putLong("end_of_interval", a).commit();
                    this.e = a;
                    return;
                }
            }
        }
        a(this.j);
    }

    private final long a() {
        long a = dgh.a();
        long j = this.e;
        return j + ((a >= j ? ((a - j) / this.k) + 1 : 0) * this.k);
    }

    private final void b() {
        synchronized (this.b) {
            a(a() - dgh.a());
        }
    }

    private final void a(long j) {
        synchronized (this.b) {
            Handler handler = this.o;
            if (handler != null) {
                handler.removeCallbacks(this);
                this.o.postDelayed(this, j);
            }
        }
    }
}
