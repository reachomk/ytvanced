package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hog */
public final class hog extends hnm {
    private final Context a;
    private final bcaa b;
    private final eki c;
    private final ekf d;
    private final zzl e;
    private final hpk f;

    public hog(bcaa bcaa, Context context, bcaa bcaa2, eki eki, ekf ekf, zzl zzl, hpk hpk) {
        super(bcaa, akab.class);
        this.a = context;
        this.b = bcaa2;
        this.c = eki;
        this.d = ekf;
        this.e = zzl;
        this.f = hpk;
    }

    private static ajww a(Object obj) {
        ajww ajww = new ajww();
        if (obj instanceof aqfs) {
            ajww.g = (aqfs) obj;
        } else if (obj instanceof aqgs) {
            ajww.e = (aqgs) obj;
        } else if (obj instanceof apaj) {
            ajww.aa = (apaj) obj;
        } else if (obj instanceof avmq) {
            ajww.bC = (avmq) obj;
        } else if (obj instanceof ajta) {
            ajww.Z = (ajta) obj;
        } else {
            String valueOf = String.valueOf(obj.getClass());
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 61);
            stringBuilder.append("generateDownloadsItemSectionRenderer unimplemented renderer: ");
            stringBuilder.append(valueOf);
            xtl.c(stringBuilder.toString());
        }
        return ajww;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016e  */
    public final /* synthetic */ java.lang.Object a(defpackage.agvz r20, defpackage.amur r21) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r21;
        r2 = "downloads_page_filter_type";
        r3 = defpackage.hnn.a(r1, r2);
        defpackage.amqw.a(r3);
        r1 = r1.get(r2);
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r5 = defpackage.aqxx.a(r1);
        r1 = 2;
        r3 = 1;
        if (r5 == r1) goto L_0x0025;
    L_0x001f:
        r4 = 4;
        if (r5 != r4) goto L_0x0023;
    L_0x0022:
        goto L_0x0025;
    L_0x0023:
        r4 = 0;
        goto L_0x0026;
    L_0x0025:
        r4 = 1;
    L_0x0026:
        if (r5 == r1) goto L_0x002e;
    L_0x0028:
        r1 = 3;
        if (r5 != r1) goto L_0x002c;
    L_0x002b:
        goto L_0x002e;
    L_0x002c:
        r1 = 0;
        goto L_0x002f;
    L_0x002e:
        r1 = 1;
    L_0x002f:
        r6 = new java.util.ArrayList;
        r6.<init>();
        if (r4 == 0) goto L_0x0075;
    L_0x0036:
        r4 = r0.f;
        r7 = r0.b;
        r7 = r7.get();
        r7 = (defpackage.hoc) r7;
        r4 = r4.a();
        r4 = r4.listIterator();
        r4 = (defpackage.amxn) r4;
        r8 = 0;
    L_0x004b:
        r9 = r4.hasNext();
        if (r9 == 0) goto L_0x0075;
    L_0x0051:
        r9 = r4.next();
        r9 = (defpackage.agqy) r9;
        r10 = defpackage.acwc.DOWNLOADS_PAGE_VIDEO;
        r10 = r7.a(r9, r8, r10);
        if (r10 != 0) goto L_0x0065;
    L_0x005f:
        r9 = "Could not generate CompactVideoRenderer from OfflineVideoSnapshot";
        defpackage.xtl.c(r9);
        goto L_0x004b;
    L_0x0065:
        r11 = r9.i;
        r9 = java.lang.Long.valueOf(r11);
        r9 = defpackage.zz.a(r10, r9);
        r6.add(r9);
        r8 = r8 + 1;
        goto L_0x004b;
    L_0x0075:
        r4 = 0;
        if (r1 != 0) goto L_0x0079;
    L_0x0078:
        goto L_0x00dc;
    L_0x0079:
        r1 = r0.f;
        r7 = r0.b;
        r7 = r7.get();
        r7 = (defpackage.hoc) r7;
        r1 = r1.b();
        r1 = r1.listIterator();
        r1 = (defpackage.amxn) r1;
    L_0x008d:
        r8 = r1.hasNext();
        if (r8 == 0) goto L_0x00dc;
    L_0x0093:
        r8 = r1.next();
        r8 = (defpackage.agqk) r8;
        r9 = r8.a;
        r9 = r9.a;
        r10 = "BL";
        r9 = r9.startsWith(r10);
        if (r9 != 0) goto L_0x00b6;
    L_0x00a5:
        r9 = defpackage.agqk.class;
        r10 = defpackage.aqfs.class;
        r11 = defpackage.amqw.a(r8);
        r11 = (defpackage.agqk) r11;
        r9 = r7.a(r9, r10, r11, r4);
        r9 = (defpackage.aqfs) r9;
        goto L_0x00c6;
    L_0x00b6:
        r9 = defpackage.agqk.class;
        r10 = defpackage.avmq.class;
        r11 = defpackage.amqw.a(r8);
        r11 = (defpackage.agqk) r11;
        r9 = r7.a(r9, r10, r11, r4);
        r9 = (defpackage.avmq) r9;
    L_0x00c6:
        if (r9 == 0) goto L_0x00d6;
    L_0x00c8:
        r10 = r8.e;
        r8 = java.lang.Long.valueOf(r10);
        r8 = defpackage.zz.a(r9, r8);
        r6.add(r8);
        goto L_0x008d;
    L_0x00d6:
        r8 = "Could not generate Renderer from OfflinePlaylistSnapshot";
        defpackage.xtl.c(r8);
        goto L_0x008d;
    L_0x00dc:
        r1 = r0.e;
        r1 = r1.b();
        if (r1 != 0) goto L_0x00e6;
    L_0x00e4:
        r7 = r4;
        goto L_0x0104;
    L_0x00e6:
        r1 = r1.r;
        if (r1 != 0) goto L_0x00ec;
    L_0x00ea:
        r1 = defpackage.aqdj.d;
    L_0x00ec:
        r1 = r1.c;
        if (r1 != 0) goto L_0x00f1;
    L_0x00f0:
        goto L_0x00e4;
    L_0x00f1:
        r1 = r0.b;
        r1 = r1.get();
        r1 = (defpackage.hoc) r1;
        r7 = java.lang.Void.class;
        r8 = defpackage.ajta.class;
        r1 = r1.a(r7, r8, r4, r4);
        r1 = (defpackage.ajta) r1;
        r7 = r1;
    L_0x0104:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r1 = r0.d;
        r1 = r1.c();
        if (r1 == 0) goto L_0x0163;
    L_0x0111:
        r1 = r0.f;
        r8 = r0.b;
        r8 = r8.get();
        r8 = (defpackage.hoc) r8;
        r1 = r1.c();
        r1 = r1.listIterator();
        r1 = (defpackage.amxn) r1;
        r9 = 0;
    L_0x0126:
        r10 = r1.hasNext();
        if (r10 == 0) goto L_0x0163;
    L_0x012c:
        r10 = r1.next();
        r10 = (defpackage.agqy) r10;
        r16 = defpackage.acwc.DOWNLOADS_PAGE_RECOMMENDED_VIDEO;
        r15 = defpackage.agqy.class;
        r14 = defpackage.aqgs.class;
        r10 = defpackage.amqw.a(r10);
        r10 = (defpackage.agqy) r10;
        r12 = java.lang.Boolean.valueOf(r3);
        r17 = java.lang.Integer.valueOf(r9);
        r11 = "is_candidate_video";
        r13 = "downloads_page_item_index";
        r18 = "downloads_page_item_ve_type";
        r2 = r14;
        r14 = r17;
        r3 = r15;
        r15 = r18;
        r11 = defpackage.amur.a(r11, r12, r13, r14, r15, r16);
        r2 = r8.a(r3, r2, r10, r11);
        r2 = (defpackage.aqgs) r2;
        r4.add(r2);
        r2 = 1;
        r9 = r9 + r2;
        r3 = 1;
        goto L_0x0126;
    L_0x0163:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1 = r6.isEmpty();
        if (r1 == 0) goto L_0x0180;
    L_0x016e:
        r1 = r0.b;
        r1 = r1.get();
        r1 = (defpackage.hoc) r1;
        r2 = r0.c;
        r1 = r1.b(r2, r5);
        r3.add(r1);
        goto L_0x019a;
    L_0x0180:
        r1 = defpackage.hoj.a;
        java.util.Collections.sort(r6, r1);
        r1 = r6.size();
        r2 = 0;
    L_0x018a:
        if (r2 >= r1) goto L_0x019a;
    L_0x018c:
        r8 = r6.get(r2);
        r8 = (defpackage.zz) r8;
        r8 = r8.a;
        r3.add(r8);
        r2 = r2 + 1;
        goto L_0x018a;
    L_0x019a:
        r1 = r0.b;
        r1 = r1.get();
        r1 = (defpackage.hoc) r1;
        r2 = r0.c;
        r6 = r1.c(r2, r5);
        r2 = r0.a;
        r1 = defpackage.hog.a(r2, r3, r4, r5, r6, r7);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hog.a(agvz, amur):java.lang.Object");
    }

    private static akab a(Context context, List list, List list2, int i, atwd atwd, ajta ajta) {
        akad akad;
        akab akab = new akab();
        ArrayList arrayList = new ArrayList();
        akad akad2 = new akad();
        ajwt ajwt = new ajwt();
        ajws ajws = new ajws();
        ajws.e = atwd;
        ajwt.d = ajws;
        ajwt.b = new ajww[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            ajwt.b[i2] = hog.a(list.get(i2));
        }
        atvz[] atvzArr = new atvz[1];
        atvy atvy = (atvy) atvz.f.createBuilder();
        awzv a = hss.a(i);
        if (a != null) {
            atvy.a(a);
        }
        atvzArr[0] = (atvz) ((anxl) atvy.build());
        ajwt.c = atvzArr;
        ajwt.f = "downloads_page_downloads_item_section_identifier";
        akad2.c = ajwt;
        arrayList.add(akad2);
        if (ajta != null) {
            akad = new akad();
            ajwt ajwt2 = new ajwt();
            ajwt2.b = new ajww[]{hog.a((Object) ajta)};
            ajwt2.f = "downloads_page_habanero_entry_item_section_identifier";
            akad.c = ajwt2;
            arrayList.add(akad);
        }
        if (!list2.isEmpty()) {
            akad = new akad();
            ajwt ajwt3 = new ajwt();
            atwc atwc = (atwc) atwd.d.createBuilder();
            atwc.a(ajqy.a(context.getResources().getString(R.string.download_recommendations_title)));
            atwd atwd2 = (atwd) ((anxl) atwc.build());
            ajws ajws2 = new ajws();
            ajws2.e = atwd2;
            ajwt3.d = ajws2;
            ajwt3.b = new ajww[list2.size()];
            for (int i3 = 0; i3 < list2.size(); i3++) {
                ajwt3.b[i3] = hog.a(list2.get(i3));
            }
            ajwt3.f = "downloads_page_recommendations_item_section_identifier";
            atvz[] atvzArr2 = new atvz[1];
            atvy atvy2 = (atvy) atvz.f.createBuilder();
            awzu awzu = (awzu) awzv.d.createBuilder();
            awzu.a("DownloadsPageGenerationService.RecommendationsReload");
            atvy2.a((awzv) ((anxl) awzu.build()));
            atvzArr2[0] = (atvz) ((anxl) atvy2.build());
            ajwt3.c = atvzArr2;
            akad.c = ajwt3;
            arrayList.add(akad);
        }
        akab.b = (akad[]) arrayList.toArray(new akad[arrayList.size()]);
        return akab;
    }
}
