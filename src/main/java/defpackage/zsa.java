package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.net.Uri.Builder;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: zsa */
public final class zsa implements amev, uju {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private final Context b;
    private final zzf c;
    private final ameu d;
    private final ujf e;
    private final amex f;
    private final long g;
    private long h = -1;
    private final String i;

    public zsa(Uri uri, Context context, zzf zzf, amex amex) {
        amqw.a((Object) uri);
        this.b = (Context) amqw.a((Object) context);
        this.c = (zzf) amqw.a((Object) zzf);
        this.f = amex;
        this.g = 500;
        String str = "goog-edited-video";
        amqw.a(str.equals(uri.getScheme()));
        Uri parse = Uri.parse(uri.getQueryParameter("videoFileUri"));
        this.i = uri.getQueryParameter("videoEffectsStateFilePath");
        try {
            ukz a = uku.a(context, parse, false);
            uji uji = new uji();
            uji.a = a;
            this.e = uji.a();
            Object obj = this.e;
            amqw.a(obj);
            amqw.a((Object) uri);
            amqw.a(str.equals(uri.getScheme()));
            str = uri.getQueryParameter("trimStartUs");
            String queryParameter = uri.getQueryParameter("trimEndUs");
            if (str != null) {
                if (queryParameter != null) {
                    obj.a(Long.parseLong(str));
                    obj.b(Long.parseLong(queryParameter));
                }
            }
            str = uri.getQueryParameter("filter");
            if (str != null) {
                obj.a(str);
            }
            str = uri.getQueryParameter("muted");
            if (str != null) {
                obj.a(Boolean.parseBoolean(str));
            }
            str = uri.getQueryParameter("audioSwapSourceUri");
            if (str != null) {
                obj.a(Uri.parse(str));
                obj.a(Float.parseFloat(uri.getQueryParameter("audioSwapVolume")));
                obj.c(Long.parseLong(uri.getQueryParameter("audioSwapOffsetUs")));
            }
            str = uri.getQueryParameter("cropTop");
            queryParameter = uri.getQueryParameter("cropBottom");
            String queryParameter2 = uri.getQueryParameter("cropLeft");
            String queryParameter3 = uri.getQueryParameter("cropRight");
            double d = 0.0d;
            obj.a(str != null ? Double.parseDouble(str) : 0.0d);
            obj.b(queryParameter != null ? Double.parseDouble(queryParameter) : 0.0d);
            obj.c(queryParameter2 != null ? Double.parseDouble(queryParameter2) : 0.0d);
            if (queryParameter3 != null) {
                d = Double.parseDouble(queryParameter3);
            }
            obj.d(d);
            this.d = new ameu(parse, context.getContentResolver());
        } catch (IOException e) {
            xtl.a("Unable to re-create the previously serialized EditableVideo", e);
            throw new FileNotFoundException("Unable to render video");
        }
    }

    public static Uri a(ujf ujf) {
        return ujf.b.a;
    }

    public static Uri b(ujf ujf) {
        return zsa.a(ujf, ujf.b.a);
    }

