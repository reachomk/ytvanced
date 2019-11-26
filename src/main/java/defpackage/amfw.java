package defpackage;

import java.io.IOException;

/* renamed from: amfw */
public final class amfw extends amgh {
    public final abju a;
    private final afpu c;
    private final atlx d;
    private final ambh e;
    private final amez f;
    private final alys h;
    private final xsc i;
    private final amdg j;
    private final amch k;

    public amfw(afpu afpu, atlx atlx, ambh ambh, abju abju, amez amez, amch amch, alys alys, amdg amdg, xsc xsc, ambw ambw) {
        super(6, ambw);
        this.c = afpu;
        this.d = atlx;
        this.e = ambh;
        this.a = abju;
        this.f = amez;
        this.h = alys;
        this.j = amdg;
        this.i = xsc;
        this.k = amch;
    }

    public final String a() {
        return "CreateDraftVideoTask";
    }

    public final boolean d() {
        return true;
    }

    public final boolean e() {
        return true;
    }

    public final amec a(amea amea) {
        amec amec = amea.u;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amfv.a;
    }

    public final amcj b() {
        return this.k;
    }

    public final amcj f() {
        return this.k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f4  */
    public final defpackage.anjv a(java.lang.String r8, defpackage.amea r9) {
        /*
        r7 = this;
        r8 = r7.c;
        r0 = r9.c;
        r8 = r8.a(r0);
        if (r8 == 0) goto L_0x0149;
    L_0x000a:
        r0 = defpackage.atln.g;
        r0 = r0.createBuilder();
        r0 = (defpackage.atlq) r0;
        r1 = r9.g;
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (defpackage.atln) r2;
        if (r1 == 0) goto L_0x0143;
    L_0x001d:
        r3 = r2.a;
        r3 = r3 | 4;
        r2.a = r3;
        r2.d = r1;
        r1 = r7.j;
        r2 = r9.g;
        r1 = r1.a(r2);
        if (r1 != 0) goto L_0x0030;
    L_0x002f:
        goto L_0x003f;
    L_0x0030:
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (defpackage.atln) r2;
        r2.f = r1;
        r1 = r2.a;
        r1 = r1 | 32;
        r2.a = r1;
    L_0x003f:
        r1 = r9.b;
        r1 = r1 & 512;
        r2 = 0;
        if (r1 == 0) goto L_0x004d;
    L_0x0046:
        r1 = r9.S;
        if (r1 != 0) goto L_0x004e;
    L_0x004a:
        r1 = defpackage.amdr.r;
        goto L_0x004e;
    L_0x004d:
        r1 = r2;
    L_0x004e:
        r1 = defpackage.amdi.a(r1);
        if (r1 != 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0064;
    L_0x0055:
        r0.copyOnWrite();
        r3 = r0.instance;
        r3 = (defpackage.atln) r3;
        r3.e = r1;
        r1 = r3.a;
        r1 = r1 | 16;
        r3.a = r1;
    L_0x0064:
        r1 = r7.f;
        r3 = r9.d;
        r3 = android.net.Uri.parse(r3);
        r1 = r1.a(r3, r2);
        r3 = r9.q;
        r9 = r9.P;
        r9 = r1.a(r3, r9);
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.atln) r1;
        if (r9 == 0) goto L_0x013d;
    L_0x0081:
        r1.c = r9;
        r9 = r1.a;
        r9 = r9 | 2;
        r1.a = r9;
        r9 = r7.e;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.atln) r0;
        r1 = r9.a;
        r3 = new amap;
        r9 = r9.c;
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.atlq) r0;
        r3.<init>(r9, r8, r0);
        r3.g();
        r8 = r1.b(r3);
        r8 = (defpackage.ajuc) r8;
        r8 = r8.a;
        r9 = 1;
        r0 = "";
        r1 = 5;
        r3 = "CreateDraftVideoTask";
        if (r8 == 0) goto L_0x011f;
    L_0x00b7:
        r8 = r8.a;
        if (r8 != 0) goto L_0x00bc;
    L_0x00bb:
        goto L_0x011f;
    L_0x00bc:
        r4 = r8.c;
        r8 = r8.b;
        r8 = r8.iterator();
    L_0x00c4:
        r5 = r8.hasNext();
        if (r5 == 0) goto L_0x00ee;
    L_0x00ca:
        r5 = r8.next();
        r5 = (defpackage.aqrc) r5;
        r6 = r5.a;
        r6 = r6 & r9;
        if (r6 == 0) goto L_0x00c4;
    L_0x00d5:
        r8 = r5.b;
        if (r8 != 0) goto L_0x00db;
    L_0x00d9:
        r8 = defpackage.ayhc.e;
    L_0x00db:
        r8 = r8.c;
        r0 = r5.b;
        if (r0 != 0) goto L_0x00e3;
    L_0x00e1:
        r0 = defpackage.ayhc.e;
    L_0x00e3:
        r0 = r0.b;
        r5 = (long) r0;
        r0 = r7.i;
        r0 = defpackage.amjq.a(r5, r0);
        r2 = r0;
        r0 = r8;
    L_0x00ee:
        r8 = r0.isEmpty();
        if (r8 == 0) goto L_0x0104;
    L_0x00f4:
        r8 = r7.h;
        r5 = " feedback continuation not populated";
        r3 = r3.concat(r5);
        r8.a(r3);
        r8 = defpackage.amjq.a(r1);
        goto L_0x012f;
    L_0x0104:
        r8 = r4.isEmpty();
        if (r8 == 0) goto L_0x011a;
    L_0x010a:
        r8 = r7.h;
        r5 = " video id not populated";
        r3 = r3.concat(r5);
        r8.a(r3);
        r8 = defpackage.amjq.a(r1);
        goto L_0x012f;
    L_0x011a:
        r8 = defpackage.amjq.a();
        goto L_0x012f;
    L_0x011f:
        r8 = r7.h;
        r4 = " CreatedUploadItemRenderer not populated";
        r3 = r3.concat(r4);
        r8.a(r3);
        r8 = defpackage.amjq.a(r1);
        r4 = r0;
    L_0x012f:
        r1 = new amfy;
        r1.<init>(r0, r2, r4);
        r8 = r7.a(r8, r9, r1);
        r8 = defpackage.anjf.a(r8);
        return r8;
    L_0x013d:
        r8 = new java.lang.NullPointerException;
        r8.<init>();
        throw r8;
    L_0x0143:
        r8 = new java.lang.NullPointerException;
        r8.<init>();
        throw r8;
    L_0x0149:
        r8 = new amgj;
        r8.<init>();
        goto L_0x0150;
    L_0x014f:
        throw r8;
    L_0x0150:
        goto L_0x014f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amfw.a(java.lang.String, amea):anjv");
    }

    public final anjv a(String str, alyz alyz) {
        return anjf.a(new amfx(this, str, alyz), aniv.a);
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        int i = 1;
        String str = "CreateDraftVideoTask";
        alys alys;
        if (th instanceof IOException) {
            alys = this.h;
            str = str.concat(" Source Failed");
            int a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(3), z);
        } else if (th instanceof aanq) {
            Object obj = amea.u;
            if (obj == null) {
                obj = amec.g;
            }
            return a(amjq.a(5, (amec) amqw.a(obj), this.d.p, this.h), z);
        } else {
            alys = this.h;
            str = str.concat(" Throwable");
            int a2 = amek.a(amea.h);
            if (a2 != 0) {
                i = a2;
            }
            alys.a(str, th, i);
            return super.a(th, amea, z);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        int i = amea.a;
        return ((i & 1) == 0 || (i & 16) == 0 || (i & 65536) == 0) ? false : true;
    }
}
