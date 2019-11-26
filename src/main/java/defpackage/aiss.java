package defpackage;

import android.app.Notification;
import android.app.Service;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aiss */
public final class aiss {
    private final Handler a;
    private final zzf b;
    private final Runnable c = new aisv(this);
    private final aitk d;
    private final bcaa e;
    private final bcaa f;
    private Service g;
    private Notification h;
    private boolean i;
    private final List j;

    public aiss(bcaa bcaa, Handler handler, zzf zzf, aitk aitk, bcaa bcaa2) {
        this.a = (Handler) amqw.a((Object) handler);
        this.f = (bcaa) amqw.a((Object) bcaa);
        this.b = (zzf) amqw.a((Object) zzf);
        this.e = (bcaa) amqw.a((Object) bcaa2);
        this.d = aitk;
        this.j = new ArrayList();
    }

    public final synchronized void a(Service service) {
        if (!this.j.contains(service)) {
            if (this.i) {
                aitk aitk = this.d;
                if (aitk.d() || aitk.e()) {
                    Notification notification = this.h;
                    if (notification != null) {
                        service.startForeground(2, notification);
                    }
                }
            }
        }
        this.j.add(service);
    }

    public final synchronized void b(Service service) {
        this.j.remove(service);
    }

    public final synchronized void c(Service service) {
        this.g = service;
    }

    public final synchronized void a(boolean z) {
        if (z) {
            ((ajlg) this.e.get()).c();
        }
        this.g = null;
    }

    public final synchronized void a() {
        if (this.i) {
            Service service = this.g;
            if (service != null) {
                service.stopForeground(false);
            }
            for (Service stopForeground : this.j) {
                stopForeground.stopForeground(false);
            }
            this.i = false;
        }
    }

    /* JADX WARNING: Missing block: B:6:0x0016, code skipped:
            if (r4.j.isEmpty() == false) goto L_0x0018;
     */
    /* JADX WARNING: Missing block: B:15:0x002d, code skipped:
            if (r6 != false) goto L_0x002f;
     */
    public final synchronized void a(android.app.Notification r5, boolean r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.a;	 Catch:{ all -> 0x0073 }
        r1 = r4.c;	 Catch:{ all -> 0x0073 }
        r0.removeCallbacks(r1);	 Catch:{ all -> 0x0073 }
        r4.h = r5;	 Catch:{ all -> 0x0073 }
        r0 = r4.g;	 Catch:{ all -> 0x0073 }
        r1 = 2;
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0018;
    L_0x0010:
        r0 = r4.j;	 Catch:{ all -> 0x0073 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0073 }
        if (r0 != 0) goto L_0x0056;
    L_0x0018:
        r0 = r4.b;	 Catch:{ all -> 0x0073 }
        r0 = r0.x();	 Catch:{ all -> 0x0073 }
        r0 = r0.G;	 Catch:{ all -> 0x0073 }
        if (r0 != 0) goto L_0x0024;
    L_0x0022:
        r0 = defpackage.aovh.c;	 Catch:{ all -> 0x0073 }
    L_0x0024:
        r0 = r0.b;	 Catch:{ all -> 0x0073 }
        if (r0 != 0) goto L_0x002f;
    L_0x0028:
        r0 = r4.i;	 Catch:{ all -> 0x0073 }
        if (r0 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0056;
    L_0x002d:
        if (r6 == 0) goto L_0x0056;
    L_0x002f:
        r6 = r4.g;	 Catch:{ all -> 0x0073 }
        if (r6 == 0) goto L_0x0036;
    L_0x0033:
        r6.startForeground(r1, r5);	 Catch:{ all -> 0x0073 }
    L_0x0036:
        r6 = r4.j;	 Catch:{ all -> 0x0073 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0073 }
    L_0x003c:
        r0 = r6.hasNext();	 Catch:{ all -> 0x0073 }
        if (r0 == 0) goto L_0x004c;
    L_0x0042:
        r0 = r6.next();	 Catch:{ all -> 0x0073 }
        r0 = (android.app.Service) r0;	 Catch:{ all -> 0x0073 }
        r0.startForeground(r1, r5);	 Catch:{ all -> 0x0073 }
        goto L_0x003c;
    L_0x004c:
        r5 = 1;
        r4.i = r5;	 Catch:{ all -> 0x0073 }
        r5 = r4.d;	 Catch:{ all -> 0x0073 }
        r5.b();	 Catch:{ all -> 0x0073 }
        monitor-exit(r4);
        return;
    L_0x0056:
        r0 = r4.i;	 Catch:{ all -> 0x0073 }
        if (r0 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0066;
    L_0x005b:
        if (r6 != 0) goto L_0x0066;
    L_0x005d:
        r6 = r4.a;	 Catch:{ all -> 0x0073 }
        r0 = r4.c;	 Catch:{ all -> 0x0073 }
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r6.postDelayed(r0, r2);	 Catch:{ all -> 0x0073 }
    L_0x0066:
        r6 = r4.f;	 Catch:{ all -> 0x0073 }
        r6 = r6.get();	 Catch:{ all -> 0x0073 }
        r6 = (defpackage.qk) r6;	 Catch:{ all -> 0x0073 }
        r6.a(r1, r5);	 Catch:{ all -> 0x0073 }
        monitor-exit(r4);
        return;
    L_0x0073:
        r5 = move-exception;
        monitor-exit(r4);
        goto L_0x0077;
    L_0x0076:
        throw r5;
    L_0x0077:
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiss.a(android.app.Notification, boolean):void");
    }

    public final synchronized void b() {
        this.a.removeCallbacks(this.c);
        if (this.i) {
            Service service = this.g;
            if (service != null) {
                service.stopForeground(true);
            }
            for (Service stopForeground : this.j) {
                stopForeground.stopForeground(true);
            }
            this.i = false;
        }
        this.d.c();
        ((qk) this.f.get()).a(2);
        this.h = null;
    }
}
