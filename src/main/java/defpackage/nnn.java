package defpackage;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: nnn */
public final class nnn {
    private long A;
    private float B;
    private byte[] C;
    private int D;
    private int E;
    private ByteBuffer F;
    private boolean G;
    public final ConditionVariable a;
    public int b;
    public int c;
    public long d;
    private final long[] e;
    private final nnp f;
    private AudioTrack g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private long p;
    private long q;
    private boolean r;
    private long s;
    private Method t;
    private long u;
    private long v;
    private int w;
    private int x;
    private long y;
    private long z;

    public nnn() {
        this((byte) 0);
    }

    public nnn(byte b) {
        this.a = new ConditionVariable(true);
        if (nxf.a >= 18) {
            try {
                this.t = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (nxf.a >= 23) {
            this.f = new nnr();
        } else if (nxf.a >= 19) {
            this.f = new nns();
        } else {
            this.f = new nnp();
        }
        this.e = new long[10];
        this.b = 3;
        this.B = 1.0f;
        this.x = 0;
    }

    public final boolean a() {
        return this.g != null;
    }

    public final long a(boolean z) {
        if (!a() || this.x == 0) {
            return Long.MIN_VALUE;
        }
        long b;
        long intValue;
        if (this.g.getPlayState() == 3) {
            b = this.f.b();
            if (b != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.q >= 30000) {
                    long[] jArr = this.e;
                    int i = this.n;
                    jArr[i] = b - nanoTime;
                    this.n = (i + 1) % 10;
                    i = this.o;
                    if (i < 10) {
                        this.o = i + 1;
                    }
                    this.q = nanoTime;
                    this.p = 0;
                    int i2 = 0;
                    while (true) {
                        i = this.o;
                        if (i2 >= i) {
                            break;
                        }
                        this.p += this.e[i2] / ((long) i);
                        i2++;
                    }
                }
                if (!m() && nanoTime - this.s >= 500000) {
                    boolean c = this.f.c();
                    this.r = c;
                    String str = "AudioTrack";
                    if (c) {
                        long d = this.f.d() / 1000;
                        long e = this.f.e();
                        if (d < this.z) {
                            this.r = false;
                        } else {
                            String str2 = ", ";
                            StringBuilder stringBuilder;
                            if (Math.abs(d - nanoTime) > 5000000) {
                                stringBuilder = new StringBuilder(136);
                                stringBuilder.append("Spurious audio timestamp (system clock mismatch): ");
                                stringBuilder.append(e);
                                stringBuilder.append(str2);
                                stringBuilder.append(d);
                                stringBuilder.append(str2);
                                stringBuilder.append(nanoTime);
                                stringBuilder.append(str2);
                                stringBuilder.append(b);
                                Log.w(str, stringBuilder.toString());
                                this.r = false;
                            } else if (Math.abs(b(e) - b) > 5000000) {
                                stringBuilder = new StringBuilder(138);
                                stringBuilder.append("Spurious audio timestamp (frame position mismatch): ");
                                stringBuilder.append(e);
                                stringBuilder.append(str2);
                                stringBuilder.append(d);
                                stringBuilder.append(str2);
                                stringBuilder.append(nanoTime);
                                stringBuilder.append(str2);
                                stringBuilder.append(b);
                                Log.w(str, stringBuilder.toString());
                                this.r = false;
                            }
                        }
                    }
                    Method method = this.t;
                    if (!(method == null || this.l)) {
                        try {
                            intValue = (((long) ((Integer) method.invoke(this.g, null)).intValue()) * 1000) - this.d;
                            this.A = intValue;
                            intValue = Math.max(intValue, 0);
                            this.A = intValue;
                            if (intValue > 5000000) {
                                StringBuilder stringBuilder2 = new StringBuilder(61);
                                stringBuilder2.append("Ignoring impossibly large audio latency: ");
                                stringBuilder2.append(intValue);
                                Log.w(str, stringBuilder2.toString());
                                this.A = 0;
                            }
                        } catch (Exception unused) {
                            this.t = null;
                        }
                    }
                    this.s = nanoTime;
                }
            }
        }
        b = System.nanoTime() / 1000;
        if (this.r) {
            b = b(this.f.e() + c((long) (((float) (b - (this.f.d() / 1000))) * this.f.f()))) + this.y;
        } else {
            if (this.o == 0) {
                b = this.f.b();
                intValue = this.y;
            } else {
                b += this.p;
                intValue = this.y;
            }
            b += intValue;
            if (!z) {
                return b - this.A;
            }
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c8 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x016a  */
    public final void a(java.lang.String r11, int r12, int r13, int r14, int r15) {
        /*
        r10 = this;
        r0 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r1 = 12;
        switch(r12) {
            case 1: goto L_0x0035;
            case 2: goto L_0x0032;
            case 3: goto L_0x002f;
            case 4: goto L_0x002c;
            case 5: goto L_0x0029;
            case 6: goto L_0x0026;
            case 7: goto L_0x0023;
            case 8: goto L_0x0020;
            default: goto L_0x0007;
        };
    L_0x0007:
        r11 = new java.lang.IllegalArgumentException;
        r13 = new java.lang.StringBuilder;
        r14 = 38;
        r13.<init>(r14);
        r14 = "Unsupported channel count: ";
        r13.append(r14);
        r13.append(r12);
        r12 = r13.toString();
        r11.<init>(r12);
        throw r11;
    L_0x0020:
        r2 = defpackage.nlh.a;
        goto L_0x0036;
    L_0x0023:
        r2 = 1276; // 0x4fc float:1.788E-42 double:6.304E-321;
        goto L_0x0036;
    L_0x0026:
        r2 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        goto L_0x0036;
    L_0x0029:
        r2 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        goto L_0x0036;
    L_0x002c:
        r2 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        goto L_0x0036;
    L_0x002f:
        r2 = 28;
        goto L_0x0036;
    L_0x0032:
        r2 = 12;
        goto L_0x0036;
    L_0x0035:
        r2 = 4;
    L_0x0036:
        r3 = defpackage.nxf.a;
        r4 = 23;
        r5 = 7;
        r6 = 5;
        r7 = 3;
        if (r3 > r4) goto L_0x005e;
    L_0x003f:
        r3 = defpackage.nxf.b;
        r4 = "foster";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x005e;
    L_0x0049:
        r3 = defpackage.nxf.c;
        r4 = "NVIDIA";
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x005e;
    L_0x0054:
        if (r12 == r7) goto L_0x005f;
    L_0x0056:
        if (r12 == r6) goto L_0x005f;
    L_0x0058:
        if (r12 == r5) goto L_0x005b;
    L_0x005a:
        goto L_0x005e;
    L_0x005b:
        r0 = defpackage.nlh.a;
        goto L_0x005f;
    L_0x005e:
        r0 = r2;
    L_0x005f:
        r2 = "audio/raw";
        r2 = r2.equals(r11);
        r3 = r2 ^ 1;
        r4 = defpackage.nxf.a;
        r8 = 25;
        r9 = 1;
        if (r4 > r8) goto L_0x007f;
    L_0x006e:
        r4 = defpackage.nxf.b;
        r8 = "fugu";
        r4 = r8.equals(r4);
        if (r4 != 0) goto L_0x0079;
    L_0x0078:
        goto L_0x007f;
    L_0x0079:
        if (r3 == 0) goto L_0x007f;
    L_0x007b:
        if (r12 != r9) goto L_0x007f;
    L_0x007d:
        r0 = 12;
    L_0x007f:
        r1 = 6;
        r4 = 0;
        r8 = 2;
        if (r3 == 0) goto L_0x00c8;
    L_0x0084:
        r14 = r11.hashCode();
        switch(r14) {
            case -1095064472: goto L_0x00aa;
            case 187078296: goto L_0x00a0;
            case 1504578661: goto L_0x0096;
            case 1505942594: goto L_0x008c;
            default: goto L_0x008b;
        };
    L_0x008b:
        goto L_0x00b4;
    L_0x008c:
        r14 = "audio/vnd.dts.hd";
        r11 = r11.equals(r14);
        if (r11 == 0) goto L_0x00b4;
    L_0x0094:
        r11 = 3;
        goto L_0x00b5;
    L_0x0096:
        r14 = "audio/eac3";
        r11 = r11.equals(r14);
        if (r11 == 0) goto L_0x00b4;
    L_0x009e:
        r11 = 1;
        goto L_0x00b5;
    L_0x00a0:
        r14 = "audio/ac3";
        r11 = r11.equals(r14);
        if (r11 == 0) goto L_0x00b4;
    L_0x00a8:
        r11 = 0;
        goto L_0x00b5;
    L_0x00aa:
        r14 = "audio/vnd.dts";
        r11 = r11.equals(r14);
        if (r11 == 0) goto L_0x00b4;
    L_0x00b2:
        r11 = 2;
        goto L_0x00b5;
    L_0x00b4:
        r11 = -1;
    L_0x00b5:
        if (r11 == 0) goto L_0x00c6;
    L_0x00b7:
        if (r11 == r9) goto L_0x00c4;
    L_0x00b9:
        if (r11 == r8) goto L_0x00c2;
    L_0x00bb:
        if (r11 == r7) goto L_0x00bf;
    L_0x00bd:
        r14 = 0;
        goto L_0x00ee;
    L_0x00bf:
        r14 = 8;
        goto L_0x00ee;
    L_0x00c2:
        r14 = 7;
        goto L_0x00ee;
    L_0x00c4:
        r14 = 6;
        goto L_0x00ee;
    L_0x00c6:
        r14 = 5;
        goto L_0x00ee;
    L_0x00c8:
        if (r14 == r7) goto L_0x00ee;
    L_0x00ca:
        if (r14 == r8) goto L_0x00ee;
    L_0x00cc:
        r11 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r14 == r11) goto L_0x00ee;
    L_0x00d0:
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r14 != r11) goto L_0x00d5;
    L_0x00d4:
        goto L_0x00ee;
    L_0x00d5:
        r11 = new java.lang.IllegalArgumentException;
        r12 = new java.lang.StringBuilder;
        r13 = 37;
        r12.<init>(r13);
        r13 = "Unsupported PCM encoding: ";
        r12.append(r13);
        r12.append(r14);
        r12 = r12.toString();
        r11.<init>(r12);
        throw r11;
    L_0x00ee:
        r11 = r10.a();
        if (r11 == 0) goto L_0x0102;
    L_0x00f4:
        r11 = r10.j;
        if (r11 != r14) goto L_0x0102;
    L_0x00f8:
        r11 = r10.h;
        if (r11 != r13) goto L_0x0102;
    L_0x00fc:
        r11 = r10.i;
        if (r11 == r0) goto L_0x0101;
    L_0x0100:
        goto L_0x0102;
    L_0x0101:
        return;
    L_0x0102:
        r10.h();
        r10.j = r14;
        r10.l = r3;
        r10.h = r13;
        r10.i = r0;
        if (r2 != 0) goto L_0x0110;
    L_0x010f:
        goto L_0x0111;
    L_0x0110:
        r14 = 2;
    L_0x0111:
        r10.k = r14;
        r12 = r12 + r12;
        r10.m = r12;
        r11 = 49152; // 0xc000 float:6.8877E-41 double:2.42843E-319;
        r12 = 20480; // 0x5000 float:2.8699E-41 double:1.01185E-319;
        if (r15 == 0) goto L_0x0120;
    L_0x011d:
        r10.c = r15;
        goto L_0x0168;
    L_0x0120:
        if (r3 == 0) goto L_0x0132;
    L_0x0122:
        if (r14 != r6) goto L_0x0125;
    L_0x0124:
        goto L_0x012d;
    L_0x0125:
        if (r14 == r1) goto L_0x012d;
    L_0x0127:
        r10.c = r11;
        r15 = 49152; // 0xc000 float:6.8877E-41 double:2.42843E-319;
        goto L_0x0168;
    L_0x012d:
        r10.c = r12;
        r15 = 20480; // 0x5000 float:2.8699E-41 double:1.01185E-319;
        goto L_0x0168;
    L_0x0132:
        r11 = android.media.AudioTrack.getMinBufferSize(r13, r0, r14);
        r12 = -2;
        if (r11 == r12) goto L_0x013a;
    L_0x0139:
        r4 = 1;
    L_0x013a:
        defpackage.nwf.b(r4);
        r12 = r11 << 2;
        r13 = 250000; // 0x3d090 float:3.50325E-40 double:1.235164E-318;
        r13 = r10.c(r13);
        r14 = (int) r13;
        r13 = r10.m;
        r14 = r14 * r13;
        r0 = (long) r11;
        r4 = 750000; // 0xb71b0 float:1.050974E-39 double:3.70549E-318;
        r4 = r10.c(r4);
        r11 = r10.m;
        r6 = (long) r11;
        r4 = r4 * r6;
        r0 = java.lang.Math.max(r0, r4);
        r11 = (int) r0;
        if (r12 >= r14) goto L_0x0161;
    L_0x015f:
        r15 = r14;
        goto L_0x0166;
    L_0x0161:
        if (r12 <= r11) goto L_0x0165;
    L_0x0163:
        r15 = r11;
        goto L_0x0166;
    L_0x0165:
        r15 = r12;
    L_0x0166:
        r10.c = r15;
    L_0x0168:
        if (r3 != 0) goto L_0x0174;
    L_0x016a:
        r11 = (long) r15;
        r11 = r10.a(r11);
        r11 = r10.b(r11);
        goto L_0x0176;
    L_0x0174:
        r11 = -1;
    L_0x0176:
        r10.d = r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnn.a(java.lang.String, int, int, int, int):void");
    }

    public final int b() {
        return a(0);
    }

    public final int a(int i) {
        this.a.block();
        if (i == 0) {
            this.g = new AudioTrack(this.b, this.h, this.i, this.k, this.c, 1);
        } else {
            this.g = new AudioTrack(this.b, this.h, this.i, this.k, this.c, 1, i);
        }
        int state = this.g.getState();
        if (state == 1) {
            state = this.g.getAudioSessionId();
            this.f.a(this.g, m());
            j();
            return state;
        }
        try {
            this.g.release();
        } catch (Exception unused) {
        } finally {
            this.g = null;
        }
        throw new nnu(state, this.h, this.i, this.c);
    }

    public final void c() {
        if (a()) {
            this.z = System.nanoTime() / 1000;
            this.g.play();
        }
    }

    public final void d() {
        if (this.x == 1) {
            this.x = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x0180  */
    public final int a(java.nio.ByteBuffer r20, int r21, int r22, long r23) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r23;
        r4 = r19.m();
        r5 = 1;
        r6 = 2;
        r7 = 0;
        if (r4 == 0) goto L_0x0029;
    L_0x000f:
        r4 = r0.g;
        r4 = r4.getPlayState();
        if (r4 == r6) goto L_0x0028;
    L_0x0017:
        r4 = r0.g;
        r4 = r4.getPlayState();
        if (r4 != r5) goto L_0x0029;
    L_0x001f:
        r4 = r0.g;
        r4 = r4.getPlaybackHeadPosition();
        if (r4 != 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0029;
    L_0x0028:
        return r7;
    L_0x0029:
        r4 = r0.E;
        r8 = "AudioTrack";
        r9 = 0;
        if (r4 == 0) goto L_0x0034;
    L_0x0031:
        r2 = 0;
        goto L_0x0192;
    L_0x0034:
        if (r22 == 0) goto L_0x023b;
    L_0x0036:
        r4 = r0.k;
        r12 = r0.j;
        if (r4 == r12) goto L_0x003e;
    L_0x003c:
        r12 = 1;
        goto L_0x003f;
    L_0x003e:
        r12 = 0;
    L_0x003f:
        r0.G = r12;
        if (r12 != 0) goto L_0x0049;
    L_0x0043:
        r4 = r21;
        r6 = r22;
        goto L_0x00d6;
    L_0x0049:
        if (r4 != r6) goto L_0x004d;
    L_0x004b:
        r4 = 1;
        goto L_0x004e;
    L_0x004d:
        r4 = 0;
    L_0x004e:
        defpackage.nwf.b(r4);
        r4 = r0.j;
        r12 = r0.F;
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r14 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r15 = 3;
        if (r4 == r14) goto L_0x006c;
    L_0x005c:
        if (r4 == r15) goto L_0x0069;
    L_0x005e:
        if (r4 != r13) goto L_0x0063;
    L_0x0060:
        r16 = r22 / 2;
        goto L_0x0070;
    L_0x0063:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x0069:
        r16 = r22 + r22;
        goto L_0x0070;
    L_0x006c:
        r16 = r22 / 3;
        r16 = r16 + r16;
    L_0x0070:
        r11 = r16;
        if (r12 == 0) goto L_0x007a;
    L_0x0074:
        r6 = r12.capacity();
        if (r6 >= r11) goto L_0x007e;
    L_0x007a:
        r12 = java.nio.ByteBuffer.allocateDirect(r11);
    L_0x007e:
        r12.position(r7);
        r12.limit(r11);
        r6 = r21 + r22;
        if (r4 == r14) goto L_0x00c1;
    L_0x0088:
        if (r4 == r15) goto L_0x00ab;
    L_0x008a:
        if (r4 != r13) goto L_0x00a5;
    L_0x008c:
        r4 = r21;
    L_0x008e:
        if (r4 >= r6) goto L_0x00c5;
    L_0x0090:
        r11 = r4 + 2;
        r11 = r1.get(r11);
        r12.put(r11);
        r11 = r4 + 3;
        r11 = r1.get(r11);
        r12.put(r11);
        r4 = r4 + 4;
        goto L_0x008e;
    L_0x00a5:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x00ab:
        r4 = r21;
    L_0x00ad:
        if (r4 >= r6) goto L_0x00c5;
    L_0x00af:
        r12.put(r7);
        r11 = r1.get(r4);
        r11 = r11 & 255;
        r11 = r11 + -128;
        r11 = (byte) r11;
        r12.put(r11);
        r4 = r4 + 1;
        goto L_0x00ad;
    L_0x00c1:
        r4 = r21;
    L_0x00c3:
        if (r4 < r6) goto L_0x0223;
    L_0x00c5:
        r12.position(r7);
        r0.F = r12;
        r1 = r0.F;
        r4 = r1.position();
        r6 = r0.F;
        r6 = r6.limit();
    L_0x00d6:
        r0.E = r6;
        r1.position(r4);
        r4 = r0.l;
        if (r4 == 0) goto L_0x011b;
    L_0x00df:
        r4 = r0.w;
        if (r4 != 0) goto L_0x011b;
    L_0x00e3:
        r4 = r0.k;
        r11 = 7;
        if (r4 == r11) goto L_0x0115;
    L_0x00e8:
        r11 = 8;
        if (r4 == r11) goto L_0x0115;
    L_0x00ec:
        r11 = 5;
        if (r4 != r11) goto L_0x00f4;
    L_0x00ef:
        r4 = defpackage.nwg.a();
        goto L_0x0119;
    L_0x00f4:
        r11 = 6;
        if (r4 != r11) goto L_0x00fc;
    L_0x00f7:
        r4 = defpackage.nwg.a(r1);
        goto L_0x0119;
    L_0x00fc:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r3 = 38;
        r2.<init>(r3);
        r3 = "Unexpected audio encoding: ";
        r2.append(r3);
        r2.append(r4);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0115:
        r4 = defpackage.nwk.a(r1);
    L_0x0119:
        r0.w = r4;
    L_0x011b:
        r4 = r0.x;
        if (r4 != 0) goto L_0x0129;
    L_0x011f:
        r2 = java.lang.Math.max(r9, r2);
        r0.y = r2;
        r0.x = r5;
    L_0x0127:
        r2 = 0;
        goto L_0x017a;
    L_0x0129:
        r11 = r0.y;
        r13 = r19.k();
        r13 = r0.b(r13);
        r11 = r11 + r13;
        r4 = r0.x;
        if (r4 != r5) goto L_0x016c;
    L_0x0138:
        r13 = r11 - r2;
        r13 = java.lang.Math.abs(r13);
        r17 = 200000; // 0x30d40 float:2.8026E-40 double:9.8813E-319;
        r4 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1));
        if (r4 <= 0) goto L_0x016c;
    L_0x0145:
        r4 = new java.lang.StringBuilder;
        r13 = 80;
        r4.<init>(r13);
        r13 = "Discontinuity detected [expected ";
        r4.append(r13);
        r4.append(r11);
        r13 = ", got ";
        r4.append(r13);
        r4.append(r2);
        r13 = "]";
        r4.append(r13);
        r4 = r4.toString();
        android.util.Log.e(r8, r4);
        r4 = 2;
        r0.x = r4;
        goto L_0x016d;
    L_0x016c:
        r4 = 2;
    L_0x016d:
        r13 = r0.x;
        if (r13 != r4) goto L_0x0127;
    L_0x0171:
        r13 = r0.y;
        r2 = r2 - r11;
        r13 = r13 + r2;
        r0.y = r13;
        r0.x = r5;
        r2 = 1;
    L_0x017a:
        r3 = defpackage.nxf.a;
        r4 = 21;
        if (r3 >= r4) goto L_0x0192;
    L_0x0180:
        r3 = r0.C;
        if (r3 == 0) goto L_0x0187;
    L_0x0184:
        r3 = r3.length;
        if (r3 >= r6) goto L_0x018b;
    L_0x0187:
        r3 = new byte[r6];
        r0.C = r3;
    L_0x018b:
        r3 = r0.C;
        r1.get(r3, r7, r6);
        r0.D = r7;
    L_0x0192:
        r3 = defpackage.nxf.a;
        r11 = 21;
        if (r3 >= r11) goto L_0x01c4;
    L_0x0198:
        r3 = r0.u;
        r1 = r0.f;
        r5 = r1.a();
        r1 = r0.m;
        r11 = r0.c;
        r12 = (long) r1;
        r5 = r5 * r12;
        r3 = r3 - r5;
        r1 = (int) r3;
        r11 = r11 - r1;
        if (r11 <= 0) goto L_0x01d2;
    L_0x01ac:
        r1 = r0.E;
        r1 = java.lang.Math.min(r1, r11);
        r3 = r0.g;
        r4 = r0.C;
        r5 = r0.D;
        r7 = r3.write(r4, r5, r1);
        if (r7 < 0) goto L_0x01d2;
    L_0x01be:
        r1 = r0.D;
        r1 = r1 + r7;
        r0.D = r1;
        goto L_0x01d2;
    L_0x01c4:
        r3 = r0.G;
        if (r3 == 0) goto L_0x01ca;
    L_0x01c8:
        r1 = r0.F;
    L_0x01ca:
        r3 = r0.g;
        r4 = r0.E;
        r7 = r3.write(r1, r4, r5);
    L_0x01d2:
        if (r7 < 0) goto L_0x021d;
    L_0x01d4:
        r1 = r0.E;
        r1 = r1 - r7;
        r0.E = r1;
        r3 = r0.l;
        if (r3 != 0) goto L_0x01e3;
    L_0x01dd:
        r4 = r0.u;
        r6 = (long) r7;
        r4 = r4 + r6;
        r0.u = r4;
    L_0x01e3:
        if (r1 == 0) goto L_0x01e6;
    L_0x01e5:
        goto L_0x01f2;
    L_0x01e6:
        if (r3 == 0) goto L_0x01f0;
    L_0x01e8:
        r3 = r0.v;
        r1 = r0.w;
        r5 = (long) r1;
        r3 = r3 + r5;
        r0.v = r3;
    L_0x01f0:
        r2 = r2 | 2;
    L_0x01f2:
        r1 = r0.f;
        r3 = r19.k();
        r5 = r1.c;
        r11 = -1;
        r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r7 == 0) goto L_0x021c;
    L_0x0200:
        r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r5 <= 0) goto L_0x021c;
    L_0x0204:
        r3 = android.os.SystemClock.elapsedRealtime();
        r5 = r1.c;
        r3 = r3 - r5;
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x021c;
    L_0x0211:
        r1 = "Resetting stalled audio track";
        android.util.Log.w(r8, r1);
        r19.h();
        r1 = 2;
        r1 = r1 | r2;
        return r1;
    L_0x021c:
        return r2;
    L_0x021d:
        r1 = new nnt;
        r1.<init>(r7);
        throw r1;
    L_0x0223:
        r11 = 21;
        r13 = r4 + 1;
        r13 = r1.get(r13);
        r12.put(r13);
        r13 = r4 + 2;
        r13 = r1.get(r13);
        r12.put(r13);
        r4 = r4 + 3;
        goto L_0x00c3;
    L_0x023b:
        r4 = 2;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnn.a(java.nio.ByteBuffer, int, int, long):int");
    }

