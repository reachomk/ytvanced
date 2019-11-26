package defpackage;

import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import com.google.android.libraries.youtube.media.player.exo.libvpx.VpxDecoder;

/* renamed from: affd */
public final class affd {
    public static final amro a = affc.a;
    public static final amro b = afff.a;
    public static final affh c = new affh(amwp.a, 0);

    public static boolean a() {
        return VpxDecoder.a && VpxLibrary.a();
    }

    public static affe a(aajs aajs, aajj aajj, afjc afjc, amro amro) {
        if (aajj.c() && aajj.d() && aajs.s() && (afjc.b(aajj.ah()) || (aajj.e() && ((Boolean) amro.get()).booleanValue()))) {
            return new affe(aahv.k(), 5);
        }
        if (aajj.c() && aajs.r()) {
            return new affe(aahv.j(), 6);
        }
        if (affd.d(aajs, aajj, afjc)) {
            int a = aoye.a(afjc.a().u);
            if (a != 0 && a == 3) {
                return new affe(aahv.a(aajj.R()), 1);
            }
        }
        if (affd.d(aajs, aajj, afjc) && ((Boolean) amro.get()).booleanValue()) {
            int a2 = aoye.a(afjc.a().u);
            if (a2 != 0 && a2 == 4) {
                return new affe(aahv.a(aajj.R()), 4);
            }
        }
        return new affe(aahv.m(), 1);
    }

