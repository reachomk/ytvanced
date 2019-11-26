package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: anos */
final class anos implements ServiceConnection {
    public int a = 0;
    public final Messenger b = new Messenger(new Handler(Looper.getMainLooper(), new anor(this)));
    public anov c;
    public final Queue d = new ArrayDeque();
    public final SparseArray e = new SparseArray();
    public final /* synthetic */ anqn f;

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:15:0x002d, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:34:0x0080, code skipped:
            return true;
     */
    public final synchronized boolean a(defpackage.anox r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.a;	 Catch:{ all -> 0x0081 }
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x003f;
    L_0x0007:
        if (r0 == r2) goto L_0x0038;
    L_0x0009:
        r3 = 2;
        if (r0 == r3) goto L_0x002e;
    L_0x000c:
        r6 = 3;
        if (r0 == r6) goto L_0x002c;
    L_0x000f:
        r6 = 4;
        if (r0 != r6) goto L_0x0013;
    L_0x0012:
        goto L_0x002c;
    L_0x0013:
        r6 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0081 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0081 }
        r2 = 26;
        r1.<init>(r2);	 Catch:{ all -> 0x0081 }
        r2 = "Unknown state: ";
        r1.append(r2);	 Catch:{ all -> 0x0081 }
        r1.append(r0);	 Catch:{ all -> 0x0081 }
        r0 = r1.toString();	 Catch:{ all -> 0x0081 }
        r6.<init>(r0);	 Catch:{ all -> 0x0081 }
        throw r6;	 Catch:{ all -> 0x0081 }
    L_0x002c:
        monitor-exit(r5);
        return r1;
    L_0x002e:
        r0 = r5.d;	 Catch:{ all -> 0x0081 }
        r0.add(r6);	 Catch:{ all -> 0x0081 }
        r5.c();	 Catch:{ all -> 0x0081 }
        monitor-exit(r5);
        return r2;
    L_0x0038:
        r0 = r5.d;	 Catch:{ all -> 0x0081 }
        r0.add(r6);	 Catch:{ all -> 0x0081 }
        monitor-exit(r5);
        return r2;
    L_0x003f:
        r0 = r5.d;	 Catch:{ all -> 0x0081 }
        r0.add(r6);	 Catch:{ all -> 0x0081 }
        r6 = r5.a;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x004a;
    L_0x0048:
        r6 = 1;
        goto L_0x004b;
    L_0x004a:
        r6 = 0;
    L_0x004b:
        defpackage.pzr.a(r6);	 Catch:{ all -> 0x0081 }
        r5.a = r2;	 Catch:{ all -> 0x0081 }
        r6 = new android.content.Intent;	 Catch:{ all -> 0x0081 }
        r0 = "com.google.android.c2dm.intent.REGISTER";
        r6.<init>(r0);	 Catch:{ all -> 0x0081 }
        r0 = "com.google.android.gms";
        r6.setPackage(r0);	 Catch:{ all -> 0x0081 }
        defpackage.qar.a();	 Catch:{ all -> 0x0081 }
        r0 = r5.f;	 Catch:{ all -> 0x0081 }
        r0 = r0.a;	 Catch:{ all -> 0x0081 }
        r6 = defpackage.qar.b(r0, r6, r5, r2);	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x006f;
    L_0x0069:
        r6 = "Unable to bind to service";
        r5.a(r1, r6);	 Catch:{ all -> 0x0081 }
        goto L_0x007f;
    L_0x006f:
        r6 = r5.f;	 Catch:{ all -> 0x0081 }
        r6 = r6.b;	 Catch:{ all -> 0x0081 }
        r0 = new anou;	 Catch:{ all -> 0x0081 }
        r0.<init>(r5);	 Catch:{ all -> 0x0081 }
        r3 = 30;
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0081 }
        r6.schedule(r0, r3, r1);	 Catch:{ all -> 0x0081 }
    L_0x007f:
        monitor-exit(r5);
        return r2;
    L_0x0081:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anos.a(anox):boolean");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.c = new anov(iBinder);
                this.a = 2;
                c();
                return;
            } catch (RemoteException e) {
                a(0, e.getMessage());
                return;
            }
        }
        a(0, "Null service connection");
    }

    private final void c() {
        this.f.b.execute(new anot(this));
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        a(2, "Service disconnected");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i, String str) {
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            this.a = 4;
            qar.a();
            this.f.a.unbindService(this);
            anpa anpa = new anpa(i, str);
            for (anox a : this.d) {
                a.a(anpa);
            }
            this.d.clear();
            for (i = 0; i < this.e.size(); i++) {
                ((anox) this.e.valueAt(i)).a(anpa);
            }
            this.e.clear();
        } else if (i2 == 3) {
            this.a = 4;
        } else if (i2 != 4) {
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("Unknown state: ");
            stringBuilder.append(i2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            qar.a();
            this.f.a.unbindService(this);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i) {
        anox anox = (anox) this.e.get(i);
        if (anox != null) {
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Timing out request: ");
            stringBuilder.append(i);
            Log.w("MessengerIpcClient", stringBuilder.toString());
            this.e.remove(i);
            anox.a(new anpa(3, "Timed out waiting for response"));
            a();
        }
    }

    /* synthetic */ anos(anqn anqn) {
        this.f = anqn;
    }
}
