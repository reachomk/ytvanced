package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: also */
public final class also implements alsq {
    private final alrw a;
    private final alse b;
    private final int c = 1600;
    private final aamj d;

    public also(alrw alrw, alry alry, alse alse, aamj aamj) {
        this.a = alrw;
        this.b = alse;
        this.d = aamj;
    }

    public final void a(ajxu ajxu, String str, boolean z) {
        if (also.a(ajxu)) {
            a(ajxu, this.a.a(ajxu.g.b, str), z);
        }
    }

    public final void a(ajxu ajxu, Future future, boolean z) {
        try {
            if (b(ajxu, future, z) && !this.b.a.l) {
                atdz[] atdzArr;
                anxl anxl;
                aoid aoid;
                int i = 0;
                while (true) {
                    atdzArr = ajxu.d;
                    anxl = null;
                    if (i >= atdzArr.length) {
                        aoid = null;
                        break;
                    }
                    anxl = atdzArr[i];
                    if (anxl != null) {
                        if (anxl.a == 88254013) {
                            aoid = (aoid) ((anxo) ((aoia) anxl.b).toBuilder());
                            break;
                        }
                    }
                    i++;
                }
                if (!(aoid == null || anxl == null)) {
                    aoia aoia = (aoia) aoid.instance;
                    if (aoia.b == 1) {
                        ajxu ajxu2 = (ajxu) this.d.a(((anvu) aoia.c).d(), ajxu.class);
                        if (ajxu2 == null) {
                            xtl.c("Unable to parse intro ad player response");
                        } else if (also.a(ajxu2) && b(ajxu2, this.a.a(ajxu2.g.b), false)) {
                            anvu a = anvu.a(aocf.toByteArray(ajxu2));
                            aoid.copyOnWrite();
                            aoia aoia2 = (aoia) aoid.instance;
                            if (a != null) {
                                aoia2.b = 1;
                                aoia2.c = a;
                                atdz[] atdzArr2 = ajxu.d;
                                atec atec = (atec) ((anxo) anxl.toBuilder());
                                atec.copyOnWrite();
                                atdz atdz = (atdz) atec.instance;
                                atdz.b = (anxl) aoid.build();
                                atdz.a = 88254013;
                                atdzArr2[i] = (atdz) ((anxl) atec.build());
                            } else {
                                throw new NullPointerException();
                            }
                        }
                    }
                }
                i = 0;
                while (true) {
                    atdzArr = ajxu.d;
                    if (i >= atdzArr.length) {
                        break;
                    }
                    atdz atdz2 = atdzArr[i];
                    ated ated = atdz2.a == 63112829 ? (ated) atdz2.b : ated.d;
                    if ((ated.a & 1) != 0) {
                        anze anze = ated.b;
                        if (anze == null) {
                            anze = atej.s;
                        }
                        aocf aocf = (ajxu) ajzv.a(anze, ajxu.class);
                        if (also.a(aocf)) {
                            b(aocf, this.a.a(aocf.g.b), false);
                            atdz[] atdzArr3 = ajxu.d;
                            atec atec2 = (atec) ((anxo) atdz2.toBuilder());
                            ateg ateg = (ateg) ((anxo) ated.toBuilder());
                            atej atej = (atej) ajzv.a(aocf, atej.s.getParserForType());
                            ateg.copyOnWrite();
                            ated ated2 = (ated) ateg.instance;
                            if (atej != null) {
                                ated2.b = atej;
                                ated2.a |= 1;
                                atec2.copyOnWrite();
                                atdz atdz3 = (atdz) atec2.instance;
                                atdz3.b = (anxl) ateg.build();
                                atdz3.a = 63112829;
                                atdzArr3[i] = (atdz) ((anxl) atec2.build());
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        continue;
                    }
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            xtl.a("Unable to get video metadata", e);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x015e */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:43|44|54|45) */
    /* JADX WARNING: Missing block: B:44:?, code skipped:
            r0.cancel(false);
     */
    /* JADX WARNING: Missing block: B:45:0x0164, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:46:0x0165, code skipped:
            a(r8, null);
     */
    private final boolean b(defpackage.ajxu r17, java.util.concurrent.Future r18, boolean r19) {
        /*
        r16 = this;
        r7 = r16;
        r8 = r17;
        r0 = r18;
        r1 = 0;
        r9 = 0;
        r2 = r7.c;	 Catch:{ TimeoutException -> 0x015e }
        r2 = (long) r2;	 Catch:{ TimeoutException -> 0x015e }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ TimeoutException -> 0x015e }
        r2 = r0.get(r2, r4);	 Catch:{ TimeoutException -> 0x015e }
        r10 = r2;
        r10 = (defpackage.altl) r10;	 Catch:{ TimeoutException -> 0x015e }
        r7.a(r8, r10);
        if (r10 == 0) goto L_0x015b;
    L_0x0019:
        r0 = r10.b;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x015b;
    L_0x0021:
        r0 = new android.util.SparseArray;
        r0.<init>();
        r1 = r10.b;
        r1 = r1.iterator();
        r11 = 1;
        r12 = 0;
    L_0x002e:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0056;
    L_0x0034:
        r2 = r1.next();
        r2 = (defpackage.altj) r2;
        r3 = r2.a();
        r0.put(r3, r2);
        r3 = defpackage.aahv.h();
        r2 = r2.a();
        r2 = java.lang.Integer.valueOf(r2);
        r2 = r3.contains(r2);
        if (r2 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x002e;
    L_0x0054:
        r12 = 1;
        goto L_0x002e;
    L_0x0056:
        if (r19 != 0) goto L_0x005a;
    L_0x0058:
        r6 = 0;
        goto L_0x005e;
    L_0x005a:
        if (r12 != 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0058;
    L_0x005d:
        r6 = 1;
    L_0x005e:
        r1 = r8.b;
        r1 = r1.toBuilder();
        r1 = (defpackage.anxo) r1;
        r13 = r1;
        r13 = (defpackage.ateq) r13;
        r14 = r10.a;
        r15 = new java.util.HashSet;
        r15.<init>();
        r1 = r8.b;
        r3 = r1.d;
        r1 = r16;
        r2 = r14;
        r4 = r0;
        r5 = r15;
        r1 = r1.a(r2, r3, r4, r5, r6);
        r13.e();
        r13.b(r1);
        r3 = r13.a();
        r1 = r16;
        r6 = r19;
        r0 = r1.a(r2, r3, r4, r5, r6);
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x009b;
    L_0x0095:
        r13.c();
        r13.a(r0);
    L_0x009b:
        r0 = r13.instance;
        r0 = (defpackage.aten) r0;
        r0 = r0.e;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00bf;
    L_0x00a7:
        r0 = "";
        r13.a(r0);
        if (r12 != 0) goto L_0x00bf;
    L_0x00ae:
        r0 = java.util.Locale.US;
        r1 = new java.lang.Object[r11];
        r1[r9] = r14;
        r2 = "Dash manifest found for cached video %s with no inline adaptive formats.";
        r0 = java.lang.String.format(r0, r2, r1);
        r1 = defpackage.afpf.spacecast;
        defpackage.afpc.a(r11, r1, r0);
    L_0x00bf:
        r0 = r13.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aten) r0;
        r8.b = r0;
        r0 = r15.isEmpty();
        if (r0 == 0) goto L_0x015a;
    L_0x00cf:
        r0 = r13.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aten) r0;
        r1 = new java.util.HashSet;
        r1.<init>();
        r2 = r10.b;
        r2 = r2.iterator();
    L_0x00e2:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x00fa;
    L_0x00e8:
        r3 = r2.next();
        r3 = (defpackage.altj) r3;
        r3 = r3.a();
        r3 = java.lang.Integer.valueOf(r3);
        r1.add(r3);
        goto L_0x00e2;
    L_0x00fa:
        r2 = new java.util.HashSet;
        r2.<init>();
        r3 = r0.d;
        r3 = r3.iterator();
    L_0x0105:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x011b;
    L_0x010b:
        r4 = r3.next();
        r4 = (defpackage.arlv) r4;
        r4 = r4.c;
        r4 = java.lang.Integer.valueOf(r4);
        r2.add(r4);
        goto L_0x0105;
    L_0x011b:
        r0 = r0.c;
        r0 = r0.iterator();
    L_0x0121:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x0137;
    L_0x0127:
        r3 = r0.next();
        r3 = (defpackage.arlv) r3;
        r3 = r3.c;
        r3 = java.lang.Integer.valueOf(r3);
        r2.add(r3);
        goto L_0x0121;
    L_0x0137:
        r0 = java.util.Locale.US;
        r3 = 3;
        r3 = new java.lang.Object[r3];
        r4 = ",";
        r1 = android.text.TextUtils.join(r4, r1);
        r3[r9] = r1;
        r1 = r10.a;
        r3[r11] = r1;
        r1 = 2;
        r2 = android.text.TextUtils.join(r4, r2);
        r3[r1] = r2;
        r1 = "itags [%s] on %s were cached but player response only contained [%s]";
        r0 = java.lang.String.format(r0, r1, r3);
        r1 = defpackage.afpf.spacecast;
        defpackage.afpc.a(r11, r1, r0);
    L_0x015a:
        return r11;
    L_0x015b:
        return r9;
    L_0x015c:
        r0 = move-exception;
        goto L_0x0165;
    L_0x015e:
        r0.cancel(r9);	 Catch:{ all -> 0x015c }
        r7.a(r8, r1);
        return r9;
    L_0x0165:
        r7.a(r8, r1);
        goto L_0x016a;
    L_0x0169:
        throw r0;
    L_0x016a:
        goto L_0x0169;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.also.b(ajxu, java.util.concurrent.Future, boolean):boolean");
    }

    private final List a(String str, List list, SparseArray sparseArray, Set set, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            Object obj2;
            if (sparseArray.get(obj2.c) != null) {
                arlx arlx = (arlx) ((anxo) obj2.toBuilder());
                set.add(Integer.valueOf(obj2.c));
                altj altj = (altj) sparseArray.get(obj2.c);
                arlx.a(this.a.a(str, Uri.parse(obj2.d)).toString());
                arlx.a(altj.b());
                if (altj.c() >= 0) {
                    arlx.b(altj.c());
                }
                if (altj.d()) {
                    int i = obj2.a;
                    if (!((i & 1024) == 0 || (i & 2048) == 0)) {
                        anxl anxl = obj2.l;
                        if (anxl == null) {
                            anxl = armb.d;
                        }
                        arma arma = (arma) ((anxo) anxl.toBuilder());
                        arma.a(altj.e());
                        arma.b(altj.f());
                        arlx.a(arma);
                        anxl = obj2.m;
                        if (anxl == null) {
                            anxl = armb.d;
                        }
                        arma = (arma) ((anxo) anxl.toBuilder());
                        arma.a(altj.g());
                        arma.b(altj.h());
                        arlx.b(arma);
                    }
                }
                arlx.a(ammu.b, Boolean.valueOf(true));
                if (altj.i().length > 0 && (obj2.a & 1073741824) != 0) {
                    anxl anxl2 = obj2.A;
                    if (anxl2 == null) {
                        anxl2 = armd.d;
                    }
                    armc armc = (armc) ((anxo) anxl2.toBuilder());
                    anvu a = anvu.a(altj.i());
                    armc.copyOnWrite();
                    armd armd = (armd) armc.instance;
                    if (a != null) {
                        armd.a |= 2;
                        armd.c = a;
                        arlx.copyOnWrite();
                        arlv arlv = (arlv) arlx.instance;
                        arlv.A = (armd) ((anxl) armc.build());
                        arlv.a |= 1073741824;
                    } else {
                        throw new NullPointerException();
                    }
                }
                obj2 = (arlv) ((anxl) arlx.build());
                arrayList.add(obj2);
            } else if (obj2.e.startsWith("audio")) {
                arrayList.add(obj2);
            }
            arrayList2.add(obj2);
        }
        return z ? arrayList2 : arrayList;
    }

    private static boolean a(ajxu ajxu) {
        return (ajxu == null || ajxu.g == null || ajxu.b == null) ? false : true;
    }

    private final void a(ajxu ajxu, altl altl) {
        atdx atdx = ajxu.e;
        if (atdx == null || (atdx.a & 32) == 0) {
            xtl.d("PlayerResponse is missing QoE URL");
            return;
        }
        if (this.a.d()) {
            ArrayList arrayList = new ArrayList();
            if (altl != null) {
                for (altj a : altl.b) {
                    arrayList.add(Integer.valueOf(a.a()));
                }
            }
            aulg aulg = ajxu.e.h;
            if (aulg == null) {
                aulg = aulg.e;
            }
            xvo a2 = xvo.a(Uri.parse(aulg.b));
            a2.a("acc", TextUtils.join(":", arrayList), ",:");
            Uri a3 = a2.a();
            atea atea = (atea) atdx.p.createBuilder();
            anxl anxl = ajxu.e.h;
            if (anxl == null) {
                anxl = aulg.e;
            }
            auli auli = (auli) ((anxo) anxl.toBuilder());
            auli.a(a3.toString());
            atea.copyOnWrite();
            atdx atdx2 = (atdx) atea.instance;
            atdx2.h = (aulg) ((anxl) auli.build());
            atdx2.a |= 32;
            ajxu.e = (atdx) ((anxl) atea.build());
        }
    }
}
