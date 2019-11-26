package defpackage;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.gallery.GalleryNestedScrollView;
import com.google.android.youtube.R;
import java.io.File;

/* renamed from: zpi */
public final class zpi extends nf implements adh, OnClickListener, zpp, zpt {
    private static final int[] ae = new int[]{R.attr.actionBarSize};
    public acxj Z;
    public View a;
    public xci aa;
    public boolean ab = true;
    public boolean ac = false;
    public atst ad = null;
    private FrameLayout af;
    private FrameLayout ag;
    private FrameLayout ah;
    private zgu ai;
    private GalleryNestedScrollView aj;
    private SharedPreferences ak;
    private Uri al;
    private Class am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private ValueAnimator as;
    private boolean at = true;
    private boolean au = false;
    private boolean av = false;
    private boolean aw = false;
    private final AnimatorUpdateListener ax = new zpk(this);
    private final AnimatorListener ay = new zpj(this);
    public ImageView b;
    public zpn c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((zpl) xse.a(p())).c().a(this);
        if (bundle != null) {
            this.al = (Uri) bundle.getParcelable("camera_file_uri");
            b(bundle.getString("secondary_action_class_name"));
        }
        this.an = q().getDimensionPixelSize(R.dimen.gallery_camera_minimized_height);
        this.ap = q().getDimensionPixelSize(R.dimen.gallery_camera_chevron_icon_size);
        this.ar = q().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
        this.aq = q().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
    }

    /* JADX WARNING: Missing block: B:24:0x0089, code skipped:
            if (r3 != 0) goto L_0x008e;
     */
    public final android.view.View a(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
        r11 = this;
        r14 = r11.p();
        r0 = r14.getApplication();
        r1 = r0 instanceof defpackage.wwz;
        r2 = 0;
        if (r1 == 0) goto L_0x001a;
    L_0x000d:
        r0 = (defpackage.wwz) r0;
        r0 = r0.i();
        r0 = r0.ox();
        r11.ak = r0;
        goto L_0x0020;
    L_0x001a:
        r0 = r14.getPreferences(r2);
        r11.ak = r0;
    L_0x0020:
        r0 = r14 instanceof com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
        r1 = 1;
        if (r0 == 0) goto L_0x0091;
    L_0x0025:
        r0 = r14;
        r0 = (com.google.android.libraries.youtube.edit.gallery.GalleryActivity) r0;
        r0 = r0.l();
        if (r0 == 0) goto L_0x0091;
    L_0x002e:
        r3 = com.google.protos.youtube.api.innertube.CameraEndpointOuterClass.cameraEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r4 = r0.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0091;
    L_0x0042:
        r3 = com.google.protos.youtube.api.innertube.CameraEndpointOuterClass.cameraEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r0 = r0.h;
        r4 = r3.d;
        r0 = r0.b(r4);
        if (r0 != 0) goto L_0x0058;
    L_0x0055:
        r0 = r3.b;
        goto L_0x005c;
    L_0x0058:
        r0 = r3.a(r0);
    L_0x005c:
        r0 = (defpackage.apir) r0;
        r3 = r0.a;
        r3 = r3 & 4;
        if (r3 != 0) goto L_0x0091;
    L_0x0064:
        r0 = r0.b;
        if (r0 == 0) goto L_0x008e;
    L_0x0068:
        r0 = r11.am;
        if (r0 == 0) goto L_0x008e;
    L_0x006c:
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 23;
        if (r0 >= r3) goto L_0x008c;
    L_0x0072:
        r0 = r11.M_();
        r3 = "android.permission.CAMERA";
        r0 = defpackage.rn.b(r0, r3);
        r3 = r11.M_();
        r4 = "android.permission.RECORD_AUDIO";
        r3 = defpackage.rn.b(r3, r4);
        if (r0 == 0) goto L_0x0089;
    L_0x0088:
        goto L_0x008e;
    L_0x0089:
        if (r3 == 0) goto L_0x008c;
    L_0x008b:
        goto L_0x008e;
    L_0x008c:
        r0 = 1;
        goto L_0x008f;
    L_0x008e:
        r0 = 0;
    L_0x008f:
        r11.av = r0;
    L_0x0091:
        r11.X();
        r0 = 2131034630; // 0x7f050206 float:1.7679783E38 double:1.052871001E-314;
        r12 = r12.inflate(r0, r13, r2);
        r13 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r12.setBackgroundColor(r13);
        r13 = r11.s();
        r0 = "mediaGridFragment";
        r3 = r13.a(r0);
        r3 = (defpackage.zpo) r3;
        r4 = 2131756816; // 0x7f100710 float:1.914455E38 double:1.053227808E-314;
        if (r3 != 0) goto L_0x00c0;
    L_0x00b1:
        r3 = defpackage.zpo.d(r2);
        r5 = r13.a();
        r0 = r5.a(r4, r3, r0);
        r0.a();
    L_0x00c0:
        r3.c = r11;
        r0 = "cameraFragment";
        r3 = r13.a(r0);
        r3 = (defpackage.zgu) r3;
        r11.ai = r3;
        r3 = r11.ai;
        r5 = 2131755758; // 0x7f1002ee float:1.9142404E38 double:1.0532272854E-314;
        if (r3 != 0) goto L_0x00e7;
    L_0x00d3:
        r3 = new zgu;
        r3.<init>();
        r11.ai = r3;
        r13 = r13.a();
        r3 = r11.ai;
        r13 = r13.a(r5, r3, r0);
        r13.a();
    L_0x00e7:
        r13 = 2131756814; // 0x7f10070e float:1.9144546E38 double:1.053227807E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.FrameLayout) r13;
        r11.af = r13;
        r13 = 2131756815; // 0x7f10070f float:1.9144548E38 double:1.0532278076E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.FrameLayout) r13;
        r11.ag = r13;
        r13 = 2131755603; // 0x7f100253 float:1.914209E38 double:1.053227209E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.FrameLayout) r13;
        r11.ah = r13;
        r13 = 2131756812; // 0x7f10070c float:1.9144542E38 double:1.053227806E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.ImageView) r13;
        r11.b = r13;
        r13 = 2131756809; // 0x7f100709 float:1.9144536E38 double:1.0532278046E-314;
        r13 = r12.findViewById(r13);
        r13 = (com.google.android.libraries.youtube.edit.gallery.GalleryNestedScrollView) r13;
        r11.aj = r13;
        r13 = r12.findViewById(r5);
        r13 = (android.widget.FrameLayout) r13;
        r0 = r12.findViewById(r4);
        r0 = (android.widget.FrameLayout) r0;
        r3 = 2131756811; // 0x7f10070b float:1.914454E38 double:1.0532278056E-314;
        r3 = r12.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        r4 = 2131756813; // 0x7f10070d float:1.9144544E38 double:1.0532278066E-314;
        r4 = r12.findViewById(r4);
        r4 = (android.widget.LinearLayout) r4;
        r5 = r11.av;
        if (r5 != 0) goto L_0x0150;
    L_0x0140:
        r5 = r11.ah;
        r6 = r11.q();
        r7 = 2131952399; // 0x7f13030f float:1.954124E38 double:1.053324439E-314;
        r6 = r6.getString(r7);
        r5.setContentDescription(r6);
    L_0x0150:
        r5 = r11.av;
        if (r5 != 0) goto L_0x0155;
    L_0x0154:
        goto L_0x0156;
    L_0x0155:
        r3 = r4;
    L_0x0156:
        r11.a = r3;
        r3 = r11.at;
        if (r3 == 0) goto L_0x0161;
    L_0x015c:
        r3 = r11.a;
        r3.setVisibility(r2);
    L_0x0161:
        r3 = r11.ah;
        r3.setOnClickListener(r11);
        r3 = r11.af;
        r3.setOnClickListener(r11);
        r3 = r11.ag;
        r3.setOnClickListener(r11);
        r3 = new android.graphics.Point;
        r3.<init>();
        r14 = r14.getWindowManager();
        r14 = r14.getDefaultDisplay();
        r14.getSize(r3);
        r14 = 2131755541; // 0x7f100215 float:1.9141964E38 double:1.053227178E-314;
        r14 = r12.findViewById(r14);
        r14 = (android.support.v7.widget.Toolbar) r14;
        r4 = new zph;
        r4.<init>(r11);
        r14.a(r4);
        r14 = r11.p();
        r14 = r14.getTheme();
        r4 = ae;
        r14 = r14.obtainStyledAttributes(r4);
        r4 = 0;
        r4 = r14.getDimension(r2, r4);
        r4 = (int) r4;
        r14.recycle();
        r14 = r11.q();
        r5 = "status_bar_height";
        r6 = "dimen";
        r7 = "android";
        r14 = r14.getIdentifier(r5, r6, r7);
        if (r14 <= 0) goto L_0x01c1;
    L_0x01b8:
        r5 = r11.q();
        r14 = r5.getDimensionPixelSize(r14);
        goto L_0x01c2;
    L_0x01c1:
        r14 = 0;
    L_0x01c2:
        r4 = r4 + r14;
        r14 = r3.x;
        r5 = r3.x;
        r6 = r11.ar;
        r5 = r5 / r6;
        r5 = java.lang.Math.max(r1, r5);
        r14 = r14 / r5;
        r5 = r11.aq;
        r14 = r14 - r5;
        r5 = r11.av;
        if (r5 == 0) goto L_0x01eb;
    L_0x01d6:
        r5 = r3.x;
        r6 = r11.aq;
        r5 = r5 - r6;
        r5 = r5 / 2;
        r5 = (double) r5;
        r7 = (double) r14;
        r9 = 4609434218613702656; // 0x3ff8000000000000 float:0.0 double:1.5;
        java.lang.Double.isNaN(r7);
        r7 = r7 * r9;
        r5 = java.lang.Math.min(r5, r7);
        r14 = (int) r5;
    L_0x01eb:
        r5 = r11.ah;
        r5 = r5.getLayoutParams();
        r5.height = r14;
        r6 = r11.ah;
        r6.setLayoutParams(r5);
        r5 = r11.an;
        r14 = r14 - r5;
        r11.ao = r14;
        r14 = r13.getLayoutParams();
        r5 = r3.y;
        r14.height = r5;
        r13.setLayoutParams(r14);
        r13 = r11.an;
        r14 = r11.ap;
        r13 = r13 - r14;
        r13 = java.lang.Math.max(r2, r13);
        r14 = r11.b;
        r14 = r14.getLayoutParams();
        r14 = (android.widget.FrameLayout.LayoutParams) r14;
        r13 = r13 / 2;
        r14.bottomMargin = r13;
        r13 = r11.b;
        r13.setLayoutParams(r14);
        r13 = r0.getLayoutParams();
        r14 = r3.y;
        r14 = r14 - r4;
        r2 = r11.an;
        r14 = r14 - r2;
        r13.height = r14;
        r0.setLayoutParams(r13);
        r13 = r11.aj;
        r14 = r11.ao;
        r13.c = r14;
        r13.b = r11;
        r13.a = r11;
        r11.aw = r1;
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpi.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    private final void X() {
        this.Z.a(acwl.aA, null, this.ad);
        this.Z.b(acwc.UPLOAD_VIDEO_SELECTION_CANCEL_BUTTON, this.ad);
        this.Z.b(acwc.UPLOAD_VIDEO_SELECTION_CAMERA_BUTTON, this.ad);
        this.Z.b(acwc.UPLOAD_VIDEO_SELECTION_VIDEO_THUMBNAIL, this.ad);
        if (this.av) {
            this.Z.b(acwc.MOBILE_LIVE_GO_LIVE_BUTTON, this.ad);
        }
    }

    public final void B() {
        super.B();
        this.ab = false;
    }

    public final void ad_() {
        super.ad_();
        this.ab = true;
        this.aw = false;
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("camera_file_uri", this.al);
        Class cls = this.am;
        if (cls != null) {
            bundle.putString("secondary_action_class_name", cls.getCanonicalName());
        }
    }

    public final void a(int i, int i2, Intent intent) {
        if (i == 1) {
            nn p = p();
            Uri uri = this.al;
            this.al = null;
            this.aa.c(new zjl());
            if (i2 != -1) {
                if (i2 == 0) {
                    if (!this.aw) {
                        X();
                        return;
                    }
                }
            } else if (uri != null) {
                if (!new File(uri.getPath()).exists()) {
                    xtl.e("File does not exist at original Uri.");
                    if (intent == null || intent.getData() == null) {
                        Toast.makeText(p, q().getString(R.string.gallery_camera_capture_error), 1).show();
                        xtl.d("File for original URI doesn't exist and intent didn't return a data Uri.");
                        return;
                    }
                    xtl.e("Using Camera intent's Uri.");
                    uri = intent.getData();
                }
                p.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                zpn zpn = this.c;
                if (zpn != null) {
                    zpn.a(zqb.a(uri, M_()), true);
                    return;
                }
            }
            Toast.makeText(p, q().getString(R.string.gallery_camera_capture_error), 1).show();
            xtl.d("Error while capturing video.");
        } else if (i == 2 && i2 == 0 && !this.aw) {
            X();
        }
    }

    public final void f() {
        this.Z.a(3, new acvs(acwc.UPLOAD_VIDEO_SELECTION_CANCEL_BUTTON), this.ad);
        zpn zpn = this.c;
        if (zpn != null) {
            zpn.q();
        }
    }

    public final void b(String str) {
        this.am = null;
        if (str != null) {
            try {
                this.am = Class.forName(str);
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    private final void Y() {
        if (this.au) {
            this.au = false;
            nn p = p();
            if (p != null && xrn.c(p)) {
                Toast.makeText(p, q().getString(!ab() ? R.string.gallery_camera_launch_button_minimized_event : R.string.gallery_camera_launch_button_expanded_event), 0).show();
            }
        }
    }

    private final void Z() {
        String valueOf;
        String str;
        nn p = p();
        this.ai.f();
        if (this.ac) {
            zpn zpn = this.c;
            if (zpn != null) {
                zpn.p();
            }
            return;
        }
        this.Z.a(acwl.au, null, this.ad);
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        try {
            this.al = zqb.a(M_());
            Uri a = zqb.a(this.al, M_());
            if (xy.a()) {
                intent.setClipData(ClipData.newUri(M_().getContentResolver(), "videos", a));
                intent.setFlags(3);
            }
            intent.putExtra("output", a);
            intent.putExtra("android.intent.extra.videoQuality", 1);
            this.aa.c(new zjm());
            try {
                startActivityForResult(intent, 1);
            } catch (ActivityNotFoundException e) {
                this.al = null;
                valueOf = String.valueOf(e.toString());
                str = "Error occurred while trying to open an activity to handle the ACTION_VIDEO_CAPTURE intent:\n";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                xtl.c(valueOf);
                Toast.makeText(p, q().getString(R.string.camera_not_found), 1).show();
            }
        } catch (RuntimeException e2) {
            valueOf = String.valueOf(e2.toString());
            str = "Error occurred while generating the camera file Uri:\n";
            xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            Toast.makeText(p, q().getString(R.string.gallery_camera_open_error), 1).show();
        }
    }

    private final void aa() {
        amqw.a(this.am);
        this.ai.f();
        Intent intent = new Intent(M_(), this.am);
        intent.addFlags(536870912);
        intent.putExtra("INTENT_EXTRA_REFERRER_NAME", "REFERRER_NAME_GALLERY_FRAGMENT");
        acxj acxj = this.Z;
        acwc acwc = acwc.MOBILE_LIVE_GO_LIVE_BUTTON;
        Bundle bundle = acxj.h.a;
        if (!(bundle == null || acwc == null)) {
            bundle.putInt("tracking_interaction_parent_ve", acwc.dU);
        }
        this.aa.c(new zjm());
        try {
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(p(), q().getString(R.string.common_error_generic), 1).show();
        }
    }

    private final boolean ab() {
        return this.aj.getScrollY() <= this.ao / 2;
    }

    private final void ac() {
        ValueAnimator valueAnimator = this.as;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.as.cancel();
        }
    }

    private final ValueAnimator a(float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(125);
        ofFloat.addUpdateListener(this.ax);
        ofFloat.addListener(this.ay);
        ofFloat.start();
        return ofFloat;
    }

    public final void a(zix zix) {
        if (!this.ab) {
            this.Z.a(3, new acvs(acwc.UPLOAD_VIDEO_SELECTION_VIDEO_THUMBNAIL), this.ad);
            Uri b = zix.b();
            zpn zpn = this.c;
            if (zpn != null && b != null) {
                zpn.a(b, false);
            }
        }
    }

    public final void onClick(View view) {
        if (!this.ab) {
            if (ab()) {
                if (view == this.ah || view == this.af) {
                    this.Z.a(3, new acvs(acwc.UPLOAD_VIDEO_SELECTION_CAMERA_BUTTON), this.ad);
                    if (VERSION.SDK_INT < 23) {
                        Z();
                    } else {
                        a(false);
                    }
                } else if (view == this.ag) {
                    if (VERSION.SDK_INT < 23) {
                        aa();
                    } else {
                        a(true);
                    }
                }
            } else if (view == this.ah) {
                this.aj.b();
                Y();
            }
        }
    }

    private final void a(boolean z) {
        String[] strArr;
        int i;
        Context p = p();
        String str = "android.permission.CAMERA";
        if (z || this.ac) {
            String str2 = "android.permission.RECORD_AUDIO";
            if (alai.a(p, 1)) {
                strArr = new String[]{str2};
                i = R.string.gallery_permission_open_settings_microphone_secondary;
            } else {
                String[] strArr2 = new String[]{str, str2};
                i = R.string.gallery_permission_open_settings_camera_secondary;
                strArr = strArr2;
            }
        } else {
            strArr = new String[]{str};
            i = R.string.gallery_permission_open_settings_camera;
        }
        if (alai.a(p, this.ak, strArr)) {
            akzy.d(i).a(this.v, "openSettingsDialog");
        } else {
            f(z);
        }
    }

    private final void f(boolean z) {
        Context p = p();
        int i = 1;
        if (alai.a(p, 1)) {
            if (z || this.ac) {
                if (!alai.a(p, 2)) {
                    i = 2;
                } else if (z) {
                    aa();
                    return;
                }
            }
            Z();
            return;
        }
        this.Z.b(zpi.d(i), this.ad);
        this.Z.b(zpi.e(i), this.ad);
        String[] a = alai.a(i);
        alai.a(this.ak, a);
        if (z) {
            a(a, i + 100);
        } else {
            a(a, i);
        }
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i >= 100) {
            i -= 100;
            z = true;
        } else {
            z = false;
        }
        if (alai.a(iArr)) {
            acwc d = zpi.d(i);
            if (d != null) {
                this.Z.a(3, new acvs(d), this.ad);
            }
            f(z);
        } else {
            acwc e = zpi.e(i);
            if (e != null) {
                this.Z.a(3, new acvs(e), this.ad);
            }
            if (!z) {
                xpr.a(p(), (int) R.string.gallery_permissions_missing_camera, 1);
            } else if (i == 1) {
                xpr.a(p(), (int) R.string.gallery_permissions_missing_camera_secondary, 1);
            } else if (i == 2) {
                xpr.a(p(), (int) R.string.gallery_permissions_missing_microphone_secondary, 1);
            }
        }
    }

    private static acwc d(int i) {
        if (i == 0) {
            return acwc.UPLOAD_VIDEO_APPROVE_STORAGE_BUTTON;
        }
        if (i != 1) {
            return acwc.UPLOAD_VIDEO_APPROVE_MICROPHONE_BUTTON;
        }
        return acwc.UPLOAD_VIDEO_APPROVE_CAMERA_BUTTON;
    }

    private static acwc e(int i) {
        if (i == 0) {
            return acwc.UPLOAD_VIDEO_DENY_STORAGE_BUTTON;
        }
        if (i != 1) {
            return acwc.UPLOAD_VIDEO_DENY_MICROPHONE_BUTTON;
        }
        return acwc.UPLOAD_VIDEO_DENY_CAMERA_BUTTON;
    }

    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        if (ab()) {
            if (!this.at) {
                ac();
                this.as = a(this.a.getAlpha(), 1.0f);
                if (this.av) {
                    this.ah.setContentDescription(null);
                } else {
                    this.ah.setContentDescription(q().getString(R.string.gallery_camera_launch_button_description));
                }
                this.at = true;
                this.au = true;
            }
        } else if (this.at) {
            ac();
            this.as = a(this.a.getAlpha(), 0.0f);
            this.ah.setContentDescription(q().getString(R.string.gallery_camera_launch_button_minimized_description));
            this.at = false;
            this.au = true;
        }
    }

    public final void W() {
        if (ab()) {
            this.aj.b();
        } else {
            this.aj.a(false);
        }
        Y();
    }
}
