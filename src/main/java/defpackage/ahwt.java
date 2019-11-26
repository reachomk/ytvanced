package defpackage;

import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.util.Range;
import com.google.android.youtube.R;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: ahwt */
public final class ahwt {
    private static final float[] a = new float[]{1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
    private static final float[] b = new float[]{1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
    private static final float[] c = new float[]{1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
    private static final String[] d = new String[]{"uTextureY", "uTextureU", "uTextureV"};
    private int A = 500;
    private int B = 2;
    private int C = 3;
    private final int e;
    private final int[] f = new int[3];
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private int o = -1;
    private ahtn p;
    private ahsy q;
    private ahtc r;
    private int s;
    private final ahws t = new ahws();
    private final ArrayDeque u = new ArrayDeque();
    private final ArrayDeque v = new ArrayDeque();
    private long w = -1;
    private long x = -1;
    private byte[] y;
    private final int[] z = new int[3];

    public static String a(ahxb ahxb, boolean z) {
        String str = !z ? "" : "#define ENABLE_YUV\n";
        String valueOf = String.valueOf(ahxb.a(R.raw.gl_rgb_and_yuv_program_ext_frag));
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    public static String a(ahxb ahxb) {
        return ahxb.a(R.raw.gl_rgb_and_yuv_program_ext_vert);
    }

    public ahwt(ahwi ahwi, boolean z) {
        int i = 0;
        this.z[0] = 0;
        this.l = ahwi.b("uColorPrimaryTransform");
        this.n = ahwi.b("uLuminanceTransform");
        this.i = ahwi.b("uInputLut");
        this.j = ahwi.b("uOutputLut");
        this.k = ahwi.b("uKneeLut");
        this.m = ahwi.b("uLutSize");
        if (z) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.f[i2] = ahwi.b(d[i2]);
            }
            this.g = ahwi.b("uColorConversion");
            this.e = -1;
        } else {
            this.e = ahwi.b("uTexture");
            this.g = -1;
        }
        this.h = ahwi.b("uCropRight");
        GLES20.glGenTextures(3, this.z, 0);
        while (i < 3) {
            ahsl.a(this.z[i]);
            i++;
        }
    }

    /* JADX WARNING: Missing block: B:16:0x0064, code skipped:
            if ((r6 ^ 1) != 0) goto L_0x006b;
     */
    /* JADX WARNING: Missing block: B:18:0x0069, code skipped:
            if (r13.p != null) goto L_0x006b;
     */
    public final void a(defpackage.ahsr r14) {
        /*
        r13 = this;
        r0 = r14.d();
        r1 = 2;
        r2 = 3;
        r3 = 0;
        r4 = 1;
        if (r0 != 0) goto L_0x002f;
    L_0x000a:
        r0 = r13.e;
        android.opengl.GLES20.glUniform1i(r0, r3);
        r0 = r13.h;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.opengl.GLES20.glUniform1f(r0, r5);
        r0 = r13.m;
        r5 = r13.s;
        r5 = (float) r5;
        android.opengl.GLES20.glUniform1f(r0, r5);
        r0 = r13.i;
        r13.a(r3, r0);
        r0 = r13.k;
        r13.a(r1, r0);
        r0 = r13.j;
        r13.a(r4, r0);
        goto L_0x0098;
    L_0x002f:
        r0 = 0;
    L_0x0030:
        if (r0 < r2) goto L_0x01d3;
    L_0x0032:
        r0 = r13.h;
        r5 = r14.f();
        android.opengl.GLES20.glUniform1f(r0, r5);
        r0 = r14.h();
        r5 = r14.e();
        r6 = r13.o;
        if (r6 == r5) goto L_0x0048;
    L_0x0047:
        goto L_0x006b;
    L_0x0048:
        if (r0 == 0) goto L_0x0067;
    L_0x004a:
        r6 = r13.p;
        if (r6 != 0) goto L_0x0050;
    L_0x004e:
        r6 = 0;
        goto L_0x0063;
    L_0x0050:
        r7 = r0.a;
        if (r7 == 0) goto L_0x005b;
    L_0x0054:
        r6 = r6.a;
        r6 = r7.equals(r6);
        goto L_0x0063;
    L_0x005b:
        r7 = r0.b;
        r6 = r6.b;
        r6 = r7.equals(r6);
    L_0x0063:
        r6 = r6 ^ r4;
        if (r6 == 0) goto L_0x0098;
    L_0x0066:
        goto L_0x006b;
    L_0x0067:
        r6 = r13.p;
        if (r6 == 0) goto L_0x0098;
    L_0x006b:
        r6 = b;
        if (r5 == r4) goto L_0x0075;
    L_0x006f:
        if (r5 == r2) goto L_0x0072;
    L_0x0071:
        goto L_0x0077;
    L_0x0072:
        r6 = c;
        goto L_0x0077;
    L_0x0075:
        r6 = a;
    L_0x0077:
        r7 = r13.g;
        android.opengl.GLES20.glUniformMatrix3fv(r7, r4, r3, r6, r3);
        r13.s = r3;
        if (r5 != r2) goto L_0x0081;
    L_0x0080:
        goto L_0x0089;
    L_0x0081:
        if (r0 == 0) goto L_0x008c;
    L_0x0083:
        r6 = r0.c();
        if (r6 == 0) goto L_0x008c;
    L_0x0089:
        r13.a(r0);
    L_0x008c:
        r6 = r13.m;
        r7 = r13.s;
        r7 = (float) r7;
        android.opengl.GLES20.glUniform1f(r6, r7);
        r13.o = r5;
        r13.p = r0;
    L_0x0098:
        r5 = r14.i();
        r14 = r13.v;
        r14 = r14.isEmpty();
        if (r14 != 0) goto L_0x01cf;
    L_0x00a4:
        r7 = r13.x;
        r14 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r14 == 0) goto L_0x01cf;
    L_0x00aa:
        r13.x = r5;
        r7 = 0;
        r14 = 0;
        r0 = r14;
    L_0x00b0:
        r9 = r13.v;
        r9 = r9.isEmpty();
        if (r9 != 0) goto L_0x00dd;
    L_0x00b8:
        r9 = r13.v;
        r9 = r9.getFirst();
        r9 = (java.lang.Long) r9;
        r9 = r9.longValue();
        r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r11 < 0) goto L_0x00dd;
    L_0x00c8:
        r0 = r13.v;
        r0 = r0.removeFirst();
        r0 = (java.lang.Long) r0;
        r7 = r0.longValue();
        r0 = r13.u;
        r0 = r0.removeFirst();
        r0 = (byte[]) r0;
        goto L_0x00b0;
    L_0x00dd:
        if (r0 == 0) goto L_0x01cf;
    L_0x00df:
        r5 = r13.y;
        r5 = java.util.Arrays.equals(r0, r5);
        if (r5 != 0) goto L_0x01cf;
    L_0x00e7:
        r13.y = r0;
        r5 = r13.t;
        r5.a = r3;
        r6 = new nxa;	 Catch:{ Exception -> 0x01cf }
        r6.<init>(r0);	 Catch:{ Exception -> 0x01cf }
        r0 = 8;
        r6.b(r0);	 Catch:{ Exception -> 0x01cf }
        r0 = r6.c(r0);	 Catch:{ Exception -> 0x01cf }
        r9 = 16;
        r10 = r6.c(r9);	 Catch:{ Exception -> 0x01cf }
        r11 = r6.c(r9);	 Catch:{ Exception -> 0x01cf }
        r12 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        if (r0 != r12) goto L_0x01cf;
    L_0x0109:
        r0 = 60;
        if (r10 != r0) goto L_0x01cf;
    L_0x010d:
        if (r11 != r4) goto L_0x01cf;
    L_0x010f:
        r6.b(r9);	 Catch:{ Exception -> 0x01cf }
        r0 = r6.c(r1);	 Catch:{ Exception -> 0x01cf }
        if (r0 > r4) goto L_0x01cf;
    L_0x0118:
        r0 = 27;
        r6.c(r0);	 Catch:{ Exception -> 0x01cf }
        r0 = r6.c(r4);	 Catch:{ Exception -> 0x01cf }
        if (r0 > 0) goto L_0x01cf;
    L_0x0123:
        r5.f = r3;	 Catch:{ Exception -> 0x01cf }
        r0 = 0;
    L_0x0126:
        r9 = 17;
        if (r0 >= r2) goto L_0x0139;
    L_0x012a:
        r9 = r6.c(r9);	 Catch:{ Exception -> 0x01cf }
        r10 = r5.f;	 Catch:{ Exception -> 0x01cf }
        r9 = java.lang.Math.max(r9, r10);	 Catch:{ Exception -> 0x01cf }
        r5.f = r9;	 Catch:{ Exception -> 0x01cf }
        r0 = r0 + 1;
        goto L_0x0126;
    L_0x0139:
        r6.b(r9);	 Catch:{ Exception -> 0x01cf }
        r5.g = r3;	 Catch:{ Exception -> 0x01cf }
        r0 = 4;
        r2 = r6.c(r0);	 Catch:{ Exception -> 0x01cf }
    L_0x0143:
        r10 = r2 + -1;
        if (r2 <= 0) goto L_0x015e;
    L_0x0147:
        r2 = 7;
        r2 = r6.c(r2);	 Catch:{ Exception -> 0x01cf }
        r11 = r6.c(r9);	 Catch:{ Exception -> 0x01cf }
        r12 = 75;
        if (r2 < r12) goto L_0x015c;
    L_0x0154:
        r2 = r5.g;	 Catch:{ Exception -> 0x01cf }
        r2 = java.lang.Math.max(r2, r11);	 Catch:{ Exception -> 0x01cf }
        r5.g = r2;	 Catch:{ Exception -> 0x01cf }
    L_0x015c:
        r2 = r10;
        goto L_0x0143;
    L_0x015e:
        r2 = 10;
        r6.c(r2);	 Catch:{ Exception -> 0x01cf }
        r9 = r6.c(r4);	 Catch:{ Exception -> 0x01cf }
        if (r9 > 0) goto L_0x01cf;
    L_0x0169:
        r9 = r6.c(r4);	 Catch:{ Exception -> 0x01cf }
        if (r9 <= 0) goto L_0x0192;
    L_0x016f:
        r9 = 12;
        r10 = r6.c(r9);	 Catch:{ Exception -> 0x01cf }
        r5.b = r10;	 Catch:{ Exception -> 0x01cf }
        r9 = r6.c(r9);	 Catch:{ Exception -> 0x01cf }
        r5.c = r9;	 Catch:{ Exception -> 0x01cf }
        r0 = r6.c(r0);	 Catch:{ Exception -> 0x01cf }
        r5.d = r0;	 Catch:{ Exception -> 0x01cf }
    L_0x0183:
        r0 = r5.d;	 Catch:{ Exception -> 0x01cf }
        if (r3 >= r0) goto L_0x0192;
    L_0x0187:
        r0 = r5.e;	 Catch:{ Exception -> 0x01cf }
        r9 = r6.c(r2);	 Catch:{ Exception -> 0x01cf }
        r0[r3] = r9;	 Catch:{ Exception -> 0x01cf }
        r3 = r3 + 1;
        goto L_0x0183;
    L_0x0192:
        r0 = r6.c(r4);	 Catch:{ Exception -> 0x01cf }
        if (r0 <= 0) goto L_0x019c;
    L_0x0198:
        r0 = 6;
        r6.c(r0);	 Catch:{ Exception -> 0x01cf }
    L_0x019c:
        r5.a = r4;
        r0 = r13.s;
        if (r0 != 0) goto L_0x01a6;
    L_0x01a2:
        r13.a(r14);
        goto L_0x01cf;
    L_0x01a6:
        r14 = r13.t;
        r0 = r13.r;
        defpackage.ahwt.a(r0, r14, r7);
        r14 = r13.q;	 Catch:{ Exception -> 0x01c7 }
        r0 = r13.r;	 Catch:{ Exception -> 0x01c7 }
        r14.a(r0);	 Catch:{ Exception -> 0x01c7 }
        r14 = r13.q;
        r14 = r14.a();
        r14 = java.nio.ByteBuffer.wrap(r14);
        r0 = r13.k;
        r13.a(r14, r1, r0);
        defpackage.ahsl.b();
        goto L_0x01cf;
    L_0x01c7:
        r14 = move-exception;
        r14 = java.lang.String.valueOf(r14);
        r14.length();
    L_0x01cf:
        defpackage.ahsl.b();
        return;
    L_0x01d3:
        r5 = r13.f;
        r5 = r5[r0];
        android.opengl.GLES20.glUniform1i(r5, r0);
        r0 = r0 + 1;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwt.a(ahsr):void");
    }

    public final void a(boolean z, byte[] bArr, long j) {
        if (this.w > j || z) {
            this.u.clear();
            this.v.clear();
            this.t.a = false;
            if (z) {
                this.o = -1;
                this.s = 0;
                return;
            }
        }
        this.u.add(bArr);
        this.v.add(Long.valueOf(j));
        this.w = j;
    }

    private final void a(int i, int i2) {
        GLES20.glActiveTexture(33988 + i);
        GLES20.glBindTexture(3553, this.z[i]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glUniform1i(i2, i + 4);
        ahsl.b();
    }

    private final void a(ByteBuffer byteBuffer, int i, int i2) {
        a(i, i2);
        GLES20.glPixelStorei(3317, 1);
        GLES20.glTexImage2D(3553, 0, 6410, 1, byteBuffer.capacity() / 2, 0, 6410, 5121, byteBuffer);
        ahsl.b();
    }

    private final boolean a(ahtn ahtn) {
        ByteBuffer wrap;
        if (this.q == null) {
            this.q = new ahsy();
            this.r = new ahtc();
        }
        ahtc ahtc = this.r;
        ahtc.a = 6;
        ahtc.e = 500.0f;
        ahtc.b = 6;
        ahtc.c = 1000.0f;
        ahtc.d = 0.0f;
        ahtc.k = 2;
        ahtc.j = 3;
        ahtc.f = 0.75f;
        ahtc.g = 0.75f;
        ahtc.h = 0;
        ahtc.e = (float) this.A;
        if (ahtn != null) {
            if (ahtn.a() != -1) {
                this.r.b = ahtn.a();
            }
            if (ahtn.b() != -1) {
                this.r.a = ahtn.b();
            }
            if (ahtn.c() != null) {
                wrap = ByteBuffer.wrap(ahtn.c(), 17, 8);
                short s = wrap.getShort();
                wrap.getShort();
                short s2 = wrap.getShort();
                this.r.c = s2 > (short) 0 ? (float) s2 : (float) s;
            }
        }
        ahtc ahtc2 = this.r;
        ahtc2.k = this.B;
        ahtc2.j = this.C;
        ahws ahws = this.t;
        if (ahws.a) {
            ahwt.a(ahtc2, ahws, 0);
        }
        int i = this.r.b;
        String a = ahsk.a(this.B);
        int i2 = this.r.a;
        String a2 = ahsn.a(this.C);
        ahtc ahtc3 = this.r;
        float f = ahtc3.d;
        float f2 = ahtc3.c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 154) + String.valueOf(a2).length());
        stringBuilder.append("Video Primaries = ");
        stringBuilder.append(i);
        stringBuilder.append(", Display Primaries = ");
        stringBuilder.append(a);
        stringBuilder.append(", Video Transfer = ");
        stringBuilder.append(i2);
        stringBuilder.append(", Display Transfer = ");
        stringBuilder.append(a2);
        stringBuilder.append(", MaxSCL = ");
        stringBuilder.append(f);
        stringBuilder.append(", MaxCLL = ");
        stringBuilder.append(f2);
        stringBuilder.toString();
        try {
            ahsy ahsy = this.q;
            ahtc = this.r;
            if (VERSION.SDK_INT >= 24) {
                i2 = ahtc.a;
                if (i2 == 6) {
                    ahsy.a = new ahsz();
                } else if (i2 == 7) {
                    ahsy.a = new ahsx();
                }
                i2 = ahtc.j;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    if (i3 == 0) {
                        ahsy.b = new ahsz();
                    } else if (i3 == 2) {
                        ahsy.b = new ahsu();
                    } else if (i3 == 3) {
                        ahsy.b = new ahsw();
                    }
                    i2 = ahtc.b;
                    if (i2 == 6) {
                        ahsy.c = new ahss(ahss.a);
                    } else if (i2 == 1) {
                        ahsy.c = new ahss(ahss.b);
                    }
                    ahsy.e = ahsy.c.d;
                    int i4 = ahtc.k;
                    i2 = i4 - 1;
                    if (i4 != 0) {
                        double d;
                        if (i2 == 0) {
                            ahsy.d = new ahss(ahss.a);
                        } else if (i2 == 1) {
                            ahsy.d = new ahss(ahss.c);
                        } else if (i2 == 2) {
                            ahsy.d = new ahss(ahss.b);
                        }
                        ahsy.f = ahsy.d.e;
                        ahsy.g = new ahtg();
                        ahtg.a(ahsy.f, ahsy.e, ahsy.g);
                        ahsy.h = new Range(Double.valueOf(0.0d), Double.valueOf(10000.0d));
                        ahsy.i = new ahtf(256, new ahtb(ahsy));
                        if (ahsy.b.b()) {
                            d = (double) ahtc.e;
                            double a3 = ahsy.b.a();
                            Double.isNaN(d);
                            d /= a3;
                        } else {
                            d = 1.0d;
                        }
                        ahsy.j = new ahtf(1024, new ahta(ahsy, d));
                        ahsy.a(ahtc);
                        wrap = ByteBuffer.wrap(this.q.i.a);
                        ByteBuffer wrap2 = ByteBuffer.wrap(this.q.j.a);
                        ByteBuffer wrap3 = ByteBuffer.wrap(this.q.a());
                        ahsy ahsy2 = this.q;
                        float[] fArr = ahsy2.g.a;
                        float[] fArr2 = ahsy2.e.a;
                        int capacity = wrap.capacity() / 2;
                        this.s = capacity;
                        GLES20.glUniform1f(this.m, (float) capacity);
                        a(wrap, 0, this.i);
                        a(wrap3, 2, this.k);
                        a(wrap2, 1, this.j);
                        GLES20.glUniformMatrix3fv(this.l, 1, true, fArr, 0);
                        GLES20.glUniform3fv(this.n, 1, fArr2, 3);
                        ahsl.b();
                        return true;
                    }
                    throw null;
                }
                throw null;
            }
            return false;
        } catch (Exception e) {
            String.valueOf(e).length();
            return false;
        }
    }

    private static void a(ahtc ahtc, ahws ahws, long j) {
        float f = ((float) ahws.b) / 4095.0f;
        ahtc.f = f;
        float f2 = ((float) ahws.c) / 4095.0f;
        ahtc.g = f2;
        ahtc.h = ahws.d;
        int i = ahws.g;
        if (i <= 0) {
            i = ahws.f;
        }
        float f3 = ((float) i) * 0.1f;
        ahtc.d = f3;
        float f4 = ahtc.e;
        StringBuilder stringBuilder = new StringBuilder(129);
        stringBuilder.append("Knee = ");
        stringBuilder.append((int) (f * f3));
        stringBuilder.append("x");
        stringBuilder.append((int) (f2 * f4));
        stringBuilder.append(", MaxDisplayLuma = ");
        stringBuilder.append(f4);
        stringBuilder.append(", MaxSceneLuma = ");
        stringBuilder.append(f3);
        stringBuilder.append(", Time = ");
        double d = (double) j;
        Double.isNaN(d);
        stringBuilder.append(d / 1000000.0d);
        stringBuilder.toString();
        float c = ahsl.c(ahtc.d);
        ahtc.d = c;
        int i2 = 0;
        if (ahtc.f >= 1.0f || c < ahtc.e) {
            ahtc.h = 0;
            return;
        }
        float[] fArr = ahtc.i;
        if (fArr == null || fArr.length < ahtc.h) {
            ahtc.i = new float[ahtc.h];
        }
        f3 = 1.0f - ahtc.g;
        Object obj = "";
        while (i2 < ahtc.h) {
            ahtc.i[i2] = ahtc.g + ((((float) ahws.e[i2]) / 1023.0f) * f3);
            String valueOf = String.valueOf(obj);
            float f5 = ahtc.i[i2];
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 16);
            stringBuilder2.append(valueOf);
            stringBuilder2.append(f5);
            stringBuilder2.append(",");
            obj = stringBuilder2.toString();
            i2++;
        }
        String valueOf2 = String.valueOf(obj);
        String str = "Bezier =";
        if (valueOf2.length() == 0) {
            valueOf2 = new String(str);
        } else {
            str.concat(valueOf2);
        }
    }

    public final void a() {
        int[] iArr = this.z;
        if (iArr[0] != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            ahsl.b();
            this.z[0] = 0;
        }
    }

    public final void a(int i, int i2, int i3) {
        if (!(this.B == i && this.C == i2)) {
            this.p = null;
        }
        this.B = i;
        this.C = i2;
        this.A = i3;
    }
}
