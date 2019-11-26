package defpackage;

import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: ccb */
public final class ccb {
    public static final bsl a;
    public static final ccd b = new cce();
    private static final bsl c = bsl.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", bsi.c);
    private static final bsl d;
    private static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
    private static final Set f = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));
    private static final Queue g = chv.a(0);
    private final bwd h;
    private final DisplayMetrics i;
    private final bwb j;
    private final List k;
    private final ccj l;

    public ccb(List list, DisplayMetrics displayMetrics, bwd bwd, bwb bwb) {
        if (ccj.a == null) {
            synchronized (ccj.class) {
                if (ccj.a == null) {
                    ccj.a = new ccj();
                }
            }
        }
        this.l = ccj.a;
        this.k = list;
        this.i = (DisplayMetrics) chw.a((Object) displayMetrics);
        this.h = (bwd) chw.a((Object) bwd);
        this.j = (bwb) chw.a((Object) bwb);
    }

    private static int b(double d) {
        return (int) (d + 0.5d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0136 A:{Catch:{ all -> 0x0231 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011b A:{Catch:{ all -> 0x0231 }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a0 A:{Catch:{ all -> 0x0231 }} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019f A:{Catch:{ all -> 0x0231 }} */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d9 A:{Catch:{ all -> 0x0231 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d5 A:{Catch:{ all -> 0x0231 }} */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e7 A:{Catch:{ all -> 0x0231 }} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c1 A:{Catch:{ all -> 0x0231 }} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0286 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0295 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0294 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x029d A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x029c A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02c5 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02bc A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02fb A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02f2 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fe A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0313 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0294 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0295 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x029c A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x029d A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02af A:{SKIP, Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02bc A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02c5 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02f2 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02fb A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fe A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0313 A:{Catch:{ all -> 0x03be }} */
    /* JADX WARNING: Missing block: B:135:0x029d, code skipped:
            if (r2 != false) goto L_0x029f;
     */
    public final defpackage.bvw a(java.io.InputStream r23, int r24, int r25, defpackage.bsq r26, defpackage.ccd r27) {
        /*
        r22 = this;
        r1 = r22;
        r0 = r23;
        r2 = r26;
        r3 = r27;
        r4 = "x";
        r5 = r23.markSupported();
        r6 = "You must provide an InputStream that supports mark()";
        defpackage.chw.a(r5, r6);
        r5 = r1.j;
        r6 = byte[].class;
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r5 = r5.a(r7, r6);
        r5 = (byte[]) r5;
        r6 = defpackage.ccb.a();
        r6.inTempStorage = r5;
        r7 = c;
        r7 = r2.a(r7);
        r7 = (defpackage.bsi) r7;
        r8 = defpackage.cbw.f;
        r8 = r2.a(r8);
        r8 = (defpackage.cbw) r8;
        r9 = d;
        r9 = r2.a(r9);
        r9 = (java.lang.Boolean) r9;
        r9 = r9.booleanValue();
        r10 = a;
        r10 = r2.a(r10);
        r11 = 0;
        r12 = 1;
        if (r10 == 0) goto L_0x005c;
    L_0x004b:
        r10 = a;
        r2 = r2.a(r10);
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x005a;
    L_0x0059:
        goto L_0x005c;
    L_0x005a:
        r2 = 1;
        goto L_0x005d;
    L_0x005c:
        r2 = 0;
    L_0x005d:
        defpackage.chs.a();	 Catch:{ all -> 0x03c2 }
        r10 = r1.h;	 Catch:{ all -> 0x03c2 }
        r10 = defpackage.ccb.a(r0, r6, r3, r10);	 Catch:{ all -> 0x03c2 }
        r13 = r10[r11];	 Catch:{ all -> 0x03c2 }
        r10 = r10[r12];	 Catch:{ all -> 0x03c2 }
        r14 = r6.outMimeType;	 Catch:{ all -> 0x03c2 }
        r14 = -1;
        if (r13 != r14) goto L_0x0071;
    L_0x006f:
        r2 = 0;
        goto L_0x0074;
    L_0x0071:
        if (r10 != r14) goto L_0x0074;
    L_0x0073:
        goto L_0x006f;
    L_0x0074:
        r14 = r1.k;	 Catch:{ all -> 0x03c2 }
        r15 = r1.j;	 Catch:{ all -> 0x03c2 }
        r14 = defpackage.bsk.b(r14, r0, r15);	 Catch:{ all -> 0x03c2 }
        r15 = defpackage.ccr.a(r14);	 Catch:{ all -> 0x03c2 }
        r16 = defpackage.ccr.b(r14);	 Catch:{ all -> 0x03c2 }
        r11 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r12 = r24;
        if (r12 != r11) goto L_0x0090;
    L_0x008a:
        r12 = r25;
        r17 = r5;
        r5 = r13;
        goto L_0x0095;
    L_0x0090:
        r17 = r5;
        r5 = r12;
        r12 = r25;
    L_0x0095:
        if (r12 != r11) goto L_0x0098;
    L_0x0097:
        r12 = r10;
    L_0x0098:
        r11 = r1.k;	 Catch:{ all -> 0x03be }
        r26 = r14;
        r14 = r1.j;	 Catch:{ all -> 0x03be }
        r11 = defpackage.bsk.a(r11, r0, r14);	 Catch:{ all -> 0x03be }
        r14 = r1.h;	 Catch:{ all -> 0x03be }
        r18 = r9;
        if (r13 <= 0) goto L_0x0236;
    L_0x00a8:
        if (r10 <= 0) goto L_0x0236;
    L_0x00aa:
        r9 = 90;
        if (r15 != r9) goto L_0x00af;
    L_0x00ae:
        goto L_0x00b8;
    L_0x00af:
        r9 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r15 == r9) goto L_0x00b8;
    L_0x00b3:
        r9 = r8.a(r13, r10, r5, r12);	 Catch:{ all -> 0x03be }
        goto L_0x00bc;
    L_0x00b8:
        r9 = r8.a(r10, r13, r5, r12);	 Catch:{ all -> 0x0231 }
    L_0x00bc:
        r15 = 0;
        r19 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1));
        if (r19 <= 0) goto L_0x01e7;
    L_0x00c1:
        r4 = r8.a();	 Catch:{ all -> 0x0231 }
        if (r4 == 0) goto L_0x01df;
    L_0x00c7:
        r15 = (float) r13;	 Catch:{ all -> 0x0231 }
        r19 = r7;
        r7 = r9 * r15;
        r20 = r2;
        r1 = (double) r7;	 Catch:{ all -> 0x0231 }
        r1 = defpackage.ccb.b(r1);	 Catch:{ all -> 0x0231 }
        r2 = (float) r10;	 Catch:{ all -> 0x0231 }
        r7 = r9 * r2;
        r21 = r8;
        r7 = (double) r7;	 Catch:{ all -> 0x0231 }
        r7 = defpackage.ccb.b(r7);	 Catch:{ all -> 0x0231 }
        r1 = r13 / r1;
        r7 = r10 / r7;
        r8 = 1;
        if (r4 != r8) goto L_0x00e9;
    L_0x00e4:
        r1 = java.lang.Math.max(r1, r7);	 Catch:{ all -> 0x0231 }
        goto L_0x00ed;
    L_0x00e9:
        r1 = java.lang.Math.min(r1, r7);	 Catch:{ all -> 0x0231 }
    L_0x00ed:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0231 }
        r8 = 23;
        if (r7 > r8) goto L_0x0100;
    L_0x00f3:
        r7 = e;	 Catch:{ all -> 0x0231 }
        r8 = r6.outMimeType;	 Catch:{ all -> 0x0231 }
        r7 = r7.contains(r8);	 Catch:{ all -> 0x0231 }
        if (r7 != 0) goto L_0x00fe;
    L_0x00fd:
        goto L_0x0100;
    L_0x00fe:
        r1 = 1;
        goto L_0x0115;
    L_0x0100:
        r1 = java.lang.Integer.highestOneBit(r1);	 Catch:{ all -> 0x0231 }
        r7 = 1;
        r1 = java.lang.Math.max(r7, r1);	 Catch:{ all -> 0x0231 }
        if (r4 != r7) goto L_0x0115;
    L_0x010b:
        r4 = (float) r1;	 Catch:{ all -> 0x0231 }
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = r7 / r9;
        r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r4 >= 0) goto L_0x0115;
    L_0x0114:
        r1 = r1 + r1;
    L_0x0115:
        r6.inSampleSize = r1;	 Catch:{ all -> 0x0231 }
        r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG;	 Catch:{ all -> 0x0231 }
        if (r11 != r4) goto L_0x0136;
    L_0x011b:
        r4 = 8;
        r7 = java.lang.Math.min(r1, r4);	 Catch:{ all -> 0x0231 }
        r7 = (float) r7;	 Catch:{ all -> 0x0231 }
        r15 = r15 / r7;
        r8 = (double) r15;	 Catch:{ all -> 0x0231 }
        r8 = java.lang.Math.ceil(r8);	 Catch:{ all -> 0x0231 }
        r8 = (int) r8;	 Catch:{ all -> 0x0231 }
        r2 = r2 / r7;
        r14 = (double) r2;	 Catch:{ all -> 0x0231 }
        r14 = java.lang.Math.ceil(r14);	 Catch:{ all -> 0x0231 }
        r2 = (int) r14;	 Catch:{ all -> 0x0231 }
        r1 = r1 / r4;
        if (r1 <= 0) goto L_0x0191;
    L_0x0133:
        r8 = r8 / r1;
        r2 = r2 / r1;
        goto L_0x0191;
    L_0x0136:
        r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;	 Catch:{ all -> 0x0231 }
        if (r11 == r4) goto L_0x0182;
    L_0x013a:
        r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A;	 Catch:{ all -> 0x0231 }
        if (r11 == r4) goto L_0x0182;
    L_0x013e:
        r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP;	 Catch:{ all -> 0x0231 }
        if (r11 == r4) goto L_0x0161;
    L_0x0142:
        r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A;	 Catch:{ all -> 0x0231 }
        if (r11 != r4) goto L_0x0147;
    L_0x0146:
        goto L_0x0161;
    L_0x0147:
        r2 = r13 % r1;
        if (r2 != 0) goto L_0x0155;
    L_0x014b:
        r2 = r10 % r1;
        if (r2 == 0) goto L_0x0150;
    L_0x014f:
        goto L_0x0155;
    L_0x0150:
        r8 = r13 / r1;
        r2 = r10 / r1;
        goto L_0x0191;
    L_0x0155:
        r1 = defpackage.ccb.a(r0, r6, r3, r14);	 Catch:{ all -> 0x0231 }
        r2 = 0;
        r8 = r1[r2];	 Catch:{ all -> 0x0231 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ all -> 0x0231 }
        r2 = r1;
        goto L_0x0191;
    L_0x0161:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0231 }
        r7 = 24;
        if (r4 < r7) goto L_0x0173;
    L_0x0167:
        r1 = (float) r1;	 Catch:{ all -> 0x0231 }
        r15 = r15 / r1;
        r8 = java.lang.Math.round(r15);	 Catch:{ all -> 0x0231 }
        r2 = r2 / r1;
        r2 = java.lang.Math.round(r2);	 Catch:{ all -> 0x0231 }
        goto L_0x0191;
    L_0x0173:
        r1 = (float) r1;	 Catch:{ all -> 0x0231 }
        r15 = r15 / r1;
        r7 = (double) r15;	 Catch:{ all -> 0x0231 }
        r7 = java.lang.Math.floor(r7);	 Catch:{ all -> 0x0231 }
        r8 = (int) r7;	 Catch:{ all -> 0x0231 }
        r2 = r2 / r1;
        r1 = (double) r2;	 Catch:{ all -> 0x0231 }
        r1 = java.lang.Math.floor(r1);	 Catch:{ all -> 0x0231 }
        goto L_0x0190;
    L_0x0182:
        r1 = (float) r1;	 Catch:{ all -> 0x0231 }
        r15 = r15 / r1;
        r7 = (double) r15;	 Catch:{ all -> 0x0231 }
        r7 = java.lang.Math.floor(r7);	 Catch:{ all -> 0x0231 }
        r8 = (int) r7;	 Catch:{ all -> 0x0231 }
        r2 = r2 / r1;
        r1 = (double) r2;	 Catch:{ all -> 0x0231 }
        r1 = java.lang.Math.floor(r1);	 Catch:{ all -> 0x0231 }
    L_0x0190:
        r2 = (int) r1;	 Catch:{ all -> 0x0231 }
    L_0x0191:
        r1 = r8;
        r8 = r21;
        r1 = r8.a(r1, r2, r5, r12);	 Catch:{ all -> 0x0231 }
        r1 = (double) r1;	 Catch:{ all -> 0x0231 }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0231 }
        r7 = 19;
        if (r4 >= r7) goto L_0x01a0;
    L_0x019f:
        goto L_0x01cf;
    L_0x01a0:
        r4 = defpackage.ccb.a(r1);	 Catch:{ all -> 0x0231 }
        r7 = (double) r4;
        java.lang.Double.isNaN(r7);
        java.lang.Double.isNaN(r1);
        r7 = r7 * r1;
        r7 = defpackage.ccb.b(r7);	 Catch:{ all -> 0x0231 }
        r8 = (float) r7;
        r4 = (float) r4;
        r8 = r8 / r4;
        r8 = (double) r8;
        java.lang.Double.isNaN(r1);
        java.lang.Double.isNaN(r8);
        r8 = r1 / r8;
        r14 = (double) r7;
        java.lang.Double.isNaN(r14);
        r8 = r8 * r14;
        r4 = defpackage.ccb.b(r8);	 Catch:{ all -> 0x0231 }
        r6.inTargetDensity = r4;	 Catch:{ all -> 0x0231 }
        r1 = defpackage.ccb.a(r1);	 Catch:{ all -> 0x0231 }
        r6.inDensity = r1;	 Catch:{ all -> 0x0231 }
    L_0x01cf:
        r1 = defpackage.ccb.a(r6);	 Catch:{ all -> 0x0231 }
        if (r1 == 0) goto L_0x01d9;
    L_0x01d5:
        r1 = 1;
        r6.inScaled = r1;	 Catch:{ all -> 0x0231 }
        goto L_0x023a;
    L_0x01d9:
        r1 = 0;
        r6.inTargetDensity = r1;	 Catch:{ all -> 0x0231 }
        r6.inDensity = r1;	 Catch:{ all -> 0x0231 }
        goto L_0x023a;
    L_0x01df:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0231 }
        r1 = "Cannot round with null rounding";
        r0.<init>(r1);	 Catch:{ all -> 0x0231 }
        throw r0;	 Catch:{ all -> 0x0231 }
    L_0x01e7:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0231 }
        r1 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0231 }
        r2 = r1.length();	 Catch:{ all -> 0x0231 }
        r2 = r2 + 118;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0231 }
        r3.<init>(r2);	 Catch:{ all -> 0x0231 }
        r2 = "Cannot scale with factor: ";
        r3.append(r2);	 Catch:{ all -> 0x0231 }
        r3.append(r9);	 Catch:{ all -> 0x0231 }
        r2 = " from: ";
        r3.append(r2);	 Catch:{ all -> 0x0231 }
        r3.append(r1);	 Catch:{ all -> 0x0231 }
        r1 = ", source: [";
        r3.append(r1);	 Catch:{ all -> 0x0231 }
        r3.append(r13);	 Catch:{ all -> 0x0231 }
        r3.append(r4);	 Catch:{ all -> 0x0231 }
        r3.append(r10);	 Catch:{ all -> 0x0231 }
        r1 = "], target: [";
        r3.append(r1);	 Catch:{ all -> 0x0231 }
        r3.append(r5);	 Catch:{ all -> 0x0231 }
        r3.append(r4);	 Catch:{ all -> 0x0231 }
        r3.append(r12);	 Catch:{ all -> 0x0231 }
        r1 = "]";
        r3.append(r1);	 Catch:{ all -> 0x0231 }
        r1 = r3.toString();	 Catch:{ all -> 0x0231 }
        r0.<init>(r1);	 Catch:{ all -> 0x0231 }
        throw r0;	 Catch:{ all -> 0x0231 }
    L_0x0231:
        r0 = move-exception;
        r1 = r22;
        goto L_0x03bf;
    L_0x0236:
        r20 = r2;
        r19 = r7;
    L_0x023a:
        r1 = r22;
        r2 = r1.l;	 Catch:{ all -> 0x03be }
        r4 = 26;
        if (r20 != 0) goto L_0x0244;
    L_0x0242:
        r2 = 0;
        goto L_0x025e;
    L_0x0244:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x03be }
        if (r7 < r4) goto L_0x0242;
    L_0x0248:
        if (r16 != 0) goto L_0x0242;
    L_0x024a:
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r5 < r7) goto L_0x0242;
    L_0x024e:
        if (r12 < r7) goto L_0x0242;
    L_0x0250:
        r2 = r2.a();	 Catch:{ all -> 0x03be }
        if (r2 == 0) goto L_0x0242;
    L_0x0256:
        r2 = android.graphics.Bitmap.Config.HARDWARE;	 Catch:{ all -> 0x03be }
        r6.inPreferredConfig = r2;	 Catch:{ all -> 0x03be }
        r2 = 0;
        r6.inMutable = r2;	 Catch:{ all -> 0x03be }
        goto L_0x028e;
    L_0x025e:
        r7 = defpackage.bsi.PREFER_ARGB_8888;	 Catch:{ all -> 0x03be }
        r8 = r19;
        if (r8 == r7) goto L_0x028a;
    L_0x0264:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x03be }
        r8 = 16;
        if (r7 != r8) goto L_0x026b;
    L_0x026a:
        goto L_0x028a;
    L_0x026b:
        r7 = r1.k;	 Catch:{ IOException -> 0x027c }
        r8 = r1.j;	 Catch:{ IOException -> 0x027c }
        r7 = defpackage.bsk.a(r7, r0, r8);	 Catch:{ IOException -> 0x027c }
        r7 = r7.hasAlpha();	 Catch:{ IOException -> 0x027c }
        if (r7 == 0) goto L_0x027c;
    L_0x0279:
        r7 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ all -> 0x03be }
        goto L_0x027e;
    L_0x027c:
        r7 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ all -> 0x03be }
    L_0x027e:
        r6.inPreferredConfig = r7;	 Catch:{ all -> 0x03be }
        r7 = r6.inPreferredConfig;	 Catch:{ all -> 0x03be }
        r8 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ all -> 0x03be }
        if (r7 != r8) goto L_0x028e;
    L_0x0286:
        r7 = 1;
        r6.inDither = r7;	 Catch:{ all -> 0x03be }
        goto L_0x028e;
    L_0x028a:
        r7 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ all -> 0x03be }
        r6.inPreferredConfig = r7;	 Catch:{ all -> 0x03be }
    L_0x028e:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x03be }
        r8 = 19;
        if (r7 >= r8) goto L_0x0295;
    L_0x0294:
        goto L_0x0296;
    L_0x0295:
        r2 = 1;
    L_0x0296:
        r7 = r6.inSampleSize;	 Catch:{ all -> 0x03be }
        r8 = 0;
        r9 = 1;
        if (r7 != r9) goto L_0x029d;
    L_0x029c:
        goto L_0x029f;
    L_0x029d:
        if (r2 == 0) goto L_0x0306;
    L_0x029f:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x03be }
        r9 = 19;
        if (r7 >= r9) goto L_0x02ad;
    L_0x02a5:
        r7 = f;	 Catch:{ all -> 0x03be }
        r7 = r7.contains(r11);	 Catch:{ all -> 0x03be }
        if (r7 == 0) goto L_0x0306;
    L_0x02ad:
        if (r13 < 0) goto L_0x02b6;
    L_0x02af:
        if (r10 < 0) goto L_0x02b6;
    L_0x02b1:
        if (r18 == 0) goto L_0x02b6;
    L_0x02b3:
        if (r2 == 0) goto L_0x02b6;
    L_0x02b5:
        goto L_0x02e8;
    L_0x02b6:
        r2 = defpackage.ccb.a(r6);	 Catch:{ all -> 0x03be }
        if (r2 == 0) goto L_0x02c5;
    L_0x02bc:
        r2 = r6.inTargetDensity;	 Catch:{ all -> 0x03be }
        r2 = (float) r2;	 Catch:{ all -> 0x03be }
        r5 = r6.inDensity;	 Catch:{ all -> 0x03be }
        r5 = (float) r5;	 Catch:{ all -> 0x03be }
        r9 = r2 / r5;
        goto L_0x02c7;
    L_0x02c5:
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x02c7:
        r2 = r6.inSampleSize;	 Catch:{ all -> 0x03be }
        r5 = (float) r13;	 Catch:{ all -> 0x03be }
        r2 = (float) r2;	 Catch:{ all -> 0x03be }
        r5 = r5 / r2;
        r11 = (double) r5;	 Catch:{ all -> 0x03be }
        r11 = java.lang.Math.ceil(r11);	 Catch:{ all -> 0x03be }
        r5 = (int) r11;	 Catch:{ all -> 0x03be }
        r7 = (float) r10;	 Catch:{ all -> 0x03be }
        r7 = r7 / r2;
        r10 = (double) r7;	 Catch:{ all -> 0x03be }
        r10 = java.lang.Math.ceil(r10);	 Catch:{ all -> 0x03be }
        r2 = (int) r10;	 Catch:{ all -> 0x03be }
        r5 = (float) r5;	 Catch:{ all -> 0x03be }
        r5 = r5 * r9;
        r5 = java.lang.Math.round(r5);	 Catch:{ all -> 0x03be }
        r2 = (float) r2;	 Catch:{ all -> 0x03be }
        r2 = r2 * r9;
        r12 = java.lang.Math.round(r2);	 Catch:{ all -> 0x03be }
    L_0x02e8:
        if (r5 <= 0) goto L_0x0306;
    L_0x02ea:
        if (r12 <= 0) goto L_0x0306;
    L_0x02ec:
        r2 = r1.h;	 Catch:{ all -> 0x03be }
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x03be }
        if (r7 < r4) goto L_0x02fb;
    L_0x02f2:
        r4 = r6.inPreferredConfig;	 Catch:{ all -> 0x03be }
        r7 = android.graphics.Bitmap.Config.HARDWARE;	 Catch:{ all -> 0x03be }
        if (r4 == r7) goto L_0x0306;
    L_0x02f8:
        r4 = r6.outConfig;	 Catch:{ all -> 0x03be }
        goto L_0x02fc;
    L_0x02fb:
        r4 = r8;
    L_0x02fc:
        if (r4 != 0) goto L_0x0300;
    L_0x02fe:
        r4 = r6.inPreferredConfig;	 Catch:{ all -> 0x03be }
    L_0x0300:
        r2 = r2.b(r5, r12, r4);	 Catch:{ all -> 0x03be }
        r6.inBitmap = r2;	 Catch:{ all -> 0x03be }
    L_0x0306:
        r2 = r1.h;	 Catch:{ all -> 0x03be }
        r0 = defpackage.ccb.b(r0, r6, r3, r2);	 Catch:{ all -> 0x03be }
        r2 = r1.h;	 Catch:{ all -> 0x03be }
        r3.a(r2, r0);	 Catch:{ all -> 0x03be }
        if (r0 == 0) goto L_0x03ad;
    L_0x0313:
        r2 = r1.i;	 Catch:{ all -> 0x03be }
        r2 = r2.densityDpi;	 Catch:{ all -> 0x03be }
        r0.setDensity(r2);	 Catch:{ all -> 0x03be }
        r2 = r1.h;	 Catch:{ all -> 0x03be }
        r3 = defpackage.ccr.b(r26);	 Catch:{ all -> 0x03be }
        if (r3 == 0) goto L_0x03a1;
    L_0x0322:
        r3 = new android.graphics.Matrix;	 Catch:{ all -> 0x03be }
        r3.<init>();	 Catch:{ all -> 0x03be }
        r4 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r5 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        switch(r26) {
            case 2: goto L_0x035c;
            case 3: goto L_0x0358;
            case 4: goto L_0x034f;
            case 5: goto L_0x0346;
            case 6: goto L_0x0342;
            case 7: goto L_0x0337;
            case 8: goto L_0x0331;
            default: goto L_0x0330;
        };	 Catch:{ all -> 0x03be }
    L_0x0330:
        goto L_0x0361;
    L_0x0331:
        r4 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;
        r3.setRotate(r4);	 Catch:{ all -> 0x03be }
        goto L_0x0361;
    L_0x0337:
        r4 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;
        r3.setRotate(r4);	 Catch:{ all -> 0x03be }
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.postScale(r7, r4);	 Catch:{ all -> 0x03be }
        goto L_0x0361;
    L_0x0342:
        r3.setRotate(r4);	 Catch:{ all -> 0x03be }
        goto L_0x0361;
    L_0x0346:
        r3.setRotate(r4);	 Catch:{ all -> 0x03be }
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.postScale(r7, r4);	 Catch:{ all -> 0x03be }
        goto L_0x0361;
    L_0x034f:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.setRotate(r5);	 Catch:{ all -> 0x03be }
        r3.postScale(r7, r4);	 Catch:{ all -> 0x03be }
        goto L_0x0361;
    L_0x0358:
        r3.setRotate(r5);	 Catch:{ all -> 0x03be }
        goto L_0x0361;
    L_0x035c:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.setScale(r7, r4);	 Catch:{ all -> 0x03be }
    L_0x0361:
        r4 = new android.graphics.RectF;	 Catch:{ all -> 0x03be }
        r5 = r0.getWidth();	 Catch:{ all -> 0x03be }
        r5 = (float) r5;	 Catch:{ all -> 0x03be }
        r7 = r0.getHeight();	 Catch:{ all -> 0x03be }
        r7 = (float) r7;	 Catch:{ all -> 0x03be }
        r8 = 0;
        r4.<init>(r8, r8, r5, r7);	 Catch:{ all -> 0x03be }
        r3.mapRect(r4);	 Catch:{ all -> 0x03be }
        r5 = r4.width();	 Catch:{ all -> 0x03be }
        r5 = java.lang.Math.round(r5);	 Catch:{ all -> 0x03be }
        r7 = r4.height();	 Catch:{ all -> 0x03be }
        r7 = java.lang.Math.round(r7);	 Catch:{ all -> 0x03be }
        r8 = defpackage.ccr.a(r0);	 Catch:{ all -> 0x03be }
        r2 = r2.a(r5, r7, r8);	 Catch:{ all -> 0x03be }
        r5 = r4.left;	 Catch:{ all -> 0x03be }
        r5 = -r5;
        r4 = r4.top;	 Catch:{ all -> 0x03be }
        r4 = -r4;
        r3.postTranslate(r5, r4);	 Catch:{ all -> 0x03be }
        r4 = r0.hasAlpha();	 Catch:{ all -> 0x03be }
        r2.setHasAlpha(r4);	 Catch:{ all -> 0x03be }
        defpackage.ccr.a(r0, r2, r3);	 Catch:{ all -> 0x03be }
        r8 = r2;
        goto L_0x03a2;
    L_0x03a1:
        r8 = r0;
    L_0x03a2:
        r2 = r0.equals(r8);	 Catch:{ all -> 0x03be }
        if (r2 != 0) goto L_0x03ad;
    L_0x03a8:
        r2 = r1.h;	 Catch:{ all -> 0x03be }
        r2.a(r0);	 Catch:{ all -> 0x03be }
    L_0x03ad:
        r0 = r1.h;	 Catch:{ all -> 0x03be }
        r0 = defpackage.cbj.a(r8, r0);	 Catch:{ all -> 0x03be }
        defpackage.ccb.b(r6);
        r2 = r1.j;
        r5 = r17;
        r2.b(r5);
        return r0;
    L_0x03be:
        r0 = move-exception;
    L_0x03bf:
        r5 = r17;
        goto L_0x03c3;
    L_0x03c2:
        r0 = move-exception;
    L_0x03c3:
        defpackage.ccb.b(r6);
        r2 = r1.j;
        r2.b(r5);
        goto L_0x03cd;
    L_0x03cc:
        throw r0;
    L_0x03cd:
        goto L_0x03cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccb.a(java.io.InputStream, int, int, bsq, ccd):bvw");
    }

    private static int a(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private static int[] a(InputStream inputStream, Options options, ccd ccd, bwd bwd) {
        options.inJustDecodeBounds = true;
        ccb.b(inputStream, options, ccd, bwd);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00f2 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|23|24) */
    private static android.graphics.Bitmap b(java.io.InputStream r15, android.graphics.BitmapFactory.Options r16, defpackage.ccd r17, defpackage.bwd r18) {
        /*
        r1 = r15;
        r2 = r16;
        r0 = r2.inJustDecodeBounds;
        if (r0 == 0) goto L_0x000d;
    L_0x0007:
        r0 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r15.mark(r0);
        goto L_0x0010;
    L_0x000d:
        r17.a();
    L_0x0010:
        r3 = r2.outWidth;
        r4 = r2.outHeight;
        r5 = r2.outMimeType;
        r0 = defpackage.ccr.a;
        r0.lock();
        r6 = 0;
        r0 = android.graphics.BitmapFactory.decodeStream(r15, r6, r2);	 Catch:{ IllegalArgumentException -> 0x0030 }
        r3 = defpackage.ccr.a;
        r3.unlock();
        r2 = r2.inJustDecodeBounds;
        if (r2 == 0) goto L_0x002c;
    L_0x0029:
        r15.reset();
    L_0x002c:
        return r0;
    L_0x002d:
        r0 = move-exception;
        goto L_0x00f4;
    L_0x0030:
        r0 = move-exception;
        r7 = r0;
        r0 = new java.io.IOException;	 Catch:{ all -> 0x002d }
        r8 = r2.inBitmap;	 Catch:{ all -> 0x002d }
        if (r8 == 0) goto L_0x0098;
    L_0x0038:
        r9 = r8.getAllocationByteCount();	 Catch:{ all -> 0x002d }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002d }
        r11 = 14;
        r10.<init>(r11);	 Catch:{ all -> 0x002d }
        r11 = " (";
        r10.append(r11);	 Catch:{ all -> 0x002d }
        r10.append(r9);	 Catch:{ all -> 0x002d }
        r9 = ")";
        r10.append(r9);	 Catch:{ all -> 0x002d }
        r9 = r10.toString();	 Catch:{ all -> 0x002d }
        r10 = r8.getWidth();	 Catch:{ all -> 0x002d }
        r11 = r8.getHeight();	 Catch:{ all -> 0x002d }
        r8 = r8.getConfig();	 Catch:{ all -> 0x002d }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x002d }
        r12 = r8.length();	 Catch:{ all -> 0x002d }
        r13 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x002d }
        r13 = r13.length();	 Catch:{ all -> 0x002d }
        r14 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002d }
        r12 = r12 + 26;
        r12 = r12 + r13;
        r14.<init>(r12);	 Catch:{ all -> 0x002d }
        r12 = "[";
        r14.append(r12);	 Catch:{ all -> 0x002d }
        r14.append(r10);	 Catch:{ all -> 0x002d }
        r10 = "x";
        r14.append(r10);	 Catch:{ all -> 0x002d }
        r14.append(r11);	 Catch:{ all -> 0x002d }
        r10 = "] ";
        r14.append(r10);	 Catch:{ all -> 0x002d }
        r14.append(r8);	 Catch:{ all -> 0x002d }
        r14.append(r9);	 Catch:{ all -> 0x002d }
        r8 = r14.toString();	 Catch:{ all -> 0x002d }
        goto L_0x0099;
    L_0x0098:
        r8 = r6;
    L_0x0099:
        r9 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x002d }
        r9 = r9.length();	 Catch:{ all -> 0x002d }
        r9 = r9 + 99;
        r10 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x002d }
        r10 = r10.length();	 Catch:{ all -> 0x002d }
        r9 = r9 + r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002d }
        r10.<init>(r9);	 Catch:{ all -> 0x002d }
        r9 = "Exception decoding bitmap, outWidth: ";
        r10.append(r9);	 Catch:{ all -> 0x002d }
        r10.append(r3);	 Catch:{ all -> 0x002d }
        r3 = ", outHeight: ";
        r10.append(r3);	 Catch:{ all -> 0x002d }
        r10.append(r4);	 Catch:{ all -> 0x002d }
        r3 = ", outMimeType: ";
        r10.append(r3);	 Catch:{ all -> 0x002d }
        r10.append(r5);	 Catch:{ all -> 0x002d }
        r3 = ", inBitmap: ";
        r10.append(r3);	 Catch:{ all -> 0x002d }
        r10.append(r8);	 Catch:{ all -> 0x002d }
        r3 = r10.toString();	 Catch:{ all -> 0x002d }
        r0.<init>(r3, r7);	 Catch:{ all -> 0x002d }
        r3 = r2.inBitmap;	 Catch:{ all -> 0x002d }
        if (r3 == 0) goto L_0x00f3;
    L_0x00dc:
        r15.reset();	 Catch:{ IOException -> 0x00f2 }
        r3 = r2.inBitmap;	 Catch:{ IOException -> 0x00f2 }
        r4 = r18;
        r4.a(r3);	 Catch:{ IOException -> 0x00f2 }
        r2.inBitmap = r6;	 Catch:{ IOException -> 0x00f2 }
        r0 = defpackage.ccb.b(r15, r16, r17, r18);	 Catch:{ IOException -> 0x00f2 }
        r1 = defpackage.ccr.a;
        r1.unlock();
        return r0;
    L_0x00f2:
        throw r0;	 Catch:{ all -> 0x002d }
    L_0x00f3:
        throw r0;	 Catch:{ all -> 0x002d }
    L_0x00f4:
        r1 = defpackage.ccr.a;
        r1.unlock();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccb.b(java.io.InputStream, android.graphics.BitmapFactory$Options, ccd, bwd):android.graphics.Bitmap");
    }

    private static boolean a(Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static synchronized Options a() {
        synchronized (ccb.class) {
            Options options;
            synchronized (g) {
                options = (Options) g.poll();
            }
            if (options == null) {
                Options options2 = new Options();
                ccb.c(options2);
                return options2;
            }
            return options;
        }
    }

    private static void b(Options options) {
        ccb.c(options);
        synchronized (g) {
            g.offer(options);
        }
    }

    private static void c(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    static {
        Boolean valueOf = Boolean.valueOf(false);
        d = bsl.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", valueOf);
        a = bsl.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", valueOf);
    }
}
