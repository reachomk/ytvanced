package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import java.util.List;

/* renamed from: agrw */
public final class agrw implements agts {
    private final xuu a;
    private final int b;

    public agrw(xuu xuu, int i) {
        this.a = xuu;
        this.b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0051 */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:1|2|(2:4|(1:6))|7|(3:9|10|(1:12))|13|14|(1:16)(2:17|(15:19|(2:23|(1:25)(12:26|(3:29|(1:31)(1:69)|27)|68|32|33|48|56|(1:58)|59|(1:61)|62|63))|34|(1:36)|70|37|(2:40|(1:42)(1:(2:44|(2:45|(1:47)(1:71)))(0)))(0)|39|48|56|(0)|59|(0)|62|63))|49|(2:51|(1:53)(1:54))|55|56|(0)|59|(0)|62|63) */
    public final synchronized defpackage.aozg a(defpackage.aiqq r11, defpackage.agvw r12) {
        /*
        r10 = this;
        monitor-enter(r10);
        defpackage.amqw.a(r11);	 Catch:{ all -> 0x013c }
        r1 = r12.c();	 Catch:{ all -> 0x013c }
        r0 = r11.c();	 Catch:{ all -> 0x013c }
        r12 = r1.size();	 Catch:{ all -> 0x013c }
        r2 = r11.d();	 Catch:{ all -> 0x013c }
        r3 = 0;
        r4 = java.lang.Math.max(r2, r3);	 Catch:{ all -> 0x013c }
        r2 = r11.h();	 Catch:{ all -> 0x013c }
        r11 = r11.b;	 Catch:{ all -> 0x013c }
        r5 = 0;
        if (r11 == 0) goto L_0x0036;
    L_0x0022:
        r6 = com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass.offlineWatchEndpoint;	 Catch:{ all -> 0x013c }
        r6 = defpackage.anxl.checkIsLite(r6);	 Catch:{ all -> 0x013c }
        r11.a(r6);	 Catch:{ all -> 0x013c }
        r11 = r11.h;	 Catch:{ all -> 0x013c }
        r6 = r6.d;	 Catch:{ all -> 0x013c }
        r11 = r11.a(r6);	 Catch:{ all -> 0x013c }
        if (r11 == 0) goto L_0x0036;
    L_0x0035:
        r5 = r2;
    L_0x0036:
        r11 = defpackage.nkk.e;	 Catch:{ all -> 0x013c }
        r11 = r11.createBuilder();	 Catch:{ all -> 0x013c }
        r11 = (defpackage.nkj) r11;	 Catch:{ all -> 0x013c }
        r2 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x013c }
        if (r2 != 0) goto L_0x0051;
    L_0x0044:
        r2 = android.util.Base64.decode(r5, r3);	 Catch:{ anyg | IllegalArgumentException -> 0x0051, anyg | IllegalArgumentException -> 0x0051 }
        if (r2 == 0) goto L_0x0051;
    L_0x004a:
        r5 = defpackage.anxa.c();	 Catch:{ anyg | IllegalArgumentException -> 0x0051, anyg | IllegalArgumentException -> 0x0051 }
        r11.mergeFrom(r2, r5);	 Catch:{ anyg | IllegalArgumentException -> 0x0051, anyg | IllegalArgumentException -> 0x0051 }
    L_0x0051:
        r11 = r11.build();	 Catch:{ all -> 0x013c }
        r11 = (defpackage.anxl) r11;	 Catch:{ all -> 0x013c }
        r11 = (defpackage.nkk) r11;	 Catch:{ all -> 0x013c }
        r2 = 1;
        if (r12 > r2) goto L_0x005e;
    L_0x005c:
        goto L_0x00dd;
    L_0x005e:
        r5 = r10.b;	 Catch:{ all -> 0x013c }
        r5 = r5 & 2;
        if (r5 == 0) goto L_0x00dd;
    L_0x0064:
        r5 = r11.c;	 Catch:{ all -> 0x013c }
        if (r5 == 0) goto L_0x0092;
    L_0x0068:
        r5 = r11.d;	 Catch:{ all -> 0x013c }
        r5 = r5.size();	 Catch:{ all -> 0x013c }
        if (r5 == 0) goto L_0x0092;
    L_0x0070:
        r5 = r11.d;	 Catch:{ all -> 0x013c }
        r5 = r5.size();	 Catch:{ all -> 0x013c }
        r6 = r1.size();	 Catch:{ all -> 0x013c }
        if (r5 == r6) goto L_0x007d;
    L_0x007c:
        goto L_0x0092;
    L_0x007d:
        r11 = r11.d;	 Catch:{ all -> 0x013c }
        r11 = defpackage.anhe.a(r11);	 Catch:{ all -> 0x013c }
        r12 = 0;
    L_0x0084:
        r2 = r11.length;	 Catch:{ all -> 0x013c }
        if (r12 >= r2) goto L_0x008e;
    L_0x0087:
        r2 = r11[r12];	 Catch:{ all -> 0x013c }
        if (r2 == r4) goto L_0x008f;
    L_0x008b:
        r12 = r12 + 1;
        goto L_0x0084;
    L_0x008e:
        r12 = 0;
    L_0x008f:
        r5 = r11;
        r3 = r12;
        goto L_0x00d4;
    L_0x0092:
        r11 = new int[r12];	 Catch:{ all -> 0x013c }
        r5 = 0;
    L_0x0095:
        if (r5 >= r12) goto L_0x009c;
    L_0x0097:
        r11[r5] = r5;	 Catch:{ all -> 0x013c }
        r5 = r5 + 1;
        goto L_0x0095;
    L_0x009c:
        r11[r3] = r4;	 Catch:{ all -> 0x013c }
        r11[r4] = r3;	 Catch:{ all -> 0x013c }
        r5 = r10.a;	 Catch:{ all -> 0x013c }
        r6 = r5.a;	 Catch:{ all -> 0x013c }
        if (r6 != 0) goto L_0x00a8;
    L_0x00a6:
        r5 = r11;
        goto L_0x00d4;
    L_0x00a8:
        r2 = java.lang.Math.max(r2, r3);	 Catch:{ all -> 0x013c }
        if (r2 < r12) goto L_0x00af;
    L_0x00ae:
        goto L_0x00a6;
    L_0x00af:
        if (r2 >= r12) goto L_0x00a6;
    L_0x00b1:
        r12 = java.lang.Math.min(r12, r12);	 Catch:{ all -> 0x013c }
        r12 = r12 - r2;
    L_0x00b6:
        r12 = r12 + -1;
        if (r12 < 0) goto L_0x00a6;
    L_0x00ba:
        r6 = r12 + r2;
        r7 = r5.a;	 Catch:{ all -> 0x013c }
        r7 = r7.get();	 Catch:{ all -> 0x013c }
        r7 = (java.security.SecureRandom) r7;	 Catch:{ all -> 0x013c }
        r8 = r12 + 1;
        r7 = r7.nextInt(r8);	 Catch:{ all -> 0x013c }
        r7 = r7 + r2;
        r8 = r11[r6];	 Catch:{ all -> 0x013c }
        r9 = r11[r7];	 Catch:{ all -> 0x013c }
        r11[r6] = r9;	 Catch:{ all -> 0x013c }
        r11[r7] = r8;	 Catch:{ all -> 0x013c }
        goto L_0x00b6;
    L_0x00d4:
        r11 = r10.b;	 Catch:{ all -> 0x013c }
        r2 = r4;
        r4 = r11;
        r11 = defpackage.agrw.a(r0, r1, r2, r3, r4, r5);	 Catch:{ all -> 0x013c }
        goto L_0x00f2;
    L_0x00dd:
        r11 = r10.b;	 Catch:{ all -> 0x013c }
        if (r12 > r2) goto L_0x00e9;
    L_0x00e1:
        r12 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x013c }
        if (r12 != 0) goto L_0x00e8;
    L_0x00e7:
        goto L_0x00e9;
    L_0x00e8:
        r2 = 0;
    L_0x00e9:
        r11 = r11 & r2;
        r5 = 0;
        r2 = r4;
        r3 = r4;
        r4 = r11;
        r11 = defpackage.agrw.a(r0, r1, r2, r3, r4, r5);	 Catch:{ all -> 0x013c }
    L_0x00f2:
        r12 = defpackage.aozg.g;	 Catch:{ all -> 0x013c }
        r12 = r12.createBuilder();	 Catch:{ all -> 0x013c }
        r12 = (defpackage.aozr) r12;	 Catch:{ all -> 0x013c }
        r12.copyOnWrite();	 Catch:{ all -> 0x013c }
        r0 = r12.instance;	 Catch:{ all -> 0x013c }
        r0 = (defpackage.aozg) r0;	 Catch:{ all -> 0x013c }
        r1 = r0.b;	 Catch:{ all -> 0x013c }
        r1 = r1.a();	 Catch:{ all -> 0x013c }
        if (r1 != 0) goto L_0x0111;
    L_0x0109:
        r1 = r0.b;	 Catch:{ all -> 0x013c }
        r1 = defpackage.anxl.mutableCopy(r1);	 Catch:{ all -> 0x013c }
        r0.b = r1;	 Catch:{ all -> 0x013c }
    L_0x0111:
        r0 = r0.b;	 Catch:{ all -> 0x013c }
        defpackage.anvf.addAll(r11, r0);	 Catch:{ all -> 0x013c }
        r12.copyOnWrite();	 Catch:{ all -> 0x013c }
        r0 = r12.instance;	 Catch:{ all -> 0x013c }
        r0 = (defpackage.aozg) r0;	 Catch:{ all -> 0x013c }
        r1 = r0.c;	 Catch:{ all -> 0x013c }
        r1 = r1.a();	 Catch:{ all -> 0x013c }
        if (r1 != 0) goto L_0x012d;
    L_0x0125:
        r1 = r0.c;	 Catch:{ all -> 0x013c }
        r1 = defpackage.anxl.mutableCopy(r1);	 Catch:{ all -> 0x013c }
        r0.c = r1;	 Catch:{ all -> 0x013c }
    L_0x012d:
        r0 = r0.c;	 Catch:{ all -> 0x013c }
        defpackage.anvf.addAll(r11, r0);	 Catch:{ all -> 0x013c }
        r11 = r12.build();	 Catch:{ all -> 0x013c }
        r11 = (defpackage.anxl) r11;	 Catch:{ all -> 0x013c }
        r11 = (defpackage.aozg) r11;	 Catch:{ all -> 0x013c }
        monitor-exit(r10);
        return r11;
    L_0x013c:
        r11 = move-exception;
        monitor-exit(r10);
        goto L_0x0140;
    L_0x013f:
        throw r11;
    L_0x0140:
        goto L_0x013f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agrw.a(aiqq, agvw):aozg");
    }

    /* JADX WARNING: Missing block: B:9:0x005e, code skipped:
            if (r10 != null) goto L_0x0060;
     */
    private static java.util.List a(java.lang.String r6, java.util.List r7, int r8, int r9, int r10, int[] r11) {
        /*
        r0 = r10 & 1;
        r10 = r10 & 2;
        r1 = 0;
        r2 = 1;
        if (r10 != 0) goto L_0x000a;
    L_0x0008:
        r10 = 0;
        goto L_0x000b;
    L_0x000a:
        r10 = 1;
    L_0x000b:
        r3 = new java.util.ArrayList;
        r4 = 4;
        r3.<init>(r4);
        r4 = defpackage.nkk.e;
        r4 = r4.createBuilder();
        r4 = (defpackage.nkj) r4;
        r4.a(r1);
        r4.b(r1);
        r5 = r4.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.nkk) r5;
        r5 = defpackage.agrw.a(r6, r7, r8, r9, r5);
        r3.add(r5);
        if (r0 == 0) goto L_0x005e;
    L_0x0030:
        r4.a(r2);
        r0 = r4.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.nkk) r0;
        r0 = defpackage.agrw.a(r6, r7, r8, r9, r0);
        r3.add(r0);
        if (r10 == 0) goto L_0x0089;
    L_0x0044:
        r4.b(r2);
        r10 = defpackage.anhe.a(r11);
        r4.a(r10);
        r10 = r4.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.nkk) r10;
        r10 = defpackage.agrw.a(r6, r7, r8, r9, r10);
        r3.add(r10);
        goto L_0x0060;
    L_0x005e:
        if (r10 == 0) goto L_0x0089;
    L_0x0060:
        r4.a(r1);
        r4.b(r2);
        r4.copyOnWrite();
        r10 = r4.instance;
        r10 = (defpackage.nkk) r10;
        r0 = defpackage.anxl.emptyIntList();
        r10.d = r0;
        r10 = defpackage.anhe.a(r11);
        r4.a(r10);
        r10 = r4.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.nkk) r10;
        r6 = defpackage.agrw.a(r6, r7, r8, r9, r10);
        r3.add(r6);
    L_0x0089:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agrw.a(java.lang.String, java.util.List, int, int, int, int[]):java.util.List");
    }

    private static aozl a(String str, List list, int i, int i2, nkk nkk) {
        boolean z = nkk.b;
        Object obj = (!nkk.c || nkk.d.size() == 0) ? null : 1;
        String encodeToString = Base64.encodeToString(nkk.toByteArray(), 0);
        aozm aozm = (aozm) aozl.i.createBuilder();
        if (z && obj != null) {
            aozm.a(5);
        } else if (obj != null) {
            aozm.a(3);
        } else if (z) {
            aozm.a(4);
        } else {
            aozm.a(2);
        }
        if (obj != null) {
            i = i2;
        }
        i2 = list.size();
        if (i > 0 || z) {
            int i3 = ((i + i2) - 1) % i2;
            if (obj != null) {
                i3 = nkk.d.c(i3);
            }
            apxu a = agrw.a(((agqp) list.get(i3)).a(), str, i3, encodeToString);
            aozm.copyOnWrite();
            aozl aozl = (aozl) aozm.instance;
            if (a != null) {
                aozl.g = a;
                aozl.a |= 32;
            } else {
                throw new NullPointerException();
            }
        }
        if (i < i2 - 1 || z) {
            i = (i + 1) % i2;
            if (obj != null) {
                i = nkk.d.c(i);
            }
            apxu a2 = agrw.a(((agqp) list.get(i)).a(), str, i, encodeToString);
            aozm.copyOnWrite();
            aozl aozl2 = (aozl) aozm.instance;
            if (a2 != null) {
                aozl2.e = a2;
                aozl2.a |= 8;
                aozm.copyOnWrite();
                aozl2 = (aozl) aozm.instance;
                aozl2.c = a2;
                aozl2.a |= 2;
            } else {
                throw new NullPointerException();
            }
        }
        return (aozl) ((anxl) aozm.build());
    }

    private static apxu a(String str, String str2, int i, String str3) {
        avse avse = (avse) avsc.g.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            avse.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            avse.b(str2);
        }
        if (i >= 0) {
            avse.a(i);
        }
        if (!TextUtils.isEmpty(str3)) {
            avse.c(str3);
        }
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (avsc) ((anxl) avse.build()));
        return (apxu) ((anxl) apxx.build());
    }
}
