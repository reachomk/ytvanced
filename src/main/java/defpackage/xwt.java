package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: xwt */
public final class xwt implements ygu {
    private final aaas a;
    private boolean b = false;

    public xwt(aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void a(String str, Object obj, aqnf aqnf, ygt ygt) {
        if (aqnf != null) {
            aphj aphj;
            aphv aphv;
            if ((aqnf.a & 8) != 0) {
                aphj = aqnf.e;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphv = aphj.c;
                if (aphv == null) {
                    aphv = aphv.s;
                }
                if (!(aphv.b || (aqnf.a & 32) == 0)) {
                    aaas aaas = this.a;
                    apxu apxu = aqnf.g;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, null);
                    return;
                }
            }
            if (!(this.b || (aqnf.a & 8) == 0)) {
                aphj = aqnf.e;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphv = aphj.c;
                if (aphv == null) {
                    aphv = aphv.s;
                }
                if (!(aphv.b || (aqnf.a & 16) == 0)) {
                    apxu apxu2 = aqnf.f;
                    if (apxu2 == null) {
                        apxu2 = apxu.d;
                    }
                    Map hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ygt);
                    this.a.a(apxu2, hashMap);
                    return;
                }
            }
            aqne aqne = (aqne) ((anxo) aqnf.toBuilder());
            a(str, obj, aqne, ygt);
            aqne.build();
        }
    }

    public final void b(String str, Object obj, aqnf aqnf, ygt ygt) {
        this.b = true;
        aqne aqne = (aqne) ((anxo) aqnf.toBuilder());
        a(str, obj, aqne, ygt);
        aqne.build();
    }

    /* JADX WARNING: Missing block: B:18:0x003b, code skipped:
            if ((r0.a & 512) != 0) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:28:0x0054, code skipped:
            if ((r0.a & 16384) != 0) goto L_0x0056;
     */
    private final void a(java.lang.String r9, java.lang.Object r10, defpackage.aqne r11, defpackage.ygt r12) {
        /*
        r8 = this;
        r0 = r11.instance;
        r0 = (defpackage.aqnf) r0;
        r0 = r0.a;
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x0110;
    L_0x000a:
        r0 = r11.a();
        r0 = r0.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0110;
    L_0x0014:
        r0 = r11.a();
        r0 = r0.c;
        if (r0 != 0) goto L_0x001e;
    L_0x001c:
        r0 = defpackage.aphv.s;
    L_0x001e:
        r1 = r0.b;
        r2 = 0;
        r3 = 0;
        r4 = 1;
        if (r1 != 0) goto L_0x003e;
    L_0x0025:
        r1 = r0.h;
        if (r1 != 0) goto L_0x002b;
    L_0x0029:
        r1 = defpackage.apxu.d;
    L_0x002b:
        r5 = r0.a;
        r5 = r5 & 16384;
        if (r5 == 0) goto L_0x0037;
    L_0x0031:
        r3 = r0.m;
        if (r3 != 0) goto L_0x0037;
    L_0x0035:
        r3 = defpackage.apxu.d;
    L_0x0037:
        r5 = r0.a;
        r5 = r5 & 512;
        if (r5 == 0) goto L_0x0057;
    L_0x003d:
        goto L_0x0056;
    L_0x003e:
        r1 = r0.m;
        if (r1 != 0) goto L_0x0044;
    L_0x0042:
        r1 = defpackage.apxu.d;
    L_0x0044:
        r5 = r0.a;
        r5 = r5 & 512;
        if (r5 == 0) goto L_0x0050;
    L_0x004a:
        r3 = r0.h;
        if (r3 != 0) goto L_0x0050;
    L_0x004e:
        r3 = defpackage.apxu.d;
    L_0x0050:
        r5 = r0.a;
        r5 = r5 & 16384;
        if (r5 == 0) goto L_0x0057;
    L_0x0056:
        r2 = 1;
    L_0x0057:
        if (r2 != 0) goto L_0x005a;
    L_0x0059:
        goto L_0x0097;
    L_0x005a:
        r2 = r8.a;
        r5 = r11.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.aqnf) r5;
        r10 = defpackage.ycp.a(r10);
        r10 = defpackage.zcz.b(r10);
        r5 = defpackage.zdb.a(r5);
        r6 = new java.util.HashMap;
        r6.<init>();
        r7 = "conversation_id";
        r6.put(r7, r9);
        r9 = "item_id";
        r6.put(r9, r10);
        r9 = r5 ^ 1;
        r9 = java.lang.Boolean.valueOf(r9);
        r10 = "set_hearted";
        r6.put(r10, r9);
        r9 = "reverse_command";
        r6.put(r9, r3);
        r9 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r6.put(r9, r12);
        r2.a(r1, r6);
    L_0x0097:
        r9 = r11.a();
        r9 = r9.toBuilder();
        r9 = (defpackage.anxo) r9;
        r9 = (defpackage.aphm) r9;
        r10 = r0.toBuilder();
        r10 = (defpackage.anxo) r10;
        r10 = (defpackage.aphy) r10;
        r0 = r0.b;
        r0 = r0 ^ r4;
        r10.a(r0);
        r9.copyOnWrite();
        r0 = r9.instance;
        r0 = (defpackage.aphj) r0;
        r10 = r10.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.aphv) r10;
        r0.c = r10;
        r10 = r0.a;
        r10 = r10 | 2;
        r0.a = r10;
        r11.copyOnWrite();
        r10 = r11.instance;
        r10 = (defpackage.aqnf) r10;
        r9 = r9.build();
        r9 = (defpackage.anxl) r9;
        r9 = (defpackage.aphj) r9;
        r10.e = r9;
        r9 = r10.a;
        r9 = r9 | 8;
        r10.a = r9;
        r9 = r11.build();
        r9 = (defpackage.anxl) r9;
        r9 = (defpackage.aqnf) r9;
        r12 = (defpackage.yem) r12;
        r10 = r12.d;
        r11 = r12.e;
        r11 = defpackage.ycp.a(r11);
        r11 = defpackage.zcz.b(r11);
        r10 = defpackage.ycq.a(r10, r11);
        r11 = r12.b;
        r10 = r11.a(r10);
        r10 = (defpackage.ycm) r10;
        if (r10 != 0) goto L_0x0104;
    L_0x0103:
        goto L_0x0110;
    L_0x0104:
        r10 = r10.d;
        r11 = r9.a;
        r11 = r11 & r4;
        if (r11 == 0) goto L_0x010d;
    L_0x010b:
        r9 = r9.b;
    L_0x010d:
        r12.a(r10, r4);
    L_0x0110:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwt.a(java.lang.String, java.lang.Object, aqne, ygt):void");
    }
}
