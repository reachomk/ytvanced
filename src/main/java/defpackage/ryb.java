package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ryb */
public final class ryb {
    public static ScheduledExecutorService i;
    public final WakeLock a;
    public final int b;
    public final String c;
    public final Context d;
    public boolean e;
    public final Map f;
    public int g;
    public final AtomicInteger h;
    private WorkSource j;

    public ryb(Context context, String str) {
        String packageName = context != null ? context.getPackageName() : null;
        this.e = true;
        this.f = new HashMap();
        this.h = new AtomicInteger(0);
        pzr.a(str, (Object) "Wake lock name can NOT be empty");
        this.b = 1;
        this.d = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.c = str;
        } else {
            String str2 = "*gcore*:";
            String valueOf = String.valueOf(str);
            this.c = valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
        }
        this.a = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
        if (qbm.a(context)) {
            if (qbh.a(packageName)) {
                packageName = context.getPackageName();
            }
            this.j = qbm.a(context, packageName);
            WorkSource workSource = this.j;
            if (workSource != null && qbm.a(this.d)) {
                WorkSource workSource2 = this.j;
                if (workSource2 != null) {
                    workSource2.add(workSource);
                } else {
                    this.j = workSource;
                }
                a(this.j);
            }
        }
        if (i == null) {
            i = qoz.a().a();
        }
    }

    public final List a() {
        return qbm.a(this.j);
    }

    public final void b() {
        if (this.a.isHeld()) {
            try {
                this.a.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.c).concat(" was already released!"), e);
                    return;
                }
                throw e;
            }
        }
    }

    public final String c() {
        if (this.e) {
            boolean isEmpty = TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void a(WorkSource workSource) {
        try {
            this.a.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    static {
        rya rya = new rya();
    }
}
