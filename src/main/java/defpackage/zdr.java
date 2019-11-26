package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zdr */
public final class zdr implements zei {
    private final aawd a;
    private final zeb b;
    private final Map c = new HashMap();

    public zdr(aawd aawd, zeb zeb) {
        this.a = (aawd) amqw.a((Object) aawd);
        this.b = (zeb) amqw.a((Object) zeb);
    }

    /* JADX WARNING: Missing block: B:31:0x0079, code skipped:
            if (android.text.TextUtils.equals(r2, r3.c) == false) goto L_0x009c;
     */
    /* JADX WARNING: Missing block: B:41:0x009a, code skipped:
            if (r2 == false) goto L_0x009c;
     */
    public final void a(defpackage.aqss r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        defpackage.xak.a();
        if (r1 == 0) goto L_0x039c;
    L_0x0009:
        r2 = r0.b;
        defpackage.xak.a();
        r3 = r2.f;
        if (r3 != 0) goto L_0x001a;
    L_0x0012:
        r3 = r2.e;
        r3 = r3.c();
        r2.f = r3;
    L_0x001a:
        r2 = r2.f;
        r3 = r1.b;
        if (r3 != 0) goto L_0x0022;
    L_0x0020:
        r3 = defpackage.aqsw.d;
    L_0x0022:
        r4 = -1;
        r5 = 0;
        r6 = 1;
        if (r2 != 0) goto L_0x0028;
    L_0x0027:
        goto L_0x007c;
    L_0x0028:
        r7 = r2.f();
        r7 = android.text.TextUtils.isEmpty(r7);
        if (r7 != 0) goto L_0x007c;
    L_0x0032:
        r7 = r1.a;
        r7 = r7 & r6;
        if (r7 == 0) goto L_0x009c;
    L_0x0037:
        r7 = r3.a;
        r7 = r7 & r6;
        if (r7 == 0) goto L_0x005b;
    L_0x003c:
        r7 = r3.b;
        if (r7 != 0) goto L_0x0042;
    L_0x0040:
        r7 = defpackage.aqsu.c;
    L_0x0042:
        r7 = r7.b;
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x005b;
    L_0x004a:
        r2 = r2.f();
        r3 = r3.b;
        if (r3 != 0) goto L_0x0054;
    L_0x0052:
        r3 = defpackage.aqsu.c;
    L_0x0054:
        r3 = r3.b;
        r2 = android.text.TextUtils.equals(r2, r3);
        goto L_0x009a;
    L_0x005b:
        r7 = r3.c;
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x009c;
    L_0x0063:
        r2 = r2.f();
        r7 = "||";
        r7 = r2.indexOf(r7);
        if (r7 == r4) goto L_0x0073;
    L_0x006f:
        r2 = r2.substring(r5, r7);
    L_0x0073:
        r3 = r3.c;
        r2 = android.text.TextUtils.equals(r2, r3);
        if (r2 != 0) goto L_0x009d;
    L_0x007b:
        goto L_0x009c;
    L_0x007c:
        r2 = r1.a;
        r2 = r2 & r6;
        if (r2 != 0) goto L_0x0082;
    L_0x0081:
        goto L_0x009d;
    L_0x0082:
        r2 = r3.a;
        r2 = r2 & r6;
        if (r2 == 0) goto L_0x0094;
    L_0x0087:
        r2 = r3.b;
        if (r2 != 0) goto L_0x008d;
    L_0x008b:
        r2 = defpackage.aqsu.c;
    L_0x008d:
        r2 = r2.b;
        r2 = r2.isEmpty();
        goto L_0x009a;
    L_0x0094:
        r2 = r3.c;
        r2 = r2.isEmpty();
    L_0x009a:
        if (r2 != 0) goto L_0x009d;
    L_0x009c:
        return;
    L_0x009d:
        r2 = defpackage.amul.j();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1 = r1.c;
        r1 = r1.iterator();
    L_0x00ac:
        r7 = r1.hasNext();
        r8 = 2;
        r9 = 0;
        if (r7 == 0) goto L_0x015b;
    L_0x00b4:
        r7 = r1.next();
        r7 = (defpackage.aqte) r7;
        r10 = r7.a;
        r3.addAll(r10);
        r10 = new java.util.ArrayList;
        r10.<init>();
        r11 = r7.c;
        r11 = r11.iterator();
    L_0x00ca:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x00e4;
    L_0x00d0:
        r12 = r11.next();
        r12 = (java.lang.String) r12;
        r12 = android.net.Uri.parse(r12);
        if (r12 == 0) goto L_0x00ca;
    L_0x00dc:
        r12 = defpackage.zdy.a(r12, r8, r9, r9, r9);
        r10.add(r12);
        goto L_0x00ca;
    L_0x00e4:
        r7 = r7.b;
        r7 = r7.iterator();
    L_0x00ea:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0156;
    L_0x00f0:
        r8 = r7.next();
        r8 = (defpackage.aqta) r8;
        r11 = r0.c;
        r11 = r11.keySet();
        r11 = r11.iterator();
    L_0x0100:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x012b;
    L_0x0106:
        r12 = r11.next();
        r12 = (java.util.regex.Pattern) r12;
        r13 = r8.b;
        if (r13 != 0) goto L_0x0112;
    L_0x0110:
        r13 = defpackage.aqtc.c;
    L_0x0112:
        r13 = r13.b;
        r13 = r12.matcher(r13);
        r13 = r13.matches();
        if (r13 == 0) goto L_0x0100;
    L_0x011e:
        r11 = r0.c;
        r11 = r11.get(r12);
        r11 = (defpackage.zdx) r11;
        r11 = r11.a();
        goto L_0x012c;
    L_0x012b:
        r11 = r8;
    L_0x012c:
        r12 = r8.b;
        if (r12 != 0) goto L_0x0132;
    L_0x0130:
        r12 = defpackage.aqtc.c;
    L_0x0132:
        r12 = r12.b;
        r12 = android.net.Uri.parse(r12);
        if (r12 == 0) goto L_0x00ea;
    L_0x013a:
        r13 = r8.a;
        r13 = r13 & 4;
        if (r13 == 0) goto L_0x014d;
    L_0x0140:
        r8 = r8.c;
        if (r8 != 0) goto L_0x0146;
    L_0x0144:
        r8 = defpackage.aqsy.c;
    L_0x0146:
        r13 = r8.b;
        r8 = java.lang.Long.valueOf(r13);
        goto L_0x014e;
    L_0x014d:
        r8 = r9;
    L_0x014e:
        r8 = defpackage.zdy.a(r12, r6, r9, r11, r8);
        r10.add(r8);
        goto L_0x00ea;
    L_0x0156:
        r2.b(r10);
        goto L_0x00ac;
    L_0x015b:
        r1 = r3.isEmpty();
        if (r1 != 0) goto L_0x016b;
    L_0x0161:
        r1 = r0.a;
        r7 = new zdu;
        r7.<init>(r0);
        r1.a(r3, r7);
    L_0x016b:
        r1 = r2.a();
        r2 = r1.isEmpty();
        if (r2 != 0) goto L_0x039c;
    L_0x0175:
        r2 = r0.b;
        defpackage.xak.a();
        r2.a();
        r3 = defpackage.amul.j();
        r1 = r1.iterator();
    L_0x0185:
        r7 = r1.hasNext();
        if (r7 == 0) goto L_0x02c7;
    L_0x018b:
        r7 = r1.next();
        r7 = (defpackage.zdy) r7;
        r10 = r7.a();
        r10 = r2.a(r10);
        r11 = r7.e();
        if (r11 == r8) goto L_0x01a0;
    L_0x019f:
        goto L_0x01bb;
    L_0x01a0:
        if (r10 == 0) goto L_0x01bb;
    L_0x01a2:
        r11 = r7.a();
        r2.c(r11);
        r11 = r7.a();
        r12 = r7.e();
        r10 = defpackage.zdy.a(r11, r12, r10, r9, r9);
        r10 = defpackage.amqp.b(r10);
        goto L_0x02a6;
    L_0x01bb:
        r10 = r7.e();
        if (r10 != r6) goto L_0x02a4;
    L_0x01c1:
        r10 = r7.c();
        if (r10 == 0) goto L_0x0207;
    L_0x01c7:
        r10 = r7.d();
        if (r10 == 0) goto L_0x0207;
    L_0x01cd:
        r10 = r7.d();
        r10 = r10.longValue();
        r12 = 0;
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x01dc;
    L_0x01db:
        goto L_0x0207;
    L_0x01dc:
        r10 = r7.a();
        r10 = r2.a(r10);
        r11 = r7.a();
        r12 = r7.e();
        r13 = r7.c();
        r14 = r7.d();
        r11 = defpackage.zdy.a(r11, r12, r10, r13, r14);
        if (r10 == 0) goto L_0x0201;
    L_0x01fa:
        r10 = r7.a();
        r2.c(r10);
    L_0x0201:
        r10 = defpackage.amqp.b(r11);
        goto L_0x02a6;
    L_0x0207:
        r10 = r7.a();
        r10 = r2.a(r10);
        if (r10 != 0) goto L_0x0216;
    L_0x0211:
        r11 = r7.c();
        goto L_0x0231;
    L_0x0216:
        r11 = r7.c();
        if (r11 != 0) goto L_0x021e;
    L_0x021c:
        r11 = r9;
        goto L_0x0231;
    L_0x021e:
        r11 = r7.c();
        r12 = r10 instanceof defpackage.zdv;
        if (r12 == 0) goto L_0x0231;
    L_0x0226:
        r12 = r11 instanceof defpackage.zdv;
        if (r12 == 0) goto L_0x0231;
    L_0x022a:
        r11 = r10;
        r11 = (defpackage.zdv) r11;
        r11 = r11.a();
    L_0x0231:
        r12 = r7.a();
        r13 = r7.d();
        r14 = r2.c;
        r15 = r2.a;
        r8 = new zdp;
        r16 = r10;
        r9 = r15.b();
        r8.<init>(r11, r9, r13);
        r14.put(r12, r8);
        r8 = new java.util.ArrayList;
        r8.<init>();
    L_0x0250:
        r9 = defpackage.zeb.d(r12);
        if (r9 == 0) goto L_0x0257;
    L_0x0256:
        goto L_0x0265;
    L_0x0257:
        r8.add(r5, r12);
        r9 = r2.b(r12);
        if (r9 != 0) goto L_0x0265;
    L_0x0260:
        r12 = defpackage.zeb.e(r12);
        goto L_0x0250;
    L_0x0265:
        r9 = r8.size();
        if (r9 <= r6) goto L_0x028d;
    L_0x026b:
        r9 = r8.remove(r5);
        r9 = (android.net.Uri) r9;
        r10 = r8.get(r5);
        r10 = (android.net.Uri) r10;
        r12 = r2.d;
        r13 = r12.get(r9);
        r13 = (java.util.LinkedHashSet) r13;
        if (r13 != 0) goto L_0x0289;
    L_0x0281:
        r13 = new java.util.LinkedHashSet;
        r13.<init>();
        r12.put(r9, r13);
    L_0x0289:
        r13.add(r10);
        goto L_0x0265;
    L_0x028d:
        r8 = r7.a();
        r9 = r7.e();
        r10 = r7.d();
        r12 = r16;
        r8 = defpackage.zdy.a(r8, r9, r12, r11, r10);
        r10 = defpackage.amqp.b(r8);
        goto L_0x02a6;
    L_0x02a4:
        r10 = defpackage.ampo.a;
    L_0x02a6:
        r8 = r10.a();
        if (r8 == 0) goto L_0x02b6;
    L_0x02ac:
        r7 = r10.b();
        r7 = (defpackage.zdy) r7;
        r3.c(r7);
        goto L_0x02c3;
    L_0x02b6:
        r8 = new java.lang.Object[r6];
        r8[r5] = r7;
        r7 = "DataSyncStore: Change %s invalid";
        r7 = java.lang.String.format(r7, r8);
        defpackage.xtl.d(r7);
    L_0x02c3:
        r8 = 2;
        r9 = 0;
        goto L_0x0185;
    L_0x02c7:
        r1 = r3.a();
        r3 = r1.isEmpty();
        if (r3 != 0) goto L_0x039c;
    L_0x02d1:
        r2 = r2.b;
        defpackage.xak.a();
        r3 = new java.util.HashMap;
        r3.<init>();
        r1 = r1.iterator();
    L_0x02df:
        r7 = r1.hasNext();
        if (r7 == 0) goto L_0x036c;
    L_0x02e5:
        r7 = r1.next();
        r7 = (defpackage.zdy) r7;
        r8 = r7.a();
    L_0x02ef:
        r9 = r8.toString();
        r9 = android.text.TextUtils.isEmpty(r9);
        if (r9 != 0) goto L_0x02df;
    L_0x02f9:
        r9 = r2.a;
        r9 = r9.get(r8);
        r9 = (java.util.Set) r9;
        if (r9 == 0) goto L_0x0335;
    L_0x0303:
        r9 = r9.iterator();
    L_0x0307:
        r10 = r9.hasNext();
        if (r10 == 0) goto L_0x0335;
    L_0x030d:
        r10 = r9.next();
        r10 = (defpackage.zdz) r10;
        r11 = new zdq;
        r11.<init>(r8, r10);
        r10 = r3.get(r11);
        r10 = (java.util.List) r10;
        if (r10 == 0) goto L_0x0324;
    L_0x0320:
        r10.add(r7);
        goto L_0x0307;
    L_0x0324:
        r10 = new java.util.ArrayList;
        r12 = new defpackage.zdy[r6];
        r12[r5] = r7;
        r12 = java.util.Arrays.asList(r12);
        r10.<init>(r12);
        r3.put(r11, r10);
        goto L_0x0307;
    L_0x0335:
        r9 = new java.util.ArrayList;
        r10 = r8.getPathSegments();
        r9.<init>(r10);
        r10 = r9.size();
        if (r10 != 0) goto L_0x0347;
    L_0x0344:
        r8 = android.net.Uri.EMPTY;
        goto L_0x02ef;
    L_0x0347:
        r10 = r9.size();
        r10 = r10 + r4;
        r9 = r9.subList(r5, r10);
        r10 = new android.net.Uri$Builder;
        r10.<init>();
        r8 = r8.getScheme();
        r8 = r10.scheme(r8);
        r10 = "/";
        r9 = android.text.TextUtils.join(r10, r9);
        r8 = r8.path(r9);
        r8 = r8.build();
        goto L_0x02ef;
    L_0x036c:
        r1 = r3.keySet();
        r1 = r1.iterator();
    L_0x0374:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x039c;
    L_0x037a:
        r2 = r1.next();
        r2 = (defpackage.zec) r2;
        r4 = defpackage.amul.j();
        r5 = r2.b();
        r2.a();
        r2 = r3.get(r2);
        r2 = (java.lang.Iterable) r2;
        r4.b(r2);
        r2 = r4.a();
        r5.a(r2);
        goto L_0x0374;
    L_0x039c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdr.a(aqss):void");
    }

    public final void a(Collection collection, zdw zdw) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri : collection) {
            arrayList.add(uri.toString());
        }
        this.a.a(arrayList, new zdu(this, collection, zdw));
    }

    public final void a(Collection collection) {
        a(collection, null);
    }
}
