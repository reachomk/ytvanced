package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: acwe */
public final class acwe {
    public final acum a;
    public final attj b;
    private final Map c;
    private final acwg d;
    private final acvh e;

    public acwe(Context context, acum acum, zyw zyw, Map map, acvh acvh, acwg acwg) {
        attj attj;
        amqw.a((Object) context);
        this.a = (acum) amqw.a((Object) acum);
        this.e = (acvh) amqw.a((Object) acvh);
        this.c = map;
        apxn a = zyw.a();
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            if ((auya.a & 2048) != 0) {
                auya auya2 = a.i;
                if (auya2 == null) {
                    auya2 = auya.J;
                }
                attj = auya2.h;
                if (attj == null) {
                    attj = attj.e;
                }
                this.b = attj;
                this.d = acwg;
            }
        }
        atti atti = (atti) attj.e.createBuilder();
        atti.copyOnWrite();
        attj attj2 = (attj) atti.instance;
        attj2.a |= 1;
        attj2.b = true;
        attj = (attj) ((anxl) atti.build());
        this.b = attj;
        this.d = acwg;
    }

    /* Access modifiers changed, original: final */
    public final void a(acwp acwp, atst atst) {
        if (c(acwp)) {
            atro atro = (atro) atrp.g.createBuilder();
            azfa a = acwe.a(acwp.e);
            atro.copyOnWrite();
            atrp atrp = (atrp) atro.instance;
            if (a != null) {
                atrp.b = a;
                atrp.a |= 1;
                String str = acwp.a;
                atro.copyOnWrite();
                atrp = (atrp) atro.instance;
                if (str != null) {
                    String str2;
                    atrp atrp2;
                    atrp.a |= 2;
                    atrp.c = str;
                    if (!TextUtils.isEmpty(acwp.c)) {
                        str = acwp.c;
                        atro.copyOnWrite();
                        atrp = (atrp) atro.instance;
                        if (str != null) {
                            atrp.a |= 4;
                            atrp.d = str;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    if (atst != null) {
                        atro.copyOnWrite();
                        atrp atrp3 = (atrp) atro.instance;
                        atrp3.e = atst;
                        atrp3.a |= 8;
                    }
                    int isEmpty = TextUtils.isEmpty(acwp.b) ^ 1;
                    boolean a2 = acwe.a(acwp.d);
                    if (isEmpty != 0 || a2) {
                        atrq atrq = (atrq) atrr.d.createBuilder();
                        if (a2) {
                            a = acwp.d;
                            atrq.copyOnWrite();
                            atrr atrr = (atrr) atrq.instance;
                            if (a != null) {
                                atrr.b = a;
                                atrr.a |= 1;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        if (isEmpty != 0) {
                            str2 = acwp.b;
                            atrq.copyOnWrite();
                            atrr atrr2 = (atrr) atrq.instance;
                            if (str2 != null) {
                                atrr2.a |= 2;
                                atrr2.c = str2;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        atro.copyOnWrite();
                        atrp2 = (atrp) atro.instance;
                        atrp2.f = (atrr) ((anxl) atrq.build());
                        atrp2.a |= 32;
                    }
                    atrp2 = (atrp) ((anxl) atro.build());
                    asmz asmz = (asmz) asmw.f.createBuilder();
                    asmz.copyOnWrite();
                    asmw asmw = (asmw) asmz.instance;
                    if (atrp2 != null) {
                        asmw.c = atrp2;
                        asmw.b = 156;
                        this.a.a((asmw) ((anxl) asmz.build()));
                        acwp.f.clear();
                        acvh acvh = this.e;
                        String str3 = acwp.a;
                        if (!TextUtils.isEmpty(str3)) {
                            if (acvh.a.containsKey(str3)) {
                                acvh.b.remove(str3);
                                acvh.b.addLast(str3);
                            } else {
                                if (acvh.b.size() == 7) {
                                    acvh.a.remove((String) acvh.b.removeFirst());
                                }
                                acvh.b.addLast(str3);
                                acvh.a.put(str3, acwp);
                            }
                        }
                        if (!TextUtils.isEmpty(acwp.c)) {
                            str2 = acwp.c;
                            acvh acvh2 = this.e;
                            acwp acwp2 = (TextUtils.isEmpty(str2) || !acvh2.a.containsKey(str2)) ? null : (acwp) acvh2.a.get(str2);
                            if (acwp2 != null) {
                                for (Entry entry : acwp2.g.entrySet()) {
                                    a(acwp, (azfa) entry.getKey(), (azfa) entry.getValue(), null);
                                }
                            }
                        }
                        return;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(acwp acwp) {
        atry atry = (atry) atrz.f.createBuilder();
        atry.a(acwp.a);
        atry.a(5);
        atry.a(acwe.a(acwp.e));
        atrz atrz = (atrz) ((anxl) atry.build());
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.a(atrz);
        this.a.a((asmw) ((anxl) asmz.build()));
    }

    /* Access modifiers changed, original: final */
    public final void b(acwp acwp) {
        a(acwp, 9);
    }

    /* Access modifiers changed, original: final */
    public final void a(acwp acwp, azfa azfa, atst atst) {
        if (a(acwp, azfa)) {
            acwl acwl = acwp.e;
            a(acwp, acwe.b(azfa), acwe.a(acwp.e.aH), atst);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(acwp acwp, azfa azfa, azfa azfa2, atst atst) {
        if (a(acwp, azfa, azfa2)) {
            azfa = acwe.b(azfa);
            azfa2 = acwe.b(azfa2);
            if (!acwe.a(azfa) || !acwp.a(azfa)) {
                acwp.a(azfa, azfa2);
                List arrayList = new ArrayList();
                arrayList.add(azfa);
                a(acwp, azfa2, arrayList, atst);
                String str = acwp.a;
            }
        }
    }

    /* JADX WARNING: Missing block: B:16:0x006b, code skipped:
            if (android.text.TextUtils.isEmpty(r11.c) == false) goto L_0x006d;
     */
    public final void a(defpackage.acwp r8, defpackage.azfa r9, java.util.List r10, defpackage.atst r11) {
        /*
        r7 = this;
        r9 = defpackage.acwe.b(r9);
        r0 = defpackage.acwe.b(r9);
        r1 = 0;
        if (r11 == 0) goto L_0x0076;
    L_0x000b:
        r2 = r11.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.atss) r2;
        if (r2 != 0) goto L_0x0017;
    L_0x0015:
        r3 = r1;
        goto L_0x0056;
    L_0x0017:
        r3 = r2.instance;
        r3 = (defpackage.atst) r3;
        r3 = r3.a;
        r3 = r3 & 64;
        if (r3 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0015;
    L_0x0022:
        r3 = r2.a();
        r3 = r3.b;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x0015;
    L_0x002e:
        r3 = r2.a();
        r3 = r3.b;
        r4 = r2.a();
        r4 = r4.toBuilder();
        r4 = (defpackage.anxo) r4;
        r4 = (defpackage.atsy) r4;
        r4.copyOnWrite();
        r5 = r4.instance;
        r5 = (defpackage.atsz) r5;
        r6 = r5.a;
        r6 = r6 & -2;
        r5.a = r6;
        r6 = defpackage.atsz.d;
        r6 = r6.b;
        r5.b = r6;
        r2.a(r4);
    L_0x0056:
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 != 0) goto L_0x006d;
    L_0x005c:
        r7.a(r8, r0, r3);
        r11 = r11.h;
        if (r11 != 0) goto L_0x0065;
    L_0x0063:
        r11 = defpackage.atsz.d;
    L_0x0065:
        r11 = r11.c;
        r11 = android.text.TextUtils.isEmpty(r11);
        if (r11 != 0) goto L_0x0076;
    L_0x006d:
        r11 = r2.build();
        r11 = (defpackage.anxl) r11;
        r1 = r11;
        r1 = (defpackage.atst) r1;
    L_0x0076:
        r11 = r10.isEmpty();
        if (r11 != 0) goto L_0x0181;
    L_0x007c:
        r11 = new java.util.ArrayList;
        r11.<init>();
        r0 = r10.size();
        r2 = 0;
        r3 = 0;
    L_0x0087:
        if (r3 >= r0) goto L_0x0099;
    L_0x0089:
        r4 = r10.get(r3);
        r4 = (defpackage.azfa) r4;
        r4 = defpackage.acwe.b(r4);
        r11.add(r4);
        r3 = r3 + 1;
        goto L_0x0087;
    L_0x0099:
        if (r1 != 0) goto L_0x009c;
    L_0x009b:
        goto L_0x00d5;
    L_0x009c:
        r10 = defpackage.atsb.e;
        r10 = r10.createBuilder();
        r10 = (defpackage.atsa) r10;
        r0 = r8.a;
        r10.a(r0);
        r10.a(r1);
        r0 = r11.get(r2);
        r0 = (defpackage.azfa) r0;
        r10.a(r0);
        r10 = r10.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.atsb) r10;
        r0 = defpackage.asmw.f;
        r0 = r0.createBuilder();
        r0 = (defpackage.asmz) r0;
        r0.a(r10);
        r10 = r0.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.asmw) r10;
        r0 = r7.a;
        r0.a(r10);
    L_0x00d5:
        r10 = r11.isEmpty();
        if (r10 != 0) goto L_0x0181;
    L_0x00db:
        r9 = defpackage.acwe.b(r9);
        r10 = new java.util.ArrayList;
        r10.<init>();
        r0 = r11.size();
    L_0x00e8:
        if (r2 >= r0) goto L_0x00fa;
    L_0x00ea:
        r1 = r11.get(r2);
        r1 = (defpackage.azfa) r1;
        r1 = defpackage.acwe.b(r1);
        r10.add(r1);
        r2 = r2 + 1;
        goto L_0x00e8;
    L_0x00fa:
        r11 = defpackage.atrt.e;
        r11 = r11.createBuilder();
        r11 = (defpackage.atrs) r11;
        r8 = r8.a;
        r11.copyOnWrite();
        r0 = r11.instance;
        r0 = (defpackage.atrt) r0;
        if (r8 == 0) goto L_0x017b;
    L_0x010d:
        r1 = r0.a;
        r1 = r1 | 1;
        r0.a = r1;
        r0.b = r8;
        r11.copyOnWrite();
        r8 = r11.instance;
        r8 = (defpackage.atrt) r8;
        if (r9 == 0) goto L_0x0175;
    L_0x011e:
        r8.c = r9;
        r9 = r8.a;
        r9 = r9 | 2;
        r8.a = r9;
        r11.copyOnWrite();
        r8 = r11.instance;
        r8 = (defpackage.atrt) r8;
        r9 = r8.d;
        r9 = r9.a();
        if (r9 != 0) goto L_0x013d;
    L_0x0135:
        r9 = r8.d;
        r9 = defpackage.anxl.mutableCopy(r9);
        r8.d = r9;
    L_0x013d:
        r8 = r8.d;
        defpackage.anvf.addAll(r10, r8);
        r8 = r11.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.atrt) r8;
        r9 = defpackage.asmw.f;
        r9 = r9.createBuilder();
        r9 = (defpackage.asmz) r9;
        r9.copyOnWrite();
        r10 = r9.instance;
        r10 = (defpackage.asmw) r10;
        if (r8 == 0) goto L_0x016f;
    L_0x015b:
        r10.c = r8;
        r8 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r10.b = r8;
        r8 = r9.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.asmw) r8;
        r9 = r7.a;
        r9.a(r8);
        goto L_0x0181;
    L_0x016f:
        r8 = new java.lang.NullPointerException;
        r8.<init>();
        throw r8;
    L_0x0175:
        r8 = new java.lang.NullPointerException;
        r8.<init>();
        throw r8;
    L_0x017b:
        r8 = new java.lang.NullPointerException;
        r8.<init>();
        throw r8;
    L_0x0181:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwe.a(acwp, azfa, java.util.List, atst):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(acwp acwp, acvw acvw) {
        if (a((acvr) acvw) && !acwp.b(acvw.d)) {
            acwp.a((acvr) acvw);
            atry atry = (atry) atrz.f.createBuilder();
            atry.a(acwp.a);
            atry.a(acvw.f);
            atry.a(acvw.d);
            atst atst = acvw.e;
            if (atst != null) {
                atry.copyOnWrite();
                atrz atrz = (atrz) atry.instance;
                atrz.d = atst;
                atrz.a |= 4;
            }
            atrz atrz2 = (atrz) ((anxl) atry.build());
            amxn amxn = (amxn) acvw.c.listIterator();
            while (amxn.hasNext()) {
                auky auky = (auky) amxn.next();
                if (this.c.containsKey(auky)) {
                    ((acwx) this.c.get(auky)).a(atrz2);
                }
            }
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.a(atrz2);
            this.a.a((asmw) ((anxl) asmz.build()));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(acwp acwp, acvu acvu) {
        if (a((acvr) acvu) && acwp.b(acvu.d)) {
            acwp.a((acvr) acvu);
            atrw atrw = (atrw) atrx.f.createBuilder();
            atrw.a(acwp.a);
            atrw.a(acvu.f);
            atrw.a(acvu.d);
            atst atst = acvu.e;
            if (atst != null) {
                atrw.copyOnWrite();
                atrx atrx = (atrx) atrw.instance;
                atrx.d = atst;
                atrx.a |= 4;
            }
            atrx atrx2 = (atrx) ((anxl) atrw.build());
            amxn amxn = (amxn) acvu.c.listIterator();
            while (amxn.hasNext()) {
                auky auky = (auky) amxn.next();
                if (this.c.containsKey(auky)) {
                    ((acwx) this.c.get(auky)).a();
                }
            }
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.a(atrx2);
            this.a.a((asmw) ((anxl) asmz.build()));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(acwp acwp, azfa azfa, String str) {
        if (a(acwp, azfa) && !TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str) || !acwp.h.contains(str)) {
                azfa = acwe.b(azfa);
                atrm atrm = (atrm) atrn.e.createBuilder();
                String str2 = acwp.a;
                atrm.copyOnWrite();
                atrn atrn = (atrn) atrm.instance;
                if (str2 != null) {
                    atrn.a |= 4;
                    atrn.d = str2;
                    atrm.copyOnWrite();
                    atrn atrn2 = (atrn) atrm.instance;
                    if (azfa != null) {
                        atrn2.c = azfa;
                        atrn2.a |= 2;
                        atrm.copyOnWrite();
                        atrn atrn3 = (atrn) atrm.instance;
                        if (str != null) {
                            atrn3.a = 1 | atrn3.a;
                            atrn3.b = str;
                            atrn3 = (atrn) ((anxl) atrm.build());
                            asmz asmz = (asmz) asmw.f.createBuilder();
                            asmz.copyOnWrite();
                            asmw asmw = (asmw) asmz.instance;
                            if (atrn3 != null) {
                                asmw.c = atrn3;
                                asmw.b = 202;
                                this.a.a((asmw) ((anxl) asmz.build()));
                                if (!TextUtils.isEmpty(str)) {
                                    acwp.h.add(str);
                                }
                                return;
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
        }
    }

    private static azfa a(acwl acwl) {
        return acwe.a(acwl.aH);
    }

    public static azfa a(int i) {
        azfd azfd = (azfd) azfa.h.createBuilder();
        azfd.a(i);
        azfd.c(0);
        return (azfa) ((anxl) azfd.build());
    }

    public final boolean c(acwp acwp) {
        if (!this.b.b || acwp == null) {
            return false;
        }
        acwl acwl = acwp.e;
        return true;
    }

    public final boolean a(acwp acwp, acwc... acwcArr) {
        if (!c(acwp)) {
            return false;
        }
        int length = acwcArr.length;
        for (int i = 0; i < length; i = 1) {
            if (acwcArr[0] == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(acwp acwp, azfa... azfaArr) {
        if (!c(acwp)) {
            return false;
        }
        int length = azfaArr.length;
        int i = 0;
        while (i < length) {
            azfa azfa = azfaArr[i];
            if (azfa != null && (acwe.a(azfa.b.d()) || azfa.c > 0)) {
                i++;
            } else {
                String valueOf = String.valueOf(azfa);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
                stringBuilder.append("Invalid VisualElement: ");
                stringBuilder.append(valueOf);
                stringBuilder.toString();
                return false;
            }
        }
        return true;
    }

    private final boolean a(acvr acvr) {
        if (!this.b.b) {
            return false;
        }
        azfa azfa = acvr.d;
        if (azfa == null || (!acwe.a(azfa.b.d()) && azfa.c <= 0)) {
            String valueOf = String.valueOf(azfa);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
            stringBuilder.append("Invalid VisualElement: ");
            stringBuilder.append(valueOf);
            stringBuilder.toString();
            return false;
        } else if (acvr.f == 1) {
            return false;
        } else {
            return true;
        }
    }

    static boolean a(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }

    private static boolean c(azfa azfa) {
        return azfa != null && azfa.c > 0;
    }

    static boolean a(azfa azfa) {
        return acwe.a(azfa.b.d()) || acwe.c(azfa);
    }

    static azfa b(azfa azfa) {
        if (!acwe.c(azfa) || (azfa.a & 8) != 0) {
            return azfa;
        }
        azfd azfd = (azfd) ((anxo) azfa.toBuilder());
        azfd.c(0);
        return (azfa) ((anxl) azfd.build());
    }

    public final void a(acwp acwp, int i) {
        if (acwp != null) {
            atrw atrw = (atrw) atrx.f.createBuilder();
            atrw.a(acwp.a);
            atrw.a(i);
            atrw.a(acwe.a(acwp.e));
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.a((atrx) ((anxl) atrw.build()));
            this.a.a((asmw) ((anxl) asmz.build()));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(acwp acwp, int i, azfa azfa, atst atst) {
        if (a(acwp, azfa)) {
            azfa = acwe.b(azfa);
            atru atru = (atru) atrv.f.createBuilder();
            String str = acwp.a;
            atru.copyOnWrite();
            atrv atrv = (atrv) atru.instance;
            if (str != null) {
                atrv.a = 1 | atrv.a;
                atrv.b = str;
                atru.copyOnWrite();
                atrv atrv2 = (atrv) atru.instance;
                atrv2.a |= 8;
                atrv2.e = i - 1;
                atru.copyOnWrite();
                atrv2 = (atrv) atru.instance;
                if (azfa != null) {
                    atrv2.c = azfa;
                    atrv2.a |= 2;
                    if (atst != null) {
                        atru.copyOnWrite();
                        atrv2 = (atrv) atru.instance;
                        atrv2.d = atst;
                        atrv2.a |= 4;
                    }
                    atrv2 = (atrv) ((anxl) atru.build());
                    asmz asmz = (asmz) asmw.f.createBuilder();
                    asmz.copyOnWrite();
                    asmw asmw = (asmw) asmz.instance;
                    if (atrv2 != null) {
                        asmw.c = atrv2;
                        asmw.b = 78;
                        this.a.a((asmw) ((anxl) asmz.build()));
                        return;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
    }
}
