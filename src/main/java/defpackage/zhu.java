package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.GalleryCameraRecordButtonView;
import com.google.android.libraries.youtube.edit.camera.RotateLayout;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.Timer;

/* renamed from: zhu */
public final class zhu extends nf implements OnClickListener, zhm, zip {
    public static final int[] a = new int[]{0, 90, 270};
    public acxj Z;
    private zjk aA;
    private CameraFocusOverlay aB;
    public bapu aa;
    public xnu ab;
    public atst ac;
    public CameraView ad;
    public FrameLayout ae;
    public GalleryCameraRecordButtonView af;
    public ImageView ag;
    public ImageView ah;
    public AnimatorSet ai;
    public long aj;
    public View ak;
    public View al;
    public RotateLayout am;
    public TextView an;
    public Handler ao;
    public int ap = 0;
    public ImageView aq;
    public int ar;
    private int as = 6;
    private zhq at;
    private zio au;
    private Timer av;
    private OrientationEventListener aw;
    private ImageView ax;
    private View ay;
    private ValueAnimator az;
    public zib b;
    public zyw c;

    public final void Y() {
    }

    public final void ah() {
    }

    public final void an() {
    }

    public final void d(int i) {
    }

    private final zit f() {
        this.av.cancel();
        this.av = null;
        this.ao.removeCallbacksAndMessages(null);
        return this.ad.j();
    }

