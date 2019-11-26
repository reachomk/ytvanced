package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.firebase.jobdispatcher.GooglePlayReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: dex */
public final class dex implements ServiceConnection {
    private final Map a = new HashMap();
    private final def b;
    private final Context c;
    private boolean d = false;
    private deg e;

    dex(def def, Context context) {
        this.b = def;
        this.c = context;
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (a()) {
            Log.w("FJD.ExecutionDelegator", "Connection have been used already.");
            return;
        }
        deg dei;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.firebase.jobdispatcher.IRemoteJobService");
            dei = queryLocalInterface instanceof deg ? (deg) queryLocalInterface : new dei(iBinder);
        } else {
            dei = null;
        }
        this.e = dei;
        if (this.e == null) {
            String valueOf = String.valueOf(iBinder);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 22);
            stringBuilder.append("null binder provided: ");
            stringBuilder.append(valueOf);
            Log.w("FJD.ExecutionDelegator", stringBuilder.toString(), new RuntimeException());
            b();
        }
        HashSet<dep> hashSet = new HashSet();
        for (Entry entry : this.a.entrySet()) {
            if (Boolean.FALSE.equals(entry.getValue())) {
                try {
                    this.e.a(dex.a((der) entry.getKey()), this.b);
                    hashSet.add((dep) entry.getKey());
                } catch (RemoteException e) {
                    String valueOf2 = String.valueOf(entry.getKey());
                    StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 20);
                    stringBuilder2.append("Failed to start job ");
                    stringBuilder2.append(valueOf2);
                    Log.e("FJD.ExecutionDelegator", stringBuilder2.toString(), e);
                    b();
                    return;
                }
            }
        }
        for (dep put : hashSet) {
            this.a.put(put, Boolean.valueOf(true));
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        b();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a() {
        return this.d;
    }

    private final synchronized boolean d() {
        return this.e != null;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:14:0x002c, code skipped:
            return;
     */
    public final synchronized void a(defpackage.dep r3, boolean r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.a();	 Catch:{ all -> 0x0036 }
        if (r0 != 0) goto L_0x002d;
    L_0x0007:
        r0 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x0036 }
        r1 = r2.a;	 Catch:{ all -> 0x0036 }
        r1 = r1.remove(r3);	 Catch:{ all -> 0x0036 }
        r0 = r0.equals(r1);	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x001e;
    L_0x0015:
        r0 = r2.d();	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x001e;
    L_0x001b:
        r2.a(r4, r3);	 Catch:{ all -> 0x0036 }
    L_0x001e:
        if (r4 != 0) goto L_0x002b;
    L_0x0020:
        r3 = r2.a;	 Catch:{ all -> 0x0036 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x0036 }
        if (r3 == 0) goto L_0x002b;
    L_0x0028:
        r2.b();	 Catch:{ all -> 0x0036 }
    L_0x002b:
        monitor-exit(r2);
        return;
    L_0x002d:
        r3 = "FJD.ExecutionDelegator";
        r4 = "Can't send stop request because service was unbound.";
        android.util.Log.w(r3, r4);	 Catch:{ all -> 0x0036 }
        monitor-exit(r2);
        return;
    L_0x0036:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dex.a(dep, boolean):void");
    }

    private final synchronized void a(boolean z, dep dep) {
        try {
            this.e.a(dex.a((der) dep), z);
        } catch (RemoteException e) {
            Log.e("FJD.ExecutionDelegator", "Failed to stop a job", e);
            b();
        }
    }

    public final synchronized void b() {
        if (!a()) {
            this.e = null;
            this.d = true;
            ArrayList arrayList = new ArrayList(this.a.size());
            Iterator it = this.a.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add((dep) it.next());
                it.remove();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c((dep) arrayList.get(i));
            }
            try {
                this.c.unbindService(this);
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e.getMessage());
                String str = "Error unbinding service: ";
                Log.w("FJD.ExecutionDelegator", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(dep dep) {
        this.a.remove(dep);
        if (this.a.isEmpty()) {
            b();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean b(dep dep) {
        boolean d;
        if (a()) {
            c(dep);
        }
        d = d();
        if (d) {
            if (Boolean.TRUE.equals((Boolean) this.a.get(dep))) {
                String valueOf = String.valueOf(dep);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 54);
                stringBuilder.append("Received an execution request for already running job ");
                stringBuilder.append(valueOf);
                Log.w("FJD.ExecutionDelegator", stringBuilder.toString());
                a(false, dep);
            }
            try {
                this.e.a(dex.a((der) dep), this.b);
            } catch (RemoteException e) {
                String valueOf2 = String.valueOf(dep);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 24);
                stringBuilder2.append("Failed to start the job ");
                stringBuilder2.append(valueOf2);
                Log.e("FJD.ExecutionDelegator", stringBuilder2.toString(), e);
                b();
                return false;
            }
        }
        this.a.put(dep, Boolean.valueOf(d));
        return d;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void c() {
        if (!(d() || a())) {
            Log.w("FJD.ExecutionDelegator", "Binder connection to JobService timed out");
            b();
        }
    }

    private static Bundle a(der der) {
        return GooglePlayReceiver.a.a(der, new Bundle());
    }

    private final void c(dep dep) {
        try {
            this.b.a(dex.a((der) dep), 1);
        } catch (RemoteException e) {
            String str = dep.a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 31) + valueOf.length());
            stringBuilder.append("Error sending result for job ");
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf);
            Log.e("FJD.ExecutionDelegator", stringBuilder.toString());
        }
    }
}
