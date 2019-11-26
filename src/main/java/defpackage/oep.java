package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: oep */
public final class oep extends ouz implements ovx {
    private static final Pattern k = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final boolean a;
    public final boolean b;
    public final oyf c;
    public bckx d;
    public ovm e;
    public bclb f;
    public IOException g;
    public boolean h;
    private final bckz j = new oet(this);
    private final bciz l;
    private final Executor m;
    private final ozc n;
    private final int o;
    private final int p;
    private final owg q;
    private final oye r;
    private boolean s;
    private long t;
    private long u;
    private ByteBuffer v;
    private volatile long w;

    public oep(bciz bciz, Executor executor, ozc ozc, int i, int i2, boolean z) {
        Object obj = oye.a;
        super(true);
        this.l = (bciz) oxz.a((Object) bciz);
        this.m = (Executor) oxz.a((Object) executor);
        this.n = ozc;
        this.o = i;
        this.p = i2;
        this.a = z;
        this.r = (oye) oxz.a(obj);
        this.b = false;
        this.q = new owg();
        this.c = new oyf();
    }

    public final void a(String str, String str2) {
        this.q.a(str, str2);
    }

    public final void d() {
        this.q.a();
    }

    public final Map c() {
        bclb bclb = this.f;
        return bclb != null ? bclb.e() : Collections.emptyMap();
    }

