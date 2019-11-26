package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: bcsp */
final class bcsp implements bcsv, bcsz {
    private static Map a = new HashMap();
    private final bcpm b;
    private final boolean c;

    bcsp(bcpm bcpm, boolean z) {
        this.b = bcpm;
        this.c = z;
    }

    public final int a() {
        return !this.c ? 20 : 6;
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        try {
            String b;
            bcpn a = this.b.a(bcpl);
            if (this.c) {
                b = a.b(j, locale);
            } else {
                b = a.a(j, locale);
            }
            stringBuffer.append(b);
        } catch (RuntimeException unused) {
            stringBuffer.append(65533);
        }
    }

    public final int b() {
        return a();
    }

    /* JADX WARNING: Missing block: B:32:0x012f, code skipped:
            r4 = java.lang.Math.min(r18.length(), r2 + r9);
     */
    /* JADX WARNING: Missing block: B:33:0x0139, code skipped:
            if (r4 <= r2) goto L_0x015b;
     */
    /* JADX WARNING: Missing block: B:34:0x013b, code skipped:
            r7 = r18.substring(r2, r4);
     */
    /* JADX WARNING: Missing block: B:35:0x0145, code skipped:
            if (r5.contains(r7) == false) goto L_0x0158;
     */
    /* JADX WARNING: Missing block: B:36:0x0147, code skipped:
            r0.a(new defpackage.bcsx(r1.b.a(r0.a), r7, r3));
     */
    /* JADX WARNING: Missing block: B:37:0x0157, code skipped:
            return r4;
     */
    /* JADX WARNING: Missing block: B:38:0x0158, code skipped:
            r4 = r4 - 1;
     */
    /* JADX WARNING: Missing block: B:40:0x015d, code skipped:
            return r2 ^ -1;
     */
    public final int a(defpackage.bcsu r17, java.lang.String r18, int r19) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r17;
        r2 = r19;
        r3 = r0.d;
        r4 = a;
        monitor-enter(r4);
        r5 = a;	 Catch:{ all -> 0x015e }
        r5 = r5.get(r3);	 Catch:{ all -> 0x015e }
        r5 = (java.util.Map) r5;	 Catch:{ all -> 0x015e }
        if (r5 != 0) goto L_0x001f;
    L_0x0015:
        r5 = new java.util.HashMap;	 Catch:{ all -> 0x015e }
        r5.<init>();	 Catch:{ all -> 0x015e }
        r6 = a;	 Catch:{ all -> 0x015e }
        r6.put(r3, r5);	 Catch:{ all -> 0x015e }
    L_0x001f:
        r6 = r1.b;	 Catch:{ all -> 0x015e }
        r6 = r5.get(r6);	 Catch:{ all -> 0x015e }
        r6 = (java.lang.Object[]) r6;	 Catch:{ all -> 0x015e }
        r7 = 0;
        r8 = 1;
        if (r6 != 0) goto L_0x0121;
    L_0x002b:
        r6 = new java.util.HashSet;	 Catch:{ all -> 0x015e }
        r9 = 32;
        r6.<init>(r9);	 Catch:{ all -> 0x015e }
        r10 = new bcqd;	 Catch:{ all -> 0x015e }
        r11 = defpackage.bcpt.a;	 Catch:{ all -> 0x015e }
        r10.<init>(r11);	 Catch:{ all -> 0x015e }
        r11 = r1.b;	 Catch:{ all -> 0x015e }
        if (r11 == 0) goto L_0x0119;
    L_0x003d:
        r12 = r10.b;	 Catch:{ all -> 0x015e }
        r12 = r11.a(r12);	 Catch:{ all -> 0x015e }
        r13 = r12.c();	 Catch:{ all -> 0x015e }
        if (r13 == 0) goto L_0x00f3;
    L_0x0049:
        r11 = new bcqc;	 Catch:{ all -> 0x015e }
        r11.<init>(r10, r12);	 Catch:{ all -> 0x015e }
        r10 = r11.b;	 Catch:{ all -> 0x015e }
        r10 = r10.g();	 Catch:{ all -> 0x015e }
        r12 = r11.b;	 Catch:{ all -> 0x015e }
        r12 = r12.h();	 Catch:{ all -> 0x015e }
        r13 = r12 - r10;
        if (r13 <= r9) goto L_0x0062;
    L_0x005e:
        r0 = r2 ^ -1;
        monitor-exit(r4);	 Catch:{ all -> 0x015e }
        return r0;
    L_0x0062:
        r9 = r11.b;	 Catch:{ all -> 0x015e }
        r9 = r9.a(r3);	 Catch:{ all -> 0x015e }
    L_0x0068:
        if (r10 <= r12) goto L_0x00a4;
    L_0x006a:
        r10 = "en";
        r11 = r3.getLanguage();	 Catch:{ all -> 0x015e }
        r10 = r10.equals(r11);	 Catch:{ all -> 0x015e }
        if (r10 == 0) goto L_0x0091;
    L_0x0076:
        r10 = r1.b;	 Catch:{ all -> 0x015e }
        r11 = defpackage.bcpm.a;	 Catch:{ all -> 0x015e }
        if (r10 != r11) goto L_0x0091;
    L_0x007c:
        r9 = "BCE";
        r6.add(r9);	 Catch:{ all -> 0x015e }
        r9 = "bce";
        r6.add(r9);	 Catch:{ all -> 0x015e }
        r9 = "CE";
        r6.add(r9);	 Catch:{ all -> 0x015e }
        r9 = "ce";
        r6.add(r9);	 Catch:{ all -> 0x015e }
        r9 = 3;
    L_0x0091:
        r10 = 2;
        r10 = new java.lang.Object[r10];	 Catch:{ all -> 0x015e }
        r10[r7] = r6;	 Catch:{ all -> 0x015e }
        r7 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x015e }
        r10[r8] = r7;	 Catch:{ all -> 0x015e }
        r7 = r1.b;	 Catch:{ all -> 0x015e }
        r5.put(r7, r10);	 Catch:{ all -> 0x015e }
        r5 = r6;
        goto L_0x012e;
    L_0x00a4:
        r13 = r11.a;	 Catch:{ all -> 0x015e }
        r14 = r11.b;	 Catch:{ all -> 0x015e }
        r15 = r9;
        r8 = r13.a;	 Catch:{ all -> 0x015e }
        r8 = r14.b(r8, r10);	 Catch:{ all -> 0x015e }
        r14 = r13.b;	 Catch:{ all -> 0x015e }
        r13.a = r8;	 Catch:{ all -> 0x015e }
        r8 = r11.b(r3);	 Catch:{ all -> 0x015e }
        r6.add(r8);	 Catch:{ all -> 0x015e }
        r8 = r11.b(r3);	 Catch:{ all -> 0x015e }
        r8 = r8.toLowerCase(r3);	 Catch:{ all -> 0x015e }
        r6.add(r8);	 Catch:{ all -> 0x015e }
        r8 = r11.b(r3);	 Catch:{ all -> 0x015e }
        r8 = r8.toUpperCase(r3);	 Catch:{ all -> 0x015e }
        r6.add(r8);	 Catch:{ all -> 0x015e }
        r8 = r11.a(r3);	 Catch:{ all -> 0x015e }
        r6.add(r8);	 Catch:{ all -> 0x015e }
        r8 = r11.a(r3);	 Catch:{ all -> 0x015e }
        r8 = r8.toLowerCase(r3);	 Catch:{ all -> 0x015e }
        r6.add(r8);	 Catch:{ all -> 0x015e }
        r8 = r11.a(r3);	 Catch:{ all -> 0x015e }
        r8 = r8.toUpperCase(r3);	 Catch:{ all -> 0x015e }
        r6.add(r8);	 Catch:{ all -> 0x015e }
        r10 = r10 + 1;
        r9 = r15;
        r8 = 1;
        goto L_0x0068;
    L_0x00f3:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x015e }
        r2 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x015e }
        r3 = r2.length();	 Catch:{ all -> 0x015e }
        r3 = r3 + 25;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x015e }
        r5.<init>(r3);	 Catch:{ all -> 0x015e }
        r3 = "Field '";
        r5.append(r3);	 Catch:{ all -> 0x015e }
        r5.append(r2);	 Catch:{ all -> 0x015e }
        r2 = "' is not supported";
        r5.append(r2);	 Catch:{ all -> 0x015e }
        r2 = r5.toString();	 Catch:{ all -> 0x015e }
        r0.<init>(r2);	 Catch:{ all -> 0x015e }
        throw r0;	 Catch:{ all -> 0x015e }
    L_0x0119:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x015e }
        r2 = "The DateTimeFieldType must not be null";
        r0.<init>(r2);	 Catch:{ all -> 0x015e }
        throw r0;	 Catch:{ all -> 0x015e }
    L_0x0121:
        r5 = r6[r7];	 Catch:{ all -> 0x015e }
        r5 = (java.util.Set) r5;	 Catch:{ all -> 0x015e }
        r7 = 1;
        r6 = r6[r7];	 Catch:{ all -> 0x015e }
        r6 = (java.lang.Integer) r6;	 Catch:{ all -> 0x015e }
        r9 = r6.intValue();	 Catch:{ all -> 0x015e }
    L_0x012e:
        monitor-exit(r4);	 Catch:{ all -> 0x015e }
        r4 = r18.length();
        r6 = r2 + r9;
        r4 = java.lang.Math.min(r4, r6);
    L_0x0139:
        if (r4 <= r2) goto L_0x015b;
    L_0x013b:
        r6 = r18;
        r7 = r6.substring(r2, r4);
        r8 = r5.contains(r7);
        if (r8 == 0) goto L_0x0158;
    L_0x0147:
        r2 = r1.b;
        r5 = new bcsx;
        r6 = r0.a;
        r2 = r2.a(r6);
        r5.<init>(r2, r7, r3);
        r0.a(r5);
        return r4;
    L_0x0158:
        r4 = r4 + -1;
        goto L_0x0139;
    L_0x015b:
        r0 = r2 ^ -1;
        return r0;
    L_0x015e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x015e }
        goto L_0x0162;
    L_0x0161:
        throw r0;
    L_0x0162:
        goto L_0x0161;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcsp.a(bcsu, java.lang.String, int):int");
    }
}
