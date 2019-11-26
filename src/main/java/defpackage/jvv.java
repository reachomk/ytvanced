package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.widget.ImageView;

/* renamed from: jvv */
final class jvv extends oai implements SurfaceTextureListener, owt, pah {
    public long a;
    public long b;
    private long c;
    private final /* synthetic */ jvo d;

    public final void a(int i, long j) {
    }

    public final void a(Surface surface) {
    }

    public final void a(String str, long j, long j2) {
    }

    public final void a(nzw nzw) {
    }

    public final void a(odk odk) {
    }

    public final void a(ovi ovi, ovm ovm, boolean z) {
    }

    public final void b(odk odk) {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.d.r = new Surface(surfaceTexture);
        jvo jvo = this.d;
        jvo.e.a(jvo, true);
        this.d.g();
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jvo jvo = this.d;
        jvo.e.a(jvo, false);
        this.d.e();
        this.d.o.obtainMessage(2, surfaceTexture).sendToTarget();
        this.d.r = null;
        return false;
    }

    public final void a(boolean z, int i) {
        jvo jvo;
        if (i == 1) {
            this.d.u = 1;
        } else if (i == 2) {
            jvo = this.d;
            if (jvo.u == 4) {
                jvo.u = 3;
                jvs jvs = jvo.o;
                jvs.sendMessageDelayed(jvs.obtainMessage(4), 1000);
                jvo.b(7, null);
                return;
            }
            jvo.u = 2;
        } else if (i != 3) {
            if (i == 4) {
                jvo = this.d;
                jvo.o.removeMessages(4);
                jvo.u = 6;
                jvo.b(3, null);
            }
        } else if (z) {
            jvo = this.d;
            jvo.o.removeMessages(4);
            jud jud = jvo.b;
            if (jud != null) {
                jud.d();
            }
            if (jvo.l.getVisibility() == 0) {
                jvo.k.start();
            }
            int i2 = jvo.u;
            if (i2 == 5 || i2 == 3) {
                jvo.b(5, null);
            } else if (i2 == 2) {
                jvo.b(2, null);
            }
            jvo.u = 4;
        } else {
            jvo = this.d;
            jvo.o.removeMessages(4);
            jvo.u = 5;
            ImageView imageView = jvo.l;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
                jvo.l.setVisibility(0);
            }
            jvo.b(4, null);
        }
    }

    public final void a(nyy nyy) {
        this.d.o.obtainMessage(5, nyy).sendToTarget();
    }

    public final void a(int i, int i2, int i3, float f) {
        if (i != 0 && i2 != 0) {
            Matrix transform = this.d.m.getTransform(new Matrix());
            f = (float) this.d.m.getWidth();
            float height = (float) this.d.m.getHeight();
            float f2 = f / ((float) i);
            float f3 = height / ((float) i2);
            float max = Math.max(f2, f3);
            transform.setScale(max / f2, max / f3, f / 2.0f, height / 2.0f);
            this.d.m.setTransform(transform);
            this.d.m.invalidate();
        }
    }

    public final void b(ovi ovi, ovm ovm, boolean z) {
        if (ovi instanceof ovx) {
            this.a = 0;
            this.c = this.d.d.b();
            jvo jvo = this.d;
            jvx jvx = jvo.t;
            jvo.a(2, null, jvx.a, jvx.b, jvx.c);
        }
    }

    public final void a(ovi ovi, ovm ovm, boolean z, int i) {
        if (ovi instanceof ovx) {
            this.a += (long) i;
        }
    }

    public final void c(ovi ovi, ovm ovm, boolean z) {
        if (ovi instanceof ovx) {
            this.b = this.d.d.b() - this.c;
            jvo jvo = this.d;
            jvx jvx = jvo.t;
            jvo.a(3, null, jvx.a, jvx.b, jvx.c);
        }
    }

    /* synthetic */ jvv(jvo jvo) {
        this.d = jvo;
    }
}
