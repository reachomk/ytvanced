package defpackage;

import android.media.MediaDrmException;
import android.media.UnsupportedSchemeException;
import android.net.Uri;
import java.util.List;

/* renamed from: aerq */
final class aerq {
    private final String a;
    private final afhg b;
    private final bcaa c;
    private final aetb d;
    private final afqv e;
    private Boolean f;

    aerq(String str, afhg afhg, bcaa bcaa, aetb aetb, afqv afqv) {
        this.a = str;
        this.b = afhg;
        this.c = bcaa;
        this.d = (aetb) amqw.a((Object) aetb);
        this.e = afqv;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        if (this.f == null) {
            try {
                this.f = Boolean.valueOf("L1".equals(new nqk(aers.a).a("securityLevel")));
            } catch (UnsupportedSchemeException unused) {
                this.f = Boolean.valueOf(false);
            }
        }
        return this.f.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A:{Splitter:B:1:0x0004, ExcHandler: aeti (r0_9 'e' aeti)} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053 A:{Splitter:B:1:0x0004, ExcHandler: DeniedByServerException (r0_5 'e' android.media.DeniedByServerException)} */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A:{Splitter:B:1:0x0004, ExcHandler: Exception (r0_4 'e' java.lang.Exception)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:7:0x002d, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:8:0x002f, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:9:0x0030, code skipped:
            r1 = java.lang.String.valueOf(r0.getMessage());
            r2 = "MediaDrm threw unexpected exception ";
     */
    /* JADX WARNING: Missing block: B:10:0x003e, code skipped:
            if (r1.length() == 0) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:11:0x0040, code skipped:
            r1 = new java.lang.String(r2);
     */
    /* JADX WARNING: Missing block: B:12:0x0046, code skipped:
            r1 = r2.concat(r1);
     */
    /* JADX WARNING: Missing block: B:13:0x004a, code skipped:
            defpackage.xtl.d(r1);
     */
    /* JADX WARNING: Missing block: B:14:0x0052, code skipped:
            throw new defpackage.aesk(r0);
     */
    /* JADX WARNING: Missing block: B:15:0x0053, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:17:0x0059, code skipped:
            throw new defpackage.aesk(r0);
     */
    /* JADX WARNING: Missing block: B:21:0x005f, code skipped:
            r7 = r25;
            a(r3, r7);
     */
    /* JADX WARNING: Missing block: B:22:0x0077, code skipped:
            return a(r20, r21, r22, r23, r24, r7, r26, false);
     */
    /* JADX WARNING: Missing block: B:24:0x007d, code skipped:
            throw new defpackage.aeso(r0);
     */
    /* JADX WARNING: Missing block: B:25:0x007e, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:27:0x0084, code skipped:
            throw new defpackage.aesm(r0);
     */
    private final android.util.Pair a(android.net.Uri r20, defpackage.nqb r21, byte[] r22, defpackage.nqd r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27) {
        /*
        r19 = this;
        r10 = r19;
        r3 = r21;
        r11 = r10.d;	 Catch:{ aeti -> 0x007e, NotProvisionedException -> 0x005a, DeniedByServerException -> 0x0053, Exception -> 0x002f }
        r13 = r23.a();	 Catch:{ aeti -> 0x007e, NotProvisionedException -> 0x005a, DeniedByServerException -> 0x0053, Exception -> 0x002f }
        r16 = "";
        r18 = 0;
        r12 = r20;
        r14 = r24;
        r15 = r25;
        r17 = r26;
        r0 = r11.a(r12, r13, r14, r15, r16, r17, r18);	 Catch:{ aeti -> 0x007e, NotProvisionedException -> 0x005a, DeniedByServerException -> 0x0053, Exception -> 0x002f }
        r1 = r0.a();	 Catch:{ aeti -> 0x007e, NotProvisionedException -> 0x005a, DeniedByServerException -> 0x0053, Exception -> 0x002f }
        r4 = r22;
        r1 = r3.a(r4, r1);	 Catch:{ aeti -> 0x007e, NotProvisionedException -> 0x002d, DeniedByServerException -> 0x0053, Exception -> 0x002f }
        r0 = r0.b();	 Catch:{ aeti -> 0x007e, NotProvisionedException -> 0x002d, DeniedByServerException -> 0x0053, Exception -> 0x002f }
        r0 = android.util.Pair.create(r1, r0);	 Catch:{ aeti -> 0x007e, NotProvisionedException -> 0x002d, DeniedByServerException -> 0x0053, Exception -> 0x002f }
        return r0;
    L_0x002d:
        r0 = move-exception;
        goto L_0x005d;
    L_0x002f:
        r0 = move-exception;
        r1 = r0.getMessage();
        r1 = java.lang.String.valueOf(r1);
        r2 = "MediaDrm threw unexpected exception ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0046;
    L_0x0040:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x004a;
    L_0x0046:
        r1 = r2.concat(r1);
    L_0x004a:
        defpackage.xtl.d(r1);
        r1 = new aesk;
        r1.<init>(r0);
        throw r1;
    L_0x0053:
        r0 = move-exception;
        r1 = new aesk;
        r1.<init>(r0);
        throw r1;
    L_0x005a:
        r0 = move-exception;
        r4 = r22;
    L_0x005d:
        if (r27 == 0) goto L_0x0078;
    L_0x005f:
        r7 = r25;
        r10.a(r3, r7);
        r9 = 0;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = r22;
        r5 = r23;
        r6 = r24;
        r8 = r26;
        r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9);
        return r0;
    L_0x0078:
        r1 = new aeso;
        r1.<init>(r0);
        throw r1;
    L_0x007e:
        r0 = move-exception;
        r1 = new aesm;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aerq.a(android.net.Uri, nqb, byte[], nqd, java.lang.String, java.lang.String, java.lang.String, boolean):android.util.Pair");
    }

    private final void a(nqb nqb, String str) {
        try {
            nqi b = nqb.b();
            nqb.b(this.d.a(Uri.parse(b.b()), b.a(), str));
        } catch (MediaDrmException e) {
            xtl.d("Error occurred while provisioning.");
            throw new aesk(e);
        } catch (aeti e2) {
            xtl.d("License Server error occurred while provisioning.");
            throw new aesm(e2);
        }
    }

    public final void a(String str, int i, Uri uri, List list, String str2, String str3) {
        a(str, i, uri, list, str2, str3, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121 A:{SYNTHETIC, Splitter:B:54:0x0121} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0235  */
    private final void a(java.lang.String r25, int r26, android.net.Uri r27, java.util.List r28, java.lang.String r29, java.lang.String r30, boolean r31) {
        /*
        r24 = this;
        r10 = r24;
        r11 = r25;
        r3 = r26;
        r5 = r28;
        r7 = r29;
        r1 = "of videoId ";
        r0 = 0;
        r2 = 1;
        if (r5 == 0) goto L_0x0012;
    L_0x0010:
        r4 = 1;
        goto L_0x0016;
    L_0x0012:
        if (r3 == 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0010;
    L_0x0015:
        r4 = 0;
    L_0x0016:
        defpackage.amqw.b(r4);
        r4 = 2;
        if (r7 == 0) goto L_0x001e;
    L_0x001c:
        r6 = 1;
        goto L_0x0022;
    L_0x001e:
        if (r3 != r4) goto L_0x0021;
    L_0x0020:
        goto L_0x001c;
    L_0x0021:
        r6 = 0;
    L_0x0022:
        defpackage.amqw.b(r6);
        if (r3 != r4) goto L_0x002a;
    L_0x0027:
        r6 = "unpinning";
        goto L_0x0031;
    L_0x002a:
        if (r3 == r2) goto L_0x002f;
    L_0x002c:
        r6 = "acquiring";
        goto L_0x0031;
    L_0x002f:
        r6 = "renewing";
    L_0x0031:
        r8 = 3;
        r9 = 0;
        if (r3 == 0) goto L_0x005d;
    L_0x0035:
        r0 = r10.c;
        r0 = r0.get();
        r0 = (defpackage.aese) r0;
        r0 = r0.a(r11);
        if (r0 == 0) goto L_0x0052;
    L_0x0043:
        r12 = r0.a;
        r13 = r0.c;
        r14 = r0.b;
        r0 = r0.g;
        r23 = r14;
        r14 = r0;
        r0 = r23;
        goto L_0x00e5;
    L_0x0052:
        r0 = "Offline DRM data is null";
        defpackage.xtl.d(r0);
        r0 = new aesf;
        r0.<init>();
        throw r0;
    L_0x005d:
        r12 = r5.get(r0);
        r12 = (defpackage.aahr) r12;
        r12 = r12.z();
        defpackage.amqw.b(r12);
        r12 = r5.get(r0);
        r12 = (defpackage.aahr) r12;
        r13 = defpackage.aajj.b;
        r13 = defpackage.aexb.a(r12, r7, r13);
        r14 = r13.f;
        r15 = new nvq;
        r0 = r13.g;
        r2 = r14.a;
        r4 = r14.b;
        r14 = r13.e;
        r22 = r15;
        r16 = r0;
        r17 = r2;
        r19 = r4;
        r21 = r14;
        r15.<init>(r16, r17, r19, r21);
        r0 = r12.e();
        r2 = "video/webm";
        r2 = r0.startsWith(r2);
        if (r2 != 0) goto L_0x00a9;
    L_0x009b:
        r2 = "audio/webm";
        r0 = r0.startsWith(r2);
        if (r0 != 0) goto L_0x00a9;
    L_0x00a3:
        r0 = new nsr;
        r0.<init>();
        goto L_0x00ae;
    L_0x00a9:
        r0 = new nuz;
        r0.<init>();
    L_0x00ae:
        r2 = new nnx;
        r2.<init>(r0);
        r0 = new nop;
        r3 = new afiw;
        r4 = r10.b;
        r4 = r4.a();
        r3.<init>(r4);
        r4 = r13.b;
        r5 = r22;
        r0.<init>(r3, r5, r4, r2);
        r2 = 0;
    L_0x00c8:
        if (r2 >= r8) goto L_0x00d3;
    L_0x00ca:
        r0.f();	 Catch:{ IOException | InterruptedException -> 0x00d0, IOException | InterruptedException -> 0x00d0 }
        r0 = r0.b;
        goto L_0x00d4;
    L_0x00d0:
        r2 = r2 + 1;
        goto L_0x00c8;
    L_0x00d3:
        r0 = r9;
    L_0x00d4:
        if (r0 == 0) goto L_0x02d4;
    L_0x00d6:
        r2 = defpackage.aers.a;
        r0 = r0.a(r2);
        r2 = r0.a;
        r0 = r0.b;
        r14 = r30;
        r13 = r0;
        r0 = r2;
        r12 = r9;
    L_0x00e5:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 21;
        if (r2 >= r3) goto L_0x00f8;
    L_0x00eb:
        r2 = defpackage.aers.a;
        r2 = defpackage.nsv.a(r13, r2);
        if (r2 == 0) goto L_0x00f8;
    L_0x00f3:
        r3 = r26;
        r17 = r2;
        goto L_0x00fc;
    L_0x00f8:
        r3 = r26;
        r17 = r13;
    L_0x00fc:
        r2 = 2;
        if (r3 == r2) goto L_0x0100;
    L_0x00ff:
        goto L_0x0102;
    L_0x0100:
        if (r12 == 0) goto L_0x02ab;
    L_0x0102:
        r2 = new java.util.HashMap;
        r4 = 1;
        r2.<init>(r4);
        r4 = r10.a;
        r5 = "aid";
        r2.put(r5, r4);
        r5 = new nqk;	 Catch:{ UnsupportedSchemeException -> 0x027c }
        r4 = defpackage.aers.a;	 Catch:{ UnsupportedSchemeException -> 0x027c }
        r5.<init>(r4);	 Catch:{ UnsupportedSchemeException -> 0x027c }
        r4 = " video ";
        r15 = 2;
        if (r3 != r15) goto L_0x0121;
    L_0x011b:
        r16 = r12;
        r19 = 3;
        r12 = r9;
        goto L_0x0155;
    L_0x0121:
        r9 = r5.a();	 Catch:{ NotProvisionedException -> 0x022d, ResourceBusyException -> 0x01f8, Exception -> 0x01c4 }
        r8 = 1;
        if (r3 != r8) goto L_0x0150;
    L_0x0128:
        r5.b(r9, r12);	 Catch:{ NotProvisionedException -> 0x022d, ResourceBusyException -> 0x01f8, Exception -> 0x01c4 }
        r8 = "PrivacyMode: ";
        r12 = "privacyMode";
        r12 = r5.a(r12);	 Catch:{ NotProvisionedException -> 0x022d, ResourceBusyException -> 0x01f8, Exception -> 0x01c4 }
        r12 = java.lang.String.valueOf(r12);	 Catch:{ NotProvisionedException -> 0x022d, ResourceBusyException -> 0x01f8, Exception -> 0x01c4 }
        r15 = r12.length();	 Catch:{ NotProvisionedException -> 0x022d, ResourceBusyException -> 0x01f8, Exception -> 0x01c4 }
        if (r15 != 0) goto L_0x0143;
    L_0x013d:
        r12 = new java.lang.String;	 Catch:{ NotProvisionedException -> 0x022d, ResourceBusyException -> 0x01f8, Exception -> 0x01c4 }
        r12.<init>(r8);	 Catch:{ NotProvisionedException -> 0x022d, ResourceBusyException -> 0x01f8, Exception -> 0x01c4 }
        goto L_0x0150;
    L_0x0143:
        r8.concat(r12);	 Catch:{ NotProvisionedException -> 0x022d, ResourceBusyException -> 0x01f8, Exception -> 0x01c4 }
        goto L_0x0150;
    L_0x0147:
        r15 = r5;
        goto L_0x01c6;
    L_0x014a:
        r15 = r5;
        goto L_0x01fb;
    L_0x014d:
        r15 = r5;
        goto L_0x0230;
    L_0x0150:
        r12 = r9;
        r16 = r12;
        r19 = 2;
    L_0x0155:
        r15 = r5;
        r18 = r0;
        r20 = r2;
        r8 = r15.a(r16, r17, r18, r19, r20);	 Catch:{ NotProvisionedException -> 0x01c0, ResourceBusyException -> 0x01bc, Exception -> 0x01b8 }
        r6.length();	 Catch:{ NotProvisionedException -> 0x01c0, ResourceBusyException -> 0x01bc, Exception -> 0x01b8 }
        r1 = 2;
        if (r3 != r1) goto L_0x0181;
    L_0x0164:
        r0 = r8.a();
        r1 = "widevine";
        r0 = defpackage.afqv.a(r0, r1);
        r15 = r27;
        r0.a(r15);
        r1 = new aesq;
        r1.<init>();
        r2 = r10.e;
        r3 = defpackage.aftp.a;
        r2.a(r1, r0, r3);
        r15 = r5;
        goto L_0x01b4;
    L_0x0181:
        r15 = r27;
        r9 = 1;
        r1 = r24;
        r2 = r27;
        r3 = r5;
        r4 = r12;
        r6 = r5;
        r5 = r8;
        r8 = r6;
        r6 = r25;
        r7 = r29;
        r15 = r8;
        r8 = r14;
        r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9);
        r2 = r1.first;
        r5 = r2;
        r5 = (byte[]) r5;
        r1 = r1.second;
        r7 = r1;
        r7 = (java.util.List) r7;
        r1 = r10.c;
        r1 = r1.get();
        r1 = (defpackage.aese) r1;
        r6 = r27.toString();
        r2 = r25;
        r3 = r0;
        r4 = r13;
        r1.a(r2, r3, r4, r5, r6, r7, r8);
    L_0x01b4:
        defpackage.aerq.a(r15, r12);
        return;
    L_0x01b8:
        r0 = move-exception;
        r15 = r5;
        r9 = r12;
        goto L_0x01c6;
    L_0x01bc:
        r0 = move-exception;
        r15 = r5;
        r9 = r12;
        goto L_0x01fb;
    L_0x01c0:
        r0 = move-exception;
        r15 = r5;
        r9 = r12;
        goto L_0x0230;
    L_0x01c4:
        r0 = move-exception;
        goto L_0x0147;
    L_0x01c6:
        r1 = r6.length();
        r2 = java.lang.String.valueOf(r25);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r1 = r1 + 75;
        r1 = r1 + r2;
        r3.<init>(r1);
        r1 = "Unknown exception while trying to restore a previous session during ";
        r3.append(r1);
        r3.append(r6);
        r3.append(r4);
        r3.append(r11);
        r1 = r3.toString();
        defpackage.xtl.a(r1, r0);
        defpackage.aerq.a(r15, r9);
        r1 = new aesj;
        r1.<init>(r0);
        throw r1;
    L_0x01f8:
        r0 = move-exception;
        goto L_0x014a;
    L_0x01fb:
        r1 = r6.length();
        r2 = java.lang.String.valueOf(r25);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r1 = r1 + 46;
        r1 = r1 + r2;
        r3.<init>(r1);
        r1 = "Widevine CDM resources unavailable for ";
        r3.append(r1);
        r3.append(r6);
        r3.append(r4);
        r3.append(r11);
        r1 = r3.toString();
        defpackage.xtl.a(r1, r0);
        defpackage.aerq.a(r15, r9);
        r1 = new aesn;
        r1.<init>(r0);
        throw r1;
    L_0x022d:
        r0 = move-exception;
        goto L_0x014d;
    L_0x0230:
        defpackage.aerq.a(r15, r9);
        if (r31 == 0) goto L_0x024a;
    L_0x0235:
        r10.a(r15, r7);
        r8 = 0;
        r1 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r5 = r28;
        r6 = r29;
        r7 = r14;
        r1.a(r2, r3, r4, r5, r6, r7, r8);
        return;
    L_0x024a:
        r2 = r6.length();
        r3 = java.lang.String.valueOf(r25);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r2 = r2 + 54;
        r2 = r2 + r3;
        r4.<init>(r2);
        r2 = "Device not provisioned. Unable to complete ";
        r4.append(r2);
        r4.append(r6);
        r4.append(r1);
        r4.append(r11);
        r1 = r4.toString();
        defpackage.xtl.a(r1, r0);
        defpackage.aerq.a(r15, r9);
        r1 = new aeso;
        r1.<init>(r0);
        throw r1;
    L_0x027c:
        r0 = r6.length();
        r2 = java.lang.String.valueOf(r25);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r0 = r0 + 67;
        r0 = r0 + r2;
        r3.<init>(r0);
        r0 = "Widevine CDM engine isn't available. Unable to complete ";
        r3.append(r0);
        r3.append(r6);
        r3.append(r1);
        r3.append(r11);
        r0 = r3.toString();
        defpackage.xtl.c(r0);
        r0 = new aesl;
        r0.<init>();
        throw r0;
    L_0x02ab:
        r0 = java.lang.String.valueOf(r25);
        r0 = r0.length();
        r1 = new java.lang.StringBuilder;
        r0 = r0 + 110;
        r1.<init>(r0);
        r0 = "KeySetID for unpinning of video ";
        r1.append(r0);
        r1.append(r11);
        r0 = " not present in the OfflineStore. Continuing unpinning without WV Key Release.";
        r1.append(r0);
        r0 = r1.toString();
        defpackage.xtl.d(r0);
        r0 = new aesf;
        r0.<init>();
        throw r0;
    L_0x02d4:
        r0 = "Requested DRM init data for Offline is null";
        defpackage.xtl.d(r0);
        r0 = new aesf;
        r0.<init>();
        goto L_0x02e0;
    L_0x02df:
        throw r0;
    L_0x02e0:
        goto L_0x02df;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aerq.a(java.lang.String, int, android.net.Uri, java.util.List, java.lang.String, java.lang.String, boolean):void");
    }

    private static void a(nqb nqb, byte[] bArr) {
        if (bArr != null) {
            try {
                nqb.a(bArr);
            } catch (Exception unused) {
            }
        }
    }
}
