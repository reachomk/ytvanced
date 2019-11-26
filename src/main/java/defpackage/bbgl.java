package defpackage;

/* renamed from: bbgl */
final class bbgl implements bazn {
    public final bbgp a;
    public final /* synthetic */ bbfq b;

    bbgl(bbfq bbfq, bbgp bbgp) {
        this.b = bbfq;
        this.a = bbgp;
    }

    public final void a(baum baum) {
        this.b.b(this.a);
        if (this.b.o.f == this.a) {
            this.b.r.a(baum);
            bbgs bbgs = this.b.n;
            if (bbgs != null) {
                int i;
                int i2;
                do {
                    i = bbgs.d.get();
                    i2 = bbgs.a;
                    if (i != i2) {
                    } else {
                        return;
                    }
                } while (!bbgs.d.compareAndSet(i, Math.min(bbgs.c + i, i2)));
            }
        }
    }

    public final void b(bavx bavx, baum baum) {
        a(bavx, 1, baum);
    }

    public final void a(bbhp bbhp) {
        bbgm bbgm = this.b.o;
        amqw.b(bbgm.f != null, (Object) "Headers should be received prior to messages.");
        if (bbgm.f == this.a) {
            this.b.r.a(bbhp);
        }
    }

    public final void a() {
        if (this.b.o.c.contains(this.a)) {
            this.b.r.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:97:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a0  */
    /* JADX WARNING: Missing block: B:142:0x02ec, code skipped:
            return;
     */
    public final void a(defpackage.bavx r21, int r22, defpackage.baum r23) {
        /*
        r20 = this;
        r1 = r20;
        r0 = r21;
        r2 = r22;
        r3 = r23;
        r4 = r1.b;
        r4 = r4.j;
        monitor-enter(r4);
        r5 = r1.b;	 Catch:{ all -> 0x030e }
        r6 = r5.o;	 Catch:{ all -> 0x030e }
        r7 = r1.a;	 Catch:{ all -> 0x030e }
        r8 = 1;
        r7.b = r8;	 Catch:{ all -> 0x030e }
        r9 = r6.c;	 Catch:{ all -> 0x030e }
        r9 = r9.contains(r7);	 Catch:{ all -> 0x030e }
        if (r9 == 0) goto L_0x0049;
    L_0x001e:
        r9 = new java.util.ArrayList;	 Catch:{ all -> 0x030e }
        r10 = r6.c;	 Catch:{ all -> 0x030e }
        r9.<init>(r10);	 Catch:{ all -> 0x030e }
        r9.remove(r7);	 Catch:{ all -> 0x030e }
        r13 = java.util.Collections.unmodifiableCollection(r9);	 Catch:{ all -> 0x030e }
        r7 = new bbgm;	 Catch:{ all -> 0x030e }
        r12 = r6.b;	 Catch:{ all -> 0x030e }
        r14 = r6.d;	 Catch:{ all -> 0x030e }
        r15 = r6.f;	 Catch:{ all -> 0x030e }
        r9 = r6.g;	 Catch:{ all -> 0x030e }
        r10 = r6.a;	 Catch:{ all -> 0x030e }
        r11 = r6.h;	 Catch:{ all -> 0x030e }
        r6 = r6.e;	 Catch:{ all -> 0x030e }
        r18 = r11;
        r11 = r7;
        r16 = r9;
        r17 = r10;
        r19 = r6;
        r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ all -> 0x030e }
        r6 = r7;
    L_0x0049:
        r5.o = r6;	 Catch:{ all -> 0x030e }
        monitor-exit(r4);	 Catch:{ all -> 0x030e }
        r4 = r1.a;
        r5 = r4.c;
        if (r5 == 0) goto L_0x0069;
    L_0x0052:
        r2 = r1.b;
        r2.b(r4);
        r2 = r1.b;
        r2 = r2.o;
        r2 = r2.f;
        r4 = r1.a;
        if (r2 != r4) goto L_0x0068;
    L_0x0061:
        r2 = r1.b;
        r2 = r2.r;
        r2.b(r0, r3);
    L_0x0068:
        return;
    L_0x0069:
        r4 = r1.b;
        r4 = r4.o;
        r4 = r4.f;
        if (r4 == 0) goto L_0x0073;
    L_0x0071:
        goto L_0x02f2;
    L_0x0073:
        r4 = 2;
        r5 = 0;
        if (r2 == r4) goto L_0x0087;
    L_0x0077:
        r4 = 3;
        if (r2 == r4) goto L_0x007c;
    L_0x007a:
        goto L_0x011f;
    L_0x007c:
        r2 = r1.b;
        r4 = r2.i;
        if (r4 == 0) goto L_0x029a;
    L_0x0082:
        r2.c();
        goto L_0x029a;
    L_0x0087:
        r2 = r1.b;
        r2 = r2.p;
        r2 = r2.compareAndSet(r5, r8);
        if (r2 == 0) goto L_0x011f;
    L_0x0091:
        r0 = r1.b;
        r2 = r1.a;
        r2 = r2.d;
        r0 = r0.d(r2);
        r2 = r1.b;
        r3 = r2.i;
        if (r3 == 0) goto L_0x00fb;
    L_0x00a1:
        r3 = r2.j;
        monitor-enter(r3);
        r2 = r1.b;	 Catch:{ all -> 0x00f8 }
        r4 = r2.o;	 Catch:{ all -> 0x00f8 }
        r6 = r1.a;	 Catch:{ all -> 0x00f8 }
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x00f8 }
        r9 = r4.d;	 Catch:{ all -> 0x00f8 }
        r7.<init>(r9);	 Catch:{ all -> 0x00f8 }
        r7.remove(r6);	 Catch:{ all -> 0x00f8 }
        r7.add(r0);	 Catch:{ all -> 0x00f8 }
        r13 = java.util.Collections.unmodifiableCollection(r7);	 Catch:{ all -> 0x00f8 }
        r6 = new bbgm;	 Catch:{ all -> 0x00f8 }
        r11 = r4.b;	 Catch:{ all -> 0x00f8 }
        r12 = r4.c;	 Catch:{ all -> 0x00f8 }
        r14 = r4.f;	 Catch:{ all -> 0x00f8 }
        r15 = r4.g;	 Catch:{ all -> 0x00f8 }
        r7 = r4.a;	 Catch:{ all -> 0x00f8 }
        r9 = r4.h;	 Catch:{ all -> 0x00f8 }
        r4 = r4.e;	 Catch:{ all -> 0x00f8 }
        r10 = r6;
        r16 = r7;
        r17 = r9;
        r18 = r4;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ all -> 0x00f8 }
        r2.o = r6;	 Catch:{ all -> 0x00f8 }
        r2 = r1.b;	 Catch:{ all -> 0x00f8 }
        r4 = r2.o;	 Catch:{ all -> 0x00f8 }
        r2 = r2.a(r4);	 Catch:{ all -> 0x00f8 }
        if (r2 != 0) goto L_0x00ef;
    L_0x00e1:
        r2 = r1.b;	 Catch:{ all -> 0x00f8 }
        r2 = r2.o;	 Catch:{ all -> 0x00f8 }
        r2 = r2.d;	 Catch:{ all -> 0x00f8 }
        r2 = r2.size();	 Catch:{ all -> 0x00f8 }
        if (r2 == r8) goto L_0x00ee;
    L_0x00ed:
        goto L_0x00ef;
    L_0x00ee:
        r5 = 1;
    L_0x00ef:
        monitor-exit(r3);	 Catch:{ all -> 0x00f8 }
        if (r5 == 0) goto L_0x0112;
    L_0x00f2:
        r2 = r1.b;
        r2.b(r0);
        goto L_0x0112;
    L_0x00f8:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00f8 }
        throw r0;
    L_0x00fb:
        r3 = r2.g;
        if (r3 != 0) goto L_0x0107;
    L_0x00ff:
        r3 = r2.f;
        r3 = r3.a();
        r2.g = r3;
    L_0x0107:
        r2 = r1.b;
        r3 = r2.g;
        r3 = r3.a;
        if (r3 != r8) goto L_0x0112;
    L_0x010f:
        r2.b(r0);
    L_0x0112:
        r2 = r1.b;
        r2 = r2.d;
        r3 = new bbgo;
        r3.<init>(r1, r0);
        r2.execute(r3);
        return;
    L_0x011f:
        r2 = r1.b;
        r2 = r2.p;
        r2.set(r8);
        r2 = r1.b;
        r4 = r2.g;
        if (r4 != 0) goto L_0x013c;
    L_0x012c:
        r4 = r2.f;
        r4 = r4.a();
        r2.g = r4;
        r2 = r1.b;
        r4 = r2.g;
        r6 = r4.b;
        r2.u = r6;
    L_0x013c:
        r2 = r1.b;
        r2 = r2.g;
        r2 = r2.e;
        r4 = r0.m;
        r2 = r2.contains(r4);
        r4 = r1.b;
        r4 = r4.h;
        r4 = r4.c;
        r6 = r0.m;
        r4 = r4.contains(r6);
        r6 = r1.b;
        r6 = r6.i;
        if (r6 != 0) goto L_0x015b;
    L_0x015a:
        goto L_0x016a;
    L_0x015b:
        if (r4 != 0) goto L_0x016a;
    L_0x015d:
        r2 = new bbgj;
        r10 = 0;
        r11 = 1;
        r12 = 0;
        r14 = 0;
        r9 = r2;
        r9.<init>(r10, r11, r12, r14);
        goto L_0x0228;
    L_0x016a:
        r6 = defpackage.bbfq.a;
        r6 = r3.a(r6);
        r6 = (java.lang.String) r6;
        r7 = 0;
        if (r6 == 0) goto L_0x0180;
    L_0x0175:
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ NumberFormatException -> 0x017a }
        goto L_0x0181;
    L_0x017a:
        r6 = -1;
        r6 = java.lang.Integer.valueOf(r6);
        goto L_0x0181;
    L_0x0180:
        r6 = r7;
    L_0x0181:
        r9 = r1.b;
        r9 = r9.n;
        if (r9 != 0) goto L_0x0189;
    L_0x0187:
        r4 = 0;
        goto L_0x01b9;
    L_0x0189:
        if (r2 == 0) goto L_0x018c;
    L_0x018b:
        goto L_0x0197;
    L_0x018c:
        if (r4 != 0) goto L_0x0197;
    L_0x018e:
        if (r6 == 0) goto L_0x0187;
    L_0x0190:
        r4 = r6.intValue();
        if (r4 < 0) goto L_0x0197;
    L_0x0196:
        goto L_0x0187;
    L_0x0197:
        r4 = r1.b;
        r4 = r4.n;
    L_0x019b:
        r9 = r4.d;
        r9 = r9.get();
        if (r9 == 0) goto L_0x01b7;
    L_0x01a3:
        r10 = r9 + -1000;
        r11 = r4.d;
        r12 = java.lang.Math.max(r10, r5);
        r9 = r11.compareAndSet(r9, r12);
        if (r9 == 0) goto L_0x019b;
    L_0x01b1:
        r4 = r4.b;
        if (r10 <= r4) goto L_0x01b7;
    L_0x01b5:
        r4 = 1;
        goto L_0x01b8;
    L_0x01b7:
        r4 = 0;
    L_0x01b8:
        r4 = r4 ^ r8;
    L_0x01b9:
        r9 = r1.b;
        r10 = r9.g;
        r10 = r10.a;
        r11 = r1.a;
        r11 = r11.d;
        r11 = r11 + r8;
        r12 = 0;
        if (r10 > r11) goto L_0x01cc;
    L_0x01c8:
        r17 = r12;
        r15 = 0;
        goto L_0x0215;
    L_0x01cc:
        if (r4 != 0) goto L_0x01c8;
    L_0x01ce:
        if (r6 != 0) goto L_0x01f9;
    L_0x01d0:
        if (r2 == 0) goto L_0x01c8;
    L_0x01d2:
        r9 = r9.u;
        r9 = (double) r9;
        r2 = defpackage.bbfq.v;
        r11 = r2.nextDouble();
        java.lang.Double.isNaN(r9);
        r9 = r9 * r11;
        r12 = (long) r9;
        r2 = r1.b;
        r9 = r2.u;
        r4 = r2.g;
        r9 = (double) r9;
        r14 = r4.d;
        java.lang.Double.isNaN(r9);
        r9 = r9 * r14;
        r9 = (long) r9;
        r14 = r4.c;
        r9 = java.lang.Math.min(r9, r14);
        r2.u = r9;
        goto L_0x0212;
    L_0x01f9:
        r2 = r6.intValue();
        if (r2 < 0) goto L_0x01c8;
    L_0x01ff:
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r4 = r6.intValue();
        r9 = (long) r4;
        r12 = r2.toNanos(r9);
        r2 = r1.b;
        r4 = r2.g;
        r9 = r4.b;
        r2.u = r9;
    L_0x0212:
        r17 = r12;
        r15 = 1;
    L_0x0215:
        r2 = new bbgj;
        r4 = r1.b;
        r4 = r4.i;
        if (r4 != 0) goto L_0x0220;
    L_0x021d:
        r19 = r7;
        goto L_0x0222;
    L_0x0220:
        r19 = r6;
    L_0x0222:
        r16 = 0;
        r14 = r2;
        r14.<init>(r15, r16, r17, r19);
    L_0x0228:
        r4 = r2.a;
        if (r4 == 0) goto L_0x0255;
    L_0x022c:
        r0 = r1.b;
        r4 = r0.j;
        monitor-enter(r4);
        r0 = r1.b;	 Catch:{ all -> 0x0252 }
        r3 = new bbgi;	 Catch:{ all -> 0x0252 }
        r5 = r0.j;	 Catch:{ all -> 0x0252 }
        r3.<init>(r5);	 Catch:{ all -> 0x0252 }
        r0.s = r3;	 Catch:{ all -> 0x0252 }
        monitor-exit(r4);	 Catch:{ all -> 0x0252 }
        r0 = r1.b;
        r0 = r0.e;
        r4 = new bbgn;
        r4.<init>(r1);
        r5 = r2.c;
        r2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r0 = r0.schedule(r4, r5, r2);
        r3.a(r0);
        return;
    L_0x0252:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0252 }
        throw r0;
    L_0x0255:
        r4 = r2.b;
        r6 = r1.b;
        r2 = r2.d;
        if (r2 != 0) goto L_0x025e;
    L_0x025d:
        goto L_0x0299;
    L_0x025e:
        r7 = r2.intValue();
        if (r7 >= 0) goto L_0x0268;
    L_0x0264:
        r6.c();
        goto L_0x0299;
    L_0x0268:
        r7 = r6.j;
        monitor-enter(r7);
        r8 = r6.t;	 Catch:{ all -> 0x030b }
        if (r8 != 0) goto L_0x0271;
    L_0x026f:
        monitor-exit(r7);	 Catch:{ all -> 0x030b }
        goto L_0x0299;
    L_0x0271:
        r8 = r8.a();	 Catch:{ all -> 0x030b }
        r9 = new bbgi;	 Catch:{ all -> 0x030b }
        r10 = r6.j;	 Catch:{ all -> 0x030b }
        r9.<init>(r10);	 Catch:{ all -> 0x030b }
        r6.t = r9;	 Catch:{ all -> 0x030b }
        monitor-exit(r7);	 Catch:{ all -> 0x030b }
        if (r8 == 0) goto L_0x0284;
    L_0x0281:
        r8.cancel(r5);
    L_0x0284:
        r5 = r6.e;
        r7 = new bbgh;
        r7.<init>(r6, r9);
        r2 = r2.intValue();
        r10 = (long) r2;
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r2 = r5.schedule(r7, r10, r2);
        r9.a(r2);
    L_0x0299:
        r5 = r4;
    L_0x029a:
        r2 = r1.b;
        r4 = r2.i;
        if (r4 == 0) goto L_0x02f2;
    L_0x02a0:
        r2 = r2.j;
        monitor-enter(r2);
        r4 = r1.b;	 Catch:{ all -> 0x02ef }
        r6 = r4.o;	 Catch:{ all -> 0x02ef }
        r7 = r1.a;	 Catch:{ all -> 0x02ef }
        r8 = new java.util.ArrayList;	 Catch:{ all -> 0x02ef }
        r9 = r6.d;	 Catch:{ all -> 0x02ef }
        r8.<init>(r9);	 Catch:{ all -> 0x02ef }
        r8.remove(r7);	 Catch:{ all -> 0x02ef }
        r13 = java.util.Collections.unmodifiableCollection(r8);	 Catch:{ all -> 0x02ef }
        r7 = new bbgm;	 Catch:{ all -> 0x02ef }
        r11 = r6.b;	 Catch:{ all -> 0x02ef }
        r12 = r6.c;	 Catch:{ all -> 0x02ef }
        r14 = r6.f;	 Catch:{ all -> 0x02ef }
        r15 = r6.g;	 Catch:{ all -> 0x02ef }
        r8 = r6.a;	 Catch:{ all -> 0x02ef }
        r9 = r6.h;	 Catch:{ all -> 0x02ef }
        r6 = r6.e;	 Catch:{ all -> 0x02ef }
        r10 = r7;
        r16 = r8;
        r17 = r9;
        r18 = r6;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ all -> 0x02ef }
        r4.o = r7;	 Catch:{ all -> 0x02ef }
        if (r5 != 0) goto L_0x02ed;
    L_0x02d5:
        r4 = r1.b;	 Catch:{ all -> 0x02ef }
        r5 = r4.o;	 Catch:{ all -> 0x02ef }
        r4 = r4.a(r5);	 Catch:{ all -> 0x02ef }
        if (r4 != 0) goto L_0x02eb;
    L_0x02df:
        r4 = r1.b;	 Catch:{ all -> 0x02ef }
        r4 = r4.o;	 Catch:{ all -> 0x02ef }
        r4 = r4.d;	 Catch:{ all -> 0x02ef }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x02ef }
        if (r4 != 0) goto L_0x02ed;
    L_0x02eb:
        monitor-exit(r2);	 Catch:{ all -> 0x02ef }
        return;
    L_0x02ed:
        monitor-exit(r2);	 Catch:{ all -> 0x02ef }
        goto L_0x02f2;
    L_0x02ef:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x02ef }
        throw r0;
    L_0x02f2:
        r2 = r1.b;
        r4 = r1.a;
        r2.b(r4);
        r2 = r1.b;
        r2 = r2.o;
        r2 = r2.f;
        r4 = r1.a;
        if (r2 != r4) goto L_0x030a;
    L_0x0303:
        r2 = r1.b;
        r2 = r2.r;
        r2.b(r0, r3);
    L_0x030a:
        return;
    L_0x030b:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x030b }
        throw r0;
    L_0x030e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x030e }
        goto L_0x0312;
    L_0x0311:
        throw r0;
    L_0x0312:
        goto L_0x0311;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbgl.a(bavx, int, baum):void");
    }
}
