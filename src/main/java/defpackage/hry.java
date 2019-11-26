package defpackage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: hry */
public final class hry extends akwe implements xcp {
    public final eki a;
    public String b;
    private final Context c;
    private final hko d;
    private final amro e;
    private final hoc f;
    private final Executor g;
    private final bcaa h;
    private final hpk m;
    private final akpk n;

    public hry(akvz akvz, xci xci, xoi xoi, eki eki, hoc hoc, Executor executor, bcaa bcaa, hpk hpk, Activity activity, aana aana, acvx acvx, akyd akyd, hko hko, amro amro) {
        akyd akyd2 = akyd;
        akpk akpk = new akpk();
        super(aana, akvz, xci, xoi, acvx, akyd.a(akyd), akpk);
        this.a = eki;
        this.f = hoc;
        this.g = executor;
        this.h = bcaa;
        this.m = hpk;
        this.c = activity;
        this.d = hko;
        this.e = amro;
        this.n = akpk;
        if (akyd2 instanceof hsd) {
            int i;
            hsd hsd = (hsd) akyd2;
            this.b = hsd.a;
            akpk.a(hsd.b);
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (i2 < this.n.size()) {
                eki eki2;
                Object obj = this.n.get(i2);
                if (obj instanceof aqfs) {
                    eki2 = this.a;
                    awhh awhh = ((aqfs) obj).u;
                    if (awhh == null) {
                        awhh = awhh.c;
                    }
                    if (!eki2.a(awhh.b)) {
                        hashSet.add(obj);
                        i2++;
                    }
                }
                if (!(obj instanceof avmq) || this.a.a(((avmq) obj).g)) {
                    if (obj instanceof aqgs) {
                        eki2 = this.a;
                        ayym ayym = ((aqgs) obj).x;
                        if (ayym == null) {
                            ayym = ayym.c;
                        }
                        String str = ayym.b;
                        if (!eki2.b() || ((agwc) eki2.a.get()).b().k().a(str) == null) {
                            hashSet.add(obj);
                        }
                    }
                    i2++;
                } else {
                    hashSet.add(obj);
                    i2++;
                }
            }
            this.n.removeAll(hashSet);
            hashSet = new HashSet();
            for (i = 0; i < this.n.size(); i++) {
                Object obj2 = this.n.get(i);
                if (obj2 instanceof aqfs) {
                    awhh awhh2 = ((aqfs) obj2).u;
                    if (awhh2 == null) {
                        awhh2 = awhh.c;
                    }
                    hashSet.add(awhh2.b);
                } else if (obj2 instanceof avmq) {
                    hashSet.add(((avmq) obj2).g);
                } else if (obj2 instanceof aqgs) {
                    ayym ayym2 = ((aqgs) obj2).x;
                    if (ayym2 == null) {
                        ayym2 = ayym.c;
                    }
                    hashSet.add(ayym2.b);
                }
            }
            int hashCode = hashSet.hashCode();
            HashSet hashSet2 = new HashSet();
            amxn amxn;
            if ("downloads_page_downloads_item_section_identifier".equals(this.b)) {
                amxn = (amxn) this.m.a().listIterator();
                while (amxn.hasNext()) {
                    hashSet2.add(((agqy) amxn.next()).a());
                }
                amxn = (amxn) this.m.b().listIterator();
                while (amxn.hasNext()) {
                    hashSet2.add(((agqk) amxn.next()).a.a);
                }
            } else {
                if ("downloads_page_recommendations_item_section_identifier".equals(this.b)) {
                    amxn = (amxn) this.m.c().listIterator();
                    while (amxn.hasNext()) {
                        hashSet2.add(((agqy) amxn.next()).a());
                    }
                }
            }
            i = hashSet2.hashCode();
            if (this.n.size() == 1 || hashCode != i) {
                this.g.execute(new hse(this));
            }
            d();
        }
        akpk.a(new esb());
        akpk.a(new hrx(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d7 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d7 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    public final void a(defpackage.aafj r15) {
        /*
        r14 = this;
        super.a(r15);
        r0 = r15.a;
        r0 = r0.f;
        r14.b = r0;
        r0 = r14.d;
        r0 = r0.a();
        r1 = r14.b;
        r15 = r15.a;
        r2 = r0.b;
        r2 = r2.containsKey(r1);
        if (r2 == 0) goto L_0x01db;
    L_0x001b:
        r2 = r0.a;
        r3 = r0.b;
        r3 = r3.get(r1);
        r3 = (defpackage.acwc) r3;
        r4 = r0.g;
        r5 = r4 + 1;
        r0.g = r5;
        r2 = r2.a(r1, r3, r4);
        r3 = r0.a;
        r4 = 0;
        r3.a(r2, r4);
        r3 = r0.c;
        r3.put(r1, r2);
        r3 = r0.d;
        r5 = new java.util.concurrent.atomic.AtomicInteger;
        r6 = 0;
        r5.<init>(r6);
        r3.put(r1, r5);
        r3 = r15.d;
        if (r3 == 0) goto L_0x006d;
    L_0x0049:
        r3 = r3.e;
        if (r3 != 0) goto L_0x004e;
    L_0x004d:
        goto L_0x006d;
    L_0x004e:
        r5 = r3.a;
        r5 = r5 & 2;
        if (r5 == 0) goto L_0x006d;
    L_0x0054:
        r5 = r3.c;
        if (r5 != 0) goto L_0x005a;
    L_0x0058:
        r5 = defpackage.atvx.c;
    L_0x005a:
        r5 = r5.a;
        r5 = r5 & 1;
        if (r5 == 0) goto L_0x006d;
    L_0x0060:
        r3 = r3.c;
        if (r3 != 0) goto L_0x0066;
    L_0x0064:
        r3 = defpackage.atvx.c;
    L_0x0066:
        r3 = r3.b;
        if (r3 != 0) goto L_0x006e;
    L_0x006a:
        r3 = defpackage.axqn.f;
        goto L_0x006e;
    L_0x006d:
        r3 = r4;
    L_0x006e:
        if (r3 == 0) goto L_0x00ca;
    L_0x0070:
        r5 = android.util.Pair.create(r2, r3);
        r7 = r0.a;
        r8 = defpackage.acwc.DOWNLOADS_PAGE_FILTER_MENU;
        r5 = r7.a(r5, r8);
        r7 = r0.a;
        r7.a(r5, r2);
        r7 = r0.d;
        r7 = r7.get(r1);
        r7 = (java.util.concurrent.atomic.AtomicInteger) r7;
        r7.getAndIncrement();
        r0.b(r1, r3);
        r3 = r3.b;
        r3 = r3.iterator();
    L_0x0095:
        r7 = r3.hasNext();
        if (r7 == 0) goto L_0x00ca;
    L_0x009b:
        r7 = r3.next();
        r7 = (defpackage.axql) r7;
        r8 = defpackage.hkp.a(r7);
        if (r8 != 0) goto L_0x00b3;
    L_0x00a7:
        r8 = defpackage.hkp.b(r7);
        if (r8 != 0) goto L_0x00b3;
    L_0x00ad:
        r7 = "Added non-downloads page filter type to downloads page submenu.";
        defpackage.xtl.c(r7);
        goto L_0x0095;
    L_0x00b3:
        r0.b(r1, r7);
        r8 = android.util.Pair.create(r2, r7);
        r9 = r0.a;
        r7 = defpackage.hkp.a(r1, r7);
        r7 = r9.a(r8, r7);
        r8 = r0.a;
        r8.a(r7, r5);
        goto L_0x0095;
    L_0x00ca:
        r15 = r15.b;
        r3 = r15.length;
    L_0x00cd:
        if (r6 >= r3) goto L_0x01db;
    L_0x00cf:
        r5 = r15[r6];
        r5 = defpackage.aafi.a(r5);
        r7 = defpackage.hkp.a(r1, r5);
        if (r7 == 0) goto L_0x01d7;
    L_0x00db:
        defpackage.amqw.a(r2);
        r8 = r0.d;
        r8 = r8.get(r1);
        r8 = (java.util.concurrent.atomic.AtomicInteger) r8;
        r8 = r8.getAndIncrement();
        r9 = r0.e;
        r9 = r9.containsKey(r1);
        if (r9 != 0) goto L_0x00fd;
    L_0x00f2:
        r9 = new java.util.IdentityHashMap;
        r9.<init>();
        r10 = r0.e;
        r10.put(r1, r9);
        goto L_0x0105;
    L_0x00fd:
        r9 = r0.e;
        r9 = r9.get(r1);
        r9 = (java.util.Map) r9;
    L_0x0105:
        r10 = java.lang.Integer.valueOf(r8);
        r9.put(r5, r10);
        r9 = android.util.Pair.create(r2, r5);
        r10 = r0.a;
        r8 = r10.a(r9, r7, r8);
        r8 = r8.toBuilder();
        r8 = (defpackage.anxo) r8;
        r8 = (defpackage.azfd) r8;
        r9 = r5 instanceof defpackage.aqgs;
        if (r9 == 0) goto L_0x013b;
    L_0x0122:
        r9 = r5;
        r9 = (defpackage.aqgs) r9;
        r10 = r9.x;
        if (r10 != 0) goto L_0x012b;
    L_0x0129:
        r10 = defpackage.ayym.c;
    L_0x012b:
        r10 = r10.a;
        r10 = r10 & 1;
        if (r10 != 0) goto L_0x0132;
    L_0x0131:
        goto L_0x0152;
    L_0x0132:
        r9 = r9.x;
        if (r9 != 0) goto L_0x0138;
    L_0x0136:
        r9 = defpackage.ayym.c;
    L_0x0138:
        r9 = r9.b;
        goto L_0x0153;
    L_0x013b:
        r9 = r5 instanceof defpackage.aqfs;
        if (r9 == 0) goto L_0x0152;
    L_0x013f:
        r9 = r5;
        r9 = (defpackage.aqfs) r9;
        r10 = r9.a;
        r11 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r10 = r10 & r11;
        if (r10 == 0) goto L_0x0152;
    L_0x0149:
        r9 = r9.u;
        if (r9 != 0) goto L_0x014f;
    L_0x014d:
        r9 = defpackage.awhh.c;
    L_0x014f:
        r9 = r9.b;
        goto L_0x0153;
    L_0x0152:
        r9 = r4;
    L_0x0153:
        r10 = android.text.TextUtils.isEmpty(r9);
        if (r10 == 0) goto L_0x015b;
    L_0x0159:
        r9 = r4;
        goto L_0x019d;
    L_0x015b:
        r10 = defpackage.apww.d;
        r10 = r10.createBuilder();
        r10 = (defpackage.apwv) r10;
        r11 = defpackage.apwy.c;
        r11 = r11.createBuilder();
        r11 = (defpackage.apwx) r11;
        r9 = defpackage.anvu.a(r9);
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.apwy) r12;
        r13 = r12.a;
        r13 = r13 | 1;
        r12.a = r13;
        r12.b = r9;
        r10.copyOnWrite();
        r9 = r10.instance;
        r9 = (defpackage.apww) r9;
        r11 = r11.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.apwy) r11;
        r9.b = r11;
        r11 = r9.a;
        r11 = r11 | 2;
        r9.a = r11;
        r9 = r10.build();
        r9 = (defpackage.anxl) r9;
        r9 = (defpackage.apww) r9;
    L_0x019d:
        if (r9 == 0) goto L_0x01af;
    L_0x019f:
        r8.copyOnWrite();
        r10 = r8.instance;
        r10 = (defpackage.azfa) r10;
        r10.g = r9;
        r9 = r10.a;
        r9 = r9 | 64;
        r10.a = r9;
        goto L_0x01be;
    L_0x01af:
        r8.copyOnWrite();
        r9 = r8.instance;
        r9 = (defpackage.azfa) r9;
        r9.g = r4;
        r10 = r9.a;
        r10 = r10 & -65;
        r9.a = r10;
    L_0x01be:
        r8 = r8.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.azfa) r8;
        r9 = r0.a;
        r9.a(r8, r2);
        r5 = r0.a(r7, r5);
        if (r5 != 0) goto L_0x01d2;
    L_0x01d1:
        goto L_0x01d7;
    L_0x01d2:
        r7 = r0.a;
        r7.a(r5, r8);
    L_0x01d7:
        r6 = r6 + 1;
        goto L_0x00cd;
    L_0x01db:
        r14.d();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hry.a(aafj):void");
    }

    public final void a(awzv awzv) {
        super.a(awzv);
        ((RecyclerView) this.e.get()).c(0);
    }

    public final akyd E_() {
        return new hsd(super.E_(), this.b, this.n);
    }

    private final void d() {
        if ("downloads_page_recommendations_item_section_identifier".equals(this.b)) {
            this.n.a(new fls(xwe.a(this.c, R.attr.ytGeneralBackgroundA, 0)));
            this.n.add(0, epq.a(8));
            akoq ept = new ept();
            ept.a = true;
            this.n.a(ept);
        }
        if ("downloads_page_downloads_item_section_identifier".equals(this.b)) {
            this.n.a(new hsc(this));
            this.n.a(new hsb(this));
        }
    }

    private final void e() {
        int i = 0;
        while (i < this.i.d()) {
            Object c = this.i.c(i);
            if (!(c instanceof aqgs) && !(c instanceof aqfs) && !(c instanceof avmq) && !(c instanceof apaj)) {
                i++;
            } else {
                return;
            }
        }
        if ("downloads_page_downloads_item_section_identifier".equals(this.b)) {
            int i2 = 1;
            if (!(this.a.c() || this.a.d())) {
                b();
                i2 = 0;
            }
            b(this.f.b(this.a, hss.a(this.J)), i2);
        } else {
            if ("downloads_page_recommendations_item_section_identifier".equals(this.b)) {
                b();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean al_() {
        for (int i = 0; i < this.i.d(); i++) {
            Object c = this.i.c(i);
            if ((c instanceof aqgs) || (c instanceof aqfs) || (c instanceof avmq)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    public final java.lang.Class[] a(java.lang.Class r3, java.lang.Object r4, int r5) {
        /*
        r2 = this;
        r0 = defpackage.hry.class;
        if (r3 != r0) goto L_0x00d9;
    L_0x0004:
        r3 = 0;
        r0 = 0;
        switch(r5) {
            case -1: goto L_0x00b3;
            case 0: goto L_0x00ad;
            case 1: goto L_0x00a7;
            case 2: goto L_0x00a1;
            case 3: goto L_0x0093;
            case 4: goto L_0x0085;
            case 5: goto L_0x0029;
            case 6: goto L_0x0022;
            default: goto L_0x0009;
        };
    L_0x0009:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r0 = 32;
        r4.<init>(r0);
        r0 = "unsupported op code: ";
        r4.append(r0);
        r4.append(r5);
        r4 = r4.toString();
        r3.<init>(r4);
        throw r3;
    L_0x0022:
        r4 = (defpackage.akwd) r4;
        r2.a(r4);
        goto L_0x00d8;
    L_0x0029:
        r4 = (defpackage.aglp) r4;
    L_0x002b:
        r5 = r2.n;
        r5 = r5.size();
        if (r3 >= r5) goto L_0x0058;
    L_0x0033:
        r5 = r2.n;
        r5 = r5.get(r3);
        r5 = r5 instanceof defpackage.aqgs;
        if (r5 == 0) goto L_0x0055;
    L_0x003d:
        r5 = r2.n;
        r5 = r5.get(r3);
        r5 = (defpackage.aqgs) r5;
        r5 = r5.x;
        if (r5 != 0) goto L_0x004b;
    L_0x0049:
        r5 = defpackage.ayym.c;
    L_0x004b:
        r5 = r5.b;
        r1 = r4.a;
        r5 = r5.equals(r1);
        if (r5 != 0) goto L_0x0059;
    L_0x0055:
        r3 = r3 + 1;
        goto L_0x002b;
    L_0x0058:
        r3 = -1;
    L_0x0059:
        if (r3 >= 0) goto L_0x005d;
    L_0x005b:
        goto L_0x00d8;
    L_0x005d:
        r5 = r2.h;
        r5 = r5.get();
        r5 = (defpackage.agwc) r5;
        r5 = r5.b();
        r5 = r5.k();
        r4 = r4.a;
        r4 = r5.a(r4);
        r5 = r2.f;
        r1 = defpackage.acwc.DOWNLOADS_PAGE_VIDEO;
        r4 = r5.a(r4, r3, r1);
        r5 = r2.n;
        r3 = r5.get(r3);
        r2.b(r3, r4);
        return r0;
    L_0x0085:
        r4 = (defpackage.agll) r4;
        r3 = new hrz;
        r3.<init>(r4);
        r2.a(r3);
        r2.e();
        goto L_0x00d8;
    L_0x0093:
        r4 = (defpackage.aglc) r4;
        r3 = new hsa;
        r3.<init>(r4);
        r2.a(r3);
        r2.e();
        goto L_0x00d8;
    L_0x00a1:
        r4 = (defpackage.aaxd) r4;
        r2.a(r4);
        goto L_0x00d8;
    L_0x00a7:
        r4 = (defpackage.zyp) r4;
        r2.a(r4);
        goto L_0x00d8;
    L_0x00ad:
        r4 = (defpackage.zyg) r4;
        r2.a(r4);
        goto L_0x00d8;
    L_0x00b3:
        r4 = 7;
        r0 = new java.lang.Class[r4];
        r4 = defpackage.zyg.class;
        r0[r3] = r4;
        r3 = defpackage.zyp.class;
        r4 = 1;
        r0[r4] = r3;
        r3 = 2;
        r4 = defpackage.aaxd.class;
        r0[r3] = r4;
        r3 = 3;
        r4 = defpackage.aglc.class;
        r0[r3] = r4;
        r3 = 4;
        r4 = defpackage.agll.class;
        r0[r3] = r4;
        r3 = 5;
        r4 = defpackage.aglp.class;
        r0[r3] = r4;
        r3 = 6;
        r4 = defpackage.akwd.class;
        r0[r3] = r4;
    L_0x00d8:
        return r0;
    L_0x00d9:
        r3 = super.a(r3, r4, r5);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hry.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
