package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.media.CamcorderProfile;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: zgu */
public final class zgu extends nf implements PreviewCallback, Callback, zgt {
    private boolean Z;
    public zgr a;
    private int aa;
    private SurfaceView ab;
    private SurfaceHolder ac;
    private ObjectAnimator ad;
    private DisplayManager ae;
    private DisplayListener af;
    public int b;
    public View c;

    public final void b() {
    }

    public final void f() {
        zgr zgr = this.a;
        if (zgr != null) {
            zgr.c();
        }
    }

    private final void W() {
        boolean z = VERSION.SDK_INT < 23 || p().checkSelfPermission("android.permission.CAMERA") == 0;
        this.Z = z;
        if (z) {
            int[] a = zgr.a();
            int i = a[0];
            if (i >= 0) {
                this.aa = i;
            } else {
                i = a[1];
                this.aa = i;
            }
            if (i >= 0) {
                this.a = new zgr();
                zgr zgr = this.a;
                zgr.i = this;
                zgr.a(this.ac);
                this.af = new zgx(this);
                this.ae = (DisplayManager) p().getSystemService("display");
                this.ae.registerDisplayListener(this.af, null);
            }
        }
    }

    private final void X() {
        if (this.a != null) {
            CamcorderProfile a = zgn.a(this.aa, 20, 6);
            int b = zgu.b(p());
            this.b = b;
            this.a.a(b);
            this.a.a(this.aa, a.videoFrameWidth, a.videoFrameHeight, a.videoFrameRate);
        }
    }

    public static int b(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation == 3 ? 270 : 0;
        } else {
            return 180;
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.camera_preview_fragment, viewGroup, false);
        this.c = viewGroup2.findViewById(R.id.camera_preview_cover);
        this.ab = (SurfaceView) viewGroup2.findViewById(R.id.camera_preview_surface_view);
        W();
        this.ab.getHolder().addCallback(this);
        return viewGroup2;
    }

    public final void X_() {
        DisplayManager displayManager = this.ae;
        if (displayManager != null) {
            DisplayListener displayListener = this.af;
            if (displayListener != null) {
                displayManager.unregisterDisplayListener(displayListener);
                this.af = null;
            }
        }
        super.X_();
    }

    public final void ad_() {
        f();
        super.ad_();
    }

    public final void B() {
        if (!this.Z) {
            W();
        }
        ObjectAnimator objectAnimator = this.ad;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.ad.cancel();
        }
        this.ad = null;
        this.c.setAlpha(1.0f);
        this.c.setVisibility(0);
        super.B();
        X();
    }

    public final void a(Camera camera) {
        camera.setOneShotPreviewCallback(this);
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        ObjectAnimator objectAnimator = this.ad;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.ad.cancel();
        }
        this.ad = null;
        this.ad = ObjectAnimator.ofFloat(this.c, View.ALPHA, new float[]{this.c.getAlpha(), 0.0f});
        this.ad.addListener(new zgw(this));
        this.ad.start();
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.ac = surfaceHolder;
        zgr zgr = this.a;
        if (zgr != null) {
            zgr.a(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.ac = null;
        if (this.a != null) {
            f();
            this.a.a(null);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.ac = surfaceHolder;
        if (this.a != null && !surfaceHolder.isCreating()) {
            f();
            this.a.a(surfaceHolder);
            X();
        }
    }
}