    public final void e() {
        if (a()) {
            nnp nnp = this.f;
            long k = k();
            nnp.d = nnp.a();
            nnp.b = SystemClock.elapsedRealtime() * 1000;
            nnp.e = k;
            nnp.a.stop();
        }
    }

    public final boolean f() {
        boolean z = false;
        if (a()) {
            if (k() > this.f.a()) {
                z = true;
            } else if (m() && this.g.getPlayState() == 2 && this.g.getPlaybackHeadPosition() == 0) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public final void a(PlaybackParams playbackParams) {
        this.f.a(playbackParams);
    }

    public final void a(float f) {
        if (this.B != f) {
            this.B = f;
            j();
        }
    }

    private final void j() {
        if (!a()) {
            return;
        }
        if (nxf.a >= 21) {
            this.g.setVolume(this.B);
            return;
        }
        AudioTrack audioTrack = this.g;
        float f = this.B;
        audioTrack.setStereoVolume(f, f);
    }

    public final void g() {
        if (a()) {
            l();
            nnp nnp = this.f;
            if (nnp.b == -1) {
                nnp.a.pause();
            }
        }
    }

    public final void h() {
        if (a()) {
            this.u = 0;
            this.v = 0;
            this.w = 0;
            this.E = 0;
            this.x = 0;
            this.A = 0;
            l();
            if (this.g.getPlayState() == 3) {
                this.g.pause();
            }
            AudioTrack audioTrack = this.g;
            this.g = null;
            this.f.a(null, false);
            this.a.close();
            new nnq(this, audioTrack).start();
        }
    }

    public final void i() {
        h();
    }

    private final long a(long j) {
        return j / ((long) this.m);
    }

    private final long b(long j) {
        return (j * 1000000) / ((long) this.h);
    }

    private final long c(long j) {
        return (j * ((long) this.h)) / 1000000;
    }

    private final long k() {
        return !this.l ? a(this.u) : this.v;
    }

    private final void l() {
        this.p = 0;
        this.o = 0;
        this.n = 0;
        this.q = 0;
        this.r = false;
        this.s = 0;
    }

    private final boolean m() {
        boolean z = false;
        if (nxf.a < 23) {
            int i = this.k;
            if (i != 5) {
                return i != 6 ? z : true;
            } else {
                z = true;
            }
        }
    }
}
