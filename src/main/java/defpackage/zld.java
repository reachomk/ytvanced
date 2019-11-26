package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import com.google.mediapipe.framework.Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: zld */
public final class zld implements unj, zkl, zko, zkt, zle {
    public static boolean a = true;
    private boolean A;
    private final zkz B;
    private final zlw C;
    private final HandlerThread D;
    private zkc E;
    private final Runnable F = new zlp(this);
    public zmm b;
    public final List c;
    public List d;
    public final Map e;
    public boolean f;
    public znm g;
    public long h = Long.MIN_VALUE;
    public final zkk i;
    public final HashMap j;
    public volatile boolean k;
    public volatile boolean l;
    public TextView m;
    public float n;
    public float o;
    public int p;
    public int q;
    public Bitmap r;
    public long s = 500;
    private final Context t;
    private final Graph u;
    private final zla v;
    private final Rect w = new Rect();
    private znq x;
    private zos y;
    private DataSetObserver z;

    public zld(Context context, zmg zmg, EGLContext eGLContext) {
        this.t = (Context) amqw.a((Object) context);
        ayva ayva = ((zxa) context.getApplicationContext()).h().b().b().j;
        if (ayva == null) {
            ayva = ayva.m;
        }
        boolean z = ayva.g;
        ayva = ((zxa) context.getApplicationContext()).h().b().b().j;
        if (ayva == null) {
            ayva = ayva.m;
        }
        boolean z2 = ayva.k;
        this.D = new HandlerThread(zkk.class.getSimpleName());
        this.D.start();
        this.v = new zla();
        this.u = new Graph();
        this.c = new ArrayList();
        this.e = new ConcurrentHashMap();
        zmg zmg2 = zmg;
        this.i = new zkk(zmg2, this.u, "video_input", "runtime_control", this.D.getLooper(), eGLContext, z, z2, this.v);
        zkk zkk = this.i;
        zkk.I = this;
        zkk.J = this;
        this.j = new HashMap();
        this.B = new zkz(context);
        this.C = new zlw(this.v, this.B);
    }

    public final unj h() {
        return this;
    }

    public final void n() {
    }

    public final void a(znq znq, zos zos) {
        boolean z = true;
        amqw.b(this.x == null);
        if (this.y != null) {
            z = false;
        }
        amqw.b(z);
        this.x = (znq) amqw.a((Object) znq);
        this.y = (zos) amqw.a((Object) zos);
        this.d = (List) amqw.a(zos.i);
        this.f = znq.a(ayzc.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS);
        this.z = new zls(this);
        zos.registerObserver(this.z);
        for (zjt zjt : zos.i) {
            zos.a(zjt.a).setSurfaceTextureListener(new zlu(this, zjt.a));
        }
        m();
    }

    public final void d() {
        this.i.G = true;
    }