    public static Uri a(ujf ujf, Uri uri) {
        String str;
        amqw.a((Object) ujf);
        amqw.a((Object) uri);
        Builder appendQueryParameter = new Builder().scheme("goog-edited-video").authority("generated").appendQueryParameter("videoFileUri", uri.toString());
        if (ujf.e()) {
            str = "trimEndUs";
            appendQueryParameter.appendQueryParameter("trimStartUs", Long.toString(ujf.j())).appendQueryParameter(str, Long.toString(ujf.l()));
        }
        if (ujf.f()) {
            appendQueryParameter.appendQueryParameter("filter", ujf.d());
        }
        if (ujf.i()) {
            appendQueryParameter.appendQueryParameter("muted", Boolean.toString(ujf.i()));
        } else if (ujf.g()) {
            str = "audioSwapVolume";
            str = "audioSwapOffsetUs";
            appendQueryParameter.appendQueryParameter("audioSwapSourceUri", ujf.t().toString()).appendQueryParameter(str, Float.toString(ujf.v())).appendQueryParameter(str, Long.toString(ujf.u()));
        }
        if (ujf.s()) {
            str = "cropBottom";
            str = "cropLeft";
            appendQueryParameter.appendQueryParameter("cropTop", Double.toString(ujf.o())).appendQueryParameter(str, Double.toString(ujf.p())).appendQueryParameter(str, Double.toString(ujf.q())).appendQueryParameter("cropRight", Double.toString(ujf.r()));
        }
        return appendQueryParameter.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:294:0x078f  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0765 A:{Catch:{ IOException -> 0x07a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02ae A:{Catch:{ IOException -> 0x07ac }} */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02dd A:{Catch:{ IOException -> 0x07a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0327 A:{Catch:{ IOException -> 0x07a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x035a A:{Catch:{ IOException -> 0x07a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0743 A:{LOOP_END, Catch:{ IOException -> 0x07a2 }, LOOP:15: B:282:0x073d->B:284:0x0743} */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x078f  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0765 A:{Catch:{ IOException -> 0x07a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07b7  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07b7  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07b7  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x07bc  */
    /* JADX WARNING: Missing block: B:99:0x02fe, code skipped:
            if (r3 != null) goto L_0x0300;
     */
    /* JADX WARNING: Missing block: B:175:0x0476, code skipped:
            if (r30 != null) goto L_0x0479;
     */
    /* JADX WARNING: Missing block: B:177:0x0479, code skipped:
            r36 = r34;
     */
    /* JADX WARNING: Missing block: B:178:0x047b, code skipped:
            r32 = java.lang.Math.min(r2, r8);
     */
    /* JADX WARNING: Missing block: B:179:0x047f, code skipped:
            r8 = r8 - r32;
            r32 = r2 - r32;
            r2 = r50;
            r26 = 0;
            r30 = null;
     */
    /* JADX WARNING: Missing block: B:198:0x0543, code skipped:
            r53 = r1;
            r52 = r24;
            r1 = r25;
            r0 = r32;
            r2 = r33;
            r5 = r35;
     */
    /* JADX WARNING: Missing block: B:225:0x05ab, code skipped:
            r38 = r0;
            r23 = r1;
            r20 = r2;
            r21 = r3;
            r44 = r4;
            r45 = r5;
            r43 = r6;
            r41 = r7;
            r1 = r9;
     */
    /* JADX WARNING: Missing block: B:226:0x05c2, code skipped:
            if (r1.a == -1) goto L_0x0723;
     */
    /* JADX WARNING: Missing block: B:228:0x05c8, code skipped:
            if (r1.b == -1) goto L_0x0723;
     */
    /* JADX WARNING: Missing block: B:229:0x05ca, code skipped:
            r0 = r45.iterator();
     */
    /* JADX WARNING: Missing block: B:231:0x05d2, code skipped:
            if (r0.hasNext() == false) goto L_0x071e;
     */
    /* JADX WARNING: Missing block: B:232:0x05d4, code skipped:
            r4 = (defpackage.bakw) r0.next();
            r2 = r38;
            r9 = r2.d;
            r10 = r4.f.b;
            r3 = r4.e;
     */
    /* JADX WARNING: Missing block: B:233:0x05e5, code skipped:
            if (r3 == null) goto L_0x05f2;
     */
    /* JADX WARNING: Missing block: B:235:0x05eb, code skipped:
            if (r3.size() <= 0) goto L_0x05f2;
     */
    /* JADX WARNING: Missing block: B:236:0x05ed, code skipped:
            r3 = r3.iterator();
     */
    /* JADX WARNING: Missing block: B:237:0x05f2, code skipped:
            r3 = null;
     */
    /* JADX WARNING: Missing block: B:238:0x05f3, code skipped:
            r5 = r4.d.iterator();
            r6 = -1;
            r8 = 1;
            r14 = -1;
            r24 = 0;
            r32 = 0;
            r34 = 0;
            r36 = 0;
            r38 = -1;
            r45 = 0;
            r47 = 0;
     */
    /* JADX WARNING: Missing block: B:240:0x0610, code skipped:
            if (r5.hasNext() == false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:241:0x0612, code skipped:
            r30 = r0;
            r0 = (defpackage.ckd) r5.next();
            r40 = r8;
            r22 = r9;
            r8 = r0.a;
            r26 = 0;
     */
    /* JADX WARNING: Missing block: B:243:0x0626, code skipped:
            if (r8 > r26) goto L_0x062f;
     */
    /* JADX WARNING: Missing block: B:244:0x0628, code skipped:
            r42 = r5;
            r8 = r40;
     */
    /* JADX WARNING: Missing block: B:245:0x062f, code skipped:
            if (r3 != null) goto L_0x0637;
     */
    /* JADX WARNING: Missing block: B:246:0x0631, code skipped:
            r49 = r36;
            r18 = 1000000;
     */
    /* JADX WARNING: Missing block: B:248:0x0639, code skipped:
            if (r24 == r26) goto L_0x0690;
     */
    /* JADX WARNING: Missing block: B:249:0x063b, code skipped:
            if (r40 != null) goto L_0x063e;
     */
    /* JADX WARNING: Missing block: B:251:0x063e, code skipped:
            r45 = r32;
     */
    /* JADX WARNING: Missing block: B:252:0x0640, code skipped:
            r49 = (r36 + r32) - r45;
            r24 = r24 - 1;
            r18 = 1000000;
            r40 = null;
     */
    /* JADX WARNING: Missing block: B:253:0x064d, code skipped:
            r49 = (r49 * r18) / r10;
            r42 = r5;
            r51 = r6;
     */
    /* JADX WARNING: Missing block: B:254:0x0659, code skipped:
            if (r49 <= r1.a) goto L_0x065c;
     */
    /* JADX WARNING: Missing block: B:257:0x065e, code skipped:
            if (r49 > r38) goto L_0x0661;
     */
    /* JADX WARNING: Missing block: B:259:0x0661, code skipped:
            r47 = r32;
            r51 = r34;
            r38 = r49;
     */
    /* JADX WARNING: Missing block: B:261:0x066b, code skipped:
            if (r49 > r1.b) goto L_0x0682;
     */
    /* JADX WARNING: Missing block: B:262:0x066d, code skipped:
            r36 = r36 + r0.b;
            r8 = r8 - 1;
            r14 = r34;
            r26 = 0;
            r34 = r34 + 1;
            r5 = r42;
            r6 = r51;
     */
    /* JADX WARNING: Missing block: B:263:0x0682, code skipped:
            r8 = r40;
            r6 = r51;
     */
    /* JADX WARNING: Missing block: B:264:0x0688, code skipped:
            r9 = r22;
            r0 = r30;
            r5 = r42;
     */
    /* JADX WARNING: Missing block: B:265:0x0690, code skipped:
            r42 = r5;
            r51 = r6;
     */
    /* JADX WARNING: Missing block: B:266:0x069a, code skipped:
            if (r3.hasNext() == false) goto L_0x06c8;
     */
    /* JADX WARNING: Missing block: B:267:0x069c, code skipped:
            r5 = (defpackage.ciw) r3.next();
            r6 = (long) r5.a;
     */
    /* JADX WARNING: Missing block: B:268:0x06a9, code skipped:
            if (r6 < 0) goto L_0x06c2;
     */
    /* JADX WARNING: Missing block: B:269:0x06ab, code skipped:
            r32 = (long) r5.b;
            r0 = r0;
            r5 = r42;
            r1 = r1;
            r26 = 0;
            r24 = r6;
            r6 = r51;
     */
    /* JADX WARNING: Missing block: B:271:0x06c7, code skipped:
            throw new java.io.IOException(r12);
     */
    /* JADX WARNING: Missing block: B:273:0x06cd, code skipped:
            throw new java.io.IOException(r13);
     */
    /* JADX WARNING: Missing block: B:274:0x06ce, code skipped:
            r30 = r0;
            r53 = r1;
            r22 = r9;
            r3 = new defpackage.balp(r4, r6, r14);
            r1 = r3.b;
            r1.clear();
            r4 = r22;
            r5 = r4.a;
            r33 = (((r5 - r38) * r10) / 1000000) + r47;
     */
    /* JADX WARNING: Missing block: B:275:0x06f7, code skipped:
            r4 = (double) (r4.b - r5);
            java.lang.Double.isNaN(r4);
            r32 = r32;
     */
    /* JADX WARNING: Missing block: B:277:?, code skipped:
            r1.add(new defpackage.baku(r33, r10, 1.0d, r4 / 1000000.0d));
            r1 = r43;
            r1.a(r3);
            r43 = r1;
            r38 = r2;
            r0 = r30;
            r1 = r53;
     */
    /* JADX WARNING: Missing block: B:278:0x071e, code skipped:
            r2 = r38;
            r1 = r43;
     */
    /* JADX WARNING: Missing block: B:280:0x072a, code skipped:
            throw new java.io.IOException("Unable to find keyframes to cut at");
     */
    public final defpackage.amey a(java.io.File r55) {
        /*
        r54 = this;
        r15 = r54;
        defpackage.amqw.a(r55);
        r0 = r15.c;
        r0 = r0.j();
        r14 = new unr;
        r14.<init>();
        r0 = r0.C;
        r31 = 1;
        r13 = 0;
        if (r0 == 0) goto L_0x0019;
    L_0x0017:
        r0 = 1;
        goto L_0x001f;
    L_0x0019:
        r0 = r15.b;
        r0.getApplicationContext();
        r0 = 0;
    L_0x001f:
        r14.a = r0;
        r0 = r15.e;
        r0 = r0.g();
        if (r0 != 0) goto L_0x0043;
    L_0x0029:
        r0 = r15.e;
        r0 = r0.e();
        if (r0 != 0) goto L_0x0043;
    L_0x0031:
        r0 = r15.e;
        r0 = r0.i();
        if (r0 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0043;
    L_0x003a:
        r0 = r15.d;
        r3 = r55;
        r0 = r0.a(r3);
        return r0;
    L_0x0043:
        r3 = r55;
        r0 = r15.e;
        r0 = r0.i();
        if (r0 == 0) goto L_0x007a;
    L_0x004d:
        r0 = r15.b;
        r1 = r15.e;
        r2 = r1.b;
        r2 = r2.a;
        r20 = r1.j();
        r1 = r15.e;
        r22 = r1.l();
        r1 = new uno;
        r18 = 0;
        r24 = 0;
        r25 = 0;
        r26 = 0;
        r28 = 0;
        r30 = 1;
        r16 = r1;
        r17 = r0;
        r19 = r2;
        r29 = r14;
        r16.<init>(r17, r18, r19, r20, r22, r24, r25, r26, r28, r29, r30);
        r0 = r1;
        goto L_0x00d7;
    L_0x007a:
        r0 = r15.e;
        r0 = r0.t();
        if (r0 == 0) goto L_0x00b5;
    L_0x0082:
        r2 = r15.b;
        r0 = r15.e;
        r1 = r0.b;
        r4 = r1.a;
        r5 = r0.j();
        r0 = r15.e;
        r7 = r0.l();
        r0 = r15.e;
        r9 = r0.t();
        r0 = r15.e;
        r10 = r0.v();
        r0 = r15.e;
        r11 = r0.u();
        r0 = new uno;
        r16 = 0;
        r1 = r0;
        r3 = r55;
        r13 = r54;
        r15 = r16;
        r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r13, r14, r15);
        goto L_0x00d7;
    L_0x00b5:
        r2 = r15.b;
        r0 = r15.e;
        r1 = r0.b;
        r4 = r1.a;
        r5 = r0.j();
        r0 = r15.e;
        r7 = r0.l();
        r0 = new uno;
        r3 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r13 = 0;
        r16 = 0;
        r1 = r0;
        r15 = r16;
        r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r13, r14, r15);
    L_0x00d7:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r0.f;
        r4 = -1;
        r6 = 0;
        if (r2 == 0) goto L_0x029a;
    L_0x00e4:
        r2 = r0.d;
        r8 = r2.a;
        r10 = r2.b;
        r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r2 > 0) goto L_0x00f0;
    L_0x00ee:
        r2 = 1;
        goto L_0x00f1;
    L_0x00f0:
        r2 = 0;
    L_0x00f1:
        defpackage.uhy.a(r2);
        r2 = r0.d;
        r8 = r2.a;
        r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x00fe;
    L_0x00fc:
        r2 = 1;
        goto L_0x00ff;
    L_0x00fe:
        r2 = 0;
    L_0x00ff:
        defpackage.uhy.a(r2);
        r2 = r0.f;
        if (r2 != 0) goto L_0x0108;
    L_0x0106:
        goto L_0x029a;
    L_0x0108:
        r2 = 6;
        r2 = new java.lang.Object[r2];
        r8 = r0.c;
        r9 = 0;
        r2[r9] = r8;
        r8 = r0.d;
        r10 = r8.a;
        r8 = java.lang.Long.valueOf(r10);
        r2[r31] = r8;
        r8 = 2;
        r10 = r0.d;
        r10 = r10.b;
        r10 = java.lang.Long.valueOf(r10);
        r2[r8] = r10;
        r8 = 3;
        r10 = r0.f;
        r2[r8] = r10;
        r8 = 4;
        r10 = r0.g;
        r10 = java.lang.Float.valueOf(r10);
        r2[r8] = r10;
        r8 = 5;
        r10 = r0.h;
        r10 = java.lang.Long.valueOf(r10);
        r2[r8] = r10;
        r2 = java.util.Arrays.hashCode(r2);
        r8 = new java.lang.StringBuilder;
        r10 = 15;
        r8.<init>(r10);
        r10 = "hash";
        r8.append(r10);
        r8.append(r2);
        r2 = r8.toString();
        r8 = java.lang.String.valueOf(r2);
        r10 = ".audioswap.m4a";
        r11 = r10.length();
        if (r11 != 0) goto L_0x0165;
    L_0x015f:
        r10 = new java.lang.String;
        r10.<init>(r8);
        goto L_0x0169;
    L_0x0165:
        r10 = r8.concat(r10);
    L_0x0169:
        r8 = r0.a(r10);
        r10 = r0.b;	 Catch:{ IOException -> 0x017c }
        r10 = r10.getContentResolver();	 Catch:{ IOException -> 0x017c }
        r10 = r10.openInputStream(r8);	 Catch:{ IOException -> 0x017c }
        r10.close();	 Catch:{ IOException -> 0x017c }
        goto L_0x028c;
        r2 = java.lang.String.valueOf(r2);
        r10 = ".audioswap.part.m4a";
        r11 = r10.length();
        if (r11 != 0) goto L_0x018f;
    L_0x0189:
        r10 = new java.lang.String;
        r10.<init>(r2);
        goto L_0x0193;
    L_0x018f:
        r10 = r2.concat(r10);
    L_0x0193:
        r2 = r0.a(r10);
        r10 = new java.io.File;
        r11 = r2.getPath();
        r10.<init>(r11);
        r11 = new java.io.FileOutputStream;
        r11.<init>(r10);
        r15 = new java.io.BufferedOutputStream;
        r15.<init>(r11);
        r11 = r0.d;
        r12 = r11.b;
        r6 = r11.a;
        r22 = r12 - r6;
        r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r11 <= 0) goto L_0x01b9;
    L_0x01b6:
        r16 = r6;
        goto L_0x01bb;
    L_0x01b9:
        r16 = 0;
    L_0x01bb:
        r6 = r0.h;
        r6 = -r6;
        r11 = r0.c;
        r12 = r0.b;
        r13 = defpackage.uhy.a(r11);
        r13 = (android.net.Uri) r13;
        r12 = defpackage.uno.a(r12, r13);
        r12 = r12.a();
        r12 = defpackage.uhy.a(r12);
        r12 = (defpackage.cjl) r12;
        r13 = defpackage.ckg.class;
        r12 = r12.a(r13);
        r12 = r12.iterator();
        r13 = 0;
    L_0x01e1:
        r14 = r12.hasNext();
        if (r14 == 0) goto L_0x01f6;
    L_0x01e7:
        r14 = r12.next();
        r14 = (defpackage.ckg) r14;
        r14 = defpackage.uno.a(r14);
        if (r14 != 0) goto L_0x01f4;
    L_0x01f3:
        goto L_0x01e1;
    L_0x01f4:
        r13 = 1;
        goto L_0x01e1;
    L_0x01f6:
        if (r13 != 0) goto L_0x01f9;
    L_0x01f8:
        r11 = 0;
    L_0x01f9:
        r13 = r0.b;
        r14 = r0.f;
        r12 = r0.g;
        r3 = r0.j;
        r9 = r0.i;
        r4 = new unl;
        r5 = r12;
        r12 = r4;
        r18 = r14;
        r14 = r15;
        r30 = r15;
        r15 = r11;
        r19 = r6;
        r21 = r5;
        r24 = r3;
        r25 = r9;
        r12.<init>(r13, r14, r15, r16, r18, r19, r21, r22, r24, r25);
        r4.start();
        r4.join();	 Catch:{ InterruptedException -> 0x028e }
        r3 = r4.a;
        if (r3 == 0) goto L_0x0247;
    L_0x0222:
        r0 = r3.toString();
        r0 = java.lang.String.valueOf(r0);
        r1 = "AudioMixRenderer failed with exception: ";
        r2 = r0.length();
        if (r2 != 0) goto L_0x0238;
    L_0x0232:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x023c;
    L_0x0238:
        r0 = r1.concat(r0);
    L_0x023c:
        defpackage.ujo.a(r0);
        r0 = new java.io.IOException;
        r1 = "AudioMixRenderer failed with exception";
        r0.<init>(r1, r3);
        throw r0;
    L_0x0247:
        r30.flush();
        r30.close();
        r3 = new java.io.File;
        r4 = r8.getPath();
        r3.<init>(r4);
        r3 = r10.renameTo(r3);
        if (r3 != 0) goto L_0x028c;
    L_0x025c:
        r2 = java.lang.String.valueOf(r2);
        r3 = java.lang.String.valueOf(r8);
        r4 = r2.length();
        r5 = r3.length();
        r6 = new java.lang.StringBuilder;
        r4 = r4 + 38;
        r4 = r4 + r5;
        r6.<init>(r4);
        r4 = "Failed to rename mixed audio from ";
        r6.append(r4);
        r6.append(r2);
        r2 = " to ";
        r6.append(r2);
        r6.append(r3);
        r2 = r6.toString();
        defpackage.ujo.a(r2);
        goto L_0x029a;
    L_0x028c:
        r3 = r8;
        goto L_0x029b;
    L_0x028e:
        r0 = move-exception;
        r1 = r0;
        r0 = new java.io.InterruptedIOException;
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x029a:
        r3 = 0;
    L_0x029b:
        r2 = r0.b;	 Catch:{ IOException -> 0x07b1 }
        r4 = r0.c;	 Catch:{ IOException -> 0x07b1 }
        r4 = defpackage.uhy.a(r4);	 Catch:{ IOException -> 0x07b1 }
        r4 = (android.net.Uri) r4;	 Catch:{ IOException -> 0x07b1 }
        r2 = defpackage.uno.a(r2, r4);	 Catch:{ IOException -> 0x07b1 }
        r1.add(r2);	 Catch:{ IOException -> 0x07ac }
        if (r3 == 0) goto L_0x02bd;
    L_0x02ae:
        r4 = r0.b;	 Catch:{ IOException -> 0x07ac }
        r3 = defpackage.uno.a(r4, r3);	 Catch:{ IOException -> 0x07ac }
        r1.add(r3);	 Catch:{ IOException -> 0x02b8 }
        goto L_0x02be;
    L_0x02b8:
        r0 = move-exception;
        r20 = r2;
        goto L_0x07b5;
    L_0x02bd:
        r3 = 0;
    L_0x02be:
        r4 = r2.a();	 Catch:{ IOException -> 0x07a4 }
        r4 = defpackage.uhy.a(r4);	 Catch:{ IOException -> 0x07a4 }
        r4 = (defpackage.cjl) r4;	 Catch:{ IOException -> 0x07a4 }
        r5 = new java.util.ArrayList;	 Catch:{ IOException -> 0x07a4 }
        r5.<init>();	 Catch:{ IOException -> 0x07a4 }
        r6 = defpackage.ckg.class;
        r6 = r4.a(r6);	 Catch:{ IOException -> 0x07a4 }
        r6 = r6.iterator();	 Catch:{ IOException -> 0x07a4 }
    L_0x02d7:
        r7 = r6.hasNext();	 Catch:{ IOException -> 0x07a4 }
        if (r7 == 0) goto L_0x0312;
    L_0x02dd:
        r7 = r6.next();	 Catch:{ IOException -> 0x07a4 }
        r7 = (defpackage.ckg) r7;	 Catch:{ IOException -> 0x07a4 }
        r8 = r7.h();	 Catch:{ IOException -> 0x07a4 }
        if (r8 == 0) goto L_0x02d7;
    L_0x02e9:
        r8 = r8.h();	 Catch:{ IOException -> 0x07a4 }
        if (r8 == 0) goto L_0x02d7;
    L_0x02ef:
        r9 = defpackage.uno.a;	 Catch:{ IOException -> 0x07a4 }
        r8 = r8.a;	 Catch:{ IOException -> 0x07a4 }
        r8 = r9.contains(r8);	 Catch:{ IOException -> 0x07a4 }
        if (r8 == 0) goto L_0x02d7;
    L_0x02f9:
        r8 = r0.k;	 Catch:{ IOException -> 0x07a4 }
        if (r8 == 0) goto L_0x02fe;
    L_0x02fd:
        goto L_0x0300;
    L_0x02fe:
        if (r3 == 0) goto L_0x0306;
    L_0x0300:
        r8 = defpackage.uno.a(r7);	 Catch:{ IOException -> 0x07a4 }
        if (r8 != 0) goto L_0x02d7;
    L_0x0306:
        r8 = r5.size();	 Catch:{ IOException -> 0x07a4 }
        r7 = defpackage.uno.a(r8, r7);	 Catch:{ IOException -> 0x07a4 }
        r5.add(r7);	 Catch:{ IOException -> 0x07a4 }
        goto L_0x02d7;
    L_0x0312:
        r6 = r5.size();	 Catch:{ IOException -> 0x07a4 }
        r7 = new java.util.ArrayList;	 Catch:{ IOException -> 0x07a4 }
        r7.<init>();	 Catch:{ IOException -> 0x07a4 }
        if (r3 == 0) goto L_0x034b;
    L_0x031d:
        r8 = r0.k;	 Catch:{ IOException -> 0x07a4 }
        if (r8 != 0) goto L_0x034b;
    L_0x0321:
        r8 = r3.a();	 Catch:{ IOException -> 0x07a4 }
        if (r8 == 0) goto L_0x034b;
    L_0x0327:
        r9 = defpackage.ckg.class;
        r8 = r8.a(r9);	 Catch:{ IOException -> 0x07a4 }
        r8 = r8.iterator();	 Catch:{ IOException -> 0x07a4 }
    L_0x0331:
        r9 = r8.hasNext();	 Catch:{ IOException -> 0x07a4 }
        if (r9 == 0) goto L_0x034b;
    L_0x0337:
        r9 = r8.next();	 Catch:{ IOException -> 0x07a4 }
        r9 = (defpackage.ckg) r9;	 Catch:{ IOException -> 0x07a4 }
        r10 = defpackage.uno.a(r9);	 Catch:{ IOException -> 0x07a4 }
        if (r10 == 0) goto L_0x0331;
    L_0x0343:
        r9 = defpackage.uno.a(r6, r9);	 Catch:{ IOException -> 0x07a4 }
        r7.add(r9);	 Catch:{ IOException -> 0x07a4 }
        goto L_0x0331;
    L_0x034b:
        r6 = new bakx;	 Catch:{ IOException -> 0x07a4 }
        r6.<init>();	 Catch:{ IOException -> 0x07a4 }
        r8 = r0.d;	 Catch:{ IOException -> 0x07a4 }
        r9 = r8.a;	 Catch:{ IOException -> 0x07a4 }
        r11 = -1;
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 == 0) goto L_0x072b;
    L_0x035a:
        r9 = r8.b;	 Catch:{ IOException -> 0x07a4 }
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 != 0) goto L_0x0362;
    L_0x0360:
        goto L_0x072b;
    L_0x0362:
        r9 = new unq;	 Catch:{ IOException -> 0x07a4 }
        r9.<init>(r11, r11);	 Catch:{ IOException -> 0x07a4 }
        r10 = r5.iterator();	 Catch:{ IOException -> 0x07a4 }
    L_0x036b:
        r11 = r10.hasNext();	 Catch:{ IOException -> 0x07a4 }
        r12 = "Negative CTTS entry count in rendered video";
        r13 = "Too few CTTS entries in rendered video";
        r16 = 1;
        if (r11 == 0) goto L_0x05ab;
    L_0x0377:
        r11 = r10.next();	 Catch:{ IOException -> 0x07a4 }
        r11 = (defpackage.bakw) r11;	 Catch:{ IOException -> 0x07a4 }
        r18 = r11.b();	 Catch:{ IOException -> 0x07a4 }
        if (r18 == 0) goto L_0x05a7;
    L_0x0383:
        r14 = r11.b();	 Catch:{ IOException -> 0x07a4 }
        r14 = r14.length;	 Catch:{ IOException -> 0x07a4 }
        if (r14 <= 0) goto L_0x05a7;
    L_0x038a:
        r14 = r9.a;	 Catch:{ IOException -> 0x07a4 }
        r20 = -1;
        r22 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1));
        if (r22 != 0) goto L_0x059b;
    L_0x0392:
        r14 = r11.b();	 Catch:{ IOException -> 0x07a4 }
        r15 = r11.f;	 Catch:{ IOException -> 0x07a4 }
        r20 = r2;
        r21 = r3;
        r2 = r15.b;	 Catch:{ IOException -> 0x07a2 }
        r15 = r11.d;	 Catch:{ IOException -> 0x07a2 }
        r22 = r10;
        r10 = r11.e;	 Catch:{ IOException -> 0x07a2 }
        r23 = r1;
        r1 = r14.length;	 Catch:{ IOException -> 0x07a2 }
        r1 = new long[r1];	 Catch:{ IOException -> 0x07a2 }
        if (r10 == 0) goto L_0x03b6;
    L_0x03ab:
        r24 = r10.size();	 Catch:{ IOException -> 0x07a2 }
        if (r24 <= 0) goto L_0x03b6;
    L_0x03b1:
        r10 = r10.iterator();	 Catch:{ IOException -> 0x07a2 }
        goto L_0x03b7;
    L_0x03b6:
        r10 = 0;
    L_0x03b7:
        r15 = r15.iterator();	 Catch:{ IOException -> 0x07a2 }
        r24 = r16;
        r30 = 1;
        r32 = 0;
        r34 = 0;
        r36 = 0;
        r38 = 0;
        r39 = 0;
    L_0x03c9:
        r41 = r15.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r41 == 0) goto L_0x04ab;
    L_0x03cf:
        r41 = r15.next();	 Catch:{ IOException -> 0x07a2 }
        r42 = r15;
        r15 = r41;
        r15 = (defpackage.ckd) r15;	 Catch:{ IOException -> 0x07a2 }
        r43 = r6;
        r41 = r7;
        r6 = r15.a;	 Catch:{ IOException -> 0x07a2 }
        r44 = r4;
        r45 = r5;
        r4 = r15.b;	 Catch:{ IOException -> 0x07a2 }
        r46 = r24 + r6;
        r15 = r38;
        r38 = r0;
    L_0x03eb:
        r0 = r14.length;	 Catch:{ IOException -> 0x07a2 }
        if (r15 < r0) goto L_0x03f6;
    L_0x03ee:
        r50 = r2;
        r52 = r8;
        r53 = r9;
        goto L_0x048a;
    L_0x03f6:
        r48 = r14[r15];	 Catch:{ IOException -> 0x07a2 }
        r50 = (r48 > r24 ? 1 : (r48 == r24 ? 0 : -1));
        if (r50 < 0) goto L_0x03ee;
    L_0x03fc:
        r50 = (r48 > r46 ? 1 : (r48 == r46 ? 0 : -1));
        if (r50 >= 0) goto L_0x03ee;
    L_0x0400:
        r48 = r48 - r24;
        if (r10 != 0) goto L_0x0410;
    L_0x0404:
        r48 = r48 * r4;
        r48 = r39 + r48;
        r52 = r8;
        r53 = r9;
    L_0x040c:
        r8 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        goto L_0x0436;
    L_0x0410:
        if (r15 <= 0) goto L_0x041b;
    L_0x0412:
        r0 = r15 + -1;
        r50 = r14[r0];	 Catch:{ IOException -> 0x07a2 }
        r50 = r50 - r24;
        r50 = r50 + r16;
        goto L_0x041d;
    L_0x041b:
        r50 = 0;
    L_0x041d:
        r50 = r48 - r50;
        r50 = r50 + r16;
        r52 = r8;
        r53 = r9;
        r8 = r50;
        r26 = 0;
    L_0x0429:
        r0 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1));
        if (r0 > 0) goto L_0x0443;
    L_0x042d:
        r48 = r48 * r4;
        r48 = r39 + r48;
        r48 = r48 + r34;
        r48 = r48 - r36;
        goto L_0x040c;
    L_0x0436:
        r48 = r48 * r8;
        r48 = r48 / r2;
        r1[r15] = r48;	 Catch:{ IOException -> 0x07a2 }
        r15 = r15 + 1;
        r8 = r52;
        r9 = r53;
        goto L_0x03eb;
    L_0x0443:
        r50 = r2;
    L_0x0445:
        r2 = r32;
        r26 = 0;
        r0 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1));
        if (r0 != 0) goto L_0x0476;
    L_0x044d:
        r0 = r10.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r0 == 0) goto L_0x0470;
    L_0x0453:
        r0 = r10.next();	 Catch:{ IOException -> 0x07a2 }
        r0 = (defpackage.ciw) r0;	 Catch:{ IOException -> 0x07a2 }
        r2 = r0.a;	 Catch:{ IOException -> 0x07a2 }
        r2 = (long) r2;	 Catch:{ IOException -> 0x07a2 }
        r26 = 0;
        r32 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1));
        if (r32 < 0) goto L_0x046a;
    L_0x0462:
        r0 = r0.b;	 Catch:{ IOException -> 0x07a2 }
        r32 = r2;
        r2 = (long) r0;	 Catch:{ IOException -> 0x07a2 }
        r34 = r2;
        goto L_0x0445;
    L_0x046a:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x07a2 }
        r0.<init>(r12);	 Catch:{ IOException -> 0x07a2 }
        throw r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x0470:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x07a2 }
        r0.<init>(r13);	 Catch:{ IOException -> 0x07a2 }
        throw r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x0476:
        if (r30 != 0) goto L_0x0479;
    L_0x0478:
        goto L_0x047b;
    L_0x0479:
        r36 = r34;
    L_0x047b:
        r32 = java.lang.Math.min(r2, r8);	 Catch:{ IOException -> 0x07a2 }
        r8 = r8 - r32;
        r32 = r2 - r32;
        r2 = r50;
        r26 = 0;
        r30 = 0;
        goto L_0x0429;
    L_0x048a:
        java.lang.Long.signum(r6);
        r6 = r6 * r4;
        r39 = r39 + r6;
        if (r15 == r0) goto L_0x04b9;
    L_0x0493:
        r0 = r38;
        r7 = r41;
        r6 = r43;
        r4 = r44;
        r5 = r45;
        r24 = r46;
        r2 = r50;
        r8 = r52;
        r9 = r53;
        r38 = r15;
        r15 = r42;
        goto L_0x03c9;
    L_0x04ab:
        r38 = r0;
        r44 = r4;
        r45 = r5;
        r43 = r6;
        r41 = r7;
        r52 = r8;
        r53 = r9;
    L_0x04b9:
        r0 = r11.f;	 Catch:{ IOException -> 0x07a2 }
        r2 = r0.b;	 Catch:{ IOException -> 0x07a2 }
        r0 = r11.d;	 Catch:{ IOException -> 0x07a2 }
        r4 = r11.e;	 Catch:{ IOException -> 0x07a2 }
        if (r4 == 0) goto L_0x04ce;
    L_0x04c3:
        r5 = r4.size();	 Catch:{ IOException -> 0x07a2 }
        if (r5 <= 0) goto L_0x04ce;
    L_0x04c9:
        r4 = r4.iterator();	 Catch:{ IOException -> 0x07a2 }
        goto L_0x04cf;
    L_0x04ce:
        r4 = 0;
    L_0x04cf:
        r0 = r0.iterator();	 Catch:{ IOException -> 0x07a2 }
        r5 = 0;
        r7 = 0;
        r9 = 0;
        r11 = 1;
        r14 = 0;
        r16 = 0;
    L_0x04de:
        r24 = r0.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r24 != 0) goto L_0x0525;
    L_0x04e4:
        r18 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r5 = r5 * r18;
        r2 = r5 / r2;
        r0 = r52;
        r4 = r0.a;	 Catch:{ IOException -> 0x07a2 }
        r37 = 1;
        r32 = r1;
        r33 = r2;
        r35 = r4;
        r4 = defpackage.uno.a(r32, r33, r35, r37);	 Catch:{ IOException -> 0x07a2 }
        r6 = r53;
        r6.a = r4;	 Catch:{ IOException -> 0x07a2 }
        r4 = r0.b;	 Catch:{ IOException -> 0x07a2 }
        r37 = 0;
        r32 = r1;
        r33 = r2;
        r35 = r4;
        r1 = defpackage.uno.a(r32, r33, r35, r37);	 Catch:{ IOException -> 0x07a2 }
        r6.b = r1;	 Catch:{ IOException -> 0x07a2 }
        r8 = r0;
        r9 = r6;
        r2 = r20;
        r3 = r21;
        r10 = r22;
        r1 = r23;
        r0 = r38;
        r7 = r41;
        r6 = r43;
        r4 = r44;
        r5 = r45;
        goto L_0x036b;
    L_0x0525:
        r25 = r1;
        r24 = r52;
        r1 = r53;
        r30 = r0.next();	 Catch:{ IOException -> 0x07a2 }
        r32 = r0;
        r0 = r30;
        r0 = (defpackage.ckd) r0;	 Catch:{ IOException -> 0x07a2 }
        r33 = r2;
        r2 = r0.b;	 Catch:{ IOException -> 0x07a2 }
        r35 = r5;
        r5 = r0.a;	 Catch:{ IOException -> 0x07a2 }
    L_0x053d:
        r26 = 0;
        r0 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1));
        if (r0 > 0) goto L_0x0550;
    L_0x0543:
        r53 = r1;
        r52 = r24;
        r1 = r25;
        r0 = r32;
        r2 = r33;
        r5 = r35;
        goto L_0x04de;
    L_0x0550:
        r7 = r7 + r2;
        if (r4 != 0) goto L_0x0558;
    L_0x0553:
        r39 = r7;
        r28 = -1;
        goto L_0x056a;
    L_0x0558:
        r0 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1));
        if (r0 == 0) goto L_0x0574;
    L_0x055c:
        if (r11 != 0) goto L_0x055f;
    L_0x055e:
        goto L_0x0561;
    L_0x055f:
        r16 = r14;
    L_0x0561:
        r39 = r7 + r14;
        r39 = r39 - r16;
        r28 = -1;
        r9 = r9 + r28;
        r11 = 0;
    L_0x056a:
        r0 = (r39 > r35 ? 1 : (r39 == r35 ? 0 : -1));
        if (r0 > 0) goto L_0x056f;
    L_0x056e:
        goto L_0x0571;
    L_0x056f:
        r35 = r39;
    L_0x0571:
        r5 = r5 + r28;
        goto L_0x053d;
    L_0x0574:
        r0 = r4.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r0 == 0) goto L_0x0595;
    L_0x057a:
        r0 = r4.next();	 Catch:{ IOException -> 0x07a2 }
        r0 = (defpackage.ciw) r0;	 Catch:{ IOException -> 0x07a2 }
        r9 = r0.a;	 Catch:{ IOException -> 0x07a2 }
        r9 = (long) r9;	 Catch:{ IOException -> 0x07a2 }
        r14 = 0;
        r30 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1));
        if (r30 < 0) goto L_0x058f;
    L_0x0589:
        r0 = r0.b;	 Catch:{ IOException -> 0x07a2 }
        r14 = (long) r0;	 Catch:{ IOException -> 0x07a2 }
        r26 = 0;
        goto L_0x0558;
    L_0x058f:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x07a2 }
        r0.<init>(r12);	 Catch:{ IOException -> 0x07a2 }
        throw r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x0595:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x07a2 }
        r0.<init>(r13);	 Catch:{ IOException -> 0x07a2 }
        throw r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x059b:
        r20 = r2;
        r21 = r3;
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x07a2 }
        r1 = "Only one track with sync samples is supported";
        r0.<init>(r1);	 Catch:{ IOException -> 0x07a2 }
        throw r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x05a7:
        r23 = r1;
        goto L_0x036b;
    L_0x05ab:
        r38 = r0;
        r23 = r1;
        r20 = r2;
        r21 = r3;
        r44 = r4;
        r45 = r5;
        r43 = r6;
        r41 = r7;
        r1 = r9;
        r2 = r1.a;	 Catch:{ IOException -> 0x07a2 }
        r4 = -1;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0723;
    L_0x05c4:
        r2 = r1.b;	 Catch:{ IOException -> 0x07a2 }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0723;
    L_0x05ca:
        r0 = r45.iterator();	 Catch:{ IOException -> 0x07a2 }
    L_0x05ce:
        r2 = r0.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r2 == 0) goto L_0x071e;
    L_0x05d4:
        r2 = r0.next();	 Catch:{ IOException -> 0x07a2 }
        r4 = r2;
        r4 = (defpackage.bakw) r4;	 Catch:{ IOException -> 0x07a2 }
        r2 = r38;
        r9 = r2.d;	 Catch:{ IOException -> 0x07a2 }
        r3 = r4.f;	 Catch:{ IOException -> 0x07a2 }
        r10 = r3.b;	 Catch:{ IOException -> 0x07a2 }
        r3 = r4.e;	 Catch:{ IOException -> 0x07a2 }
        if (r3 == 0) goto L_0x05f2;
    L_0x05e7:
        r5 = r3.size();	 Catch:{ IOException -> 0x07a2 }
        if (r5 <= 0) goto L_0x05f2;
    L_0x05ed:
        r3 = r3.iterator();	 Catch:{ IOException -> 0x07a2 }
        goto L_0x05f3;
    L_0x05f2:
        r3 = 0;
    L_0x05f3:
        r5 = r4.d;	 Catch:{ IOException -> 0x07a2 }
        r5 = r5.iterator();	 Catch:{ IOException -> 0x07a2 }
        r6 = -1;
        r8 = 1;
        r14 = -1;
        r24 = 0;
        r32 = 0;
        r34 = 0;
        r36 = 0;
        r38 = -1;
        r45 = 0;
        r47 = 0;
    L_0x060c:
        r22 = r5.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r22 == 0) goto L_0x06ce;
    L_0x0612:
        r22 = r5.next();	 Catch:{ IOException -> 0x07a2 }
        r30 = r0;
        r0 = r22;
        r0 = (defpackage.ckd) r0;	 Catch:{ IOException -> 0x07a2 }
        r40 = r8;
        r22 = r9;
        r8 = r0.a;	 Catch:{ IOException -> 0x07a2 }
        r26 = 0;
    L_0x0624:
        r42 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1));
        if (r42 > 0) goto L_0x062f;
    L_0x0628:
        r42 = r5;
        r8 = r40;
        r28 = -1;
        goto L_0x0688;
    L_0x062f:
        if (r3 != 0) goto L_0x0637;
    L_0x0631:
        r49 = r36;
        r18 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        goto L_0x064d;
    L_0x0637:
        r42 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1));
        if (r42 == 0) goto L_0x0690;
    L_0x063b:
        if (r40 != 0) goto L_0x063e;
    L_0x063d:
        goto L_0x0640;
    L_0x063e:
        r45 = r32;
    L_0x0640:
        r49 = r36 + r32;
        r49 = r49 - r45;
        r28 = -1;
        r24 = r24 + r28;
        r18 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r40 = 0;
    L_0x064d:
        r49 = r49 * r18;
        r49 = r49 / r10;
        r42 = r5;
        r51 = r6;
        r5 = r1.a;	 Catch:{ IOException -> 0x07a2 }
        r7 = (r49 > r5 ? 1 : (r49 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x065c;
    L_0x065b:
        goto L_0x0667;
    L_0x065c:
        r5 = (r49 > r38 ? 1 : (r49 == r38 ? 0 : -1));
        if (r5 > 0) goto L_0x0661;
    L_0x0660:
        goto L_0x0667;
    L_0x0661:
        r47 = r32;
        r51 = r34;
        r38 = r49;
    L_0x0667:
        r5 = r1.b;	 Catch:{ IOException -> 0x07a2 }
        r7 = (r49 > r5 ? 1 : (r49 == r5 ? 0 : -1));
        if (r7 > 0) goto L_0x0682;
    L_0x066d:
        r5 = r0.b;	 Catch:{ IOException -> 0x07a2 }
        r36 = r36 + r5;
        r5 = r34 + r16;
        r28 = -1;
        r8 = r8 + r28;
        r14 = r34;
        r26 = 0;
        r34 = r5;
        r5 = r42;
        r6 = r51;
        goto L_0x0624;
    L_0x0682:
        r28 = -1;
        r8 = r40;
        r6 = r51;
    L_0x0688:
        r9 = r22;
        r0 = r30;
        r5 = r42;
        goto L_0x060c;
    L_0x0690:
        r42 = r5;
        r51 = r6;
        r28 = -1;
        r5 = r3.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r5 == 0) goto L_0x06c8;
    L_0x069c:
        r5 = r3.next();	 Catch:{ IOException -> 0x07a2 }
        r5 = (defpackage.ciw) r5;	 Catch:{ IOException -> 0x07a2 }
        r6 = r5.a;	 Catch:{ IOException -> 0x07a2 }
        r6 = (long) r6;	 Catch:{ IOException -> 0x07a2 }
        r24 = 0;
        r26 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1));
        if (r26 < 0) goto L_0x06c2;
    L_0x06ab:
        r5 = r5.b;	 Catch:{ IOException -> 0x07a2 }
        r26 = r0;
        r53 = r1;
        r0 = (long) r5;	 Catch:{ IOException -> 0x07a2 }
        r32 = r0;
        r0 = r26;
        r5 = r42;
        r1 = r53;
        r26 = r24;
        r24 = r6;
        r6 = r51;
        goto L_0x0637;
    L_0x06c2:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x07a2 }
        r0.<init>(r12);	 Catch:{ IOException -> 0x07a2 }
        throw r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x06c8:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x07a2 }
        r0.<init>(r13);	 Catch:{ IOException -> 0x07a2 }
        throw r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x06ce:
        r30 = r0;
        r53 = r1;
        r22 = r9;
        r24 = 0;
        r28 = -1;
        r0 = new balp;	 Catch:{ IOException -> 0x07a2 }
        r3 = r0;
        r5 = r6;
        r7 = r14;
        r3.<init>(r4, r5, r7);	 Catch:{ IOException -> 0x07a2 }
        r1 = r0.b;	 Catch:{ IOException -> 0x07a2 }
        r1.clear();	 Catch:{ IOException -> 0x07a2 }
        r3 = new baku;	 Catch:{ IOException -> 0x07a2 }
        r4 = r22;
        r5 = r4.a;	 Catch:{ IOException -> 0x07a2 }
        r7 = r5 - r38;
        r7 = r7 * r10;
        r14 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = r7 / r14;
        r33 = r7 + r47;
        r7 = r4.b;	 Catch:{ IOException -> 0x07a2 }
        r7 = r7 - r5;
        r4 = (double) r7;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        java.lang.Double.isNaN(r4);
        r39 = r4 / r6;
        r37 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r32 = r3;
        r35 = r10;
        r32.<init>(r33, r35, r37, r39);	 Catch:{ IOException -> 0x07a2 }
        r1.add(r3);	 Catch:{ IOException -> 0x07a2 }
        r1 = r43;
        r1.a(r0);	 Catch:{ IOException -> 0x07a2 }
        r43 = r1;
        r38 = r2;
        r0 = r30;
        r1 = r53;
        goto L_0x05ce;
    L_0x071e:
        r2 = r38;
        r1 = r43;
        goto L_0x074d;
    L_0x0723:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x07a2 }
        r1 = "Unable to find keyframes to cut at";
        r0.<init>(r1);	 Catch:{ IOException -> 0x07a2 }
        throw r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x072b:
        r23 = r1;
        r20 = r2;
        r21 = r3;
        r44 = r4;
        r45 = r5;
        r1 = r6;
        r41 = r7;
        r2 = r0;
        r0 = r45.iterator();	 Catch:{ IOException -> 0x07a2 }
    L_0x073d:
        r3 = r0.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r3 == 0) goto L_0x074d;
    L_0x0743:
        r3 = r0.next();	 Catch:{ IOException -> 0x07a2 }
        r3 = (defpackage.bakw) r3;	 Catch:{ IOException -> 0x07a2 }
        r1.a(r3);	 Catch:{ IOException -> 0x07a2 }
        goto L_0x073d;
    L_0x074d:
        r0 = r41.iterator();	 Catch:{ IOException -> 0x07a2 }
    L_0x0751:
        r3 = r0.hasNext();	 Catch:{ IOException -> 0x07a2 }
        if (r3 != 0) goto L_0x078f;
    L_0x0757:
        r0 = defpackage.cjo.class;
        r4 = r44;
        r0 = r4.a(r0);	 Catch:{ IOException -> 0x07a2 }
        r3 = r0.isEmpty();	 Catch:{ IOException -> 0x07a2 }
        if (r3 != 0) goto L_0x0774;
    L_0x0765:
        r3 = 0;
        r0 = r0.get(r3);	 Catch:{ IOException -> 0x07a2 }
        r0 = (defpackage.cjo) r0;	 Catch:{ IOException -> 0x07a2 }
        r3 = r0.a;	 Catch:{ IOException -> 0x07a2 }
        r1.c = r3;	 Catch:{ IOException -> 0x07a2 }
        r0 = r0.b;	 Catch:{ IOException -> 0x07a2 }
        r1.b = r0;	 Catch:{ IOException -> 0x07a2 }
    L_0x0774:
        r0 = r2.e;	 Catch:{ IOException -> 0x07a2 }
        r0 = new unu;	 Catch:{ IOException -> 0x07a2 }
        r2 = new bala;	 Catch:{ IOException -> 0x07a2 }
        r2.<init>();	 Catch:{ IOException -> 0x07a2 }
        r5 = r23;
        r0.<init>(r1, r2, r5);	 Catch:{ IOException -> 0x07a2 }
        r1 = new unt;
        r1.<init>(r0);
        r0 = new amey;
        r2 = r1.a;
        r0.<init>(r1, r2);
        return r0;
    L_0x078f:
        r5 = r23;
        r4 = r44;
        r3 = 0;
        r6 = r0.next();	 Catch:{ IOException -> 0x07a2 }
        r6 = (defpackage.bakw) r6;	 Catch:{ IOException -> 0x07a2 }
        r1.a(r6);	 Catch:{ IOException -> 0x07a2 }
        r44 = r4;
        r23 = r5;
        goto L_0x0751;
    L_0x07a2:
        r0 = move-exception;
        goto L_0x07a9;
    L_0x07a4:
        r0 = move-exception;
        r20 = r2;
        r21 = r3;
    L_0x07a9:
        r3 = r21;
        goto L_0x07b5;
    L_0x07ac:
        r0 = move-exception;
        r20 = r2;
        r3 = 0;
        goto L_0x07b5;
    L_0x07b1:
        r0 = move-exception;
        r3 = 0;
        r20 = 0;
    L_0x07b5:
        if (r20 == 0) goto L_0x07ba;
    L_0x07b7:
        r20.close();
    L_0x07ba:
        if (r3 == 0) goto L_0x07bf;
    L_0x07bc:
        r3.close();
    L_0x07bf:
        goto L_0x07c1;
    L_0x07c0:
        throw r0;
    L_0x07c1:
        goto L_0x07c0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsa.a(java.io.File):amey");
    }

    public final void a(double d) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f != null) {
            long j = this.h;
            if (j == -1 || Math.abs(j - currentTimeMillis) >= this.g) {
                this.f.a(d);
                this.h = currentTimeMillis;
            }
        }
    }

    public final boolean a() {
        return (this.e.e() || this.e.g()) ? false : true;
    }

    public final Bitmap a(Point point) {
        String str = "Error while extracting thumbnail";
        if (!this.e.e()) {
            return this.d.a(point);
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        ukm ukm = new ukm();
        ukz ukz = this.e.b;
        float a = (float) ukz.a();
        float b = (float) ukz.b();
        float min = Math.min(((float) point.x) / a, ((float) point.y) / b);
        int i = (int) (a * min);
        int i2 = (int) (b * min);
        uop uop = new uop(this.b, ukz, i, i2, priorityBlockingQueue, ukq.a, ukf.b, uoh.a, ukm);
        uop.start();
        Bitmap e;
        try {
            if (uop.a.await(a, TimeUnit.MILLISECONDS)) {
                if (uop.b instanceof IOException) {
                    throw new IOException(uop.b);
                } else if (uop.b instanceof uoe) {
                    throw new uoe(uop.b);
                } else if (uop.b != null) {
                    String valueOf = String.valueOf(uop.b);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 36);
                    stringBuilder.append("Unexpected initialization exception ");
                    stringBuilder.append(valueOf);
                    throw new AssertionError(stringBuilder.toString());
                }
            }
            long j = this.e.j();
            long l = this.e.l();
            ukz ukz2 = this.e.b;
            i = ukz2.a(j);
            int b2 = ukz2.b(j);
            if (b2 == -1 || ukz2.b(b2) > l) {
                b2 = i;
            }
            uom uom = new uom(b2);
            priorityBlockingQueue.add(uom);
            uom.c.await(a, TimeUnit.MILLISECONDS);
            e = uom.d;
            return e;
        } catch (IOException e2) {
            e = e2;
            xtl.a(str, (Throwable) e);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            xtl.a(str, (Throwable) e);
            return null;
        } catch (uoe e4) {
            e = e4;
            xtl.a(str, (Throwable) e);
            return null;
        } finally {
            uop.a();
        }
    }

    public final ayuo a(String str, String str2) {
        String str3 = str;
        byte[] bArr = new byte[0];
        String str4 = this.i;
        if (str4 != null) {
            File file = new File(str4);
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr2);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    xtl.a("Error reading video effects state file", e);
                }
            }
        }
        Object d = this.e.d();
        long m = this.e.m() - this.e.k();
        zka zka = r7;
        zka zka2 = new zka(this.e.o(), this.e.p(), this.e.q(), this.e.r());
        amqw.a(d);
        amqw.a((Object) str);
        ayur ayur;
        if (d.equals("NORMAL") && ((bArr == null || bArr.length == 0) && !zka.a())) {
            axca axca = (axca) axcb.c.createBuilder();
            axca.a(str3);
            ayur = (ayur) ayuo.d.createBuilder();
            ayur.a((axcb) ((anxl) axca.build()));
            return (ayuo) ((anxl) ayur.build());
        }
        axca axca2 = (axca) axcb.c.createBuilder();
        axca2.a(str3);
        axcb axcb = (axcb) ((anxl) axca2.build());
        arag arag = (arag) arah.c.createBuilder();
        arag.a(axcb);
        arah arah = (arah) ((anxl) arag.build());
        araf araf = (araf) arac.g.createBuilder();
        araf.a(arah);
        araf.copyOnWrite();
        arac arac = (arac) araf.instance;
        arac.a |= 2;
        arac.c = 1;
        arai arai = (arai) araj.d.createBuilder();
        arai.copyOnWrite();
        araj araj = (araj) arai.instance;
        araj.a |= 1;
        araj.b = 0;
        arai.copyOnWrite();
        araj araj2 = (araj) arai.instance;
        araj2.a |= 2;
        araj2.c = (int) m;
        araf.copyOnWrite();
        arac arac2 = (arac) araf.instance;
        arac2.d = (araj) ((anxl) arai.build());
        arac2.a |= 8;
        aqzu aqzu = (aqzu) aqzv.d.createBuilder();
        aqzu.copyOnWrite();
        aqzv aqzv = (aqzv) aqzu.instance;
        aqzv.a |= 1;
        aqzv.b = 13;
        arab arab = (arab) aqzy.d.createBuilder();
        arab.copyOnWrite();
        aqzy aqzy = (aqzy) arab.instance;
        aqzy.a |= 1;
        aqzy.b = d;
        if (bArr != null) {
            anvu a = anvu.a(bArr);
            arab.copyOnWrite();
            aqzy aqzy2 = (aqzy) arab.instance;
            if (a != null) {
                aqzy2.a |= 2;
                aqzy2.c = a;
            } else {
                throw new NullPointerException();
            }
        }
        aqzz aqzz = (aqzz) aqzw.c.createBuilder();
        aqzz.copyOnWrite();
        aqzw aqzw = (aqzw) aqzz.instance;
        aqzw.b = (anxl) arab.build();
        aqzw.a = 2;
        aqzu.copyOnWrite();
        aqzv = (aqzv) aqzu.instance;
        aqzv.c = (aqzw) ((anxl) aqzz.build());
        aqzv.a |= 2;
        araf.copyOnWrite();
        ((arac) araf.instance).e = anxl.emptyProtobufList();
        araf.copyOnWrite();
        arac arac3 = (arac) araf.instance;
        if (!arac3.e.a()) {
            arac3.e = anxl.mutableCopy(arac3.e);
        }
        arac3.e.add((aqzv) ((anxl) aqzu.build()));
        if (zka.a()) {
            aqzs aqzs = (aqzs) aqzt.f.createBuilder();
            zka zka3 = zka;
            double d2 = zka3.a;
            aqzs.copyOnWrite();
            aqzt aqzt = (aqzt) aqzs.instance;
            aqzt.a |= 1;
            aqzt.b = d2;
            d2 = zka3.b;
            aqzs.copyOnWrite();
            aqzt = (aqzt) aqzs.instance;
            aqzt.a |= 2;
            aqzt.c = d2;
            d2 = zka3.c;
            aqzs.copyOnWrite();
            aqzt = (aqzt) aqzs.instance;
            aqzt.a |= 4;
            aqzt.d = d2;
            double d3 = zka3.d;
            aqzs.copyOnWrite();
            aqzt aqzt2 = (aqzt) aqzs.instance;
            aqzt2.a |= 8;
            aqzt2.e = d3;
            araf.copyOnWrite();
            arac = (arac) araf.instance;
            arac.f = (aqzt) ((anxl) aqzs.build());
            arac.a |= 16;
        }
        aqzq aqzq = (aqzq) aqzr.b.createBuilder();
        aqzq.copyOnWrite();
        aqzr aqzr = (aqzr) aqzq.instance;
        aqzr.a();
        aqzr.a.add((arac) ((anxl) araf.build()));
        aqzr aqzr2 = (aqzr) ((anxl) aqzq.build());
        ayur = (ayur) ayuo.d.createBuilder();
        ayur.copyOnWrite();
        ayuo ayuo = (ayuo) ayur.instance;
        if (aqzr2 != null) {
            ayuo.c = aqzr2;
            ayuo.a |= 2;
            return (ayuo) ((anxl) ayur.build());
        }
        throw new NullPointerException();
    }
}
