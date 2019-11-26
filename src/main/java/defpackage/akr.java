package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: akr */
public final class akr implements aom {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;
    private final zy d = new aab(30);
    private final akt e;
    private final aoj f;

    public akr(akt akt) {
        this.e = akt;
        this.f = new aoj(this);
    }

    public final void a() {
        a(this.a);
        a(this.b);
        this.c = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0006 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0118  */
    public final void b() {
        /*
        r16 = this;
        r0 = r16;
        r1 = r0.f;
        r2 = r0.a;
    L_0x0006:
        r3 = r2.size();
        r4 = -1;
        r3 = r3 + r4;
        r5 = 0;
        r6 = 0;
    L_0x000e:
        r7 = 8;
        r8 = 1;
        if (r3 < 0) goto L_0x0025;
    L_0x0013:
        r9 = r2.get(r3);
        r9 = (defpackage.aks) r9;
        r9 = r9.a;
        if (r9 == r7) goto L_0x001f;
    L_0x001d:
        r6 = 1;
        goto L_0x0022;
    L_0x001f:
        if (r6 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0026;
    L_0x0022:
        r3 = r3 + -1;
        goto L_0x000e;
    L_0x0025:
        r3 = -1;
    L_0x0026:
        r6 = 4;
        r9 = 2;
        r10 = 0;
        if (r3 == r4) goto L_0x01b9;
    L_0x002b:
        r7 = r3 + 1;
        r11 = r2.get(r3);
        r11 = (defpackage.aks) r11;
        r12 = r2.get(r7);
        r12 = (defpackage.aks) r12;
        r13 = r12.a;
        if (r13 == r8) goto L_0x018f;
    L_0x003d:
        if (r13 == r9) goto L_0x00a0;
    L_0x003f:
        if (r13 == r6) goto L_0x0042;
    L_0x0041:
        goto L_0x0006;
    L_0x0042:
        r4 = r11.d;
        r5 = r12.b;
        if (r4 >= r5) goto L_0x004e;
    L_0x0048:
        r5 = r5 + -1;
        r12.b = r5;
    L_0x004c:
        r4 = r10;
        goto L_0x0061;
    L_0x004e:
        r9 = r12.d;
        r5 = r5 + r9;
        if (r4 >= r5) goto L_0x004c;
    L_0x0053:
        r9 = r9 + -1;
        r12.d = r9;
        r4 = r1.a;
        r5 = r11.b;
        r9 = r12.c;
        r4 = r4.a(r6, r5, r8, r9);
    L_0x0061:
        r5 = r11.b;
        r8 = r12.b;
        if (r5 > r8) goto L_0x006c;
    L_0x0067:
        r8 = r8 + 1;
        r12.b = r8;
        goto L_0x0081;
    L_0x006c:
        r9 = r12.d;
        r8 = r8 + r9;
        if (r5 >= r8) goto L_0x0081;
    L_0x0071:
        r8 = r8 - r5;
        r9 = r1.a;
        r5 = r5 + 1;
        r10 = r12.c;
        r10 = r9.a(r6, r5, r8, r10);
        r5 = r12.d;
        r5 = r5 - r8;
        r12.d = r5;
    L_0x0081:
        r2.set(r7, r11);
        r5 = r12.d;
        if (r5 <= 0) goto L_0x008c;
    L_0x0088:
        r2.set(r3, r12);
        goto L_0x0094;
    L_0x008c:
        r2.remove(r3);
        r5 = r1.a;
        r5.a(r12);
    L_0x0094:
        if (r4 == 0) goto L_0x0099;
    L_0x0096:
        r2.add(r3, r4);
    L_0x0099:
        if (r10 == 0) goto L_0x0006;
    L_0x009b:
        r2.add(r3, r10);
        goto L_0x0006;
    L_0x00a0:
        r4 = r11.b;
        r6 = r11.d;
        if (r4 >= r6) goto L_0x00b5;
    L_0x00a6:
        r13 = r12.b;
        if (r13 != r4) goto L_0x00b3;
    L_0x00aa:
        r13 = r12.d;
        r4 = r6 - r4;
        if (r13 == r4) goto L_0x00b1;
    L_0x00b0:
        goto L_0x00b3;
    L_0x00b1:
        r4 = 0;
        goto L_0x00c2;
    L_0x00b3:
        r4 = 0;
        goto L_0x00c5;
    L_0x00b5:
        r13 = r12.b;
        r14 = r6 + 1;
        if (r13 != r14) goto L_0x00c4;
    L_0x00bb:
        r13 = r12.d;
        r4 = r4 - r6;
        if (r13 == r4) goto L_0x00c1;
    L_0x00c0:
        goto L_0x00c4;
    L_0x00c1:
        r4 = 1;
    L_0x00c2:
        r5 = 1;
        goto L_0x00c5;
    L_0x00c4:
        r4 = 1;
    L_0x00c5:
        r13 = r12.b;
        if (r6 >= r13) goto L_0x00ce;
    L_0x00c9:
        r13 = r13 + -1;
        r12.b = r13;
        goto L_0x00ea;
    L_0x00ce:
        r14 = r12.d;
        r15 = r13 + r14;
        if (r6 >= r15) goto L_0x00ea;
    L_0x00d4:
        r14 = r14 + -1;
        r12.d = r14;
        r11.a = r9;
        r11.d = r8;
        r3 = r12.d;
        if (r3 != 0) goto L_0x0006;
    L_0x00e0:
        r2.remove(r7);
        r3 = r1.a;
        r3.a(r12);
        goto L_0x0006;
    L_0x00ea:
        r6 = r11.b;
        if (r6 > r13) goto L_0x00f3;
    L_0x00ee:
        r13 = r13 + 1;
        r12.b = r13;
        goto L_0x0109;
    L_0x00f3:
        r8 = r12.d;
        r13 = r13 + r8;
        if (r6 < r13) goto L_0x00f9;
    L_0x00f8:
        goto L_0x0109;
    L_0x00f9:
        r8 = r1.a;
        r14 = r6 + 1;
        r13 = r13 - r6;
        r10 = r8.a(r9, r14, r13, r10);
        r6 = r11.b;
        r8 = r12.b;
        r6 = r6 - r8;
        r12.d = r6;
    L_0x0109:
        if (r5 == 0) goto L_0x0118;
    L_0x010b:
        r2.set(r3, r12);
        r2.remove(r7);
        r3 = r1.a;
        r3.a(r11);
        goto L_0x0006;
    L_0x0118:
        if (r4 == 0) goto L_0x0149;
    L_0x011a:
        if (r10 == 0) goto L_0x0132;
    L_0x011c:
        r4 = r11.b;
        r5 = r10.b;
        if (r4 <= r5) goto L_0x0127;
    L_0x0122:
        r5 = r10.d;
        r4 = r4 - r5;
        r11.b = r4;
    L_0x0127:
        r4 = r11.d;
        r5 = r10.b;
        if (r4 <= r5) goto L_0x0132;
    L_0x012d:
        r5 = r10.d;
        r4 = r4 - r5;
        r11.d = r4;
    L_0x0132:
        r4 = r11.b;
        r5 = r12.b;
        if (r4 <= r5) goto L_0x013d;
    L_0x0138:
        r5 = r12.d;
        r4 = r4 - r5;
        r11.b = r4;
    L_0x013d:
        r4 = r11.d;
        r5 = r12.b;
        if (r4 <= r5) goto L_0x0178;
    L_0x0143:
        r5 = r12.d;
        r4 = r4 - r5;
        r11.d = r4;
        goto L_0x0178;
    L_0x0149:
        if (r10 != 0) goto L_0x014c;
    L_0x014b:
        goto L_0x0162;
    L_0x014c:
        r4 = r11.b;
        r5 = r10.b;
        if (r4 < r5) goto L_0x0157;
    L_0x0152:
        r5 = r10.d;
        r4 = r4 - r5;
        r11.b = r4;
    L_0x0157:
        r4 = r11.d;
        r5 = r10.b;
        if (r4 < r5) goto L_0x0162;
    L_0x015d:
        r5 = r10.d;
        r4 = r4 - r5;
        r11.d = r4;
    L_0x0162:
        r4 = r11.b;
        r5 = r12.b;
        if (r4 < r5) goto L_0x016d;
    L_0x0168:
        r5 = r12.d;
        r4 = r4 - r5;
        r11.b = r4;
    L_0x016d:
        r4 = r11.d;
        r5 = r12.b;
        if (r4 < r5) goto L_0x0178;
    L_0x0173:
        r5 = r12.d;
        r4 = r4 - r5;
        r11.d = r4;
    L_0x0178:
        r2.set(r3, r12);
        r4 = r11.b;
        r5 = r11.d;
        if (r4 == r5) goto L_0x0185;
    L_0x0181:
        r2.set(r7, r11);
        goto L_0x0188;
    L_0x0185:
        r2.remove(r7);
    L_0x0188:
        if (r10 == 0) goto L_0x0006;
    L_0x018a:
        r2.add(r3, r10);
        goto L_0x0006;
    L_0x018f:
        r6 = r11.d;
        r8 = r12.b;
        if (r6 >= r8) goto L_0x0196;
    L_0x0195:
        goto L_0x0197;
    L_0x0196:
        r4 = 0;
    L_0x0197:
        r5 = r11.b;
        if (r5 >= r8) goto L_0x019d;
    L_0x019b:
        r4 = r4 + 1;
    L_0x019d:
        if (r8 > r5) goto L_0x01a4;
    L_0x019f:
        r8 = r12.d;
        r5 = r5 + r8;
        r11.b = r5;
    L_0x01a4:
        r5 = r12.b;
        if (r5 <= r6) goto L_0x01a9;
    L_0x01a8:
        goto L_0x01ae;
    L_0x01a9:
        r8 = r12.d;
        r6 = r6 + r8;
        r11.d = r6;
    L_0x01ae:
        r5 = r5 + r4;
        r12.b = r5;
        r2.set(r3, r12);
        r2.set(r7, r11);
        goto L_0x0006;
    L_0x01b9:
        r1 = r0.a;
        r1 = r1.size();
        r2 = 0;
    L_0x01c0:
        if (r2 >= r1) goto L_0x0289;
    L_0x01c2:
        r3 = r0.a;
        r3 = r3.get(r2);
        r3 = (defpackage.aks) r3;
        r11 = r3.a;
        if (r11 == r8) goto L_0x0281;
    L_0x01ce:
        if (r11 == r9) goto L_0x022d;
    L_0x01d0:
        if (r11 == r6) goto L_0x01db;
    L_0x01d2:
        if (r11 == r7) goto L_0x01d6;
    L_0x01d4:
        goto L_0x0284;
    L_0x01d6:
        r0.c(r3);
        goto L_0x0284;
    L_0x01db:
        r11 = r3.b;
        r12 = r3.d;
        r12 = r12 + r11;
        r14 = r11;
        r13 = 0;
        r15 = -1;
    L_0x01e3:
        if (r11 >= r12) goto L_0x0216;
    L_0x01e5:
        r4 = r0.e;
        r4 = r4.a(r11);
        if (r4 != 0) goto L_0x0202;
    L_0x01ed:
        r4 = r0.c(r11);
        if (r4 != 0) goto L_0x0202;
    L_0x01f3:
        if (r15 != r8) goto L_0x0200;
    L_0x01f5:
        r4 = r3.c;
        r4 = r0.a(r6, r14, r13, r4);
        r0.c(r4);
        r14 = r11;
        r13 = 0;
    L_0x0200:
        r15 = 0;
        goto L_0x0211;
    L_0x0202:
        if (r15 == 0) goto L_0x0205;
    L_0x0204:
        goto L_0x0210;
    L_0x0205:
        r4 = r3.c;
        r4 = r0.a(r6, r14, r13, r4);
        r0.b(r4);
        r14 = r11;
        r13 = 0;
    L_0x0210:
        r15 = 1;
    L_0x0211:
        r13 = r13 + r8;
        r11 = r11 + 1;
        r4 = -1;
        goto L_0x01e3;
    L_0x0216:
        r4 = r3.d;
        if (r13 == r4) goto L_0x0223;
    L_0x021a:
        r4 = r3.c;
        r0.a(r3);
        r3 = r0.a(r6, r14, r13, r4);
    L_0x0223:
        if (r15 != 0) goto L_0x0229;
    L_0x0225:
        r0.b(r3);
        goto L_0x0284;
    L_0x0229:
        r0.c(r3);
        goto L_0x0284;
    L_0x022d:
        r4 = r3.b;
        r11 = r3.d;
        r11 = r11 + r4;
        r12 = r11;
        r13 = 0;
        r14 = -1;
        r11 = r4;
    L_0x0236:
        if (r11 >= r12) goto L_0x026c;
    L_0x0238:
        r15 = r0.e;
        r15 = r15.a(r11);
        if (r15 != 0) goto L_0x0254;
    L_0x0240:
        r15 = r0.c(r11);
        if (r15 != 0) goto L_0x0254;
    L_0x0246:
        if (r14 != r8) goto L_0x0251;
    L_0x0248:
        r14 = r0.a(r9, r4, r13, r10);
        r0.c(r14);
        r14 = 1;
        goto L_0x0252;
    L_0x0251:
        r14 = 0;
    L_0x0252:
        r15 = 0;
        goto L_0x0261;
    L_0x0254:
        if (r14 == 0) goto L_0x0258;
    L_0x0256:
        r14 = 0;
        goto L_0x0260;
    L_0x0258:
        r14 = r0.a(r9, r4, r13, r10);
        r0.b(r14);
        r14 = 1;
    L_0x0260:
        r15 = 1;
    L_0x0261:
        if (r14 == 0) goto L_0x0267;
    L_0x0263:
        r11 = r11 - r13;
        r12 = r12 - r13;
        r13 = 1;
        goto L_0x0269;
    L_0x0267:
        r13 = r13 + 1;
    L_0x0269:
        r11 = r11 + r8;
        r14 = r15;
        goto L_0x0236;
    L_0x026c:
        r11 = r3.d;
        if (r13 == r11) goto L_0x0277;
    L_0x0270:
        r0.a(r3);
        r3 = r0.a(r9, r4, r13, r10);
    L_0x0277:
        if (r14 != 0) goto L_0x027d;
    L_0x0279:
        r0.b(r3);
        goto L_0x0284;
    L_0x027d:
        r0.c(r3);
        goto L_0x0284;
    L_0x0281:
        r0.c(r3);
    L_0x0284:
        r2 = r2 + 1;
        r4 = -1;
        goto L_0x01c0;
    L_0x0289:
        r1 = r0.a;
        r1.clear();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akr.b():void");
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.b((aks) this.b.get(i));
        }
        a(this.b);
        this.c = 0;
    }

    private final void b(aks aks) {
        int i = aks.a;
        if (i == 1 || i == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        i = a(aks.b, i);
        int i2 = aks.b;
        int i3 = aks.a;
        if (i3 == 2) {
            i3 = 0;
        } else if (i3 == 4) {
            i3 = 1;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("op should be remove or update.");
            stringBuilder.append(aks);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i4 = i;
        int i5 = i2;
        i2 = 1;
        for (i = 1; i < aks.d; i++) {
            int a = a(aks.b + (i3 * i), aks.a);
            int i6 = aks.a;
            if (i6 == 2 ? a != i4 : !(i6 == 4 && a == i4 + 1)) {
                aks a2 = a(i6, i4, i2, aks.c);
                a(a2, i5);
                a(a2);
                if (aks.a == 4) {
                    i5 += i2;
                }
                i4 = a;
                i2 = 1;
            } else {
                i2++;
            }
        }
        Object obj = aks.c;
        a(aks);
        if (i2 > 0) {
            aks = a(aks.a, i4, i2, obj);
            a(aks, i5);
            a(aks);
        }
    }

    private final void a(aks aks, int i) {
        this.e.a(aks);
        int i2 = aks.a;
        if (i2 == 2) {
            this.e.a(i, aks.d);
        } else if (i2 == 4) {
            this.e.a(i, aks.d, aks.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private final int a(int i, int i2) {
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            aks aks = (aks) this.b.get(size);
            int i3 = aks.a;
            int i4;
            if (i3 == 8) {
                i4 = aks.b;
                i3 = aks.d;
                int i5 = i4 < i3 ? i3 : i4;
                int i6 = i4 < i3 ? i4 : i3;
                if (i < i6 || i > i5) {
                    if (i < i4) {
                        if (i2 == 1) {
                            aks.b = i4 + 1;
                            aks.d = i3 + 1;
                        } else if (i2 == 2) {
                            aks.b = i4 - 1;
                            aks.d = i3 - 1;
                        }
                    }
                } else if (i6 == i4) {
                    if (i2 == 1) {
                        aks.d = i3 + 1;
                    } else if (i2 == 2) {
                        aks.d = i3 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        aks.b = i4 + 1;
                    } else if (i2 == 2) {
                        aks.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                i4 = aks.b;
                if (i4 <= i) {
                    if (i3 == 1) {
                        i -= aks.d;
                    } else if (i3 == 2) {
                        i += aks.d;
                    }
                } else if (i2 == 1) {
                    aks.b = i4 + 1;
                } else if (i2 == 2) {
                    aks.b = i4 - 1;
                }
            }
        }
        i2 = this.b.size();
        while (true) {
            i2--;
            if (i2 < 0) {
                return i;
            }
            aks aks2 = (aks) this.b.get(i2);
            if (aks2.a == 8) {
                int i7 = aks2.d;
                if (i7 == aks2.b || i7 < 0) {
                    this.b.remove(i2);
                    a(aks2);
                }
            } else if (aks2.d <= 0) {
                this.b.remove(i2);
                a(aks2);
            }
        }
    }

    private final boolean c(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            aks aks = (aks) this.b.get(i2);
            int i3 = aks.a;
            if (i3 == 8) {
                if (b(aks.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                i3 = aks.b;
                int i4 = aks.d + i3;
                while (i3 < i4) {
                    if (b(i3, i2 + 1) == i) {
                        return true;
                    }
                    i3++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private final void c(aks aks) {
        this.b.add(aks);
        int i = aks.a;
        if (i == 1) {
            this.e.c(aks.b, aks.d);
        } else if (i == 2) {
            this.e.b(aks.b, aks.d);
        } else if (i == 4) {
            this.e.a(aks.b, aks.d, aks.c);
        } else if (i == 8) {
            this.e.d(aks.b, aks.d);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown update op type for ");
            stringBuilder.append(aks);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final boolean d() {
        return this.a.size() > 0;
    }

    public final boolean a(int i) {
        return (i & this.c) != 0;
    }

    /* Access modifiers changed, original: final */
    public final int b(int i) {
        return b(i, 0);
    }

    private final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            aks aks = (aks) this.b.get(i2);
            int i3 = aks.a;
            if (i3 == 8) {
                i3 = aks.b;
                if (i3 == i) {
                    i = aks.d;
                } else {
                    if (i3 < i) {
                        i--;
                    }
                    if (aks.d <= i) {
                        i++;
                    }
                }
            } else {
                int i4 = aks.b;
                if (i4 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i5 = aks.d;
                    if (i < i4 + i5) {
                        return -1;
                    }
                    i -= i5;
                } else if (i3 == 1) {
                    i += aks.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final void e() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            aks aks = (aks) this.a.get(i);
            int i2 = aks.a;
            if (i2 == 1) {
                this.e.b(aks);
                this.e.c(aks.b, aks.d);
            } else if (i2 == 2) {
                this.e.b(aks);
                this.e.a(aks.b, aks.d);
            } else if (i2 == 4) {
                this.e.b(aks);
                this.e.a(aks.b, aks.d, aks.c);
            } else if (i2 == 8) {
                this.e.b(aks);
                this.e.d(aks.b, aks.d);
            }
        }
        a(this.a);
        this.c = 0;
    }

    public final aks a(int i, int i2, int i3, Object obj) {
        aks aks = (aks) this.d.a();
        if (aks == null) {
            return new aks(i, i2, i3, obj);
        }
        aks.a = i;
        aks.b = i2;
        aks.d = i3;
        aks.c = obj;
        return aks;
    }

    public final void a(aks aks) {
        aks.c = null;
        this.d.a(aks);
    }

    private final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((aks) list.get(i));
        }
        list.clear();
    }
}
