package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;

/* renamed from: qfd */
final class qfd implements Runnable {
    private final String a;
    private final Bundle b;
    private final qff c;
    private final Messenger d;
    private final /* synthetic */ qfb e;

    qfd(qfb qfb, String str, IBinder iBinder, Bundle bundle) {
        qff qfe;
        this.e = qfb;
        this.a = str;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            qfe = queryLocalInterface instanceof qff ? (qff) queryLocalInterface : new qfe(iBinder);
        } else {
            qfe = null;
        }
        this.c = qfe;
        this.b = bundle;
        this.d = null;
    }

    qfd(qfb qfb, String str, Messenger messenger, Bundle bundle) {
        this.e = qfb;
        this.a = str;
        this.d = messenger;
        this.b = bundle;
        this.c = null;
    }

    /* JADX WARNING: Missing block: B:14:?, code skipped:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:15:0x003a, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:16:0x003b, code skipped:
            defpackage.rbp.a(r1, r0);
     */
    public final void run() {
        /*
        r4 = this;
        r0 = new qfs;
        r1 = r4.a;
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        r3 = "nts:client:onRunTask:";
        if (r2 != 0) goto L_0x0016;
    L_0x0010:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x001a;
    L_0x0016:
        r1 = r3.concat(r1);
    L_0x001a:
        r0.<init>(r1);
        r1 = new qfk;	 Catch:{ all -> 0x0033 }
        r2 = r4.a;	 Catch:{ all -> 0x0033 }
        r3 = r4.b;	 Catch:{ all -> 0x0033 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0033 }
        r2 = r4.e;	 Catch:{ all -> 0x0033 }
        r1 = r2.a(r1);	 Catch:{ all -> 0x0033 }
        r4.a(r1);	 Catch:{ all -> 0x0033 }
        r0.close();
        return;
    L_0x0033:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r2 = move-exception;
        r0.close();	 Catch:{ all -> 0x003a }
        goto L_0x003e;
    L_0x003a:
        r0 = move-exception;
        defpackage.rbp.a(r1, r0);
    L_0x003e:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfd.run():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00a6 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:25|26|(1:28)(1:29)|30|31|32|(2:34|(1:36))|37|38) */
    /* JADX WARNING: Missing block: B:12:0x0044, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:26:?, code skipped:
            r6 = "GcmTaskService";
            r1 = "Error reporting result of operation to scheduler for ";
            r2 = java.lang.String.valueOf(r5.a);
     */
    /* JADX WARNING: Missing block: B:27:0x00b4, code skipped:
            if (r2.length() == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Missing block: B:28:0x00b6, code skipped:
            r2 = new java.lang.String(r1);
     */
    /* JADX WARNING: Missing block: B:29:0x00bc, code skipped:
            r2 = r1.concat(r2);
     */
    /* JADX WARNING: Missing block: B:30:0x00c0, code skipped:
            android.util.Log.e(r6, r2);
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            r6 = r5.e;
            r6.d.b(r5.a, r6.c.getClassName());
     */
    /* JADX WARNING: Missing block: B:33:0x00d6, code skipped:
            if (a() == false) goto L_0x00d8;
     */
    /* JADX WARNING: Missing block: B:34:0x00d8, code skipped:
            r6 = r5.e;
     */
    /* JADX WARNING: Missing block: B:35:0x00e6, code skipped:
            if (r6.d.c(r6.c.getClassName()) == false) goto L_0x00e8;
     */
    /* JADX WARNING: Missing block: B:36:0x00e8, code skipped:
            r6 = r5.e;
            r6.stopSelf(r6.b);
     */
    /* JADX WARNING: Missing block: B:38:0x00f0, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:39:0x00f1, code skipped:
            r1 = r5.e;
            r1.d.b(r5.a, r1.c.getClassName());
     */
    /* JADX WARNING: Missing block: B:40:0x0104, code skipped:
            if (a() == false) goto L_0x0106;
     */
    /* JADX WARNING: Missing block: B:41:0x0106, code skipped:
            r1 = r5.e;
     */
    /* JADX WARNING: Missing block: B:42:0x0114, code skipped:
            if (r1.d.c(r1.c.getClassName()) == false) goto L_0x0116;
     */
    /* JADX WARNING: Missing block: B:43:0x0116, code skipped:
            r1 = r5.e;
            r1.stopSelf(r1.b);
     */
    public final void a(int r6) {
        /*
        r5 = this;
        r0 = r5.e;
        r0 = r0.a;
        monitor-enter(r0);
        r1 = r5.e;	 Catch:{ RemoteException -> 0x00a6 }
        r2 = r1.d;	 Catch:{ RemoteException -> 0x00a6 }
        r3 = r5.a;	 Catch:{ RemoteException -> 0x00a6 }
        r1 = r1.c;	 Catch:{ RemoteException -> 0x00a6 }
        r1 = r1.getClassName();	 Catch:{ RemoteException -> 0x00a6 }
        r1 = r2.c(r3, r1);	 Catch:{ RemoteException -> 0x00a6 }
        if (r1 == 0) goto L_0x0045;
    L_0x0017:
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.d;	 Catch:{ all -> 0x011e }
        r2 = r5.a;	 Catch:{ all -> 0x011e }
        r6 = r6.c;	 Catch:{ all -> 0x011e }
        r6 = r6.getClassName();	 Catch:{ all -> 0x011e }
        r1.b(r2, r6);	 Catch:{ all -> 0x011e }
        r6 = r5.a();	 Catch:{ all -> 0x011e }
        if (r6 != 0) goto L_0x0043;
    L_0x002c:
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.d;	 Catch:{ all -> 0x011e }
        r6 = r6.c;	 Catch:{ all -> 0x011e }
        r6 = r6.getClassName();	 Catch:{ all -> 0x011e }
        r6 = r1.c(r6);	 Catch:{ all -> 0x011e }
        if (r6 != 0) goto L_0x0043;
    L_0x003c:
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.b;	 Catch:{ all -> 0x011e }
        r6.stopSelf(r1);	 Catch:{ all -> 0x011e }
    L_0x0043:
        monitor-exit(r0);	 Catch:{ all -> 0x011e }
        return;
    L_0x0045:
        r1 = r5.a();	 Catch:{ RemoteException -> 0x00a6 }
        if (r1 == 0) goto L_0x0072;
    L_0x004b:
        r1 = r5.d;	 Catch:{ RemoteException -> 0x00a6 }
        r2 = android.os.Message.obtain();	 Catch:{ RemoteException -> 0x00a6 }
        r3 = 3;
        r2.what = r3;	 Catch:{ RemoteException -> 0x00a6 }
        r2.arg1 = r6;	 Catch:{ RemoteException -> 0x00a6 }
        r6 = new android.os.Bundle;	 Catch:{ RemoteException -> 0x00a6 }
        r6.<init>();	 Catch:{ RemoteException -> 0x00a6 }
        r3 = "component";
        r4 = r5.e;	 Catch:{ RemoteException -> 0x00a6 }
        r4 = r4.c;	 Catch:{ RemoteException -> 0x00a6 }
        r6.putParcelable(r3, r4);	 Catch:{ RemoteException -> 0x00a6 }
        r3 = "tag";
        r4 = r5.a;	 Catch:{ RemoteException -> 0x00a6 }
        r6.putString(r3, r4);	 Catch:{ RemoteException -> 0x00a6 }
        r2.setData(r6);	 Catch:{ RemoteException -> 0x00a6 }
        r1.send(r2);	 Catch:{ RemoteException -> 0x00a6 }
        goto L_0x0077;
    L_0x0072:
        r1 = r5.c;	 Catch:{ RemoteException -> 0x00a6 }
        r1.a(r6);	 Catch:{ RemoteException -> 0x00a6 }
    L_0x0077:
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.d;	 Catch:{ all -> 0x011e }
        r2 = r5.a;	 Catch:{ all -> 0x011e }
        r6 = r6.c;	 Catch:{ all -> 0x011e }
        r6 = r6.getClassName();	 Catch:{ all -> 0x011e }
        r1.b(r2, r6);	 Catch:{ all -> 0x011e }
        r6 = r5.a();	 Catch:{ all -> 0x011e }
        if (r6 != 0) goto L_0x00ef;
    L_0x008c:
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.d;	 Catch:{ all -> 0x011e }
        r6 = r6.c;	 Catch:{ all -> 0x011e }
        r6 = r6.getClassName();	 Catch:{ all -> 0x011e }
        r6 = r1.c(r6);	 Catch:{ all -> 0x011e }
        if (r6 != 0) goto L_0x00ef;
    L_0x009c:
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.b;	 Catch:{ all -> 0x011e }
        r6.stopSelf(r1);	 Catch:{ all -> 0x011e }
        goto L_0x00ef;
    L_0x00a4:
        r6 = move-exception;
        goto L_0x00f1;
    L_0x00a6:
        r6 = "GcmTaskService";
        r1 = "Error reporting result of operation to scheduler for ";
        r2 = r5.a;	 Catch:{ all -> 0x00a4 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00a4 }
        r3 = r2.length();	 Catch:{ all -> 0x00a4 }
        if (r3 != 0) goto L_0x00bc;
    L_0x00b6:
        r2 = new java.lang.String;	 Catch:{ all -> 0x00a4 }
        r2.<init>(r1);	 Catch:{ all -> 0x00a4 }
        goto L_0x00c0;
    L_0x00bc:
        r2 = r1.concat(r2);	 Catch:{ all -> 0x00a4 }
    L_0x00c0:
        android.util.Log.e(r6, r2);	 Catch:{ all -> 0x00a4 }
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.d;	 Catch:{ all -> 0x011e }
        r2 = r5.a;	 Catch:{ all -> 0x011e }
        r6 = r6.c;	 Catch:{ all -> 0x011e }
        r6 = r6.getClassName();	 Catch:{ all -> 0x011e }
        r1.b(r2, r6);	 Catch:{ all -> 0x011e }
        r6 = r5.a();	 Catch:{ all -> 0x011e }
        if (r6 != 0) goto L_0x00ef;
    L_0x00d8:
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.d;	 Catch:{ all -> 0x011e }
        r6 = r6.c;	 Catch:{ all -> 0x011e }
        r6 = r6.getClassName();	 Catch:{ all -> 0x011e }
        r6 = r1.c(r6);	 Catch:{ all -> 0x011e }
        if (r6 != 0) goto L_0x00ef;
    L_0x00e8:
        r6 = r5.e;	 Catch:{ all -> 0x011e }
        r1 = r6.b;	 Catch:{ all -> 0x011e }
        r6.stopSelf(r1);	 Catch:{ all -> 0x011e }
    L_0x00ef:
        monitor-exit(r0);	 Catch:{ all -> 0x011e }
        return;
    L_0x00f1:
        r1 = r5.e;	 Catch:{ all -> 0x011e }
        r2 = r1.d;	 Catch:{ all -> 0x011e }
        r3 = r5.a;	 Catch:{ all -> 0x011e }
        r1 = r1.c;	 Catch:{ all -> 0x011e }
        r1 = r1.getClassName();	 Catch:{ all -> 0x011e }
        r2.b(r3, r1);	 Catch:{ all -> 0x011e }
        r1 = r5.a();	 Catch:{ all -> 0x011e }
        if (r1 != 0) goto L_0x011d;
    L_0x0106:
        r1 = r5.e;	 Catch:{ all -> 0x011e }
        r2 = r1.d;	 Catch:{ all -> 0x011e }
        r1 = r1.c;	 Catch:{ all -> 0x011e }
        r1 = r1.getClassName();	 Catch:{ all -> 0x011e }
        r1 = r2.c(r1);	 Catch:{ all -> 0x011e }
        if (r1 != 0) goto L_0x011d;
    L_0x0116:
        r1 = r5.e;	 Catch:{ all -> 0x011e }
        r2 = r1.b;	 Catch:{ all -> 0x011e }
        r1.stopSelf(r2);	 Catch:{ all -> 0x011e }
    L_0x011d:
        throw r6;	 Catch:{ all -> 0x011e }
    L_0x011e:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x011e }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfd.a(int):void");
    }

    private final boolean a() {
        return this.d != null;
    }
}
