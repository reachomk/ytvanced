package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: amhr */
public final class amhr extends amgh {
    private static final int a = ((int) TimeUnit.SECONDS.toMillis(3));
    private final Context c;
    private final alys d;
    private final amfh e;
    private final amab f;
    private final amdi h;
    private final ambw i;

    public amhr(Context context, alys alys, amfh amfh, amab amab, amdi amdi, ambw ambw) {
        super(4, ambw);
        this.c = context;
        this.d = alys;
        this.e = amfh;
        this.f = amab;
        this.h = amdi;
        this.i = ambw;
    }

    public final String a() {
        return "TranscodeTask";
    }

    public final amcj b() {
        return null;
    }

    public final boolean d() {
        return false;
    }

    public final amec a(amea amea) {
        amec amec = amea.m;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amhu.a;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:129:0x0258=Splitter:B:129:0x0258, B:169:0x031c=Splitter:B:169:0x031c, B:177:0x035f=Splitter:B:177:0x035f} */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0360 A:{Catch:{ all -> 0x022e, all -> 0x038a }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02d4 A:{SYNTHETIC, Splitter:B:159:0x02d4} */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0262 A:{Catch:{ all -> 0x022e, all -> 0x038a }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0258 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x0314 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x035f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0247 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:101|102|103|104|105|106|107|108|109|110|111|112|113|129|130|(2:132|(2:134|(2:136|(5:138|(3:140|(1:142)(1:143)|144)|145|146|147)(3:148|149|150))(3:151|152|153))(5:154|155|156|157|158))(9:159|160|161|162|163|169|170|171|172)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:114|173|174|175|176|177|178) */
    /* JADX WARNING: Missing block: B:166:0x0318, code skipped:
            r3 = (double) r0.getInteger(r4);
     */
    /* JADX WARNING: Missing block: B:167:0x031a, code skipped:
            r3 = 0.0d;
     */
    public final defpackage.anjv a(java.lang.String r27, defpackage.amea r28) {
        /*
        r26 = this;
        r1 = r26;
        r2 = r28;
        r3 = "color-format";
        r4 = "frame-rate";
        r0 = r2.d;
        r0 = android.net.Uri.parse(r0);
        r5 = r1.h;
        r5 = r5.a(r0);
        r6 = r5.p;
        r6 = defpackage.amdt.a(r6);
        r7 = 1;
        if (r6 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x001f;
    L_0x001e:
        r6 = 1;
    L_0x001f:
        r8 = -1;
        r6 = r6 + r8;
        r9 = 4;
        r10 = 2;
        r11 = 3;
        if (r6 == r10) goto L_0x002e;
    L_0x0026:
        if (r6 == r11) goto L_0x002c;
    L_0x0028:
        if (r6 == r9) goto L_0x002e;
    L_0x002a:
        r6 = 1;
        goto L_0x0030;
    L_0x002c:
        r6 = 3;
        goto L_0x0030;
    L_0x002e:
        r6 = 12;
    L_0x0030:
        if (r6 != r7) goto L_0x0391;
    L_0x0032:
        r6 = defpackage.amjq.a(r28);
        r12 = new java.io.File;
        r13 = "transcode.mp4";
        r12.<init>(r6, r13);
        r6 = new amhx;	 Catch:{ all -> 0x038a }
        r13 = r1.e;	 Catch:{ all -> 0x038a }
        r6.<init>(r13);	 Catch:{ all -> 0x038a }
        r13 = a;	 Catch:{ all -> 0x038a }
    L_0x0046:
        r14 = 14;
        if (r13 > 0) goto L_0x0058;
    L_0x004a:
        r0 = r1.a(r7, r14, r5);	 Catch:{ all -> 0x038a }
        r0 = defpackage.anjf.a(r0);	 Catch:{ all -> 0x038a }
        r2 = r1.e;
        r2.a();
        return r0;
    L_0x0058:
        r15 = r1.e;	 Catch:{ all -> 0x038a }
        r15 = r15.a(r6);	 Catch:{ all -> 0x038a }
        if (r15 != 0) goto L_0x0068;
    L_0x0060:
        r14 = 100;
        java.lang.Thread.sleep(r14);	 Catch:{ all -> 0x038a }
        r13 = r13 + -100;
        goto L_0x0046;
    L_0x0068:
        r13 = r2.j;	 Catch:{ all -> 0x038a }
        r13 = defpackage.amei.a(r13);	 Catch:{ all -> 0x038a }
        if (r13 == 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0072;
    L_0x0071:
        r13 = 1;
    L_0x0072:
        r13 = r13 + r8;
        if (r13 == r7) goto L_0x008c;
    L_0x0075:
        if (r13 == r10) goto L_0x0089;
    L_0x0077:
        if (r13 == r11) goto L_0x0086;
    L_0x0079:
        if (r13 != r9) goto L_0x007e;
    L_0x007b:
        r13 = defpackage.amfn.SIZE_1080;	 Catch:{ all -> 0x038a }
        goto L_0x008e;
    L_0x007e:
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x038a }
        r2 = "Unhandled enum.";
        r0.<init>(r2);	 Catch:{ all -> 0x038a }
        throw r0;	 Catch:{ all -> 0x038a }
    L_0x0086:
        r13 = defpackage.amfn.SIZE_720;	 Catch:{ all -> 0x038a }
        goto L_0x008e;
    L_0x0089:
        r13 = defpackage.amfn.SIZE_480;	 Catch:{ all -> 0x038a }
        goto L_0x008e;
    L_0x008c:
        r13 = defpackage.amfn.SIZE_360;	 Catch:{ all -> 0x038a }
    L_0x008e:
        r15 = new android.media.MediaExtractor;	 Catch:{ all -> 0x038a }
        r15.<init>();	 Catch:{ all -> 0x038a }
        r8 = r1.c;	 Catch:{ all -> 0x038a }
        r14 = 0;
        r15.setDataSource(r8, r0, r14);	 Catch:{ all -> 0x038a }
        r8 = new amfi;	 Catch:{ all -> 0x038a }
        r8.<init>(r5, r13);	 Catch:{ all -> 0x038a }
        r0 = r8.c;	 Catch:{ all -> 0x038a }
        r13 = r0.m;	 Catch:{ all -> 0x038a }
        r14 = r0.n;	 Catch:{ all -> 0x038a }
        if (r13 != r14) goto L_0x036e;
    L_0x00a6:
        r13 = r0.o;	 Catch:{ all -> 0x038a }
        if (r13 != 0) goto L_0x036a;
    L_0x00aa:
        r0 = r0.h;	 Catch:{ all -> 0x038a }
        r0 = defpackage.atku.a(r0);	 Catch:{ all -> 0x038a }
        if (r0 != 0) goto L_0x00b4;
    L_0x00b2:
        r0 = defpackage.atku.CODEC_ID_NONE;	 Catch:{ all -> 0x038a }
    L_0x00b4:
        r13 = defpackage.atku.CODEC_ID_NONE;	 Catch:{ all -> 0x038a }
        if (r0 == r13) goto L_0x036a;
    L_0x00b8:
        r0 = r8.c;	 Catch:{ all -> 0x038a }
        r0 = r0.g;	 Catch:{ all -> 0x038a }
        r0 = defpackage.atku.a(r0);	 Catch:{ all -> 0x038a }
        if (r0 != 0) goto L_0x00c4;
    L_0x00c2:
        r0 = defpackage.atku.CODEC_ID_NONE;	 Catch:{ all -> 0x038a }
    L_0x00c4:
        r13 = defpackage.atku.CODEC_ID_NONE;	 Catch:{ all -> 0x038a }
        if (r0 == r13) goto L_0x036a;
    L_0x00c8:
        r0 = r8.c;	 Catch:{ all -> 0x038a }
        r13 = r0.c;	 Catch:{ all -> 0x038a }
        if (r13 <= 0) goto L_0x036a;
    L_0x00ce:
        r14 = r0.d;	 Catch:{ all -> 0x038a }
        if (r14 > 0) goto L_0x00d6;
    L_0x00d2:
        r3 = 3;
        r4 = 4;
        goto L_0x0371;
    L_0x00d6:
        r9 = r0.b;	 Catch:{ all -> 0x038a }
        r22 = 0;
        r0 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1));
        if (r0 > 0) goto L_0x00df;
    L_0x00de:
        goto L_0x00d2;
    L_0x00df:
        r0 = r8.b;	 Catch:{ all -> 0x038a }
        r7 = defpackage.amfn.SIZE_1080;	 Catch:{ all -> 0x038a }
        if (r0 != r7) goto L_0x00ef;
    L_0x00e5:
        r0 = defpackage.amfn.SIZE_1080;	 Catch:{ all -> 0x038a }
        r0 = r0.e;	 Catch:{ all -> 0x038a }
        if (r13 != r0) goto L_0x00ef;
    L_0x00eb:
        r0 = 1088; // 0x440 float:1.525E-42 double:5.375E-321;
        if (r14 == r0) goto L_0x00fb;
    L_0x00ef:
        r0 = r8.b;	 Catch:{ all -> 0x038a }
        r7 = r0.e;	 Catch:{ all -> 0x038a }
        if (r13 <= r7) goto L_0x00f7;
    L_0x00f5:
        r11 = r6;
        goto L_0x0101;
    L_0x00f7:
        r11 = r0.f;	 Catch:{ all -> 0x038a }
        if (r14 > r11) goto L_0x00f5;
    L_0x00fb:
        r24 = r6;
        r1 = r13;
        r0 = r15;
        r13 = r12;
        goto L_0x012f;
    L_0x0101:
        r6 = (double) r7;
        r1 = (double) r13;
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r1);
        r6 = r6 / r1;
        r0 = r0.f;	 Catch:{ all -> 0x0366 }
        r24 = r11;
        r13 = r12;
        r11 = (double) r0;
        r0 = r15;
        r14 = (double) r14;
        java.lang.Double.isNaN(r11);
        java.lang.Double.isNaN(r14);
        r11 = r11 / r14;
        r6 = java.lang.Math.min(r6, r11);	 Catch:{ all -> 0x0366 }
        java.lang.Double.isNaN(r1);
        r1 = r1 * r6;
        r1 = defpackage.amfi.a(r1);	 Catch:{ all -> 0x0366 }
        java.lang.Double.isNaN(r14);
        r14 = r14 * r6;
        r14 = defpackage.amfi.a(r14);	 Catch:{ all -> 0x0366 }
    L_0x012f:
        r6 = r8.a;	 Catch:{ all -> 0x0366 }
        r2 = 3;
        r6 = r6 << r2;
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r6 = r6 / r9;
        r2 = r1 * r14;
        r11 = (double) r2;
        r15 = 4701656855905042432; // 0x413fa40000000000 float:0.0 double:2073600.0;
        java.lang.Double.isNaN(r11);
        r11 = r11 / r15;
        r15 = 4710347945566797824; // 0x415e848000000000 float:0.0 double:8000000.0;
        r11 = r11 * r15;
        r11 = (long) r11;
        r25 = r3;
        r2 = (double) r11;
        r15 = 4609434218613702656; // 0x3ff8000000000000 float:0.0 double:1.5;
        java.lang.Double.isNaN(r2);
        r17 = r2 * r15;
        r19 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1));
        if (r19 > 0) goto L_0x0360;
    L_0x015a:
        java.lang.Double.isNaN(r2);
        r2 = r2 * r9;
        r2 = (long) r2;
        r6 = 8;
        r2 = r2 / r6;
        r8.d = r2;	 Catch:{ all -> 0x0366 }
        r2 = "video/avc";
        r1 = android.media.MediaFormat.createVideoFormat(r2, r1, r14);	 Catch:{ all -> 0x0366 }
        r8.e = r1;	 Catch:{ all -> 0x0366 }
        r1 = r8.e;	 Catch:{ all -> 0x0366 }
        r2 = "bitrate";
        r3 = (int) r11;	 Catch:{ all -> 0x0366 }
        r1.setInteger(r2, r3);	 Catch:{ all -> 0x0366 }
        r1 = r8.e;	 Catch:{ all -> 0x0366 }
        r2 = 30;
        r1.setInteger(r4, r2);	 Catch:{ all -> 0x0366 }
        r1 = r8.e;	 Catch:{ all -> 0x0366 }
        r2 = "i-frame-interval";
        r3 = 3;
        r1.setInteger(r2, r3);	 Catch:{ all -> 0x0366 }
        r1 = r8.e;	 Catch:{ all -> 0x0366 }
        r2 = 2130708361; // 0x7f000789 float:1.701803E38 double:1.0527098025E-314;
        r3 = r25;
        r1.setInteger(r3, r2);	 Catch:{ all -> 0x0366 }
        r1 = r13.getParentFile();	 Catch:{ all -> 0x0366 }
        if (r1 == 0) goto L_0x0199;
    L_0x0194:
        r1 = r1.getFreeSpace();	 Catch:{ all -> 0x0366 }
        goto L_0x019b;
    L_0x0199:
        r1 = 0;
    L_0x019b:
        r6 = r8.d;	 Catch:{ all -> 0x0366 }
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r6 = r6 * r15;
        r1 = (double) r1;
        r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r9 <= 0) goto L_0x01b9;
    L_0x01a8:
        r0 = 5;
        r1 = r26;
        r0 = r1.a(r0, r5);	 Catch:{ all -> 0x038a }
        r0 = defpackage.anjf.a(r0);	 Catch:{ all -> 0x038a }
        r2 = r1.e;
        r2.a();
        return r0;
    L_0x01b9:
        r1 = r26;
        r6 = r5.b;	 Catch:{ all -> 0x038a }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x038a }
        r9 = 1;
        r9 = r2.toMicros(r9);	 Catch:{ all -> 0x038a }
        r9 = (double) r9;
        java.lang.Double.isNaN(r9);
        r6 = r6 * r9;
        r6 = (long) r6;
        r2 = new ulz;	 Catch:{ all -> 0x038a }
        r9 = r13.getPath();	 Catch:{ all -> 0x038a }
        r2.<init>(r9);	 Catch:{ all -> 0x038a }
        r9 = r5.l;	 Catch:{ all -> 0x038a }
        r19 = r8.a();	 Catch:{ all -> 0x038a }
        r10 = new amia;	 Catch:{ all -> 0x038a }
        r11 = r28;
        r12 = r11.c;	 Catch:{ all -> 0x038a }
        r14 = r11.g;	 Catch:{ all -> 0x038a }
        r15 = r1.f;	 Catch:{ all -> 0x038a }
        r10.<init>(r12, r14, r15);	 Catch:{ all -> 0x038a }
        r2.a(r9);	 Catch:{ all -> 0x038a }
        r9 = new bcgw;	 Catch:{ all -> 0x038a }
        r12 = new amfm;	 Catch:{ all -> 0x038a }
        r12.<init>(r10);	 Catch:{ all -> 0x038a }
        r15 = r9;
        r16 = r0;
        r17 = r6;
        r20 = r2;
        r21 = r12;
        r15.<init>(r16, r17, r19, r20, r21);	 Catch:{ all -> 0x038a }
        r2 = new amfj;	 Catch:{ all -> 0x038a }
        r0 = java.util.concurrent.Executors.newSingleThreadExecutor();	 Catch:{ all -> 0x038a }
        r2.<init>(r9, r0);	 Catch:{ all -> 0x038a }
        r0 = r24;
        r0.a(r2);	 Catch:{ all -> 0x038a }
        r6 = new java.util.concurrent.atomic.AtomicReference;	 Catch:{ all -> 0x038a }
        r6.<init>();	 Catch:{ all -> 0x038a }
        r0 = r2.b;	 Catch:{ all -> 0x038a }
        r7 = new amfl;	 Catch:{ all -> 0x038a }
        r7.<init>(r2, r6);	 Catch:{ all -> 0x038a }
        r0 = r0.submit(r7);	 Catch:{ all -> 0x038a }
        r9 = 5;
        r0.get();	 Catch:{ InterruptedException -> 0x0247, ExecutionException -> 0x0231 }
        r0 = r2.b;	 Catch:{ all -> 0x038a }
        r0.shutdown();	 Catch:{ all -> 0x038a }
        r0 = r2.b;	 Catch:{ InterruptedException -> 0x0258 }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0258 }
        r0.awaitTermination(r9, r2);	 Catch:{ InterruptedException -> 0x0258 }
        goto L_0x0258;
    L_0x022e:
        r0 = move-exception;
        goto L_0x0353;
    L_0x0231:
        r0 = move-exception;
        r7 = r0;
        r0 = defpackage.amfq.a(r7);	 Catch:{ all -> 0x022e }
        r6.set(r0);	 Catch:{ all -> 0x022e }
        r0 = r2.b;	 Catch:{ all -> 0x038a }
        r0.shutdown();	 Catch:{ all -> 0x038a }
        r0 = r2.b;	 Catch:{ InterruptedException -> 0x0258 }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0258 }
        r0.awaitTermination(r9, r2);	 Catch:{ InterruptedException -> 0x0258 }
        goto L_0x0258;
    L_0x0247:
        r0 = r2.a;	 Catch:{ all -> 0x022e }
        r0.a();	 Catch:{ all -> 0x022e }
        r0 = r2.b;	 Catch:{ all -> 0x038a }
        r0.shutdown();	 Catch:{ all -> 0x038a }
        r0 = r2.b;	 Catch:{ InterruptedException -> 0x0258 }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0258 }
        r0.awaitTermination(r9, r2);	 Catch:{ InterruptedException -> 0x0258 }
    L_0x0258:
        r0 = r6.get();	 Catch:{ all -> 0x038a }
        r0 = (defpackage.amfq) r0;	 Catch:{ all -> 0x038a }
        r2 = r0.a;	 Catch:{ all -> 0x038a }
        if (r2 == 0) goto L_0x02d4;
    L_0x0262:
        r6 = 2;
        if (r2 == r6) goto L_0x02c3;
    L_0x0265:
        r3 = 3;
        if (r2 == r3) goto L_0x02b2;
    L_0x0268:
        r4 = 4;
        if (r2 != r4) goto L_0x0299;
    L_0x026b:
        r2 = r0.b;	 Catch:{ all -> 0x038a }
        if (r2 == 0) goto L_0x0288;
    L_0x026f:
        r2 = r1.d;	 Catch:{ all -> 0x038a }
        r3 = "TranscodeTask";
        r4 = " Transcode Exception";
        r3 = r3.concat(r4);	 Catch:{ all -> 0x038a }
        r0 = r0.b;	 Catch:{ all -> 0x038a }
        r4 = r11.h;	 Catch:{ all -> 0x038a }
        r7 = defpackage.amek.a(r4);	 Catch:{ all -> 0x038a }
        if (r7 == 0) goto L_0x0284;
    L_0x0283:
        goto L_0x0285;
    L_0x0284:
        r7 = 1;
    L_0x0285:
        r2.a(r3, r0, r7);	 Catch:{ all -> 0x038a }
    L_0x0288:
        r0 = 16;
        r2 = 1;
        r0 = r1.a(r2, r0, r5);	 Catch:{ all -> 0x038a }
        r0 = defpackage.anjf.a(r0);	 Catch:{ all -> 0x038a }
        r2 = r1.e;
        r2.a();
        return r0;
    L_0x0299:
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x038a }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x038a }
        r4 = 38;
        r3.<init>(r4);	 Catch:{ all -> 0x038a }
        r4 = "Unhandled TranscodeResult: ";
        r3.append(r4);	 Catch:{ all -> 0x038a }
        r3.append(r2);	 Catch:{ all -> 0x038a }
        r2 = r3.toString();	 Catch:{ all -> 0x038a }
        r0.<init>(r2);	 Catch:{ all -> 0x038a }
        throw r0;	 Catch:{ all -> 0x038a }
    L_0x02b2:
        r0 = 15;
        r2 = 1;
        r0 = r1.a(r2, r0, r5);	 Catch:{ all -> 0x038a }
        r0 = defpackage.anjf.a(r0);	 Catch:{ all -> 0x038a }
        r2 = r1.e;
        r2.a();
        return r0;
    L_0x02c3:
        r2 = 1;
        r3 = 14;
        r0 = r1.a(r2, r3, r5);	 Catch:{ all -> 0x038a }
        r0 = defpackage.anjf.a(r0);	 Catch:{ all -> 0x038a }
        r2 = r1.e;
        r2.a();
        return r0;
    L_0x02d4:
        r0 = r8.a();	 Catch:{ all -> 0x038a }
        r2 = r5.toBuilder();	 Catch:{ all -> 0x038a }
        r2 = (defpackage.anxo) r2;	 Catch:{ all -> 0x038a }
        r2 = (defpackage.amdu) r2;	 Catch:{ all -> 0x038a }
        r5 = "mime";
        r6 = "";
        r5 = defpackage.amdk.a(r0, r5, r6);	 Catch:{ all -> 0x038a }
        r5 = defpackage.amdk.a(r5);	 Catch:{ all -> 0x038a }
        r2.a(r5);	 Catch:{ all -> 0x038a }
        r5 = "width";
        r6 = 0;
        r5 = defpackage.amdk.a(r0, r5, r6);	 Catch:{ all -> 0x038a }
        r2.a(r5);	 Catch:{ all -> 0x038a }
        r5 = "height";
        r5 = defpackage.amdk.a(r0, r5, r6);	 Catch:{ all -> 0x038a }
        r2.b(r5);	 Catch:{ all -> 0x038a }
        r5 = -1;
        r3 = defpackage.amdk.a(r0, r3, r5);	 Catch:{ all -> 0x038a }
        r3 = defpackage.amdk.a(r3);	 Catch:{ all -> 0x038a }
        r2.a(r3);	 Catch:{ all -> 0x038a }
        r0 = r0.getFloat(r4);	 Catch:{ ClassCastException | NullPointerException -> 0x0314, ClassCastException | NullPointerException -> 0x0314 }
        r3 = (double) r0;
        goto L_0x031c;
    L_0x0314:
        r0 = r0.getInteger(r4);	 Catch:{ ClassCastException | NullPointerException -> 0x031a, ClassCastException | NullPointerException -> 0x031a }
        r3 = (double) r0;
        goto L_0x031c;
    L_0x031a:
        r3 = r22;
    L_0x031c:
        r2.copyOnWrite();	 Catch:{ all -> 0x038a }
        r0 = r2.instance;	 Catch:{ all -> 0x038a }
        r0 = (defpackage.amdr) r0;	 Catch:{ all -> 0x038a }
        r5 = r0.a;	 Catch:{ all -> 0x038a }
        r5 = r5 | 128;
        r0.a = r5;	 Catch:{ all -> 0x038a }
        r0.i = r3;	 Catch:{ all -> 0x038a }
        r0 = r2.build();	 Catch:{ all -> 0x038a }
        r0 = (defpackage.anxl) r0;	 Catch:{ all -> 0x038a }
        r0 = (defpackage.amdr) r0;	 Catch:{ all -> 0x038a }
        r2 = r13.toURI();	 Catch:{ all -> 0x038a }
        r2 = r2.toString();	 Catch:{ all -> 0x038a }
        r3 = defpackage.amjq.a();	 Catch:{ all -> 0x038a }
        r4 = new amhw;	 Catch:{ all -> 0x038a }
        r4.<init>(r2, r0);	 Catch:{ all -> 0x038a }
        r2 = 1;
        r0 = r1.a(r3, r2, r4);	 Catch:{ all -> 0x038a }
        r0 = defpackage.anjf.a(r0);	 Catch:{ all -> 0x038a }
        r2 = r1.e;
        r2.a();
        return r0;
    L_0x0353:
        r3 = r2.b;	 Catch:{ all -> 0x038a }
        r3.shutdown();	 Catch:{ all -> 0x038a }
        r2 = r2.b;	 Catch:{ InterruptedException -> 0x035f }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x035f }
        r2.awaitTermination(r9, r3);	 Catch:{ InterruptedException -> 0x035f }
    L_0x035f:
        throw r0;	 Catch:{ all -> 0x038a }
    L_0x0360:
        r3 = 3;
        r4 = 4;
        r1 = r26;
        r7 = 3;
        goto L_0x0371;
    L_0x0366:
        r0 = move-exception;
        r1 = r26;
        goto L_0x038b;
    L_0x036a:
        r3 = 3;
        r4 = 4;
        r7 = 1;
        goto L_0x0371;
    L_0x036e:
        r3 = 3;
        r4 = 4;
        r7 = 2;
    L_0x0371:
        r2 = 1;
        if (r7 == r2) goto L_0x037b;
    L_0x0374:
        r2 = 2;
        if (r7 == r2) goto L_0x0379;
    L_0x0377:
        r2 = 4;
        goto L_0x037c;
    L_0x0379:
        r2 = 3;
        goto L_0x037c;
    L_0x037b:
        r2 = 2;
    L_0x037c:
        r0 = r1.a(r2, r5);	 Catch:{ all -> 0x038a }
        r0 = defpackage.anjf.a(r0);	 Catch:{ all -> 0x038a }
        r2 = r1.e;
        r2.a();
        return r0;
    L_0x038a:
        r0 = move-exception;
    L_0x038b:
        r2 = r1.e;
        r2.a();
        throw r0;
    L_0x0391:
        r2 = 1;
        r0 = r1.a(r2, r6, r5);
        r0 = defpackage.anjf.a(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhr.a(java.lang.String, amea):anjv");
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        amdr a = this.h.a(Uri.parse(amea.d));
        if (th instanceof IOException) {
            return a(z, 3, a);
        }
        if (th instanceof InterruptedException) {
            return a(z, 14, a);
        }
        return a(amgh.a(th), z, new amht(a));
    }

    public final void a(long j, amea amea) {
        amea amea2 = amea;
        if (amea2 != null) {
            amec amec = amea2.m;
            if (amec == null) {
                amec = amec.g;
            }
            int a = amee.a(amec.b);
            if (a != 0 && a == 2) {
                this.i.a(amea2.g, 2, 1, 1, j);
            } else {
                amec = amea2.m;
                if (amec == null) {
                    amec = amec.g;
                }
                a = amee.a(amec.b);
                if (a != 0 && a == 4) {
                    amec = amea2.m;
                    if (amec == null) {
                        amec = amec.g;
                    }
                    a = ayuc.a(amec.c);
                    int a2;
                    if (a != 0 && a == 13) {
                        ambw ambw = this.i;
                        String str = amea2.g;
                        a2 = ameg.a(amea2.k);
                        ambw.a(str, 4, 13, a2 != 0 ? a2 : 1, j);
                        return;
                    }
                    ambw ambw2 = this.i;
                    String str2 = amea2.g;
                    amec amec2 = amea2.m;
                    if (amec2 == null) {
                        amec2 = amec.g;
                    }
                    a2 = ayuc.a(amec2.c);
                    ambw2.a(str2, 4, a2 != 0 ? a2 : 1, 1, j);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        int i = amea.a;
        if (!((i & 1) == 0 || (i & 2) == 0 || (i & 16) == 0)) {
            int a = amek.a(amea.h);
            if (a == 0 || a != 5) {
                return true;
            }
        }
        return false;
    }

    private final alzf a(int i, amdr amdr) {
        return a(amjq.a(13), true, new amhv(i, amdr));
    }

    private final alzf a(boolean z, int i, amdr amdr) {
        return a(amjq.a(i), z, new amhy(amdr));
    }
}
