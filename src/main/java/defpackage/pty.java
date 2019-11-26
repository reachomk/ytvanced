package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pty */
public final class pty implements Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object f = new Object();
    private static pty n;
    public final long c = 5000;
    public final long d = 120000;
    public long e = 10000;
    public final Context g;
    public final qao h;
    public final AtomicInteger i = new AtomicInteger(0);
    public final Map j = new ConcurrentHashMap(5, 0.75f, 1);
    public puv k = null;
    public final Set l = new zl();
    public final Handler m;
    private final psf o;
    private final AtomicInteger p = new AtomicInteger(1);
    private final Set q = new zl();

    public static pty a(Context context) {
        pty pty;
        synchronized (f) {
            if (n == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                n = new pty(context.getApplicationContext(), handlerThread.getLooper(), psf.a);
            }
            pty = n;
        }
        return pty;
    }

    private pty(Context context, Looper looper, psf psf) {
        this.g = context;
        this.m = new Handler(looper, this);
        this.o = psf;
        this.h = new qao(psf);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public final int a() {
        return this.p.getAndIncrement();
    }

    public final void a(psz psz) {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(7, psz));
    }

    private final void b(psz psz) {
        pxd pxd = psz.c;
        ptx ptx = (ptx) this.j.get(pxd);
        if (ptx == null) {
            ptx = new ptx(this, psz);
            this.j.put(pxd, ptx);
        }
        if (ptx.i()) {
            this.q.add(pxd);
        }
        ptx.h();
    }

    public final void a(puv puv) {
        synchronized (f) {
            if (this.k != puv) {
                this.k = puv;
                this.l.clear();
            }
            this.l.addAll(puv.b);
        }
    }

    public final void b() {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0245  */
    public final boolean handleMessage(android.os.Message r11) {
        /*
        r10 = this;
        r0 = r11.what;
        r1 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;
        r3 = "GoogleApiManager";
        r4 = 0;
        r5 = 1;
        switch(r0) {
            case 1: goto L_0x0367;
            case 2: goto L_0x030a;
            case 3: goto L_0x02ed;
            case 4: goto L_0x02a7;
            case 5: goto L_0x0221;
            case 6: goto L_0x01d1;
            case 7: goto L_0x01c8;
            case 8: goto L_0x02a7;
            case 9: goto L_0x01a4;
            case 10: goto L_0x017f;
            case 11: goto L_0x0134;
            case 12: goto L_0x011b;
            case 13: goto L_0x02a7;
            case 14: goto L_0x00eb;
            case 15: goto L_0x00b5;
            case 16: goto L_0x0025;
            default: goto L_0x000c;
        };
    L_0x000c:
        r11 = r11.what;
        r0 = new java.lang.StringBuilder;
        r1 = 31;
        r0.<init>(r1);
        r1 = "Unknown message id: ";
        r0.append(r1);
        r0.append(r11);
        r11 = r0.toString();
        android.util.Log.w(r3, r11);
        return r4;
    L_0x0025:
        r11 = r11.obj;
        r11 = (defpackage.pua) r11;
        r0 = r10.j;
        r1 = r11.a;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x039f;
    L_0x0033:
        r0 = r10.j;
        r1 = r11.a;
        r0 = r0.get(r1);
        r0 = (defpackage.ptx) r0;
        r1 = r0.g;
        r1 = r1.remove(r11);
        if (r1 == 0) goto L_0x039f;
    L_0x0045:
        r1 = r0.h;
        r1 = r1.m;
        r2 = 15;
        r1.removeMessages(r2, r11);
        r1 = r0.h;
        r1 = r1.m;
        r2 = 16;
        r1.removeMessages(r2, r11);
        r11 = r11.b;
        r1 = new java.util.ArrayList;
        r2 = r0.a;
        r2 = r2.size();
        r1.<init>(r2);
        r2 = r0.a;
        r2 = r2.iterator();
    L_0x006a:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0098;
    L_0x0070:
        r3 = r2.next();
        r3 = (defpackage.pvm) r3;
        r6 = r3 instanceof defpackage.pwi;
        if (r6 == 0) goto L_0x006a;
    L_0x007a:
        r6 = r3;
        r6 = (defpackage.pwi) r6;
        r6 = r6.b(r0);
        if (r6 == 0) goto L_0x006a;
    L_0x0083:
        r7 = r6.length;
        r8 = 0;
    L_0x0085:
        if (r8 >= r7) goto L_0x006a;
    L_0x0087:
        r9 = r6[r8];
        r9 = defpackage.pzj.a(r9, r11);
        if (r9 != 0) goto L_0x0092;
    L_0x008f:
        r8 = r8 + 1;
        goto L_0x0085;
    L_0x0092:
        if (r8 < 0) goto L_0x006a;
    L_0x0094:
        r1.add(r3);
        goto L_0x006a;
    L_0x0098:
        r2 = r1.size();
    L_0x009c:
        if (r4 >= r2) goto L_0x039f;
    L_0x009e:
        r3 = r4 + 1;
        r4 = r1.get(r4);
        r4 = (defpackage.pvm) r4;
        r6 = r0.a;
        r6.remove(r4);
        r6 = new pto;
        r6.<init>(r11);
        r4.a(r6);
        r4 = r3;
        goto L_0x009c;
    L_0x00b5:
        r11 = r11.obj;
        r11 = (defpackage.pua) r11;
        r0 = r10.j;
        r1 = r11.a;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x039f;
    L_0x00c3:
        r0 = r10.j;
        r1 = r11.a;
        r0 = r0.get(r1);
        r0 = (defpackage.ptx) r0;
        r1 = r0.g;
        r11 = r1.contains(r11);
        if (r11 == 0) goto L_0x039f;
    L_0x00d5:
        r11 = r0.f;
        if (r11 != 0) goto L_0x039f;
    L_0x00d9:
        r11 = r0.b;
        r11 = r11.i();
        if (r11 != 0) goto L_0x00e6;
    L_0x00e1:
        r0.h();
        goto L_0x039f;
    L_0x00e6:
        r0.c();
        goto L_0x039f;
    L_0x00eb:
        r11 = r11.obj;
        r11 = (defpackage.puu) r11;
        r0 = r11.a;
        r1 = r10.j;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x0110;
    L_0x00f9:
        r1 = r10.j;
        r0 = r1.get(r0);
        r0 = (defpackage.ptx) r0;
        r0 = r0.a(r4);
        r11 = r11.b;
        r0 = java.lang.Boolean.valueOf(r0);
        r11.a(r0);
        goto L_0x039f;
    L_0x0110:
        r11 = r11.b;
        r0 = java.lang.Boolean.valueOf(r4);
        r11.a(r0);
        goto L_0x039f;
    L_0x011b:
        r0 = r10.j;
        r1 = r11.obj;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x039f;
    L_0x0125:
        r0 = r10.j;
        r11 = r11.obj;
        r11 = r0.get(r11);
        r11 = (defpackage.ptx) r11;
        r11.a(r5);
        goto L_0x039f;
    L_0x0134:
        r0 = r10.j;
        r1 = r11.obj;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x039f;
    L_0x013e:
        r0 = r10.j;
        r11 = r11.obj;
        r11 = r0.get(r11);
        r11 = (defpackage.ptx) r11;
        r0 = r11.h;
        r0 = r0.m;
        defpackage.pzr.a(r0);
        r0 = r11.f;
        if (r0 == 0) goto L_0x039f;
    L_0x0153:
        r11.g();
        r0 = r11.h;
        r1 = r0.o;
        r0 = r0.g;
        r0 = r1.c(r0);
        r1 = 18;
        r2 = 8;
        if (r0 != r1) goto L_0x016e;
    L_0x0166:
        r0 = new com.google.android.gms.common.api.Status;
        r1 = "Connection timed out while waiting for Google Play services update to complete.";
        r0.<init>(r2, r1);
        goto L_0x0175;
    L_0x016e:
        r0 = new com.google.android.gms.common.api.Status;
        r1 = "API failed to connect while resuming due to an unknown error.";
        r0.<init>(r2, r1);
    L_0x0175:
        r11.a(r0);
        r11 = r11.b;
        r11.e();
        goto L_0x039f;
    L_0x017f:
        r11 = r10.q;
        r11 = r11.iterator();
    L_0x0185:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x019d;
    L_0x018b:
        r0 = r11.next();
        r0 = (defpackage.pxd) r0;
        r1 = r10.j;
        r0 = r1.remove(r0);
        r0 = (defpackage.ptx) r0;
        r0.d();
        goto L_0x0185;
    L_0x019d:
        r11 = r10.q;
        r11.clear();
        goto L_0x039f;
    L_0x01a4:
        r0 = r10.j;
        r1 = r11.obj;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x039f;
    L_0x01ae:
        r0 = r10.j;
        r11 = r11.obj;
        r11 = r0.get(r11);
        r11 = (defpackage.ptx) r11;
        r0 = r11.h;
        r0 = r0.m;
        defpackage.pzr.a(r0);
        r0 = r11.f;
        if (r0 == 0) goto L_0x039f;
    L_0x01c3:
        r11.h();
        goto L_0x039f;
    L_0x01c8:
        r11 = r11.obj;
        r11 = (defpackage.psz) r11;
        r10.b(r11);
        goto L_0x039f;
    L_0x01d1:
        r11 = r10.g;
        r11 = r11.getApplicationContext();
        r11 = r11 instanceof android.app.Application;
        if (r11 == 0) goto L_0x039f;
    L_0x01db:
        r11 = r10.g;
        r11 = r11.getApplicationContext();
        r11 = (android.app.Application) r11;
        defpackage.ptq.a(r11);
        r11 = defpackage.ptq.a;
        r0 = new pvu;
        r0.<init>(r10);
        r11.a(r0);
        r11 = defpackage.ptq.a;
        r0 = r11.c;
        r0 = r0.get();
        if (r0 != 0) goto L_0x0215;
    L_0x01fa:
        r0 = new android.app.ActivityManager$RunningAppProcessInfo;
        r0.<init>();
        android.app.ActivityManager.getMyMemoryState(r0);
        r3 = r11.c;
        r3 = r3.getAndSet(r5);
        if (r3 != 0) goto L_0x0215;
    L_0x020a:
        r0 = r0.importance;
        r3 = 100;
        if (r0 <= r3) goto L_0x0215;
    L_0x0210:
        r0 = r11.b;
        r0.set(r5);
    L_0x0215:
        r11 = r11.b;
        r11 = r11.get();
        if (r11 != 0) goto L_0x039f;
    L_0x021d:
        r10.e = r1;
        goto L_0x039f;
    L_0x0221:
        r0 = r11.arg1;
        r11 = r11.obj;
        r11 = (defpackage.psa) r11;
        r1 = r10.j;
        r1 = r1.values();
        r1 = r1.iterator();
    L_0x0231:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0242;
    L_0x0237:
        r2 = r1.next();
        r2 = (defpackage.ptx) r2;
        r4 = r2.e;
        if (r4 != r0) goto L_0x0231;
    L_0x0241:
        goto L_0x0243;
    L_0x0242:
        r2 = 0;
    L_0x0243:
        if (r2 != 0) goto L_0x0267;
    L_0x0245:
        r11 = new java.lang.StringBuilder;
        r1 = 76;
        r11.<init>(r1);
        r1 = "Could not find API instance ";
        r11.append(r1);
        r11.append(r0);
        r0 = " while trying to fail enqueued calls.";
        r11.append(r0);
        r11 = r11.toString();
        r0 = new java.lang.Exception;
        r0.<init>();
        android.util.Log.wtf(r3, r11, r0);
        goto L_0x039f;
    L_0x0267:
        r0 = new com.google.android.gms.common.api.Status;
        r1 = r11.b;
        r1 = defpackage.psl.a(r1);
        r11 = r11.d;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r4 = java.lang.String.valueOf(r11);
        r4 = r4.length();
        r6 = new java.lang.StringBuilder;
        r3 = r3 + 69;
        r3 = r3 + r4;
        r6.<init>(r3);
        r3 = "Error resolution was canceled by the user, original error message: ";
        r6.append(r3);
        r6.append(r1);
        r1 = ": ";
        r6.append(r1);
        r6.append(r11);
        r11 = 17;
        r1 = r6.toString();
        r0.<init>(r11, r1);
        r2.a(r0);
        goto L_0x039f;
    L_0x02a7:
        r11 = r11.obj;
        r11 = (defpackage.pwl) r11;
        r0 = r10.j;
        r1 = r11.c;
        r1 = r1.c;
        r0 = r0.get(r1);
        r0 = (defpackage.ptx) r0;
        if (r0 != 0) goto L_0x02ca;
    L_0x02b9:
        r0 = r11.c;
        r10.b(r0);
        r0 = r10.j;
        r1 = r11.c;
        r1 = r1.c;
        r0 = r0.get(r1);
        r0 = (defpackage.ptx) r0;
    L_0x02ca:
        r1 = r0.i();
        if (r1 == 0) goto L_0x02e6;
    L_0x02d0:
        r1 = r10.i;
        r1 = r1.get();
        r2 = r11.b;
        if (r1 == r2) goto L_0x02e6;
    L_0x02da:
        r11 = r11.a;
        r1 = a;
        r11.a(r1);
        r0.d();
        goto L_0x039f;
    L_0x02e6:
        r11 = r11.a;
        r0.a(r11);
        goto L_0x039f;
    L_0x02ed:
        r11 = r10.j;
        r11 = r11.values();
        r11 = r11.iterator();
    L_0x02f7:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x039f;
    L_0x02fd:
        r0 = r11.next();
        r0 = (defpackage.ptx) r0;
        r0.e();
        r0.h();
        goto L_0x02f7;
    L_0x030a:
        r11 = r11.obj;
        r11 = (defpackage.pxe) r11;
        r0 = r11.a;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x0318:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x039f;
    L_0x031e:
        r1 = r0.next();
        r1 = (defpackage.pxd) r1;
        r2 = r10.j;
        r1 = r2.get(r1);
        r1 = (defpackage.ptx) r1;
        if (r1 != 0) goto L_0x0339;
    L_0x032e:
        r11 = new psa;
        r0 = 13;
        r11.<init>(r0);
        defpackage.pxe.a();
        goto L_0x039f;
    L_0x0339:
        r2 = r1.b;
        r2 = r2.i();
        if (r2 == 0) goto L_0x034a;
    L_0x0341:
        r1 = r1.b;
        r1.n();
        defpackage.pxe.a();
        goto L_0x0318;
    L_0x034a:
        r2 = r1.f();
        if (r2 == 0) goto L_0x0357;
    L_0x0350:
        r1.f();
        defpackage.pxe.a();
        goto L_0x0318;
    L_0x0357:
        r2 = r1.h;
        r2 = r2.m;
        defpackage.pzr.a(r2);
        r2 = r1.c;
        r2.add(r11);
        r1.h();
        goto L_0x0318;
    L_0x0367:
        r11 = r11.obj;
        r11 = (java.lang.Boolean) r11;
        r11 = r11.booleanValue();
        if (r11 != 0) goto L_0x0372;
    L_0x0371:
        goto L_0x0374;
    L_0x0372:
        r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x0374:
        r10.e = r1;
        r11 = r10.m;
        r0 = 12;
        r11.removeMessages(r0);
        r11 = r10.j;
        r11 = r11.keySet();
        r11 = r11.iterator();
    L_0x0387:
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x039f;
    L_0x038d:
        r1 = r11.next();
        r1 = (defpackage.pxd) r1;
        r2 = r10.m;
        r1 = r2.obtainMessage(r0, r1);
        r3 = r10.e;
        r2.sendMessageDelayed(r1, r3);
        goto L_0x0387;
    L_0x039f:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pty.handleMessage(android.os.Message):boolean");
    }

    /* Access modifiers changed, original: final */
    public final boolean a(psa psa, int i) {
        PendingIntent pendingIntent;
        psf psf = this.o;
        Context context = this.g;
        if (psa.a()) {
            pendingIntent = psa.c;
        } else {
            pendingIntent = psf.b(context, psa.b, null);
        }
        if (pendingIntent == null) {
            return false;
        }
        psf.a(context, psa.b, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntent, i, true), 134217728));
        return true;
    }

    public final void b(psa psa, int i) {
        if (!a(psa, i)) {
            Handler handler = this.m;
            handler.sendMessage(handler.obtainMessage(5, i, 0, psa));
        }
    }
}
