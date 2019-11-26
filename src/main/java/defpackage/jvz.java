package defpackage;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: jvz */
public final class jvz implements xcp {
    public final ejc a = new jvy(this);
    public final jvw b;
    public final Map c;
    public final Queue d;
    public final Queue e;
    public final jwe f;
    public final eif g;
    public boolean h;
    public boolean i;
    public boolean j;
    private final aulu k;
    private final AccessibilityStateChangeListener l = new jwb(this);
    private final ffw m;
    private Boolean n;

    public jvz(eif eif, zyw zyw, exu exu, jvw jvw, fnw fnw, xci xci, ffw ffw) {
        aulu aulu;
        this.g = eif;
        this.b = jvw;
        this.c = new HashMap();
        this.d = new PriorityQueue();
        this.e = new PriorityQueue(11, Collections.reverseOrder());
        this.f = new jwa(this);
        this.m = ffw;
        if ((zyw.a().a & 16) != 0) {
            aulu = zyw.a().e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
        } else {
            aulu = null;
        }
        this.k = aulu;
        exu.a(new jwf(this));
        fnw.a(this.l);
        xci.a((Object) this);
    }

    public final boolean a(ejd ejd) {
        boolean z = true;
        if (ejd != ejd.NONE) {
            if (ejd == ejd.INLINE_MUTED) {
                return this.i ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final void a(boolean z) {
        this.i = z;
        if (z) {
            a();
        } else {
            b();
        }
    }

    public final synchronized void a(jwc jwc, boolean z) {
        amqw.a((Object) jwc);
        jwd jwd = (jwd) amqw.a(a(jwc));
        if (jwd.b != z) {
            if (this.e.contains(jwd)) {
                this.e.remove(jwd);
                this.e.add(new jwd(jwc, z));
            } else {
                this.d.remove(jwd);
                this.d.add(new jwd(jwc, z));
            }
            a();
        }
    }

    public final jwd a(jwc jwc) {
        for (jwd jwd : this.d) {
            if (jwd.a == jwc) {
                return jwd;
            }
        }
        for (jwd jwd2 : this.e) {
            if (jwd2.a == jwc) {
                return jwd2;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A:{SYNTHETIC, Splitter:B:17:0x004b} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    /* JADX WARNING: Missing block: B:16:0x004a, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.d;	 Catch:{ all -> 0x0050 }
        r0 = r0.size();	 Catch:{ all -> 0x0050 }
        r1 = r3.k;	 Catch:{ all -> 0x0050 }
        r2 = 1;
        if (r1 == 0) goto L_0x0011;
    L_0x000c:
        r1 = r1.R;	 Catch:{ all -> 0x0050 }
        if (r1 <= 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0012;
    L_0x0011:
        r1 = 1;
    L_0x0012:
        if (r0 < r1) goto L_0x004b;
    L_0x0014:
        r0 = r3.d;	 Catch:{ all -> 0x0050 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0050 }
        r0 = r0 ^ r2;
        defpackage.amqw.b(r0);	 Catch:{ all -> 0x0050 }
        r0 = r3.e;	 Catch:{ all -> 0x0050 }
        r0 = r0.peek();	 Catch:{ all -> 0x0050 }
        r0 = (defpackage.jwd) r0;	 Catch:{ all -> 0x0050 }
        if (r0 == 0) goto L_0x0049;
    L_0x0028:
        r1 = r3.d;	 Catch:{ all -> 0x0050 }
        r1 = r1.peek();	 Catch:{ all -> 0x0050 }
        r1 = (defpackage.jwd) r1;	 Catch:{ all -> 0x0050 }
        r0 = r0.compareTo(r1);	 Catch:{ all -> 0x0050 }
        if (r0 > 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0049;
    L_0x0037:
        r0 = r1.a;	 Catch:{ all -> 0x0050 }
        r0.b();	 Catch:{ all -> 0x0050 }
        r0 = r3.d;	 Catch:{ all -> 0x0050 }
        r0.remove(r1);	 Catch:{ all -> 0x0050 }
        r0 = r3.e;	 Catch:{ all -> 0x0050 }
        r0.add(r1);	 Catch:{ all -> 0x0050 }
        r3.c();	 Catch:{ all -> 0x0050 }
    L_0x0049:
        monitor-exit(r3);
        return;
    L_0x004b:
        r3.c();	 Catch:{ all -> 0x0050 }
        monitor-exit(r3);
        return;
    L_0x0050:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvz.a():void");
    }

    /* JADX WARNING: Missing block: B:19:0x0042, code skipped:
            return;
     */
    private final synchronized void c() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.n;	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0011;
    L_0x0005:
        r0 = r2.m;	 Catch:{ all -> 0x0043 }
        r0 = r0.a();	 Catch:{ all -> 0x0043 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0043 }
        r2.n = r0;	 Catch:{ all -> 0x0043 }
    L_0x0011:
        r0 = r2.n;	 Catch:{ all -> 0x0043 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0041;
    L_0x0019:
        r0 = r2.g;	 Catch:{ all -> 0x0043 }
        r0 = r0.c();	 Catch:{ all -> 0x0043 }
        r0 = r2.a(r0);	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0041;
    L_0x0025:
        r0 = r2.j;	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0041;
    L_0x0029:
        r0 = r2.e;	 Catch:{ all -> 0x0043 }
        r0 = r0.poll();	 Catch:{ all -> 0x0043 }
        r0 = (defpackage.jwd) r0;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x003f;
    L_0x0033:
        r1 = r2.d;	 Catch:{ all -> 0x0043 }
        r1.add(r0);	 Catch:{ all -> 0x0043 }
        r0 = r0.a;	 Catch:{ all -> 0x0043 }
        r0.a();	 Catch:{ all -> 0x0043 }
        monitor-exit(r2);
        return;
    L_0x003f:
        monitor-exit(r2);
        return;
    L_0x0041:
        monitor-exit(r2);
        return;
    L_0x0043:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvz.c():void");
    }

    public final synchronized void b(ejd ejd) {
        if (a(ejd)) {
            a();
        } else {
            b();
        }
    }

    public final synchronized void b() {
        if (!this.d.isEmpty()) {
            for (jwd jwd : this.d) {
                jwd.a.b();
            }
            this.e.addAll(this.d);
            this.d.clear();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ffz.class};
        } else if (i == 0) {
            this.n = Boolean.valueOf(((ffz) obj).a);
            if (!this.n.booleanValue()) {
                b();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
