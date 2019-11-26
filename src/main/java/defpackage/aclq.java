package defpackage;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiMessageConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.StartStreamEndpointOuterClass$StartStreamEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: aclq */
public final class aclq extends nf implements acdp, acfl, actc, OnClickListener {
    public Executor Z;
    public acvx a;
    private WaitingIndicatorView aA;
    private View aB;
    private TextView aC;
    private TextView aD;
    private View aE;
    private TextView aF;
    private ProgressBar aG;
    private ImageButton aH;
    private TextView aI;
    private TextView aJ;
    private ImageButton aK;
    private Button aL;
    private Button aM;
    private View aN;
    private Button aO;
    private ViewGroup aP;
    private ImageView aQ;
    private TextView aR;
    private ViewGroup aS;
    private ImageView aT;
    private TextView aU;
    private ImageButton aV;
    private Executor aW;
    private anjv aX;
    private anjv aY;
    private boolean aZ;
    public aclh aa;
    public acfe ab;
    public acmf ac;
    public abzv ad;
    public akkq ae;
    public akxn af;
    public acfc ag;
    public abap ah;
    public albv ai;
    public View aj;
    public ImageView ak;
    public TextView al;
    public String am;
    public Bitmap an;
    public Bitmap ao;
    public boolean ap;
    public int aq = 0;
    public String ar;
    public SharedPreferences as;
    private FrameLayout at;
    private RelativeLayout au;
    private NetworkOperationView av;
    private ImageButton aw;
    private ImageButton ax;
    private ImageButton ay;
    private View az;
    public Handler b;
    private int ba;
    private CharSequence bb;
    private auyw bc;
    private apxu bd;
    private boolean be;
    private afsw bf;
    private final Runnable bg = new aclp(this);
    private int bh;
    private boolean bi;
    private int bj = 0;
    public aaas c;

    public static aclq a(auyw auyw, String str, int i, boolean z, int i2) {
        aclq aclq = new aclq();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_GO_LIVE_SCREEN_RENDERER", new ajrb((anze) auyw));
        bundle.putString("ARG_VIDEO_ID", str);
        bundle.putInt("ARG_CAMERA_COUNT", i);
        bundle.putBoolean("ARG_NEEDS_THUMBNAIL", z);
        bundle.putInt("ARG_PORTRAIT_STREAM_COUNT", i2);
        aclq.f(bundle);
        return aclq;
    }

