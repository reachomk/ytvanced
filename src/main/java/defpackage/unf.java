package defpackage;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: unf */
public abstract class unf extends FrameLayout implements SurfaceTextureListener, nlu {
    private final ImageView a;
    public final TextureView b;
    public final View c;
    public View d;
    public float e = 1.7777778f;
    public int f = Integer.MAX_VALUE;
    public int g;
    public nlp h;
    public int i = 0;
    public SurfaceTextureListener j;
    public uni k;
    private final Runnable l = new une(this);
    private boolean m = false;
    private uor n;
    private long o;
    private long p = -1;

    public unf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.video_with_preview_view, this, true);
        this.b = (TextureView) findViewById(R.id.video_surface);
        this.b.setSurfaceTextureListener(this);
        this.a = (ImageView) findViewById(R.id.preview_image);
        this.c = findViewById(R.id.preview_image_error);
    }

    private static boolean b(int i) {
        return i == 2 || i == 3;
    }

    public final void a() {
    }

    public final void a(nlq nlq) {
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract float e();

    public abstract void f();

    public final void a(boolean z, int i) {
        if (this.n != null) {
            nlp nlp = this.h;
            if (!(nlp == null || this.k == null || nlp.b(0) < 0 || unf.b(i) || !this.h.e())) {
                a(null, false);
            }
        }
        post(new ung(this, i));
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTextureListener surfaceTextureListener = this.j;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        f();
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTextureListener surfaceTextureListener = this.j;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
        f();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        SurfaceTextureListener surfaceTextureListener = this.j;
        if (surfaceTextureListener == null) {
            return true;
        }
        return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        SurfaceTextureListener surfaceTextureListener = this.j;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        if ((this.k == null || this.h == null) && this.n != null) {
            a(null, false);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(uor uor, boolean z) {
        uor uor2 = this.n;
        if (uor2 != null) {
            uor2.d();
        }
        this.n = uor != null ? uor.c() : null;
        if (z) {
            this.o = -1;
        } else {
            this.o = System.currentTimeMillis() + 50;
            postDelayed(this.l, 50);
        }
        uni uni = this.k;
        if (uni != null) {
            uor uor3 = this.n;
            if (uor3 == null) {
                uni.a(null);
            } else if (uor3.e() == 2) {
                this.k.a(this.n.b().copy(Config.ARGB_8888, false));
            }
        } else {
            uor = this.n;
            if (uor == null) {
                this.a.setImageBitmap(null);
                this.a.setVisibility(8);
            } else if (uor.e() == 2) {
                this.a.setImageBitmap(this.n.b());
                this.a.setVisibility(0);
                e();
                this.a.setScaleX(1.0f);
                this.a.setScaleY(1.0f);
            }
        }
        g();
    }

    public final void a(int i) {
        this.m = unf.b(i);
        g();
    }

    public final void g() {
        if (this.d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            uor uor = this.n;
            Object obj = 1;
            int i = 0;
            Object obj2 = (uor == null || uor.e() != 2) ? 1 : null;
            long j = this.o;
            Object obj3 = (j == -1 || j >= currentTimeMillis) ? null : 1;
            if (this.m && !(obj2 == null && obj3 == null)) {
                j = this.p;
                if (j == -1) {
                    this.p = currentTimeMillis;
                    j = currentTimeMillis;
                }
                currentTimeMillis -= j;
                if (currentTimeMillis <= 500) {
                    obj = null;
                }
                if (obj == null) {
                    postDelayed(this.l, (500 - currentTimeMillis) + 1);
                }
            } else {
                this.p = -1;
                obj = null;
            }
            View view = this.d;
            if (obj == null) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
