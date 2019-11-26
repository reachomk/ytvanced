package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: zkk */
public final class zkk implements OnFrameAvailableListener {
    public int A;
    public int B;
    public final zmi C;
    public final zmg D;
    public final Graph E;
    public List F;
    public boolean G;
    public boolean H;
    public zkt I;
    public zkl J;
    public long K;
    public zks L;
    public zku M;
    public zkr N;
    public final boolean O;
    public final zla P;
    public boolean Q;
    private int R;
    private int S;
    private zkc T;
    private final float[] U = new float[16];
    private final float[] V = new float[16];
    private final float[] W = new float[16];
    private final float[] X = new float[16];
    private zkc Y;
    private int Z;
    public final Thread a;
    private anur aa;
    private final zmf ab;
    private final zmh ac;
    private final String ad;
    private final String ae;
    private PacketCreator af;
    private zjt ag;
    private String ah;
    private final ArrayList ai = new ArrayList();
    public final Handler b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public zko g;
    public zkd h;
    public long i;
    public int j = Integer.MAX_VALUE;
    public volatile boolean k;
    public final zkq l = new zkq(this);
    public Bitmap m;
    public final Set n = new HashSet();
    public final Set o = new HashSet();
    public ayx p;
    public SurfaceTexture q;
    public boolean r;
    public int s = 0;
    public float t = 0.0f;
    public ayx u;
    public ayx v;
    public final List w;
    public zkd x;
    public SurfaceTexture y;
    public volatile zkd z;