    public final void a(int i) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(14, Integer.valueOf(i)));
    }

    public final void a(float f) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(15, Float.valueOf(f)));
    }

    public final uni e() {
        return this.i.l;
    }

    public final void f() {
        this.m = null;
        this.i.L = new zlr(this);
    }

    public final void a(SurfaceTexture surfaceTexture, int i, int i2) {
        amqw.b(this.k ^ 1);
        boolean z = false;
        amqw.a(i > 0);
        if (i2 > 0) {
            z = true;
        }
        amqw.a(z);
        zkk zkk = this.i;
        zkk.N = null;
        zkk.a(surfaceTexture);
        p();
        this.i.a(i, i2);
    }

    public final boolean g() {
        this.i.a(null);
        return false;
    }

    public final void a(int i, int i2) {
        amqw.b(this.k ^ 1);
        amqw.a(true);
        amqw.a(true);
        this.i.a(i, i2);
    }

    public final void b(int i) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(9, Integer.valueOf(i)));
    }

    public final void b(float f) {
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("setPreviewMinTargetFramerate: ");
        stringBuilder.append(f);
        stringBuilder.toString();
        this.i.C.a = f;
    }

    public final void a(Bitmap bitmap) {
        zkq zkq = this.i.l;
        amqw.a(true);
        zkq.b = (Bitmap) amqw.a((Object) bitmap);
        zkq.c = Math.round(33.333333333333336d);
        if (zkq.e.c) {
            zkq.d.run();
        }
    }

    public final void i() {
        amqw.b(this.k ^ 1);
        this.l = false;
        if (this.A) {
            this.i.b.sendEmptyMessage(2);
        }
    }

    public final void j() {
        amqw.b(this.k ^ 1);
        this.l = false;
        synchronized (this.c) {
            for (zmo a : this.c) {
                a.a();
            }
            this.c.clear();
        }
        a(false);
        if (this.y != null) {
            List<zjt> list = this.d;
            if (list != null) {
                for (zjt zjt : list) {
                    TextureView c = c(zjt.a);
                    if (c != null) {
                        c.setSurfaceTextureListener(null);
                    }
                }
            }
        }
        DataSetObserver dataSetObserver = this.z;
        if (dataSetObserver != null) {
            zos zos = this.y;
            if (zos != null) {
                zos.unregisterObserver(dataSetObserver);
                this.z = null;
            }
        }
        if (this.A) {
            zkk zkk = this.i;
            synchronized (zkk.a) {
                zkk.f = true;
            }
            zkk.b.sendEmptyMessage(4);
        }
        this.k = true;
    }

    public final boolean k() {
        boolean z = true;
        amqw.b(this.k ^ 1);
        this.l = true;
        if (this.A) {
            z = false;
        } else {
            this.A = true;
        }
        this.i.b.sendEmptyMessage(3);
        return z;
    }

    public final zlw l() {
        return this.C;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00a6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A:{LOOP_START, SYNTHETIC, LOOP:0: B:12:0x0029->B:68:0x0029} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0029 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:46|47|48|49|50|74|51|44) */
    public final void c() {
        /*
        r11 = this;
        r0 = r11.x;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x000d;
    L_0x0006:
        r0 = r11.b;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x000d;
    L_0x000b:
        r0 = 0;
        goto L_0x000e;
    L_0x000d:
        r0 = 1;
    L_0x000e:
        defpackage.amqw.b(r0);
        r0 = r11.t;
        defpackage.anuu.a(r0);
        r0 = r11.u;	 Catch:{ MediaPipeException -> 0x0047 }
        r3 = "gpu_shared";
        r4 = r11.i;	 Catch:{ MediaPipeException -> 0x0047 }
        r5 = r4.a;	 Catch:{ MediaPipeException -> 0x0047 }
        r5 = r5.isAlive();	 Catch:{ MediaPipeException -> 0x0047 }
        r6 = 0;
        if (r5 == 0) goto L_0x0044;
    L_0x0026:
        r5 = r4.a;	 Catch:{ MediaPipeException -> 0x0047 }
        monitor-enter(r5);	 Catch:{ MediaPipeException -> 0x0047 }
    L_0x0029:
        r8 = r4.a;	 Catch:{ all -> 0x0041 }
        r8 = r8.isAlive();	 Catch:{ all -> 0x0041 }
        if (r8 == 0) goto L_0x003d;
    L_0x0031:
        r8 = r4.i;	 Catch:{ all -> 0x0041 }
        r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r10 != 0) goto L_0x003d;
    L_0x0037:
        r8 = r4.a;	 Catch:{ InterruptedException -> 0x0029 }
        r8.wait();	 Catch:{ InterruptedException -> 0x0029 }
        goto L_0x0029;
    L_0x003d:
        monitor-exit(r5);	 Catch:{ all -> 0x0041 }
        r6 = r4.i;	 Catch:{ MediaPipeException -> 0x0047 }
        goto L_0x0044;
    L_0x0041:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0041 }
        throw r0;	 Catch:{ MediaPipeException -> 0x0047 }
    L_0x0044:
        r0.a(r3, r6);	 Catch:{ MediaPipeException -> 0x0047 }
    L_0x0047:
        r0 = r11.u;
        r3 = new com.google.mediapipe.framework.PacketCreator;
        r3.<init>(r0);
        r0 = r11.x;
        if (r0 == 0) goto L_0x0057;
    L_0x0052:
        r0 = r0.a();
        goto L_0x005f;
    L_0x0057:
        r0 = r11.g;
        if (r0 != 0) goto L_0x005d;
    L_0x005b:
        r0 = 0;
        goto L_0x005f;
    L_0x005d:
        r0 = r0.a;
    L_0x005f:
        if (r0 == 0) goto L_0x00e6;
    L_0x0061:
        r4 = r11.u;	 Catch:{ MediaPipeException -> 0x0066 }
        r4.a(r0);	 Catch:{ MediaPipeException -> 0x0066 }
    L_0x0066:
        r0 = r11.d;
        r0.size();
        r0 = 0;
    L_0x006c:
        r4 = r11.d;
        r4 = r4.size();
        if (r0 >= r4) goto L_0x00b3;
    L_0x0074:
        r4 = r11.d;
        r4 = r4.get(r0);
        r4 = (defpackage.zjt) r4;
        r4 = r4.a;
        r5 = java.util.Locale.US;
        r5 = r4.toLowerCase(r5);
        r6 = java.util.Locale.US;
        r7 = new java.lang.Object[r2];
        r7[r1] = r5;
        r8 = "render_%s_preview";
        r6 = java.lang.String.format(r6, r8, r7);
        r7 = java.util.Locale.US;
        r8 = new java.lang.Object[r2];
        r8[r1] = r5;
        r5 = "render_%s_thumb";
        r5 = java.lang.String.format(r7, r5, r8);
        r7 = r11.u;	 Catch:{ MediaPipeException -> 0x00a6 }
        r8 = new zlg;	 Catch:{ MediaPipeException -> 0x00a6 }
        r8.<init>(r11);	 Catch:{ MediaPipeException -> 0x00a6 }
        r7.a(r6, r8);	 Catch:{ MediaPipeException -> 0x00a6 }
    L_0x00a6:
        r6 = r11.u;	 Catch:{ MediaPipeException -> 0x00b0 }
        r7 = new zlf;	 Catch:{ MediaPipeException -> 0x00b0 }
        r7.<init>(r11, r4);	 Catch:{ MediaPipeException -> 0x00b0 }
        r6.a(r5, r7);	 Catch:{ MediaPipeException -> 0x00b0 }
    L_0x00b0:
        r0 = r0 + 1;
        goto L_0x006c;
    L_0x00b3:
        r0 = r11.f;
        if (r0 == 0) goto L_0x00c2;
    L_0x00b7:
        r0 = r11.u;	 Catch:{ MediaPipeException -> 0x00c1 }
        r1 = "output_events";
        r2 = r11.B;	 Catch:{ MediaPipeException -> 0x00c1 }
        r0.a(r1, r2);	 Catch:{ MediaPipeException -> 0x00c1 }
        goto L_0x00c2;
    L_0x00c2:
        r11.p();
        r0 = r11.x;
        if (r0 == 0) goto L_0x00ce;
    L_0x00c9:
        r0 = r0.a(r3);
        goto L_0x00e0;
    L_0x00ce:
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = r11.g;
        r1 = r1.b;
        r1 = r3.a(r1);
        r2 = "asset_base";
        r0.put(r2, r1);
    L_0x00e0:
        r1 = r11.u;	 Catch:{ MediaPipeException -> 0x00e5 }
        r1.a(r0);	 Catch:{ MediaPipeException -> 0x00e5 }
    L_0x00e5:
        return;
    L_0x00e6:
        r0 = "No MediaPipe graph setup provided!";
        defpackage.xtl.c(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zld.c():void");
    }

    private final TextureView c(String str) {
        List b = b(str);
        return !b.isEmpty() ? (TextureView) b.get(0) : null;
    }

    public final List b(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        zos zos = this.y;
        if (zos != null) {
            arrayList.add(zos.a(str));
            return arrayList;
        }
        synchronized (this.e) {
            for (znl znl : this.e.values()) {
                if (str.equals(znl.a)) {
                    arrayList.add(znl.b);
                }
            }
        }
        return arrayList;
    }

    public final void a_(boolean z) {
        if (!this.k) {
            if (this.l) {
                if (z) {
                    this.i.b.removeCallbacks(this.F);
                } else {
                    q();
                }
            }
            this.i.C.a_(z);
        }
    }

    public final boolean a(String str) {
        if (this.d != null && this.r == null && this.b == null) {
            TextureView c = c(str);
            if (c != null && c.isAvailable()) {
                ((View) c.getParent()).getHitRect(this.w);
                return c.getLocalVisibleRect(this.w);
            }
        }
        return false;
    }

    public final void a() {
        synchronized (this.j) {
            for (zkd a : this.j.values()) {
                zkk.a(a);
            }
            this.j.clear();
        }
    }

    public final void b() {
        zkk zkk = this.i;
        zkk.N = null;
        zkk.I = null;
        this.D.quit();
    }

    public final void a(boolean z) {
        zkk zkk = this.i;
        zkk.H = z;
        if (z) {
            zko zko = zkk.g;
            if (zko != null) {
                zkk.a(zko);
                zkk.g = null;
            }
            zkk.e();
        }
    }

    public final void a(zmm zmm) {
        amqw.b(this.b == null);
        synchronized (this.c) {
            this.b = (zmm) amqw.a((Object) zmm);
            this.c.add(zmm.a(new zlk(this, zmm)));
            List list = this.c;
            zkk zkk = this.i;
            zkk.getClass();
            list.add(zmm.a(new zlj(zkk)));
            list = this.c;
            zkk = this.i;
            zkk.getClass();
            list.add(zmm.a(new zlm(zkk)));
            this.c.add(zmm.a(new zll(this, zmm)));
        }
    }

    public final void m() {
        zkk zkk = this.i;
        List list = this.d;
        amqw.b(zkk.F == null);
        zkk.F = list;
        this.i.a((zko) this);
        if (o()) {
            q();
        }
        this.d.size();
    }

    public final void a(ayx ayx, zkd zkd, int i, int i2) {
        try {
            if (this.E == null) {
                this.E = zkc.a();
            }
            this.E.a(ayx, zkd, i, i2);
            zkd.d();
        } catch (RuntimeException e) {
            xtl.a("copyTextureFrameToTarget: copyOutputToViewShader failed: ", e);
            this.E = null;
        }
        GLES20.glFinish();
    }

    public final boolean o() {
        List<zjt> list = this.d;
        if (list == null) {
            return false;
        }
        for (zjt zjt : list) {
            TextureView c = c(zjt.a);
            if (c != null) {
                if (!c.isAvailable()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void p() {
        zos zos = this.y;
        if (zos != null) {
            zkk zkk = this.i;
            String str = zos.f;
            zjt a = zjt.a(zkk.F, str);
            if (a != null) {
                zkk.a(a, new zmn(str));
            }
        }
    }

    public final void q() {
        this.i.b.removeCallbacks(this.F);
        if (this.b == null) {
            this.i.b.postDelayed(this.F, this.s);
        } else {
            xtl.c("DrishtiGl: VideoEffectPipelineDrishti.updateAllFilterThumbnailsDelayed ignored");
        }
    }

    static {
        try {
            System.loadLibrary("drishti_jni_native");
        } catch (UnsatisfiedLinkError e) {
            xtl.a("Load library: drishti_jni_native - Failed to load", e);
        }
    }
}
