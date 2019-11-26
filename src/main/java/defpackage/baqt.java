package defpackage;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* renamed from: baqt */
public final class baqt implements baqw {
    public final barf a;
    public final BufferedInputStream b;
    public int c;
    public int d;
    public String e;
    public baqv f;
    public Map g;
    public Map h;
    public String i;
    private final OutputStream j;
    private baqn k;
    private final String l;
    private String m;
    private final /* synthetic */ baqk n;

    public baqt(baqk baqk, barf barf, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.n = baqk;
        this.a = barf;
        this.b = new BufferedInputStream(inputStream, 8192);
        this.j = outputStream;
        String str = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        this.l = str;
        if (!(inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress())) {
            inetAddress.getHostName().toString();
        }
        this.h = new HashMap();
    }

    public final void a(String str, Map map) {
        String str2 = "";
        if (str != null) {
            this.i = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
                int indexOf = str.indexOf(61);
                if (indexOf >= 0) {
                    map.put(baqk.b(str.substring(0, indexOf)).trim(), baqk.b(str.substring(indexOf + 1)));
                } else {
                    map.put(baqk.b(str).trim(), str2);
                }
            }
            return;
        }
        this.i = str2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:166:0x02f1=Splitter:B:166:0x02f1, B:173:0x0314=Splitter:B:173:0x0314, B:184:0x0349=Splitter:B:184:0x0349, B:194:0x037f=Splitter:B:194:0x037f} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0245 A:{Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c8 A:{SYNTHETIC, Splitter:B:102:0x01c8} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0380 A:{Catch:{ all -> 0x0230 }, Splitter:B:1:0x000c, ExcHandler: SocketException (r0_22 'e' java.net.SocketException A:{Catch:{  }})} */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x037c A:{Splitter:B:1:0x000c, ExcHandler: SocketTimeoutException (r0_21 'e' java.net.SocketTimeoutException)} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e7 A:{Splitter:B:39:0x006c, ExcHandler: all (r0_16 'th' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0380 A:{Catch:{ all -> 0x0230 }, Splitter:B:1:0x000c, ExcHandler: SocketException (r0_22 'e' java.net.SocketException A:{Catch:{  }})} */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x037c A:{Splitter:B:1:0x000c, ExcHandler: SocketTimeoutException (r0_21 'e' java.net.SocketTimeoutException)} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0361 A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x035b A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x032a A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0324 A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e7 A:{Splitter:B:39:0x006c, ExcHandler: all (r0_16 'th' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ec A:{Splitter:B:1:0x000c, ExcHandler: barb (e barb)} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e7 A:{Splitter:B:39:0x006c, ExcHandler: all (r0_16 'th' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x035b A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0361 A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0324 A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x032a A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0380 A:{Catch:{ all -> 0x0230 }, Splitter:B:1:0x000c, ExcHandler: SocketException (r0_22 'e' java.net.SocketException A:{Catch:{  }})} */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x037c A:{Splitter:B:1:0x000c, ExcHandler: SocketTimeoutException (r0_21 'e' java.net.SocketTimeoutException)} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02e3 A:{Splitter:B:4:0x000f, ExcHandler: SSLException (r0_14 'e' javax.net.ssl.SSLException)} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02df A:{Splitter:B:39:0x006c, ExcHandler: IOException (r0_13 'e' java.io.IOException)} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ec A:{Splitter:B:1:0x000c, ExcHandler: barb (e barb)} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e7 A:{Splitter:B:39:0x006c, ExcHandler: all (r0_16 'th' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0380 A:{Catch:{ all -> 0x0230 }, Splitter:B:1:0x000c, ExcHandler: SocketException (r0_22 'e' java.net.SocketException A:{Catch:{  }})} */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x037c A:{Splitter:B:1:0x000c, ExcHandler: SocketTimeoutException (r0_21 'e' java.net.SocketTimeoutException)} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0361 A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x035b A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x032a A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0324 A:{Catch:{ all -> 0x0230 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ec A:{Splitter:B:1:0x000c, ExcHandler: barb (e barb)} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e7 A:{Splitter:B:39:0x006c, ExcHandler: all (r0_16 'th' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a1 A:{Catch:{ SSLException -> 0x02cd, IOException -> 0x02bb, SocketException -> 0x0380, SocketTimeoutException -> 0x037c, barb -> 0x02ec, all -> 0x02e7, SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x029b A:{Catch:{ SSLException -> 0x02cd, IOException -> 0x02bb, SocketException -> 0x0380, SocketTimeoutException -> 0x037c, barb -> 0x02ec, all -> 0x02e7, SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02d2 A:{PHI: r17 , Splitter:B:64:0x00e3, ExcHandler: barb (e barb)} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e7 A:{Splitter:B:39:0x006c, ExcHandler: all (r0_16 'th' java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:37:0x0066, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:38:0x0067, code skipped:
            r2 = r0;
            r17 = r5;
     */
    /* JADX WARNING: Missing block: B:135:0x0285, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:136:0x0286, code skipped:
            r17 = r5;
     */
    /* JADX WARNING: Missing block: B:139:0x029b, code skipped:
            r6 = new java.lang.String(r3);
     */
    /* JADX WARNING: Missing block: B:140:0x02a1, code skipped:
            r6 = r3.concat(r6);
     */
    /* JADX WARNING: Missing block: B:145:0x02bb, code skipped:
            r17 = r5;
            defpackage.baqk.a(r1.b);
            defpackage.baqk.a(r1.j);
     */
    /* JADX WARNING: Missing block: B:147:0x02cc, code skipped:
            throw new java.net.SocketException(r4);
     */
    /* JADX WARNING: Missing block: B:148:0x02cd, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:149:0x02ce, code skipped:
            r17 = r5;
     */
    /* JADX WARNING: Missing block: B:150:0x02d1, code skipped:
            throw r0;
     */
    /* JADX WARNING: Missing block: B:151:0x02d2, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:152:0x02d4, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:153:0x02d5, code skipped:
            r2 = r0;
            r4 = r17;
     */
    /* JADX WARNING: Missing block: B:154:0x02d9, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:155:0x02da, code skipped:
            r2 = r0;
            r4 = r17;
     */
    /* JADX WARNING: Missing block: B:156:0x02df, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:157:0x02e0, code skipped:
            r2 = r0;
            r4 = r5;
     */
    /* JADX WARNING: Missing block: B:158:0x02e3, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:159:0x02e4, code skipped:
            r2 = r0;
            r4 = r5;
     */
    /* JADX WARNING: Missing block: B:160:0x02e7, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:161:0x02e8, code skipped:
            r2 = r0;
            r7 = null;
     */
    /* JADX WARNING: Missing block: B:162:0x02ec, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:163:0x02ed, code skipped:
            r17 = r5;
     */
    /* JADX WARNING: Missing block: B:164:0x02ef, code skipped:
            r2 = r0;
     */
    /* JADX WARNING: Missing block: B:165:0x02f0, code skipped:
            r7 = null;
     */
    /* JADX WARNING: Missing block: B:176:0x0324, code skipped:
            r2 = new java.lang.String(r3);
     */
    /* JADX WARNING: Missing block: B:177:0x032a, code skipped:
            r2 = r3.concat(r2);
     */
    /* JADX WARNING: Missing block: B:187:0x035b, code skipped:
            r2 = new java.lang.String(r5);
     */
    /* JADX WARNING: Missing block: B:188:0x0361, code skipped:
            r2 = r5.concat(r2);
     */
    /* JADX WARNING: Missing block: B:192:0x037c, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:193:0x037d, code skipped:
            r2 = r0;
            r7 = null;
     */
    /* JADX WARNING: Missing block: B:196:0x0380, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:197:0x0381, code skipped:
            r2 = r0;
     */
    public final void a() {
        /*
        r18 = this;
        r1 = r18;
        r2 = "connection";
        r3 = "SERVER INTERNAL ERROR: IOException: ";
        r4 = "NanoHttpd Shutdown";
        r5 = "text/plain";
        r6 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r8 = new byte[r6];	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x0345, IOException -> 0x0310, barb -> 0x02ec, all -> 0x02e7 }
        r9 = 0;
        r1.c = r9;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r1.d = r9;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r10 = r1.b;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r10.mark(r6);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r10 = r1.b;	 Catch:{ SSLException -> 0x02cd, IOException -> 0x02bb, SocketException -> 0x0380, SocketTimeoutException -> 0x037c, barb -> 0x02ec, all -> 0x02e7 }
        r10 = r10.read(r8, r9, r6);	 Catch:{ SSLException -> 0x02cd, IOException -> 0x02bb, SocketException -> 0x0380, SocketTimeoutException -> 0x037c, barb -> 0x02ec, all -> 0x02e7 }
        r11 = -1;
        if (r10 == r11) goto L_0x02a9;
    L_0x0021:
        if (r10 <= 0) goto L_0x006c;
    L_0x0023:
        r11 = r1.d;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r11 = r11 + r10;
        r1.d = r11;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r10 = 0;
    L_0x0029:
        r12 = r10 + 1;
        if (r12 >= r11) goto L_0x0056;
    L_0x002d:
        r13 = r8[r10];	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r14 = 13;
        r15 = 10;
        if (r13 != r14) goto L_0x004a;
    L_0x0035:
        r13 = r8[r12];	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        if (r13 != r15) goto L_0x0054;
    L_0x0039:
        r13 = r10 + 3;
        if (r13 >= r11) goto L_0x0054;
    L_0x003d:
        r16 = r10 + 2;
        r7 = r8[r16];	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        if (r7 != r14) goto L_0x0054;
    L_0x0043:
        r7 = r8[r13];	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        if (r7 != r15) goto L_0x0054;
    L_0x0047:
        r7 = r10 + 4;
        goto L_0x0057;
    L_0x004a:
        if (r13 == r15) goto L_0x004d;
    L_0x004c:
        goto L_0x0054;
    L_0x004d:
        r7 = r8[r12];	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        if (r7 != r15) goto L_0x0054;
    L_0x0051:
        r7 = r10 + 2;
        goto L_0x0057;
    L_0x0054:
        r10 = r12;
        goto L_0x0029;
    L_0x0056:
        r7 = 0;
    L_0x0057:
        r1.c = r7;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        if (r7 > 0) goto L_0x006c;
    L_0x005b:
        r7 = r1.b;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r10 = r1.d;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r11 = 8192 - r10;
        r10 = r7.read(r8, r10, r11);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        goto L_0x0021;
    L_0x0066:
        r0 = move-exception;
        r2 = r0;
        r17 = r5;
        goto L_0x02f0;
    L_0x006c:
        r6 = r1.c;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r7 = r1.d;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        if (r6 >= r7) goto L_0x007f;
    L_0x0072:
        r6 = r1.b;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r6.reset();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r6 = r1.b;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r7 = r1.c;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r10 = (long) r7;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r6.skip(r10);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
    L_0x007f:
        r6 = new java.util.HashMap;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r6.<init>();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r1.g = r6;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r6 = r1.h;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        if (r6 != 0) goto L_0x0092;
    L_0x008a:
        r6 = new java.util.HashMap;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r6.<init>();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        r1.h = r6;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x0066, all -> 0x02e7 }
        goto L_0x0095;
    L_0x0092:
        r6.clear();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
    L_0x0095:
        r6 = new java.io.BufferedReader;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r7 = new java.io.InputStreamReader;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r10 = new java.io.ByteArrayInputStream;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r11 = r1.d;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r10.<init>(r8, r9, r11);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r7.<init>(r10);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r6.<init>(r7);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r7 = new java.util.HashMap;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r7.<init>();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r8 = r1.g;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r10 = r1.h;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02e3, IOException -> 0x02df, barb -> 0x02ec, all -> 0x02e7 }
        r11 = r6.readLine();	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        r12 = "HTTP/1.1";
        r13 = "uri";
        r14 = "method";
        if (r11 == 0) goto L_0x016a;
    L_0x00bb:
        r15 = new java.util.StringTokenizer;	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        r15.<init>(r11);	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        r11 = r15.hasMoreTokens();	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        if (r11 == 0) goto L_0x015b;
    L_0x00c6:
        r11 = r15.nextToken();	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        r7.put(r14, r11);	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        r11 = r15.hasMoreTokens();	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        if (r11 == 0) goto L_0x014f;
    L_0x00d3:
        r11 = r15.nextToken();	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        r9 = 63;
        r9 = r11.indexOf(r9);	 Catch:{ IOException -> 0x0285, barb -> 0x02ec, all -> 0x02e7 }
        if (r9 < 0) goto L_0x00f4;
    L_0x00df:
        r17 = r5;
        r5 = r9 + 1;
        r5 = r11.substring(r5);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r1.a(r5, r8);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r5 = 0;
        r8 = r11.substring(r5, r9);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r5 = defpackage.baqk.b(r8);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        goto L_0x00fa;
    L_0x00f4:
        r17 = r5;
        r5 = defpackage.baqk.b(r11);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
    L_0x00fa:
        r8 = r15.hasMoreTokens();	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        if (r8 != 0) goto L_0x010c;
    L_0x0100:
        r1.m = r12;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r8 = defpackage.baqk.d;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r9 = java.util.logging.Level.FINE;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r11 = "no protocol version specified, strange. Assuming HTTP/1.1.";
        r8.log(r9, r11);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        goto L_0x0112;
    L_0x010c:
        r8 = r15.nextToken();	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r1.m = r8;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
    L_0x0112:
        r8 = r6.readLine();	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
    L_0x0116:
        if (r8 == 0) goto L_0x014b;
    L_0x0118:
        r9 = r8.trim();	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r9 = r9.isEmpty();	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        if (r9 != 0) goto L_0x014b;
    L_0x0122:
        r9 = 58;
        r9 = r8.indexOf(r9);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        if (r9 < 0) goto L_0x0146;
    L_0x012a:
        r11 = 0;
        r15 = r8.substring(r11, r9);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r11 = r15.trim();	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r15 = java.util.Locale.US;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r11 = r11.toLowerCase(r15);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r9 = r9 + 1;
        r8 = r8.substring(r9);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r8 = r8.trim();	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r10.put(r11, r8);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
    L_0x0146:
        r8 = r6.readLine();	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        goto L_0x0116;
    L_0x014b:
        r7.put(r13, r5);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        goto L_0x016c;
    L_0x014f:
        r17 = r5;
        r2 = new barb;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r4 = defpackage.barc.BAD_REQUEST;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r5 = "BAD REQUEST: Missing URI. Usage: GET /example/file.html";
        r2.<init>(r4, r5);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        throw r2;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
    L_0x015b:
        r17 = r5;
        r2 = new barb;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r4 = defpackage.barc.BAD_REQUEST;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        r5 = "BAD REQUEST: Syntax error. Usage: GET /example/file.html";
        r2.<init>(r4, r5);	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
        throw r2;	 Catch:{ IOException -> 0x0167, barb -> 0x02d2, all -> 0x02e7 }
    L_0x0167:
        r0 = move-exception;
        goto L_0x0288;
    L_0x016a:
        r17 = r5;
    L_0x016c:
        r5 = r1.l;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        if (r5 == 0) goto L_0x0180;
    L_0x0170:
        r6 = r1.h;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r8 = "remote-addr";
        r6.put(r8, r5);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = r1.h;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6 = "http-client-ip";
        r8 = r1.l;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5.put(r6, r8);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
    L_0x0180:
        r5 = r7.get(r14);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = (java.lang.String) r5;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = defpackage.baqv.a(r5);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r1.f = r5;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = r1.f;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        if (r5 == 0) goto L_0x0257;
    L_0x0190:
        r5 = r7.get(r13);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = (java.lang.String) r5;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r1.e = r5;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = new baqn;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6 = r1.h;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5.<init>(r6);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r1.k = r5;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = r1.h;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = r5.get(r2);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = (java.lang.String) r5;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6 = r1.m;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6 = r12.equals(r6);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r9 = 1;
        if (r6 != 0) goto L_0x01b4;
    L_0x01b2:
        r5 = 0;
        goto L_0x01c0;
    L_0x01b4:
        if (r5 == 0) goto L_0x01bf;
    L_0x01b6:
        r6 = "(?i).*close.*";
        r5 = r5.matches(r6);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        if (r5 == 0) goto L_0x01bf;
    L_0x01be:
        goto L_0x01b2;
    L_0x01bf:
        r5 = 1;
    L_0x01c0:
        r6 = r1.n;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r7 = r6.a(r1);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        if (r7 == 0) goto L_0x0245;
    L_0x01c8:
        r6 = r1.h;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r8 = "accept-encoding";
        r6.get(r8);	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r6 = r1.k;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r6 = r6.a;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r6 = r6.iterator();	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
    L_0x01d7:
        r8 = r6.hasNext();	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        if (r8 == 0) goto L_0x0200;
    L_0x01dd:
        r8 = r6.next();	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r8 = (defpackage.baqo) r8;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r10 = "Set-Cookie";
        r11 = "%s=%s; expires=%s";
        r12 = 3;
        r12 = new java.lang.Object[r12];	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r13 = r8.a;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r14 = 0;
        r12[r14] = r13;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r13 = r8.b;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r12[r9] = r13;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r8 = r8.c;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r13 = 2;
        r12[r13] = r8;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r8 = java.lang.String.format(r11, r12);	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r7.a(r10, r8);	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        goto L_0x01d7;
    L_0x0200:
        r6 = r1.f;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r7.c = r6;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r6 = r1.n;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r6.c();	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r6 = 0;
        r7.d = r6;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r7.e = r5;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r6 = r1.j;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r7.a(r6);	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        if (r5 == 0) goto L_0x022a;
    L_0x0215:
        r5 = "close";
        r2 = r7.a(r2);	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r2 = r5.equals(r2);	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        if (r2 != 0) goto L_0x022a;
    L_0x0221:
        defpackage.baqk.a(r7);
        r2 = r1.a;
        r2.a();
        return;
    L_0x022a:
        r2 = new java.net.SocketException;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r2.<init>(r4);	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        throw r2;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
    L_0x0230:
        r0 = move-exception;
        goto L_0x0384;
    L_0x0233:
        r0 = move-exception;
        r2 = r0;
        goto L_0x02f1;
    L_0x0237:
        r0 = move-exception;
        r2 = r0;
        goto L_0x024f;
    L_0x023a:
        r0 = move-exception;
        r2 = r0;
        goto L_0x0253;
    L_0x023d:
        r0 = move-exception;
        r2 = r0;
        goto L_0x037f;
    L_0x0241:
        r0 = move-exception;
        r2 = r0;
        goto L_0x0383;
    L_0x0245:
        r2 = new barb;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r4 = defpackage.barc.INTERNAL_ERROR;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        r5 = "SERVER INTERNAL ERROR: Serve() returned a null response.";
        r2.<init>(r4, r5);	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
        throw r2;	 Catch:{ SocketException -> 0x0241, SocketTimeoutException -> 0x023d, SSLException -> 0x023a, IOException -> 0x0237, barb -> 0x0233 }
    L_0x024f:
        r4 = r17;
        goto L_0x0314;
    L_0x0253:
        r4 = r17;
        goto L_0x0349;
    L_0x0257:
        r2 = new barb;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r4 = defpackage.barc.BAD_REQUEST;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = r7.get(r14);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = (java.lang.String) r5;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6 = new java.lang.StringBuilder;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r7 = java.lang.String.valueOf(r5);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r7 = r7.length();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r7 = r7 + 48;
        r6.<init>(r7);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r7 = "BAD REQUEST: Syntax error. HTTP verb ";
        r6.append(r7);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6.append(r5);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = " unhandled.";
        r6.append(r5);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = r6.toString();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r2.<init>(r4, r5);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        throw r2;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
    L_0x0285:
        r0 = move-exception;
        r17 = r5;
    L_0x0288:
        r2 = r0;
        r4 = new barb;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r5 = defpackage.barc.INTERNAL_ERROR;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6 = r2.getMessage();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r7 = r6.length();	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        if (r7 != 0) goto L_0x02a1;
    L_0x029b:
        r6 = new java.lang.String;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r6.<init>(r3);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        goto L_0x02a5;
    L_0x02a1:
        r6 = r3.concat(r6);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
    L_0x02a5:
        r4.<init>(r5, r6, r2);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        throw r4;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
    L_0x02a9:
        r17 = r5;
        r2 = r1.b;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        defpackage.baqk.a(r2);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r2 = r1.j;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        defpackage.baqk.a(r2);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r2 = new java.net.SocketException;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r2.<init>(r4);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        throw r2;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
    L_0x02bb:
        r17 = r5;
        r2 = r1.b;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        defpackage.baqk.a(r2);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r2 = r1.j;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        defpackage.baqk.a(r2);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r2 = new java.net.SocketException;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        r2.<init>(r4);	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
        throw r2;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
    L_0x02cd:
        r0 = move-exception;
        r17 = r5;
        r2 = r0;
        throw r2;	 Catch:{ SocketException -> 0x0380, SocketTimeoutException -> 0x037c, SSLException -> 0x02d9, IOException -> 0x02d4, barb -> 0x02d2, all -> 0x02e7 }
    L_0x02d2:
        r0 = move-exception;
        goto L_0x02ef;
    L_0x02d4:
        r0 = move-exception;
        r2 = r0;
        r4 = r17;
        goto L_0x0313;
    L_0x02d9:
        r0 = move-exception;
        r2 = r0;
        r4 = r17;
        goto L_0x0348;
    L_0x02df:
        r0 = move-exception;
        r2 = r0;
        r4 = r5;
        goto L_0x0313;
    L_0x02e3:
        r0 = move-exception;
        r2 = r0;
        r4 = r5;
        goto L_0x0348;
    L_0x02e7:
        r0 = move-exception;
        r2 = r0;
        r7 = 0;
        goto L_0x0385;
    L_0x02ec:
        r0 = move-exception;
        r17 = r5;
    L_0x02ef:
        r2 = r0;
    L_0x02f0:
        r7 = 0;
    L_0x02f1:
        r3 = r2.a;	 Catch:{ all -> 0x0230 }
        r2 = r2.getMessage();	 Catch:{ all -> 0x0230 }
        r4 = r17;
        r2 = defpackage.baqk.a(r3, r4, r2);	 Catch:{ all -> 0x0230 }
        r3 = r1.j;	 Catch:{ all -> 0x0230 }
        r2.a(r3);	 Catch:{ all -> 0x0230 }
        r2 = r1.j;	 Catch:{ all -> 0x0230 }
        defpackage.baqk.a(r2);	 Catch:{ all -> 0x0230 }
        defpackage.baqk.a(r7);
        r2 = r1.a;
        r2.a();
        return;
    L_0x0310:
        r0 = move-exception;
        r4 = r5;
        r2 = r0;
    L_0x0313:
        r7 = 0;
    L_0x0314:
        r5 = defpackage.barc.INTERNAL_ERROR;	 Catch:{ all -> 0x0230 }
        r2 = r2.getMessage();	 Catch:{ all -> 0x0230 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0230 }
        r6 = r2.length();	 Catch:{ all -> 0x0230 }
        if (r6 != 0) goto L_0x032a;
    L_0x0324:
        r2 = new java.lang.String;	 Catch:{ all -> 0x0230 }
        r2.<init>(r3);	 Catch:{ all -> 0x0230 }
        goto L_0x032e;
    L_0x032a:
        r2 = r3.concat(r2);	 Catch:{ all -> 0x0230 }
    L_0x032e:
        r2 = defpackage.baqk.a(r5, r4, r2);	 Catch:{ all -> 0x0230 }
        r3 = r1.j;	 Catch:{ all -> 0x0230 }
        r2.a(r3);	 Catch:{ all -> 0x0230 }
        r2 = r1.j;	 Catch:{ all -> 0x0230 }
        defpackage.baqk.a(r2);	 Catch:{ all -> 0x0230 }
        defpackage.baqk.a(r7);
        r2 = r1.a;
        r2.a();
        return;
    L_0x0345:
        r0 = move-exception;
        r4 = r5;
        r2 = r0;
    L_0x0348:
        r7 = 0;
    L_0x0349:
        r3 = defpackage.barc.INTERNAL_ERROR;	 Catch:{ all -> 0x0230 }
        r5 = "SSL PROTOCOL FAILURE: ";
        r2 = r2.getMessage();	 Catch:{ all -> 0x0230 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0230 }
        r6 = r2.length();	 Catch:{ all -> 0x0230 }
        if (r6 != 0) goto L_0x0361;
    L_0x035b:
        r2 = new java.lang.String;	 Catch:{ all -> 0x0230 }
        r2.<init>(r5);	 Catch:{ all -> 0x0230 }
        goto L_0x0365;
    L_0x0361:
        r2 = r5.concat(r2);	 Catch:{ all -> 0x0230 }
    L_0x0365:
        r2 = defpackage.baqk.a(r3, r4, r2);	 Catch:{ all -> 0x0230 }
        r3 = r1.j;	 Catch:{ all -> 0x0230 }
        r2.a(r3);	 Catch:{ all -> 0x0230 }
        r2 = r1.j;	 Catch:{ all -> 0x0230 }
        defpackage.baqk.a(r2);	 Catch:{ all -> 0x0230 }
        defpackage.baqk.a(r7);
        r2 = r1.a;
        r2.a();
        return;
    L_0x037c:
        r0 = move-exception;
        r2 = r0;
        r7 = 0;
    L_0x037f:
        throw r2;	 Catch:{ all -> 0x0230 }
    L_0x0380:
        r0 = move-exception;
        r2 = r0;
        r7 = 0;
    L_0x0383:
        throw r2;	 Catch:{ all -> 0x0230 }
    L_0x0384:
        r2 = r0;
    L_0x0385:
        defpackage.baqk.a(r7);
        r3 = r1.a;
        r3.a();
        goto L_0x038f;
    L_0x038e:
        throw r2;
    L_0x038f:
        goto L_0x038e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baqt.a():void");
    }

    public final InputStream b() {
        return this.b;
    }

    public final String a(ByteBuffer byteBuffer, int i, int i2) {
        Throwable e;
        if (i2 <= 0) {
            return "";
        }
        Object obj = null;
        try {
            barg b = this.a.b();
            byteBuffer = byteBuffer.duplicate();
            Object fileOutputStream = new FileOutputStream(b.b());
            try {
                FileChannel channel = fileOutputStream.getChannel();
                byteBuffer.position(i).limit(i + i2);
                channel.write(byteBuffer.slice());
                String b2 = b.b();
                baqk.a(fileOutputStream);
                return b2;
            } catch (Exception e2) {
                e = e2;
                obj = fileOutputStream;
                try {
                    throw new Error(e);
                } catch (Throwable th) {
                    e = th;
                    baqk.a(obj);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                obj = fileOutputStream;
                baqk.a(obj);
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            throw new Error(e);
        }
    }
}
