package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ajmu */
public final class ajmu implements ajmv {
    public boolean a;
    public final List b = new ArrayList();
    private final ajnb c = new ajnb();
    private xcc d;
    private long e = Long.MIN_VALUE;
    private long f;
    private boolean g = true;
    private boolean h = true;
    private final List i = new ArrayList();
    private final List j = new ArrayList();

    public final synchronized long a(long j) {
        amqw.b(this.a ^ 1);
        if (this.g) {
            f();
        }
        if (j >= this.e) {
            if (j > Long.MIN_VALUE && j < Long.MAX_VALUE) {
                if (this.g) {
                    xtl.d("CueRangeManger state error: isTrackingPaused = true");
                }
                this.a = true;
                if (this.h) {
                    this.d = b(this.e + 1);
                    this.h = false;
                    g();
                }
                while (this.d.hasNext()) {
                    if (j < ((ajna) this.d.a()).a) {
                        break;
                    }
                    ajna ajna = (ajna) this.d.next();
                    ajmp ajmp = (ajmp) ajna.b;
                    if (ajna.c != 1) {
                        ajmp.g();
                    } else {
                        ajmp.b(this.g, false, false);
                    }
                }
                this.e = j;
                this.a = false;
                e();
                if (!this.d.hasNext()) {
                    return Long.MAX_VALUE;
                }
                return ((ajna) this.d.a()).a - j;
            }
        }
        String l = Long.toString(j);
        String l2 = Long.toString(this.e);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(l).length() + 65) + String.valueOf(l2).length());
        stringBuilder.append("CueRangeManger state error: currentPosition=");
        stringBuilder.append(l);
        stringBuilder.append(" lastPositionTracked=");
        stringBuilder.append(l2);
        xtl.d(stringBuilder.toString());
        return Long.MAX_VALUE;
    }

    /* JADX WARNING: Missing block: B:7:0x001a, code skipped:
            if (r2 >= Long.MAX_VALUE) goto L_0x001c;
     */
    public final synchronized long a(long r17, boolean r19) {
        /*
        r16 = this;
        r1 = r16;
        r2 = r17;
        monitor-enter(r16);
        r0 = r1.a;	 Catch:{ all -> 0x00d1 }
        r4 = 1;
        r0 = r0 ^ r4;
        defpackage.amqw.b(r0);	 Catch:{ all -> 0x00d1 }
        r5 = -9223372036854775808;
        r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 > 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001c;
    L_0x0018:
        r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r0 < 0) goto L_0x0039;
    L_0x001c:
        r0 = java.lang.Long.toString(r17);	 Catch:{ all -> 0x00d1 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00d1 }
        r5 = "CueRangeManger state error: newPosition=";
        r6 = r0.length();	 Catch:{ all -> 0x00d1 }
        if (r6 != 0) goto L_0x0032;
    L_0x002c:
        r0 = new java.lang.String;	 Catch:{ all -> 0x00d1 }
        r0.<init>(r5);	 Catch:{ all -> 0x00d1 }
        goto L_0x0036;
    L_0x0032:
        r0 = r5.concat(r0);	 Catch:{ all -> 0x00d1 }
    L_0x0036:
        defpackage.xtl.d(r0);	 Catch:{ all -> 0x00d1 }
    L_0x0039:
        r16.g();	 Catch:{ all -> 0x00d1 }
        r0 = r1.g;	 Catch:{ all -> 0x00d1 }
        if (r0 == 0) goto L_0x0043;
    L_0x0040:
        r5 = r1.f;	 Catch:{ all -> 0x00d1 }
        goto L_0x0045;
    L_0x0043:
        r5 = r1.e;	 Catch:{ all -> 0x00d1 }
    L_0x0045:
        r1.a = r4;	 Catch:{ all -> 0x00d1 }
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x0050;
    L_0x004b:
        r0 = r1.a(r5, r2);	 Catch:{ all -> 0x00d1 }
        goto L_0x0054;
    L_0x0050:
        r0 = r1.a(r2, r5);	 Catch:{ all -> 0x00d1 }
    L_0x0054:
        r1.d = r0;	 Catch:{ all -> 0x00d1 }
    L_0x0056:
        r0 = r1.d;	 Catch:{ all -> 0x00d1 }
        r0 = r0.hasNext();	 Catch:{ all -> 0x00d1 }
        if (r0 == 0) goto L_0x00a0;
    L_0x005e:
        r0 = r1.d;	 Catch:{ all -> 0x00d1 }
        r0 = r0.next();	 Catch:{ all -> 0x00d1 }
        r0 = (defpackage.ajna) r0;	 Catch:{ all -> 0x00d1 }
        r9 = r0.b;	 Catch:{ all -> 0x00d1 }
        r9 = (defpackage.ajmp) r9;	 Catch:{ all -> 0x00d1 }
        r10 = r9.a(r5);	 Catch:{ all -> 0x00d1 }
        r11 = r9.a(r2);	 Catch:{ all -> 0x00d1 }
        r12 = r9.h();	 Catch:{ all -> 0x00d1 }
        r14 = r9.i();	 Catch:{ all -> 0x00d1 }
        if (r10 != 0) goto L_0x0094;
    L_0x007c:
        if (r11 == 0) goto L_0x0094;
    L_0x007e:
        r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r10 == 0) goto L_0x0083;
    L_0x0082:
        goto L_0x008c;
    L_0x0083:
        r0 = r0.c;	 Catch:{ all -> 0x00d1 }
        r10 = 2;
        if (r0 != r10) goto L_0x008c;
    L_0x0088:
        r9.g();	 Catch:{ all -> 0x00d1 }
        goto L_0x0056;
    L_0x008c:
        r0 = r1.g;	 Catch:{ all -> 0x00d1 }
        r10 = r19;
        r9.b(r0, r4, r10);	 Catch:{ all -> 0x00d1 }
        goto L_0x0056;
    L_0x0094:
        if (r10 == 0) goto L_0x0056;
    L_0x0096:
        if (r11 != 0) goto L_0x0056;
    L_0x0098:
        r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r0 == 0) goto L_0x0056;
    L_0x009c:
        r9.g();	 Catch:{ all -> 0x00d1 }
        goto L_0x0056;
    L_0x00a0:
        r0 = r1.g;	 Catch:{ all -> 0x00d1 }
        if (r0 == 0) goto L_0x00a7;
    L_0x00a4:
        r1.f = r2;	 Catch:{ all -> 0x00d1 }
        goto L_0x00a9;
    L_0x00a7:
        r1.e = r2;	 Catch:{ all -> 0x00d1 }
    L_0x00a9:
        r4 = 1;
        r4 = r4 + r2;
        r0 = r1.b(r4);	 Catch:{ all -> 0x00d1 }
        r1.d = r0;	 Catch:{ all -> 0x00d1 }
        r0 = 0;
        r1.h = r0;	 Catch:{ all -> 0x00d1 }
        r1.a = r0;	 Catch:{ all -> 0x00d1 }
        r16.e();	 Catch:{ all -> 0x00d1 }
        r0 = r1.d;	 Catch:{ all -> 0x00d1 }
        r0 = r0.hasNext();	 Catch:{ all -> 0x00d1 }
        if (r0 == 0) goto L_0x00cf;
    L_0x00c2:
        r0 = r1.d;	 Catch:{ all -> 0x00d1 }
        r0 = r0.a();	 Catch:{ all -> 0x00d1 }
        r0 = (defpackage.ajna) r0;	 Catch:{ all -> 0x00d1 }
        r4 = r0.a;	 Catch:{ all -> 0x00d1 }
        r4 = r4 - r2;
        monitor-exit(r16);
        return r4;
    L_0x00cf:
        monitor-exit(r16);
        return r7;
    L_0x00d1:
        r0 = move-exception;
        monitor-exit(r16);
        goto L_0x00d5;
    L_0x00d4:
        throw r0;
    L_0x00d5:
        goto L_0x00d4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmu.a(long, boolean):long");
    }

    public final synchronized void a(ajmp ajmp) {
        if (ajmp == null) {
            return;
        }
        if (this.a) {
            this.i.add(ajmp);
            return;
        }
        this.c.a(ajmp);
        this.h = true;
        g();
    }

    public final synchronized void a(List list) {
        if (this.a) {
            this.i.addAll(list);
            return;
        }
        for (ajmp ajmp : list) {
            this.c.a(ajmp);
        }
        this.h = true;
        g();
    }

    /* JADX WARNING: Missing block: B:18:0x003f, code skipped:
            return;
     */
    public final synchronized void b(defpackage.ajmp r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        if (r4 == 0) goto L_0x003e;
    L_0x0003:
        r0 = r3.c;	 Catch:{ all -> 0x003b }
        r0 = r0.a;	 Catch:{ all -> 0x003b }
        r0 = r0.contains(r4);	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x003e;
    L_0x000d:
        r0 = r3.a;	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x0018;
    L_0x0011:
        r0 = r3.b;	 Catch:{ all -> 0x003b }
        r0.add(r4);	 Catch:{ all -> 0x003b }
        monitor-exit(r3);
        return;
    L_0x0018:
        r0 = r3.c;	 Catch:{ all -> 0x003b }
        r1 = 1;
        r1 = new defpackage.ajmp[r1];	 Catch:{ all -> 0x003b }
        r2 = 0;
        r1[r2] = r4;	 Catch:{ all -> 0x003b }
        r1 = r0.a;	 Catch:{ all -> 0x003b }
        r1.remove(r4);	 Catch:{ all -> 0x003b }
        r1 = r0.b;	 Catch:{ all -> 0x003b }
        r2 = r4.l;	 Catch:{ all -> 0x003b }
        r1.remove(r2);	 Catch:{ all -> 0x003b }
        r0 = r0.b;	 Catch:{ all -> 0x003b }
        r1 = r4.m;	 Catch:{ all -> 0x003b }
        r0.remove(r1);	 Catch:{ all -> 0x003b }
        r3.c(r4);	 Catch:{ all -> 0x003b }
        r3.g();	 Catch:{ all -> 0x003b }
        monitor-exit(r3);
        return;
    L_0x003b:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
    L_0x003e:
        monitor-exit(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmu.b(ajmp):void");
    }

    private final void e() {
        amqw.b(this.a ^ 1);
        for (ajmp a : this.i) {
            a(a);
        }
        this.i.clear();
        for (ajmp a2 : this.b) {
            b(a2);
        }
        this.b.clear();
    }

    public final synchronized void a() {
        this.g = false;
        a(-9223372036854775807L, false);
    }

    private final synchronized void f() {
        if (this.g) {
            this.g = false;
            long j = this.e;
            long j2 = this.f;
            if (j != j2) {
                a(j2, false);
            } else {
                g();
            }
        }
    }

    public final synchronized void b() {
        if (!this.g) {
            this.g = true;
            this.f = this.e;
        }
    }

    public final synchronized void c() {
        a(9223372036854775806L, false);
        this.g = false;
        d();
    }

    public final synchronized void d() {
        this.e = Long.MIN_VALUE;
        this.h = true;
        b();
        a(ajmp.class);
        this.d = b(this.e);
    }

    public final synchronized void a(Class cls) {
        ajnb ajnb = this.c;
        ajmt ajmt = new ajmt(this, cls);
        ajmw ajmw = new ajmw(this);
        Iterator it = ajnb.a.iterator();
        while (it.hasNext()) {
            ajmx ajmx = (ajmx) it.next();
            if (((Boolean) ajmt.a(ajmx)).booleanValue()) {
                it.remove();
                ajnb.b.remove(ajmx.l);
                ajnb.b.remove(ajmx.m);
                ajmw.a(ajmx);
            }
        }
        g();
    }

    public final void c(ajmp ajmp) {
        if (ajmp.j && ajmp.a(this.e)) {
            ajmp.g();
        }
        this.h = true;
    }

    private final xcc b(long j) {
        return new xcc(this.c.a(j));
    }

    private final xcc a(long j, long j2) {
        Iterator it;
        ajnb ajnb = this.c;
        if (j2 != Long.MAX_VALUE) {
            it = ajnb.b.subSet(ajmx.b(j), ajmx.b(j2 + 1)).iterator();
        } else {
            it = ajnb.a(j);
        }
        return new xcc(it);
    }

    private final void g() {
        for (ajmy a : this.j) {
            a.a(this.c);
        }
    }

    public final synchronized void a(ajmy ajmy) {
        if (!this.j.contains(ajmy)) {
            this.j.add(ajmy);
        }
    }

    public final synchronized void b(ajmy ajmy) {
        this.j.remove(ajmy);
    }
}
