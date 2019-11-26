package defpackage;

import java.util.logging.Logger;

/* renamed from: barh */
public abstract class barh extends baqk {
    private static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final Logger l = Logger.getLogger(barh.class.getName());

    public barh(String str) {
        super(str);
    }

    public abstract bark b(baqw baqw);

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x013c  */
    public defpackage.baqy a(defpackage.baqw r20) {
        /*
        r19 = this;
        r0 = r20;
        r0 = (defpackage.baqt) r0;
        r0 = r0.h;
        r1 = "upgrade";
        r1 = r0.get(r1);
        r1 = (java.lang.String) r1;
        r2 = "connection";
        r2 = r0.get(r2);
        r2 = (java.lang.String) r2;
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x002d;
    L_0x001a:
        r2 = r2.toLowerCase();
        r5 = "Upgrade";
        r5 = r5.toLowerCase();
        r2 = r2.contains(r5);
        if (r2 != 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002d;
    L_0x002b:
        r2 = 1;
        goto L_0x002e;
    L_0x002d:
        r2 = 0;
    L_0x002e:
        r5 = "websocket";
        r1 = r5.equalsIgnoreCase(r1);
        if (r1 != 0) goto L_0x0038;
    L_0x0036:
        goto L_0x0158;
    L_0x0038:
        if (r2 == 0) goto L_0x0158;
    L_0x003a:
        r1 = "sec-websocket-version";
        r2 = r0.get(r1);
        r2 = (java.lang.String) r2;
        r5 = "13";
        r2 = r5.equalsIgnoreCase(r2);
        r5 = "text/plain";
        if (r2 != 0) goto L_0x006f;
    L_0x004c:
        r2 = defpackage.barc.BAD_REQUEST;
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
        r0 = java.lang.String.valueOf(r0);
        r1 = "Invalid Websocket-Version ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x0066;
    L_0x0060:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x006a;
    L_0x0066:
        r0 = r1.concat(r0);
    L_0x006a:
        r0 = defpackage.baqk.a(r2, r5, r0);
        return r0;
    L_0x006f:
        r1 = "sec-websocket-key";
        r2 = r0.containsKey(r1);
        if (r2 != 0) goto L_0x0080;
    L_0x0077:
        r0 = defpackage.barc.BAD_REQUEST;
        r1 = "Missing Websocket-Key";
        r0 = defpackage.baqk.a(r0, r5, r1);
        return r0;
    L_0x0080:
        r2 = r19.b(r20);
        r2 = r2.b;
        r6 = "sec-websocket-accept";
        r1 = r0.get(r1);	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r1 = (java.lang.String) r1;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r7 = "SHA-1";
        r7 = java.security.MessageDigest.getInstance(r7);	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r8 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        r9 = r8.length();	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        if (r9 != 0) goto L_0x00a6;
    L_0x00a0:
        r8 = new java.lang.String;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r8.<init>(r1);	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        goto L_0x00aa;
    L_0x00a6:
        r8 = r1.concat(r8);	 Catch:{ NoSuchAlgorithmException -> 0x014f }
    L_0x00aa:
        r1 = r8.getBytes();	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r8 = r8.length();	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r7.update(r1, r3, r8);	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r1 = r7.digest();	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r7 = r1.length;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r8 = r7 + 2;
        r8 = r8 / 3;
        r9 = 2;
        r8 = r8 << r9;
        r8 = new char[r8];	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r10 = 0;
        r11 = 0;
    L_0x00c4:
        if (r10 >= r7) goto L_0x011b;
    L_0x00c6:
        r12 = r10 + 1;
        r10 = r1[r10];	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        if (r12 >= r7) goto L_0x00d6;
    L_0x00cc:
        r13 = r12 + 1;
        r12 = r1[r12];	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r18 = r13;
        r13 = r12;
        r12 = r18;
        goto L_0x00d7;
    L_0x00d6:
        r13 = 0;
    L_0x00d7:
        if (r12 >= r7) goto L_0x00de;
    L_0x00d9:
        r14 = r12 + 1;
        r12 = r1[r12];	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        goto L_0x00e0;
    L_0x00de:
        r14 = r12;
        r12 = 0;
    L_0x00e0:
        r15 = r11 + 1;
        r16 = a;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r17 = r10 >> 2;
        r17 = r17 & 63;
        r16 = r16[r17];	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r8[r11] = r16;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r11 = r15 + 1;
        r16 = a;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r10 = r10 << 4;
        r3 = r13 & 255;
        r3 = r3 >> 4;
        r3 = r3 | r10;
        r3 = r3 & 63;
        r3 = r16[r3];	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r8[r15] = r3;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r3 = r11 + 1;
        r10 = a;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r13 = r13 << 2;
        r15 = r12 & 255;
        r15 = r15 >> 6;
        r13 = r13 | r15;
        r13 = r13 & 63;
        r10 = r10[r13];	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r8[r11] = r10;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r11 = r3 + 1;
        r10 = a;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r12 = r12 & 63;
        r10 = r10[r12];	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r8[r3] = r10;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r10 = r14;
        r3 = 0;
        goto L_0x00c4;
    L_0x011b:
        r7 = r7 % 3;
        r1 = 61;
        if (r7 == r4) goto L_0x0124;
    L_0x0121:
        if (r7 == r9) goto L_0x0128;
    L_0x0123:
        goto L_0x012c;
    L_0x0124:
        r11 = r11 + -1;
        r8[r11] = r1;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
    L_0x0128:
        r11 = r11 + -1;
        r8[r11] = r1;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
    L_0x012c:
        r1 = new java.lang.String;	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r1.<init>(r8);	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r2.a(r6, r1);	 Catch:{ NoSuchAlgorithmException -> 0x014f }
        r1 = "sec-websocket-protocol";
        r3 = r0.containsKey(r1);
        if (r3 == 0) goto L_0x014e;
    L_0x013c:
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
        r3 = ",";
        r0 = r0.split(r3);
        r3 = 0;
        r0 = r0[r3];
        r2.a(r1, r0);
    L_0x014e:
        return r2;
    L_0x014f:
        r0 = defpackage.barc.INTERNAL_ERROR;
        r1 = "The SHA-1 Algorithm required for websockets is not available on the server.";
        r0 = defpackage.baqk.a(r0, r5, r1);
        return r0;
    L_0x0158:
        r0 = super.a(r20);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.barh.a(baqw):baqy");
    }
}
