package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: bctj */
public final class bctj implements bctl {
    private final HashMap a = bctj.a();
    private final HashMap b = bctj.a();

    public final String a(Locale locale, String str, String str2) {
        String[] c = c(locale, str, str2);
        return c != null ? c[0] : null;
    }

    public final String b(Locale locale, String str, String str2) {
        String[] c = c(locale, str, str2);
        return c != null ? c[1] : null;
    }

    /* JADX WARNING: Missing block: B:48:0x00c6, code skipped:
            return null;
     */
    private final synchronized java.lang.String[] c(java.util.Locale r10, java.lang.String r11, java.lang.String r12) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = 0;
        if (r10 == 0) goto L_0x00c5;
    L_0x0004:
        if (r11 == 0) goto L_0x00c5;
    L_0x0006:
        r1 = r9.a;	 Catch:{ all -> 0x00c2 }
        r1 = r1.get(r10);	 Catch:{ all -> 0x00c2 }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x00c2 }
        if (r1 != 0) goto L_0x001a;
    L_0x0010:
        r1 = r9.a;	 Catch:{ all -> 0x00c2 }
        r2 = defpackage.bctj.a();	 Catch:{ all -> 0x00c2 }
        r1.put(r10, r2);	 Catch:{ all -> 0x00c2 }
        r1 = r2;
    L_0x001a:
        r2 = r1.get(r11);	 Catch:{ all -> 0x00c2 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x00c2 }
        if (r2 != 0) goto L_0x00ba;
    L_0x0022:
        r2 = defpackage.bctj.a();	 Catch:{ all -> 0x00c2 }
        r1.put(r11, r2);	 Catch:{ all -> 0x00c2 }
        r1 = java.util.Locale.ENGLISH;	 Catch:{ all -> 0x00c2 }
        r1 = defpackage.bcpo.a(r1);	 Catch:{ all -> 0x00c2 }
        r1 = r1.getZoneStrings();	 Catch:{ all -> 0x00c2 }
        r3 = r1.length;	 Catch:{ all -> 0x00c2 }
        r4 = 0;
        r5 = 0;
    L_0x0036:
        r6 = 5;
        if (r5 >= r3) goto L_0x004d;
    L_0x0039:
        r7 = r1[r5];	 Catch:{ all -> 0x00c2 }
        if (r7 != 0) goto L_0x003e;
    L_0x003d:
        goto L_0x004a;
    L_0x003e:
        r8 = r7.length;	 Catch:{ all -> 0x00c2 }
        if (r8 < r6) goto L_0x004a;
    L_0x0041:
        r8 = r7[r4];	 Catch:{ all -> 0x00c2 }
        r8 = r11.equals(r8);	 Catch:{ all -> 0x00c2 }
        if (r8 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x004e;
    L_0x004a:
        r5 = r5 + 1;
        goto L_0x0036;
    L_0x004d:
        r7 = r0;
    L_0x004e:
        r10 = defpackage.bcpo.a(r10);	 Catch:{ all -> 0x00c2 }
        r10 = r10.getZoneStrings();	 Catch:{ all -> 0x00c2 }
        r1 = r10.length;	 Catch:{ all -> 0x00c2 }
        r3 = 0;
    L_0x0058:
        if (r3 >= r1) goto L_0x006f;
    L_0x005a:
        r5 = r10[r3];	 Catch:{ all -> 0x00c2 }
        if (r5 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x006c;
    L_0x005f:
        r8 = r5.length;	 Catch:{ all -> 0x00c2 }
        if (r8 < r6) goto L_0x006c;
    L_0x0062:
        r8 = r5[r4];	 Catch:{ all -> 0x00c2 }
        r8 = r11.equals(r8);	 Catch:{ all -> 0x00c2 }
        if (r8 == 0) goto L_0x006c;
    L_0x006a:
        r0 = r5;
        goto L_0x006f;
    L_0x006c:
        r3 = r3 + 1;
        goto L_0x0058;
    L_0x006f:
        if (r7 != 0) goto L_0x0072;
    L_0x0071:
        goto L_0x00ba;
    L_0x0072:
        if (r0 == 0) goto L_0x00ba;
    L_0x0074:
        r10 = 2;
        r11 = r7[r10];	 Catch:{ all -> 0x00c2 }
        r1 = new java.lang.String[r10];	 Catch:{ all -> 0x00c2 }
        r3 = r0[r10];	 Catch:{ all -> 0x00c2 }
        r1[r4] = r3;	 Catch:{ all -> 0x00c2 }
        r3 = 1;
        r5 = r0[r3];	 Catch:{ all -> 0x00c2 }
        r1[r3] = r5;	 Catch:{ all -> 0x00c2 }
        r2.put(r11, r1);	 Catch:{ all -> 0x00c2 }
        r11 = r7[r10];	 Catch:{ all -> 0x00c2 }
        r1 = 4;
        r5 = r7[r1];	 Catch:{ all -> 0x00c2 }
        r11 = r11.equals(r5);	 Catch:{ all -> 0x00c2 }
        r5 = 3;
        if (r11 == 0) goto L_0x00ab;
    L_0x0091:
        r11 = r7[r1];	 Catch:{ all -> 0x00c2 }
        r11 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x00c2 }
        r6 = "-Summer";
        r11 = r11.concat(r6);	 Catch:{ all -> 0x00c2 }
        r10 = new java.lang.String[r10];	 Catch:{ all -> 0x00c2 }
        r1 = r0[r1];	 Catch:{ all -> 0x00c2 }
        r10[r4] = r1;	 Catch:{ all -> 0x00c2 }
        r0 = r0[r5];	 Catch:{ all -> 0x00c2 }
        r10[r3] = r0;	 Catch:{ all -> 0x00c2 }
        r2.put(r11, r10);	 Catch:{ all -> 0x00c2 }
        goto L_0x00ba;
    L_0x00ab:
        r11 = r7[r1];	 Catch:{ all -> 0x00c2 }
        r10 = new java.lang.String[r10];	 Catch:{ all -> 0x00c2 }
        r1 = r0[r1];	 Catch:{ all -> 0x00c2 }
        r10[r4] = r1;	 Catch:{ all -> 0x00c2 }
        r0 = r0[r5];	 Catch:{ all -> 0x00c2 }
        r10[r3] = r0;	 Catch:{ all -> 0x00c2 }
        r2.put(r11, r10);	 Catch:{ all -> 0x00c2 }
    L_0x00ba:
        r10 = r2.get(r12);	 Catch:{ all -> 0x00c2 }
        r10 = (java.lang.String[]) r10;	 Catch:{ all -> 0x00c2 }
        monitor-exit(r9);
        return r10;
    L_0x00c2:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
    L_0x00c5:
        monitor-exit(r9);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bctj.c(java.util.Locale, java.lang.String, java.lang.String):java.lang.String[]");
    }

    /* JADX WARNING: Missing block: B:45:0x00a6, code skipped:
            return null;
     */
    public final synchronized java.lang.String[] a(java.util.Locale r10, java.lang.String r11, boolean r12) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = 0;
        if (r10 == 0) goto L_0x00a5;
    L_0x0004:
        if (r11 == 0) goto L_0x00a5;
    L_0x0006:
        r1 = r9.b;	 Catch:{ all -> 0x00a2 }
        r1 = r1.get(r10);	 Catch:{ all -> 0x00a2 }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x00a2 }
        if (r1 != 0) goto L_0x001a;
    L_0x0010:
        r1 = r9.b;	 Catch:{ all -> 0x00a2 }
        r2 = defpackage.bctj.a();	 Catch:{ all -> 0x00a2 }
        r1.put(r10, r2);	 Catch:{ all -> 0x00a2 }
        r1 = r2;
    L_0x001a:
        r2 = r1.get(r11);	 Catch:{ all -> 0x00a2 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x00a2 }
        if (r2 != 0) goto L_0x0096;
    L_0x0022:
        r2 = defpackage.bctj.a();	 Catch:{ all -> 0x00a2 }
        r1.put(r11, r2);	 Catch:{ all -> 0x00a2 }
        r1 = java.util.Locale.ENGLISH;	 Catch:{ all -> 0x00a2 }
        r1 = defpackage.bcpo.a(r1);	 Catch:{ all -> 0x00a2 }
        r1 = r1.getZoneStrings();	 Catch:{ all -> 0x00a2 }
        r3 = r1.length;	 Catch:{ all -> 0x00a2 }
        r4 = 0;
        r5 = 0;
    L_0x0036:
        r6 = 5;
        if (r5 >= r3) goto L_0x004d;
    L_0x0039:
        r7 = r1[r5];	 Catch:{ all -> 0x00a2 }
        if (r7 != 0) goto L_0x003e;
    L_0x003d:
        goto L_0x004a;
    L_0x003e:
        r8 = r7.length;	 Catch:{ all -> 0x00a2 }
        if (r8 < r6) goto L_0x004a;
    L_0x0041:
        r8 = r7[r4];	 Catch:{ all -> 0x00a2 }
        r8 = r11.equals(r8);	 Catch:{ all -> 0x00a2 }
        if (r8 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x004e;
    L_0x004a:
        r5 = r5 + 1;
        goto L_0x0036;
    L_0x004d:
        r7 = r0;
    L_0x004e:
        r10 = defpackage.bcpo.a(r10);	 Catch:{ all -> 0x00a2 }
        r10 = r10.getZoneStrings();	 Catch:{ all -> 0x00a2 }
        r1 = r10.length;	 Catch:{ all -> 0x00a2 }
        r3 = 0;
    L_0x0058:
        if (r3 >= r1) goto L_0x006f;
    L_0x005a:
        r5 = r10[r3];	 Catch:{ all -> 0x00a2 }
        if (r5 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x006c;
    L_0x005f:
        r8 = r5.length;	 Catch:{ all -> 0x00a2 }
        if (r8 < r6) goto L_0x006c;
    L_0x0062:
        r8 = r5[r4];	 Catch:{ all -> 0x00a2 }
        r8 = r11.equals(r8);	 Catch:{ all -> 0x00a2 }
        if (r8 == 0) goto L_0x006c;
    L_0x006a:
        r0 = r5;
        goto L_0x006f;
    L_0x006c:
        r3 = r3 + 1;
        goto L_0x0058;
    L_0x006f:
        if (r7 != 0) goto L_0x0072;
    L_0x0071:
        goto L_0x0096;
    L_0x0072:
        if (r0 == 0) goto L_0x0096;
    L_0x0074:
        r10 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x00a2 }
        r11 = 2;
        r1 = new java.lang.String[r11];	 Catch:{ all -> 0x00a2 }
        r3 = r0[r11];	 Catch:{ all -> 0x00a2 }
        r1[r4] = r3;	 Catch:{ all -> 0x00a2 }
        r3 = 1;
        r5 = r0[r3];	 Catch:{ all -> 0x00a2 }
        r1[r3] = r5;	 Catch:{ all -> 0x00a2 }
        r2.put(r10, r1);	 Catch:{ all -> 0x00a2 }
        r10 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x00a2 }
        r11 = new java.lang.String[r11];	 Catch:{ all -> 0x00a2 }
        r1 = 4;
        r1 = r0[r1];	 Catch:{ all -> 0x00a2 }
        r11[r4] = r1;	 Catch:{ all -> 0x00a2 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ all -> 0x00a2 }
        r11[r3] = r0;	 Catch:{ all -> 0x00a2 }
        r2.put(r10, r11);	 Catch:{ all -> 0x00a2 }
    L_0x0096:
        r10 = java.lang.Boolean.valueOf(r12);	 Catch:{ all -> 0x00a2 }
        r10 = r2.get(r10);	 Catch:{ all -> 0x00a2 }
        r10 = (java.lang.String[]) r10;	 Catch:{ all -> 0x00a2 }
        monitor-exit(r9);
        return r10;
    L_0x00a2:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
    L_0x00a5:
        monitor-exit(r9);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bctj.a(java.util.Locale, java.lang.String, boolean):java.lang.String[]");
    }

    private static HashMap a() {
        return new HashMap(7);
    }
}