    public final void J_() {
        super.J_();
        this.ac = null;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((acmh) xse.a(p())).a(this);
        this.aW = ankc.a(this.Z);
        this.as = xly.a(p());
        Bundle bundle2 = this.j;
        this.ba = bundle2.getInt("ARG_CAMERA_COUNT");
        this.bh = bundle2.getInt("ARG_PORTRAIT_STREAM_COUNT", 0);
        ajrb ajrb = (ajrb) bundle2.getParcelable("ARG_GO_LIVE_SCREEN_RENDERER");
        if (ajrb != null) {
            this.bc = (auyw) ajrb.a(auyw.y);
        }
        if (!bundle2.getBoolean("ARG_NEEDS_THUMBNAIL", true)) {
            this.aq = 3;
            this.bj = 2;
        }
        this.am = bundle2.getString("ARG_VIDEO_ID");
        if (am() || this.am == null) {
            String str;
            aphg a = aclq.a(this.bc);
            String a2 = aclq.a(a);
            if (a2 != null) {
                str = a2;
            } else {
                anxp anxp = a.n;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    anxp anxp2 = a.n;
                    if (anxp2 == null) {
                        anxp2 = apxu.d;
                    }
                    anxr access$0002 = anxl.checkIsLite(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand);
                    anxp2.a(access$0002);
                    Object b = anxp2.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    OpenDialogCommandOuterClass$OpenDialogCommand openDialogCommandOuterClass$OpenDialogCommand = (OpenDialogCommandOuterClass$OpenDialogCommand) b;
                    if ((1 & openDialogCommandOuterClass$OpenDialogCommand.a) != 0) {
                        anxp anxp3 = openDialogCommandOuterClass$OpenDialogCommand.b;
                        if (anxp3 == null) {
                            anxp3 = axak.a;
                        }
                        access$0002 = anxl.checkIsLite(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                        anxp3.a(access$0002);
                        if (anxp3.h.a(access$0002.d)) {
                            anxp3 = openDialogCommandOuterClass$OpenDialogCommand.b;
                            if (anxp3 == null) {
                                anxp3 = axak.a;
                            }
                            anxr access$0003 = anxl.checkIsLite(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                            anxp3.a(access$0003);
                            Object b2 = anxp3.h.b(access$0003.d);
                            if (b2 == null) {
                                b2 = access$0003.b;
                            } else {
                                b2 = access$0003.a(b2);
                            }
                            avdl avdl = (avdl) b2;
                            if ((avdl.a & 2) != 0) {
                                anxp2 = avdl.c;
                                if (anxp2 == null) {
                                    anxp2 = axak.a;
                                }
                                access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                                anxp2.a(access$0002);
                                if (anxp2.h.a(access$0002.d)) {
                                    anxp3 = avdl.c;
                                    if (anxp3 == null) {
                                        anxp3 = axak.a;
                                    }
                                    access$0003 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                                    anxp3.a(access$0003);
                                    b2 = anxp3.h.b(access$0003.d);
                                    if (b2 == null) {
                                        b2 = access$0003.b;
                                    } else {
                                        b2 = access$0003.a(b2);
                                    }
                                    str = aclq.a((aphg) b2);
                                }
                            }
                        }
                    }
                }
                str = null;
            }
            this.am = str;
        }
        if (bundle2.getBoolean("ARG_RESUME_PREVIOUS_STREAM") && bundle == null) {
            ajrb ajrb2 = (ajrb) bundle2.getParcelable("ARG_NAVIGATION_ENDPOINT");
            if (ajrb2 != null) {
                this.bd = (apxu) ajrb2.a(apxu.d);
            }
            this.aq = bundle2.getInt("ARG_UPLOAD_THUMBNAIL_STATUS", 0);
            this.bj = 2;
            ai();
        } else if (bundle != null) {
            this.am = bundle.getString("STATE_VIDEO_ID");
            ajrb ajrb3 = (ajrb) bundle.getParcelable("SHARE_NAVIGATION_ENDPOINT");
            if (ajrb3 != null) {
                this.bd = (apxu) ajrb3.a(apxu.d);
            }
            this.aq = bundle.getInt("STATE_UPLOAD_THUMBNAIL_STATUS", 0);
            this.bj = bundle.getInt("NETWORK_OPERATION_MODE");
            if (bundle.getBoolean("THUMBNAIL_SAVED")) {
                ai();
            }
            this.ar = bundle.getString("STATE_VIEWERS_WAITING", null);
            this.bi = bundle.getBoolean("STATE_IS_PORTRAIT");
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        acwl acwl;
        acvx acvx = this.a;
        if (this.bc.t) {
            acwl = acwl.S;
        } else {
            acwl = acwl.R;
        }
        acvx.a(acwl, null, null);
        this.at = new FrameLayout(p());
        this.at.addView(a(this.at));
        return this.at;
    }

    public final void B() {
        super.B();
        f();
        Y();
        aclo.b(p());
    }

    public final void f() {
        d(this.aq);
        if (this.bc.t) {
            an();
            ab();
            return;
        }
        aj();
        ag();
    }

    public final void c(String str) {
        this.bb = str;
        ah();
    }

    private static String a(aphg aphg) {
        anxp anxp = aphg.l;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = aphg.l;
            if (anxp2 == null) {
                anxp2 = apxu.d;
            }
            anxr access$0002 = anxl.checkIsLite(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint);
            anxp2.a(access$0002);
            Object b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            StartStreamEndpointOuterClass$StartStreamEndpoint startStreamEndpointOuterClass$StartStreamEndpoint = (StartStreamEndpointOuterClass$StartStreamEndpoint) b;
            if (!TextUtils.isEmpty(startStreamEndpointOuterClass$StartStreamEndpoint.b)) {
                return startStreamEndpointOuterClass$StartStreamEndpoint.b;
            }
        }
        return null;
    }

    private final void ag() {
        if (am() && !TextUtils.isEmpty(this.ar)) {
            this.al.setText(this.ar);
            this.al.setVisibility(0);
        }
    }

    private final void ah() {
        if (this.ax != null && !TextUtils.isEmpty(this.bb)) {
            this.ax.setContentDescription(this.bb);
        }
    }

    private final void ai() {
        this.ap = true;
        this.Z.execute(new acls(this, p()));
    }

    private final void aj() {
        int i = this.bj;
        if (i == 1) {
            this.bj = 1;
            this.av.a(1);
            this.av.setVisibility(0);
            this.au.setVisibility(8);
            acmf acmf = this.ac;
            if (acmf != null) {
                acmf.f(this.bc.t);
            }
        } else if (i != 2) {
            ac();
            X();
            W();
            ad();
        } else {
            an();
            synchronized (this) {
                if (this.ap) {
                    this.az.setVisibility(8);
                } else {
                    if (this.an == null) {
                        i = this.aq;
                        if (i != 1) {
                            if (i != 3) {
                                if (i == 0) {
                                    W();
                                    ak();
                                }
                            }
                        }
                    }
                    if (!this.be || al()) {
                        ab();
                    } else {
                        ap();
                    }
                }
            }
        }
    }

    public final void W() {
        if (this.an == null && !this.aZ) {
            this.aA.a();
            acmf acmf = this.ac;
            if (acmf != null) {
                acmf.b(this.aj);
            }
            this.aZ = true;
        }
    }

    private final void ak() {
        if (!TextUtils.isEmpty(this.am)) {
            WaitingIndicatorView waitingIndicatorView = this.aA;
            if (waitingIndicatorView.h) {
                waitingIndicatorView.c.setVisibility(0);
                waitingIndicatorView.a = new actd(waitingIndicatorView, TimeUnit.SECONDS.toMillis(3) + 300);
                waitingIndicatorView.a.start();
            } else {
                waitingIndicatorView.g = 3;
                waitingIndicatorView.f = true;
                waitingIndicatorView.e = true;
            }
            this.b.postDelayed(new aclr(this), 300);
        }
    }

    public final void ad_() {
        super.ad_();
        this.be = false;
        this.b.removeCallbacks(this.bg);
        X();
    }

    public final void X() {
        this.aA.b();
        this.aZ = false;
    }

    private final boolean al() {
        return q().getConfiguration().orientation == 2;
    }

    private static aphg a(auyw auyw) {
        amqw.a((Object) auyw);
        auyu auyu = auyw.j;
        if (auyu == null) {
            auyu = auyu.c;
        }
        aphg aphg = auyu.b;
        return aphg == null ? aphg.s : aphg;
    }

    private final boolean am() {
        return (this.bc.a & 65536) != 0;
    }

    /* JADX WARNING: Missing block: B:182:0x04e4, code skipped:
            if (r8 != 0) goto L_0x04e8;
     */
    /* JADX WARNING: Missing block: B:206:0x0581, code skipped:
            if (r8 != 0) goto L_0x0585;
     */
    private final android.view.View a(android.view.ViewGroup r11) {
        /*
        r10 = this;
        r0 = r10.p();
        r0 = r0.getLayoutInflater();
        r1 = r10.bc;
        r1 = r1.t;
        if (r1 != 0) goto L_0x0012;
    L_0x000e:
        r1 = 2131034739; // 0x7f050273 float:1.7680004E38 double:1.0528710546E-314;
        goto L_0x0015;
    L_0x0012:
        r1 = 2131034767; // 0x7f05028f float:1.768006E38 double:1.0528710685E-314;
    L_0x0015:
        r2 = 0;
        r11 = r0.inflate(r1, r11, r2);
        r0 = 2131757053; // 0x7f1007fd float:1.914503E38 double:1.053227925E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.RelativeLayout) r0;
        r10.au = r0;
        r0 = 2131757070; // 0x7f10080e float:1.9145065E38 double:1.0532279336E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView) r0;
        r10.av = r0;
        r0 = r10.bc;
        r0 = r0.a;
        r1 = 1;
        r0 = r0 & r1;
        if (r0 != 0) goto L_0x0039;
    L_0x0038:
        goto L_0x0051;
    L_0x0039:
        r0 = 2131757058; // 0x7f100802 float:1.9145041E38 double:1.0532279276E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = r10.bc;
        r3 = r3.b;
        if (r3 != 0) goto L_0x004a;
    L_0x0048:
        r3 = defpackage.arml.f;
    L_0x004a:
        r3 = defpackage.ajqy.a(r3);
        r0.setText(r3);
    L_0x0051:
        r0 = 2131757062; // 0x7f100806 float:1.914505E38 double:1.0532279296E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = r10.bc;
        r3 = r3.t;
        r4 = 2;
        r5 = 8;
        r6 = 0;
        if (r3 != 0) goto L_0x00ce;
    L_0x0064:
        r3 = r10.ao();
        if (r3 != 0) goto L_0x01a2;
    L_0x006a:
        r3 = r10.bc;
        r3 = r3.a;
        r7 = r3 & 8;
        if (r7 != 0) goto L_0x0078;
    L_0x0072:
        r3 = r3 & 4;
        if (r3 != 0) goto L_0x0078;
    L_0x0076:
        goto L_0x01a2;
    L_0x0078:
        r3 = r10.al();
        if (r3 == 0) goto L_0x0087;
    L_0x007e:
        r3 = r10.bc;
        r3 = r3.e;
        if (r3 != 0) goto L_0x008f;
    L_0x0084:
        r3 = defpackage.auyy.d;
        goto L_0x008f;
    L_0x0087:
        r3 = r10.bc;
        r3 = r3.d;
        if (r3 != 0) goto L_0x008f;
    L_0x008d:
        r3 = defpackage.auyy.d;
    L_0x008f:
        if (r3 == 0) goto L_0x01a2;
    L_0x0091:
        r7 = r3.a;
        r7 = r7 & r1;
        if (r7 == 0) goto L_0x00a6;
    L_0x0096:
        r7 = r3.b;
        if (r7 != 0) goto L_0x009c;
    L_0x009a:
        r7 = defpackage.arml.f;
    L_0x009c:
        r7 = defpackage.ajqy.a(r7);
        r0.setText(r7);
        r0.setVisibility(r2);
    L_0x00a6:
        r7 = r3.a;
        r7 = r7 & r4;
        if (r7 == 0) goto L_0x01a2;
    L_0x00ab:
        r7 = r10.aa;
        r3 = r3.c;
        if (r3 != 0) goto L_0x00b3;
    L_0x00b1:
        r3 = defpackage.arwf.c;
    L_0x00b3:
        r3 = r3.b;
        r3 = defpackage.arwh.a(r3);
        if (r3 != 0) goto L_0x00bd;
    L_0x00bb:
        r3 = defpackage.arwh.UNKNOWN;
    L_0x00bd:
        r3 = r7.a(r3);
        r7 = r10.p();
        r3 = defpackage.ra.a(r7, r3);
        r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r6, r6, r6);
        goto L_0x01a2;
    L_0x00ce:
        r0.setVisibility(r5);
        r0 = 2131757221; // 0x7f1008a5 float:1.9145372E38 double:1.053228008E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.view.ViewStub) r0;
        r0 = r0.inflate();
        r0.setVisibility(r2);
        r3 = 2131757142; // 0x7f100856 float:1.9145211E38 double:1.053227969E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.view.ViewGroup) r3;
        r10.aP = r3;
        r3 = 2131757143; // 0x7f100857 float:1.9145213E38 double:1.0532279696E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.view.ViewGroup) r3;
        r10.aS = r3;
        r3 = 2131757144; // 0x7f100858 float:1.9145215E38 double:1.05322797E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        r10.aQ = r3;
        r3 = 2131757146; // 0x7f10085a float:1.914522E38 double:1.053227971E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        r10.aT = r3;
        r3 = 2131757145; // 0x7f100859 float:1.9145217E38 double:1.0532279706E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r10.aR = r3;
        r3 = 2131757147; // 0x7f10085b float:1.9145222E38 double:1.0532279716E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r10.aU = r3;
        r3 = r10.aP;
        r3.setOnClickListener(r10);
        r3 = r10.aS;
        r3.setOnClickListener(r10);
        r3 = 2131757141; // 0x7f100855 float:1.914521E38 double:1.0532279686E-314;
        r0 = r0.findViewById(r3);
        r0 = (android.widget.ImageButton) r0;
        r10.aV = r0;
        r0 = r10.bi;
        r10.a(r0);
        r0 = r10.bc;
        r3 = r0.a;
        r7 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r3 = r3 & r7;
        if (r3 == 0) goto L_0x01a2;
    L_0x0146:
        r0 = r0.x;
        if (r0 == 0) goto L_0x014b;
    L_0x014a:
        goto L_0x014d;
    L_0x014b:
        r0 = defpackage.axak.a;
    L_0x014d:
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r0 = r0.h;
        r3 = r3.d;
        r0 = r0.a(r3);
        if (r0 == 0) goto L_0x01a2;
    L_0x0160:
        r0 = r10.bc;
        r0 = r0.x;
        if (r0 == 0) goto L_0x0167;
    L_0x0166:
        goto L_0x0169;
    L_0x0167:
        r0 = defpackage.axak.a;
    L_0x0169:
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r0 = r0.h;
        r7 = r3.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x017f;
    L_0x017c:
        r0 = r3.b;
        goto L_0x0183;
    L_0x017f:
        r0 = r3.a(r0);
    L_0x0183:
        r0 = (defpackage.aphg) r0;
        r3 = r0.a;
        r7 = r3 & 8192;
        if (r7 != 0) goto L_0x0193;
    L_0x018b:
        r7 = r3 & 4096;
        if (r7 != 0) goto L_0x0193;
    L_0x018f:
        r3 = r3 & 2048;
        if (r3 == 0) goto L_0x01a2;
    L_0x0193:
        r3 = r10.aV;
        r3.setVisibility(r2);
        r3 = r10.aV;
        r3.setTag(r0);
        r0 = r10.aV;
        r0.setOnClickListener(r10);
    L_0x01a2:
        r0 = 2131757086; // 0x7f10081e float:1.9145098E38 double:1.0532279415E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.aw = r0;
        r0 = 2131756795; // 0x7f1006fb float:1.9144508E38 double:1.0532277977E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.ax = r0;
        r0 = 2131757087; // 0x7f10081f float:1.91451E38 double:1.053227942E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.ay = r0;
        r0 = r10.aw;
        r0.setOnClickListener(r10);
        r0 = r10.ax;
        r0.setOnClickListener(r10);
        r10.ah();
        r0 = 2131757055; // 0x7f1007ff float:1.9145035E38 double:1.053227926E-314;
        r0 = r11.findViewById(r0);
        r10.az = r0;
        r0 = 2131757056; // 0x7f100800 float:1.9145037E38 double:1.0532279266E-314;
        r0 = r11.findViewById(r0);
        r10.aj = r0;
        r0 = 2131757057; // 0x7f100801 float:1.914504E38 double:1.053227927E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView) r0;
        r10.aA = r0;
        r0 = r10.aA;
        r0.d = r10;
        r0 = 2131757060; // 0x7f100804 float:1.9145045E38 double:1.0532279286E-314;
        r0 = r11.findViewById(r0);
        r3 = 2131757076; // 0x7f100814 float:1.9145078E38 double:1.0532279365E-314;
        r3 = r11.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r10.aC = r3;
        r3 = 2131757077; // 0x7f100815 float:1.914508E38 double:1.053227937E-314;
        r3 = r11.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r10.aD = r3;
        r3 = r10.bc;
        r3 = r3.a;
        r3 = r3 & r4;
        if (r3 != 0) goto L_0x0216;
    L_0x0215:
        goto L_0x022f;
    L_0x0216:
        r0.setVisibility(r2);
        r3 = r10.aC;
        r7 = r10.bc;
        r7 = r7.c;
        if (r7 != 0) goto L_0x0223;
    L_0x0221:
        r7 = defpackage.arml.f;
    L_0x0223:
        r7 = defpackage.ajqy.a(r7);
        r3.setText(r7);
        r3 = r10.aC;
        r3.setVisibility(r2);
    L_0x022f:
        r3 = r10.bc;
        r3 = r3.a;
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r3 = r3 & r7;
        if (r3 != 0) goto L_0x0239;
    L_0x0238:
        goto L_0x0290;
    L_0x0239:
        r0.setVisibility(r2);
        r0 = r10.aD;
        r3 = r10.bc;
        r3 = r3.r;
        if (r3 != 0) goto L_0x0246;
    L_0x0244:
        r3 = defpackage.arml.f;
    L_0x0246:
        r3 = defpackage.ajqy.a(r3);
        r0.setText(r3);
        r0 = r10.aD;
        r0.setVisibility(r2);
        r0 = r10.bc;
        r3 = r0.a;
        r7 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r3 = r3 & r7;
        if (r3 == 0) goto L_0x0290;
    L_0x025b:
        r3 = r10.aa;
        r0 = r0.s;
        if (r0 != 0) goto L_0x0263;
    L_0x0261:
        r0 = defpackage.arwf.c;
    L_0x0263:
        r0 = r0.b;
        r0 = defpackage.arwh.a(r0);
        if (r0 != 0) goto L_0x026d;
    L_0x026b:
        r0 = defpackage.arwh.UNKNOWN;
    L_0x026d:
        r0 = r3.a(r0);
        if (r0 == 0) goto L_0x0290;
    L_0x0273:
        r3 = r10.q();
        r7 = 2131625465; // 0x7f0e05f9 float:1.8878139E38 double:1.053162912E-314;
        r7 = r3.getDimensionPixelSize(r7);
        r0 = android.graphics.BitmapFactory.decodeResource(r3, r0);
        r8 = new android.graphics.drawable.BitmapDrawable;
        r0 = android.graphics.Bitmap.createScaledBitmap(r0, r7, r7, r1);
        r8.<init>(r3, r0);
        r0 = r10.aD;
        r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r6, r6, r6);
    L_0x0290:
        r0 = 2131757059; // 0x7f100803 float:1.9145043E38 double:1.053227928E-314;
        r0 = r11.findViewById(r0);
        r10.aB = r0;
        r0 = 2131757078; // 0x7f100816 float:1.9145082E38 double:1.0532279375E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r10.ak = r0;
        r0 = 2131757084; // 0x7f10081c float:1.9145094E38 double:1.0532279405E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.aI = r0;
        r0 = r10.bc;
        r3 = r0.a;
        r3 = r3 & 16384;
        if (r3 == 0) goto L_0x02da;
    L_0x02b7:
        r0 = r0.p;
        if (r0 != 0) goto L_0x02bd;
    L_0x02bb:
        r0 = defpackage.arml.f;
    L_0x02bd:
        r0 = defpackage.ajqy.a(r0);
        r3 = r10.aI;
        r3.setText(r0);
        r3 = r10.aI;
        r7 = new java.lang.Object[r1];
        r0 = r0.toString();
        r7[r2] = r0;
        r0 = 2131952652; // 0x7f13040c float:1.9541753E38 double:1.053324564E-314;
        r0 = r10.a(r0, r7);
        r3.setContentDescription(r0);
    L_0x02da:
        r0 = 2131757085; // 0x7f10081d float:1.9145096E38 double:1.053227941E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.aJ = r0;
        r0 = r10.bc;
        r3 = r0.a;
        r7 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r3 = r3 & r7;
        if (r3 != 0) goto L_0x02f0;
    L_0x02ef:
        goto L_0x02ff;
    L_0x02f0:
        r3 = r10.aJ;
        r0 = r0.q;
        if (r0 != 0) goto L_0x02f8;
    L_0x02f6:
        r0 = defpackage.arml.f;
    L_0x02f8:
        r0 = defpackage.ajqy.a(r0);
        r3.setText(r0);
    L_0x02ff:
        r0 = 2131757079; // 0x7f100817 float:1.9145084E38 double:1.053227938E-314;
        r0 = r11.findViewById(r0);
        r10.aE = r0;
        r0 = 2131757080; // 0x7f100818 float:1.9145086E38 double:1.0532279385E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.aF = r0;
        r0 = 2131757081; // 0x7f100819 float:1.9145088E38 double:1.053227939E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r10.aG = r0;
        r0 = 2131757082; // 0x7f10081a float:1.914509E38 double:1.0532279395E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.aH = r0;
        r0 = r10.aH;
        r0.setOnClickListener(r10);
        r0 = 2131757083; // 0x7f10081b float:1.9145092E38 double:1.05322794E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.aK = r0;
        r0 = r10.bc;
        r3 = r0.a;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x0365;
    L_0x0341:
        r0 = r0.h;
        if (r0 == 0) goto L_0x0346;
    L_0x0345:
        goto L_0x0348;
    L_0x0346:
        r0 = defpackage.axak.a;
    L_0x0348:
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r0 = r0.h;
        r7 = r3.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x035e;
    L_0x035b:
        r0 = r3.b;
        goto L_0x0362;
    L_0x035e:
        r0 = r3.a(r0);
    L_0x0362:
        r0 = (defpackage.aphg) r0;
        goto L_0x0366;
    L_0x0365:
        r0 = r6;
    L_0x0366:
        r3 = r10.bc;
        r7 = r3.a;
        r7 = r7 & 128;
        if (r7 == 0) goto L_0x0392;
    L_0x036e:
        r3 = r3.i;
        if (r3 == 0) goto L_0x0373;
    L_0x0372:
        goto L_0x0375;
    L_0x0373:
        r3 = defpackage.axak.a;
    L_0x0375:
        r7 = com.google.protos.youtube.api.innertube.MenuRendererOuterClass.menuRenderer;
        r7 = defpackage.anxl.checkIsLite(r7);
        r3.a(r7);
        r3 = r3.h;
        r8 = r7.d;
        r3 = r3.b(r8);
        if (r3 != 0) goto L_0x038b;
    L_0x0388:
        r3 = r7.b;
        goto L_0x038f;
    L_0x038b:
        r3 = r7.a(r3);
    L_0x038f:
        r3 = (defpackage.auvn) r3;
        goto L_0x0393;
    L_0x0392:
        r3 = r6;
    L_0x0393:
        if (r0 != 0) goto L_0x0397;
    L_0x0395:
        goto L_0x0484;
    L_0x0397:
        if (r3 == 0) goto L_0x0484;
    L_0x0399:
        r7 = r0.a;
        r7 = r7 & 16;
        if (r7 == 0) goto L_0x03ea;
    L_0x039f:
        r7 = r10.aK;
        r7.setVisibility(r2);
        r7 = r0.a;
        r7 = r7 & 16384;
        if (r7 != 0) goto L_0x03ab;
    L_0x03aa:
        goto L_0x03b8;
    L_0x03ab:
        r7 = r10.aK;
        r8 = r0.p;
        if (r8 != 0) goto L_0x03b3;
    L_0x03b1:
        r8 = defpackage.aodv.c;
    L_0x03b3:
        r8 = r8.b;
        r7.setContentDescription(r8);
    L_0x03b8:
        r7 = r10.a;
        r8 = new acvs;
        r9 = r0.r;
        r8.<init>(r9);
        r7.b(r8);
        r7 = r10.aa;
        r0 = r0.e;
        if (r0 != 0) goto L_0x03cc;
    L_0x03ca:
        r0 = defpackage.arwf.c;
    L_0x03cc:
        r0 = r0.b;
        r0 = defpackage.arwh.a(r0);
        if (r0 != 0) goto L_0x03d6;
    L_0x03d4:
        r0 = defpackage.arwh.UNKNOWN;
    L_0x03d6:
        r0 = r7.a(r0);
        if (r0 == 0) goto L_0x03ea;
    L_0x03dc:
        r7 = r10.aK;
        r7.setImageResource(r0);
        r0 = r10.af;
        r7 = r10.aK;
        r8 = r10.a;
        r0.a(r7, r3, r10, r8);
    L_0x03ea:
        r0 = r10.bc;
        r0 = r0.n;
        if (r0 == 0) goto L_0x03f1;
    L_0x03f0:
        goto L_0x03f3;
    L_0x03f1:
        r0 = defpackage.axak.a;
    L_0x03f3:
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r0 = r0.h;
        r3 = r3.d;
        r0 = r0.a(r3);
        if (r0 == 0) goto L_0x0484;
    L_0x0406:
        r0 = r10.bc;
        r0 = r0.n;
        if (r0 == 0) goto L_0x040d;
    L_0x040c:
        goto L_0x040f;
    L_0x040d:
        r0 = defpackage.axak.a;
    L_0x040f:
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r0 = r0.h;
        r7 = r3.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x0425;
    L_0x0422:
        r0 = r3.b;
        goto L_0x0429;
    L_0x0425:
        r0 = r3.a(r0);
    L_0x0429:
        r0 = (defpackage.aphg) r0;
        r3 = r10.a;
        r7 = r0.r;
        r7 = r7.d();
        r3.a(r7, r6);
        r3 = r0.a;
        r3 = r3 & 16384;
        if (r3 != 0) goto L_0x043d;
    L_0x043c:
        goto L_0x044a;
    L_0x043d:
        r3 = r10.ay;
        r7 = r0.p;
        if (r7 != 0) goto L_0x0445;
    L_0x0443:
        r7 = defpackage.aodv.c;
    L_0x0445:
        r7 = r7.b;
        r3.setContentDescription(r7);
    L_0x044a:
        r3 = r0.a;
        r7 = r3 & 2048;
        if (r7 != 0) goto L_0x0454;
    L_0x0450:
        r3 = r3 & 4096;
        if (r3 == 0) goto L_0x045e;
    L_0x0454:
        r3 = r10.ay;
        r3.setOnClickListener(r10);
        r3 = r10.ay;
        r3.setTag(r0);
    L_0x045e:
        r3 = r0.a;
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x0484;
    L_0x0464:
        r3 = r10.aa;
        r0 = r0.e;
        if (r0 != 0) goto L_0x046c;
    L_0x046a:
        r0 = defpackage.arwf.c;
    L_0x046c:
        r0 = r0.b;
        r0 = defpackage.arwh.a(r0);
        if (r0 != 0) goto L_0x0476;
    L_0x0474:
        r0 = defpackage.arwh.UNKNOWN;
    L_0x0476:
        r0 = r3.a(r0);
        r3 = r10.ay;
        r3.setImageResource(r0);
        r0 = r10.ay;
        r0.setVisibility(r2);
    L_0x0484:
        r0 = 2131757065; // 0x7f100809 float:1.9145055E38 double:1.053227931E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r10.aM = r0;
        r0 = r10.bc;
        r0 = defpackage.aclq.a(r0);
        r3 = r10.a;
        r7 = r0.r;
        r7 = r7.d();
        r3.a(r7, r6);
        r3 = 2131757064; // 0x7f100808 float:1.9145053E38 double:1.0532279306E-314;
        r3 = r11.findViewById(r3);
        r3 = (android.widget.Button) r3;
        r10.aL = r3;
        r3 = r10.bc;
        r3 = r3.t;
        if (r3 == 0) goto L_0x04b7;
    L_0x04b1:
        r0 = r10.aL;
        r0.setVisibility(r5);
        goto L_0x04fa;
    L_0x04b7:
        r3 = r10.aL;
        r7 = r0.a;
        r7 = r7 & 128;
        if (r7 == 0) goto L_0x04c6;
    L_0x04bf:
        r7 = r0.g;
        if (r7 != 0) goto L_0x04c7;
    L_0x04c3:
        r7 = defpackage.arml.f;
        goto L_0x04c7;
    L_0x04c6:
        r7 = r6;
    L_0x04c7:
        r7 = defpackage.ajqy.a(r7);
        r3.setText(r7);
        r3 = r10.M_();
        r7 = r10.aL;
        r8 = r0.b;
        if (r8 != r1) goto L_0x04e7;
    L_0x04d8:
        r8 = r0.c;
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        r8 = defpackage.aphh.a(r8);
        if (r8 == 0) goto L_0x04e7;
    L_0x04e6:
        goto L_0x04e8;
    L_0x04e7:
        r8 = 1;
    L_0x04e8:
        defpackage.acra.a(r3, r7, r8);
        r3 = r10.aL;
        r3.setTag(r0);
        r0 = r10.aL;
        r0.setOnClickListener(r10);
        r0 = r10.aL;
        r0.setVisibility(r2);
    L_0x04fa:
        r0 = 2131757063; // 0x7f100807 float:1.9145051E38 double:1.05322793E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.al = r0;
        r10.ag();
        r0 = r10.bc;
        r0 = r0.k;
        if (r0 == 0) goto L_0x050f;
    L_0x050e:
        goto L_0x0511;
    L_0x050f:
        r0 = defpackage.axak.a;
    L_0x0511:
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r0 = r0.h;
        r3 = r3.d;
        r0 = r0.a(r3);
        if (r0 == 0) goto L_0x059c;
    L_0x0524:
        r0 = r10.bc;
        r0 = r0.k;
        if (r0 == 0) goto L_0x052b;
    L_0x052a:
        goto L_0x052d;
    L_0x052b:
        r0 = defpackage.axak.a;
    L_0x052d:
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r0 = r0.h;
        r7 = r3.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x0543;
    L_0x0540:
        r0 = r3.b;
        goto L_0x0547;
    L_0x0543:
        r0 = r3.a(r0);
    L_0x0547:
        r0 = (defpackage.aphg) r0;
        r3 = r10.a;
        r7 = r0.r;
        r7 = r7.d();
        r3.a(r7, r6);
        r3 = r10.aM;
        r7 = r0.a;
        r7 = r7 & 128;
        if (r7 == 0) goto L_0x0563;
    L_0x055c:
        r7 = r0.g;
        if (r7 != 0) goto L_0x0564;
    L_0x0560:
        r7 = defpackage.arml.f;
        goto L_0x0564;
    L_0x0563:
        r7 = r6;
    L_0x0564:
        r7 = defpackage.ajqy.a(r7);
        r3.setText(r7);
        r3 = r10.M_();
        r7 = r10.aM;
        r8 = r0.b;
        if (r8 != r1) goto L_0x0584;
    L_0x0575:
        r8 = r0.c;
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        r8 = defpackage.aphh.a(r8);
        if (r8 == 0) goto L_0x0584;
    L_0x0583:
        goto L_0x0585;
    L_0x0584:
        r8 = 1;
    L_0x0585:
        defpackage.acra.a(r3, r7, r8);
        r3 = r10.aM;
        r3.setTag(r0);
        r0 = r10.aM;
        r0.setOnClickListener(r10);
        r0 = r10.aM;
        r0.setVisibility(r2);
        r0 = r10.aL;
        r0.setEnabled(r1);
    L_0x059c:
        r0 = r10.ao();
        if (r0 == 0) goto L_0x05fb;
    L_0x05a2:
        r0 = 2131757066; // 0x7f10080a float:1.9145057E38 double:1.0532279316E-314;
        r0 = r11.findViewById(r0);
        r10.aN = r0;
        r0 = 2131757069; // 0x7f10080d float:1.9145063E38 double:1.053227933E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r10.aO = r0;
        r0 = 2131757068; // 0x7f10080c float:1.9145061E38 double:1.0532279326E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        if (r0 == 0) goto L_0x05e9;
    L_0x05c1:
        r3 = r10.bc;
        r7 = r3.a;
        r7 = r7 & 4;
        if (r7 == 0) goto L_0x05e9;
    L_0x05c9:
        r3 = r3.d;
        if (r3 != 0) goto L_0x05cf;
    L_0x05cd:
        r3 = defpackage.auyy.d;
    L_0x05cf:
        r3 = r3.a;
        r3 = r3 & r1;
        if (r3 == 0) goto L_0x05e2;
    L_0x05d4:
        r3 = r10.bc;
        r3 = r3.d;
        if (r3 != 0) goto L_0x05dc;
    L_0x05da:
        r3 = defpackage.auyy.d;
    L_0x05dc:
        r6 = r3.b;
        if (r6 != 0) goto L_0x05e2;
    L_0x05e0:
        r6 = defpackage.arml.f;
    L_0x05e2:
        r3 = defpackage.ajqy.a(r6);
        r0.setText(r3);
    L_0x05e9:
        r0 = r10.aO;
        if (r0 == 0) goto L_0x05fb;
    L_0x05ed:
        r0.setOnClickListener(r10);
        r0 = r10.M_();
        r3 = r10.aO;
        r6 = 14;
        defpackage.acra.a(r0, r3, r6);
    L_0x05fb:
        r0 = r10.ax;
        r3 = r10.bc;
        r3 = r3.t;
        if (r3 != 0) goto L_0x0609;
    L_0x0603:
        r3 = r10.ba;
        if (r3 > r1) goto L_0x0608;
    L_0x0607:
        goto L_0x0609;
    L_0x0608:
        r5 = 0;
    L_0x0609:
        r0.setVisibility(r5);
        r0 = r10.av;
        r3 = new aclu;
        r3.<init>(r10);
        r0.a(r3);
        r0 = r10.av;
        r3 = new aclt;
        r3.<init>(r10);
        r0.b(r3);
        r0 = r10.aq;
        r10.d(r0);
        r0 = 2131757140; // 0x7f100854 float:1.9145207E38 double:1.053227968E-314;
        r0 = r11.findViewById(r0);
        r3 = r10.as;
        r5 = "PREF_HAS_SEEN_ORIENTATION_TOOLTIP";
        r2 = r3.getBoolean(r5, r2);
        r2 = r2 ^ r1;
        r3 = r10.Z();
        if (r3 == 0) goto L_0x0677;
    L_0x063b:
        if (r2 == 0) goto L_0x0677;
    L_0x063d:
        r2 = r10.ai;
        r3 = r2.a();
        r5 = 2131952588; // 0x7f1303cc float:1.9541623E38 double:1.0533245323E-314;
        r5 = r10.a(r5);
        r3 = r3.c(r5);
        r1 = r3.e(r1);
        r1 = r1.d(r4);
        r3 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r1 = r1.a(r3);
        r0 = r1.a(r0);
        r0 = r0.f();
        r0 = (defpackage.albx) r0;
        r1 = new acmc;
        r1.<init>(r10);
        r0 = r0.a(r1);
        r0 = r0.b();
        r2.a(r0);
    L_0x0677:
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclq.a(android.view.ViewGroup):android.view.View");
    }

    public final void Y() {
        if (am() && !TextUtils.isEmpty(this.am) && aclo.a((nf) this)) {
            aaml a = this.ah.a();
            a.o();
            a.c(this.am);
            a.n();
            if (this.bf == null) {
                this.bf = new aclz(this);
            }
            abap abap = this.ah;
            abap.a.a(a, this.bf);
            this.b.removeCallbacks(this.bg);
            this.b.postDelayed(this.bg, 5000);
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0028, code skipped:
            if (r4.ao == r0) goto L_0x002a;
     */
    public final void e(android.os.Bundle r5) {
        /*
        r4 = this;
        r0 = r4.am;
        r1 = "STATE_VIDEO_ID";
        r5.putString(r1, r0);
        r0 = r4.bd;
        if (r0 == 0) goto L_0x0015;
    L_0x000b:
        r1 = new ajrb;
        r1.<init>(r0);
        r0 = "SHARE_NAVIGATION_ENDPOINT";
        r5.putParcelable(r0, r1);
    L_0x0015:
        r0 = r4.bj;
        r1 = "NETWORK_OPERATION_MODE";
        r5.putInt(r1, r0);
        r0 = r4.ap;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x002a;
    L_0x0022:
        r0 = r4.an;
        if (r0 == 0) goto L_0x002b;
    L_0x0026:
        r3 = r4.ao;
        if (r3 != r0) goto L_0x002b;
    L_0x002a:
        r1 = 1;
    L_0x002b:
        r0 = "THUMBNAIL_SAVED";
        r5.putBoolean(r0, r1);
        r0 = r4.aq;
        r1 = "STATE_UPLOAD_THUMBNAIL_STATUS";
        r5.putInt(r1, r0);
        r0 = r4.ar;
        r1 = "STATE_VIEWERS_WAITING";
        r5.putString(r1, r0);
        r0 = r4.bi;
        r1 = "STATE_IS_PORTRAIT";
        r5.putBoolean(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclq.e(android.os.Bundle):void");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        X();
        if (this.be && al()) {
            this.aN.setVisibility(8);
            aq();
            return;
        }
        View a = a(this.at);
        this.at.removeAllViews();
        this.at.addView(a);
        if (v()) {
            aj();
            this.af.b();
        }
    }

    public final void a(ajuw ajuw) {
        if (aclo.a((nf) this)) {
            this.ac.a(ajuw);
        }
    }

    public final void a(int i, aqhy aqhy) {
        if (aclo.a((nf) this)) {
            Toast.makeText(p(), R.string.lc_error_load_broadcast, 0).show();
        }
    }

    public final void b(String str) {
        if (str != null) {
            this.am = str;
        }
        acmf acmf = this.ac;
        if (acmf != null) {
            acmf.a(this.am);
        }
    }

    public final void a(String str) {
        if (str != null) {
            this.am = str;
        }
        if (this.ba > 1) {
            this.ax.setVisibility(0);
        }
        d(0);
        this.an = null;
        aa();
        this.ak.setImageBitmap(null);
        this.aB.setVisibility(8);
        this.az.setVisibility(0);
        acmf acmf = this.ac;
        if (acmf != null) {
            acmf.b(this.aj);
        }
        this.aA.a();
        ak();
    }

    public final void a(Bitmap bitmap) {
        if (aclo.a((nf) this)) {
            this.an = bitmap;
            if (this.bc.t) {
                this.ax.setVisibility(8);
            }
            this.ac.f(this.bc.t);
            X();
            ab();
            a(abzv.a(bitmap));
            anjv anjv = this.aX;
            if (anjv != null) {
                anjv.cancel(false);
            }
            anjv = this.aY;
            if (anjv != null) {
                anjv.cancel(false);
            }
            this.aX = anjf.a(new aclw(this, bitmap), this.aW);
        }
    }

    public final boolean Z() {
        return this.bc.t;
    }

    public final void aa() {
        this.aY = anjf.a(new aclv(this), this.aW);
    }

    public final void d(int i) {
        this.aq = i;
        acmf acmf = this.ac;
        if (acmf != null) {
            acmf.d(i);
        }
        if (aclo.a((nf) this)) {
            TypedValue typedValue = new TypedValue();
            q().getValue(R.dimen.lc_thumbnail_preview_uploading_overlay_opacity, typedValue, true);
            float f = typedValue.getFloat();
            if (i == 1) {
                this.aJ.setVisibility(0);
                this.aI.setVisibility(0);
                this.aE.setAlpha(1.0f);
                this.aE.setVisibility(0);
                this.aH.setVisibility(8);
                this.aK.setVisibility(8);
                this.aG.setVisibility(8);
                this.aF.setVisibility(8);
                this.aL.setEnabled(true);
                this.aM.setEnabled(true);
            } else if (i == 3 || (this.bc.t && i == 0)) {
                this.aL.setEnabled(true);
                this.aM.setEnabled(true);
                this.aJ.setVisibility(0);
                this.aI.setVisibility(0);
                this.aE.setVisibility(8);
                this.aH.setVisibility(8);
                this.aK.setVisibility(0);
                this.aG.setVisibility(8);
                this.aF.setVisibility(8);
            } else if (i == 0) {
                this.aJ.setVisibility(0);
                this.aI.setVisibility(0);
                this.aE.setVisibility(8);
                this.aH.setVisibility(8);
                this.aK.setVisibility(8);
                this.aG.setVisibility(8);
                this.aF.setVisibility(8);
            } else if (i == 2) {
                this.aE.setAlpha(f);
                this.aE.setVisibility(0);
                this.aH.setVisibility(8);
                this.aK.setVisibility(8);
                this.aF.setText(a((int) R.string.lc_thumbnail_preview_uploading_title));
                this.aF.setVisibility(0);
                this.aG.setVisibility(0);
                this.aJ.setVisibility(8);
                this.aI.setVisibility(8);
                if (this.aM.getVisibility() == 0) {
                    this.aM.setEnabled(false);
                } else {
                    this.aL.setEnabled(false);
                }
            } else if (i == 4) {
                this.aE.setAlpha(f);
                this.aE.setVisibility(0);
                this.aH.setVisibility(0);
                this.aK.setVisibility(8);
                this.aG.setVisibility(8);
                this.aF.setText(a((int) R.string.lc_thumbnail_upload_failed));
                this.aF.setVisibility(0);
                this.aJ.setVisibility(8);
                this.aI.setVisibility(8);
                this.aL.setEnabled(true);
                this.aM.setEnabled(true);
            }
        }
    }

    private final void a(byte[] bArr) {
        d(2);
        this.ab.a(this.ab.a(this.am, null, null, null, null, null, null, null, null, null, acff.a, null, acff.a, bArr), new acmb(this));
    }

    public final void ab() {
        this.aA.b();
        this.az.setVisibility(8);
        View view = this.aN;
        if (view != null) {
            view.setVisibility(8);
        }
        this.aB.setVisibility(0);
        Bitmap bitmap = this.an;
        if (bitmap != null) {
            this.ak.setImageBitmap(bitmap);
        } else {
            aygk aygk = this.bc.o;
            if (aygk == null) {
                aygk = aygk.f;
            }
            if (aklb.a(aygk)) {
                aygk = this.bc.o;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                this.Z.execute(new acly(this, aklb.e(aygk)));
            }
        }
        String string = this.j.getString("ARG_TITLE");
        if (!TextUtils.isEmpty(string)) {
            this.aI.setText(string);
        }
    }

    public final void ac() {
        this.bj = 0;
        this.av.a(0);
        this.av.setVisibility(8);
        this.au.setVisibility(0);
        acmf acmf = this.ac;
        if (acmf != null) {
            acmf.b(this.aj);
        }
    }

    private final void an() {
        this.bj = 2;
        this.av.a(2);
        this.av.setVisibility(8);
        this.au.setVisibility(0);
    }

    public final void ad() {
        if (!TextUtils.isEmpty(this.am)) {
            an();
            if (v()) {
                W();
                ak();
            }
        }
    }

    public final void ae() {
        if (this.be) {
            this.be = false;
            ab();
            return;
        }
        acmf acmf = this.ac;
        if (acmf != null) {
            acmf.f(this.bc.t);
        }
        X();
        acmf = this.ac;
        if (acmf != null) {
            acmf.C();
        }
    }

    public final void onClick(View view) {
        if (this.K != null) {
            if (view == this.aw) {
                ae();
            } else {
                View view2 = this.ax;
                acmf acmf;
                if (view == view2) {
                    acmf = this.ac;
                    if (acmf != null) {
                        acmf.c(view2);
                        return;
                    }
                }
                view2 = this.ay;
                aphg aphg;
                if (view == view2) {
                    Object tag = view2.getTag();
                    if (tag instanceof aphg) {
                        apxu apxu;
                        aphg = (aphg) tag;
                        if ((aphg.a & 4096) != 0) {
                            apxu = aphg.m;
                            if (apxu == null) {
                                apxu = apxu.d;
                            }
                        } else {
                            apxu = aphg.l;
                            if (apxu == null) {
                                apxu = apxu.d;
                            }
                        }
                        this.c.a(apxu, null);
                        if ((aphg.a & 262144) != 0) {
                            this.a.a(3, new acvs(aphg.r), null);
                        }
                    }
                } else if (view == this.aL) {
                    if (al() || !ao()) {
                        aq();
                    } else {
                        ap();
                    }
                } else if (view == this.aO && ao()) {
                    aq();
                } else if (view == this.aM) {
                    acmf = this.ac;
                    if (acmf != null) {
                        acmf.D();
                    }
                } else if (view == this.aH) {
                    a(abzv.a(this.an));
                } else if (view == this.aP) {
                    a(false);
                } else if (view == this.aS) {
                    a(true);
                } else {
                    view2 = this.aV;
                    if (view == view2) {
                        apxu apxu2;
                        aphg = (aphg) view2.getTag();
                        int i = aphg.a;
                        if ((i & 8192) != 0) {
                            apxu2 = aphg.n;
                            if (apxu2 == null) {
                                apxu2 = apxu.d;
                            }
                        } else if ((i & 4096) != 0) {
                            apxu2 = aphg.m;
                            if (apxu2 == null) {
                                apxu2 = apxu.d;
                            }
                        } else {
                            apxu2 = aphg.l;
                            if (apxu2 == null) {
                                apxu2 = apxu.d;
                            }
                        }
                        this.c.a(apxu2, null);
                    }
                }
            }
        }
    }

    private final void a(boolean z) {
        this.bi = z;
        a(this.aP, this.aR, this.aQ, z ^ 1);
        a(this.aS, this.aU, this.aT, z);
    }

    private final void a(ViewGroup viewGroup, TextView textView, ImageView imageView, boolean z) {
        int color = M_().getColor(!z ? R.color.lc_button_style_orientation_background_selected : R.color.lc_button_style_orientation_background);
        textView.setTextColor(color);
        imageView.setColorFilter(color);
        viewGroup.setSelected(z);
    }

    private final boolean ao() {
        int e = this.ag.e();
        if (!this.bc.w) {
            return false;
        }
        if (e <= 0) {
            return this.ag.d();
        }
        if (this.bh < e) {
            return true;
        }
        return false;
    }

    private final void ap() {
        if (this.aN != null) {
            this.az.setVisibility(8);
            this.aB.setVisibility(8);
            this.aN.setVisibility(0);
            this.be = true;
        }
    }

    private final void aq() {
        apxu apxu;
        this.be = false;
        Object tag = this.aL.getTag();
        if (tag instanceof aphg) {
            aphg aphg = (aphg) tag;
            int i = aphg.a;
            if ((i & 2048) != 0) {
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else if ((i & 4096) == 0) {
                apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
        } else {
            apxu = null;
        }
        if (apxu != null) {
            Map a;
            this.a.a(new acvs(apxu.b));
            auyw auyw = this.bc;
            Boolean valueOf = Boolean.valueOf(this.bi);
            String str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
            if (auyw.t) {
                a = amur.a(str, auyw, "ARG_IS_PORTRAIT", valueOf);
            } else {
                a = amur.a(str, auyw);
            }
            this.c.a(apxu, a);
            return;
        }
        acmf acmf = this.ac;
        if (acmf != null) {
            acmf.B();
        }
    }

    public final void af() {
        if (this.K != null && v()) {
            int[] iArr = new int[2];
            this.aj.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            this.K.getLocationInWindow(iArr2);
            int i = iArr[0];
            int i2 = iArr2[0];
            int i3 = iArr[1];
            int i4 = iArr2[1];
            this.aj.getWidth();
            if (!this.ac.a(i - i2, i3 - i4, this.aj.getHeight(), new aclx(this))) {
                xtl.c("Failed to capture thumbnail.");
                if (aclo.a((nf) this)) {
                    d(1);
                    this.ac.f(this.bc.t);
                    X();
                    ab();
                }
                xpr.a(p(), (int) R.string.lc_thumbnail_capture_fail, 0);
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            alphaAnimation.setAnimationListener(new acmg(this));
            this.aj.startAnimation(alphaAnimation);
        }
    }
}