    zkk(zmg zmg, Graph graph, String str, String str2, Looper looper, EGLContext eGLContext, boolean z, boolean z2, zla zla) {
        this.D = zmg;
        this.E = (Graph) amqw.a((Object) graph);
        this.ad = (String) amqw.a((Object) str);
        this.ae = str2;
        this.a = (Thread) amqw.a(looper.getThread());
        String str3 = "NORMAL";
        int i = 1;
        this.ag = new zjt(str3, "", false, true);
        this.ah = str3;
        this.H = true;
        this.C = new zmi();
        this.ab = new zmf();
        this.ac = new zmh();
        this.O = z;
        this.P = zla;
        if (z2) {
            i = 2;
        }
        this.w = Arrays.asList(new zkn[i]);
        this.b = new zkm(looper, this);
        this.b.post(new zkj(this, eGLContext));
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(6, surfaceTexture));
    }

    public final void a(int i, int i2) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(8, i, i2));
    }

    public final void a(zjt zjt, zmn zmn) {
        this.ag = zjt;
        for (Entry entry : zmn.c.entrySet()) {
            zla zla = this.P;
            String str = (String) entry.getKey();
            float floatValue = ((Float) entry.getValue()).floatValue();
            bads bads = (bads) badt.d.createBuilder();
            bads.copyOnWrite();
            badt badt = (badt) bads.instance;
            if (str != null) {
                badt.a |= 1;
                badt.b = str;
                bads.copyOnWrite();
                badt badt2 = (badt) bads.instance;
                badt2.a |= 2;
                badt2.c = floatValue;
                badt badt3 = (badt) ((anxl) bads.build());
                babp babp = (babp) babm.c.createBuilder();
                babp.copyOnWrite();
                babm babm = (babm) babp.instance;
                if (badt3 != null) {
                    babm.b = badt3;
                    babm.a = 7;
                    zla.a.add((babm) ((anxl) babp.build()));
                } else {
                    throw new NullPointerException();
                }
            }
            throw new NullPointerException();
        }
        b();
    }

    public final void a() {
        zkr zkr = this.N;
        if (zkr != null) {
            zkr.a();
        }
    }

    public final void a(String str) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(13, str));
    }

    public final void b() {
        Handler handler = this.b;
        Boolean valueOf = Boolean.valueOf(true);
        if (!handler.hasMessages(11, valueOf)) {
            handler = this.b;
            handler.sendMessage(handler.obtainMessage(11, valueOf));
        } else if (!this.c) {
            this.b.removeMessages(11);
            handler = this.b;
            handler.sendMessage(handler.obtainMessage(11, valueOf));
        }
    }

    private static void b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String toHexString = Integer.toHexString(eglGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(toHexString).length());
            stringBuilder.append("Error executing ");
            stringBuilder.append(str);
            stringBuilder.append("! EGL error = 0x");
            stringBuilder.append(toHexString);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final void a(zko zko) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(1, amqw.a((Object) zko)));
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.O && VERSION.SDK_INT >= 21) {
            if (this.c) {
                surfaceTexture.updateTexImage();
            } else {
                return;
            }
        }
        if (!this.b.hasMessages(10)) {
            Handler handler = this.b;
            handler.sendMessage(handler.obtainMessage(10, surfaceTexture));
        }
        zku zku = this.M;
        if (zku != null) {
            zku.b();
        }
    }

    public final void c() {
        try {
            this.E.b();
            this.e = true;
        } catch (MediaPipeException unused) {
            this.e = false;
        }
    }

    public final void d() {
        amqw.a(this.y);
        boolean z = false;
        if (this.A > 0 && this.B > 0) {
            z = true;
        }
        amqw.b(z);
        try {
            zkk.a(this.z);
            this.y.setDefaultBufferSize(this.A, this.B);
            this.z = zkd.a().a(this.y);
        } catch (RuntimeException e) {
            xtl.a("setupOutputRenderTarget: forSurfaceTexture failed: ", e);
            this.z = null;
        }
    }

    public final boolean a(boolean z) {
        boolean z2 = false;
        if (this.c) {
            anur anur;
            zkd zkd;
            int i;
            int i2;
            if (this.R == 0 || this.S == 0) {
                int i3 = this.A;
                if (i3 != 0) {
                    int i4 = this.B;
                    if (i4 != 0) {
                        double d = (double) i3;
                        double d2 = (double) i4;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        d2 = d / d2;
                        i3 = Math.max(this.j, 4);
                        Double.isNaN(d);
                        d = (double) Math.max(Math.round(d / 4.0d) << 2, 4);
                        double d3 = (double) i3;
                        if (d3 < d) {
                            Double.isNaN(d3);
                            d = Math.max(Math.floor(d3 / 4.0d) * 4.0d, 4.0d);
                        }
                        double d4 = d / d2;
                        if (d3 < d4) {
                            Double.isNaN(d3);
                            d = (double) Math.max(Math.round((d2 * d3) / 4.0d) << 2, 4);
                            d4 = d3;
                        }
                        i3 = (int) Math.round(d);
                        int round = (int) Math.round(d4);
                        if (i3 % 4 != 0) {
                            float f = (float) i3;
                            i4 = Math.max(Math.round(f / 4.0f) << 2, 4);
                            round = Math.max(Math.round(((float) i4) / (f / ((float) round))), 2);
                            i3 = i4;
                        }
                        if (!(this.w.get(0) != null && this.R == i3 && this.S == round)) {
                            if (this.w.get(0) == null || this.K == 0) {
                                this.R = i3;
                                this.S = round;
                                zks zks = this.L;
                                if (zks != null) {
                                    zks.a(i3, round);
                                }
                                for (i3 = 0; i3 < this.w.size(); i3++) {
                                    zkn zkn = (zkn) this.w.get(i3);
                                    if (zkn != null) {
                                        zkn.a();
                                    }
                                    this.w.set(i3, new zkn(this, this.R, this.S));
                                }
                                this.Z = 0;
                            } else {
                                StringBuilder stringBuilder = new StringBuilder(76);
                                stringBuilder.append("DrishtiGlThread: Ignoring setupInputTextureFrames: ");
                                stringBuilder.append(i3);
                                stringBuilder.append(" x ");
                                stringBuilder.append(round);
                                xtl.d(stringBuilder.toString());
                            }
                        }
                    }
                }
            }
            anur anur2 = (zkn) this.w.get(this.Z);
            if (this.d && this.e && anur2 != null) {
                zkd zkd2 = anur2.b;
                anur = anur2;
                zkd = zkd2;
                i = this.R;
                i2 = this.S;
            } else {
                zkd zkd3 = this.z;
                zkd = zkd3;
                i = this.A;
                anur = null;
                i2 = this.B;
            }
            if (zkd == null) {
                xtl.d("Drishti: internalRedraw: RenderTarget not set");
            } else {
                if (anur != null) {
                    boolean z3;
                    synchronized (anur) {
                        z3 = anur.d;
                    }
                    if (z3) {
                        if (z) {
                            this.k = true;
                            this.n.isEmpty();
                        } else {
                            this.n.isEmpty();
                        }
                    }
                }
                zkq zkq = this.l;
                Bitmap bitmap = zkq.a;
                if (bitmap == null) {
                    bitmap = zkq.b;
                }
                if (!(this.m == null || anur == null || !this.H)) {
                    for (zjt zjt : this.n) {
                        if (!zjt.b) {
                            if (this.u == null) {
                                this.u = ayx.a();
                            }
                            this.u.a(this.m);
                            ayx ayx = this.v;
                            if (ayx != null) {
                                ayx.b();
                            }
                            this.v = ayx.a();
                            this.v.a(this.m.getWidth(), this.m.getHeight());
                            this.aa = new anur(this.v.a, this.m.getWidth(), this.m.getHeight());
                            ayx = this.v;
                            this.m.getWidth();
                            this.m.getHeight();
                            this.x = zkd.a(ayx);
                            z2 = a(this.u, this.m.getWidth(), this.m.getHeight(), true, this.x, this.aa, this.m.getWidth(), this.m.getHeight());
                        }
                    }
                }
                if (bitmap != null) {
                    if (this.u == null) {
                        this.u = ayx.a();
                    }
                    this.u.a(bitmap);
                    z2 = a(this.u, bitmap.getWidth(), bitmap.getHeight(), false, zkd, anur, i, i2);
                    if (z2 && !this.Q) {
                        b(true);
                    }
                } else {
                    SurfaceTexture surfaceTexture = this.q;
                    if (surfaceTexture != null && this.r) {
                        surfaceTexture.getTransformMatrix(this.U);
                        Matrix.setIdentityM(this.X, 0);
                        Matrix.translateM(this.X, 0, 0.5f, 0.5f, 0.0f);
                        Matrix.rotateM(this.X, 0, (float) this.s, 0.0f, 0.0f, 1.0f);
                        Matrix.translateM(this.X, 0, -0.5f, -0.5f, 0.0f);
                        Matrix.multiplyMM(this.V, 0, this.U, 0, this.X, 0);
                        zkk.a(this.V, this.t, ((float) i) / ((float) i2));
                        try {
                            if (this.Y == null) {
                                this.Y = new zkc("#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
                            }
                            this.Y.a(this.V);
                            zkd.b();
                            zkk.b("eglMakeCurrent (internalRedraw: Video)");
                            this.Y.a(this.p, zkd, i, i2);
                            zkd.d();
                            if (anur != null) {
                                a(anur, false, this.K);
                                this.K++;
                            } else {
                                a();
                            }
                            if (!this.Q) {
                                b(true);
                            }
                        } catch (RuntimeException e) {
                            xtl.a("internalRedraw: copySourceShaderWithTransform failed: ", e);
                            this.Y = null;
                            b();
                        }
                    }
                }
                z2 = true;
            }
            if (!z2 || anur == null) {
                return z2;
            }
            this.Z = (this.Z + 1) % this.w.size();
            return true;
        }
        xtl.d("internalRedraw: Not running");
        return false;
    }

    public final void b(boolean z) {
        synchronized (this.o) {
            this.Q = z;
            if (z) {
                e();
            }
        }
    }

    public final void e() {
        synchronized (this.o) {
            if (this.H) {
                if (this.Q) {
                    for (String a : this.o) {
                        this.P.a(a);
                    }
                    this.o.clear();
                }
            }
        }
    }

    private static void a(float[] fArr, float f, float f2) {
        if (f > 0.0f) {
            f /= f2;
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.scaleM(fArr, 0, Math.min(1.0f, 1.0f / f), Math.min(1.0f, f), 1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        }
    }

    private final boolean a(ayx ayx, int i, int i2, boolean z, zkd zkd, anur anur, int i3, int i4) {
        if (zkd != null) {
            try {
                if (this.T == null) {
                    this.T = zkc.a();
                }
                Matrix.setIdentityM(this.W, 0);
                Matrix.scaleM(this.W, 0, 1.0f, -1.0f, 1.0f);
                Matrix.translateM(this.W, 0, 0.0f, -1.0f, 0.0f);
                zkk.a(this.W, ((float) i) / ((float) i2), ((float) i3) / ((float) i4));
                this.T.a(this.W);
                zkd.b();
                zkk.b("eglMakeCurrent (internalRedraw: Bitmap)");
                this.T.a(ayx, zkd, i3, i4);
                zkd.d();
                if (anur != null) {
                    a(anur, z, this.K);
                    this.K++;
                } else {
                    a();
                }
                return true;
            } catch (RuntimeException e) {
                xtl.a("internalRedraw: copyPreviewBitmapShaderWithTransform failed: ", e);
                this.T = null;
                b();
            }
        }
        return false;
    }

    private final void a(anur anur, boolean z, long j) {
        String str;
        long nanoTime;
        anur anur2 = anur;
        long j2 = j;
        GLES20.glFinish();
        if (this.af == null) {
            this.af = new PacketCreator(this.E);
        }
        synchronized (anur) {
            GlSyncToken glSyncToken = anur2.e;
            str = null;
            if (glSyncToken != null) {
                glSyncToken.release();
                anur2.e = null;
            }
            anur2.c = true;
            anur2.d = true;
        }
        PacketCreator packetCreator = this.af;
        Packet create = Packet.create(packetCreator.nativeCreateGpuBuffer(packetCreator.a.a(), anur.getTextureName(), anur.getWidth(), anur.getHeight(), anur));
        try {
            this.E.a(this.ad, create, j2);
        } catch (MediaPipeException unused) {
            xtl.d("addGpuPacket: video input return false");
        }
        create.c();
        if (this.ae != null) {
            Object obj;
            nanoTime = System.nanoTime();
            badz badz = (badz) badw.e.createBuilder();
            this.ai.clear();
            zmf zmf = this.ab;
            if (nanoTime - zmf.b >= zmf.a) {
                zmf.b = nanoTime;
                obj = 1;
            } else {
                obj = null;
            }
            zks zks = this.L;
            if (!(zks == null || obj == null)) {
                zks.b(nanoTime / 1000000);
            }
            if (!z) {
                if (this.H) {
                    zjt zjt = this.ag;
                    if (!zjt.b) {
                        str = zjt.a;
                    } else if (this.G) {
                        str = "NORMAL";
                    }
                    this.ah = str;
                    str = this.ah;
                } else {
                    str = this.ah;
                }
            }
            if (str != null) {
                badx badx = (badx) badu.d.createBuilder();
                badx.a(str);
                badx.a(1);
                this.ai.add((badu) ((anxl) badx.build()));
            }
            for (zjt zjt2 : this.F) {
                if (this.H && !zjt2.b) {
                    if (z) {
                        if (!this.n.contains(zjt2)) {
                        }
                    } else if (!this.n.contains(zjt2)) {
                        if (obj != null) {
                            zkt zkt = this.I;
                            if (zkt != null) {
                                if (!zkt.a(zjt2.a)) {
                                }
                            }
                        }
                    }
                    this.n.remove(zjt2);
                    badx badx2 = (badx) badu.d.createBuilder();
                    badx2.a(zjt2.a);
                    badx2.a(3);
                    this.ai.add((badu) ((anxl) badx2.build()));
                }
            }
            badz.copyOnWrite();
            ((badw) badz.instance).b = anxl.emptyProtobufList();
            badz.a(this.ai);
            badz.copyOnWrite();
            ((badw) badz.instance).d = anxl.emptyProtobufList();
            zla zla = this.P;
            zla.b.clear();
            zla.b.ensureCapacity(zla.a.size());
            while (!zla.a.isEmpty()) {
                zla.b.add((babm) zla.a.poll());
            }
            ArrayList arrayList = zla.b;
            badz.copyOnWrite();
            badw badw = (badw) badz.instance;
            if (!badw.d.a()) {
                badw.d = anxl.mutableCopy(badw.d);
            }
            anvf.addAll(arrayList, badw.d);
            baeb baeb = (baeb) bady.c.createBuilder();
            baeb.copyOnWrite();
            bady bady = (bady) baeb.instance;
            bady.a |= 1;
            bady.b = (double) (((float) j2) / 30.0f);
            badz.copyOnWrite();
            badw = (badw) badz.instance;
            badw.c = (bady) ((anxl) baeb.build());
            badw.a |= 1;
            PacketCreator packetCreator2 = this.af;
            create = Packet.create(packetCreator2.nativeCreateStringFromByteArray(packetCreator2.a.a(), ((badw) ((anxl) badz.build())).toByteArray()));
            try {
                this.E.a(this.ae, create, j2);
            } catch (MediaPipeException unused2) {
                xtl.d("addGpuPacket: runtime input return false");
            }
            create.c();
        }
        zmh zmh = this.ac;
        zmh.b++;
        long j3 = 0;
        if (zmh.a <= 0) {
            zmh.a = System.nanoTime();
        }
        nanoTime = System.nanoTime();
        if (nanoTime - zmh.a >= zkh.a(2.0f)) {
            zmh.c = ((float) zmh.b) / zkh.a(nanoTime - zmh.a);
            zmh.a = nanoTime;
            zmh.b = 0;
            zmf zmf2 = this.ab;
            zmi zmi = this.C;
            float f = this.ac.c;
            j2 = System.nanoTime();
            float a = zkh.a(j2 - zmi.g);
            zmi.g = j2;
            boolean z2 = zmi.h;
            Object obj2 = (z2 && zmi.i) ? 1 : null;
            zmi.i = z2;
            if (obj2 != null && a < 3.0f) {
                float abs;
                if (!zmi.a()) {
                    abs = Math.abs(f - zmi.b);
                    float f2 = zmi.a + 1.0f;
                    a = Math.abs(f - zmi.d);
                    if (abs < 1.0f && (f < f2 || a < 1.0f)) {
                        zmi.e++;
                    } else {
                        zmi.e = 1;
                        zmi.b = f;
                    }
                } else if (Math.abs(f - zmi.b) > 4.0f) {
                    int i = zmi.f + 1;
                    zmi.f = i;
                    if (f > zmi.b) {
                        i++;
                        zmi.f = i;
                    }
                    if (i >= 3) {
                        zmi.e = 1;
                        zmi.b = f;
                    }
                } else {
                    zmi.f = 0;
                }
                if (zmi.a()) {
                    zmi.d = zmi.c;
                } else {
                    double pow = Math.pow((double) Math.abs(f - zmi.a), 4.0d) / 60.0d;
                    double d;
                    if (f < zmi.a) {
                        d = (double) zmi.d;
                        pow = Math.min(pow, 3.0d);
                        Double.isNaN(d);
                        abs = (float) (d - pow);
                        zmi.d = abs;
                    } else {
                        d = (double) zmi.d;
                        Double.isNaN(d);
                        abs = (float) (d + pow);
                        zmi.d = abs;
                    }
                    abs = Math.min(abs, f);
                    zmi.d = abs;
                    abs = Math.max(abs, 3.0f);
                    zmi.d = abs;
                    if (zmi.e == 1) {
                        zmi.c = abs;
                    }
                }
            }
            float f3 = zmi.d;
            if (f3 > 0.0f) {
                j3 = zkh.a(1.0f / f3);
            }
            zmf2.a = j3;
        }
    }

    public final void f() {
        zkk.a(this.z);
        this.z = null;
        this.y = null;
    }

    static void a(ayx ayx) {
        if (ayx != null) {
            try {
                ayx.b();
            } catch (RuntimeException e) {
                xtl.a("releaseTextureSourceSafe: release failed: ", e);
            }
        }
    }

    static void a(zkd zkd) {
        if (zkd != null) {
            try {
                zkd.e();
            } catch (RuntimeException e) {
                xtl.a("releaseRenderTargetSafe: release failed: ", e);
            }
        }
    }
}
