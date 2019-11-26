package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: luh */
public final class luh implements ell, lcp {
    private final luk a;
    private final elf b;
    private final elk c;
    private final adqf d;
    private final fkd e;
    private final Set f = new HashSet();
    private boolean g;
    private eiy h;

    public luh(luk luk, elf elf, elk elk, elm elm, fkd fkd, adqf adqf) {
        this.a = (luk) amqw.a((Object) luk);
        this.b = (elf) amqw.a((Object) elf);
        this.c = (elk) amqw.a((Object) elk);
        this.d = (adqf) amqw.a((Object) adqf);
        this.e = (fkd) amqw.a((Object) fkd);
        elm.a(this);
    }

    public final void a(lco lco) {
        this.f.add(lco);
    }

    public final void b(lco lco) {
        this.f.remove(lco);
    }

    public final void a(eiy eiy) {
        amqw.a((Object) eiy);
        if (this.g) {
            b(eiy);
        } else {
            this.h = eiy;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df A:{LOOP_END, LOOP:1: B:47:0x00d9->B:49:0x00df} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df A:{LOOP_END, LOOP:1: B:47:0x00d9->B:49:0x00df} */
    private final void b(defpackage.eiy r9) {
        /*
        r8 = this;
        r0 = 0;
        r8.h = r0;
        r0 = r8.a;
        r0 = r0.a();
        r0 = r0.g();
        r1 = 3;
        if (r0 != 0) goto L_0x0011;
    L_0x0010:
        goto L_0x001b;
    L_0x0011:
        r2 = r9.d;
        if (r2 == r1) goto L_0x001b;
    L_0x0015:
        r2 = new eiy;
        r2.<init>(r9);
        r9 = r2;
    L_0x001b:
        r2 = r8.f;
        r2 = r2.iterator();
    L_0x0021:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0031;
    L_0x0027:
        r3 = r2.next();
        r3 = (defpackage.lco) r3;
        r3.W();
        goto L_0x0021;
    L_0x0031:
        r2 = r9.a;
        r3 = r8.d;
        r3 = r3.c();
        r4 = 1;
        r5 = 0;
        if (r3 == 0) goto L_0x0043;
    L_0x003d:
        r1 = defpackage.ejd.WATCH_WHILE_MAXIMIZED;
    L_0x003f:
        r2 = 0;
        r4 = 0;
        goto L_0x00b7;
    L_0x0043:
        r3 = r8.a;
        r3 = r3.a();
        r3 = r3.k();
        if (r3 == 0) goto L_0x0052;
    L_0x004f:
        r1 = defpackage.ejd.VIRTUAL_REALITY_FULLSCREEN;
        goto L_0x003f;
    L_0x0052:
        r3 = r8.a;
        r3 = r3.a();
        r3 = r3.n();
        if (r3 == 0) goto L_0x0061;
    L_0x005e:
        r1 = defpackage.ejd.WATCH_WHILE_PICTURE_IN_PICTURE;
        goto L_0x003f;
    L_0x0061:
        r3 = r8.a;
        r3 = r3.a();
        r6 = r9.a;
        r6 = r6.b;
        r6 = r6.instance;
        r6 = (defpackage.nkv) r6;
        r6 = r6.i;
        if (r6 != 0) goto L_0x008c;
    L_0x0073:
        r6 = r3.a();
        if (r6 == 0) goto L_0x007c;
    L_0x0079:
        r3 = defpackage.ejd.WATCH_WHILE_FULLSCREEN;
        goto L_0x008e;
    L_0x007c:
        r6 = r9.c;
        if (r6 == 0) goto L_0x0089;
    L_0x0080:
        r3 = r3.d();
        if (r3 == 0) goto L_0x0089;
    L_0x0086:
        r3 = defpackage.ejd.WATCH_WHILE_MINIMIZED;
        goto L_0x008e;
    L_0x0089:
        r3 = defpackage.ejd.WATCH_WHILE_MAXIMIZED;
        goto L_0x008e;
    L_0x008c:
        r3 = defpackage.ejd.WATCH_WHILE_MINIMIZED;
    L_0x008e:
        r3 = r3.ordinal();
        if (r3 == r4) goto L_0x00b4;
    L_0x0094:
        if (r3 == r1) goto L_0x00b1;
    L_0x0096:
        r1 = r8.e;
        r1 = r1.e();
        if (r1 != 0) goto L_0x00a1;
    L_0x009e:
        r1 = defpackage.ejd.WATCH_WHILE_FULLSCREEN;
        goto L_0x00b6;
    L_0x00a1:
        r1 = r2.b;
        r1 = r1.instance;
        r1 = (defpackage.nkv) r1;
        r4 = r1.e;
        r1 = r4 ^ 1;
        r2 = defpackage.ejd.WATCH_WHILE_MAXIMIZED;
        r7 = r2;
        r2 = r1;
        r1 = r7;
        goto L_0x00b7;
    L_0x00b1:
        r1 = defpackage.ejd.WATCH_WHILE_FULLSCREEN;
        goto L_0x00b6;
    L_0x00b4:
        r1 = defpackage.ejd.WATCH_WHILE_MINIMIZED;
    L_0x00b6:
        r2 = 0;
    L_0x00b7:
        r3 = r8.c;
        r3.a(r5);
        r3 = r8.b;
        r3.a(r9, r1, r0);
        if (r4 == 0) goto L_0x00c8;
    L_0x00c3:
        r0 = r8.a;
        r0.a(r1);
    L_0x00c8:
        if (r2 == 0) goto L_0x00d3;
    L_0x00ca:
        r0 = r8.a;
        r1 = r9.a();
        r0.a(r1);
    L_0x00d3:
        r0 = r8.f;
        r0 = r0.iterator();
    L_0x00d9:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x00e9;
    L_0x00df:
        r1 = r0.next();
        r1 = (defpackage.lco) r1;
        r1.a(r9);
        goto L_0x00d9;
    L_0x00e9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luh.b(eiy):void");
    }

    public final void A_() {
        this.g = true;
        eiy eiy = this.h;
        if (eiy != null) {
            eiy.a.b();
            b(this.h);
        }
    }

    public final void ar_() {
        this.g = false;
    }
}
