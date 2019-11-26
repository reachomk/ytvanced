package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;

/* renamed from: anpi */
final class anpi {
    private static int f;
    private static PendingIntent g;
    public final aac a = new aac();
    public final Context b;
    public final anpc c;
    public Messenger d;
    public anpx e;
    private final Messenger h;

    public anpi(Context context, anpc anpc) {
        this.b = context;
        this.c = anpc;
        this.h = new Messenger(new anph(this, Looper.getMainLooper()));
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (anpi.class) {
            if (g == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                g = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", g);
        }
    }

    public final void a(String str, Bundle bundle) {
        synchronized (this.a) {
            ryl ryl = (ryl) this.a.remove(str);
            if (ryl == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                str = String.valueOf(str);
                if (str.length() == 0) {
                    str = new String(str3);
                } else {
                    str = str3.concat(str);
                }
                Log.w(str2, str);
                return;
            }
            ryl.a((Object) bundle);
        }
    }

    public final Bundle a(Bundle bundle) {
        Bundle b = b(bundle);
        if (b != null) {
            String str = "google.messenger";
            if (b.containsKey(str)) {
                b = b(bundle);
                if (b != null && b.containsKey(str)) {
                    return null;
                }
            }
        }
        return b;
    }

    private static synchronized String a() {
        String num;
        synchronized (anpi.class) {
            int i = f;
            f = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa A:{SYNTHETIC} */
    private final android.os.Bundle b(android.os.Bundle r6) {
        /*
        r5 = this;
        r0 = defpackage.anpi.a();
        r1 = new ryl;
        r1.<init>();
        r2 = r5.a;
        monitor-enter(r2);
        r3 = r5.a;	 Catch:{ all -> 0x00e1 }
        r3.put(r0, r1);	 Catch:{ all -> 0x00e1 }
        monitor-exit(r2);	 Catch:{ all -> 0x00e1 }
        r2 = r5.c;
        r2 = r2.a();
        if (r2 == 0) goto L_0x00d9;
    L_0x001a:
        r2 = new android.content.Intent;
        r2.<init>();
        r3 = "com.google.android.gms";
        r2.setPackage(r3);
        r3 = r5.c;
        r3 = r3.a();
        r4 = 2;
        if (r3 != r4) goto L_0x0033;
    L_0x002d:
        r3 = "com.google.iid.TOKEN_REQUEST";
        r2.setAction(r3);
        goto L_0x0038;
    L_0x0033:
        r3 = "com.google.android.c2dm.intent.REGISTER";
        r2.setAction(r3);
    L_0x0038:
        r2.putExtras(r6);
        r6 = r5.b;
        defpackage.anpi.a(r6, r2);
        r6 = java.lang.String.valueOf(r0);
        r6 = r6.length();
        r3 = new java.lang.StringBuilder;
        r6 = r6 + 5;
        r3.<init>(r6);
        r6 = "|ID|";
        r3.append(r6);
        r3.append(r0);
        r6 = "|";
        r3.append(r6);
        r6 = r3.toString();
        r3 = "kid";
        r2.putExtra(r3, r6);
        r6 = r5.h;
        r3 = "google.messenger";
        r2.putExtra(r3, r6);
        r6 = r5.d;
        if (r6 != 0) goto L_0x0074;
    L_0x0070:
        r6 = r5.e;
        if (r6 == 0) goto L_0x0088;
    L_0x0074:
        r6 = android.os.Message.obtain();
        r6.obj = r2;
        r3 = r5.d;	 Catch:{ RemoteException -> 0x0088 }
        if (r3 == 0) goto L_0x0082;
    L_0x007e:
        r3.send(r6);	 Catch:{ RemoteException -> 0x0088 }
        goto L_0x009b;
    L_0x0082:
        r3 = r5.e;	 Catch:{ RemoteException -> 0x0088 }
        r3.a(r6);	 Catch:{ RemoteException -> 0x0088 }
        goto L_0x009b;
    L_0x0088:
        r6 = r5.c;
        r6 = r6.a();
        if (r6 != r4) goto L_0x0096;
    L_0x0090:
        r6 = r5.b;
        r6.sendBroadcast(r2);
        goto L_0x009b;
    L_0x0096:
        r6 = r5.b;
        r6.startService(r2);
    L_0x009b:
        r6 = r1.a;	 Catch:{ InterruptedException | TimeoutException -> 0x00bd, InterruptedException | TimeoutException -> 0x00bd, ExecutionException -> 0x00b6 }
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException | TimeoutException -> 0x00bd, InterruptedException | TimeoutException -> 0x00bd, ExecutionException -> 0x00b6 }
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r6 = defpackage.rym.a(r6, r2, r1);	 Catch:{ InterruptedException | TimeoutException -> 0x00bd, InterruptedException | TimeoutException -> 0x00bd, ExecutionException -> 0x00b6 }
        r6 = (android.os.Bundle) r6;	 Catch:{ InterruptedException | TimeoutException -> 0x00bd, InterruptedException | TimeoutException -> 0x00bd, ExecutionException -> 0x00b6 }
        r1 = r5.a;
        monitor-enter(r1);
        r2 = r5.a;	 Catch:{ all -> 0x00b1 }
        r2.remove(r0);	 Catch:{ all -> 0x00b1 }
        monitor-exit(r1);	 Catch:{ all -> 0x00b1 }
        return r6;
    L_0x00b1:
        r6 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00b1 }
        throw r6;
    L_0x00b4:
        r6 = move-exception;
        goto L_0x00cc;
    L_0x00b6:
        r6 = move-exception;
        r1 = new java.io.IOException;	 Catch:{ all -> 0x00b4 }
        r1.<init>(r6);	 Catch:{ all -> 0x00b4 }
        throw r1;	 Catch:{ all -> 0x00b4 }
    L_0x00bd:
        r6 = "FirebaseInstanceId";
        r1 = "No response";
        android.util.Log.w(r6, r1);	 Catch:{ all -> 0x00b4 }
        r6 = new java.io.IOException;	 Catch:{ all -> 0x00b4 }
        r1 = "TIMEOUT";
        r6.<init>(r1);	 Catch:{ all -> 0x00b4 }
        throw r6;	 Catch:{ all -> 0x00b4 }
    L_0x00cc:
        r1 = r5.a;
        monitor-enter(r1);
        r2 = r5.a;	 Catch:{ all -> 0x00d6 }
        r2.remove(r0);	 Catch:{ all -> 0x00d6 }
        monitor-exit(r1);	 Catch:{ all -> 0x00d6 }
        throw r6;
    L_0x00d6:
        r6 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00d6 }
        throw r6;
    L_0x00d9:
        r6 = new java.io.IOException;
        r0 = "MISSING_INSTANCEID_SERVICE";
        r6.<init>(r0);
        throw r6;
    L_0x00e1:
        r6 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00e1 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anpi.b(android.os.Bundle):android.os.Bundle");
    }
}
