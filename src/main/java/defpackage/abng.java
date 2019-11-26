package defpackage;

import java.util.regex.Pattern;

/* renamed from: abng */
public final class abng implements aboi {
    private static final int[] c = new int[]{271};
    private static final Pattern d = Pattern.compile("^\\s+");
    private static final Pattern e = Pattern.compile("\\s{2,}");
    private final abnd a;
    private final abnh b;

    public abng(abnd abnd, abnh abnh) {
        this.a = (abnd) amqw.a((Object) abnd);
        this.b = (abnh) amqw.a((Object) abnh);
    }

    /* JADX WARNING: Missing block: B:113:?, code skipped:
            defpackage.azyg.a(r15, r2);
     */
    public final defpackage.abnp a(defpackage.abod r15) {
        /*
        r14 = this;
        r0 = r14.b;
        r0.a();
        monitor-enter(r0);
        r1 = r0.c;	 Catch:{ all -> 0x0293 }
        r1 = defpackage.amqp.c(r1);	 Catch:{ all -> 0x0293 }
        monitor-exit(r0);	 Catch:{ all -> 0x0293 }
        r0 = r1.a();
        if (r0 != 0) goto L_0x0016;
    L_0x0013:
        r15 = defpackage.abnp.d;
        return r15;
    L_0x0016:
        r0 = r14.a;
        r0 = r0.f();
        r2 = r15.b;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x002c;
    L_0x0024:
        r2 = new java.util.Locale;
        r3 = r15.b;
        r2.<init>(r3);
        goto L_0x002e;
    L_0x002c:
        r2 = java.util.Locale.ENGLISH;
    L_0x002e:
        r3 = r0.a();
        if (r3 == 0) goto L_0x0290;
    L_0x0034:
        r3 = r2.getLanguage();
        r4 = new java.util.Locale;
        r0 = r0.b();
        r0 = (java.lang.String) r0;
        r4.<init>(r0);
        r0 = r4.getLanguage();
        r0 = r3.equals(r0);
        if (r0 != 0) goto L_0x004f;
    L_0x004d:
        goto L_0x0290;
    L_0x004f:
        r0 = r1.b();
        r0 = (defpackage.azyg) r0;
        r1 = e;
        r3 = d;
        r15 = r15.d;
        r15 = r3.matcher(r15);
        r3 = "";
        r15 = r15.replaceAll(r3);
        r15 = r1.matcher(r15);
        r1 = " ";
        r15 = r15.replaceAll(r1);
        r15 = r15.toLowerCase(r2);
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r15.isEmpty();
        r3 = 0;
        if (r2 != 0) goto L_0x025e;
    L_0x007f:
        r2 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x025e }
        r4 = r0.b;	 Catch:{ IOException -> 0x025e }
        r5 = "r";
        r2.<init>(r4, r5);	 Catch:{ IOException -> 0x025e }
        r4 = 2;
        r5 = 0;
        r8 = r5;
        r4 = 0;
        r6 = 0;
        r7 = 2;
        r9 = 0;
    L_0x008f:
        r10 = r15.length();	 Catch:{ all -> 0x0257 }
        r11 = 1;
        if (r4 >= r10) goto L_0x010b;
    L_0x0096:
        if (r6 != 0) goto L_0x0109;
    L_0x0098:
        r12 = (long) r7;	 Catch:{ all -> 0x0257 }
        r2.seek(r12);	 Catch:{ all -> 0x0257 }
        r8 = r0.a;	 Catch:{ all -> 0x0257 }
        r8 = r8.b;	 Catch:{ all -> 0x0257 }
        r8 = defpackage.azyg.a(r8, r2);	 Catch:{ all -> 0x0257 }
        r8 = r8 & r11;
        if (r8 == r11) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00af;
    L_0x00a8:
        r8 = r0.a;	 Catch:{ all -> 0x0257 }
        r8 = r8.b;	 Catch:{ all -> 0x0257 }
        r2.skipBytes(r8);	 Catch:{ all -> 0x0257 }
    L_0x00af:
        r8 = defpackage.azyg.a(r2);	 Catch:{ all -> 0x0257 }
        if (r8 != 0) goto L_0x00b7;
    L_0x00b5:
        r8 = r5;
        goto L_0x00ea;
    L_0x00b7:
        r6 = defpackage.azyg.a(r11, r2);	 Catch:{ all -> 0x0257 }
        r10 = r6 & 1;
        r10 = r10 ^ r11;
        if (r10 != 0) goto L_0x00d0;
    L_0x00c0:
        r7 = r0.a;	 Catch:{ all -> 0x0257 }
        r7 = r7.a;	 Catch:{ all -> 0x0257 }
        r7 = r7 + -1;
        r7 = defpackage.azyg.a(r7, r2);	 Catch:{ all -> 0x0257 }
        r7 = r7 << 8;
        r6 = r6 | r7;
        r6 = r6 >>> r11;
        r7 = r6;
        goto L_0x00df;
    L_0x00d0:
        r9 = r0.a;	 Catch:{ all -> 0x0257 }
        r9 = r9.b;	 Catch:{ all -> 0x0257 }
        r9 = r9 + -1;
        r9 = defpackage.azyg.a(r9, r2);	 Catch:{ all -> 0x0257 }
        r9 = r9 << 8;
        r6 = r6 | r9;
        r6 = r6 >>> r11;
        r9 = r6;
    L_0x00df:
        r6 = r15.codePointAt(r4);	 Catch:{ all -> 0x0257 }
        r12 = r8.codePointAt(r3);	 Catch:{ all -> 0x0257 }
        if (r6 != r12) goto L_0x0107;
    L_0x00e9:
        r6 = r10;
    L_0x00ea:
        if (r8 == 0) goto L_0x0109;
    L_0x00ec:
        r10 = r15.substring(r4);	 Catch:{ all -> 0x0257 }
        r10 = r10.startsWith(r8);	 Catch:{ all -> 0x0257 }
        if (r10 != 0) goto L_0x0101;
    L_0x00f6:
        r10 = r15.substring(r4);	 Catch:{ all -> 0x0257 }
        r10 = r8.startsWith(r10);	 Catch:{ all -> 0x0257 }
        if (r10 != 0) goto L_0x0101;
    L_0x0100:
        goto L_0x0109;
    L_0x0101:
        r10 = r8.length();	 Catch:{ all -> 0x0257 }
        r4 = r4 + r10;
        goto L_0x008f;
    L_0x0107:
        r6 = r10;
        goto L_0x00af;
    L_0x0109:
        r10 = r5;
        goto L_0x015a;
    L_0x010b:
        r10 = new azyj;	 Catch:{ all -> 0x0257 }
        r10.<init>(r3);	 Catch:{ all -> 0x0257 }
        r12 = r8.length();	 Catch:{ all -> 0x0257 }
        r13 = r15.length();	 Catch:{ all -> 0x0257 }
        r4 = r4 - r13;
        r12 = r12 - r4;
        r4 = r8.substring(r12);	 Catch:{ all -> 0x0257 }
        r8 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0257 }
        r12 = r8.length();	 Catch:{ all -> 0x0257 }
        if (r12 != 0) goto L_0x012e;
    L_0x0128:
        r8 = new java.lang.String;	 Catch:{ all -> 0x0257 }
        r8.<init>(r15);	 Catch:{ all -> 0x0257 }
        goto L_0x0132;
    L_0x012e:
        r8 = r15.concat(r8);	 Catch:{ all -> 0x0257 }
    L_0x0132:
        r10.a = r8;	 Catch:{ all -> 0x0257 }
        if (r6 != 0) goto L_0x0138;
    L_0x0136:
        r15 = 0;
        goto L_0x0139;
    L_0x0138:
        r15 = 1;
    L_0x0139:
        r10.b = r15;	 Catch:{ all -> 0x0257 }
        r10.d = r7;	 Catch:{ all -> 0x0257 }
        if (r6 != 0) goto L_0x014f;
    L_0x013f:
        r6 = (long) r7;	 Catch:{ all -> 0x0257 }
        r2.seek(r6);	 Catch:{ all -> 0x0257 }
        r15 = r0.a;	 Catch:{ all -> 0x0257 }
        r15 = r15.b;	 Catch:{ all -> 0x0257 }
        r15 = defpackage.azyg.a(r15, r2);	 Catch:{ all -> 0x0257 }
        r15 = r15 >>> r11;
        r10.c = r15;	 Catch:{ all -> 0x0257 }
        goto L_0x0151;
    L_0x014f:
        r10.c = r9;	 Catch:{ all -> 0x0257 }
    L_0x0151:
        r15 = r4.isEmpty();	 Catch:{ all -> 0x0257 }
        if (r15 != 0) goto L_0x015a;
    L_0x0157:
        r4.codePointAt(r3);	 Catch:{ all -> 0x0257 }
    L_0x015a:
        if (r10 == 0) goto L_0x0253;
    L_0x015c:
        r15 = new java.util.ArrayList;	 Catch:{ all -> 0x0257 }
        r15.<init>();	 Catch:{ all -> 0x0257 }
        r15.add(r10);	 Catch:{ all -> 0x0257 }
    L_0x0164:
        r4 = 0;
    L_0x0165:
        r6 = r15.size();	 Catch:{ all -> 0x0257 }
        if (r4 >= r6) goto L_0x0186;
    L_0x016b:
        r6 = r15.get(r4);	 Catch:{ all -> 0x0257 }
        r6 = (defpackage.azyj) r6;	 Catch:{ all -> 0x0257 }
        r6 = r6.b;	 Catch:{ all -> 0x0257 }
        if (r6 == 0) goto L_0x0178;
    L_0x0175:
        r4 = r4 + 1;
        goto L_0x0165;
    L_0x0178:
        r6 = r15.get(r4);	 Catch:{ all -> 0x0257 }
        r6 = (defpackage.azyj) r6;	 Catch:{ all -> 0x0257 }
        r15.remove(r4);	 Catch:{ all -> 0x0257 }
        r7 = r0.c;	 Catch:{ all -> 0x0257 }
        r4 = r7 - r4;
        goto L_0x0188;
    L_0x0186:
        r6 = r5;
        r4 = 0;
    L_0x0188:
        if (r6 == 0) goto L_0x023d;
    L_0x018a:
        r7 = r6.d;	 Catch:{ all -> 0x0257 }
        r7 = (long) r7;	 Catch:{ all -> 0x0257 }
        r2.seek(r7);	 Catch:{ all -> 0x0257 }
        r7 = r0.a;	 Catch:{ all -> 0x0257 }
        r7 = r7.b;	 Catch:{ all -> 0x0257 }
        r7 = defpackage.azyg.a(r7, r2);	 Catch:{ all -> 0x0257 }
        r7 = r7 & r11;
        if (r7 != r11) goto L_0x01b3;
    L_0x019b:
        r7 = new azyj;	 Catch:{ all -> 0x0257 }
        r7.<init>(r3);	 Catch:{ all -> 0x0257 }
        r8 = r6.a;	 Catch:{ all -> 0x0257 }
        r7.a = r8;	 Catch:{ all -> 0x0257 }
        r8 = r0.a;	 Catch:{ all -> 0x0257 }
        r8 = r8.b;	 Catch:{ all -> 0x0257 }
        r8 = defpackage.azyg.a(r8, r2);	 Catch:{ all -> 0x0257 }
        r7.c = r8;	 Catch:{ all -> 0x0257 }
        r7.b = r11;	 Catch:{ all -> 0x0257 }
        r0.a(r15, r7);	 Catch:{ all -> 0x0257 }
    L_0x01b3:
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x0257 }
        r7.<init>();	 Catch:{ all -> 0x0257 }
    L_0x01b8:
        if (r4 <= 0) goto L_0x0214;
    L_0x01ba:
        r8 = defpackage.azyg.a(r2);	 Catch:{ all -> 0x0257 }
        if (r8 == 0) goto L_0x0214;
    L_0x01c0:
        r9 = new azyj;	 Catch:{ all -> 0x0257 }
        r9.<init>(r3);	 Catch:{ all -> 0x0257 }
        r10 = r6.a;	 Catch:{ all -> 0x0257 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0257 }
        r12 = r8.length();	 Catch:{ all -> 0x0257 }
        if (r12 != 0) goto L_0x01d7;
    L_0x01d1:
        r8 = new java.lang.String;	 Catch:{ all -> 0x0257 }
        r8.<init>(r10);	 Catch:{ all -> 0x0257 }
        goto L_0x01db;
    L_0x01d7:
        r8 = r10.concat(r8);	 Catch:{ all -> 0x0257 }
    L_0x01db:
        r9.a = r8;	 Catch:{ all -> 0x0257 }
        r8 = defpackage.azyg.a(r11, r2);	 Catch:{ all -> 0x0257 }
        r10 = r8 & 1;
        r10 = r10 ^ r11;
        if (r10 == 0) goto L_0x01f7;
    L_0x01e6:
        r12 = r0.a;	 Catch:{ all -> 0x0257 }
        r12 = r12.b;	 Catch:{ all -> 0x0257 }
        r12 = r12 + -1;
        r12 = defpackage.azyg.a(r12, r2);	 Catch:{ all -> 0x0257 }
        r12 = r12 << 8;
        r8 = r8 | r12;
        r8 = r8 >>> r11;
        r9.c = r8;	 Catch:{ all -> 0x0257 }
        goto L_0x0207;
    L_0x01f7:
        r12 = r0.a;	 Catch:{ all -> 0x0257 }
        r12 = r12.a;	 Catch:{ all -> 0x0257 }
        r12 = r12 + -1;
        r12 = defpackage.azyg.a(r12, r2);	 Catch:{ all -> 0x0257 }
        r12 = r12 << 8;
        r8 = r8 | r12;
        r8 = r8 >>> r11;
        r9.d = r8;	 Catch:{ all -> 0x0257 }
    L_0x0207:
        if (r10 != 0) goto L_0x020b;
    L_0x0209:
        r8 = 0;
        goto L_0x020c;
    L_0x020b:
        r8 = 1;
    L_0x020c:
        r9.b = r8;	 Catch:{ all -> 0x0257 }
        r7.add(r9);	 Catch:{ all -> 0x0257 }
        r4 = r4 + -1;
        goto L_0x01b8;
    L_0x0214:
        r4 = r7.iterator();	 Catch:{ all -> 0x0257 }
    L_0x0218:
        r6 = r4.hasNext();	 Catch:{ all -> 0x0257 }
        if (r6 == 0) goto L_0x0164;
    L_0x021e:
        r6 = r4.next();	 Catch:{ all -> 0x0257 }
        r6 = (defpackage.azyj) r6;	 Catch:{ all -> 0x0257 }
        r7 = r6.b;	 Catch:{ all -> 0x0257 }
        if (r7 != 0) goto L_0x0239;
    L_0x0228:
        r7 = r6.d;	 Catch:{ all -> 0x0257 }
        r7 = (long) r7;	 Catch:{ all -> 0x0257 }
        r2.seek(r7);	 Catch:{ all -> 0x0257 }
        r7 = r0.a;	 Catch:{ all -> 0x0257 }
        r7 = r7.b;	 Catch:{ all -> 0x0257 }
        r7 = defpackage.azyg.a(r7, r2);	 Catch:{ all -> 0x0257 }
        r7 = r7 >>> r11;
        r6.c = r7;	 Catch:{ all -> 0x0257 }
    L_0x0239:
        r0.a(r15, r6);	 Catch:{ all -> 0x0257 }
        goto L_0x0218;
    L_0x023d:
        r15 = r15.iterator();	 Catch:{ all -> 0x0257 }
    L_0x0241:
        r0 = r15.hasNext();	 Catch:{ all -> 0x0257 }
        if (r0 == 0) goto L_0x0253;
    L_0x0247:
        r0 = r15.next();	 Catch:{ all -> 0x0257 }
        r0 = (defpackage.azyj) r0;	 Catch:{ all -> 0x0257 }
        r0 = r0.a;	 Catch:{ all -> 0x0257 }
        r1.add(r0);	 Catch:{ all -> 0x0257 }
        goto L_0x0241;
    L_0x0253:
        defpackage.azyg.a(r5, r2);	 Catch:{ IOException -> 0x025e }
        goto L_0x025e;
    L_0x0257:
        r15 = move-exception;
        throw r15;	 Catch:{ all -> 0x0259 }
    L_0x0259:
        r0 = move-exception;
        defpackage.azyg.a(r15, r2);	 Catch:{ IOException -> 0x025e }
        throw r0;	 Catch:{ IOException -> 0x025e }
    L_0x025e:
        r15 = new java.util.ArrayList;
        r15.<init>();
        r0 = r1.size();
    L_0x0267:
        if (r3 >= r0) goto L_0x027e;
    L_0x0269:
        r2 = r1.get(r3);
        r2 = (java.lang.String) r2;
        r4 = new abnv;
        r5 = defpackage.abnv.l;
        r6 = c;
        r4.<init>(r2, r5, r6);
        r15.add(r4);
        r3 = r3 + 1;
        goto L_0x0267;
    L_0x027e:
        r0 = new abnp;
        r1 = r14.a;
        r1 = r1.b();
        r2 = r14.a;
        r2 = r2.g();
        r0.<init>(r15, r1, r2);
        return r0;
    L_0x0290:
        r15 = defpackage.abnp.d;
        return r15;
    L_0x0293:
        r15 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0293 }
        goto L_0x0297;
    L_0x0296:
        throw r15;
    L_0x0297:
        goto L_0x0296;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abng.a(abod):abnp");
    }
}
