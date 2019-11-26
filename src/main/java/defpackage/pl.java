package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: pl */
public abstract class pl extends Service {
    private static final Object g = new Object();
    private static final HashMap h = new HashMap();
    public pn a;
    public pk b;
    public final boolean c = false;
    public final ArrayList d;
    private ps e;
    private boolean f = false;

    public pl() {
        if (VERSION.SDK_INT >= 26) {
            this.d = null;
        } else {
            this.d = new ArrayList();
        }
    }

    public abstract void a();

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.a = new pr(this);
            this.e = null;
            return;
        }
        this.a = null;
        this.e = pl.a(this, new ComponentName(this, getClass()), false, 0);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.d == null) {
            return 2;
        }
        this.e.a();
        synchronized (this.d) {
            ArrayList arrayList = this.d;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new pp(this, intent, i2));
            a(true);
        }
        return 3;
    }

    public final IBinder onBind(Intent intent) {
        pn pnVar = this.a;
        return pnVar != null ? pnVar.a() : null;
    }

    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = true;
                this.e.c();
            }
        }
    }

    public static void a(Context context, Class cls, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        synchronized (g) {
            ps a = pl.a(context, componentName, true, 1000);
            a.a(1000);
            a.a(intent);
        }
    }

    private static ps a(Context context, ComponentName componentName, boolean z, int i) {
        ps psVar = (ps) h.get(componentName);
        if (psVar == null) {
            ps pmVar;
            if (VERSION.SDK_INT < 26) {
                pmVar = new pm(context, componentName);
            } else if (z) {
                pmVar = new pt(context, componentName, i);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            psVar = pmVar;
            h.put(componentName, psVar);
        }
        return psVar;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.b == null) {
            this.b = new pk(this);
            ps psVar = this.e;
            if (psVar != null && z) {
                psVar.b();
            }
            this.b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.b = null;
                ArrayList arrayList2 = this.d;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    a(false);
                } else if (!this.f) {
                    this.e.c();
                }
            }
        }
    }
}