    private final void W() {
        a(true);
        this.an.setText(a(0));
        this.ax.setVisibility(4);
        this.aq.setEnabled(true);
        this.ag.setEnabled(true);
        GalleryCameraRecordButtonView galleryCameraRecordButtonView = this.af;
        AnimatorSet animatorSet = galleryCameraRecordButtonView.f;
        if (animatorSet != null && animatorSet.isRunning()) {
            galleryCameraRecordButtonView.f.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, GalleryCameraRecordButtonView.SCALE_X, new float[]{galleryCameraRecordButtonView.e});
        ofFloat.setDuration(200);
        ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, GalleryCameraRecordButtonView.SCALE_Y, new float[]{galleryCameraRecordButtonView.e}).setDuration(200);
        ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, GalleryCameraRecordButtonView.SCALE_X, new float[]{1.0f}).setDuration(300);
        ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, GalleryCameraRecordButtonView.SCALE_Y, new float[]{1.0f}).setDuration(300);
        ofFloat.addListener(new zig(galleryCameraRecordButtonView));
        galleryCameraRecordButtonView.f = new AnimatorSet();
        galleryCameraRecordButtonView.f.playTogether(new Animator[]{ofFloat, r6, r4, r5});
        galleryCameraRecordButtonView.f.start();
        this.af.setContentDescription(q().getString(R.string.upload_edit_camera_start_record));
        aa();
    }

    public final void X() {
        zhl h = this.ad.h();
        if (h != null) {
            LayoutParams layoutParams;
            float f = ((float) h.b) / ((float) h.a);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            p().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int ab = displayMetrics.heightPixels + ab();
            float f2 = (float) i;
            float f3 = (float) ab;
            float f4 = f2 / f3;
            if (f <= f4) {
                i = (int) (f3 * f);
            } else {
                ab = (int) (f2 / f);
            }
            this.ad.a(i, ab);
            xof c = this.ab.c();
            if (c.b() > 0) {
                this.ae.setBackgroundColor(q().getColor(R.color.yt_black_pure));
                this.ay.setVisibility(0);
                layoutParams = this.ay.getLayoutParams();
                layoutParams.height = c.b();
                this.ay.setLayoutParams(layoutParams);
                this.aA.a(q().getColor(R.color.yt_black_pure));
                a(c);
            } else if (f <= f4) {
                this.ay.setVisibility(8);
                this.aA.a(this.ae.getResources().getColor(R.color.gallery_camera_navigation_bar_semi_transparent_background));
            } else {
                this.ae.setBackgroundColor(q().getColor(R.color.yt_black_pure));
                this.ay.setVisibility(0);
                this.aA.a(q().getColor(R.color.yt_black_pure));
            }
            layoutParams = this.aB.getLayoutParams();
            layoutParams.height = ab;
            layoutParams.width = i;
            this.aB.setLayoutParams(layoutParams);
        }
    }

    public final void Z() {
        this.av = new Timer();
        this.aj = System.currentTimeMillis();
        this.an.setText(a(0));
        this.ax.setVisibility(0);
        this.av.scheduleAtFixedRate(new zhx(this), 0, 100);
        zha.a(this.af, true);
        this.aq.setEnabled(false);
        this.ag.setEnabled(false);
        a(false);
        GalleryCameraRecordButtonView galleryCameraRecordButtonView = this.af;
        AnimatorSet animatorSet = galleryCameraRecordButtonView.f;
        if (animatorSet != null && animatorSet.isRunning()) {
            galleryCameraRecordButtonView.f.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, GalleryCameraRecordButtonView.SCALE_X, new float[]{1.0f});
        ofFloat.setDuration(400);
        ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, GalleryCameraRecordButtonView.SCALE_Y, new float[]{1.0f}).setDuration(400);
        ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, GalleryCameraRecordButtonView.SCALE_X, new float[]{galleryCameraRecordButtonView.d}).setDuration(300);
        ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, GalleryCameraRecordButtonView.SCALE_Y, new float[]{galleryCameraRecordButtonView.d}).setDuration(300);
        ofFloat.addListener(new zih(galleryCameraRecordButtonView));
        galleryCameraRecordButtonView.f = new AnimatorSet();
        galleryCameraRecordButtonView.f.playTogether(new Animator[]{ofFloat, r6, r4, r5});
        galleryCameraRecordButtonView.f.start();
        this.af.setContentDescription(q().getString(R.string.upload_edit_camera_stop_record));
        aa();
    }

    private final void aa() {
        if (this.ad.f()) {
            this.ah.setVisibility(0);
        } else {
            this.ah.setVisibility(8);
        }
    }

    public final void ai() {
        WindowManager.LayoutParams attributes = p().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        p().getWindow().setAttributes(attributes);
    }

    public final void aj() {
        WindowManager.LayoutParams attributes = p().getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        p().getWindow().setAttributes(attributes);
    }

    public final void a(xof xof) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.am.getLayoutParams();
        int i = this.ap;
        if ((i == 0 || i == 180) && xof.b() > 0) {
            layoutParams.topMargin = xof.b();
        } else {
            layoutParams.topMargin = 0;
        }
        this.am.setLayoutParams(layoutParams);
    }

    public static Property e(int i) {
        if (i == 90 || i == 270) {
            return View.TRANSLATION_X;
        }
        return View.TRANSLATION_Y;
    }

    public final float a(int i, boolean z) {
        int i2 = 0;
        if (i == 180) {
            i = this.ae.getHeight();
            if (z) {
                i2 = -this.al.getHeight();
            }
            return (float) (i + i2);
        } else if (i == 270) {
            return a(false, z);
        } else {
            if (i == 90) {
                return a(true, z);
            }
            return !z ? (float) (-this.al.getHeight()) : 0.0f;
        }
    }

    private final float a(boolean z, boolean z2) {
        float f;
        Resources resources = this.ae.getResources();
        boolean a = zha.a(resources);
        if ((z || a) && !(z && a)) {
            int dimensionPixelSize;
            if (z2) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gallery_camera_header_landscape_margin_top);
            } else {
                dimensionPixelSize = -this.al.getHeight();
            }
            f = (float) dimensionPixelSize;
        } else {
            f = (float) (this.ae.getWidth() + (z2 ? (-this.al.getHeight()) - resources.getDimensionPixelSize(R.dimen.gallery_camera_header_landscape_margin_top) : 0));
        }
        return a ? -f : f;
    }

    private final void a(boolean z) {
        int i = this.am.a;
        int i2 = 0;
        if (i == 90 || i == 270) {
            ValueAnimator valueAnimator = this.az;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            i = this.ak.getWidth();
            int a = a(this.ak.getResources(), z ^ 1);
            this.az = ValueAnimator.ofInt(new int[]{i, a});
            this.az.addUpdateListener(new zhv(this));
            this.az.addListener(new zhz(this, z));
            this.az.setDuration(250);
            this.az.start();
            return;
        }
        ImageView imageView = this.aq;
        if (!z) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        this.ag.setVisibility(i2);
    }

    public final int a(Resources resources, int i) {
        int dimensionPixelSize;
        int width = this.an.getWidth();
        if (i != 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gallery_camera_header_landscape_button_min_gap);
            dimensionPixelSize += dimensionPixelSize;
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gallery_camera_header_landscape_button_max_gap);
            dimensionPixelSize = ((dimensionPixelSize + dimensionPixelSize) + this.aq.getWidth()) + this.ag.getWidth();
        }
        return width + dimensionPixelSize;
    }

    private final int ab() {
        int identifier = q().getIdentifier("navigation_bar_height", "dimen", "android");
        return identifier > 0 ? q().getDimensionPixelSize(identifier) : 0;
    }

    public final String a(long j) {
        return uix.a(p(), (int) R.string.camera_timer_template, j);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        if (bundle != null) {
            this.as = bundle.getInt("TARGET_VIDEO_QUALITY");
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aoqz aoqz;
        ((zid) xse.a(p())).d().a(this);
        this.Z.a(acwl.av, null, this.ac);
        Resources q = q();
        int ab = ab();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.gallery_camera_fragment, viewGroup, false);
        this.ae = (FrameLayout) viewGroup2.findViewById(R.id.camera_layout);
        this.ar = zha.a(p());
        this.ad = (CameraView) viewGroup2.findViewById(R.id.camera_view);
        this.ad.a((zhm) this);
        this.ad.setOnTouchListener(new ziq(p(), this));
        CameraView cameraView = this.ad;
        apxn a = this.c.a();
        if (a == null) {
            aoqz = aoqz.c;
        } else {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            aoqz = auya.x;
            if (aoqz == null) {
                aoqz = aoqz.c;
            }
        }
        cameraView.q = aoqz;
        cameraView = this.ad;
        cameraView.t = false;
        cameraView.a(this.as);
        cameraView = this.ad;
        int i = this.as;
        if (i == 4) {
            i = 2500000;
        } else if (i == 5) {
            i = 5000000;
        } else if (i == 6) {
            i = 8000000;
        } else {
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Unknown video quality ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        cameraView.n = i;
        cameraView.b(this.ar);
        this.af = (GalleryCameraRecordButtonView) viewGroup2.findViewById(R.id.record_button_view);
        this.af.setOnClickListener(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.af.getLayoutParams();
        layoutParams.bottomMargin = q.getDimensionPixelSize(R.dimen.gallery_camera_record_button_bottom_padding) + ab;
        this.af.setLayoutParams(layoutParams);
        this.ag = (ImageView) viewGroup2.findViewById(R.id.flashlight_on_off);
        this.at = new zhr(p(), this.ad, this.ag, this.Z, this.ac);
        this.ah = (ImageView) viewGroup2.findViewById(R.id.switch_camera_button);
        layoutParams = (FrameLayout.LayoutParams) this.ah.getLayoutParams();
        layoutParams.bottomMargin = q.getDimensionPixelSize(R.dimen.camera_switch_camera_button_margin_bottom) + ab;
        this.ah.setLayoutParams(layoutParams);
        this.au = new zio(p(), this.ad, this.ah, this.Z, this.ac);
        aa();
        this.an = (TextView) viewGroup2.findViewById(R.id.record_duration_text);
        this.an.setText(a(0));
        this.ao = new zif(new WeakReference(this));
        this.ak = viewGroup2.findViewById(R.id.camera_header);
        this.al = viewGroup2.findViewById(R.id.camera_header_container);
        this.am = (RotateLayout) viewGroup2.findViewById(R.id.camera_header_rotate);
        this.aq = (ImageView) viewGroup2.findViewById(R.id.camera_close);
        this.aq.setOnClickListener(this);
        this.aB = (CameraFocusOverlay) viewGroup2.findViewById(R.id.camera_focus_overlay);
        this.ax = (ImageView) viewGroup2.findViewById(R.id.record_blink_view);
        ((AnimationDrawable) this.ax.getBackground()).start();
        this.ay = viewGroup2.findViewById(R.id.top_blocker);
        this.aA = new zjk(p().getWindow(), viewGroup2);
        zjk zjk = this.aA;
        if (!(zjk.d && zjk.c)) {
            zjk.d = true;
            zjk.c = true;
            zjk.removeMessages(0);
            zjk.a();
        }
        this.Z.b(acwc.UPLOAD_VIDEO_CAMERA_RECORD_BUTTON, this.ac);
        if (this.ah.getVisibility() == 0) {
            this.Z.b(acwc.UPLOAD_VIDEO_CAMERA_SWITCH_BUTTON, this.ac);
        }
        this.Z.b(acwc.UPLOAD_VIDEO_FLASH_TOGGLE, this.ac);
        this.Z.b(acwc.MOBILE_BACK_BUTTON, this.ac);
        this.Z.b(acwc.UPLOAD_VIDEO_CAMERA_STOP_BUTTON, this.ac);
        this.ab.a(this.ae, 7);
        return viewGroup2;
    }

    public final void i() {
        this.at.a();
        super.i();
    }

    public final void ad_() {
        super.ad_();
        if (this.ad.a()) {
            zit f = f();
            zib zib = this.b;
            if (zib != null) {
                zib.b(f);
            }
            W();
        }
        this.ad.m();
        this.aw.disable();
        zjk zjk = this.aA;
        if (VERSION.SDK_INT >= 21) {
            zjk.a.setNavigationBarColor(zjk.b);
        }
    }

    public final void B() {
        super.B();
        this.ad.n();
        if (this.aw == null) {
            this.aw = new zic(this, p());
        }
        this.aw.enable();
    }

    public final void onClick(View view) {
        zib zib;
        if (view == this.af.c) {
            if (this.ad.a()) {
                if (this.ad.a()) {
                    this.Z.a(3, new acvs(acwc.UPLOAD_VIDEO_CAMERA_STOP_BUTTON), this.ac);
                    zit f = f();
                    if (f == null) {
                        zib = this.b;
                        if (zib != null) {
                            zib.b(null);
                        }
                        W();
                        Toast makeText = Toast.makeText(p(), R.string.camera_recording_time_too_short_click_to_record, 1);
                        makeText.setGravity(17, 0, 0);
                        makeText.show();
                    } else if (this.b != null) {
                        zha.a(this.af, false);
                        this.b.a(f);
                    }
                }
            } else if (this.ad.c()) {
                this.Z.a(3, new acvs(acwc.UPLOAD_VIDEO_CAMERA_RECORD_BUTTON), this.ac);
                if (!zha.b()) {
                    zha.a(p(), (int) R.string.camera_no_external_storage);
                } else if (zha.a() < 5242880) {
                    zha.a(p(), (int) R.string.camera_out_of_space);
                } else {
                    zib = this.b;
                    if (zib != null) {
                        zib.a();
                        zht zht = new zht(this);
                        if (this.ad.d()) {
                            this.af.setOnClickListener(null);
                            this.ad.postDelayed(zht, ((zji) this.aa.get()).a());
                            return;
                        }
                        zht.run();
                    }
                }
            }
        } else if (view == this.aq) {
            this.Z.a(3, new acvs(acwc.MOBILE_BACK_BUTTON), this.ac);
            zib = this.b;
            if (zib != null) {
                zib.b();
            }
        }
    }

    public final void c(float f) {
        this.ad.a(f);
    }

    public final void a(float f, float f2) {
        CameraView cameraView = this.ad;
        CameraFocusOverlay cameraFocusOverlay = this.aB;
        cameraFocusOverlay.getClass();
        cameraView.a(f, f2, new zhy(cameraFocusOverlay));
    }

    public final void am() {
        this.au.a();
    }
}
