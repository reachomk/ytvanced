package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.media.ThumbnailUtils;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.RecordButtonView;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: gbt */
public final class gbt extends nf implements acwa, OnClickListener, ger, ges, zhk, zhm, zip {
    private static final long aw = TimeUnit.DAYS.toSeconds(7);
    public acvx Z;
    public int a;
    private CountDownTimer aA;
    private final zmm aB = new zmt();
    private boolean aC;
    private ImageView aD;
    private ImageView aE;
    private ViewGroup aF;
    private ChooseFilterView aG;
    private ChooseFilterView aH;
    private View aI;
    private gbr aJ;
    private gbr aK;
    private gbi aL;
    private gcg aM;
    private ImageView aN;
    private zhq aO;
    private ImageView aP;
    private zio aQ;
    private View aR;
    private View aS;
    private ImageView aT;
    private CameraFocusOverlay aU;
    private zpo aV;
    private ObjectAnimator aW;
    private ObjectAnimator aX;
    private int aY;
    private gch aZ;
    public zzl aa;
    public bapu ab;
    public ghd ac;
    public SharedPreferences ad;
    public gkt ae;
    public boolean af;
    public atst ag;
    public float ah = 0.0f;
    public boolean ai = true;
    public File aj;
    public CameraView ak;
    public RecordButtonView al;
    public geo am;
    public geq an;
    public boolean ao;
    public ProgressBar ap;
    public ImageView aq;
    public int ar;
    public ImageView as;
    public LinearLayout at;
    public FrameLayout au;
    public FrameLayout av;
    private boolean ax;
    private int ay;
    private aqcl az;
    public gcc b;
    private apxu ba;
    private final Runnable bb = new gby(this);
    public zyw c;

    public final void Y() {
    }

    public final void ah() {
    }

    public static gbt a(int i, int i2, aqcl aqcl, znv znv, boolean z, apxu apxu) {
        int i3 = i == 0 ? 0 : 1;
        if (i != 0) {
            i3 = 1;
        }
        amqw.a(true, (Object) "startCameraSelection must be one of @StartCameraSelection values");
        gbt gbt = new gbt();
        Bundle bundle = new Bundle();
        bundle.putInt("VIDEO_TIME_LIMIT_MSECS", i2);
        bundle.putBoolean("MIRROR_FRONT_CAMERA", true);
        bundle.putInt("START_CAMERA_SELECTION", i3);
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        if (aqcl != null) {
            bundle.putByteArray("COMMENT_STICKER_RENDERER_KEY", aqcl.toByteArray());
        }
        bundle.putBoolean("SWIPE_TO_CAMERA_ENABLED", z);
        gbt.a(znv);
        gbt.f(bundle);
        return gbt;
    }

    public final void a(znv znv) {
        this.aB.a(znv);
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        boolean z = true;
        CountDownTimer countDownTimer;
        ProgressBar progressBar;
        if (this.an != null) {
            if (this.ak.a()) {
                if (this.aj == null) {
                    z = false;
                }
                amqw.b(z);
                this.Z.a();
                zin aq = aq();
                if (aq == null || aq.d < 1000) {
                    this.aj.delete();
                    this.ak.a((zhk) this);
                    ap();
                } else if (this.b != null) {
                    zha.a(this.al, false);
                    this.b.a(aq, false);
                    ap();
                }
                if (this.a > 0) {
                    countDownTimer = this.aA;
                    if (countDownTimer != null) {
                        countDownTimer.onFinish();
                        this.aA.cancel();
                    }
                    progressBar = this.ap;
                    if (progressBar != null) {
                        progressBar.setProgress(0);
                    }
                }
            }
        } else if (this.aC) {
            this.aC = false;
            int max = Math.max(1000, ViewConfiguration.getLongPressTimeout());
            zgz zgz = this.ak.g;
            long b = zgz != null ? zgz.b() : 0;
            if (this.ak.a() && b >= ((long) max)) {
                if (this.aj == null) {
                    z = false;
                }
                amqw.b(z);
                a(new gbs(this));
            } else {
                this.ak.a((zhk) this);
                if (this.ak.a()) {
                    a(new gbv(this));
                }
            }
            ap();
            if (this.a > 0) {
                countDownTimer = this.aA;
                if (countDownTimer != null) {
                    countDownTimer.onFinish();
                    this.aA.cancel();
                }
                progressBar = this.ap;
                if (progressBar != null) {
                    progressBar.setProgress(0);
                }
            }
            this.Z.a();
        }
    }