    public final Uri b() {
        bclb bclb = this.f;
        return bclb != null ? Uri.parse(bclb.a()) : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARNING: Missing block: B:60:0x0147, code skipped:
            if (r6 != 0) goto L_0x014c;
     */
    public final long a(defpackage.ovm r16) {
        /*
        r15 = this;
        r1 = r15;
        r2 = r16;
        defpackage.oxz.a(r16);
        r0 = r1.s;
        r3 = 1;
        r0 = r0 ^ r3;
        defpackage.oxz.b(r0);
        r0 = r1.c;
        r0.b();
        r15.e();
        r1.e = r2;
        r4 = 0;
        r0 = r1.l;	 Catch:{ IOException -> 0x02da }
        r5 = r2.a;	 Catch:{ IOException -> 0x02da }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02da }
        r6 = r1.j;	 Catch:{ IOException -> 0x02da }
        r7 = r1.m;	 Catch:{ IOException -> 0x02da }
        r0 = r0.a(r5, r6, r7);	 Catch:{ IOException -> 0x02da }
        r0 = r0.e();	 Catch:{ IOException -> 0x02da }
        r5 = r1.q;	 Catch:{ IOException -> 0x02da }
        r5 = r5.b();	 Catch:{ IOException -> 0x02da }
        r5 = r5.entrySet();	 Catch:{ IOException -> 0x02da }
        r5 = r5.iterator();	 Catch:{ IOException -> 0x02da }
        r6 = 0;
    L_0x003b:
        r7 = r5.hasNext();	 Catch:{ IOException -> 0x02da }
        r8 = "Content-Type";
        if (r7 == 0) goto L_0x0065;
    L_0x0043:
        r7 = r5.next();	 Catch:{ IOException -> 0x02da }
        r7 = (java.util.Map.Entry) r7;	 Catch:{ IOException -> 0x02da }
        r9 = r7.getKey();	 Catch:{ IOException -> 0x02da }
        r9 = (java.lang.String) r9;	 Catch:{ IOException -> 0x02da }
        if (r6 != 0) goto L_0x005a;
    L_0x0051:
        r6 = r8.equals(r9);	 Catch:{ IOException -> 0x02da }
        if (r6 == 0) goto L_0x0058;
    L_0x0057:
        goto L_0x005a;
    L_0x0058:
        r6 = 0;
        goto L_0x005b;
    L_0x005a:
        r6 = 1;
    L_0x005b:
        r7 = r7.getValue();	 Catch:{ IOException -> 0x02da }
        r7 = (java.lang.String) r7;	 Catch:{ IOException -> 0x02da }
        r0.b(r9, r7);	 Catch:{ IOException -> 0x02da }
        goto L_0x003b;
    L_0x0065:
        r5 = r2.c;	 Catch:{ IOException -> 0x02da }
        if (r5 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x006c;
    L_0x006a:
        if (r6 == 0) goto L_0x02d2;
    L_0x006c:
        r5 = 2;
        r6 = r2.a(r5);	 Catch:{ IOException -> 0x02da }
        if (r6 == 0) goto L_0x007a;
    L_0x0073:
        r6 = "Icy-MetaData";
        r7 = "1";
        r0.b(r6, r7);	 Catch:{ IOException -> 0x02da }
    L_0x007a:
        r6 = r2.e;	 Catch:{ IOException -> 0x02da }
        r9 = 0;
        r11 = -1;
        r13 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r13 != 0) goto L_0x008a;
    L_0x0084:
        r6 = r2.f;	 Catch:{ IOException -> 0x02da }
        r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
        if (r13 == 0) goto L_0x00b4;
    L_0x008a:
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02da }
        r6.<init>();	 Catch:{ IOException -> 0x02da }
        r7 = "bytes=";
        r6.append(r7);	 Catch:{ IOException -> 0x02da }
        r13 = r2.e;	 Catch:{ IOException -> 0x02da }
        r6.append(r13);	 Catch:{ IOException -> 0x02da }
        r7 = "-";
        r6.append(r7);	 Catch:{ IOException -> 0x02da }
        r13 = r2.f;	 Catch:{ IOException -> 0x02da }
        r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1));
        if (r7 == 0) goto L_0x00ab;
    L_0x00a4:
        r9 = r2.e;	 Catch:{ IOException -> 0x02da }
        r9 = r9 + r13;
        r9 = r9 + r11;
        r6.append(r9);	 Catch:{ IOException -> 0x02da }
    L_0x00ab:
        r7 = "Range";
        r6 = r6.toString();	 Catch:{ IOException -> 0x02da }
        r0.b(r7, r6);	 Catch:{ IOException -> 0x02da }
    L_0x00b4:
        r6 = r16.a();	 Catch:{ IOException -> 0x02da }
        r0.b(r6);	 Catch:{ IOException -> 0x02da }
        r6 = r2.c;	 Catch:{ IOException -> 0x02da }
        if (r6 == 0) goto L_0x00c9;
    L_0x00bf:
        r7 = new oeq;	 Catch:{ IOException -> 0x02da }
        r7.<init>(r6);	 Catch:{ IOException -> 0x02da }
        r6 = r1.m;	 Catch:{ IOException -> 0x02da }
        r0.b(r7, r6);	 Catch:{ IOException -> 0x02da }
    L_0x00c9:
        r0 = r0.d();	 Catch:{ IOException -> 0x02da }
        r1.d = r0;	 Catch:{ IOException -> 0x02da }
        r0 = r1.d;
        r0.a();
        r15.b(r16);
        r0 = r1.r;	 Catch:{ InterruptedException -> 0x02be }
        r6 = r0.a();	 Catch:{ InterruptedException -> 0x02be }
        r0 = 0;
    L_0x00de:
        if (r0 != 0) goto L_0x00f9;
    L_0x00e0:
        r9 = r1.w;	 Catch:{ InterruptedException -> 0x02be }
        r13 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r13 >= 0) goto L_0x00f9;
    L_0x00e6:
        r0 = r1.c;	 Catch:{ InterruptedException -> 0x02be }
        r9 = r1.w;	 Catch:{ InterruptedException -> 0x02be }
        r9 = r9 - r6;
        r6 = 5;
        r9 = r9 + r6;
        r0 = r0.a(r9);	 Catch:{ InterruptedException -> 0x02be }
        r6 = r1.r;	 Catch:{ InterruptedException -> 0x02be }
        r6 = r6.a();	 Catch:{ InterruptedException -> 0x02be }
        goto L_0x00de;
    L_0x00f9:
        r6 = r1.g;	 Catch:{ InterruptedException -> 0x02be }
        if (r6 != 0) goto L_0x02b0;
    L_0x00fd:
        if (r0 == 0) goto L_0x029f;
    L_0x00ff:
        r0 = r1.f;
        r0 = r0.b();
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 >= r6) goto L_0x010b;
    L_0x0109:
        goto L_0x0281;
    L_0x010b:
        r7 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r0 > r7) goto L_0x0281;
    L_0x010f:
        r7 = r1.n;
        r9 = 0;
        if (r7 == 0) goto L_0x013f;
    L_0x0114:
        r7 = r1.f;
        r7 = r7.e();
        r7 = r7.get(r8);
        r7 = (java.util.List) r7;
        r8 = defpackage.oep.a(r7);
        if (r8 != 0) goto L_0x012d;
    L_0x0126:
        r7 = r7.get(r4);
        r7 = (java.lang.String) r7;
        goto L_0x012e;
    L_0x012d:
        r7 = r9;
    L_0x012e:
        r8 = r1.n;
        r8 = r8.a(r7);
        if (r8 == 0) goto L_0x0137;
    L_0x0136:
        goto L_0x013f;
    L_0x0137:
        r0 = new owe;
        r2 = r1.e;
        r0.<init>(r7, r2);
        throw r0;
    L_0x013f:
        if (r0 != r6) goto L_0x014a;
    L_0x0141:
        r6 = r2.e;
        r13 = 0;
        r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r0 == 0) goto L_0x014a;
    L_0x0149:
        goto L_0x014c;
    L_0x014a:
        r6 = 0;
    L_0x014c:
        r1.t = r6;
        r0 = r1.f;
        r0 = r0.d();
        r0 = r0.iterator();
    L_0x0158:
        r6 = r0.hasNext();
        if (r6 == 0) goto L_0x0189;
    L_0x015e:
        r6 = r0.next();
        r6 = (java.util.Map.Entry) r6;
        r7 = r6.getKey();
        r7 = (java.lang.String) r7;
        r8 = "Content-Encoding";
        r7 = r7.equalsIgnoreCase(r8);
        if (r7 == 0) goto L_0x0158;
    L_0x0172:
        r0 = r6.getValue();
        r0 = (java.lang.String) r0;
        r6 = "identity";
        r0 = r0.equalsIgnoreCase(r6);
        r0 = r0 ^ r3;
        if (r0 == 0) goto L_0x0189;
    L_0x0181:
        r0 = r1.e;
        r4 = r0.f;
        r1.u = r4;
        goto L_0x0279;
    L_0x0189:
        r6 = r2.f;
        r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
        if (r0 == 0) goto L_0x0193;
    L_0x018f:
        r1.u = r6;
        goto L_0x0279;
    L_0x0193:
        r0 = r1.f;
        r0 = r0.e();
        r6 = "Content-Length";
        r6 = r0.get(r6);
        r6 = (java.util.List) r6;
        r7 = defpackage.oep.a(r6);
        r8 = "CronetDataSource";
        r10 = "]";
        if (r7 != 0) goto L_0x01de;
    L_0x01ab:
        r6 = r6.get(r4);
        r9 = r6;
        r9 = (java.lang.String) r9;
        r6 = android.text.TextUtils.isEmpty(r9);
        if (r6 != 0) goto L_0x01de;
    L_0x01b8:
        r11 = java.lang.Long.parseLong(r9);	 Catch:{ NumberFormatException -> 0x01bd }
        goto L_0x01de;
    L_0x01bd:
        r6 = java.lang.String.valueOf(r9);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r6 = r6 + 28;
        r7.<init>(r6);
        r6 = "Unexpected Content-Length [";
        r7.append(r6);
        r7.append(r9);
        r7.append(r10);
        r6 = r7.toString();
        defpackage.oyp.b(r8, r6);
    L_0x01de:
        r6 = "Content-Range";
        r0 = r0.get(r6);
        r0 = (java.util.List) r0;
        r6 = defpackage.oep.a(r0);
        if (r6 != 0) goto L_0x0277;
    L_0x01ec:
        r0 = r0.get(r4);
        r0 = (java.lang.String) r0;
        r4 = k;
        r4 = r4.matcher(r0);
        r6 = r4.find();
        if (r6 == 0) goto L_0x0277;
    L_0x01fe:
        r5 = r4.group(r5);	 Catch:{ NumberFormatException -> 0x0256 }
        r5 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x0256 }
        r4 = r4.group(r3);	 Catch:{ NumberFormatException -> 0x0256 }
        r13 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x0256 }
        r5 = r5 - r13;
        r13 = 1;
        r5 = r5 + r13;
        r13 = 0;
        r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r4 < 0) goto L_0x0254;
    L_0x0218:
        r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r4 == 0) goto L_0x0277;
    L_0x021c:
        r4 = java.lang.String.valueOf(r9);	 Catch:{ NumberFormatException -> 0x0256 }
        r4 = r4.length();	 Catch:{ NumberFormatException -> 0x0256 }
        r4 = r4 + 26;
        r7 = java.lang.String.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0256 }
        r7 = r7.length();	 Catch:{ NumberFormatException -> 0x0256 }
        r4 = r4 + r7;
        r7 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0256 }
        r7.<init>(r4);	 Catch:{ NumberFormatException -> 0x0256 }
        r4 = "Inconsistent headers [";
        r7.append(r4);	 Catch:{ NumberFormatException -> 0x0256 }
        r7.append(r9);	 Catch:{ NumberFormatException -> 0x0256 }
        r4 = "] [";
        r7.append(r4);	 Catch:{ NumberFormatException -> 0x0256 }
        r7.append(r0);	 Catch:{ NumberFormatException -> 0x0256 }
        r7.append(r10);	 Catch:{ NumberFormatException -> 0x0256 }
        r4 = r7.toString();	 Catch:{ NumberFormatException -> 0x0256 }
        defpackage.oyp.a(r8, r4);	 Catch:{ NumberFormatException -> 0x0256 }
        r4 = java.lang.Math.max(r11, r5);	 Catch:{ NumberFormatException -> 0x0256 }
        r11 = r4;
        goto L_0x0277;
    L_0x0254:
        r11 = r5;
        goto L_0x0277;
    L_0x0256:
        r4 = java.lang.String.valueOf(r0);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 27;
        r5.<init>(r4);
        r4 = "Unexpected Content-Range [";
        r5.append(r4);
        r5.append(r0);
        r5.append(r10);
        r0 = r5.toString();
        defpackage.oyp.b(r8, r0);
    L_0x0277:
        r1.u = r11;
    L_0x0279:
        r1.s = r3;
        r15.c(r16);
        r2 = r1.u;
        return r2;
    L_0x0281:
        r2 = new owd;
        r3 = r1.f;
        r3.c();
        r3 = r1.f;
        r3.e();
        r3 = r1.e;
        r2.<init>(r0, r3);
        r3 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        if (r0 != r3) goto L_0x029e;
    L_0x0296:
        r0 = new ovk;
        r0.<init>();
        r2.initCause(r0);
    L_0x029e:
        throw r2;
    L_0x029f:
        r0 = new oeu;	 Catch:{ InterruptedException -> 0x02be }
        r3 = new java.net.SocketTimeoutException;	 Catch:{ InterruptedException -> 0x02be }
        r3.<init>();	 Catch:{ InterruptedException -> 0x02be }
        r4 = r1.d;	 Catch:{ InterruptedException -> 0x02be }
        r4 = defpackage.oep.a(r4);	 Catch:{ InterruptedException -> 0x02be }
        r0.<init>(r3, r2, r4);	 Catch:{ InterruptedException -> 0x02be }
        throw r0;	 Catch:{ InterruptedException -> 0x02be }
    L_0x02b0:
        r0 = new oeu;	 Catch:{ InterruptedException -> 0x02be }
        r3 = r1.e;	 Catch:{ InterruptedException -> 0x02be }
        r4 = r1.d;	 Catch:{ InterruptedException -> 0x02be }
        r4 = defpackage.oep.a(r4);	 Catch:{ InterruptedException -> 0x02be }
        r0.<init>(r6, r3, r4);	 Catch:{ InterruptedException -> 0x02be }
        throw r0;	 Catch:{ InterruptedException -> 0x02be }
    L_0x02be:
        r0 = move-exception;
        r3 = java.lang.Thread.currentThread();
        r3.interrupt();
        r3 = new oeu;
        r4 = new oer;
        r4.<init>(r0);
        r0 = -1;
        r3.<init>(r4, r2, r0);
        throw r3;
    L_0x02d2:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x02da }
        r2 = "HTTP request with non-empty body must set Content-Type";
        r0.<init>(r2);	 Catch:{ IOException -> 0x02da }
        throw r0;	 Catch:{ IOException -> 0x02da }
    L_0x02da:
        r0 = move-exception;
        r2 = new oeu;
        r3 = r1.e;
        r2.<init>(r0, r3, r4);
        goto L_0x02e4;
    L_0x02e3:
        throw r2;
    L_0x02e4:
        goto L_0x02e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oep.a(ovm):long");
    }

    public final int a(byte[] bArr, int i, int i2) {
        oxz.b(this.s);
        if (i2 == 0) {
            return 0;
        }
        if (this.u == 0) {
            return -1;
        }
        if (this.v == null) {
            this.v = ByteBuffer.allocateDirect(32768);
            this.v.limit(0);
        }
        while (!this.v.hasRemaining()) {
            this.c.b();
            this.v.clear();
            this.d.a(this.v);
            try {
                if (this.c.a((long) this.p)) {
                    IOException iOException = this.g;
                    if (iOException != null) {
                        throw new owb(iOException, this.e, 2);
                    } else if (this.h) {
                        this.u = 0;
                        return -1;
                    } else {
                        this.v.flip();
                        oxz.b(this.v.hasRemaining());
                        if (this.t > 0) {
                            int min = (int) Math.min((long) this.v.remaining(), this.t);
                            ByteBuffer byteBuffer = this.v;
                            byteBuffer.position(byteBuffer.position() + min);
                            this.t -= (long) min;
                        }
                    }
                } else {
                    throw new SocketTimeoutException();
                }
            } catch (InterruptedException e) {
                this.v = null;
                Thread.currentThread().interrupt();
                throw new owb(new oer(e), this.e, 2);
            } catch (SocketTimeoutException e2) {
                this.v = null;
                throw new owb(e2, this.e, 2);
            }
        }
        i2 = Math.min(this.v.remaining(), i2);
        this.v.get(bArr, i, i2);
        long j = this.u;
        if (j != -1) {
            this.u = j - ((long) i2);
        }
        a(i2);
        return i2;
    }

    public final synchronized void a() {
        bckx bckx = this.d;
        if (bckx != null) {
            bckx.c();
            this.d = null;
        }
        ByteBuffer byteBuffer = this.v;
        if (byteBuffer != null) {
            byteBuffer.limit(0);
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        if (this.s) {
            this.s = false;
            f();
        }
    }

    public final void e() {
        this.w = this.r.a() + ((long) this.o);
    }

    private static int a(bckx bckx) {
        oyf oyf = new oyf();
        int[] iArr = new int[1];
        bckx.a(new oes(iArr, oyf));
        oyf.c();
        return iArr[0];
    }

    private static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    static {
        nzt.a("goog.exo.cronet");
    }
}
