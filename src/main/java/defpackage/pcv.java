package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: pcv */
public final class pcv {
    private qbl a;
    private rkk b;
    private boolean c;
    private final Object d;
    private pcx e;
    private final Context f;
    private final boolean g;
    private final long h;

    public pcv(Context context) {
        this(context, 30000, false, false);
    }

    public pcv(Context context, long j, boolean z, boolean z2) {
        this.d = new Object();
        pzr.a((Object) context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f = context;
        } else {
            this.f = context;
        }
        this.c = false;
        this.h = j;
        this.g = z2;
    }

    public final void a(boolean z) {
        IOException iOException;
        pzr.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                b();
            }
            Context context = this.f;
            boolean z2 = this.g;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int b = psh.b(context, 12451000);
                if (b != 0) {
                    if (b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                String str = !z2 ? "com.google.android.gms.ads.identifier.service.START" : "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
                qbl qbl = new qbl();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                qar.a();
                if (qar.b(context, intent, qbl, 1)) {
                    this.a = qbl;
                    qbl qbl2 = this.a;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    pzr.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                    if (qbl2.a) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    qbl2.a = true;
                    IBinder iBinder = (IBinder) qbl2.b.poll(10000, timeUnit);
                    if (iBinder != null) {
                        rkk rkk;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        if (queryLocalInterface instanceof rkk) {
                            rkk = (rkk) queryLocalInterface;
                        } else {
                            rkk = new rkj(iBinder);
                        }
                        this.b = rkk;
                        this.c = true;
                        if (z) {
                            c();
                        }
                    } else {
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                }
                throw new IOException("Connection failure");
            } catch (NameNotFoundException unused) {
                throw new psg(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                iOException = new IOException(th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    private final void c() {
        /*
        r6 = this;
        r0 = r6.d;
        monitor-enter(r0);
        r1 = r6.e;	 Catch:{ all -> 0x0022 }
        if (r1 == 0) goto L_0x0011;
    L_0x0007:
        r1 = r1.a;	 Catch:{ all -> 0x0022 }
        r1.countDown();	 Catch:{ all -> 0x0022 }
        r1 = r6.e;	 Catch:{ InterruptedException -> 0x0011 }
        r1.join();	 Catch:{ InterruptedException -> 0x0011 }
    L_0x0011:
        r1 = r6.h;	 Catch:{ all -> 0x0022 }
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x0020;
    L_0x0019:
        r3 = new pcx;	 Catch:{ all -> 0x0022 }
        r3.<init>(r6, r1);	 Catch:{ all -> 0x0022 }
        r6.e = r3;	 Catch:{ all -> 0x0022 }
    L_0x0020:
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        return;
    L_0x0022:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcv.c():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005b */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Missing block: B:41:0x0062, code skipped:
            throw new java.io.IOException("Remote exception");
     */
    public final defpackage.pcy a() {
        /*
        r3 = this;
        r0 = "Calling this from your main thread can lead to deadlock";
        defpackage.pzr.c(r0);
        monitor-enter(r3);
        r0 = r3.c;	 Catch:{ all -> 0x0063 }
        if (r0 != 0) goto L_0x003b;
    L_0x000a:
        r0 = r3.d;	 Catch:{ all -> 0x0063 }
        monitor-enter(r0);	 Catch:{ all -> 0x0063 }
        r1 = r3.e;	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x0030;
    L_0x0011:
        r1 = r1.b;	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x0030;
    L_0x0015:
        monitor-exit(r0);	 Catch:{ all -> 0x0038 }
        r0 = 0;
        r3.a(r0);	 Catch:{ Exception -> 0x0027 }
        r0 = r3.c;	 Catch:{ all -> 0x0063 }
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x003b;
    L_0x001f:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0063 }
        r1 = "AdvertisingIdClient cannot reconnect.";
        r0.<init>(r1);	 Catch:{ all -> 0x0063 }
        throw r0;	 Catch:{ all -> 0x0063 }
    L_0x0027:
        r0 = move-exception;
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0063 }
        r2 = "AdvertisingIdClient cannot reconnect.";
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0063 }
        throw r1;	 Catch:{ all -> 0x0063 }
    L_0x0030:
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0038 }
        r2 = "AdvertisingIdClient is not connected.";
        r1.<init>(r2);	 Catch:{ all -> 0x0038 }
        throw r1;	 Catch:{ all -> 0x0038 }
    L_0x0038:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0038 }
        throw r1;	 Catch:{ all -> 0x0063 }
    L_0x003b:
        r0 = r3.a;	 Catch:{ all -> 0x0063 }
        defpackage.pzr.a(r0);	 Catch:{ all -> 0x0063 }
        r0 = r3.b;	 Catch:{ all -> 0x0063 }
        defpackage.pzr.a(r0);	 Catch:{ all -> 0x0063 }
        r0 = new pcy;	 Catch:{ RemoteException -> 0x005b }
        r1 = r3.b;	 Catch:{ RemoteException -> 0x005b }
        r1 = r1.a();	 Catch:{ RemoteException -> 0x005b }
        r2 = r3.b;	 Catch:{ RemoteException -> 0x005b }
        r2 = r2.b();	 Catch:{ RemoteException -> 0x005b }
        r0.<init>(r1, r2);	 Catch:{ RemoteException -> 0x005b }
        monitor-exit(r3);	 Catch:{ all -> 0x0063 }
        r3.c();
        return r0;
    L_0x005b:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0063 }
        r1 = "Remote exception";
        r0.<init>(r1);	 Catch:{ all -> 0x0063 }
        throw r0;	 Catch:{ all -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0063 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcv.a():pcy");
    }

    /* JADX WARNING: Missing block: B:18:0x0028, code skipped:
            return;
     */
    public final void b() {
        /*
        r2 = this;
        r0 = "Calling this from your main thread can lead to deadlock";
        defpackage.pzr.c(r0);
        monitor-enter(r2);
        r0 = r2.f;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0027;
    L_0x000a:
        r0 = r2.a;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0027;
    L_0x000f:
        r0 = r2.c;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001d;
    L_0x0013:
        defpackage.qar.a();	 Catch:{ all -> 0x001d }
        r0 = r2.f;	 Catch:{ all -> 0x001d }
        r1 = r2.a;	 Catch:{ all -> 0x001d }
        r0.unbindService(r1);	 Catch:{ all -> 0x001d }
    L_0x001d:
        r0 = 0;
        r2.c = r0;	 Catch:{ all -> 0x0029 }
        r0 = 0;
        r2.b = r0;	 Catch:{ all -> 0x0029 }
        r2.a = r0;	 Catch:{ all -> 0x0029 }
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        return;
    L_0x0027:
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        return;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcv.b():void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        b();
        super.finalize();
    }

    public static boolean a(pcy pcy, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Object obj = "0";
        String str2 = "1";
        hashMap.put("app_context", !z ? obj : str2);
        if (pcy != null) {
            if (pcy.b) {
                obj = str2;
            }
            hashMap.put("limit_ad_tracking", obj);
        }
        if (pcy != null) {
            String str3 = pcy.a;
            if (str3 != null) {
                hashMap.put("ad_id_size", Integer.toString(str3.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (!(str == null || str.isEmpty())) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new pdc(hashMap).start();
        return true;
    }
}