    private static boolean d(aajs aajs, aajj aajj, afjc afjc) {
        if (aajj.Q() && afjc.b(aajj.ah())) {
            for (aahr b : aajs.n) {
                if (aahv.l().contains(Integer.valueOf(b.b()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            if (r3.aT != false) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:14:0x0028, code skipped:
            if (r2 == defpackage.aajm.VP9_MEDIA_CODEC_HW) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:15:0x002a, code skipped:
            r2 = r6.ah();
            r6 = r6.ai();
     */
    /* JADX WARNING: Missing block: B:16:0x0036, code skipped:
            if (r7.c(r0) != false) goto L_0x0039;
     */
    /* JADX WARNING: Missing block: B:18:0x003b, code skipped:
            if (r5.t != false) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:20:0x0041, code skipped:
            if (r7.c(r2, r6) == false) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:22:0x0044, code skipped:
            return true;
     */
    public static boolean a(defpackage.aajs r5, defpackage.aajj r6, defpackage.afjc r7) {
        /*
        r0 = r5.u;
        r1 = 0;
        r2 = 3;
        if (r0 == r2) goto L_0x0045;
    L_0x0006:
        r2 = r5.t;
        if (r2 != 0) goto L_0x0045;
    L_0x000a:
        r2 = r7.m();
        r3 = defpackage.aajm.DEFAULT;
        if (r2 == r3) goto L_0x0013;
    L_0x0012:
        goto L_0x0026;
    L_0x0013:
        r3 = r6.c;
        r4 = r3.a;
        r4 = r4 & 2;
        if (r4 == 0) goto L_0x0026;
    L_0x001b:
        r3 = r3.d;
        if (r3 != 0) goto L_0x0021;
    L_0x001f:
        r3 = defpackage.arhh.bv;
    L_0x0021:
        r3 = r3.aT;
        if (r3 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x002a;
    L_0x0026:
        r3 = defpackage.aajm.VP9_MEDIA_CODEC_HW;
        if (r2 != r3) goto L_0x0045;
    L_0x002a:
        r2 = r6.ah();
        r6 = r6.ai();
        r0 = r7.c(r0);
        if (r0 != 0) goto L_0x0039;
    L_0x0038:
        goto L_0x0045;
    L_0x0039:
        r5 = r5.t;
        if (r5 != 0) goto L_0x0045;
    L_0x003d:
        r5 = r7.c(r2, r6);
        if (r5 == 0) goto L_0x0045;
    L_0x0043:
        r5 = 1;
        return r5;
    L_0x0045:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affd.a(aajs, aajj, afjc):boolean");
    }

    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            if (r2.aU != false) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:14:0x0028, code skipped:
            if (r4 == defpackage.aajm.VP9_MEDIA_CODEC) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:15:0x002a, code skipped:
            r4 = r5.ah();
     */
    /* JADX WARNING: Missing block: B:16:0x0032, code skipped:
            if (r6.c(r0) == false) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:18:0x003c, code skipped:
            if (r6.c(r4, java.util.Collections.emptySet()) == false) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:20:0x003f, code skipped:
            return true;
     */
    public static boolean b(defpackage.aajs r4, defpackage.aajj r5, defpackage.afjc r6) {
        /*
        r0 = r4.u;
        r1 = 0;
        r2 = 3;
        if (r0 == r2) goto L_0x0040;
    L_0x0006:
        r4 = r4.t;
        if (r4 != 0) goto L_0x0040;
    L_0x000a:
        r4 = r6.m();
        r2 = defpackage.aajm.DEFAULT;
        if (r4 == r2) goto L_0x0013;
    L_0x0012:
        goto L_0x0026;
    L_0x0013:
        r2 = r5.c;
        r3 = r2.a;
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x0026;
    L_0x001b:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0021;
    L_0x001f:
        r2 = defpackage.arhh.bv;
    L_0x0021:
        r2 = r2.aU;
        if (r2 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x002a;
    L_0x0026:
        r2 = defpackage.aajm.VP9_MEDIA_CODEC;
        if (r4 != r2) goto L_0x0040;
    L_0x002a:
        r4 = r5.ah();
        r5 = r6.c(r0);
        if (r5 == 0) goto L_0x0040;
    L_0x0034:
        r5 = java.util.Collections.emptySet();
        r4 = r6.c(r4, r5);
        if (r4 == 0) goto L_0x0040;
    L_0x003e:
        r4 = 1;
        return r4;
    L_0x0040:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affd.b(aajs, aajj, afjc):boolean");
    }

    /* JADX WARNING: Missing block: B:14:0x002b, code skipped:
            if (r4.ac() != false) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:16:0x002f, code skipped:
            if (r3 == defpackage.aajm.VP9_LIBVPX_GL) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:18:0x0033, code skipped:
            if (r5.f != false) goto L_0x0096;
     */
    /* JADX WARNING: Missing block: B:20:0x003a, code skipped:
            if (android.os.Build.VERSION.SDK_INT <= 25) goto L_0x0089;
     */
    /* JADX WARNING: Missing block: B:22:0x0046, code skipped:
            if (r5.a.getConfiguration().isScreenWideColorGamut() == false) goto L_0x0089;
     */
    /* JADX WARNING: Missing block: B:23:0x0048, code skipped:
            r4 = "dcip3_supported";
     */
    /* JADX WARNING: Missing block: B:24:0x0050, code skipped:
            if (r5.b.contains(r4) == false) goto L_0x0059;
     */
    /* JADX WARNING: Missing block: B:25:0x0052, code skipped:
            r3 = r5.b.getBoolean(r4, false);
     */
    /* JADX WARNING: Missing block: B:26:0x0059, code skipped:
            r3 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* JADX WARNING: Missing block: B:27:0x0063, code skipped:
            if (r3 == null) goto L_0x0078;
     */
    /* JADX WARNING: Missing block: B:29:0x006b, code skipped:
            if (r3.contains("EGL_KHR_gl_colorspace") == false) goto L_0x0078;
     */
    /* JADX WARNING: Missing block: B:31:0x0073, code skipped:
            if (r3.contains("EGL_EXT_gl_colorspace_display_p3") != false) goto L_0x0076;
     */
    /* JADX WARNING: Missing block: B:32:0x0076, code skipped:
            r3 = true;
     */
    /* JADX WARNING: Missing block: B:33:0x0078, code skipped:
            r3 = false;
     */
    /* JADX WARNING: Missing block: B:34:0x0079, code skipped:
            r5.b.edit().putBoolean(r4, r3).apply();
     */
    /* JADX WARNING: Missing block: B:35:0x0086, code skipped:
            if (r3 != false) goto L_0x0089;
     */
    /* JADX WARNING: Missing block: B:37:0x0093, code skipped:
            if (((java.lang.Boolean) r6.get()).booleanValue() == false) goto L_0x0096;
     */
    /* JADX WARNING: Missing block: B:38:0x0095, code skipped:
            return true;
     */
    public static boolean b(defpackage.aajs r3, defpackage.aajj r4, defpackage.afjc r5, defpackage.amro r6) {
        /*
        r0 = r3.u;
        r1 = 0;
        r2 = 3;
        if (r0 == r2) goto L_0x0096;
    L_0x0006:
        r3 = r3.t;
        if (r3 == 0) goto L_0x000c;
    L_0x000a:
        goto L_0x0096;
    L_0x000c:
        r3 = r5.m();
        r0 = defpackage.aajm.DEFAULT;
        if (r3 == r0) goto L_0x0015;
    L_0x0014:
        goto L_0x002d;
    L_0x0015:
        r0 = r4.c;
        r2 = r0.a;
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x002d;
    L_0x001d:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0023;
    L_0x0021:
        r0 = defpackage.arhh.bv;
    L_0x0023:
        r0 = r0.aS;
        if (r0 == 0) goto L_0x002d;
    L_0x0027:
        r4 = r4.ac();
        if (r4 != 0) goto L_0x0031;
    L_0x002d:
        r4 = defpackage.aajm.VP9_LIBVPX_GL;
        if (r3 != r4) goto L_0x0096;
    L_0x0031:
        r3 = r5.f;
        if (r3 != 0) goto L_0x0096;
    L_0x0035:
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 25;
        r0 = 1;
        if (r3 <= r4) goto L_0x0089;
    L_0x003c:
        r3 = r5.a;
        r3 = r3.getConfiguration();
        r3 = r3.isScreenWideColorGamut();
        if (r3 == 0) goto L_0x0089;
    L_0x0048:
        r3 = r5.b;
        r4 = "dcip3_supported";
        r3 = r3.contains(r4);
        if (r3 == 0) goto L_0x0059;
    L_0x0052:
        r3 = r5.b;
        r3 = r3.getBoolean(r4, r1);
        goto L_0x0086;
    L_0x0059:
        r3 = android.opengl.EGL14.eglGetDisplay(r1);
        r2 = 12373; // 0x3055 float:1.7338E-41 double:6.113E-320;
        r3 = android.opengl.EGL14.eglQueryString(r3, r2);
        if (r3 == 0) goto L_0x0078;
    L_0x0065:
        r2 = "EGL_KHR_gl_colorspace";
        r2 = r3.contains(r2);
        if (r2 == 0) goto L_0x0078;
    L_0x006d:
        r2 = "EGL_EXT_gl_colorspace_display_p3";
        r3 = r3.contains(r2);
        if (r3 != 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0078;
    L_0x0076:
        r3 = 1;
        goto L_0x0079;
    L_0x0078:
        r3 = 0;
    L_0x0079:
        r5 = r5.b;
        r5 = r5.edit();
        r4 = r5.putBoolean(r4, r3);
        r4.apply();
    L_0x0086:
        if (r3 != 0) goto L_0x0089;
    L_0x0088:
        goto L_0x0096;
    L_0x0089:
        r3 = r6.get();
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0096;
    L_0x0095:
        return r0;
    L_0x0096:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affd.b(aajs, aajj, afjc, amro):boolean");
    }

    /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            if (r1.aD != false) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:15:0x002d, code skipped:
            if (r0 == defpackage.aajm.VP9_MEDIA_CODEC_HW) goto L_0x002f;
     */
    private static boolean e(defpackage.aajs r3, defpackage.aajj r4, defpackage.afjc r5) {
        /*
        r0 = r3.r;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        goto L_0x0043;
    L_0x0005:
        r0 = r5.m();
        r3 = r3.t;
        r1 = defpackage.aajm.DEFAULT;
        if (r0 == r1) goto L_0x0010;
    L_0x000f:
        goto L_0x002b;
    L_0x0010:
        if (r3 != 0) goto L_0x0018;
    L_0x0012:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 >= r2) goto L_0x002f;
    L_0x0018:
        r1 = r4.c;
        r2 = r1.a;
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x002b;
    L_0x0020:
        r1 = r1.d;
        if (r1 != 0) goto L_0x0026;
    L_0x0024:
        r1 = defpackage.arhh.bv;
    L_0x0026:
        r1 = r1.aD;
        if (r1 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002f;
    L_0x002b:
        r1 = defpackage.aajm.VP9_MEDIA_CODEC_HW;
        if (r0 != r1) goto L_0x0043;
    L_0x002f:
        r0 = r4.ah();
        r4 = r4.ai();
        if (r3 == 0) goto L_0x003e;
    L_0x0039:
        r3 = r5.b(r0, r4);
        goto L_0x0042;
    L_0x003e:
        r3 = r5.a(r0, r4);
    L_0x0042:
        return r3;
    L_0x0043:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affd.e(aajs, aajj, afjc):boolean");
    }

    /* JADX WARNING: Missing block: B:11:0x0023, code skipped:
            if (r2.K != false) goto L_0x006b;
     */
    /* JADX WARNING: Missing block: B:18:0x0036, code skipped:
            if (r2.L != false) goto L_0x006b;
     */
    /* JADX WARNING: Missing block: B:35:0x0067, code skipped:
            if (r6.a(r5.ah()) == false) goto L_0x006b;
     */
    private static boolean f(defpackage.aajs r4, defpackage.aajj r5, defpackage.afjc r6) {
        /*
        r0 = r4.r;
        if (r0 != 0) goto L_0x0006;
    L_0x0004:
        goto L_0x0069;
    L_0x0006:
        r0 = r6.m();
        r1 = r4.t;
        r2 = defpackage.aajm.DEFAULT;
        if (r0 == r2) goto L_0x0011;
    L_0x0010:
        goto L_0x0039;
    L_0x0011:
        if (r1 != 0) goto L_0x0026;
    L_0x0013:
        r2 = r5.c;
        r3 = r2.a;
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x0039;
    L_0x001b:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0021;
    L_0x001f:
        r2 = defpackage.arhh.bv;
    L_0x0021:
        r2 = r2.K;
        if (r2 == 0) goto L_0x0039;
    L_0x0025:
        goto L_0x006b;
    L_0x0026:
        r2 = r5.c;
        r3 = r2.a;
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x0039;
    L_0x002e:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0034;
    L_0x0032:
        r2 = defpackage.arhh.bv;
    L_0x0034:
        r2 = r2.L;
        if (r2 == 0) goto L_0x0039;
    L_0x0038:
        goto L_0x006b;
    L_0x0039:
        r2 = defpackage.aajm.VP9_MEDIA_CODEC;
        if (r0 != r2) goto L_0x003e;
    L_0x003d:
        goto L_0x006b;
    L_0x003e:
        r0 = r4.s;
        if (r0 == 0) goto L_0x0043;
    L_0x0042:
        goto L_0x0049;
    L_0x0043:
        r0 = r4.l();
        if (r0 == 0) goto L_0x006b;
    L_0x0049:
        r0 = r5.c;
        r2 = r0.a;
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x0069;
    L_0x0051:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0057;
    L_0x0055:
        r0 = defpackage.arhh.bv;
    L_0x0057:
        r0 = r0.M;
        if (r0 == 0) goto L_0x0069;
    L_0x005b:
        r4 = r4.s;
        if (r4 == 0) goto L_0x006b;
    L_0x005f:
        r4 = r5.ah();
        r4 = r6.a(r4);
        if (r4 == 0) goto L_0x006b;
    L_0x0069:
        r4 = 0;
        return r4;
    L_0x006b:
        r4 = r5.ah();
        if (r1 == 0) goto L_0x007a;
    L_0x0071:
        r5 = java.util.Collections.emptySet();
        r4 = r6.b(r4, r5);
        goto L_0x0082;
    L_0x007a:
        r5 = java.util.Collections.emptySet();
        r4 = r6.a(r4, r5);
    L_0x0082:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affd.f(aajs, aajj, afjc):boolean");
    }

    public static int a(afjc afjc, aajj aajj, bcaa bcaa) {
        if (afjc.n()) {
            return Integer.MAX_VALUE;
        }
        return Math.max(((Integer) bcaa.get()).intValue(), aajj.p());
    }

    /* JADX WARNING: Missing block: B:23:0x0044, code skipped:
            if (r2.S != false) goto L_0x0080;
     */
    /* JADX WARNING: Missing block: B:40:0x007d, code skipped:
            if (r6.a(r5.ah()) == false) goto L_0x0080;
     */
    private static boolean c(defpackage.aajs r4, defpackage.aajj r5, defpackage.afjc r6, defpackage.amro r7, defpackage.bcaa r8) {
        /*
        r0 = r4.r;
        r1 = 0;
        if (r0 == 0) goto L_0x0094;
    L_0x0005:
        r0 = r4.t;
        if (r0 != 0) goto L_0x0094;
    L_0x0009:
        r0 = r4.s;
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x001f;
    L_0x000e:
        r0 = r4.l();
        if (r0 != 0) goto L_0x001f;
    L_0x0014:
        r4 = r7.get();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        return r4;
    L_0x001f:
        r0 = r6.m();
        r2 = defpackage.aajm.DEFAULT;
        if (r0 != r2) goto L_0x0047;
    L_0x0027:
        r2 = r5.c;
        r3 = r2.a;
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x0047;
    L_0x002f:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0035;
    L_0x0033:
        r2 = defpackage.arhh.bv;
    L_0x0035:
        r2 = r2.K;
        if (r2 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0047;
    L_0x003a:
        r2 = r5.c;
        r2 = r2.d;
        if (r2 != 0) goto L_0x0042;
    L_0x0040:
        r2 = defpackage.arhh.bv;
    L_0x0042:
        r2 = r2.S;
        if (r2 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0080;
    L_0x0047:
        r0 = r0.ordinal();
        r2 = 3;
        if (r0 == r2) goto L_0x0080;
    L_0x004e:
        r2 = 4;
        if (r0 == r2) goto L_0x0080;
    L_0x0051:
        r8 = defpackage.affd.a(r6, r5, r8);
        r8 = r4.c(r8);
        r0 = r6.f();
        if (r8 <= r0) goto L_0x0080;
    L_0x005f:
        r8 = r5.c;
        r0 = r8.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0094;
    L_0x0067:
        r8 = r8.d;
        if (r8 != 0) goto L_0x006d;
    L_0x006b:
        r8 = defpackage.arhh.bv;
    L_0x006d:
        r8 = r8.T;
        if (r8 == 0) goto L_0x0094;
    L_0x0071:
        r4 = r4.s;
        if (r4 == 0) goto L_0x0080;
    L_0x0075:
        r4 = r5.ah();
        r4 = r6.a(r4);
        if (r4 == 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0094;
    L_0x0080:
        r4 = r7.get();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0094;
    L_0x008c:
        r4 = r6.o();
        if (r4 == 0) goto L_0x0094;
    L_0x0092:
        r4 = 1;
        return r4;
    L_0x0094:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affd.c(aajs, aajj, afjc, amro, bcaa):boolean");
    }

    public static boolean c(aajs aajs, aajj aajj, afjc afjc) {
        if (aajs.s) {
            aajm m = afjc.m();
            if (m == aajm.DEFAULT || m == aajm.H264_MEDIA_CODEC) {
                return afjc.a(aajj.ah());
            }
        }
        return false;
    }

    public static affh a(aajs aajs, aajj aajj, afjc afjc, amro amro, bcaa bcaa) {
        if (affd.a(aajs, aajj, afjc)) {
            return new affh(aahv.g(), 2);
        }
        if (affd.b(aajs, aajj, afjc)) {
            return new affh(aahv.g(), 1);
        }
        if (affd.b(aajs, aajj, afjc, amro)) {
            return new affh(aahv.g(), 3);
        }
        if (affd.e(aajs, aajj, afjc)) {
            return new affh(aahv.f(), 2);
        }
        if (affd.f(aajs, aajj, afjc)) {
            return new affh(aahv.f(), 1);
        }
        if (affd.c(aajs, aajj, afjc, amro, bcaa)) {
            return new affh(aahv.f(), 3);
        }
        if (affd.c(aajs, aajj, afjc)) {
            return new affh(aahv.e(), 1);
        }
        return c;
    }

    public static boolean b(aajs aajs, aajj aajj, afjc afjc, amro amro, bcaa bcaa) {
        return affd.f(aajs, aajj, afjc) || affd.e(aajs, aajj, afjc) || affd.c(aajs, aajj, afjc, amro, bcaa) || affd.b(aajs, aajj, afjc, amro) || affd.a(aajs, aajj, afjc) || affd.b(aajs, aajj, afjc);
    }

    static {
        affe affe = new affe(amwp.a, 0);
    }
}
