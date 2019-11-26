package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aeyt */
final class aeyt implements aesx, nyf {
    public final Handler a;
    public final aeyw b;
    public final Map c = new HashMap();
    public oef d;
    public int e = 0;
    public boolean f;
    public boolean g;
    private final aetq h;
    private final nye i;
    private final afjj j;
    private final odr k;

    aeyt(aetb aetb, HashMap hashMap, Handler handler, aeyw aeyw, afjj afjj, odr odr) {
        this.h = new aetq(aetb, handler, this);
        this.i = new nye(nyr.d, this.h, hashMap, handler, this, new aero());
        this.a = handler;
        this.b = aeyw;
        this.j = afjj;
        this.k = odr;
    }

    public final void g() {
    }

    public final void h() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str, String str2, String str3, String str4, String str5, aajj aajj, boolean z) {
        String str6;
        String valueOf;
        nye nye;
        oef oef;
        this.e = 1;
        this.f = z;
        this.c.clear();
        this.g = aajj.ap();
        String str7 = null;
        if (this.d == null) {
            this.d = oef.a(nyr.d);
            nye = this.i;
            Object obj = this.d;
            oxz.a(obj);
            if (nye.d == null) {
                nye.d = obj;
                if (ozp.a >= 21) {
                    try {
                        obj.a("sessionSharing", "enable");
                        nye.c = true;
                    } catch (IllegalStateException e) {
                        afpf afpf = afpf.media;
                        str = e.getLocalizedMessage();
                        int length = str6.length();
                        StringBuilder stringBuilder = new StringBuilder(((length + 33) + valueOf.length()) + String.valueOf(str).length());
                        stringBuilder.append("Cannot set mediaDrm property securityLevel to L3");
                        stringBuilder.append(str);
                        afpc.a(1, afpf, stringBuilder.toString());
                        throw new oem();
                    } catch (Exception e2) {
                        valueOf = String.valueOf(e2);
                        StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 29);
                        stringBuilder2.append("failed to set sessionSharing:");
                        stringBuilder2.append(valueOf);
                        Log.w("YTDrmSessionMgr", stringBuilder2.toString());
                        nye.c = false;
                    }
                }
                obj.a.setOnEventListener(new oei(new nyi(nye)));
            }
            if (VERSION.SDK_INT < 23 || !this.g) {
                this.g = false;
            } else {
                oef = this.d;
                aeys aeys = new aeys(this);
                if (ozp.a >= 23) {
                    oef.a.setOnKeyStatusChangeListener(new oeh(oef, aeys), null);
                } else {
                    throw new UnsupportedOperationException();
                }
            }
        }
        if (this.d != null) {
            nye = this.i;
            int X = aajj.X();
            if (X > 0) {
                nye.e = X;
            }
            if (aajj.U()) {
                oef = this.d;
                str6 = "securityLevel";
                valueOf = "L3";
                if (oef != null) {
                    oef.a(str6, valueOf);
                }
            }
            aetq aetq = this.h;
            if (!aajj.V()) {
                str7 = str;
            }
            aetq.a(str7, str2, str3, str4, str5);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void j() {
        this.e = 0;
    }

    public final void a(Exception exception) {
        this.k.a(exception);
    }

    public final void a() {
        this.j.k();
    }

    public final void b() {
        this.j.l();
    }

    public final void c() {
        this.j.m();
    }

    public final void d() {
        this.j.m();
    }

    public final void e() {
        this.j.n();
    }

    public final void f() {
        this.j.o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Missing block: B:23:0x003e, code skipped:
            return;
     */
    public final synchronized void i() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.g;	 Catch:{ all -> 0x003f }
        if (r0 != 0) goto L_0x003d;
    L_0x0005:
        r0 = r6.e;	 Catch:{ all -> 0x003f }
        r1 = 2;
        if (r0 == r1) goto L_0x003d;
    L_0x000a:
        r0 = r6.b;	 Catch:{ all -> 0x003f }
        r2 = r6.d;	 Catch:{ all -> 0x003f }
        r3 = 4;
        r4 = 3;
        if (r2 == 0) goto L_0x002c;
    L_0x0012:
        r2 = "L1";
        r5 = "securityLevel";
        r5 = r6.a(r5);	 Catch:{ all -> 0x003f }
        r2 = r2.equals(r5);	 Catch:{ all -> 0x003f }
        if (r2 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x002c;
    L_0x0021:
        r2 = r6.f;	 Catch:{ all -> 0x003f }
        if (r2 != 0) goto L_0x0028;
    L_0x0025:
        r6.e = r3;	 Catch:{ all -> 0x003f }
        goto L_0x002f;
    L_0x0028:
        r6.e = r1;	 Catch:{ all -> 0x003f }
        r3 = 2;
        goto L_0x002f;
    L_0x002c:
        r6.e = r4;	 Catch:{ all -> 0x003f }
        r3 = 3;
    L_0x002f:
        if (r3 != r1) goto L_0x0033;
    L_0x0031:
        r1 = 1;
        goto L_0x0034;
    L_0x0033:
        r1 = 0;
    L_0x0034:
        r2 = r6.k();	 Catch:{ all -> 0x003f }
        r0.a(r1, r2);	 Catch:{ all -> 0x003f }
        monitor-exit(r6);
        return;
    L_0x003d:
        monitor-exit(r6);
        return;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyt.i():void");
    }

    public final String k() {
        int i = this.e;
        switch (i) {
            case 0:
                return "Clear";
            case 1:
                return "SD";
            case 2:
                return "HD";
            case 3:
                return "WidevineL1";
            case 4:
                return "SecureSurfaceUnavailable";
            case 5:
                return "DeviceBlacklisted";
            case 6:
                return "KeyStatus";
            default:
                StringBuilder stringBuilder = new StringBuilder(25);
                stringBuilder.append("UnknownHDState");
                stringBuilder.append(i);
                return stringBuilder.toString();
        }
    }

    public final synchronized void a(Map map) {
        for (String str : map.keySet()) {
            if (!this.c.containsKey(str)) {
                this.c.put(str, new aeyz((Integer) map.get(str)));
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:22:0x0066, code skipped:
            return;
     */
    public final synchronized void a(java.util.List r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.g;	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x0065;
    L_0x0005:
        r0 = r5.e;	 Catch:{ all -> 0x0067 }
        r1 = 2;
        if (r0 == r1) goto L_0x0065;
    L_0x000a:
        r6 = r6.iterator();	 Catch:{ all -> 0x0067 }
    L_0x000e:
        r0 = r6.hasNext();	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x0063;
    L_0x0014:
        r0 = r6.next();	 Catch:{ all -> 0x0067 }
        r0 = (defpackage.oec) r0;	 Catch:{ all -> 0x0067 }
        r2 = r0.a;	 Catch:{ all -> 0x0067 }
        r0 = r0.b;	 Catch:{ all -> 0x0067 }
        r0 = defpackage.aerr.a(r0);	 Catch:{ all -> 0x0067 }
        r3 = r5.c;	 Catch:{ all -> 0x0067 }
        r3 = r3.containsKey(r0);	 Catch:{ all -> 0x0067 }
        if (r3 == 0) goto L_0x000e;
    L_0x002a:
        r3 = r5.c;	 Catch:{ all -> 0x0067 }
        r0 = r3.get(r0);	 Catch:{ all -> 0x0067 }
        r0 = (defpackage.aeyz) r0;	 Catch:{ all -> 0x0067 }
        r0.b = r2;	 Catch:{ all -> 0x0067 }
        r3 = r5.e;	 Catch:{ all -> 0x0067 }
        r4 = 1;
        if (r3 != r4) goto L_0x000e;
    L_0x0039:
        r0 = r0.a;	 Catch:{ all -> 0x0067 }
        r3 = 3;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0067 }
        r0 = r0.equals(r3);	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x000e;
    L_0x0046:
        if (r2 != 0) goto L_0x0055;
    L_0x0048:
        r5.e = r1;	 Catch:{ all -> 0x0067 }
        r0 = r5.a;	 Catch:{ all -> 0x0067 }
        r2 = new aeyv;	 Catch:{ all -> 0x0067 }
        r2.<init>(r5);	 Catch:{ all -> 0x0067 }
        r0.post(r2);	 Catch:{ all -> 0x0067 }
        goto L_0x000e;
    L_0x0055:
        r0 = 6;
        r5.e = r0;	 Catch:{ all -> 0x0067 }
        r0 = r5.a;	 Catch:{ all -> 0x0067 }
        r3 = new aeyu;	 Catch:{ all -> 0x0067 }
        r3.<init>(r5, r2);	 Catch:{ all -> 0x0067 }
        r0.post(r3);	 Catch:{ all -> 0x0067 }
        goto L_0x000e;
    L_0x0063:
        monitor-exit(r5);
        return;
    L_0x0065:
        monitor-exit(r5);
        return;
    L_0x0067:
        r6 = move-exception;
        monitor-exit(r5);
        goto L_0x006b;
    L_0x006a:
        throw r6;
    L_0x006b:
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyt.a(java.util.List):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean l() {
        return this.e == 2;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized odw m() {
        return this.i;
    }

    /* Access modifiers changed, original: final */
    public final String a(String str) {
        oef oef = this.d;
        if (oef != null) {
            Object str2;
            try {
                str2 = oef.a(str2);
                return str2;
            } catch (Throwable th) {
                afpf afpf = afpf.media;
                String localizedMessage = th.getLocalizedMessage();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 29) + String.valueOf(localizedMessage).length());
                stringBuilder.append("Cannot get mediaDrm property ");
                stringBuilder.append(str2);
                stringBuilder.append(localizedMessage);
                afpc.a(1, afpf, stringBuilder.toString());
            }
        }
        return "";
    }
}
