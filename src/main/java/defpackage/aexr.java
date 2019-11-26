package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: aexr */
final class aexr extends aext {
    private final aaje e;
    private final aeuy f;
    private volatile aeza g;
    private final aety h = new aety(this.j.c);
    private volatile boolean i;
    private final /* synthetic */ aexj j;

    aexr(aexj aexj, aaje aaje, afkh afkh, boolean z, aeuy aeuy) {
        aexj aexj2 = aexj;
        aaje aaje2 = aaje;
        this.j = aexj2;
        super(aexj);
        this.e = aaje2;
        this.a = afkh;
        this.f = aeuy;
        anyd anyd = aexj2.n.d().p;
        if (z && !anyd.isEmpty()) {
            aajs a = aajx.a(aaje2.g, anyd);
            aajj aajj = aaje2.e;
            aexc aexc = aexj2.f;
            affh a2 = affd.a(a, aajj, aexc.c, aexc.a(aajj), aexj2.f.g);
            aajj = aaje2.e;
            aexc = aexj2.f;
            affe a3 = affd.a(a, aajj, aexc.c, aexc.b(aajj));
            String str = aaje2.b;
            aajj aajj2 = aaje2.e;
            affh affh = this.a == null ? affd.c : a2;
            affe a4 = affd.a(a, aajj2, this.j.f.c, affd.b);
            afgz afgz = this.j.f.e;
            Collection collection = a.n;
            Set set = affh.a;
            Set set2 = a4.a;
            List a5 = afgz.a(collection, set, "video/webm");
            List a6 = afgz.a(collection, set2, "audio/webm");
            afgt a7 = afgz.d.a(true, aajj2, str);
            afgv afgv = new afgv((aahr[]) a5.toArray(new aahr[a5.size()]), (aahr[]) a6.toArray(new aahr[a6.size()]), null, afgz.a(a5), afgz.b(a6), a7.b, a7, afgz.f.a(afgz.e.k()));
            String str2 = aaje2.b;
            aajj = aaje2.e;
            aety aety = this.h;
            aajs a8 = aajx.a(aaje2.g, anyd);
            afgp afgp = afgp.a;
            String str3 = aaje2.b;
            String str4 = aaje2.g;
            afjj afjj = aexj2.m;
            aexc aexc2 = aexj2.f;
            this.d = new afaj(aexj, str2, aajj, aety, a8, afgp, a2, a3, afgv, new aeoj(str3, str4, afjj, aexc2.e, aexc2.c), false, aexj2.m);
            return;
        }
        this.d = null;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:10:0x0098, code skipped:
            if (r2.br == false) goto L_0x009a;
     */
    public final void bw_() {
        /*
        r23 = this;
        r0 = r23;
        r1 = r0.j;
        r2 = 2;
        r3 = new defpackage.afiq[r2];
        r4 = r1.d;
        r5 = r0.e;
        r5 = r5.e;
        r8 = r0.h;
        r9 = defpackage.afhi.l;
        r6 = 0;
        r7 = 5;
        r4 = r4.a(r5, r6, r7, r8, r9);
        r5 = 0;
        r3[r5] = r4;
        r4 = r0.j;
        r6 = r4.d;
        r4 = r0.e;
        r7 = r4.e;
        r10 = r0.h;
        r11 = defpackage.afhi.l;
        r8 = 0;
        r9 = 5;
        r4 = r6.a(r7, r8, r9, r10, r11);
        r6 = 1;
        r3[r6] = r4;
        r1.q = r3;
        r11 = r0.d;	 Catch:{ afgr -> 0x00b6 }
        if (r11 == 0) goto L_0x00a8;
    L_0x0035:
        r1 = r0.j;	 Catch:{ afgr -> 0x00b6 }
        r3 = r1.f;	 Catch:{ afgr -> 0x00b6 }
        r3 = r3.a;	 Catch:{ afgr -> 0x00b6 }
        r12 = r0.h;	 Catch:{ afgr -> 0x00b6 }
        r4 = r11.d();	 Catch:{ afgr -> 0x00b6 }
        r14 = new aeza;	 Catch:{ afgr -> 0x00b6 }
        r8 = r3.a;	 Catch:{ afgr -> 0x00b6 }
        r3 = new aezb;	 Catch:{ afgr -> 0x00b6 }
        r7 = r11.e;	 Catch:{ afgr -> 0x00b6 }
        r16 = defpackage.aexs.a(r1, r4, r7, r11);	 Catch:{ afgr -> 0x00b6 }
        r7 = r1.f;	 Catch:{ afgr -> 0x00b6 }
        r7 = r7.c;	 Catch:{ afgr -> 0x00b6 }
        r18 = r4.I();	 Catch:{ afgr -> 0x00b6 }
        r19 = r4.H();	 Catch:{ afgr -> 0x00b6 }
        r9 = r11.e;	 Catch:{ afgr -> 0x00b6 }
        r10 = r11.r;	 Catch:{ afgr -> 0x00b6 }
        r22 = r4.L();	 Catch:{ afgr -> 0x00b6 }
        r15 = r3;
        r17 = r7;
        r20 = r9;
        r21 = r10;
        r15.<init>(r16, r17, r18, r19, r20, r21, r22);	 Catch:{ afgr -> 0x00b6 }
        r10 = r1.i;	 Catch:{ afgr -> 0x00b6 }
        r13 = r1.m;	 Catch:{ afgr -> 0x00b6 }
        r7 = r14;
        r9 = r3;
        r7.<init>(r8, r9, r10, r11, r12, r13);	 Catch:{ afgr -> 0x00b6 }
        r0.g = r14;	 Catch:{ afgr -> 0x00b6 }
        r1 = new aexy;	 Catch:{ afgr -> 0x00b6 }
        r3 = r0.g;	 Catch:{ afgr -> 0x00b6 }
        r4 = r0.d;	 Catch:{ afgr -> 0x00b6 }
        r7 = r0.j;	 Catch:{ afgr -> 0x00b6 }
        r1.<init>(r3, r4, r7);	 Catch:{ afgr -> 0x00b6 }
        r3 = r0.j;	 Catch:{ afgr -> 0x00b6 }
        r3 = r3.n;	 Catch:{ afgr -> 0x00b6 }
        r4 = r0.e;	 Catch:{ afgr -> 0x00b6 }
        r7 = r4.e;	 Catch:{ afgr -> 0x00b6 }
        r7 = r7.c;	 Catch:{ afgr -> 0x00b6 }
        r8 = r7.a;	 Catch:{ afgr -> 0x00b6 }
        r2 = r2 & r8;
        if (r2 == 0) goto L_0x009a;
    L_0x0090:
        r2 = r7.d;	 Catch:{ afgr -> 0x00b6 }
        if (r2 != 0) goto L_0x0096;
    L_0x0094:
        r2 = defpackage.arhh.bv;	 Catch:{ afgr -> 0x00b6 }
    L_0x0096:
        r2 = r2.br;	 Catch:{ afgr -> 0x00b6 }
        if (r2 != 0) goto L_0x009c;
    L_0x009a:
        r1 = r0.g;	 Catch:{ afgr -> 0x00b6 }
    L_0x009c:
        r2 = r0.f;	 Catch:{ afgr -> 0x00b6 }
        r1 = r3.a(r4, r1, r2);	 Catch:{ afgr -> 0x00b6 }
        if (r1 == 0) goto L_0x00a5;
    L_0x00a4:
        r5 = 1;
    L_0x00a5:
        r0.i = r5;	 Catch:{ afgr -> 0x00b6 }
        return;
    L_0x00a8:
        r1 = r0.j;	 Catch:{ afgr -> 0x00b6 }
        r1 = r1.n;	 Catch:{ afgr -> 0x00b6 }
        r2 = r0.e;	 Catch:{ afgr -> 0x00b6 }
        r3 = defpackage.aemt.a;	 Catch:{ afgr -> 0x00b6 }
        r4 = r0.f;	 Catch:{ afgr -> 0x00b6 }
        r1.a(r2, r3, r4);	 Catch:{ afgr -> 0x00b6 }
        return;
    L_0x00b6:
        r1 = "MissingStreamException in sendOnesieRequest";
        defpackage.aepe.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexr.bw_():void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void h() {
        if (this.d != null && this.i) {
            if (this.j.e.e() != 1) {
                aepe.a("Warming started too late: playbackState != STATE_IDLE.");
                return;
            }
            if (this.e.e()) {
                afaj afaj = this.d;
                afaj.a(afaj.d(), this.e.j, afgp.a, this.d.f());
            }
            this.j.f.j = this.d;
            afkh afkh = this.a;
            if (afkh != null) {
                afkh.a(this.j.a(afkh, this.d));
            }
            this.j.m.a.a(new aegv());
            this.j.e.a(false);
            this.j.a((ool) amqw.a(this.g));
            this.j.e.a(this.e.k);
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be A:{Catch:{ aeom -> 0x00ad, aeom -> 0x00c6 }} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A:{Catch:{ aeom -> 0x00ad, aeom -> 0x00c6 }} */
    public final boolean a(java.lang.String r11, defpackage.aajj r12, defpackage.aeuy r13, defpackage.aajs r14) {
        /*
        r10 = this;
        r0 = r10.j;
        r0 = r0.n;
        r0.a(r14);
        r0 = r10.g;
        r1 = 0;
        if (r0 == 0) goto L_0x00cc;
    L_0x000c:
        r2 = r10.d;
        if (r2 == 0) goto L_0x00cc;
    L_0x0010:
        r2 = r10.j;
        r2 = r2.m;
        r2 = r2.a;
        r3 = new aegu;
        r3.<init>();
        r2.a(r3);
        r2 = r10.j;	 Catch:{ aeom -> 0x00c6 }
        r2 = r2.f;	 Catch:{ aeom -> 0x00c6 }
        r7 = r2.a();	 Catch:{ aeom -> 0x00c6 }
        r2 = r10.j;	 Catch:{ aeom -> 0x00c6 }
        r2 = r2.f;	 Catch:{ aeom -> 0x00c6 }
        r2 = r2.b;	 Catch:{ aeom -> 0x00c6 }
        r2 = r2.l();	 Catch:{ aeom -> 0x00c6 }
        r9 = 1;
        if (r2 == 0) goto L_0x003c;
    L_0x0033:
        r2 = r12.T();	 Catch:{ aeom -> 0x00c6 }
        if (r2 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003c;
    L_0x003a:
        r8 = 1;
        goto L_0x003d;
    L_0x003c:
        r8 = 0;
    L_0x003d:
        r2 = r14.d();	 Catch:{ aeom -> 0x00c6 }
        if (r2 != 0) goto L_0x00be;
    L_0x0043:
        r2 = r14.u;	 Catch:{ aeom -> 0x00c6 }
        r3 = 3;
        if (r2 != r3) goto L_0x00b6;
    L_0x0048:
        r2 = r0.c;	 Catch:{ aeom -> 0x00ad }
        r3 = r2.e;	 Catch:{ aeom -> 0x00ad }
        r4 = r11;
        r5 = r14;
        r6 = r12;
        r11 = r3.a(r4, r5, r6, r7, r8);	 Catch:{ aeom -> 0x00ad }
        if (r11 == 0) goto L_0x00a5;
    L_0x0055:
        r2 = r0.b;	 Catch:{ aeom -> 0x00c6 }
        r3 = r2.d;	 Catch:{ aeom -> 0x00c6 }
        if (r3 != 0) goto L_0x005d;
    L_0x005b:
        r3 = 1;
        goto L_0x005e;
    L_0x005d:
        r3 = 0;
    L_0x005e:
        defpackage.amqw.b(r3);	 Catch:{ aeom -> 0x00c6 }
        r2.d = r13;	 Catch:{ aeom -> 0x00c6 }
    L_0x0063:
        r3 = r2.a;	 Catch:{ aeom -> 0x00c6 }
        r3 = r3.isEmpty();	 Catch:{ aeom -> 0x00c6 }
        if (r3 != 0) goto L_0x0077;
    L_0x006b:
        r3 = r2.a;	 Catch:{ aeom -> 0x00c6 }
        r3 = r3.poll();	 Catch:{ aeom -> 0x00c6 }
        r3 = (java.lang.Runnable) r3;	 Catch:{ aeom -> 0x00c6 }
        r3.run();	 Catch:{ aeom -> 0x00c6 }
        goto L_0x0063;
    L_0x0077:
        r2 = r0.c;	 Catch:{ aeom -> 0x00c6 }
        r3 = defpackage.afgp.a;	 Catch:{ aeom -> 0x00c6 }
        r2.a(r12, r14, r3, r11);	 Catch:{ aeom -> 0x00c6 }
        r11 = r0.c;	 Catch:{ aeom -> 0x00c6 }
        r11.k = r9;	 Catch:{ aeom -> 0x00c6 }
        r11 = r0.d;	 Catch:{ aeom -> 0x00c6 }
        r12 = new afba;	 Catch:{ aeom -> 0x00c6 }
        r12.<init>(r0);	 Catch:{ aeom -> 0x00c6 }
        r11.post(r12);	 Catch:{ aeom -> 0x00c6 }
        r0.c();	 Catch:{ aeom -> 0x00c6 }
        r11 = r10.j;	 Catch:{ aeom -> 0x00c6 }
        r12 = r10.d;	 Catch:{ aeom -> 0x00c6 }
        r11.a(r12, r9);	 Catch:{ aeom -> 0x00c6 }
        r11 = r10.j;	 Catch:{ aeom -> 0x00c6 }
        r11 = r11.m;	 Catch:{ aeom -> 0x00c6 }
        r11 = r11.a;	 Catch:{ aeom -> 0x00c6 }
        r12 = new aegy;	 Catch:{ aeom -> 0x00c6 }
        r12.<init>();	 Catch:{ aeom -> 0x00c6 }
        r11.a(r12);	 Catch:{ aeom -> 0x00c6 }
        return r9;
    L_0x00a5:
        r11 = new aeom;	 Catch:{ aeom -> 0x00ad }
        r12 = "invalid_stream_selection";
        r11.<init>(r12);	 Catch:{ aeom -> 0x00ad }
        throw r11;	 Catch:{ aeom -> 0x00ad }
    L_0x00ad:
        r11 = move-exception;
        r12 = r0.c;	 Catch:{ aeom -> 0x00c6 }
        r12 = r12.e;	 Catch:{ aeom -> 0x00c6 }
        r12.b();	 Catch:{ aeom -> 0x00c6 }
        throw r11;	 Catch:{ aeom -> 0x00c6 }
    L_0x00b6:
        r11 = new aeom;	 Catch:{ aeom -> 0x00c6 }
        r12 = "hdr";
        r11.<init>(r12);	 Catch:{ aeom -> 0x00c6 }
        throw r11;	 Catch:{ aeom -> 0x00c6 }
    L_0x00be:
        r11 = new aeom;	 Catch:{ aeom -> 0x00c6 }
        r12 = "manifestless";
        r11.<init>(r12);	 Catch:{ aeom -> 0x00c6 }
        throw r11;	 Catch:{ aeom -> 0x00c6 }
    L_0x00c6:
        r11 = move-exception;
        r12 = "empe";
        r13.a(r12, r11);
    L_0x00cc:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexr.a(java.lang.String, aajj, aeuy, aajs):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final void i() {
        afaj afaj = this.d;
        if (afaj != null && afaj.c() != null) {
            int intValue = this.d.c().intValue();
            this.d.a(null);
            aajs a = aajx.a(intValue);
            aajj aajj = this.e.e;
            aexc aexc = this.j.f;
            affh a2 = affd.a(a, aajj, aexc.c, aexc.a(aajj), this.j.f.g);
            if (this.d.a().c != a2.c) {
                this.d.a(a2);
                this.j.b(this.d);
                this.j.o.a(this.d);
            }
        }
    }
}
