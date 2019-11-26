package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: afzn */
public final class afzn implements afzh {
    private final afzg a;
    private final agwm b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public afzn(afzg afzg, agwm agwm, bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = afzg;
        this.b = agwm;
        this.c = bcaa;
        this.d = bcaa2;
        this.e = bcaa3;
    }

    private static int a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? 1 : 2 : 4 : 3 : 5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    public final defpackage.avms a(boolean r17) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        defpackage.xak.b();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r0.c;
        r3 = r3.get();
        r3 = (defpackage.agfi) r3;
        r4 = r0.d;
        r4 = r4.get();
        r4 = (defpackage.agci) r4;
        r4 = r4.a();
        r4 = r4.iterator();
        r6 = 0;
        r7 = 0;
    L_0x0026:
        r8 = r4.hasNext();
        r9 = 2;
        r10 = 1;
        if (r8 == 0) goto L_0x0123;
    L_0x002e:
        r8 = r4.next();
        r8 = (defpackage.agqy) r8;
        r11 = r8.n();
        r12 = 3;
        if (r11 == 0) goto L_0x003c;
    L_0x003b:
        goto L_0x0044;
    L_0x003c:
        r11 = r8.l;
        r13 = defpackage.agqf.STREAM_CORRUPT;
        if (r11 == r13) goto L_0x0044;
    L_0x0042:
        goto L_0x00c9;
    L_0x0044:
        r11 = r0.e;
        r11 = r11.get();
        r11 = (defpackage.agbo) r11;
        r13 = r8.a();
        r14 = 0;
        r11 = r11.a(r13, r14);
        if (r11 == 0) goto L_0x00c9;
    L_0x0058:
        r13 = r11.b;
        r14 = 4;
        if (r13 == 0) goto L_0x008c;
    L_0x005d:
        r13 = r0.a(r13, r1);
        r2.add(r13);
        r15 = r13.d;
        r15 = defpackage.apin.a(r15);
        if (r15 != 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0071;
    L_0x006d:
        if (r15 != r9) goto L_0x0071;
    L_0x006f:
        r13 = 1;
        goto L_0x008d;
    L_0x0071:
        r15 = r13.d;
        r15 = defpackage.apin.a(r15);
        if (r15 != 0) goto L_0x007a;
    L_0x0079:
        goto L_0x007d;
    L_0x007a:
        if (r15 != r12) goto L_0x007d;
    L_0x007c:
        goto L_0x006f;
    L_0x007d:
        r13 = r13.d;
        r13 = defpackage.apin.a(r13);
        if (r13 != 0) goto L_0x0086;
    L_0x0085:
        goto L_0x008c;
    L_0x0086:
        if (r13 == r14) goto L_0x0089;
    L_0x0088:
        goto L_0x008c;
    L_0x0089:
        r13 = 0;
        r15 = 1;
        goto L_0x008e;
    L_0x008c:
        r13 = 0;
    L_0x008d:
        r15 = 0;
    L_0x008e:
        r11 = r11.a;
        if (r11 == 0) goto L_0x00bf;
    L_0x0092:
        r11 = r0.a(r11, r1);
        r2.add(r11);
        r5 = r11.d;
        r5 = defpackage.apin.a(r5);
        if (r5 != 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00a6;
    L_0x00a2:
        if (r5 != r9) goto L_0x00a6;
    L_0x00a4:
        r13 = 1;
        goto L_0x00bf;
    L_0x00a6:
        r5 = r11.d;
        r5 = defpackage.apin.a(r5);
        if (r5 != 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x00b2;
    L_0x00af:
        if (r5 != r12) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00a4;
    L_0x00b2:
        r5 = r11.d;
        r5 = defpackage.apin.a(r5);
        if (r5 != 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00bf;
    L_0x00bb:
        if (r5 == r14) goto L_0x00be;
    L_0x00bd:
        goto L_0x00bf;
    L_0x00be:
        r15 = 1;
    L_0x00bf:
        if (r13 == 0) goto L_0x00c3;
    L_0x00c1:
        r5 = 3;
        goto L_0x00ca;
    L_0x00c3:
        if (r15 == 0) goto L_0x00c7;
    L_0x00c5:
        r5 = 2;
        goto L_0x00ca;
    L_0x00c7:
        r5 = 1;
        goto L_0x00ca;
    L_0x00c9:
        r5 = 0;
    L_0x00ca:
        if (r5 == r10) goto L_0x010b;
    L_0x00cc:
        if (r5 == r9) goto L_0x00f5;
    L_0x00ce:
        if (r5 == r12) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00d7;
    L_0x00d1:
        r7 = r7 + 1;
        r6 = r6 + 1;
        if (r1 != 0) goto L_0x00da;
    L_0x00d7:
        r11 = 0;
        goto L_0x0026;
    L_0x00da:
        r5 = r8.z();
        if (r5 == 0) goto L_0x00d7;
    L_0x00e0:
        r5 = r8.a();
        defpackage.xvd.a(r5);
        r8 = r3.h;
        r5 = r8.a(r5);
        if (r5 == 0) goto L_0x00d7;
    L_0x00ef:
        r11 = 0;
        r5.a(r11);
        goto L_0x0026;
    L_0x00f5:
        r11 = 0;
        r7 = r7 + 1;
        if (r1 == 0) goto L_0x0026;
    L_0x00fa:
        r5 = r8.l;
        r9 = defpackage.agqf.STREAM_CORRUPT;
        if (r5 == r9) goto L_0x0026;
    L_0x0100:
        r5 = r8.a();
        r8 = defpackage.agqf.STREAM_CORRUPT;
        r3.a(r5, r8);
        goto L_0x0026;
    L_0x010b:
        r11 = 0;
        r7 = r7 + 1;
        if (r1 != 0) goto L_0x0112;
    L_0x0110:
        goto L_0x0026;
    L_0x0112:
        r5 = r8.l;
        r9 = defpackage.agqf.COMPLETE;
        if (r5 == r9) goto L_0x0026;
    L_0x0118:
        r5 = r8.a();
        r8 = defpackage.agqf.COMPLETE;
        r3.a(r5, r8);
        goto L_0x0026;
    L_0x0123:
        r1 = defpackage.avms.e;
        r1 = r1.createBuilder();
        r1 = (defpackage.avmv) r1;
        r1.copyOnWrite();
        r3 = r1.instance;
        r3 = (defpackage.avms) r3;
        r4 = r3.a;
        r4 = r4 | r10;
        r3.a = r4;
        r3.b = r6;
        r1.copyOnWrite();
        r3 = r1.instance;
        r3 = (defpackage.avms) r3;
        r4 = r3.a;
        r4 = r4 | r9;
        r3.a = r4;
        r3.c = r7;
        r1.copyOnWrite();
        r3 = r1.instance;
        r3 = (defpackage.avms) r3;
        r4 = r3.d;
        r4 = r4.a();
        if (r4 != 0) goto L_0x015e;
    L_0x0156:
        r4 = r3.d;
        r4 = defpackage.anxl.mutableCopy(r4);
        r3.d = r4;
    L_0x015e:
        r3 = r3.d;
        defpackage.anvf.addAll(r2, r3);
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.avms) r1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzn.a(boolean):avms");
    }

    private final avmu a(agql agql, boolean z) {
        avmx avmx = (avmx) avmu.n.createBuilder();
        String q = agql.q();
        avmx.copyOnWrite();
        avmu avmu = (avmu) avmx.instance;
        if (q != null) {
            avmu.a |= 1;
            avmu.b = q;
            int a = afzn.a(agql.d());
            avmx.copyOnWrite();
            avmu = (avmu) avmx.instance;
            if (a != 0) {
                avmu.a |= 16;
                avmu.f = a - 1;
                long e = agql.e();
                avmx.copyOnWrite();
                avmu avmu2 = (avmu) avmx.instance;
                avmu2.a |= 32;
                avmu2.g = e;
                a = agql.r();
                avmx.copyOnWrite();
                avmu = (avmu) avmx.instance;
                avmu.a |= 2;
                avmu.c = a;
                agwl a2 = this.b.a(agql, this.a);
                boolean z2 = a2.b;
                avmx.copyOnWrite();
                avmu2 = (avmu) avmx.instance;
                avmu2.a |= 8;
                avmu2.e = z2;
                int a3 = afzn.a(a2.a);
                avmx.copyOnWrite();
                avmu2 = (avmu) avmx.instance;
                if (a3 != 0) {
                    int r;
                    avmu2.a |= 4;
                    avmu2.d = a3 - 1;
                    if (agql.d() != a2.a && z) {
                        agbo agbo = (agbo) this.e.get();
                        String q2 = agql.q();
                        r = agql.r();
                        int i = a2.a;
                        if (((agbg) agbo.d.get()).v()) {
                            ((agfi) agbo.c.get()).a(q2, r, i);
                        }
                    }
                    agwn agwn = a2.c;
                    if (agwn != null) {
                        int i2 = agwn.b;
                        avmx.copyOnWrite();
                        avmu avmu3 = (avmu) avmx.instance;
                        avmu3.a |= 128;
                        avmu3.i = i2;
                        List asList = Arrays.asList(agwn.c);
                        avmx.copyOnWrite();
                        avmu3 = (avmu) avmx.instance;
                        if (!avmu3.j.a()) {
                            avmu3.j = anxl.mutableCopy(avmu3.j);
                        }
                        anvf.addAll(asList, avmu3.j);
                        i2 = agwn.e;
                        avmx.copyOnWrite();
                        avmu3 = (avmu) avmx.instance;
                        if (i2 != 0) {
                            avmu3.a |= 64;
                            avmu3.h = i2 - 1;
                            if (i2 == 4) {
                                i2 = agwn.f;
                                avmx.copyOnWrite();
                                avmu3 = (avmu) avmx.instance;
                                if (i2 != 0) {
                                    avmu3.a |= 256;
                                    avmu3.k = i2 - 1;
                                    i2 = agwn.g;
                                    avmx.copyOnWrite();
                                    avmu3 = (avmu) avmx.instance;
                                    if (i2 != 0) {
                                        avmu3.a |= 512;
                                        avmu3.l = i2 - 1;
                                        if (agwn.d.length != 0) {
                                            r = afzn.a(3);
                                            avmx.copyOnWrite();
                                            avmu avmu4 = (avmu) avmx.instance;
                                            if (r != 0) {
                                                avmu4.a |= 1024;
                                                avmu4.m = r - 1;
                                            } else {
                                                throw new NullPointerException();
                                            }
                                        }
                                    }
                                    throw new NullPointerException();
                                }
                                throw new NullPointerException();
                            }
                        }
                        throw new NullPointerException();
                    }
                    return (avmu) ((anxl) avmx.build());
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