    private final void ap() {
        gch gch = this.aZ;
        if (gch != null && gch.getStatus() != Status.FINISHED) {
            this.aZ.cancel(true);
            this.aZ = null;
        }
    }

    public final void a(gcc gcc) {
        this.b = gcc;
        zpo zpo = this.aV;
        if (zpo != null) {
            zpo.c = gcc;
        }
    }

    /* Access modifiers changed, original: final */
    public final void W() {
        if (this.ak.c()) {
            this.Z.a(3, new acvs(acwc.UPLOAD_VIDEO_CAMERA_RECORD_BUTTON), null);
            this.Z.a(new acvs(acwc.UPLOAD_VIDEO_CAMERA_STOP_BUTTON), null);
            if (!zha.b()) {
                zha.a(p(), (int) R.string.reel_camera_no_external_storage);
            } else if (zha.a() >= 5242880) {
                if (this.ak.d()) {
                    this.ak.postDelayed(this.bb, ((zji) this.ab.get()).a());
                } else {
                    this.bb.run();
                }
                this.aC = true;
            } else {
                zha.a(p(), (int) R.string.reel_camera_out_of_space);
            }
        }
    }

    private final zin aq() {
        return a(this.ak.j());
    }

    private final void a(xsd xsd) {
        CameraView cameraView = this.ak;
        gbu gbu = new gbu(this, xsd);
        amqw.b(cameraView.a());
        zgz zgz = cameraView.g;
        zhc zhc = new zhc(cameraView, gbu);
        zgz.r = false;
        HandlerThread handlerThread = new HandlerThread("StopRecordingThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new zgy(zgz, zhc));
    }

    public final zin a(zit zit) {
        if (zit == null) {
            return null;
        }
        zmn ar = ar();
        String file = this.aj.toString();
        int i = zit.a;
        int i2 = zit.b;
        long j = zit.c;
        String str = ar.a;
        ayza ayza = ar.b;
        return new zin(file, true, i, i2, j, false, false, str, ayza, a(ayza));
    }

    public final void X() {
        zhl h = this.ak.h();
        if (h != null) {
            float f = ((float) h.b) / ((float) h.a);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            p().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f2 = (float) i;
            float f3 = (float) i2;
            if (f >= f2 / f3) {
                i = (int) (f3 * f);
            } else {
                i2 = (int) (f2 / f);
            }
            this.ak.a(i, i2);
            LayoutParams layoutParams = this.aU.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i;
            this.aU.setLayoutParams(layoutParams);
        }
        if (this.aZ == null) {
            this.aZ = new gch(this);
            this.aZ.execute(new Void[0]);
        }
    }

    public final void Z() {
        zha.a(this.al, true);
        if (this.a > 0) {
            CountDownTimer countDownTimer = this.aA;
            if (countDownTimer != null) {
                countDownTimer.start();
            }
        }
        this.aT.setEnabled(false);
        this.aN.setEnabled(false);
        this.aq.setVisibility(4);
        this.aJ.b();
        this.aK.b();
        this.aL.a(true);
        gbi gbi = this.aL;
        if (gbi.l != null) {
            ChooseFilterView chooseFilterView = gbi.d;
            if (chooseFilterView != null) {
                chooseFilterView.a(null);
            }
            chooseFilterView = gbi.e;
            if (chooseFilterView != null) {
                chooseFilterView.a(null);
            }
            gbi.l.setVisibility(8);
        }
        this.aN.setVisibility(4);
        f(false).start();
        RecordButtonView recordButtonView = this.al;
        TransitionManager.beginDelayedTransition(recordButtonView.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200)));
        LayoutParams layoutParams = recordButtonView.a.getLayoutParams();
        layoutParams.width = (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_width);
        layoutParams.height = (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_height);
        recordButtonView.a.setLayoutParams(layoutParams);
        this.al.setContentDescription(q().getString(R.string.reel_camera_stop_record));
        as();
    }

    public final void aa() {
        TransitionManager.endTransitions(this.al);
        if (this.ak.d()) {
            ((zji) this.ab.get()).b();
        }
        this.ak.a((zhk) this);
    }

    public final void ab() {
        this.ai = false;
        this.al.a();
        this.ak.k();
    }

    public final void ac() {
        this.al.b();
    }

    public final void ad() {
        W();
    }

    public final void ae() {
        this.al.b();
        f();
    }

    public final void a(float f) {
        this.ak.b(f);
    }

    public final void af() {
        this.ai = false;
        this.al.a();
        this.ak.k();
        W();
    }

    public final void ag() {
        this.al.b();
        f();
    }

    public final void b(float f) {
        this.ak.b(f);
    }

    public final void a(Bitmap bitmap) {
        a(bitmap, false);
    }

    public final void a(Bitmap bitmap, boolean z) {
        boolean z2 = z;
        Bitmap a = gga.a(bitmap);
        File file = ao().a;
        String valueOf = String.valueOf(zha.a(System.currentTimeMillis()));
        String str = ".jpeg";
        File file2 = new File(file, str.length() == 0 ? new String(valueOf) : valueOf.concat(str));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2.toString()));
            a.compress(CompressFormat.JPEG, 92, bufferedOutputStream);
            bufferedOutputStream.close();
        } catch (IOException e) {
            xtl.a("error writing image file", e);
            gge.a(M_(), R.string.reel_camera_error_creating_image);
        }
        zmn ar = ar();
        String file3 = file2.toString();
        int width = a.getWidth();
        int height = a.getHeight();
        ayza ayza = null;
        String str2 = !z2 ? ar.a : null;
        if (!z2) {
            ayza = ar.b;
        }
        p().runOnUiThread(new gbx(this, new zin(file3, true, width, height, 5000, true, z, str2, ayza, a(ar.b)), z2));
    }

    private final zmn ar() {
        return this.aB.a();
    }

    private final boolean a(ayza ayza) {
        if (ayza.EFFECT_SUBPACKAGE_ID_PRESET.equals(ayza)) {
            gcg gcg = this.aM;
            if (gcg == null || (gcg.f ^ 1) == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final void as() {
        if (this.ak.f()) {
            this.aP.setVisibility(0);
        } else {
            this.aP.setVisibility(8);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        if (bundle != null) {
            this.a = bundle.getInt("VIDEO_TIME_LIMIT_MSECS");
            this.ax = bundle.getBoolean("MIRROR_FRONT_CAMERA");
            this.ay = bundle.getInt("START_CAMERA_SELECTION");
            bundle.getBoolean("SWIPE_TO_CAMERA_ENABLED");
            byte[] byteArray = bundle.getByteArray("COMMENT_STICKER_RENDERER_KEY");
            if (byteArray != null) {
                try {
                    this.az = (aqcl) anxl.parseFrom(aqcl.e, byteArray, anxa.c());
                } catch (anyg e) {
                    xtl.a("Error parsing comment sticker renderer.", e);
                }
            }
            byte[] byteArray2 = bundle.getByteArray("navigation_endpoint");
            if (byteArray2 != null) {
                try {
                    this.ba = (apxu) anxl.parseFrom(apxu.d, byteArray2, anxa.c());
                } catch (anyg unused) {
                }
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aoqz aoqz;
        CountDownTimer countDownTimer;
        r3 = new Object[2];
        boolean z = false;
        r3[0] = this.y;
        r3[1] = p();
        ((gce) xtx.a(gce.class, r3)).l().a(this);
        arvt arvt = null;
        this.Z.a(acwl.t, this.ba, null);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.reel_camera_fragment_v2, viewGroup, false);
        this.ar = zha.a(p());
        this.aU = (CameraFocusOverlay) viewGroup2.findViewById(R.id.reel_camera_focus_overlay);
        this.ak = (CameraView) viewGroup2.findViewById(R.id.reel_camera_view);
        this.ak.a(this);
        this.ak.setOnTouchListener(new gfh(p(), this, this.ak));
        CameraView cameraView = this.ak;
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
        cameraView = this.ak;
        cameraView.t = this.ax;
        cameraView.a(5);
        this.ak.b(this.ar);
        this.al = (RecordButtonView) viewGroup2.findViewById(R.id.record_button_view);
        azaa azaa = this.ae.a.b().s;
        if (azaa == null) {
            azaa = azaa.j;
        }
        if (azaa.h) {
            this.am = new geo(this, this.al);
            this.al.setOnTouchListener(this.am);
        } else {
            this.an = new geq(M_(), this, this.al);
            this.al.setOnTouchListener(this.an);
        }
        this.al.findViewById(R.id.reel_camera_record_button_touch_area).setContentDescription(a((int) R.string.reel_camera_take_photo_or_record_video_button));
        this.aD = (ImageView) viewGroup2.findViewById(R.id.reel_camera_effects_button);
        this.aE = (ImageView) viewGroup2.findViewById(R.id.reel_camera_presets_button);
        this.aG = (ChooseFilterView) viewGroup2.findViewById(R.id.choose_filter_view);
        this.aH = (ChooseFilterView) viewGroup2.findViewById(R.id.choose_preset_view);
        this.aN = (ImageView) viewGroup2.findViewById(R.id.reel_camera_flashlight_on_off);
        this.aO = new gbq(p(), this.ak, this.aN, this.Z);
        this.aP = (ImageView) viewGroup2.findViewById(R.id.reel_switch_camera_button);
        this.aQ = new zio(p(), this.ak, this.aP, this.Z, null);
        as();
        this.ap = (ProgressBar) viewGroup2.findViewById(R.id.reel_camera_circle_time_limit_progress_bar);
        if (this.a <= 0) {
            this.ap.setVisibility(8);
        }
        int i = this.a;
        if (i > 0) {
            if (this.aA == null) {
                this.aA = new gca(this, (long) i);
            }
            countDownTimer = this.aA;
        } else {
            countDownTimer = null;
        }
        this.aA = countDownTimer;
        this.aq = (ImageView) viewGroup2.findViewById(R.id.reel_camera_gallery_button);
        this.aq.setOnClickListener(this);
        this.aR = viewGroup2.findViewById(R.id.reel_camera_header);
        this.aS = viewGroup2.findViewById(R.id.reel_camera_bottom_bar);
        this.aT = (ImageView) viewGroup2.findViewById(R.id.reel_camera_close);
        this.aT.setOnClickListener(this);
        this.Z.b(acwc.UPLOAD_VIDEO_CAMERA_RECORD_BUTTON, null);
        if (this.aP.getVisibility() == 0) {
            this.Z.b(acwc.UPLOAD_VIDEO_CAMERA_SWITCH_BUTTON, null);
        }
        this.Z.b(acwc.UPLOAD_VIDEO_FLASH_TOGGLE, null);
        this.Z.b(acwc.MOBILE_BACK_BUTTON, null);
        this.Z.b(acwc.SWIPE_TO_CAMERA_ENGAGED_ACTION, null);
        this.Z.b(acwc.SWIPE_TO_CAMERA_CANCELLED_ACTION, null);
        this.Z.a(acwc.UPLOAD_VIDEO_CAMERA_STOP_BUTTON, null);
        new gcd().execute(new gbt[]{this});
        this.as = (ImageView) viewGroup2.findViewById(R.id.reel_gallery_back);
        this.as.setOnClickListener(this);
        this.at = (LinearLayout) viewGroup2.findViewById(R.id.reel_gallery_header);
        this.au = (FrameLayout) viewGroup2.findViewById(R.id.reel_media_grid_fragment_container);
        this.av = (FrameLayout) viewGroup2.findViewById(R.id.reel_camera_view_container);
        Display defaultDisplay = ((WindowManager) M_().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        i = point.y;
        this.aY = i;
        this.au.setTranslationY((float) i);
        this.at.setVisibility(8);
        this.au.setVisibility(8);
        this.aF = (ViewGroup) viewGroup2.findViewById(R.id.comment_sticker_panel);
        Object obj = this.az;
        if (obj != null) {
            ghd ghd = this.ac;
            Object obj2 = this.aF;
            Object gbw = new gbw(this);
            ghd.f = (ViewGroup) amqw.a(obj2);
            ghd.g = (ghi) amqw.a(gbw);
            amqw.a(obj);
            baba baba = (baba) babb.g.createBuilder();
            arml arml = obj.d;
            if (arml == null) {
                arml = arml.f;
            }
            String obj3 = ajqy.a(arml).toString();
            baba.copyOnWrite();
            babb babb = (babb) baba.instance;
            if (obj3 != null) {
                babb.a |= 4;
                babb.d = obj3;
                arml = obj.c;
                if (arml == null) {
                    arml = arml.f;
                }
                obj3 = ajqy.a(arml).toString();
                baba.copyOnWrite();
                babb = (babb) baba.instance;
                if (obj3 != null) {
                    babb.a = 2 | babb.a;
                    babb.c = obj3;
                    aygk aygk = obj.b;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    String uri = aklb.e(aygk).toString();
                    baba.copyOnWrite();
                    babb babb2 = (babb) baba.instance;
                    if (uri != null) {
                        babb2.a = 8 | babb2.a;
                        babb2.e = uri;
                        ArrayList<babe> arrayList = new ArrayList();
                        arrayList.add(babe.COMMENT_NORMAL);
                        if (ghd.c.a()) {
                            arrayList.add(babe.COMMENT_LIGHT);
                        }
                        babf babf = (babf) babd.e.createBuilder();
                        babf.copyOnWrite();
                        babd babd = (babd) babf.instance;
                        if (!babd.c.a()) {
                            babd.c = anxl.mutableCopy(babd.c);
                        }
                        for (babe babe : arrayList) {
                            babd.c.d(babe.d);
                        }
                        babf.a(ghd.l);
                        baba.a(babf);
                        bacy bacy = (bacy) bacz.g.createBuilder();
                        bacw bacw = (bacw) bacx.e.createBuilder();
                        bacw.a(baba);
                        bacy.a(bacw);
                        ghd.h = (bacz) ((anxl) bacy.build());
                        ghd.a(ghd.l);
                        ghd.j = obj2.findViewById(R.id.comment_sticker_panel_warning_background);
                        ghd.k = obj2.findViewById(R.id.comment_sticker_panel_warning_text);
                        ((ViewGroup) obj2.findViewById(R.id.comment_sticker_container)).addView(ghd.i);
                        ghd.i.setOnTouchListener(ghd);
                        bacx bacx = ghd.h.d;
                        if (bacx == null) {
                            bacx = bacx.e;
                        }
                        ghd.a.a((ImageView) ghd.i.findViewById(R.id.author_avatar), xvt.d((bacx.b == 4 ? (babb) bacx.c : babb.g).e), ghd.d);
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        this.aJ = new gbr(this.aD, this.Z, acwc.UPLOAD_VIDEO_EDITING_VIDEO_EFFECTS_BUTTON);
        this.aK = new gbr(this.aE, this.Z, acwc.REELS_CAMERA_PRESETS_BUTTON);
        this.aI = viewGroup2.findViewById(R.id.effect_pending_indicator);
        this.aL = new gbi(this.aG, this.aH, this.aB, this.aS, this.al, this.aF.findViewById(R.id.comment_sticker_container), this.aD, this.aE, this.aI, this.Z);
        zzl zzl = this.aa;
        arvt b = zzl != null ? zzl.b() : null;
        if (b != null) {
            ayva ayva = b.j;
            if (ayva == null) {
                ayva = ayva.m;
            }
            if (!(!ayva.l || this.aD == null || this.aG == null)) {
                CameraView cameraView2 = this.ak;
                cameraView2.e = true;
                zmm zmm = this.aB;
                synchronized (cameraView2.h) {
                    cameraView2.i = zmm;
                    zld zld = cameraView2.j;
                    if (zld != null) {
                        zld.a(zmm);
                    }
                }
                this.aD.setOnClickListener(this);
                this.aG.a(this.aB.a(ayza.EFFECT_SUBPACKAGE_ID_EXPRESSIVE));
                this.aG.a(this.aJ);
                ImageView imageView = this.aE;
                if (!(imageView == null || this.aH == null)) {
                    imageView.setOnClickListener(this);
                    zng a2 = this.aB.a(ayza.EFFECT_SUBPACKAGE_ID_PRESET);
                    this.aH.a(a2);
                    this.aH.a(this.aK);
                    SharedPreferences sharedPreferences = this.ad;
                    zzl zzl2 = this.aa;
                    if (zzl2 != null) {
                        arvt = zzl2.b();
                    }
                    if (arvt != null) {
                        azaa azaa2 = arvt.s;
                        if (azaa2 == null) {
                            azaa2 = azaa.j;
                        }
                        if (azaa2.d) {
                            z = true;
                        }
                    }
                    gcg gcg = new gcg(a2, sharedPreferences, z);
                    this.V.a(gcg);
                    gcg.getClass();
                    a2.a(new gcj(gcg));
                    gcg.getClass();
                    a2.a(new gci(gcg));
                    this.aM = gcg;
                }
            }
        }
        Object obj4 = this.av;
        amqw.a(obj4);
        if (xrn.c(obj4.getContext())) {
            xrn.a(obj4.getContext(), obj4, obj4.getContext().getString(R.string.accessibility_stories_camera_page));
        }
        return viewGroup2;
    }

    public final void i() {
        this.aO.a();
        super.i();
    }

    private final ViewPropertyAnimator f(boolean z) {
        this.aR.animate().cancel();
        return this.aR.animate().translationY(!z ? -q().getDimension(R.dimen.reel_camera_time_limit_progress_bar_header_layout_height) : 0.0f).setDuration(250);
    }

    public final void ad_() {
        super.ad_();
        if (this.ak.a()) {
            zin aq = aq();
            gcc gcc = this.b;
            if (gcc != null) {
                gcc.a(aq);
            }
            f(true).start();
            this.aR.setVisibility(0);
            this.aT.setEnabled(true);
            this.aN.setEnabled(true);
            if (!this.af) {
                this.aq.setVisibility(0);
            }
            this.aN.setVisibility(0);
            this.aJ.a();
            this.aK.a();
            this.ai = true;
            RecordButtonView recordButtonView = this.al;
            recordButtonView.clearAnimation();
            recordButtonView.setContentDescription(recordButtonView.getResources().getString(R.string.reel_camera_start_record));
            LayoutParams layoutParams = recordButtonView.a.getLayoutParams();
            layoutParams.width = (int) recordButtonView.getResources().getDimension(R.dimen.reel_camera_record_button_layout_width_v2);
            layoutParams.height = (int) recordButtonView.getResources().getDimension(R.dimen.reel_camera_record_button_layout_height_v2);
            recordButtonView.a.setLayoutParams(layoutParams);
            layoutParams = recordButtonView.c.getLayoutParams();
            layoutParams.width = (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_width);
            layoutParams.height = (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height);
            recordButtonView.c.setLayoutParams(layoutParams);
            gbj.a(recordButtonView.a.getBackground(), 0);
            gbj.a(recordButtonView.c.getProgressDrawable(), 0);
            gbi gbi = this.aL;
            gbi.s = false;
            if (gbi.a()) {
                gbi.a(false);
            } else if (gbi.a) {
                gbi.f.setTranslationY(0.0f);
                gbi.h.setTranslationY(0.0f);
                gbi.g.setTranslationY(0.0f);
            }
            View view = gbi.l;
            if (view != null) {
                ChooseFilterView chooseFilterView = gbi.d;
                if (chooseFilterView != null) {
                    chooseFilterView.a(view);
                }
                ChooseFilterView chooseFilterView2 = gbi.e;
                if (chooseFilterView2 != null) {
                    chooseFilterView2.a(gbi.l);
                }
            }
            as();
            aj();
            if (this.a > 0) {
                CountDownTimer countDownTimer = this.aA;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                ProgressBar progressBar = this.ap;
                if (progressBar != null) {
                    progressBar.setProgress(0);
                }
            }
        }
        this.ak.m();
    }

    public final void B() {
        super.B();
        int i = this.ay;
        if (i == 0) {
            this.ak.n();
        } else if (i == 1) {
            this.ak.c(1);
        } else if (i == 2) {
            this.ak.c(0);
        } else {
            throw new AssertionError(i);
        }
        this.ay = 0;
        Bundle bundle = this.j;
        if (bundle != null) {
            bundle.putInt("START_CAMERA_SELECTION", 0);
        }
    }

    public final void onClick(View view) {
        if (view == this.aT) {
            this.Z.a(3, new acvs(acwc.MOBILE_BACK_BUTTON), null);
            this.aL.a(false);
            ak();
        } else if (view == this.aq) {
            nt s = s();
            String str = "MEDIA_GRID_FRAGMENT_TAG";
            this.aV = (zpo) s.a(str);
            if (this.aV == null) {
                this.aV = zpo.a(3, true);
                s.a().a(R.id.reel_media_grid_fragment_container, this.aV, str).a();
                s.b();
            }
            this.aV.c = this.b;
            a(true);
        } else if (view == this.as) {
            a(false);
        } else {
            View view2 = this.aD;
            ChooseFilterView chooseFilterView;
            if (view2 != null && view == view2) {
                chooseFilterView = this.aG;
                if (chooseFilterView == null || chooseFilterView.f) {
                    this.aL.a(false);
                    return;
                } else {
                    this.aL.a(ayza.EFFECT_SUBPACKAGE_ID_EXPRESSIVE);
                    return;
                }
            }
            view2 = this.aE;
            if (view2 != null && view == view2) {
                chooseFilterView = this.aH;
                if (chooseFilterView == null || chooseFilterView.f) {
                    this.aL.a(false);
                } else {
                    this.aL.a(ayza.EFFECT_SUBPACKAGE_ID_PRESET);
                }
            }
        }
    }

    public final void ai() {
        WindowManager.LayoutParams attributes = p().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        p().getWindow().setAttributes(attributes);
    }

    public final void aj() {
        nn p = p();
        if (p != null) {
            WindowManager.LayoutParams attributes = p.getWindow().getAttributes();
            attributes.screenBrightness = -1.0f;
            p.getWindow().setAttributes(attributes);
        }
    }

    public final void a(boolean z) {
        ObjectAnimator objectAnimator = this.aW;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.aW.end();
        }
        objectAnimator = this.aX;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.aX.end();
        }
        LinearLayout linearLayout = this.at;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        float f = 0.0f;
        fArr[0] = !z ? 0.0f : 1.0f;
        this.aW = ObjectAnimator.ofFloat(linearLayout, property, fArr).setDuration(250);
        this.aW.addListener(new gcb(this, z));
        FrameLayout frameLayout = this.au;
        property = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            f = (float) this.aY;
        }
        fArr2[0] = f;
        this.aX = ObjectAnimator.ofFloat(frameLayout, property, fArr2).setDuration(250);
        this.aW.start();
        this.aX.start();
    }

    public final void ak() {
        if (this.at.getVisibility() == 0) {
            a(false);
        } else if (this.aL.a()) {
            this.aL.a(false);
        } else {
            gcc gcc = this.b;
            if (gcc != null) {
                gcc.b();
                ap();
            }
        }
    }

    public final boolean al() {
        return this.au.getVisibility() == 0;
    }

    public final acvx t() {
        return this.Z;
    }

    public final void c(float f) {
        this.ak.a(f);
    }

    public final void a(float f, float f2) {
        CameraView cameraView = this.ak;
        CameraFocusOverlay cameraFocusOverlay = this.aU;
        cameraFocusOverlay.getClass();
        cameraView.a(f, f2, new gbz(cameraFocusOverlay));
    }

    public final void am() {
        this.aQ.a();
    }

    public final void an() {
        if (!this.ak.a()) {
            float f = this.ah;
            if (f <= 0.0f || f >= 1.0f) {
                this.aL.a(ayza.EFFECT_SUBPACKAGE_ID_EXPRESSIVE);
            }
        }
    }

    public final void d(int i) {
        if (i == 4) {
            this.aL.a(this.ak.a());
        }
    }

    static Bitmap b(String str) {
        return ThumbnailUtils.createVideoThumbnail(str, 3);
    }

    static Bitmap a(File file) {
        return ThumbnailUtils.extractThumbnail(ziy.a(file.getAbsolutePath(), 96, 170), 96, 96, 2);
    }

    /* Access modifiers changed, original: final */
    public final zjj ao() {
        return gbt.b(p());
    }

    public static zjj b(Context context) {
        return new zjj(context, 2, "reels", aw, new xvf());
    }
}
