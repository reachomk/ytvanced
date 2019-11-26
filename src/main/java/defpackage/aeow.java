package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aeow */
public final class aeow implements aeko {
    private final aekj a;
    private final aeov b;
    private final aeoz c = new aeoz(this, this.b);
    private njm d;
    private final ByteArrayOutputStream e = new ByteArrayOutputStream();
    private int f;

    public aeow(ovx ovx, ovm ovm, ScheduledExecutorService scheduledExecutorService, ozb ozb, aeov aeov) {
        amqw.a((Object) ovx);
        amqw.a((Object) ovm);
        amqw.a((Object) scheduledExecutorService);
        this.b = (aeov) amqw.a((Object) aeov);
        this.a = new aekj(ovx, ovm, scheduledExecutorService, ozb, this);
    }

    public final void a(long j) {
        this.a.a(j);
    }

    public final void d() {
        this.a.a();
    }

    public final boolean e() {
        return this.a.o;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:9:0x0027=Splitter:B:9:0x0027, B:161:0x0227=Splitter:B:161:0x0227, B:108:0x018f=Splitter:B:108:0x018f} */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ed A:{Catch:{ NumberFormatException -> 0x0223, aeoy -> 0x021e }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01d2 A:{SYNTHETIC, Splitter:B:127:0x01d2} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x0227 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x018f */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x021e A:{Splitter:B:127:0x01d2, ExcHandler: aeoy (e aeoy)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:106|107|108|109|110) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|(1:12)(1:13)|14|15) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:161|162|(1:164)(1:165)|166|167) */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            r3 = "OnesieMultipartWrapper: Malformed header: ";
     */
    /* JADX WARNING: Missing block: B:11:0x002f, code skipped:
            if (r2.length() == 0) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:12:0x0031, code skipped:
            r2 = new java.lang.String(r3);
     */
    /* JADX WARNING: Missing block: B:13:0x0037, code skipped:
            r2 = r3.concat(r2);
     */
    /* JADX WARNING: Missing block: B:15:0x0040, code skipped:
            throw new defpackage.aeoy(102, r2);
     */
    /* JADX WARNING: Missing block: B:141:0x01ea, code skipped:
            r1 = r20;
     */
    /* JADX WARNING: Missing block: B:157:0x021e, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:158:0x021f, code skipped:
            r1 = r20;
     */
    /* JADX WARNING: Missing block: B:162:?, code skipped:
            r3 = "OnesieMultipartWrapper: Malformed itag: ";
            r2 = java.lang.String.valueOf(r2.d);
     */
    /* JADX WARNING: Missing block: B:163:0x0235, code skipped:
            if (r2.length() == 0) goto L_0x0237;
     */
    /* JADX WARNING: Missing block: B:164:0x0237, code skipped:
            r2 = new java.lang.String(r3);
     */
    /* JADX WARNING: Missing block: B:165:0x023d, code skipped:
            r2 = r3.concat(r2);
     */
    /* JADX WARNING: Missing block: B:167:0x0246, code skipped:
            throw new defpackage.aeoy(104, r2);
     */
    public final void a(defpackage.aeks r21, boolean r22) {
        /*
        r20 = this;
        r1 = r20;
        r0 = r21;
        r2 = r1.d;	 Catch:{ aeoy -> 0x029c }
        r3 = 0;
        if (r2 != 0) goto L_0x004b;
    L_0x0009:
        r2 = r0.a;	 Catch:{ aeoy -> 0x029c }
        r4 = "GOOGLE-INITPLAYBACK-METADATA";
        r2 = r2.get(r4);	 Catch:{ aeoy -> 0x029c }
        r2 = (java.lang.String) r2;	 Catch:{ aeoy -> 0x029c }
        if (r2 == 0) goto L_0x0041;
    L_0x0015:
        r4 = android.util.Base64.decode(r2, r3);	 Catch:{ anyg | IllegalArgumentException -> 0x0027, anyg | IllegalArgumentException -> 0x0027 }
        r5 = defpackage.anxa.c();	 Catch:{ anyg | IllegalArgumentException -> 0x0027, anyg | IllegalArgumentException -> 0x0027 }
        r6 = defpackage.njm.r;	 Catch:{ anyg | IllegalArgumentException -> 0x0027, anyg | IllegalArgumentException -> 0x0027 }
        r4 = defpackage.anxl.parseFrom(r6, r4, r5);	 Catch:{ anyg | IllegalArgumentException -> 0x0027, anyg | IllegalArgumentException -> 0x0027 }
        r4 = (defpackage.njm) r4;	 Catch:{ anyg | IllegalArgumentException -> 0x0027, anyg | IllegalArgumentException -> 0x0027 }
        r2 = r4;
        goto L_0x004b;
    L_0x0027:
        r0 = new aeoy;	 Catch:{ aeoy -> 0x029c }
        r3 = "OnesieMultipartWrapper: Malformed header: ";
        r4 = r2.length();	 Catch:{ aeoy -> 0x029c }
        if (r4 != 0) goto L_0x0037;
    L_0x0031:
        r2 = new java.lang.String;	 Catch:{ aeoy -> 0x029c }
        r2.<init>(r3);	 Catch:{ aeoy -> 0x029c }
        goto L_0x003b;
    L_0x0037:
        r2 = r3.concat(r2);	 Catch:{ aeoy -> 0x029c }
    L_0x003b:
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0.<init>(r3, r2);	 Catch:{ aeoy -> 0x029c }
        throw r0;	 Catch:{ aeoy -> 0x029c }
    L_0x0041:
        r0 = new aeoy;	 Catch:{ aeoy -> 0x029c }
        r2 = "OnesieMultipartWrapper: Missing header";
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0.<init>(r3, r2);	 Catch:{ aeoy -> 0x029c }
        throw r0;	 Catch:{ aeoy -> 0x029c }
    L_0x004b:
        r0 = r0.b;	 Catch:{ aeoy -> 0x029c }
        if (r0 == 0) goto L_0x0055;
    L_0x004f:
        r4 = r1.e;	 Catch:{ aeoy -> 0x029c }
        r5 = r0.length;	 Catch:{ aeoy -> 0x029c }
        r4.write(r0, r3, r5);	 Catch:{ aeoy -> 0x029c }
    L_0x0055:
        if (r22 == 0) goto L_0x0299;
    L_0x0057:
        r0 = r1.e;	 Catch:{ aeoy -> 0x029c }
        r0 = r0.toByteArray();	 Catch:{ aeoy -> 0x029c }
        r4 = 0;
        r1.d = r4;	 Catch:{ aeoy -> 0x029c }
        r4 = r1.e;	 Catch:{ aeoy -> 0x029c }
        r4.reset();	 Catch:{ aeoy -> 0x029c }
        r4 = r2.b;	 Catch:{ aeoy -> 0x029c }
        r4 = defpackage.njs.a(r4);	 Catch:{ aeoy -> 0x029c }
        r5 = 9;
        if (r4 == 0) goto L_0x0070;
    L_0x006f:
        goto L_0x0072;
    L_0x0070:
        r4 = 9;
    L_0x0072:
        r4 = r4 + -1;
        r6 = 2;
        r7 = 1;
        if (r4 == 0) goto L_0x0247;
    L_0x0078:
        r8 = -1;
        r10 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        if (r4 == r7) goto L_0x019f;
    L_0x007f:
        if (r4 == r6) goto L_0x0199;
    L_0x0081:
        r11 = 3;
        if (r4 == r11) goto L_0x019f;
    L_0x0084:
        r12 = 4;
        if (r4 == r12) goto L_0x0175;
    L_0x0087:
        r3 = 6;
        if (r4 == r3) goto L_0x016a;
    L_0x008a:
        if (r4 == r5) goto L_0x014c;
    L_0x008c:
        r3 = 11;
        if (r4 == r3) goto L_0x0141;
    L_0x0090:
        r0 = 14;
        if (r4 == r0) goto L_0x0122;
    L_0x0094:
        r0 = 16;
        if (r4 == r0) goto L_0x00aa;
    L_0x0098:
        r0 = 18;
        if (r4 == r0) goto L_0x009e;
    L_0x009c:
        goto L_0x021d;
    L_0x009e:
        r0 = r1.b;	 Catch:{ aeoy -> 0x029c }
        r2 = r2.q;	 Catch:{ aeoy -> 0x029c }
        if (r2 != 0) goto L_0x00a6;
    L_0x00a4:
        r2 = defpackage.njk.e;	 Catch:{ aeoy -> 0x029c }
    L_0x00a6:
        r0.a(r1, r2);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x00aa:
        r0 = r2.d;	 Catch:{ NumberFormatException -> 0x011a }
        r12 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x011a }
        r0 = defpackage.ampo.a;	 Catch:{ aeoy -> 0x029c }
        r3 = r2.i;	 Catch:{ aeoy -> 0x029c }
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x00c2;
    L_0x00ba:
        r0 = java.lang.Long.valueOf(r3);	 Catch:{ aeoy -> 0x029c }
        r0 = defpackage.amqp.b(r0);	 Catch:{ aeoy -> 0x029c }
    L_0x00c2:
        r18 = r0;
        r0 = defpackage.ampo.a;	 Catch:{ aeoy -> 0x029c }
        r3 = r2.a;	 Catch:{ aeoy -> 0x029c }
        r3 = r3 & 4096;
        if (r3 == 0) goto L_0x00fe;
    L_0x00cc:
        r3 = r2.o;	 Catch:{ aeoy -> 0x029c }
        if (r3 != 0) goto L_0x00d2;
    L_0x00d0:
        r3 = defpackage.njw.d;	 Catch:{ aeoy -> 0x029c }
    L_0x00d2:
        r3 = r3.b;	 Catch:{ aeoy -> 0x029c }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x00d9;
    L_0x00d8:
        goto L_0x00fe;
    L_0x00d9:
        r3 = r2.o;	 Catch:{ aeoy -> 0x029c }
        if (r3 != 0) goto L_0x00df;
    L_0x00dd:
        r3 = defpackage.njw.d;	 Catch:{ aeoy -> 0x029c }
    L_0x00df:
        r3 = r3.c;	 Catch:{ aeoy -> 0x029c }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 > 0) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00fe;
    L_0x00e6:
        r0 = r2.o;	 Catch:{ aeoy -> 0x029c }
        if (r0 != 0) goto L_0x00ec;
    L_0x00ea:
        r0 = defpackage.njw.d;	 Catch:{ aeoy -> 0x029c }
    L_0x00ec:
        r3 = r0.b;	 Catch:{ aeoy -> 0x029c }
        r0 = r2.o;	 Catch:{ aeoy -> 0x029c }
        if (r0 != 0) goto L_0x00f4;
    L_0x00f2:
        r0 = defpackage.njw.d;	 Catch:{ aeoy -> 0x029c }
    L_0x00f4:
        r5 = r0.c;	 Catch:{ aeoy -> 0x029c }
        r0 = defpackage.aepa.a(r3, r5);	 Catch:{ aeoy -> 0x029c }
        r0 = defpackage.amqp.b(r0);	 Catch:{ aeoy -> 0x029c }
    L_0x00fe:
        r19 = r0;
        r11 = r2.c;	 Catch:{ aeoy -> 0x029c }
        r13 = r2.f;	 Catch:{ aeoy -> 0x029c }
        r0 = r2.a;	 Catch:{ aeoy -> 0x029c }
        r0 = r0 & r10;
        if (r0 == 0) goto L_0x010b;
    L_0x0109:
        r8 = r2.p;	 Catch:{ aeoy -> 0x029c }
    L_0x010b:
        r15 = r8;
        r0 = r2.e;	 Catch:{ aeoy -> 0x029c }
        r17 = r0;
        r0 = defpackage.aeox.a(r11, r12, r13, r15, r17, r18, r19);	 Catch:{ aeoy -> 0x029c }
        r2 = r1.b;	 Catch:{ aeoy -> 0x029c }
        r2.a(r1, r0);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x011a:
        r0 = defpackage.afpf.onesie;	 Catch:{ aeoy -> 0x029c }
        r2 = "STREAM_METADATA invalid itag received.";
        defpackage.afpc.a(r7, r0, r2);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x0122:
        r0 = defpackage.aeow.a(r2);	 Catch:{ aeoy -> 0x029c }
        r3 = r0.size();	 Catch:{ aeoy -> 0x029c }
        if (r3 <= 0) goto L_0x0134;
    L_0x012c:
        r3 = r1.b;	 Catch:{ aeoy -> 0x029c }
        r2 = r2.c;	 Catch:{ aeoy -> 0x029c }
        r3.a(r1, r2, r0);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x0134:
        r0 = defpackage.afpf.onesie;	 Catch:{ aeoy -> 0x029c }
        r2 = "RESTRICTED_FORMATS_HINT header with no itags. Ignored.";
        r3 = 4547007122018943789; // 0x3f1a36e2eb1c432d float:-1.8890966E26 double:1.0E-4;
        defpackage.afpc.a(r7, r0, r2, r3);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x0141:
        r2 = r1.b;	 Catch:{ aeoy -> 0x029c }
        r3 = new java.lang.String;	 Catch:{ aeoy -> 0x029c }
        r3.<init>(r0);	 Catch:{ aeoy -> 0x029c }
        r2.b(r1, r3);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x014c:
        r0 = r2.j;	 Catch:{ aeoy -> 0x029c }
        r0 = android.webkit.URLUtil.isValidUrl(r0);	 Catch:{ aeoy -> 0x029c }
        if (r0 == 0) goto L_0x0160;
    L_0x0154:
        r0 = r1.b;	 Catch:{ aeoy -> 0x029c }
        r2 = r2.j;	 Catch:{ aeoy -> 0x029c }
        r2 = android.net.Uri.parse(r2);	 Catch:{ aeoy -> 0x029c }
        r0.a(r1, r2);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x0160:
        r0 = new aeoy;	 Catch:{ aeoy -> 0x029c }
        r2 = "OnesieMultipartWrapper: Malformed server push URL";
        r3 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r0.<init>(r3, r2);	 Catch:{ aeoy -> 0x029c }
        throw r0;	 Catch:{ aeoy -> 0x029c }
    L_0x016a:
        r2 = new java.lang.String;	 Catch:{ aeoy -> 0x029c }
        r2.<init>(r0);	 Catch:{ aeoy -> 0x029c }
        r0 = r1.b;	 Catch:{ aeoy -> 0x029c }
        r0.a(r1, r2);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x0175:
        r4 = r2.k;	 Catch:{ aeoy -> 0x029c }
        r4 = defpackage.njq.a(r4);	 Catch:{ aeoy -> 0x029c }
        if (r4 == 0) goto L_0x019f;
    L_0x017d:
        if (r4 == r11) goto L_0x0180;
    L_0x017f:
        goto L_0x019f;
    L_0x0180:
        r4 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x018f }
        r4.<init>(r0);	 Catch:{ IOException -> 0x018f }
        r0 = new java.util.zip.GZIPInputStream;	 Catch:{ IOException -> 0x018f }
        r0.<init>(r4);	 Catch:{ IOException -> 0x018f }
        r0 = defpackage.anaz.a(r0);	 Catch:{ IOException -> 0x018f }
        goto L_0x019f;
    L_0x018f:
        r0 = new aeoy;	 Catch:{ aeoy -> 0x029c }
        r2 = "OnesieMultipartWrapper: Failed to decompress part body.";
        r3 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r0.<init>(r3, r2);	 Catch:{ aeoy -> 0x029c }
        throw r0;	 Catch:{ aeoy -> 0x029c }
    L_0x0199:
        r2 = r1.b;	 Catch:{ aeoy -> 0x029c }
        r2.a(r1, r0);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x019f:
        r4 = r0;
        r0 = new aepc;	 Catch:{ NumberFormatException -> 0x0227 }
        r5 = r2.c;	 Catch:{ NumberFormatException -> 0x0227 }
        r11 = r2.d;	 Catch:{ NumberFormatException -> 0x0227 }
        r11 = java.lang.Integer.parseInt(r11);	 Catch:{ NumberFormatException -> 0x0227 }
        r12 = r2.f;	 Catch:{ NumberFormatException -> 0x0227 }
        r14 = r2.a;	 Catch:{ NumberFormatException -> 0x0227 }
        r10 = r10 & r14;
        if (r10 == 0) goto L_0x01b3;
    L_0x01b1:
        r8 = r2.p;	 Catch:{ NumberFormatException -> 0x0227 }
    L_0x01b3:
        r9 = r8;
        r8 = r2.b;	 Catch:{ NumberFormatException -> 0x0227 }
        r8 = defpackage.njs.a(r8);	 Catch:{ NumberFormatException -> 0x0227 }
        if (r8 != 0) goto L_0x01be;
    L_0x01bc:
        r14 = 0;
        goto L_0x01c2;
    L_0x01be:
        if (r8 == r6) goto L_0x01c1;
    L_0x01c0:
        goto L_0x01bc;
    L_0x01c1:
        r14 = 1;
    L_0x01c2:
        r15 = r2.n;	 Catch:{ NumberFormatException -> 0x0227 }
        r7 = r2.e;	 Catch:{ NumberFormatException -> 0x0227 }
        r21 = r14;
        r16 = r15;
        r14 = r2.g;	 Catch:{ NumberFormatException -> 0x0227 }
        r3 = r2.a;	 Catch:{ NumberFormatException -> 0x0227 }
        r3 = r3 & 1024;
        if (r3 == 0) goto L_0x01ed;
    L_0x01d2:
        r3 = r2.m;	 Catch:{ NumberFormatException -> 0x01ea, aeoy -> 0x021e }
        if (r3 != 0) goto L_0x01d8;
    L_0x01d6:
        r3 = defpackage.njo.d;	 Catch:{ NumberFormatException -> 0x0227 }
    L_0x01d8:
        r8 = r7;
        r6 = r3.b;	 Catch:{ NumberFormatException -> 0x01ea, aeoy -> 0x021e }
        r3 = r2.m;	 Catch:{ NumberFormatException -> 0x01ea, aeoy -> 0x021e }
        if (r3 != 0) goto L_0x01e1;
    L_0x01df:
        r3 = defpackage.njo.d;	 Catch:{ NumberFormatException -> 0x0227 }
    L_0x01e1:
        r17 = r2;
        r1 = r3.c;	 Catch:{ NumberFormatException -> 0x0223, aeoy -> 0x021e }
        r1 = defpackage.aepb.a(r6, r1);	 Catch:{ NumberFormatException -> 0x0223, aeoy -> 0x021e }
        goto L_0x01f2;
    L_0x01ea:
        r1 = r20;
        goto L_0x0227;
    L_0x01ed:
        r17 = r2;
        r8 = r7;
        r1 = defpackage.aepc.a;	 Catch:{ NumberFormatException -> 0x0223, aeoy -> 0x021e }
    L_0x01f2:
        r3 = r0;
        r6 = r11;
        r2 = r8;
        r7 = r12;
        r11 = r21;
        r12 = r16;
        r13 = r2;
        r16 = r1;
        r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16);	 Catch:{ NumberFormatException -> 0x0223, aeoy -> 0x021e }
        r2 = r17;
        r1 = r2.b;	 Catch:{ NumberFormatException -> 0x01ea, aeoy -> 0x021e }
        r1 = defpackage.njs.a(r1);	 Catch:{ NumberFormatException -> 0x01ea, aeoy -> 0x021e }
        if (r1 == 0) goto L_0x0216;
    L_0x020a:
        r3 = 5;
        if (r1 == r3) goto L_0x020e;
    L_0x020d:
        goto L_0x0216;
    L_0x020e:
        r1 = r20;
        r3 = r1.b;	 Catch:{ NumberFormatException -> 0x0227 }
        r3.b(r1, r0);	 Catch:{ NumberFormatException -> 0x0227 }
        return;
    L_0x0216:
        r1 = r20;
        r3 = r1.b;	 Catch:{ NumberFormatException -> 0x0227 }
        r3.a(r1, r0);	 Catch:{ NumberFormatException -> 0x0227 }
    L_0x021d:
        return;
    L_0x021e:
        r0 = move-exception;
        r1 = r20;
        goto L_0x029d;
    L_0x0223:
        r1 = r20;
        r2 = r17;
    L_0x0227:
        r0 = new aeoy;	 Catch:{ aeoy -> 0x029c }
        r3 = "OnesieMultipartWrapper: Malformed itag: ";
        r2 = r2.d;	 Catch:{ aeoy -> 0x029c }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ aeoy -> 0x029c }
        r4 = r2.length();	 Catch:{ aeoy -> 0x029c }
        if (r4 != 0) goto L_0x023d;
    L_0x0237:
        r2 = new java.lang.String;	 Catch:{ aeoy -> 0x029c }
        r2.<init>(r3);	 Catch:{ aeoy -> 0x029c }
        goto L_0x0241;
    L_0x023d:
        r2 = r3.concat(r2);	 Catch:{ aeoy -> 0x029c }
    L_0x0241:
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0.<init>(r3, r2);	 Catch:{ aeoy -> 0x029c }
        throw r0;	 Catch:{ aeoy -> 0x029c }
    L_0x0247:
        r3 = r2.a;	 Catch:{ aeoy -> 0x029c }
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x028f;
    L_0x024d:
        r3 = r2.h;	 Catch:{ aeoy -> 0x029c }
        if (r3 != 0) goto L_0x0253;
    L_0x0251:
        r3 = defpackage.nju.d;	 Catch:{ aeoy -> 0x029c }
    L_0x0253:
        r3 = r3.a;	 Catch:{ aeoy -> 0x029c }
        r3 = r3 & r7;
        if (r3 == 0) goto L_0x028f;
    L_0x0258:
        r3 = r2.h;	 Catch:{ aeoy -> 0x029c }
        if (r3 != 0) goto L_0x025e;
    L_0x025c:
        r3 = defpackage.nju.d;	 Catch:{ aeoy -> 0x029c }
    L_0x025e:
        r3 = r3.a;	 Catch:{ aeoy -> 0x029c }
        r3 = r3 & r6;
        if (r3 == 0) goto L_0x028f;
    L_0x0263:
        r3 = r2.h;	 Catch:{ aeoy -> 0x029c }
        if (r3 != 0) goto L_0x0269;
    L_0x0267:
        r3 = defpackage.nju.d;	 Catch:{ aeoy -> 0x029c }
    L_0x0269:
        r3 = r3.b;	 Catch:{ aeoy -> 0x029c }
        r3 = r3.b();	 Catch:{ aeoy -> 0x029c }
        if (r3 == 0) goto L_0x028f;
    L_0x0271:
        r3 = r1.b;	 Catch:{ aeoy -> 0x029c }
        r4 = r2.h;	 Catch:{ aeoy -> 0x029c }
        if (r4 != 0) goto L_0x0279;
    L_0x0277:
        r4 = defpackage.nju.d;	 Catch:{ aeoy -> 0x029c }
    L_0x0279:
        r4 = r4.b;	 Catch:{ aeoy -> 0x029c }
        r4 = r4.d();	 Catch:{ aeoy -> 0x029c }
        r2 = r2.h;	 Catch:{ aeoy -> 0x029c }
        if (r2 != 0) goto L_0x0285;
    L_0x0283:
        r2 = defpackage.nju.d;	 Catch:{ aeoy -> 0x029c }
    L_0x0285:
        r2 = r2.c;	 Catch:{ aeoy -> 0x029c }
        r2 = r2.d();	 Catch:{ aeoy -> 0x029c }
        r3.a(r1, r0, r4, r2);	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x028f:
        r0 = new aeoy;	 Catch:{ aeoy -> 0x029c }
        r2 = "OnesieMultipartWrapper: Missing crypto params";
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r0.<init>(r3, r2);	 Catch:{ aeoy -> 0x029c }
        throw r0;	 Catch:{ aeoy -> 0x029c }
    L_0x0299:
        r1.d = r2;	 Catch:{ aeoy -> 0x029c }
        return;
    L_0x029c:
        r0 = move-exception;
    L_0x029d:
        r2 = r1.b;
        r2.a(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeow.a(aeks, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x015e A:{Catch:{ all -> 0x0253, aeoy | anyg -> 0x0260 }} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144 A:{SYNTHETIC, Splitter:B:61:0x0144} */
    public final void a(int r17, int r18, java.nio.ByteBuffer r19) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r17;
        r2 = r19;
        r8 = r1.c;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r3 = r8.e;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r4 = 32;
        r5 = 12;
        r6 = 30;
        r7 = 23;
        r10 = 31;
        r11 = 22;
        r12 = 1;
        r13 = 13;
        r14 = 0;
        if (r3 == 0) goto L_0x001e;
    L_0x001c:
        goto L_0x00b7;
    L_0x001e:
        if (r0 == 0) goto L_0x0044;
    L_0x0020:
        if (r0 == r6) goto L_0x0041;
    L_0x0022:
        if (r0 == r10) goto L_0x003e;
    L_0x0024:
        switch(r0) {
            case 10: goto L_0x003b;
            case 11: goto L_0x0038;
            case 12: goto L_0x0035;
            default: goto L_0x0027;
        };	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
    L_0x0027:
        switch(r0) {
            case 20: goto L_0x0032;
            case 21: goto L_0x002f;
            case 22: goto L_0x002c;
            default: goto L_0x002a;
        };	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
    L_0x002a:
        r3 = 0;
        goto L_0x0045;
    L_0x002c:
        r3 = 23;
        goto L_0x0045;
    L_0x002f:
        r3 = 22;
        goto L_0x0045;
    L_0x0032:
        r3 = 21;
        goto L_0x0045;
    L_0x0035:
        r3 = 13;
        goto L_0x0045;
    L_0x0038:
        r3 = 12;
        goto L_0x0045;
    L_0x003b:
        r3 = 11;
        goto L_0x0045;
    L_0x003e:
        r3 = 32;
        goto L_0x0045;
    L_0x0041:
        r3 = 31;
        goto L_0x0045;
    L_0x0044:
        r3 = 1;
    L_0x0045:
        r8.h = r3;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        if (r3 != 0) goto L_0x006b;
    L_0x0049:
        r2 = r8.b;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r3 = r8.a;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r4 = new aeoy;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r5 = new java.lang.StringBuilder;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r6 = 54;
        r5.<init>(r6);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r6 = "OnesieMultipartWrapper: Unknown part type: ";
        r5.append(r6);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r5.append(r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = r5.toString();	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r5 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r4.<init>(r5, r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r2.b(r3, r4);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        return;
    L_0x006b:
        if (r3 != r11) goto L_0x006e;
    L_0x006d:
        goto L_0x0085;
    L_0x006e:
        if (r3 == r13) goto L_0x0085;
    L_0x0070:
        if (r3 == r7) goto L_0x0085;
    L_0x0072:
        r0 = r19.remaining();	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = r0 + r18;
        r0 = java.nio.ByteBuffer.allocate(r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r8.e = r0;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = java.nio.ByteBuffer.allocate(r14);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r8.d = r0;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        goto L_0x00b7;
    L_0x0085:
        r0 = r19.remaining();	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        if (r0 <= 0) goto L_0x00ab;
    L_0x008b:
        r0 = r19.position();	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = r2.get(r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = defpackage.aekk.a(r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r3 = r19.remaining();	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r3 = r3 + r18;
        r3 = r3 - r0;
        r3 = java.nio.ByteBuffer.allocate(r3);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r8.e = r3;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = java.nio.ByteBuffer.allocate(r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r8.d = r0;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        goto L_0x00b7;
    L_0x00ab:
        r0 = java.nio.ByteBuffer.allocate(r14);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r8.e = r0;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = java.nio.ByteBuffer.allocate(r14);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r8.d = r0;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
    L_0x00b7:
        r0 = r8.d;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        defpackage.aeoz.a(r2, r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = r8.e;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        defpackage.aeoz.a(r2, r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        if (r18 != 0) goto L_0x025f;
    L_0x00c3:
        r0 = r8.e;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0.rewind();	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = r8.d;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0.rewind();	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r0 = r8.c;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        if (r0 == 0) goto L_0x00d8;
    L_0x00d1:
        r2 = r8.h;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        if (r2 == r5) goto L_0x00d8;
    L_0x00d5:
        r8.a(r0);	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
    L_0x00d8:
        r15 = 0;
        r0 = r8.h;	 Catch:{ all -> 0x0253 }
        r2 = r0 + -1;
        if (r0 == 0) goto L_0x0252;
    L_0x00df:
        if (r2 == r6) goto L_0x023c;
    L_0x00e1:
        if (r2 == r10) goto L_0x0230;
    L_0x00e3:
        r0 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        switch(r2) {
            case 10: goto L_0x020f;
            case 11: goto L_0x01f0;
            case 12: goto L_0x0136;
            default: goto L_0x00e8;
        };	 Catch:{ all -> 0x0253 }
    L_0x00e8:
        switch(r2) {
            case 20: goto L_0x00ed;
            case 21: goto L_0x0136;
            case 22: goto L_0x0136;
            default: goto L_0x00eb;
        };	 Catch:{ all -> 0x0253 }
    L_0x00eb:
        goto L_0x0247;
    L_0x00ed:
        r2 = r8.e;	 Catch:{ all -> 0x0253 }
        r2 = r2.array();	 Catch:{ all -> 0x0253 }
        r3 = defpackage.njg.l;	 Catch:{ all -> 0x0253 }
        r2 = defpackage.anxl.parseFrom(r3, r2);	 Catch:{ all -> 0x0253 }
        r2 = (defpackage.njg) r2;	 Catch:{ all -> 0x0253 }
        r3 = r2.a;	 Catch:{ all -> 0x0253 }
        r3 = r3 & r12;
        if (r3 != 0) goto L_0x0110;
    L_0x0100:
        r2 = r8.b;	 Catch:{ all -> 0x0253 }
        r3 = r8.a;	 Catch:{ all -> 0x0253 }
        r4 = new aeoy;	 Catch:{ all -> 0x0253 }
        r5 = "OnesieMultipartWrapper: MediaHeader does not contain HeaderId";
        r4.<init>(r0, r5);	 Catch:{ all -> 0x0253 }
        r2.b(r3, r4);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x0110:
        r0 = r8.f;	 Catch:{ all -> 0x0253 }
        r3 = r2.b;	 Catch:{ all -> 0x0253 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0253 }
        r0.put(r3, r2);	 Catch:{ all -> 0x0253 }
        r0 = r8.g;	 Catch:{ all -> 0x0253 }
        r3 = r2.b;	 Catch:{ all -> 0x0253 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0253 }
        r5 = r2.a;	 Catch:{ all -> 0x0253 }
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x012b;
    L_0x0128:
        r4 = r2.g;	 Catch:{ all -> 0x0253 }
        goto L_0x012d;
    L_0x012b:
        r4 = 0;
    L_0x012d:
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0253 }
        r0.put(r3, r2);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x0136:
        r2 = r8.d;	 Catch:{ all -> 0x0253 }
        r2 = defpackage.aekk.a(r2);	 Catch:{ all -> 0x0253 }
        r3 = "MEDIA";
        r4 = "MEDIA_END";
        r5 = "ONESIE_ENCRYPTED_MEDIA";
        if (r2 != 0) goto L_0x015e;
    L_0x0144:
        r2 = new aeoy;	 Catch:{ all -> 0x0253 }
        r6 = "OnesieMultipartWrapper: UMP part %s missing embedded header id";
        r7 = new java.lang.Object[r12];	 Catch:{ all -> 0x0253 }
        r10 = r8.h;	 Catch:{ all -> 0x0253 }
        if (r10 == r13) goto L_0x0153;
    L_0x014e:
        if (r10 != r11) goto L_0x0151;
    L_0x0150:
        goto L_0x0154;
    L_0x0151:
        r3 = r4;
        goto L_0x0154;
    L_0x0153:
        r3 = r5;
    L_0x0154:
        r7[r14] = r3;	 Catch:{ all -> 0x0253 }
        r3 = java.lang.String.format(r6, r7);	 Catch:{ all -> 0x0253 }
        r2.<init>(r0, r3);	 Catch:{ all -> 0x0253 }
        throw r2;	 Catch:{ all -> 0x0253 }
    L_0x015e:
        r6 = r8.g;	 Catch:{ all -> 0x0253 }
        r6 = r6.get(r2);	 Catch:{ all -> 0x0253 }
        r6 = (java.lang.Long) r6;	 Catch:{ all -> 0x0253 }
        r10 = r8.f;	 Catch:{ all -> 0x0253 }
        r10 = r10.get(r2);	 Catch:{ all -> 0x0253 }
        r10 = (defpackage.njg) r10;	 Catch:{ all -> 0x0253 }
        if (r6 != 0) goto L_0x0171;
    L_0x0170:
        goto L_0x01d0;
    L_0x0171:
        if (r10 == 0) goto L_0x01d0;
    L_0x0173:
        r3 = r6.longValue();	 Catch:{ all -> 0x0253 }
        r11 = r6.longValue();	 Catch:{ all -> 0x0253 }
        r0 = r8.e;	 Catch:{ all -> 0x0253 }
        r0 = r0.limit();	 Catch:{ all -> 0x0253 }
        r17 = r10;
        r9 = (long) r0;	 Catch:{ all -> 0x0253 }
        r11 = r11 + r9;
        r4 = defpackage.aepb.a(r3, r11);	 Catch:{ all -> 0x0253 }
        r0 = r8.g;	 Catch:{ all -> 0x0253 }
        r9 = r4.b();	 Catch:{ all -> 0x0253 }
        r3 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x0253 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0253 }
        r0 = r8.h;	 Catch:{ all -> 0x0253 }
        if (r0 != r7) goto L_0x01ae;
    L_0x019a:
        r2 = r6.longValue();	 Catch:{ all -> 0x0253 }
        r4 = defpackage.aepb.a(r2, r2);	 Catch:{ all -> 0x0253 }
        r5 = new byte[r14];	 Catch:{ all -> 0x0253 }
        r6 = 1;
        r7 = 0;
        r2 = r8;
        r3 = r17;
        r2.a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x01ae:
        if (r0 == r13) goto L_0x01c0;
    L_0x01b0:
        r0 = r8.e;	 Catch:{ all -> 0x0253 }
        r5 = r0.array();	 Catch:{ all -> 0x0253 }
        r6 = 0;
        r7 = 0;
        r2 = r8;
        r3 = r17;
        r2.a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x01c0:
        r0 = r8.e;	 Catch:{ all -> 0x0253 }
        r5 = r0.array();	 Catch:{ all -> 0x0253 }
        r6 = 0;
        r7 = 1;
        r2 = r8;
        r3 = r17;
        r2.a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x01d0:
        r2 = r8.b;	 Catch:{ all -> 0x0253 }
        r6 = r8.a;	 Catch:{ all -> 0x0253 }
        r7 = new aeoy;	 Catch:{ all -> 0x0253 }
        r9 = "OnesieMultipartWrapper: UMP part %s passed with unseen header id";
        r10 = new java.lang.Object[r12];	 Catch:{ all -> 0x0253 }
        r12 = r8.h;	 Catch:{ all -> 0x0253 }
        if (r12 != r13) goto L_0x01e0;
    L_0x01de:
        r3 = r5;
        goto L_0x01e3;
    L_0x01e0:
        if (r12 == r11) goto L_0x01e3;
    L_0x01e2:
        r3 = r4;
    L_0x01e3:
        r10[r14] = r3;	 Catch:{ all -> 0x0253 }
        r3 = java.lang.String.format(r9, r10);	 Catch:{ all -> 0x0253 }
        r7.<init>(r0, r3);	 Catch:{ all -> 0x0253 }
        r2.b(r6, r7);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x01f0:
        r0 = r8.c;	 Catch:{ all -> 0x0253 }
        if (r0 != 0) goto L_0x0205;
    L_0x01f4:
        r0 = r8.b;	 Catch:{ all -> 0x0253 }
        r2 = r8.a;	 Catch:{ all -> 0x0253 }
        r3 = new aeoy;	 Catch:{ all -> 0x0253 }
        r4 = "OnesieMultipartWrapper: OnesieData present without succeeding OnesieHeader";
        r5 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3.<init>(r5, r4);	 Catch:{ all -> 0x0253 }
        r0.b(r2, r3);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x0205:
        r2 = r8.e;	 Catch:{ all -> 0x0253 }
        r2 = r2.array();	 Catch:{ all -> 0x0253 }
        r8.a(r0, r2);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x020f:
        r0 = defpackage.njm.r;	 Catch:{ all -> 0x0253 }
        r0 = r0.createBuilder();	 Catch:{ all -> 0x0253 }
        r0 = (defpackage.njl) r0;	 Catch:{ all -> 0x0253 }
        r2 = r8.e;	 Catch:{ all -> 0x0253 }
        r2 = r2.array();	 Catch:{ all -> 0x0253 }
        r0 = r0.mergeFrom(r2);	 Catch:{ all -> 0x0253 }
        r0 = (defpackage.anvi) r0;	 Catch:{ all -> 0x0253 }
        r0 = (defpackage.njl) r0;	 Catch:{ all -> 0x0253 }
        r0 = r0.build();	 Catch:{ all -> 0x0253 }
        r0 = (defpackage.anxl) r0;	 Catch:{ all -> 0x0253 }
        r0 = (defpackage.njm) r0;	 Catch:{ all -> 0x0253 }
        r8.c = r0;	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x0230:
        r0 = r8.e;	 Catch:{ all -> 0x0253 }
        r0 = r0.array();	 Catch:{ all -> 0x0253 }
        r2 = defpackage.njk.e;	 Catch:{ all -> 0x0253 }
        defpackage.anxl.parseFrom(r2, r0);	 Catch:{ all -> 0x0253 }
        goto L_0x0247;
    L_0x023c:
        r0 = r8.e;	 Catch:{ all -> 0x0253 }
        r0 = r0.array();	 Catch:{ all -> 0x0253 }
        r2 = defpackage.aqhl.d;	 Catch:{ all -> 0x0253 }
        defpackage.anxl.parseFrom(r2, r0);	 Catch:{ all -> 0x0253 }
    L_0x0247:
        r0 = r8.h;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r2 = 11;
        if (r0 == r2) goto L_0x024f;
    L_0x024d:
        r8.c = r15;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
    L_0x024f:
        r8.e = r15;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        goto L_0x025f;
    L_0x0252:
        throw r15;	 Catch:{ all -> 0x0253 }
    L_0x0253:
        r0 = move-exception;
        r2 = r8.h;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        r3 = 11;
        if (r2 == r3) goto L_0x025c;
    L_0x025a:
        r8.c = r15;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
    L_0x025c:
        r8.e = r15;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
        throw r0;	 Catch:{ aeoy -> 0x0262, aeoy | anyg -> 0x0260 }
    L_0x025f:
        return;
    L_0x0260:
        r0 = move-exception;
        goto L_0x0263;
    L_0x0262:
        r0 = move-exception;
    L_0x0263:
        r2 = r1.b;
        r2.a(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeow.a(int, int, java.nio.ByteBuffer):void");
    }

    protected static Set a(njm njm) {
        HashSet hashSet = new HashSet();
        for (String parseInt : njm.l) {
            try {
                hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
            } catch (NumberFormatException unused) {
                return Collections.emptySet();
            }
        }
        return hashSet;
    }

    public final void c() {
        aeoz aeoz = this.c;
        njm njm = aeoz.c;
        if (njm != null) {
            try {
                aeoz.a(njm);
                aeoz.c = null;
            } catch (aeoy e) {
                aeoz.b.a(aeoz.a, e);
            }
        }
        this.b.a(this);
    }

    public final void a(Exception exception) {
        this.b.a(this, exception);
    }

    public final void a() {
        this.b.b(this);
    }

    public final void b() {
        this.b.c(this);
    }

    public final void a(int i) {
        int i2 = this.f;
        if (i2 < 100000) {
            if (i2 == 0 && i > 0) {
                this.b.d(this);
            }
            i2 = this.f + i;
            this.f = i2;
            if (i2 > 100000) {
                this.b.e(this);
            }
        }
    }
}
