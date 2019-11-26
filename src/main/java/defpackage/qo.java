package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: qo */
final class qo implements ServiceConnection, Callback {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    qo(Context context) {
        this.b = context;
        this.c = new HandlerThread("NotificationManagerCompat");
        this.c.start();
        this.a = new Handler(this.c.getLooper(), this);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        qr qrVar;
        if (i == 0) {
            Iterator it;
            qq qqVar = (qq) message.obj;
            Set b = qk.b(this.b);
            if (!b.equals(this.e)) {
                this.e = b;
                List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (b.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Permission present on component ");
                            stringBuilder.append(componentName);
                            stringBuilder.append(", not adding listener record.");
                            Log.w("NotifManCompat", stringBuilder.toString());
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.d.containsKey(componentName2)) {
                        this.d.put(componentName2, new qr(componentName2));
                    }
                }
                it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        a((qr) entry.getValue());
                        it.remove();
                    }
                }
            }
            for (qr qrVar2 : this.d.values()) {
                qrVar2.d.add(qqVar);
                c(qrVar2);
            }
            return true;
        } else if (i == 1) {
            qp qpVar = (qp) message.obj;
            ComponentName componentName3 = qpVar.a;
            IBinder iBinder = qpVar.b;
            qr qrVar3 = (qr) this.d.get(componentName3);
            if (qrVar3 != null) {
                pj piVar;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    piVar = (queryLocalInterface == null || !(queryLocalInterface instanceof pj)) ? new pi(iBinder) : (pj) queryLocalInterface;
                } else {
                    piVar = null;
                }
                qrVar3.c = piVar;
                qrVar3.e = 0;
                c(qrVar3);
            }
            return true;
        } else if (i == 2) {
            qrVar = (qr) this.d.get((ComponentName) message.obj);
            if (qrVar != null) {
                a(qrVar);
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            qrVar = (qr) this.d.get((ComponentName) message.obj);
            if (qrVar != null) {
                c(qrVar);
            }
            return true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new qp(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }

    private final void a(qr qrVar) {
        if (qrVar.b) {
            this.b.unbindService(this);
            qrVar.b = false;
        }
        qrVar.c = null;
    }

    private final void b(qr qrVar) {
        if (!this.a.hasMessages(3, qrVar.a)) {
            int i = qrVar.e + 1;
            qrVar.e = i;
            if (i > 6) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Giving up on delivering ");
                stringBuilder.append(qrVar.d.size());
                stringBuilder.append(" tasks to ");
                stringBuilder.append(qrVar.a);
                stringBuilder.append(" after ");
                stringBuilder.append(qrVar.e);
                stringBuilder.append(" retries");
                Log.w("NotifManCompat", stringBuilder.toString());
                qrVar.d.clear();
                return;
            }
            this.a.sendMessageDelayed(this.a.obtainMessage(3, qrVar.a), (long) ((1 << (i - 1)) * 1000));
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0048, code skipped:
            if (r5.b != false) goto L_0x004a;
     */
    private final void c(defpackage.qr r5) {
        /*
        r4 = this;
        r0 = r5.d;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x008b;
    L_0x0008:
        r0 = r5.b;
        r1 = "NotifManCompat";
        if (r0 != 0) goto L_0x004a;
    L_0x000e:
        r0 = new android.content.Intent;
        r2 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
        r0.<init>(r2);
        r2 = r5.a;
        r0 = r0.setComponent(r2);
        r2 = r4.b;
        r3 = 33;
        r0 = r2.bindService(r0, r4, r3);
        r5.b = r0;
        if (r0 == 0) goto L_0x002b;
    L_0x0027:
        r0 = 0;
        r5.e = r0;
        goto L_0x0046;
    L_0x002b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "Unable to bind to listener ";
        r0.append(r2);
        r2 = r5.a;
        r0.append(r2);
        r0 = r0.toString();
        android.util.Log.w(r1, r0);
        r0 = r4.b;
        r0.unbindService(r4);
    L_0x0046:
        r0 = r5.b;
        if (r0 == 0) goto L_0x0088;
    L_0x004a:
        r0 = r5.c;
        if (r0 == 0) goto L_0x0088;
    L_0x004e:
        r0 = r5.d;
        r0 = r0.peek();
        r0 = (defpackage.qq) r0;
        if (r0 == 0) goto L_0x007c;
    L_0x0058:
        r2 = r5.c;	 Catch:{ DeadObjectException -> 0x007b, RemoteException -> 0x0063 }
        r0.a(r2);	 Catch:{ DeadObjectException -> 0x007b, RemoteException -> 0x0063 }
        r0 = r5.d;	 Catch:{ DeadObjectException -> 0x007b, RemoteException -> 0x0063 }
        r0.remove();	 Catch:{ DeadObjectException -> 0x007b, RemoteException -> 0x0063 }
        goto L_0x004e;
    L_0x0063:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "RemoteException communicating with ";
        r2.append(r3);
        r3 = r5.a;
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.w(r1, r2, r0);
        goto L_0x007c;
    L_0x007c:
        r0 = r5.d;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0087;
    L_0x0084:
        r4.b(r5);
    L_0x0087:
        return;
    L_0x0088:
        r4.b(r5);
    L_0x008b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.c(qr):void");
    }
}
