package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: dwk */
public final class dwk {
    private final bcaa a;
    private final avwi b;
    private final Map c;
    private final dwm d;

    /* JADX WARNING: Missing block: B:7:0x0027, code skipped:
            if (r11 != 0) goto L_0x002b;
     */
    public dwk(android.content.Context r11, defpackage.bcaa r12, defpackage.vdg r13) {
        /*
        r10 = this;
        r10.<init>();
        r10.a = r12;
        r11 = r13.k();
        r13 = r11 instanceof defpackage.avwi;
        r0 = 0;
        if (r13 == 0) goto L_0x0013;
    L_0x000e:
        r11 = (defpackage.avwi) r11;
        r10.b = r11;
        goto L_0x0015;
    L_0x0013:
        r10.b = r0;
    L_0x0015:
        r11 = new java.util.HashMap;
        r11.<init>();
        r10.c = r11;
        r11 = r10.b;
        r13 = 1;
        if (r11 == 0) goto L_0x002a;
    L_0x0021:
        r11 = r11.d;
        r11 = defpackage.axua.a(r11);
        if (r11 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x002b;
    L_0x002a:
        r11 = 1;
    L_0x002b:
        r1 = r10.b;
        r2 = 0;
        if (r1 == 0) goto L_0x0034;
    L_0x0030:
        r3 = r1.c;
        r6 = r3;
        goto L_0x0035;
    L_0x0034:
        r6 = 0;
    L_0x0035:
        if (r1 == 0) goto L_0x003e;
    L_0x0037:
        r3 = r1.e;
        if (r3 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x003e;
    L_0x003c:
        r7 = 1;
        goto L_0x003f;
    L_0x003e:
        r7 = 0;
    L_0x003f:
        if (r1 == 0) goto L_0x0048;
    L_0x0041:
        r1 = r1.f;
        if (r1 != 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0048;
    L_0x0046:
        r8 = 1;
        goto L_0x0049;
    L_0x0048:
        r8 = 0;
    L_0x0049:
        r9 = r10.b();
        r1 = r11 + -1;
        if (r11 == 0) goto L_0x0065;
    L_0x0051:
        if (r1 == r13) goto L_0x005b;
    L_0x0053:
        r11 = new dwh;
        r4 = r11;
        r5 = r12;
        r4.<init>(r5, r6, r7, r8, r9);
        goto L_0x0062;
    L_0x005b:
        r11 = new dwi;
        r4 = r11;
        r5 = r12;
        r4.<init>(r5, r6, r7, r8, r9);
    L_0x0062:
        r10.d = r11;
        return;
    L_0x0065:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwk.<init>(android.content.Context, bcaa, vdg):void");
    }

    public final Object a(String str, Class cls, String str2, dwj dwj, Object obj) {
        dwl dwl = new dwl(str, cls);
        Object obj2 = this.c.get(dwl);
        if (cls.isInstance(obj2)) {
            obj2 = cls.cast(obj2);
            this.d.a(dwl, str2, null, true);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            alwu alwu;
            String b;
            String b2;
            obj2 = dwj.a();
            int i = 0;
            if (amqu.a(dwl.a)) {
                alwu = (alwu) this.a.get();
                b = amqu.b(str2);
                b2 = b();
                ((uib) alwu.e.get()).a(b, b2);
            }
            this.c.put(dwl, obj2);
            if (this.d.b(dwl)) {
                alwu = (alwu) this.a.get();
                b = amqu.b(str2);
                b2 = b();
                ((uib) alwu.f.get()).a(b, b2);
            }
            this.d.a(dwl, str2, obj, false);
            if (this.d.a()) {
                List arrayList = new ArrayList();
                this.d.b(arrayList);
                int size = arrayList.size();
                while (i < size) {
                    dwl dwl2 = (dwl) arrayList.get(i);
                    this.c.remove(dwl2);
                    this.d.a(dwl2);
                    i++;
                }
            }
        }
        return obj2;
    }

    public final boolean a() {
        avwi avwi = this.b;
        return avwi != null && avwi.b;
    }

    private final String b() {
        avwi avwi = this.b;
        if (avwi == null) {
            return "";
        }
        return amqu.b(avwi.g);
    }
}
