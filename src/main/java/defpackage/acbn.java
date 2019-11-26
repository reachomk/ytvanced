package defpackage;

import android.media.MediaFormat;
import android.os.Bundle;

/* renamed from: acbn */
final /* synthetic */ class acbn implements Runnable {
    private final acay a;
    private final int b = 1;
    private final boolean c;
    private final MediaFormat d;
    private final MediaFormat e;
    private final String f;
    private final String g;
    private final acic h;
    private final Bundle i;
    private final acav j;

    acbn(acay acay, boolean z, MediaFormat mediaFormat, MediaFormat mediaFormat2, String str, String str2, acic acic, Bundle bundle, acav acav) {
        this.a = acay;
        this.c = z;
        this.d = mediaFormat;
        this.e = mediaFormat2;
        this.f = str;
        this.g = str2;
        this.h = acic;
        this.i = bundle;
        this.j = acav;
    }

    /* JADX WARNING: Removed duplicated region for block: B:224:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01dd A:{SYNTHETIC, Splitter:B:94:0x01dd} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Missing block: B:75:0x018d, code skipped:
            if (r1 >= 0) goto L_0x0191;
     */
    /* JADX WARNING: Missing block: B:176:0x0385, code skipped:
            if (r13 > 0) goto L_0x0389;
     */
    public final void run() {
        /*
        r30 = this;
        r1 = r30;
        r2 = "MediaMuxFactory";
        r3 = r1.a;
        r0 = r1.b;
        r4 = r1.c;
        r5 = r1.d;
        r6 = r1.e;
        r7 = r1.f;
        r11 = r1.g;
        r8 = r1.h;
        r15 = r1.i;
        r14 = r1.j;
        defpackage.xak.b();
        r9 = android.text.TextUtils.isEmpty(r7);
        r13 = 1;
        r9 = r9 ^ r13;
        r12 = 3;
        r10 = "MediaMuxCapturePipelineMgr";
        if (r0 == 0) goto L_0x0041;
    L_0x0026:
        if (r0 == r13) goto L_0x0031;
    L_0x0028:
        r0 = "Unknown capture mode";
        defpackage.xtl.a(r10, r0);
        r3.a(r12, r14);
        return;
    L_0x0031:
        if (r9 != 0) goto L_0x0034;
    L_0x0033:
        goto L_0x003b;
    L_0x0034:
        r0 = android.text.TextUtils.isEmpty(r11);
        if (r0 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x0048;
    L_0x003b:
        r0 = 10;
        r3.a(r0, r14);
        return;
    L_0x0041:
        if (r9 != 0) goto L_0x0048;
    L_0x0043:
        r0 = 5;
        r3.a(r0, r14);
        return;
    L_0x0048:
        r0 = r3.w;
        if (r0 == 0) goto L_0x0057;
    L_0x004c:
        r0 = "Start capture requested when already active";
        defpackage.xtl.a(r10, r0);
        r0 = 8;
        r3.a(r0, r14);
        return;
    L_0x0057:
        r0 = r3.r;
        if (r0 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0062;
    L_0x005c:
        if (r4 == 0) goto L_0x0062;
    L_0x005e:
        r3.a(r12, r14);
        return;
    L_0x0062:
        r3.i();
        r0 = r3.a;
        if (r0 == 0) goto L_0x0092;
    L_0x0069:
        r0 = r3.b;
        r8 = 2131361793; // 0x7f0a0001 float:1.8343348E38 double:1.053032641E-314;
        r0 = defpackage.acag.a(r0, r8);
        r8 = new abyr;
        r8.<init>(r0);
        r3.t = r8;
        r8 = new abyc;
        r0 = new acbq;
        r0.<init>(r3);
        r8.<init>(r0);
        r0 = r3.j;
        r0 = r0 instanceof defpackage.achi;
        if (r0 == 0) goto L_0x0092;
    L_0x0089:
        r0 = r3.v;
        r9 = new acbm;
        r9.<init>(r3, r8);
        r0.a = r9;
    L_0x0092:
        r9 = r8;
        r3.h = r4;
        r3.p = r13;
        r0 = defpackage.amqw.a(r9);
        r0 = (defpackage.acic) r0;
        r3.q = r0;
        r0 = new acbv;
        r0.<init>(r3);
        r4 = r3.c;
        r9.a(r0, r4);
        r9.a();
        r0 = r3.c;
        defpackage.amqw.a(r6);
        defpackage.amqw.a(r0);
        r4 = defpackage.acej.b(r6);
        r8 = "Not an audio format";
        r12 = "AudioInputFactory";
        if (r4 != 0) goto L_0x00c7;
    L_0x00be:
        android.util.Log.e(r12, r8);
        r24 = r8;
    L_0x00c3:
        r4 = 1;
    L_0x00c4:
        r8 = 0;
        goto L_0x0147;
    L_0x00c7:
        r4 = "sample-rate";
        r4 = r6.getInteger(r4);	 Catch:{ Exception -> 0x013c }
        r13 = "channel-mask";
        r13 = r6.getInteger(r13);	 Catch:{ Exception -> 0x013c }
        r1 = "max-input-size";
        r1 = r6.getInteger(r1);	 Catch:{ Exception -> 0x013c }
        r23 = new android.media.AudioRecord;	 Catch:{ Exception -> 0x013c }
        r17 = 1;
        r20 = 2;
        r16 = r23;
        r18 = r4;
        r19 = r13;
        r21 = r1;
        r16.<init>(r17, r18, r19, r20, r21);	 Catch:{ Exception -> 0x013c }
        r16 = r4;
        r4 = r23.getState();	 Catch:{ Exception -> 0x013c }
        r24 = r8;
        r8 = 1;
        if (r4 == r8) goto L_0x0127;
    L_0x00f5:
        r23.release();	 Catch:{ Exception -> 0x0125 }
        r4 = new android.media.AudioRecord;	 Catch:{ Exception -> 0x0125 }
        r17 = 1;
        r18 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        r19 = 16;
        r20 = 2;
        r16 = r4;
        r21 = r1;
        r16.<init>(r17, r18, r19, r20, r21);	 Catch:{ Exception -> 0x0125 }
        r8 = r4.getState();	 Catch:{ Exception -> 0x0125 }
        r13 = 1;
        if (r8 == r13) goto L_0x0117;
    L_0x0111:
        r0 = "Could not get an audio recorder for the mic";
        android.util.Log.e(r12, r0);	 Catch:{ Exception -> 0x0125 }
        goto L_0x00c3;
    L_0x0117:
        r8 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        r16 = 16;
        r17 = r4;
        r4 = 1;
        r18 = 16;
        r19 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        goto L_0x012e;
    L_0x0125:
        r0 = move-exception;
        goto L_0x013f;
    L_0x0127:
        r4 = 1;
        r18 = r13;
        r19 = r16;
        r17 = r23;
    L_0x012e:
        r8 = new achs;	 Catch:{ Exception -> 0x013a }
        r16 = r8;
        r20 = r1;
        r21 = r0;
        r16.<init>(r17, r18, r19, r20, r21);	 Catch:{ Exception -> 0x013a }
        goto L_0x0147;
    L_0x013a:
        r0 = move-exception;
        goto L_0x0140;
    L_0x013c:
        r0 = move-exception;
        r24 = r8;
    L_0x013f:
        r4 = 1;
    L_0x0140:
        r1 = "Could not create mic input";
        android.util.Log.e(r12, r1, r0);
        goto L_0x00c4;
    L_0x0147:
        r3.l = r8;
        r0 = r3.l;
        r13 = 0;
        if (r0 != 0) goto L_0x0155;
    L_0x014e:
        r0 = "Could not create audio input";
        defpackage.xtl.a(r10, r0);
        r0 = 7;
        goto L_0x015b;
    L_0x0155:
        r3.m = r0;
        r3.g();
        r0 = 0;
    L_0x015b:
        if (r0 == 0) goto L_0x0161;
    L_0x015d:
        r3.a(r0, r14);
        return;
    L_0x0161:
        r12 = "KEY_ADAPTIVE_BITRATE_ALGORITHM";
        if (r15 == 0) goto L_0x016f;
    L_0x0165:
        r0 = r15.getInt(r12, r13);
        r0 = defpackage.aujs.a(r0);
        r8 = r0;
        goto L_0x0170;
    L_0x016f:
        r8 = 1;
    L_0x0170:
        r0 = r3.d;
        if (r0 == 0) goto L_0x0183;
    L_0x0174:
        r0 = r3.e;
        if (r0 != 0) goto L_0x017b;
    L_0x0178:
        r0 = 0;
        r1 = 3;
        goto L_0x0185;
    L_0x017b:
        r1 = 3;
        if (r8 == r1) goto L_0x0181;
    L_0x017e:
        r0 = 4;
        if (r8 != r0) goto L_0x0184;
    L_0x0181:
        r0 = 1;
        goto L_0x0185;
    L_0x0183:
        r1 = 3;
    L_0x0184:
        r0 = 0;
    L_0x0185:
        if (r15 == 0) goto L_0x0190;
    L_0x0187:
        r1 = "extras-key-send-buffer-chunk-count";
        r1 = r15.getInt(r1, r13);
        if (r1 < 0) goto L_0x0190;
    L_0x018f:
        goto L_0x0191;
    L_0x0190:
        r1 = 0;
    L_0x0191:
        if (r15 == 0) goto L_0x019e;
    L_0x0193:
        r4 = "KEY_ENABLE_THROUGHPUT_MEASUREMENT";
        r4 = r15.getBoolean(r4, r13);
        if (r4 != 0) goto L_0x019c;
    L_0x019b:
        goto L_0x019e;
    L_0x019c:
        r4 = 1;
        goto L_0x019f;
    L_0x019e:
        r4 = 0;
    L_0x019f:
        r3.x = r4;
        r4 = r14;
        r13 = 0;
        if (r15 == 0) goto L_0x01af;
    L_0x01a6:
        r18 = r4;
        r4 = "KEY_SPEED_TEST_BITRATE";
        r13 = r15.getLong(r4, r13);
        goto L_0x01b1;
    L_0x01af:
        r18 = r4;
    L_0x01b1:
        r19 = r13;
        r4 = android.net.Uri.parse(r7);
        r7 = r3.m;
        r14 = r3.x;
        defpackage.amqw.a(r4);
        defpackage.amqw.a(r7);
        r13 = r3.o;
        if (r13 != 0) goto L_0x01c7;
    L_0x01c5:
        r13 = 1;
        goto L_0x01c8;
    L_0x01c7:
        r13 = 0;
    L_0x01c8:
        defpackage.amqw.a(r13);
        r13 = r3.b;
        r21 = r8;
        r8 = r4.getScheme();
        r23 = r9;
        r9 = "file";
        r9 = r9.equals(r8);	 Catch:{ Exception -> 0x0267 }
        if (r9 != 0) goto L_0x024b;
    L_0x01dd:
        r9 = "rtmp";
        r9 = r9.equals(r8);	 Catch:{ Exception -> 0x0239 }
        if (r9 != 0) goto L_0x0211;
    L_0x01e5:
        r0 = "Unknown capture scheme: ";
        r1 = java.lang.String.valueOf(r8);	 Catch:{ Exception -> 0x0267 }
        r4 = r1.length();	 Catch:{ Exception -> 0x0267 }
        if (r4 != 0) goto L_0x01f7;
    L_0x01f1:
        r1 = new java.lang.String;	 Catch:{ Exception -> 0x0267 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0267 }
        goto L_0x01fb;
    L_0x01f7:
        r1 = r0.concat(r1);	 Catch:{ Exception -> 0x0267 }
    L_0x01fb:
        android.util.Log.e(r2, r1);	 Catch:{ Exception -> 0x0267 }
        r7 = r10;
        r1 = r12;
        r28 = r15;
        r27 = r18;
        r26 = r21;
        r21 = r23;
        r13 = 0;
        r29 = r24;
        r24 = r5;
        r5 = r29;
        goto L_0x027e;
    L_0x0211:
        r25 = new acje;	 Catch:{ Exception -> 0x0239 }
        r9 = r21;
        r29 = r24;
        r24 = r5;
        r5 = r29;
        r8 = r25;
        r26 = r9;
        r21 = r23;
        r9 = r13;
        r13 = r10;
        r10 = r4;
        r4 = r12;
        r12 = r7;
        r7 = r13;
        r13 = r0;
        r27 = r18;
        r28 = r15;
        r15 = r1;
        r16 = r19;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16);	 Catch:{ Exception -> 0x0236 }
        r1 = r4;
        r13 = r25;
        goto L_0x027e;
    L_0x0236:
        r0 = move-exception;
        r1 = r4;
        goto L_0x0278;
    L_0x0239:
        r0 = move-exception;
        r7 = r10;
        r28 = r15;
        r27 = r18;
        r26 = r21;
        r21 = r23;
        r29 = r24;
        r24 = r5;
        r5 = r29;
        r1 = r12;
        goto L_0x0278;
    L_0x024b:
        r7 = r10;
        r1 = r12;
        r28 = r15;
        r27 = r18;
        r26 = r21;
        r21 = r23;
        r29 = r24;
        r24 = r5;
        r5 = r29;
        r0 = r4.getPath();	 Catch:{ Exception -> 0x0265 }
        r13 = new achg;	 Catch:{ Exception -> 0x0265 }
        r13.<init>(r0, r14);	 Catch:{ Exception -> 0x0265 }
        goto L_0x027e;
    L_0x0265:
        r0 = move-exception;
        goto L_0x0278;
    L_0x0267:
        r0 = move-exception;
        r7 = r10;
        r1 = r12;
        r28 = r15;
        r27 = r18;
        r26 = r21;
        r21 = r23;
        r29 = r24;
        r24 = r5;
        r5 = r29;
    L_0x0278:
        r4 = "Could not create media mux";
        android.util.Log.e(r2, r4, r0);
        r13 = 0;
    L_0x027e:
        r3.o = r13;
        r0 = r3.o;
        if (r0 == 0) goto L_0x0293;
    L_0x0284:
        r2 = new acbx;
        r2.<init>(r3);
        r0.a(r2);
        r0 = r3.o;
        r0 = r0.c();
        goto L_0x0294;
    L_0x0293:
        r0 = 7;
    L_0x0294:
        if (r0 != 0) goto L_0x0464;
    L_0x0296:
        r0 = r3.o;
        r2 = r3.l;
        defpackage.amqw.a(r6);
        r4 = defpackage.acej.b(r6);
        r8 = "Could not create audio encoder";
        r9 = "AudioEncoderFactory";
        if (r4 != 0) goto L_0x02ac;
    L_0x02a7:
        android.util.Log.e(r9, r5);
    L_0x02aa:
        r13 = 0;
        goto L_0x02b7;
    L_0x02ac:
        r13 = new acgw;	 Catch:{ Exception -> 0x02b2 }
        r13.<init>(r6, r2, r0);	 Catch:{ Exception -> 0x02b2 }
        goto L_0x02b7;
    L_0x02b2:
        r0 = move-exception;
        android.util.Log.e(r9, r8, r0);
        goto L_0x02aa;
    L_0x02b7:
        r3.k = r13;
        r0 = r3.k;
        if (r0 != 0) goto L_0x02c2;
    L_0x02bd:
        defpackage.xtl.a(r7, r8);
        r0 = 7;
        goto L_0x02c8;
    L_0x02c2:
        r2 = r3.B;
        r0.a(r2);
        r0 = 0;
    L_0x02c8:
        if (r0 != 0) goto L_0x045e;
    L_0x02ca:
        r0 = r3.o;
        r2 = r3.m;
        defpackage.amqw.a(r0);
        r4 = r3.b;
        defpackage.amqw.a(r24);
        r5 = defpackage.acej.a(r24);
        r6 = 2;
        r8 = "VideoEncoderFactory";
        if (r5 != 0) goto L_0x02eb;
    L_0x02df:
        r0 = "Not a video format";
        android.util.Log.e(r8, r0);
        r11 = r24;
        r5 = r28;
        r10 = 0;
    L_0x02e9:
        r12 = 0;
        goto L_0x0322;
    L_0x02eb:
        r5 = r28;
        if (r5 == 0) goto L_0x0303;
    L_0x02ef:
        r9 = "extras-key-enable-cbr";
        r10 = 0;
        r9 = r5.getBoolean(r9, r10);
        if (r9 == 0) goto L_0x0300;
    L_0x02f8:
        r9 = "bitrate-mode";
        r11 = r24;
        r11.setInteger(r9, r6);
        goto L_0x0306;
    L_0x0300:
        r11 = r24;
        goto L_0x0306;
    L_0x0303:
        r11 = r24;
        r10 = 0;
    L_0x0306:
        if (r5 == 0) goto L_0x0315;
    L_0x0308:
        r9 = "extras-key-enable-bitrate-bounce";
        r9 = r5.getBoolean(r9, r10);	 Catch:{ Exception -> 0x0313 }
        if (r9 != 0) goto L_0x0311;
    L_0x0310:
        goto L_0x0315;
    L_0x0311:
        r9 = 1;
        goto L_0x0316;
    L_0x0313:
        r0 = move-exception;
        goto L_0x031c;
    L_0x0315:
        r9 = 0;
    L_0x0316:
        r12 = new acih;	 Catch:{ Exception -> 0x0313 }
        r12.<init>(r4, r11, r0, r9);	 Catch:{ Exception -> 0x0313 }
        goto L_0x0322;
    L_0x031c:
        r4 = "Could not create video encoder";
        android.util.Log.e(r8, r4, r0);
        goto L_0x02e9;
    L_0x0322:
        if (r12 == 0) goto L_0x0368;
    L_0x0324:
        r0 = r3.B;
        r12.d = r0;
        r0 = "frame-rate";
        r0 = r11.getInteger(r0);
        r4 = 15;
        r20 = java.lang.Math.min(r0, r4);
        r4 = r3.c;
        r8 = new achi;	 Catch:{ Exception -> 0x0348 }
        r16 = r8;
        r17 = r21;
        r18 = r12;
        r19 = r0;
        r21 = r2;
        r22 = r4;
        r16.<init>(r17, r18, r19, r20, r21, r22);	 Catch:{ Exception -> 0x0348 }
        goto L_0x0351;
    L_0x0348:
        r0 = move-exception;
        r2 = "FrcFactory";
        r4 = "Could not create FRC";
        android.util.Log.e(r2, r4, r0);
        r8 = 0;
    L_0x0351:
        if (r8 != 0) goto L_0x035f;
    L_0x0353:
        r0 = "Could not create frame rate converter";
        defpackage.xtl.a(r7, r0);
        r2 = 0;
        r12.d = r2;
        r12.d();
        goto L_0x036e;
    L_0x035f:
        r2 = 0;
        r0 = r3.B;
        r8.b = r0;
        r3.j = r8;
        r0 = 0;
        goto L_0x036f;
    L_0x0368:
        r2 = 0;
        r0 = "Could not create video encoder";
        defpackage.xtl.a(r7, r0);
    L_0x036e:
        r0 = 7;
    L_0x036f:
        if (r0 != 0) goto L_0x0458;
    L_0x0371:
        r0 = defpackage.achf.a(r11);
        r14 = defpackage.achf.b(r11);
        r4 = defpackage.achf.c(r11);
        if (r5 == 0) goto L_0x0388;
    L_0x037f:
        r7 = "extras-key-min-bitrate";
        r13 = r5.getInt(r7, r10);
        if (r13 <= 0) goto L_0x0388;
    L_0x0387:
        goto L_0x0389;
    L_0x0388:
        r13 = 0;
    L_0x0389:
        if (r13 <= 0) goto L_0x038d;
    L_0x038b:
        r0 = r13;
        goto L_0x0393;
    L_0x038d:
        if (r0 <= 0) goto L_0x0390;
    L_0x038f:
        goto L_0x0393;
    L_0x0390:
        r0 = 200000; // 0x30d40 float:2.8026E-40 double:9.8813E-319;
    L_0x0393:
        if (r4 <= 0) goto L_0x0396;
    L_0x0395:
        goto L_0x0397;
    L_0x0396:
        r4 = r14;
    L_0x0397:
        if (r0 > r14) goto L_0x039b;
    L_0x0399:
        r13 = r0;
        goto L_0x039c;
    L_0x039b:
        r13 = r14;
    L_0x039c:
        if (r14 > r4) goto L_0x03a0;
    L_0x039e:
        r15 = r4;
        goto L_0x03a1;
    L_0x03a0:
        r15 = r14;
    L_0x03a1:
        r0 = r3.d;
        if (r0 == 0) goto L_0x044f;
    L_0x03a5:
        r0 = r3.e;
        if (r0 != 0) goto L_0x03ab;
    L_0x03a9:
        goto L_0x044f;
    L_0x03ab:
        r4 = r26;
        r7 = 1;
        if (r4 == r7) goto L_0x0450;
    L_0x03b0:
        r0 = r3.j;
        r0 = r0 instanceof defpackage.achi;
        if (r0 == 0) goto L_0x0447;
    L_0x03b6:
        if (r4 != 0) goto L_0x03bb;
    L_0x03b8:
        r0 = "null";
        goto L_0x03c5;
    L_0x03bb:
        if (r4 == 0) goto L_0x0446;
    L_0x03bd:
        if (r4 == 0) goto L_0x0445;
    L_0x03bf:
        r8 = r4 + -1;
        r0 = java.lang.Integer.toString(r8);
    L_0x03c5:
        r0 = java.lang.String.valueOf(r0);
        r0.length();
        r0 = r3.j;
        r16 = r0;
        r16 = (defpackage.achi) r16;
        r0 = r3.k;
        r4 = r3.o;
        r8 = r3.d;
        r9 = r3.c;
        r12 = r3.e;
        r1 = r5.getInt(r1, r10);
        r1 = defpackage.aujs.a(r1);
        r5 = r1 + -1;
        if (r1 == 0) goto L_0x0444;
    L_0x03e8:
        if (r5 == r7) goto L_0x0418;
    L_0x03ea:
        if (r5 == r6) goto L_0x0407;
    L_0x03ec:
        r1 = 3;
        if (r5 == r1) goto L_0x03f5;
    L_0x03ef:
        r0 = "Unknown ABR Type, defaulting";
        defpackage.xtl.c(r0);
        goto L_0x0407;
    L_0x03f5:
        r1 = new acdg;
        r2 = r12;
        r12 = r1;
        r17 = r0;
        r18 = r4;
        r19 = r8;
        r20 = r9;
        r21 = r2;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21);
        goto L_0x0424;
    L_0x0407:
        r2 = r12;
        r0 = new acda;
        r12 = r0;
        r17 = r4;
        r18 = r8;
        r19 = r9;
        r20 = r2;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20);
        r1 = r0;
        goto L_0x0424;
    L_0x0418:
        r1 = new accj;
        r12 = r1;
        r17 = r0;
        r18 = r4;
        r19 = r9;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19);
    L_0x0424:
        r3.s = r1;
        r0 = r3.s;
        if (r0 == 0) goto L_0x0450;
    L_0x042a:
        r0 = r3.s;
        r1 = new acbp;
        r1.<init>(r3);
        r0.a(r1);
        r0 = r3.s;
        r1 = defpackage.achf.a(r11);
        defpackage.achf.b(r11);
        defpackage.achf.c(r11);
        r0.a(r1);
        goto L_0x0450;
    L_0x0444:
        throw r2;
    L_0x0445:
        throw r2;
    L_0x0446:
        throw r2;
    L_0x0447:
        r0 = new java.lang.IllegalStateException;
        r1 = "VideoEncoder cast exception";
        r0.<init>(r1);
        throw r0;
    L_0x044f:
        r7 = 1;
    L_0x0450:
        r3.w = r7;
        r1 = r27;
        r3.b(r10, r1);
        return;
    L_0x0458:
        r1 = r27;
        r3.a(r0, r1);
        return;
    L_0x045e:
        r1 = r27;
        r3.a(r0, r1);
        return;
    L_0x0464:
        r1 = r27;
        r3.a(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbn.run():void");
    }
}
