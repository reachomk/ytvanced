package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: anrx */
public final class anrx implements Closeable {
    public final boolean a = false;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public long e;
    public int f;
    public String g;
    public int h = 0;
    public String[] i;
    public int[] j;
    private final Reader k;
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private int[] o = new int[32];

    public anrx(Reader reader) {
        int[] iArr = this.o;
        this.h = 1;
        iArr[0] = 6;
        this.i = new String[32];
        this.j = new int[32];
        this.k = reader;
    }

    public final boolean a() {
        int i = this.d;
        if (i == 0) {
            i = b();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:204:0x02b5 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x02b5 A:{RETURN} */
    /* JADX WARNING: Missing block: B:165:0x023a, code skipped:
            if (b(r6) != false) goto L_0x0295;
     */
    /* JADX WARNING: Missing block: B:178:0x0259, code skipped:
            if (r9 != true) goto L_0x0280;
     */
    /* JADX WARNING: Missing block: B:179:0x025b, code skipped:
            if (r16 == 0) goto L_0x0280;
     */
    /* JADX WARNING: Missing block: B:181:0x0261, code skipped:
            if (r12 == Long.MIN_VALUE) goto L_0x0264;
     */
    /* JADX WARNING: Missing block: B:182:0x0264, code skipped:
            if (r17 != null) goto L_0x0267;
     */
    /* JADX WARNING: Missing block: B:184:0x0269, code skipped:
            if (r12 != 0) goto L_0x026d;
     */
    /* JADX WARNING: Missing block: B:185:0x026b, code skipped:
            if (r17 != null) goto L_0x0280;
     */
    /* JADX WARNING: Missing block: B:186:0x026d, code skipped:
            if (r17 != null) goto L_0x0270;
     */
    /* JADX WARNING: Missing block: B:187:0x026f, code skipped:
            r12 = -r12;
     */
    /* JADX WARNING: Missing block: B:188:0x0270, code skipped:
            r0.e = r12;
            r0.c += r3;
            r0.d = 15;
            r18 = 15;
     */
    /* JADX WARNING: Missing block: B:189:0x0280, code skipped:
            if (r9 != true) goto L_0x0283;
     */
    /* JADX WARNING: Missing block: B:191:0x0284, code skipped:
            if (r9 == true) goto L_0x028a;
     */
    /* JADX WARNING: Missing block: B:193:0x0287, code skipped:
            if (r9 == true) goto L_0x028a;
     */
    /* JADX WARNING: Missing block: B:194:0x028a, code skipped:
            r0.f = r3;
            r0.d = 16;
            r18 = 16;
     */
    public final int b() {
        /*
        r21 = this;
        r0 = r21;
        r1 = r0.o;
        r2 = r0.h;
        r3 = -1;
        r2 = r2 + r3;
        r4 = r1[r2];
        r7 = 8;
        r8 = 59;
        r9 = 44;
        r10 = 6;
        r11 = 3;
        r12 = 7;
        r13 = 4;
        r14 = 5;
        r15 = 2;
        r6 = 0;
        r5 = 1;
        if (r4 != r5) goto L_0x001e;
    L_0x001a:
        r1[r2] = r15;
        goto L_0x00fe;
    L_0x001e:
        if (r4 == r15) goto L_0x00e5;
    L_0x0020:
        if (r4 != r11) goto L_0x0023;
    L_0x0022:
        goto L_0x0084;
    L_0x0023:
        if (r4 == r14) goto L_0x0084;
    L_0x0025:
        if (r4 != r13) goto L_0x005b;
    L_0x0027:
        r1[r2] = r14;
        r1 = r0.a(r5);
        r2 = 58;
        if (r1 == r2) goto L_0x00fe;
    L_0x0031:
        r2 = 61;
        if (r1 != r2) goto L_0x0054;
    L_0x0035:
        r21.g();
        r1 = r0.c;
        r2 = r0.l;
        if (r1 >= r2) goto L_0x003f;
    L_0x003e:
        goto L_0x0045;
    L_0x003f:
        r1 = r0.b(r5);
        if (r1 == 0) goto L_0x00fe;
    L_0x0045:
        r1 = r0.b;
        r2 = r0.c;
        r1 = r1[r2];
        r11 = 62;
        if (r1 != r11) goto L_0x00fe;
    L_0x004f:
        r2 = r2 + r5;
        r0.c = r2;
        goto L_0x00fe;
    L_0x0054:
        r1 = "Expected ':'";
        r1 = r0.a(r1);
        throw r1;
    L_0x005b:
        if (r4 != r10) goto L_0x0061;
    L_0x005d:
        r1[r2] = r12;
        goto L_0x00fe;
    L_0x0061:
        if (r4 != r12) goto L_0x0078;
    L_0x0063:
        r1 = r0.a(r6);
        if (r1 != r3) goto L_0x006e;
    L_0x0069:
        r1 = 17;
        r0.d = r1;
        return r1;
    L_0x006e:
        r21.g();
        r1 = r0.c;
        r1 = r1 + r3;
        r0.c = r1;
        goto L_0x00fe;
    L_0x0078:
        if (r4 == r7) goto L_0x007c;
    L_0x007a:
        goto L_0x00fe;
    L_0x007c:
        r1 = new java.lang.IllegalStateException;
        r2 = "JsonReader is closed";
        r1.<init>(r2);
        throw r1;
    L_0x0084:
        r1[r2] = r13;
        if (r4 != r14) goto L_0x00a1;
    L_0x0088:
        r1 = r0.a(r5);
        if (r1 == r9) goto L_0x00a1;
    L_0x008e:
        if (r1 == r8) goto L_0x009e;
    L_0x0090:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r1 != r2) goto L_0x0097;
    L_0x0094:
        r0.d = r15;
        return r15;
    L_0x0097:
        r1 = "Unterminated object";
        r1 = r0.a(r1);
        throw r1;
    L_0x009e:
        r21.g();
    L_0x00a1:
        r1 = r0.a(r5);
        r2 = 34;
        if (r1 == r2) goto L_0x00e0;
    L_0x00a9:
        r2 = 39;
        if (r1 == r2) goto L_0x00d8;
    L_0x00ad:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r1 == r2) goto L_0x00cc;
    L_0x00b1:
        r21.g();
        r2 = r0.c;
        r2 = r2 + r3;
        r0.c = r2;
        r1 = (char) r1;
        r1 = r0.b(r1);
        if (r1 == 0) goto L_0x00c5;
    L_0x00c0:
        r1 = 14;
        r0.d = r1;
        return r1;
    L_0x00c5:
        r1 = "Expected name";
        r1 = r0.a(r1);
        throw r1;
    L_0x00cc:
        if (r4 == r14) goto L_0x00d1;
    L_0x00ce:
        r0.d = r15;
        return r15;
    L_0x00d1:
        r1 = "Expected name";
        r1 = r0.a(r1);
        throw r1;
    L_0x00d8:
        r21.g();
        r1 = 12;
        r0.d = r1;
        return r1;
    L_0x00e0:
        r1 = 13;
        r0.d = r1;
        return r1;
    L_0x00e5:
        r1 = r0.a(r5);
        if (r1 == r9) goto L_0x00fe;
    L_0x00eb:
        if (r1 == r8) goto L_0x00fb;
    L_0x00ed:
        r2 = 93;
        if (r1 != r2) goto L_0x00f4;
    L_0x00f1:
        r0.d = r13;
        return r13;
    L_0x00f4:
        r1 = "Unterminated array";
        r1 = r0.a(r1);
        throw r1;
    L_0x00fb:
        r21.g();
    L_0x00fe:
        r1 = r0.a(r5);
        r2 = 34;
        if (r1 == r2) goto L_0x02e5;
    L_0x0106:
        r2 = 39;
        if (r1 == r2) goto L_0x02df;
    L_0x010a:
        if (r1 == r9) goto L_0x02c6;
    L_0x010c:
        if (r1 == r8) goto L_0x02c6;
    L_0x010e:
        r2 = 91;
        if (r1 == r2) goto L_0x02c2;
    L_0x0112:
        r2 = 93;
        if (r1 == r2) goto L_0x02ba;
    L_0x0116:
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r1 == r2) goto L_0x02b6;
    L_0x011a:
        r1 = r0.c;
        r1 = r1 + r3;
        r0.c = r1;
        r2 = r0.b;
        r1 = r2[r1];
        r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r1 != r2) goto L_0x0128;
    L_0x0127:
        goto L_0x014d;
    L_0x0128:
        r2 = 84;
        if (r1 == r2) goto L_0x014d;
    L_0x012c:
        r2 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r1 != r2) goto L_0x0131;
    L_0x0130:
        goto L_0x0146;
    L_0x0131:
        r2 = 70;
        if (r1 == r2) goto L_0x0146;
    L_0x0135:
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r1 != r2) goto L_0x013a;
    L_0x0139:
        goto L_0x013f;
    L_0x013a:
        r2 = 78;
        if (r1 == r2) goto L_0x013f;
    L_0x013e:
        goto L_0x019f;
    L_0x013f:
        r1 = "null";
        r2 = "NULL";
        r3 = r2;
        r2 = 7;
        goto L_0x0153;
    L_0x0146:
        r1 = "false";
        r2 = "FALSE";
        r3 = r2;
        r2 = 6;
        goto L_0x0153;
    L_0x014d:
        r1 = "true";
        r2 = "TRUE";
        r3 = r2;
        r2 = 5;
    L_0x0153:
        r4 = r1.length();
        r7 = 1;
    L_0x0158:
        if (r7 >= r4) goto L_0x0181;
    L_0x015a:
        r8 = r0.c;
        r8 = r8 + r7;
        r9 = r0.l;
        if (r8 < r9) goto L_0x0169;
    L_0x0161:
        r8 = r7 + 1;
        r8 = r0.b(r8);
        if (r8 == 0) goto L_0x019f;
    L_0x0169:
        r8 = r0.b;
        r9 = r0.c;
        r9 = r9 + r7;
        r8 = r8[r9];
        r9 = r1.charAt(r7);
        if (r8 != r9) goto L_0x0177;
    L_0x0176:
        goto L_0x017e;
    L_0x0177:
        r9 = r3.charAt(r7);
        if (r8 == r9) goto L_0x017e;
    L_0x017d:
        goto L_0x019f;
    L_0x017e:
        r7 = r7 + 1;
        goto L_0x0158;
    L_0x0181:
        r1 = r0.c;
        r1 = r1 + r4;
        r3 = r0.l;
        if (r1 >= r3) goto L_0x0189;
    L_0x0188:
        goto L_0x0191;
    L_0x0189:
        r1 = r4 + 1;
        r1 = r0.b(r1);
        if (r1 == 0) goto L_0x01a1;
    L_0x0191:
        r1 = r0.b;
        r3 = r0.c;
        r3 = r3 + r4;
        r1 = r1[r3];
        r1 = r0.b(r1);
        if (r1 != 0) goto L_0x019f;
    L_0x019e:
        goto L_0x01a1;
    L_0x019f:
        r2 = 0;
        goto L_0x01a8;
    L_0x01a1:
        r1 = r0.c;
        r1 = r1 + r4;
        r0.c = r1;
        r0.d = r2;
    L_0x01a8:
        if (r2 != 0) goto L_0x02b5;
    L_0x01aa:
        r1 = r0.b;
        r2 = r0.c;
        r3 = r0.l;
        r7 = 0;
        r4 = r3;
        r12 = r7;
        r3 = 0;
        r9 = 0;
        r16 = 1;
        r17 = 0;
    L_0x01ba:
        r6 = r2 + r3;
        if (r6 == r4) goto L_0x01bf;
    L_0x01be:
        goto L_0x01ce;
    L_0x01bf:
        r2 = r1.length;
        if (r3 == r2) goto L_0x0295;
    L_0x01c2:
        r2 = r3 + 1;
        r2 = r0.b(r2);
        if (r2 == 0) goto L_0x0259;
    L_0x01ca:
        r2 = r0.c;
        r4 = r0.l;
    L_0x01ce:
        r6 = r2 + r3;
        r6 = r1[r6];
        r11 = 43;
        if (r6 == r11) goto L_0x0251;
    L_0x01d6:
        r11 = 69;
        if (r6 == r11) goto L_0x024a;
    L_0x01da:
        r11 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r6 == r11) goto L_0x024a;
    L_0x01de:
        r11 = 45;
        if (r6 == r11) goto L_0x0241;
    L_0x01e2:
        r11 = 46;
        if (r6 == r11) goto L_0x023d;
    L_0x01e6:
        r11 = 48;
        if (r6 < r11) goto L_0x0236;
    L_0x01ea:
        r11 = 57;
        if (r6 > r11) goto L_0x0236;
    L_0x01ee:
        if (r9 != r5) goto L_0x01f1;
    L_0x01f0:
        goto L_0x022f;
    L_0x01f1:
        if (r9 == 0) goto L_0x022f;
    L_0x01f3:
        if (r9 != r15) goto L_0x0223;
    L_0x01f5:
        r11 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1));
        if (r11 == 0) goto L_0x0295;
    L_0x01f9:
        r19 = 10;
        r19 = r19 * r12;
        r6 = r6 + -48;
        r5 = (long) r6;
        r19 = r19 - r5;
        r5 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r11 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1));
        if (r11 > 0) goto L_0x021b;
    L_0x020b:
        r5 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r11 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1));
        if (r11 != 0) goto L_0x0219;
    L_0x0214:
        r5 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1));
        if (r5 >= 0) goto L_0x0219;
    L_0x0218:
        goto L_0x021b;
    L_0x0219:
        r5 = 0;
        goto L_0x021c;
    L_0x021b:
        r5 = 1;
    L_0x021c:
        r5 = r16 & r5;
        r16 = r5;
        r12 = r19;
        goto L_0x0254;
    L_0x0223:
        r5 = 3;
        if (r9 == r5) goto L_0x022d;
    L_0x0226:
        if (r9 == r14) goto L_0x022b;
    L_0x0228:
        if (r9 == r10) goto L_0x022b;
    L_0x022a:
        goto L_0x0254;
    L_0x022b:
        r9 = 7;
        goto L_0x0254;
    L_0x022d:
        r9 = 4;
        goto L_0x0254;
    L_0x022f:
        r6 = r6 + -48;
        r5 = -r6;
        r5 = (long) r5;
        r12 = r5;
        r9 = 2;
        goto L_0x0254;
    L_0x0236:
        r1 = r0.b(r6);
        if (r1 != 0) goto L_0x0295;
    L_0x023c:
        goto L_0x0259;
    L_0x023d:
        if (r9 != r15) goto L_0x0295;
    L_0x023f:
        r9 = 3;
        goto L_0x0254;
    L_0x0241:
        if (r9 == 0) goto L_0x0246;
    L_0x0243:
        if (r9 != r14) goto L_0x0295;
    L_0x0245:
        goto L_0x0253;
    L_0x0246:
        r9 = 1;
        r17 = 1;
        goto L_0x0254;
    L_0x024a:
        if (r9 == r15) goto L_0x024f;
    L_0x024c:
        r5 = 4;
        if (r9 != r5) goto L_0x0295;
    L_0x024f:
        r9 = 5;
        goto L_0x0254;
    L_0x0251:
        if (r9 != r14) goto L_0x0295;
    L_0x0253:
        r9 = 6;
    L_0x0254:
        r3 = r3 + 1;
        r5 = 1;
        goto L_0x01ba;
    L_0x0259:
        if (r9 != r15) goto L_0x0280;
    L_0x025b:
        if (r16 == 0) goto L_0x0280;
    L_0x025d:
        r1 = -9223372036854775808;
        r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r4 == 0) goto L_0x0264;
    L_0x0263:
        goto L_0x0267;
    L_0x0264:
        if (r17 != 0) goto L_0x0267;
    L_0x0266:
        goto L_0x0280;
    L_0x0267:
        r1 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1));
        if (r1 != 0) goto L_0x026d;
    L_0x026b:
        if (r17 != 0) goto L_0x0280;
    L_0x026d:
        if (r17 != 0) goto L_0x0270;
    L_0x026f:
        r12 = -r12;
    L_0x0270:
        r0.e = r12;
        r1 = r0.c;
        r1 = r1 + r3;
        r0.c = r1;
        r1 = 15;
        r0.d = r1;
        r6 = 15;
        r18 = 15;
        goto L_0x0297;
    L_0x0280:
        if (r9 != r15) goto L_0x0283;
    L_0x0282:
        goto L_0x028a;
    L_0x0283:
        r1 = 4;
        if (r9 == r1) goto L_0x028a;
    L_0x0286:
        r1 = 7;
        if (r9 == r1) goto L_0x028a;
    L_0x0289:
        goto L_0x0295;
    L_0x028a:
        r0.f = r3;
        r1 = 16;
        r0.d = r1;
        r6 = 16;
        r18 = 16;
        goto L_0x0297;
    L_0x0295:
        r18 = 0;
    L_0x0297:
        if (r18 != 0) goto L_0x02b4;
    L_0x0299:
        r1 = r0.b;
        r2 = r0.c;
        r1 = r1[r2];
        r1 = r0.b(r1);
        if (r1 == 0) goto L_0x02ad;
    L_0x02a5:
        r21.g();
        r1 = 10;
        r0.d = r1;
        return r1;
    L_0x02ad:
        r1 = "Expected value";
        r1 = r0.a(r1);
        throw r1;
    L_0x02b4:
        return r18;
    L_0x02b5:
        return r2;
    L_0x02b6:
        r1 = 1;
        r0.d = r1;
        return r1;
    L_0x02ba:
        r1 = 1;
        if (r4 == r1) goto L_0x02be;
    L_0x02bd:
        goto L_0x02c7;
    L_0x02be:
        r2 = 4;
        r0.d = r2;
        return r2;
    L_0x02c2:
        r1 = 3;
        r0.d = r1;
        return r1;
    L_0x02c6:
        r1 = 1;
    L_0x02c7:
        if (r4 == r1) goto L_0x02d3;
    L_0x02c9:
        if (r4 != r15) goto L_0x02cc;
    L_0x02cb:
        goto L_0x02d3;
    L_0x02cc:
        r1 = "Unexpected value";
        r1 = r0.a(r1);
        throw r1;
    L_0x02d3:
        r21.g();
        r1 = r0.c;
        r1 = r1 + r3;
        r0.c = r1;
        r1 = 7;
        r0.d = r1;
        return r1;
    L_0x02df:
        r21.g();
        r0.d = r7;
        return r7;
    L_0x02e5:
        r1 = 9;
        r0.d = r1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anrx.b():int");
    }

    private final boolean b(char c) {
        if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
            if (c != '#') {
                if (c != ',') {
                    if (!(c == '/' || c == '=')) {
                        if (!(c == '{' || c == '}' || c == ':')) {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            g();
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:84:0x0128, code skipped:
            if (r1 != null) goto L_0x0137;
     */
    /* JADX WARNING: Missing block: B:85:0x012a, code skipped:
            r1 = r2 - r4;
            r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARNING: Missing block: B:86:0x0137, code skipped:
            r1.append(r0, r4, r2 - r4);
            r10.c = r2;
     */
    /* JADX WARNING: Missing block: B:87:0x0142, code skipped:
            if (b(1) == false) goto L_0x0146;
     */
    /* JADX WARNING: Missing block: B:90:0x014d, code skipped:
            throw a("Unterminated string");
     */
    public final java.lang.String a(char r11) {
        /*
        r10 = this;
        r0 = r10.b;
        r1 = 0;
    L_0x0003:
        r2 = r10.c;
        r3 = r10.l;
    L_0x0007:
        r4 = r2;
    L_0x0008:
        r5 = 16;
        r6 = 1;
        if (r2 >= r3) goto L_0x0128;
    L_0x000d:
        r7 = r2 + 1;
        r2 = r0[r2];
        if (r2 != r11) goto L_0x0028;
    L_0x0013:
        r10.c = r7;
        r7 = r7 - r4;
        r7 = r7 + -1;
        if (r1 != 0) goto L_0x0020;
    L_0x001a:
        r11 = new java.lang.String;
        r11.<init>(r0, r4, r7);
        return r11;
    L_0x0020:
        r1.append(r0, r4, r7);
        r11 = r1.toString();
        return r11;
    L_0x0028:
        r8 = 92;
        r9 = 10;
        if (r2 != r8) goto L_0x011c;
    L_0x002e:
        r10.c = r7;
        r7 = r7 - r4;
        r7 = r7 + -1;
        if (r1 != 0) goto L_0x0042;
    L_0x0035:
        r1 = r7 + 1;
        r2 = new java.lang.StringBuilder;
        r1 = r1 + r1;
        r1 = java.lang.Math.max(r1, r5);
        r2.<init>(r1);
        r1 = r2;
    L_0x0042:
        r1.append(r0, r4, r7);
        r2 = r10.c;
        r3 = r10.l;
        r4 = "Unterminated escape sequence";
        if (r2 != r3) goto L_0x0059;
    L_0x004d:
        r2 = r10.b(r6);
        if (r2 == 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0059;
    L_0x0054:
        r11 = r10.a(r4);
        throw r11;
    L_0x0059:
        r2 = r10.b;
        r3 = r10.c;
        r5 = r3 + 1;
        r10.c = r5;
        r2 = r2[r3];
        if (r2 == r9) goto L_0x010b;
    L_0x0065:
        r3 = 34;
        if (r2 == r3) goto L_0x0112;
    L_0x0069:
        r3 = 39;
        if (r2 == r3) goto L_0x0112;
    L_0x006d:
        r3 = 47;
        if (r2 == r3) goto L_0x0112;
    L_0x0071:
        if (r2 == r8) goto L_0x0112;
    L_0x0073:
        r3 = 98;
        if (r2 == r3) goto L_0x0108;
    L_0x0077:
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r2 == r3) goto L_0x0105;
    L_0x007b:
        r6 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r2 == r6) goto L_0x0113;
    L_0x007f:
        r6 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        if (r2 == r6) goto L_0x0102;
    L_0x0083:
        r6 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r2 == r6) goto L_0x00ff;
    L_0x0087:
        r6 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        if (r2 != r6) goto L_0x00f8;
    L_0x008b:
        r5 = r5 + 4;
        r2 = r10.l;
        r6 = 4;
        if (r5 <= r2) goto L_0x009e;
    L_0x0092:
        r2 = r10.b(r6);
        if (r2 == 0) goto L_0x0099;
    L_0x0098:
        goto L_0x009e;
    L_0x0099:
        r11 = r10.a(r4);
        throw r11;
    L_0x009e:
        r2 = r10.c;
        r4 = r2 + 4;
        r5 = 0;
        r9 = 0;
    L_0x00a4:
        if (r2 >= r4) goto L_0x00f2;
    L_0x00a6:
        r5 = r10.b;
        r5 = r5[r2];
        r7 = r9 << 4;
        r7 = (char) r7;
        r8 = 48;
        if (r5 < r8) goto L_0x00bb;
    L_0x00b1:
        r8 = 57;
        if (r5 > r8) goto L_0x00bb;
    L_0x00b5:
        r5 = r5 + -48;
    L_0x00b7:
        r7 = r7 + r5;
        r5 = (char) r7;
        r9 = r5;
        goto L_0x00cf;
    L_0x00bb:
        r8 = 97;
        if (r5 < r8) goto L_0x00c4;
    L_0x00bf:
        if (r5 > r3) goto L_0x00c4;
    L_0x00c1:
        r5 = r5 + -87;
        goto L_0x00b7;
    L_0x00c4:
        r8 = 65;
        if (r5 < r8) goto L_0x00d2;
    L_0x00c8:
        r8 = 70;
        if (r5 > r8) goto L_0x00d2;
    L_0x00cc:
        r5 = r5 + -55;
        goto L_0x00b7;
    L_0x00cf:
        r2 = r2 + 1;
        goto L_0x00a4;
    L_0x00d2:
        r11 = new java.lang.NumberFormatException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "\\u";
        r0.append(r1);
        r1 = new java.lang.String;
        r2 = r10.b;
        r3 = r10.c;
        r1.<init>(r2, r3, r6);
        r0.append(r1);
        r0 = r0.toString();
        r11.<init>(r0);
        throw r11;
    L_0x00f2:
        r2 = r10.c;
        r2 = r2 + r6;
        r10.c = r2;
        goto L_0x0113;
    L_0x00f8:
        r11 = "Invalid escape sequence";
        r11 = r10.a(r11);
        throw r11;
    L_0x00ff:
        r9 = 9;
        goto L_0x0113;
    L_0x0102:
        r9 = 13;
        goto L_0x0113;
    L_0x0105:
        r9 = 12;
        goto L_0x0113;
    L_0x0108:
        r9 = 8;
        goto L_0x0113;
    L_0x010b:
        r3 = r10.m;
        r3 = r3 + r6;
        r10.m = r3;
        r10.n = r5;
    L_0x0112:
        r9 = r2;
    L_0x0113:
        r1.append(r9);
        r2 = r10.c;
        r3 = r10.l;
        goto L_0x0007;
    L_0x011c:
        if (r2 != r9) goto L_0x0125;
    L_0x011e:
        r2 = r10.m;
        r2 = r2 + r6;
        r10.m = r2;
        r10.n = r7;
    L_0x0125:
        r2 = r7;
        goto L_0x0008;
    L_0x0128:
        if (r1 != 0) goto L_0x0137;
    L_0x012a:
        r1 = r2 - r4;
        r3 = new java.lang.StringBuilder;
        r1 = r1 + r1;
        r1 = java.lang.Math.max(r1, r5);
        r3.<init>(r1);
        r1 = r3;
    L_0x0137:
        r3 = r2 - r4;
        r1.append(r0, r4, r3);
        r10.c = r2;
        r2 = r10.b(r6);
        if (r2 == 0) goto L_0x0146;
    L_0x0144:
        goto L_0x0003;
    L_0x0146:
        r11 = "Unterminated string";
        r11 = r10.a(r11);
        goto L_0x014e;
    L_0x014d:
        throw r11;
    L_0x014e:
        goto L_0x014d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anrx.a(char):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARNING: Missing block: B:32:0x0049, code skipped:
            g();
     */
    public final java.lang.String c() {
        /*
        r5 = this;
        r0 = 0;
        r1 = 0;
        r2 = r1;
    L_0x0003:
        r1 = 0;
    L_0x0004:
        r3 = r5.c;
        r3 = r3 + r1;
        r4 = r5.l;
        if (r3 >= r4) goto L_0x004d;
    L_0x000b:
        r4 = r5.b;
        r3 = r4[r3];
        r4 = 9;
        if (r3 == r4) goto L_0x005a;
    L_0x0013:
        r4 = 10;
        if (r3 == r4) goto L_0x005a;
    L_0x0017:
        r4 = 12;
        if (r3 == r4) goto L_0x005a;
    L_0x001b:
        r4 = 13;
        if (r3 == r4) goto L_0x005a;
    L_0x001f:
        r4 = 32;
        if (r3 == r4) goto L_0x005a;
    L_0x0023:
        r4 = 35;
        if (r3 == r4) goto L_0x0049;
    L_0x0027:
        r4 = 44;
        if (r3 == r4) goto L_0x005a;
    L_0x002b:
        r4 = 47;
        if (r3 == r4) goto L_0x0049;
    L_0x002f:
        r4 = 61;
        if (r3 == r4) goto L_0x0049;
    L_0x0033:
        r4 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r3 == r4) goto L_0x005a;
    L_0x0037:
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r3 == r4) goto L_0x005a;
    L_0x003b:
        r4 = 58;
        if (r3 == r4) goto L_0x005a;
    L_0x003f:
        r4 = 59;
        if (r3 == r4) goto L_0x0049;
    L_0x0043:
        switch(r3) {
            case 91: goto L_0x005a;
            case 92: goto L_0x0049;
            case 93: goto L_0x005a;
            default: goto L_0x0046;
        };
    L_0x0046:
        r1 = r1 + 1;
        goto L_0x0004;
    L_0x0049:
        r5.g();
        goto L_0x005a;
    L_0x004d:
        r3 = r5.b;
        r3 = r3.length;
        if (r1 >= r3) goto L_0x005c;
    L_0x0052:
        r3 = r1 + 1;
        r3 = r5.b(r3);
        if (r3 != 0) goto L_0x0004;
    L_0x005a:
        r0 = r1;
        goto L_0x007c;
    L_0x005c:
        if (r2 != 0) goto L_0x0069;
    L_0x005e:
        r2 = new java.lang.StringBuilder;
        r3 = 16;
        r3 = java.lang.Math.max(r1, r3);
        r2.<init>(r3);
    L_0x0069:
        r3 = r5.b;
        r4 = r5.c;
        r2.append(r3, r4, r1);
        r3 = r5.c;
        r3 = r3 + r1;
        r5.c = r3;
        r1 = 1;
        r1 = r5.b(r1);
        if (r1 != 0) goto L_0x0003;
    L_0x007c:
        if (r2 != 0) goto L_0x0088;
    L_0x007e:
        r1 = new java.lang.String;
        r2 = r5.b;
        r3 = r5.c;
        r1.<init>(r2, r3, r0);
        goto L_0x0093;
    L_0x0088:
        r1 = r5.b;
        r3 = r5.c;
        r2.append(r1, r3, r0);
        r1 = r2.toString();
    L_0x0093:
        r2 = r5.c;
        r2 = r2 + r0;
        r5.c = r2;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anrx.c():java.lang.String");
    }

    public final void close() {
        this.d = 0;
        this.o[0] = 8;
        this.h = 1;
        this.k.close();
    }

    public final void a(int i) {
        int i2 = this.h;
        int[] iArr = this.o;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            String[] strArr = new String[i3];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.j, 0, iArr3, 0, this.h);
            System.arraycopy(this.i, 0, strArr, 0, this.h);
            this.o = iArr2;
            this.j = iArr3;
            this.i = strArr;
        }
        int[] iArr4 = this.o;
        int i4 = this.h;
        this.h = i4 + 1;
        iArr4[i4] = i;
    }

    private final boolean b(int i) {
        char[] cArr = this.b;
        int i2 = this.n;
        int i3 = this.c;
        this.n = i2 - i3;
        i2 = this.l;
        if (i2 != i3) {
            i2 -= i3;
            this.l = i2;
            System.arraycopy(cArr, i3, cArr, 0, i2);
        } else {
            this.l = 0;
        }
        this.c = 0;
        while (true) {
            Reader reader = this.k;
            i3 = this.l;
            i2 = reader.read(cArr, i3, cArr.length - i3);
            if (i2 == -1) {
                return false;
            }
            i3 = this.l + i2;
            this.l = i3;
            if (this.m == 0 && this.n == 0 && i3 > 0 && cArr[0] == 65279) {
                this.c++;
                this.n = 1;
                i++;
            }
            if (i3 >= i) {
                return true;
            }
        }
    }

    private final int a(boolean z) {
        char[] cArr = this.b;
        int i = this.c;
        int i2 = this.l;
        while (true) {
            if (i == i2) {
                this.c = i;
                if (b(1)) {
                    i = this.c;
                    i2 = this.l;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("End of input");
                    stringBuilder.append(d());
                    throw new EOFException(stringBuilder.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.m++;
                this.n = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.c = i3;
                    if (i3 == i2) {
                        this.c = i3 - 1;
                        boolean b = b(2);
                        this.c++;
                        if (!b) {
                            return 47;
                        }
                    }
                    g();
                    i2 = this.c;
                    char c2 = cArr[i2];
                    if (c2 == '*') {
                        this.c = i2 + 1;
                        while (true) {
                            if (this.c + 2 <= this.l || b(2)) {
                                char[] cArr2 = this.b;
                                i3 = this.c;
                                if (cArr2[i3] != 10) {
                                    i2 = 0;
                                    while (i2 < 2) {
                                        if (this.b[this.c + i2] == "*/".charAt(i2)) {
                                            i2++;
                                        }
                                    }
                                    i = 2 + this.c;
                                    i2 = this.l;
                                    break;
                                }
                                this.m++;
                                this.n = i3 + 1;
                                this.c++;
                            } else {
                                throw a("Unterminated comment");
                            }
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.c = i2 + 1;
                        h();
                        i = this.c;
                        i2 = this.l;
                    }
                } else if (c == '#') {
                    this.c = i3;
                    g();
                    h();
                    i = this.c;
                    i2 = this.l;
                } else {
                    this.c = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private final void g() {
        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void h() {
        char c;
        do {
            if (this.c < this.l || b(1)) {
                char[] cArr = this.b;
                int i = this.c;
                int i2 = i + 1;
                this.c = i2;
                c = cArr[i];
                if (c == 10) {
                    this.m++;
                    this.n = i2;
                }
            }
            return;
        } while (c != 13);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(d());
        return stringBuilder.toString();
    }

    public final String d() {
        int i = this.m;
        int i2 = this.c;
        int i3 = this.n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at line ");
        stringBuilder.append(i + 1);
        stringBuilder.append(" column ");
        stringBuilder.append((i2 - i3) + 1);
        stringBuilder.append(" path ");
        stringBuilder.append(e());
        return stringBuilder.toString();
    }

    public final String e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.o[i2];
            if (i3 == 1 || i3 == 2) {
                stringBuilder.append('[');
                stringBuilder.append(this.j[i2]);
                stringBuilder.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                stringBuilder.append('.');
                String str = this.i[i2];
                if (str != null) {
                    stringBuilder.append(str);
                }
            }
        }
        return stringBuilder.toString();
    }

    private final IOException a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(d());
        throw new anry(stringBuilder.toString());
    }

    static {
        ")]}'\n".toCharArray();
        anrw anrw = new anrw();
    }

    public final int f() {
        int i = this.d;
        if (i == 0) {
            i = b();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }
}
