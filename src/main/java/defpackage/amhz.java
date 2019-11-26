package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: amhz */
public final class amhz extends amgh {
    public final ScheduledExecutorService a;
    public final amav c;
    public final alys d;
    public final alyz e;
    public final Map f = new HashMap();
    private final ambf h = new amid(this);

    public amhz(ScheduledExecutorService scheduledExecutorService, alys alys, alyz alyz, amav amav, ambw ambw) {
        super(35, ambw);
        this.a = scheduledExecutorService;
        this.d = alys;
        this.e = alyz;
        this.c = amav;
        amav.a(this.h);
    }

    public final String a() {
        return "UploadFeedbackTask";
    }

    public final amcj b() {
        return null;
    }

    public final boolean d() {
        return false;
    }

    public final amec a(amea amea) {
        amec amec = amea.I;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amic.a;
    }

    public final anjv a(String str, amea amea) {
        return amnb.a(TimeUnit.HOURS, this.a).a(new amib(this, str, amea));
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r0 == 2) goto L_0x0039;
     */
    /* JADX WARNING: Missing block: B:20:0x0036, code skipped:
            if (r0 == 2) goto L_0x0039;
     */
    public final boolean b(defpackage.amea r5) {
        /*
        r4 = this;
        r0 = r5.h;
        r0 = defpackage.amek.a(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        goto L_0x000b;
    L_0x000a:
        r0 = 1;
    L_0x000b:
        r0 = r0 + -1;
        r2 = 2;
        if (r0 == r1) goto L_0x0028;
    L_0x0010:
        r3 = 3;
        if (r0 == r3) goto L_0x0039;
    L_0x0013:
        r3 = 4;
        if (r0 == r3) goto L_0x0017;
    L_0x0016:
        goto L_0x0041;
    L_0x0017:
        r0 = r5.v;
        if (r0 != 0) goto L_0x001d;
    L_0x001b:
        r0 = defpackage.amec.g;
    L_0x001d:
        r0 = r0.b;
        r0 = defpackage.amee.a(r0);
        if (r0 == 0) goto L_0x0041;
    L_0x0025:
        if (r0 != r2) goto L_0x0041;
    L_0x0027:
        goto L_0x0039;
    L_0x0028:
        r0 = r5.u;
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        r0 = defpackage.amec.g;
    L_0x002e:
        r0 = r0.b;
        r0 = defpackage.amee.a(r0);
        if (r0 == 0) goto L_0x0041;
    L_0x0036:
        if (r0 == r2) goto L_0x0039;
    L_0x0038:
        goto L_0x0041;
    L_0x0039:
        r5 = r5.a;
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r5 = r5 & r0;
        if (r5 == 0) goto L_0x0041;
    L_0x0040:
        return r1;
    L_0x0041:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhz.b(amea):boolean");
    }

    /* JADX WARNING: Missing block: B:11:0x0029, code skipped:
            return;
     */
    public final void a(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.f;
        monitor-enter(r0);
        if (r4 == 0) goto L_0x0028;
    L_0x0005:
        r1 = r3.f;	 Catch:{ all -> 0x002a }
        r1 = r1.containsKey(r4);	 Catch:{ all -> 0x002a }
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0028;
    L_0x000e:
        r1 = r3.f;	 Catch:{ all -> 0x002a }
        r4 = r1.remove(r4);	 Catch:{ all -> 0x002a }
        r4 = (android.util.Pair) r4;	 Catch:{ all -> 0x002a }
        r4 = r4.second;	 Catch:{ all -> 0x002a }
        r4 = (defpackage.amne) r4;	 Catch:{ all -> 0x002a }
        r1 = defpackage.amjq.a();	 Catch:{ all -> 0x002a }
        r2 = 1;
        r1 = r3.a(r1, r2);	 Catch:{ all -> 0x002a }
        r4.a(r1);	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;
    L_0x0028:
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;
    L_0x002a:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhz.a(java.lang.String):void");
    }
}
