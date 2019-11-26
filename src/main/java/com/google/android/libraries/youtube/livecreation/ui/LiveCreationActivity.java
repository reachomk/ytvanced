package com.google.android.libraries.youtube.livecreation.ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.livecreation.ui.view.ViewportOverlay;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SuperchatContractRendererOuterClass;
import defpackage.aaas;
import defpackage.aaau;
import defpackage.aazx;
import defpackage.abax;
import defpackage.abdj;
import defpackage.abyc;
import defpackage.abyh;
import defpackage.abyo;
import defpackage.abyr;
import defpackage.abyt;
import defpackage.abyz;
import defpackage.abzk;
import defpackage.abzr;
import defpackage.abzt;
import defpackage.abzv;
import defpackage.acab;
import defpackage.acag;
import defpackage.acdq;
import defpackage.acdr;
import defpackage.acdz;
import defpackage.acec;
import defpackage.aced;
import defpackage.acef;
import defpackage.aceo;
import defpackage.acfc;
import defpackage.acfe;
import defpackage.acff;
import defpackage.acgv;
import defpackage.acic;
import defpackage.acjk;
import defpackage.ackc;
import defpackage.ackd;
import defpackage.acke;
import defpackage.ackf;
import defpackage.ackg;
import defpackage.ackh;
import defpackage.acki;
import defpackage.ackj;
import defpackage.ackk;
import defpackage.ackl;
import defpackage.ackm;
import defpackage.ackn;
import defpackage.acko;
import defpackage.ackp;
import defpackage.ackq;
import defpackage.ackr;
import defpackage.acks;
import defpackage.ackt;
import defpackage.acku;
import defpackage.ackv;
import defpackage.ackw;
import defpackage.acky;
import defpackage.acli;
import defpackage.aclk;
import defpackage.aclo;
import defpackage.aclq;
import defpackage.acmf;
import defpackage.acmk;
import defpackage.acmo;
import defpackage.acmp;
import defpackage.acms;
import defpackage.acmt;
import defpackage.acmu;
import defpackage.acnc;
import defpackage.acov;
import defpackage.acoy;
import defpackage.acpa;
import defpackage.acpe;
import defpackage.acpv;
import defpackage.acpy;
import defpackage.acqb;
import defpackage.acqj;
import defpackage.acrz;
import defpackage.acsd;
import defpackage.acse;
import defpackage.acsf;
import defpackage.acsg;
import defpackage.acsi;
import defpackage.acsj;
import defpackage.acsl;
import defpackage.acum;
import defpackage.acvx;
import defpackage.acwa;
import defpackage.acwc;
import defpackage.acxj;
import defpackage.aej;
import defpackage.afpu;
import defpackage.afqe;
import defpackage.afsw;
import defpackage.ajqy;
import defpackage.ajrb;
import defpackage.ajuw;
import defpackage.akcs;
import defpackage.alad;
import defpackage.alak;
import defpackage.alan;
import defpackage.alao;
import defpackage.alaq;
import defpackage.alyf;
import defpackage.alyg;
import defpackage.alyp;
import defpackage.amen;
import defpackage.ameo;
import defpackage.amqw;
import defpackage.aniv;
import defpackage.anjf;
import defpackage.anxl;
import defpackage.anxp;
import defpackage.anxr;
import defpackage.anze;
import defpackage.aobp;
import defpackage.aphg;
import defpackage.aphj;
import defpackage.apxu;
import defpackage.aqhy;
import defpackage.arml;
import defpackage.arog;
import defpackage.arvt;
import defpackage.asjd;
import defpackage.asje;
import defpackage.asjf;
import defpackage.assd;
import defpackage.aswl;
import defpackage.aswo;
import defpackage.asxv;
import defpackage.auyw;
import defpackage.avaw;
import defpackage.avbq;
import defpackage.avxz;
import defpackage.avyb;
import defpackage.awnx;
import defpackage.axak;
import defpackage.axzb;
import defpackage.ayva;
import defpackage.azaj;
import defpackage.bapu;
import defpackage.bqn;
import defpackage.nf;
import defpackage.nn;
import defpackage.nt;
import defpackage.or;
import defpackage.urf;
import defpackage.urs;
import defpackage.urt;
import defpackage.uud;
import defpackage.vai;
import defpackage.vaj;
import defpackage.vam;
import defpackage.vap;
import defpackage.xak;
import defpackage.xci;
import defpackage.xfc;
import defpackage.xly;
import defpackage.xoa;
import defpackage.xoc;
import defpackage.xpr;
import defpackage.xrn;
import defpackage.xsc;
import defpackage.xse;
import defpackage.xss;
import defpackage.xtl;
import defpackage.xvd;
import defpackage.zji;
import defpackage.znq;
import defpackage.znv;
import defpackage.zos;
import defpackage.zqz;
import defpackage.zrb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LiveCreationActivity extends aej implements aaau, aazx, abax, acdq, acdz, acmf, acmp, acmt, acov, acpa, acpv, acqb, acwa, afsw, alaq, urt, vam, xfc, xoc {
    public static final long W = TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);
    private static final alad[] aw = new alad[]{new alad(1, acwc.MOBILE_LIVE_APPROVE_CAMERA_BUTTON, acwc.MOBILE_LIVE_DENY_CAMERA_BUTTON), new alad(2, acwc.MOBILE_LIVE_APPROVE_MICROPHONE_BUTTON, acwc.MOBILE_LIVE_DENY_MICROPHONE_BUTTON)};
    private static final long ay = TimeUnit.MILLISECONDS.convert(15, TimeUnit.MINUTES);
    private static final alad g = new alad(0, acwc.MOBILE_LIVE_UPLOAD_THUMBNAIL_APPROVE_STORAGE_BUTTON, acwc.MOBILE_LIVE_UPLOAD_THUMBNAIL_DENY_STORAGE_BUTTON);
    public abdj A;
    public ScheduledExecutorService B;
    public acum C;
    public bapu D;
    public zqz E;
    public znv F;
    public acjk G;
    public alyf H;
    public aclo I;
    public aceo J;
    public nt K;
    public xoa L;
    public aclq M;
    public acnc N;
    public alao O;
    public ViewportOverlay P;
    public SurfaceView Q;
    public acmo R;
    public boolean S;
    public int T;
    public acrz U;
    public boolean V;
    public final Handler X = new Handler();
    public final Runnable Y = new ackj(this);
    private final Runnable aA = new ackm(this);
    private final FrameCallback aB = new ackl(this);
    private vaj aa;
    private Parcel ab;
    private acoy ac;
    private acpe ad;
    private acpe ae;
    private acpy af;
    private vap ag;
    private aclq ah;
    private acms ai;
    private alak aj;
    private acqj ak;
    private String al;
    private String am;
    private int an;
    private boolean ao;
    private boolean ap;
    private String aq;
    private acku ar;
    private ackw as;
    private boolean at = false;
    private boolean au;
    private boolean av;
    private final List ax = new ArrayList();
    private final ackr az = new ackr(this);
    private DisplayListener h;
    public Handler j;
    public Executor k;
    public xci l;
    public aclk m;
    public acli n;
    public afpu o;
    public afqe p;
    public acvx q;
    public urf r;
    public urs s;
    public uud t;
    public ackv u;
    public acfe v;
    public xsc w;
    public Choreographer x;
    public DisplayManager y;
    public acfc z;

    public void a(ViewStub viewStub) {
    }

    public final aaas d() {
        throw null;
    }

    private static boolean a(Intent intent) {
        return intent.hasExtra("statusCode") && intent.hasExtra("didStream");
    }

    public final void a(boolean z, int i) {
        b(z, i);
    }

    public final void b(boolean z, int i) {
        acnc acnc = this.N;
        if (acnc != null && acnc.u()) {
            this.N.a(z, i);
            if (!aclo.a((Activity) this)) {
                this.U.a(getWindowManager().getDefaultDisplay().getRotation());
            }
        }
    }

    public final acdr n_() {
        acnc acnc = this.N;
        return (acnc == null || !acnc.v()) ? null : this.N;
    }

    public void l() {
        ((acku) n()).a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
    public void onCreate(android.os.Bundle r15) {
        /*
        r14 = this;
        r14.l();
        r0 = r14.z;
        r0 = r0.a();
        r0 = r0.A;
        defpackage.aclo.a = r0;
        r0 = r14.z;
        r0 = r0.f();
        if (r0 == 0) goto L_0x0024;
    L_0x0015:
        r0 = r14.ax;
        r1 = new alad;
        r2 = 3;
        r3 = defpackage.acwc.MOBILE_LIVE_APPROVE_LOCATION_BUTTON;
        r4 = defpackage.acwc.MOBILE_LIVE_DENY_LOCATION_BUTTON;
        r1.<init>(r2, r3, r4);
        r0.add(r1);
    L_0x0024:
        r0 = 0;
        if (r15 == 0) goto L_0x0031;
    L_0x0027:
        r1 = "BUNDLE_INTERACTION_BUNDLE";
        r1 = r15.getBundle(r1);
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0075;
    L_0x0031:
        r1 = r14.getIntent();
        r1 = defpackage.acjm.a(r1);
        if (r1 != 0) goto L_0x0055;
    L_0x003b:
        r1 = r14.getIntent();
        if (r1 == 0) goto L_0x0055;
    L_0x0041:
        r2 = "navigation_endpoint";
        r1 = r1.getParcelableExtra(r2);
        r1 = (defpackage.ajrb) r1;
        if (r1 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0055;
    L_0x004c:
        r2 = defpackage.apxu.d;
        r1 = r1.a(r2);
        r1 = (defpackage.apxu) r1;
        goto L_0x0056;
    L_0x0055:
        r1 = r0;
    L_0x0056:
        if (r1 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0075;
    L_0x0059:
        r1 = r14.getIntent();
        if (r1 == 0) goto L_0x0074;
    L_0x005f:
        r2 = "navigation_endpoint";
        r1 = r1.getByteArrayExtra(r2);
        if (r1 == 0) goto L_0x0074;
    L_0x0067:
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0074 }
        r3 = defpackage.apxu.d;	 Catch:{ anyg -> 0x0074 }
        r1 = defpackage.anxl.parseFrom(r3, r1, r2);	 Catch:{ anyg -> 0x0074 }
        r1 = (defpackage.apxu) r1;	 Catch:{ anyg -> 0x0074 }
        goto L_0x0075;
    L_0x0074:
        r1 = r0;
    L_0x0075:
        r2 = r14.q;
        r2 = (defpackage.acxj) r2;
        r2.a(r0, r1);
        super.onCreate(r15);
        if (r15 == 0) goto L_0x008b;
    L_0x0081:
        r0 = "BUNDLE_STREAM_CONFIG";
        r0 = r15.getParcelable(r0);
        r0 = (defpackage.aceo) r0;
        r14.J = r0;
    L_0x008b:
        r0 = r14.J;
        if (r0 != 0) goto L_0x0096;
    L_0x008f:
        r0 = new aceo;
        r0.<init>();
        r14.J = r0;
    L_0x0096:
        r0 = defpackage.acef.a();
        r1 = r14.z;
        r1 = r1.a();
        r1 = r1.k;
        r2 = 1;
        if (r1 != 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00f8;
    L_0x00a6:
        r1 = r14.B;
        r3 = r14.C;
        r4 = r14.w;
        r5 = r0.c;
        if (r5 != 0) goto L_0x00f8;
    L_0x00b0:
        r0.c = r2;
        r1 = defpackage.amqw.a(r1);
        r1 = (java.util.concurrent.ScheduledExecutorService) r1;
        r0.a = r1;
        r1 = defpackage.amqw.a(r3);
        r1 = (defpackage.acum) r1;
        r0.b = r1;
        r1 = defpackage.amqw.a(r4);
        r1 = (defpackage.xsc) r1;
        r0.d = r1;
        r1 = r0.i;
        monitor-enter(r1);
        r3 = r0.i;	 Catch:{ all -> 0x00f5 }
        r3 = r3.entrySet();	 Catch:{ all -> 0x00f5 }
        r3 = r3.iterator();	 Catch:{ all -> 0x00f5 }
    L_0x00d7:
        r4 = r3.hasNext();	 Catch:{ all -> 0x00f5 }
        if (r4 == 0) goto L_0x00f3;
    L_0x00dd:
        r4 = r3.next();	 Catch:{ all -> 0x00f5 }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ all -> 0x00f5 }
        r5 = r4.getKey();	 Catch:{ all -> 0x00f5 }
        r5 = (java.lang.Class) r5;	 Catch:{ all -> 0x00f5 }
        r4 = r4.getValue();	 Catch:{ all -> 0x00f5 }
        r4 = (defpackage.aceg) r4;	 Catch:{ all -> 0x00f5 }
        r0.a(r5, r4);	 Catch:{ all -> 0x00f5 }
        goto L_0x00d7;
    L_0x00f3:
        monitor-exit(r1);	 Catch:{ all -> 0x00f5 }
        goto L_0x00f8;
    L_0x00f5:
        r15 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f5 }
        throw r15;
    L_0x00f8:
        r1 = r14.J;
        r14.a(r0, r1);
        r1 = defpackage.auhn.class;
        r3 = 0;
        r0.a(r1, r3);
        r1 = defpackage.auhr.class;
        r0.a(r1, r3);
        r1 = defpackage.auhp.class;
        r0.a(r1, r3);
        r0 = 0;
        r14.ao = r0;
        r1 = 2131034753; // 0x7f050281 float:1.7680032E38 double:1.0528710616E-314;
        r14.setContentView(r1);
        r1 = r14.f();
        r14.K = r1;
        r1 = 2131757108; // 0x7f100834 float:1.9145142E38 double:1.0532279523E-314;
        r3 = r14.findViewById(r1);
        r7 = r3;
        r7 = (android.view.SurfaceView) r7;
        r3 = new acrz;
        r4 = r14.z;
        r5 = r4.i();
        r4 = r14.z;
        r4 = r4.a();
        r6 = r4.z;
        r9 = r14.u;
        r10 = new abyh;
        r4 = r14.z;
        r4 = r4.a();
        r4 = r4.j;
        if (r4 != 0) goto L_0x014b;
    L_0x0145:
        r11 = 4608683618675807573; // 0x3ff5555555555555 float:1.46601547E13 double:1.3333333333333333;
        goto L_0x0150;
    L_0x014b:
        r11 = 4610685218510194460; // 0x3ffc71c71c71c71c float:7.9997554E-22 double:1.7777777777777777;
    L_0x0150:
        r10.<init>(r11);
        r4 = r3;
        r8 = r14;
        r4.<init>(r5, r6, r7, r8, r9, r10);
        r14.U = r3;
        r3 = r14.o;
        defpackage.amqw.a(r3);
        r3 = r14.t;
        defpackage.amqw.a(r3);
        r3 = 2131756645; // 0x7f100665 float:1.9144203E38 double:1.0532277236E-314;
        r3 = r14.findViewById(r3);
        r3 = (android.view.ViewStub) r3;
        r14.a(r3);
        r3 = 2131757109; // 0x7f100835 float:1.9145144E38 double:1.053227953E-314;
        r3 = r14.findViewById(r3);
        r3 = (com.google.android.libraries.youtube.livecreation.ui.view.ViewportOverlay) r3;
        r14.P = r3;
        r1 = r14.findViewById(r1);
        r1 = (android.view.SurfaceView) r1;
        r14.Q = r1;
        r1 = 2131952581; // 0x7f1303c5 float:1.9541609E38 double:1.053324529E-314;
        r1 = r14.getString(r1);
        r14.al = r1;
        r1 = 2131952525; // 0x7f13038d float:1.9541495E38 double:1.053324501E-314;
        r1 = r14.getString(r1);
        r14.am = r1;
        if (r15 == 0) goto L_0x019f;
    L_0x0197:
        r14.an = r2;
        r1 = r14.m;
        r1.a(r15);
        goto L_0x01a1;
    L_0x019f:
        r14.an = r0;
    L_0x01a1:
        r1 = r14.m;
        r1.a();
        r1 = r14.U;
        r1 = r1.d();
        r14.T = r1;
        r1 = r14.K;
        r1 = r1.a();
        if (r15 == 0) goto L_0x0325;
    L_0x01b6:
        r2 = r14.J;
        r2 = r2.r;
        r3 = r14.K;
        r4 = "prestream_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.acpe) r3;
        r14.ad = r3;
        r3 = r14.ad;
        if (r3 == 0) goto L_0x01d7;
    L_0x01ca:
        r3 = "PRE_STREAM_FRAGMENT";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x01d7;
    L_0x01d2:
        r3 = r14.ad;
        r1.b(r3);
    L_0x01d7:
        r3 = r14.K;
        r4 = "edit_settings_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.acpe) r3;
        r14.ae = r3;
        r3 = r14.ae;
        if (r3 == 0) goto L_0x01f4;
    L_0x01e7:
        r3 = "EDIT_SETTINGS_PRE_STREAM_FRAGMENT";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x01f4;
    L_0x01ef:
        r3 = r14.ae;
        r1.b(r3);
    L_0x01f4:
        r3 = r14.K;
        r4 = "live_enablement_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.vap) r3;
        r14.ag = r3;
        r3 = r14.ag;
        if (r3 == 0) goto L_0x0211;
    L_0x0204:
        r3 = "LIVE_ENABLEMENT_FRAGMENT_NAME";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x0211;
    L_0x020c:
        r3 = r14.ag;
        r1.b(r3);
    L_0x0211:
        r3 = r14.K;
        r4 = "choose_thumbnail_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.aclq) r3;
        r14.M = r3;
        r3 = r14.M;
        if (r3 == 0) goto L_0x022e;
    L_0x0221:
        r3 = "CHOOSE_THUMBNAIL_FRAGMENT";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x022e;
    L_0x0229:
        r3 = r14.M;
        r1.b(r3);
    L_0x022e:
        r3 = r14.K;
        r4 = "edit_thumbnail_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.acmo) r3;
        r14.R = r3;
        r3 = r14.R;
        if (r3 == 0) goto L_0x024b;
    L_0x023e:
        r3 = "EDIT_THUMBNAIL_FRAGMENT_NAME";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x024b;
    L_0x0246:
        r3 = r14.R;
        r1.b(r3);
    L_0x024b:
        r3 = r14.K;
        r4 = "confirm_thumbnail_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.aclq) r3;
        r14.ah = r3;
        r3 = r14.ah;
        if (r3 == 0) goto L_0x0268;
    L_0x025b:
        r3 = "CONFIRM_THUMBNAIL_FRAGMENT";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x0268;
    L_0x0263:
        r3 = r14.ah;
        r1.b(r3);
    L_0x0268:
        r3 = r14.K;
        r4 = "livestream_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.acnc) r3;
        r14.N = r3;
        r3 = r14.N;
        if (r3 == 0) goto L_0x0285;
    L_0x0278:
        r3 = "LIVE_STREAM_FRAGMENT";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x0285;
    L_0x0280:
        r3 = r14.N;
        r1.b(r3);
    L_0x0285:
        r3 = r14.K;
        r4 = "poststream_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.acoy) r3;
        r14.ac = r3;
        r3 = r14.ac;
        if (r3 == 0) goto L_0x02a2;
    L_0x0295:
        r3 = "POST_STREAM_FRAGMENT";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x02a2;
    L_0x029d:
        r3 = r14.ac;
        r1.b(r3);
    L_0x02a2:
        r3 = r14.K;
        r4 = "errorstate_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.acms) r3;
        r14.ai = r3;
        r3 = r14.ai;
        if (r3 == 0) goto L_0x02bf;
    L_0x02b2:
        r3 = "ERROR_STATE_FRAGMENT";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 != 0) goto L_0x02bf;
    L_0x02ba:
        r3 = r14.ai;
        r1.b(r3);
    L_0x02bf:
        r3 = r14.K;
        r4 = "permission_request_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.alao) r3;
        r14.O = r3;
        r3 = r14.O;
        if (r3 == 0) goto L_0x02e4;
    L_0x02cf:
        r3 = "PERMISSION_REQUEST_FRAGMENT";
        r3 = android.text.TextUtils.equals(r2, r3);
        if (r3 == 0) goto L_0x02df;
    L_0x02d7:
        r3 = aw;
        r3 = defpackage.alao.a(r14, r3);
        if (r3 != 0) goto L_0x02e4;
    L_0x02df:
        r3 = r14.O;
        r1.b(r3);
    L_0x02e4:
        r3 = r14.K;
        r4 = "super_chat_contract_fragment";
        r3 = r3.a(r15, r4);
        r3 = (defpackage.acqj) r3;
        r14.ak = r3;
        r3 = r14.ak;
        if (r3 == 0) goto L_0x0301;
    L_0x02f4:
        r3 = "SUPER_CHAT_CONTRACT_FRAGMENT_NAME";
        r2 = android.text.TextUtils.equals(r2, r3);
        if (r2 != 0) goto L_0x0301;
    L_0x02fc:
        r2 = r14.ak;
        r1.b(r2);
    L_0x0301:
        r2 = r14.m;
        r2.d();
        r1.a();
        r1 = "is_resume_dialog_displayed";
        r1 = r15.getBoolean(r1);
        r14.V = r1;
        r1 = "camera_model_bundle";
        r15 = r15.getParcelable(r1);
        r15 = (defpackage.acsl) r15;
        r1 = android.os.Parcel.obtain();
        r15.writeToParcel(r1, r0);
        r1.setDataPosition(r0);
        r14.ab = r1;
    L_0x0325:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0179 A:{SYNTHETIC, Splitter:B:74:0x0179} */
    public final void o() {
        /*
        r13 = this;
        r0 = r13.V;
        if (r0 == 0) goto L_0x000d;
    L_0x0004:
        r0 = r13.an;
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r1 = 2;
        if (r0 == r1) goto L_0x000c;
    L_0x000b:
        goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r13.O;
        r0 = defpackage.aclo.a(r0);
        if (r0 != 0) goto L_0x0243;
    L_0x0015:
        r0 = r13.ak;
        r0 = defpackage.aclo.a(r0);
        if (r0 != 0) goto L_0x0243;
    L_0x001d:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = "PERMISSION_REQUEST_FRAGMENT";
        r2 = 23;
        r3 = 1;
        r4 = 0;
        if (r0 < r2) goto L_0x009e;
    L_0x0027:
        r0 = aw;
        r0 = defpackage.alao.a(r13, r0);
        r5 = r13.ax;
        r6 = new defpackage.alad[r4];
        r5 = r5.toArray(r6);
        r5 = (defpackage.alad[]) r5;
        r6 = defpackage.alao.a(r13, r5);
        if (r6 == 0) goto L_0x0046;
    L_0x003d:
        r5 = defpackage.alao.a(r13, r5);
        if (r5 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0046;
    L_0x0044:
        r5 = 1;
        goto L_0x0047;
    L_0x0046:
        r5 = 0;
    L_0x0047:
        if (r0 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x004d;
    L_0x004a:
        if (r5 != 0) goto L_0x004d;
    L_0x004c:
        goto L_0x009e;
    L_0x004d:
        r0 = r13.av;
        if (r0 != 0) goto L_0x009d;
    L_0x0051:
        r0 = r13.O;
        if (r0 != 0) goto L_0x0094;
    L_0x0055:
        r0 = r13.z;
        r0 = r0.f();
        if (r0 != 0) goto L_0x0064;
    L_0x005d:
        r2 = 2131952611; // 0x7f1303e3 float:1.954167E38 double:1.0533245437E-314;
        r12 = 2131952611; // 0x7f1303e3 float:1.954167E38 double:1.0533245437E-314;
        goto L_0x006a;
    L_0x0064:
        r2 = 2131952612; // 0x7f1303e4 float:1.9541672E38 double:1.053324544E-314;
        r12 = 2131952612; // 0x7f1303e4 float:1.9541672E38 double:1.053324544E-314;
    L_0x006a:
        if (r0 != 0) goto L_0x0073;
    L_0x006c:
        r0 = 2131952609; // 0x7f1303e1 float:1.9541666E38 double:1.0533245427E-314;
        r11 = 2131952609; // 0x7f1303e1 float:1.9541666E38 double:1.0533245427E-314;
        goto L_0x0079;
    L_0x0073:
        r0 = 2131952610; // 0x7f1303e2 float:1.9541668E38 double:1.053324543E-314;
        r11 = 2131952610; // 0x7f1303e2 float:1.9541668E38 double:1.053324543E-314;
    L_0x0079:
        r5 = aw;
        r0 = r13.ax;
        r2 = new defpackage.alad[r4];
        r0 = r0.toArray(r2);
        r6 = r0;
        r6 = (defpackage.alad[]) r6;
        r7 = defpackage.acwl.N;
        r8 = defpackage.acwc.MOBILE_LIVE_ALLOW_ACCESS_BUTTON;
        r9 = defpackage.acwc.MOBILE_LIVE_PERMISSION_REQUEST_CANCEL_BUTTON;
        r10 = defpackage.acwc.MOBILE_LIVE_OPEN_APP_SETTINGS_BUTTON;
        r0 = defpackage.alao.a(r5, r6, r7, r8, r9, r10, r11, r12);
        r13.O = r0;
    L_0x0094:
        r0 = r13.O;
        r0.a = r13;
        r13.a(r0, r1);
        r13.av = r3;
    L_0x009d:
        return;
    L_0x009e:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 >= r2) goto L_0x00ca;
    L_0x00a2:
        r0 = "android.permission.CAMERA";
        r0 = defpackage.rn.b(r13, r0);
        r2 = "android.permission.RECORD_AUDIO";
        r2 = defpackage.rn.b(r13, r2);
        if (r0 == 0) goto L_0x00b1;
    L_0x00b0:
        goto L_0x00b4;
    L_0x00b1:
        if (r2 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00ca;
    L_0x00b4:
        r0 = r13.getResources();
        r1 = 2131952561; // 0x7f1303b1 float:1.9541568E38 double:1.053324519E-314;
        r0 = r0.getString(r1);
        r0 = android.widget.Toast.makeText(r13, r0, r4);
        r0.show();
        r13.finish();
        return;
    L_0x00ca:
        r0 = r13.o;
        defpackage.amqw.a(r0);
        r0 = r13.o;
        r0 = r0.c();
        defpackage.amqw.a(r0);
        r0 = r13.o;
        r0 = r0.c();
        r0 = r0.a();
        defpackage.xvd.a(r0);
        r2 = defpackage.xly.a(r13);
        r5 = 0;
        r6 = "SHARED_PREF_STREAM_CONFIG_KEY";
        r2 = r2.getString(r6, r5);
        r2 = defpackage.aceo.a(r2);
        if (r2 != 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00ff;
    L_0x00f7:
        r6 = r2.b;
        r6 = r0.equals(r6);
        if (r6 == 0) goto L_0x023d;
    L_0x00ff:
        r6 = defpackage.xly.a(r13);
        r7 = -1;
        r9 = "SHARED_PREF_LS_TIMESTAMP_KEY";
        r9 = r6.getLong(r9, r7);
        r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r6 == 0) goto L_0x011e;
    L_0x010f:
        r6 = r13.w;
        r6 = r6.a();
        r6 = r6 - r9;
        r8 = ay;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x011e;
    L_0x011c:
        goto L_0x023d;
    L_0x011e:
        if (r2 == 0) goto L_0x01d3;
    L_0x0120:
        r6 = r2.b;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x01d3;
    L_0x0128:
        r0 = r2.d;
        if (r0 == 0) goto L_0x01d3;
    L_0x012c:
        r0 = r13.an;
        if (r0 == 0) goto L_0x0136;
    L_0x0130:
        r6 = r13.V;
        if (r6 == 0) goto L_0x01d3;
    L_0x0134:
        if (r0 != r3) goto L_0x01d3;
    L_0x0136:
        r0 = r13.V;
        if (r0 != 0) goto L_0x0195;
    L_0x013a:
        r0 = r13.getIntent();
        r1 = a(r0);
        if (r1 == 0) goto L_0x0195;
    L_0x0144:
        r13.J = r2;
        r13.au = r3;
        r1 = "statusCode";
        r7 = r0.getIntExtra(r1, r4);
        r1 = "endScreenRenderer";
        r1 = r0.getByteArrayExtra(r1);
        if (r1 == 0) goto L_0x016a;
    L_0x0156:
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0164 }
        r3 = defpackage.avaw.i;	 Catch:{ anyg -> 0x0164 }
        r1 = defpackage.anxl.parseFrom(r3, r1, r2);	 Catch:{ anyg -> 0x0164 }
        r1 = (defpackage.avaw) r1;	 Catch:{ anyg -> 0x0164 }
        r8 = r1;
        goto L_0x016b;
    L_0x0164:
        r1 = move-exception;
        r2 = "Could not deserialize MobileStreamEndscreenRenderer from intent";
        defpackage.xtl.a(r2, r1);
    L_0x016a:
        r8 = r5;
    L_0x016b:
        r1 = "errorMessage";
        r9 = r0.getStringExtra(r1);
        r1 = "errorMessageFormatted";
        r1 = r0.getByteArrayExtra(r1);
        if (r1 == 0) goto L_0x0189;
    L_0x0179:
        r2 = defpackage.arml.f;	 Catch:{ anyg -> 0x0183 }
        r1 = defpackage.anxl.parseFrom(r2, r1);	 Catch:{ anyg -> 0x0183 }
        r1 = (defpackage.arml) r1;	 Catch:{ anyg -> 0x0183 }
        r10 = r1;
        goto L_0x018a;
    L_0x0183:
        r1 = move-exception;
        r2 = "Could not deserialize error message from intent";
        defpackage.xtl.a(r2, r1);
    L_0x0189:
        r10 = r5;
    L_0x018a:
        r1 = "didStream";
        r11 = r0.getBooleanExtra(r1, r4);
        r6 = r13;
        r6.a(r7, r8, r9, r10, r11);
        return;
    L_0x0195:
        r13.V = r3;
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r13);
        r1 = 2131952539; // 0x7f13039b float:1.9541524E38 double:1.053324508E-314;
        r0 = r0.setTitle(r1);
        r1 = 2131952537; // 0x7f130399 float:1.954152E38 double:1.053324507E-314;
        r0 = r0.setMessage(r1);
        r1 = new acka;
        r1.<init>(r13, r2);
        r2 = 2131952538; // 0x7f13039a float:1.9541522E38 double:1.0533245076E-314;
        r0 = r0.setPositiveButton(r2, r1);
        r1 = new acjz;
        r1.<init>(r13);
        r2 = 2131952536; // 0x7f130398 float:1.9541518E38 double:1.0533245066E-314;
        r0 = r0.setNegativeButton(r2, r1);
        r1 = new ackb;
        r1.<init>(r13);
        r0 = r0.setOnKeyListener(r1);
        r0 = r0.setCancelable(r4);
        r0.show();
        return;
    L_0x01d3:
        r0 = r13.J;
        r0 = r0.r;
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0239;
    L_0x01dd:
        r2 = "PRE_STREAM_FRAGMENT";
        r2 = r2.equals(r0);
        if (r2 != 0) goto L_0x0239;
    L_0x01e5:
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0239;
    L_0x01eb:
        r1 = "CHOOSE_THUMBNAIL_FRAGMENT";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0235;
    L_0x01f3:
        r1 = "EDIT_THUMBNAIL_FRAGMENT_NAME";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0203;
    L_0x01fb:
        r0 = r13.J;
        r0 = r0.c;
        r13.d(r0);
        return;
    L_0x0203:
        r1 = "LIVE_ENABLEMENT_FRAGMENT_NAME";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0243;
    L_0x020b:
        r1 = "LIVE_STREAM_FRAGMENT";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0243;
    L_0x0213:
        r1 = "POST_STREAM_FRAGMENT";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0243;
    L_0x021b:
        r0 = java.lang.String.valueOf(r0);
        r1 = "Unhandled fragment to resume to - ";
        r2 = r0.length();
        if (r2 != 0) goto L_0x022d;
    L_0x0227:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x0231;
    L_0x022d:
        r0 = r1.concat(r0);
    L_0x0231:
        defpackage.xtl.c(r0);
        return;
    L_0x0235:
        r13.v();
        return;
    L_0x0239:
        r13.q();
        return;
    L_0x023d:
        r13.d(r3);
        r13.q();
    L_0x0243:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity.o():void");
    }

    public final void a(acef acef, aceo aceo) {
        acef.b();
        if (aceo != null && !aceo.a) {
            acef.e = aceo.c;
            acef.f = this.z.d();
            acef.g = c(aceo.d);
            if (!TextUtils.isEmpty(aceo.p) || !TextUtils.isEmpty(aceo.q)) {
                acef.k = !aceo.l ? 2 : 4;
            }
        }
    }

    public final void p() {
        if (!this.ao || aclo.a((Activity) this)) {
            this.U.a(getWindowManager().getDefaultDisplay().getRotation());
            if (TextUtils.isEmpty(this.J.p) && TextUtils.isEmpty(this.J.q)) {
                int i = getResources().getConfiguration().orientation;
                aceo aceo = this.J;
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                aceo.l = z;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.m.a(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.ao = true;
        acpe acpe = this.ad;
        if (acpe != null) {
            this.K.a(bundle, "prestream_fragment", acpe);
        }
        acpe = this.ae;
        if (acpe != null) {
            this.K.a(bundle, "edit_settings_fragment", acpe);
        }
        vap vap = this.ag;
        if (vap != null && vap.F_()) {
            this.K.a(bundle, "live_enablement_fragment", this.ag);
        }
        aclq aclq = this.M;
        if (aclq != null) {
            this.K.a(bundle, "choose_thumbnail_fragment", aclq);
        }
        aclq = this.ah;
        if (aclq != null && aclq.F_()) {
            this.K.a(bundle, "confirm_thumbnail_fragment", this.ah);
        }
        acmo acmo = this.R;
        if (acmo != null && acmo.F_()) {
            this.K.a(bundle, "edit_thumbnail_fragment", this.R);
        }
        acnc acnc = this.N;
        if (acnc != null) {
            this.K.a(bundle, "livestream_fragment", acnc);
        }
        acoy acoy = this.ac;
        if (acoy != null) {
            this.K.a(bundle, "poststream_fragment", acoy);
        }
        acms acms = this.ai;
        if (acms != null) {
            this.K.a(bundle, "errorstate_fragment", acms);
        }
        alao alao = this.O;
        if (alao != null) {
            this.K.a(bundle, "permission_request_fragment", alao);
        }
        acqj acqj = this.ak;
        if (acqj != null && acqj.F_()) {
            this.K.a(bundle, "super_chat_contract_fragment", this.ak);
        }
        bundle.putParcelable("BUNDLE_STREAM_CONFIG", this.J);
        aclk aclk = this.m;
        bundle.putInt("stream_control_state", aclk.e);
        bundle.putBoolean("enablement_complete", aclk.a);
        bundle.putBoolean("thumbnail_chosen", aclk.b);
        bundle.putBoolean("live_stream_complete", aclk.d);
        aclk.f = true;
        bundle.putBoolean("is_resume_dialog_displayed", this.V);
        bundle.putParcelable("camera_model_bundle", this.U.n);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", ((acxj) this.q).e());
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        nf nfVar = this.N;
        if (nfVar != null && aclo.a(nfVar)) {
            acnc acnc = this.N;
            if (z) {
                acnc.f(true);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p();
        this.s.a();
        vap vap = this.ag;
        if (vap != null && vap.v()) {
            vap = this.ag;
            if (vap.b(vap.ac)) {
                vap.ac.onConfigurationChanged(configuration);
            } else if (vap.b(vap.ad)) {
                vap.ad.onConfigurationChanged(configuration);
            } else if (vap.b(vap.ae)) {
                vap.ae.onConfigurationChanged(configuration);
            } else if (vap.b(vap.af)) {
                vap.af.onConfigurationChanged(configuration);
            } else if (vap.b(vap.ag)) {
                vap.ag.onConfigurationChanged(configuration);
            }
        }
        alao alao = this.O;
        if (alao != null && alao.v()) {
            this.O.onConfigurationChanged(configuration);
        }
        acqj acqj = this.ak;
        if (acqj != null && acqj.v()) {
            this.ak.onConfigurationChanged(configuration);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        alak alak = this.aj;
        if (alak == null || !alak.a(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* renamed from: m */
    public acku n() {
        if (this.ar == null) {
            ackt ackt = (ackt) xse.a(getApplication());
            this.as = new ackw(this);
            this.ar = ackt.b(this.as);
        }
        return this.ar;
    }

    private final void M() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.lc_fade_in_fullscreen);
        loadAnimation.setAnimationListener(new acko(this));
        this.P.startAnimation(loadAnimation);
    }

    private final void N() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.lc_fade_out_fullscreen);
        loadAnimation.setAnimationListener(new ackn(this));
        this.P.startAnimation(loadAnimation);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        this.ao = false;
        p();
        this.m.f = false;
        if (aclo.a(this.ad)) {
            e(this.ad.f());
        } else if (aclo.a(this.ae)) {
            e(this.ae.f());
        } else if (aclo.a(this.M)) {
            e(this.M.Z());
        } else if (aclo.a(this.ah)) {
            e(this.ah.Z());
        } else if (aclo.a(this.N)) {
            O();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void aY_() {
        super.aY_();
        this.s.f();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        super.onPause();
        xoa xoa = this.L;
        if (xoa != null) {
            xoa.disable();
        }
        this.ao = true;
        if (isFinishing()) {
            P();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        super.onStop();
        this.y.unregisterDisplayListener(this.h);
        this.l.c(new acec());
        this.l.b(this.az);
        this.s.b();
        this.E.d();
        acsl acsl = this.U.n;
        Parcel obtain = Parcel.obtain();
        acsl.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        this.ab = obtain;
        P();
        this.an = 2;
        this.au = false;
    }

    private final void O() {
        if (!this.ap) {
            if (this.an == 0 || this.ab == null) {
                this.U.a(null);
            } else {
                this.U.a((acsl) acsl.CREATOR.createFromParcel(this.ab));
            }
            acrz acrz = this.U;
            xak.a();
            acrz.e.a(true);
            acrz.l = new abzr();
            acrz.d.a(acrz.e);
            acrz.d.a(acrz.l);
            if (acrz.a) {
                acrz.f.d = new acse(acrz);
            } else {
                amqw.b(acrz.g == null);
                acrz.g = new abzt();
                acrz.h = new abyt(acrz.g);
                acrz.d.a(acrz.g);
                abzk abyz = new abyz(acrz.h);
                acrz.d.a(abyz);
                acrz.j = new abyr(acag.a(acrz.c, R.raw.copy_texture_frag));
                acrz.k = new abyc(new acsf(acrz));
                acrz.f.d = new acsi(acrz, abyz);
            }
            ackv ackv = this.u;
            synchronized (ackv.b) {
                ackv.b.a = true;
            }
            ackv.c();
            this.Q.setVisibility(0);
            Parcel parcel = this.ab;
            if (parcel != null) {
                parcel.recycle();
                this.ab = null;
            }
            this.ap = true;
        }
    }

    private final void P() {
        if (this.ap) {
            this.u.a();
            acrz acrz = this.U;
            xak.a();
            abyh abyh = acrz.f;
            if (abyh != null) {
                abyh.c();
            }
            if (!acrz.a) {
                abzt abzt = acrz.g;
                if (abzt != null) {
                    abzt.e();
                }
                acrz.d.a(new acsg(acrz.j));
            }
            acab acab = acrz.m;
            if (acab != null) {
                acab.d();
            }
            this.Q.setVisibility(4);
            this.ap = false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDestroy() {
        acrz acrz = this.U;
        if (acrz != null) {
            xak.a();
            synchronized (acrz.q) {
                acrz.p = true;
                acab acab = acrz.m;
                if (acab != null) {
                    acab.c();
                }
            }
            acrz.d.b();
        }
        ackv ackv = this.u;
        if (ackv != null) {
            ackv.b();
            ackv.a.getLooper().quitSafely();
            this.u = null;
        }
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        this.ao = false;
        this.l.a(this.az);
        this.l.c(new aced());
        if (this.o.a()) {
            o();
        } else {
            this.p.a((Activity) this, null, null);
        }
        if (a(getIntent())) {
            this.Q.setVisibility(4);
        }
        aclk aclk = this.m;
        aclk.c = aclk.e;
        aclk.a();
        this.h = new ackq(this);
        this.y.registerDisplayListener(this.h, this.j);
        this.au = true;
        if (w()) {
            this.x.postFrameCallback(this.aB);
        }
    }

    public final void onBackPressed() {
        acpe acpe = (acpe) this.K.a("PRE_STREAM_FRAGMENT");
        aclq aclq = (aclq) this.K.a("CHOOSE_THUMBNAIL_FRAGMENT");
        acoy acoy = (acoy) this.K.a("POST_STREAM_FRAGMENT");
        acms acms = (acms) this.K.a("ERROR_STATE_FRAGMENT");
        acnc acnc = (acnc) this.K.a("LIVE_STREAM_FRAGMENT");
        vap vap = (vap) this.K.a("LIVE_ENABLEMENT_FRAGMENT_NAME");
        alao alao = (alao) this.K.a("PERMISSION_REQUEST_FRAGMENT");
        if ((acoy != null && acoy.v()) || (acms != null && acms.v())) {
            finish();
        } else if (acpe == null || !acpe.v()) {
            acpe = this.ae;
            if (acpe == null || !acpe.v()) {
                acmo acmo = this.R;
                if (acmo != null && acmo.v()) {
                    this.R.f();
                    return;
                } else if (aclq == null || !aclq.v()) {
                    aclq aclq2 = this.ah;
                    if (aclq2 == null || !aclq2.v()) {
                        acpy acpy = this.af;
                        if (acpy != null && acpy.v()) {
                            this.af.f();
                            return;
                        } else if (vap != null && vap.v()) {
                            vap.W();
                            return;
                        } else if (acnc == null || !acnc.v()) {
                            acqj acqj = this.ak;
                            if (acqj != null && acqj.v()) {
                                this.ak.a(true);
                                return;
                            } else if (alao == null || !alao.v()) {
                                super.onBackPressed();
                                return;
                            } else {
                                alao.f();
                                return;
                            }
                        } else if (acnc.aQ && acnc.bb) {
                            acnc.aj();
                        }
                    } else {
                        this.ah.ae();
                        return;
                    }
                } else {
                    aclq.ae();
                    return;
                }
            }
            this.ae.ab();
        } else {
            acpe.ab();
        }
    }

    public final void c(boolean z) {
        aclq aclq = this.M;
        if (aclq != null) {
            aclq.aa();
        }
        this.ad = null;
        this.M = null;
        this.J.a = true;
        d(false);
        if (!TextUtils.isEmpty(this.J.c)) {
            this.k.execute(new acke(this));
        }
        if (z) {
            finish();
        }
    }

    public final void d(boolean z) {
        this.k.execute(new acky(z, this, this.v, this.w));
    }

    public final void a(acmu acmu, String str) {
        r();
        acms acms = new acms();
        Bundle bundle = new Bundle();
        bundle.putSerializable("state", acmu);
        bundle.putString("message", str);
        acms.f(bundle);
        this.ai = acms;
        String str2 = "ERROR_STATE_FRAGMENT";
        or b = this.K.a().b(R.id.error_fragment_container, this.ai, str2);
        u();
        b.i = 4099;
        b.a();
        this.J.r = str2;
    }

    public final void q() {
        LiveCreationActivity liveCreationActivity = this;
        Object a = liveCreationActivity.o.c().a();
        aceo aceo = liveCreationActivity.J;
        aceo.b = a;
        if (liveCreationActivity.ad == null) {
            String str = "ARG_CAMERA_COUNT";
            String str2 = "ARG_DESCRIPTION";
            if (TextUtils.isEmpty(aceo.c)) {
                String stringExtra = getIntent() != null ? getIntent().getStringExtra("android.intent.extra.SUBJECT") : null;
                int i = liveCreationActivity.T;
                acpe acpe = new acpe();
                Bundle bundle = new Bundle();
                bundle.putInt(str, i);
                if (stringExtra != null) {
                    bundle.putString(str2, stringExtra);
                }
                acpe.f(bundle);
                liveCreationActivity.ad = acpe;
            } else {
                aceo = liveCreationActivity.J;
                acgv acgv = aceo.d;
                String str3 = acgv.a;
                String str4 = acgv.b;
                awnx awnx = acgv.i;
                zrb zrb = acgv.j;
                Boolean bool = acgv.c;
                Boolean bool2 = acgv.d;
                Boolean bool3 = acgv.e;
                Boolean bool4 = acgv.f;
                anze anze = acgv.g;
                int i2 = liveCreationActivity.T;
                anze anze2 = aceo.i;
                String str5 = a;
                Date date = acgv.k;
                arog arog = acgv.l;
                nf acpe2 = new acpe();
                Bundle bundle2 = new Bundle();
                arog arog2 = arog;
                if (str3 != null) {
                    bundle2.putString("ARG_TITLE", str3);
                }
                if (str4 != null) {
                    bundle2.putString(str2, str4);
                }
                if (awnx != null) {
                    bundle2.putInt("ARG_STREAM_PRIVACY", awnx.d);
                }
                if (zrb != null) {
                    bundle2.putParcelable("ARG_PLACE", zrb);
                }
                if (bool != null) {
                    bundle2.putBoolean("ARG_ENABLE_CHAT", bool.booleanValue());
                }
                if (bool2 != null) {
                    bundle2.putBoolean("ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE", bool2.booleanValue());
                }
                if (bool3 != null) {
                    bundle2.putBoolean("ARG_ENABLE_AGE_RESTRICTION", bool3.booleanValue());
                }
                if (bool4 != null) {
                    bundle2.putBoolean("ARG_IS_SCREENCAST", bool4.booleanValue());
                }
                if (anze != null) {
                    bundle2.putParcelable("ARG_MONETIZATION_METADATA", new ajrb(anze));
                }
                bundle2.putInt(str, i2);
                if (anze2 != null) {
                    bundle2.putParcelable("ARG_BROADCAST_CREATED_ENDPOINT", new ajrb(anze2));
                }
                if (date != null) {
                    bundle2.putSerializable("ARG_SCHEDULED_DATE", date);
                }
                if (arog2 != null) {
                    bundle2.putParcelable("ARG_GAME_TITLE", new ajrb((anze) arog2));
                }
                nf nfVar = acpe2;
                nfVar.f(bundle2);
                liveCreationActivity = this;
                liveCreationActivity.ad = nfVar;
                a = str5;
            }
            liveCreationActivity.aq = a;
        }
        if (!Objects.equals(liveCreationActivity.aq, a)) {
            liveCreationActivity.aq = a;
            T();
        } else if (liveCreationActivity.ad.u()) {
            liveCreationActivity.ad.X();
            liveCreationActivity.e(liveCreationActivity.ad.f());
        }
        liveCreationActivity.a(liveCreationActivity.ad, "PRE_STREAM_FRAGMENT");
        liveCreationActivity.ad.a(R());
    }

    private final void a(avaw avaw, String str, arml arml) {
        if (this.ac == null) {
            nf nfVar = this.ai;
            if (nfVar != null) {
                or b = this.K.a().b(nfVar);
                b.i = 4099;
                b.a();
            }
            acoy acoy = new acoy();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_ERROR_MESSAGE", str);
            if (arml != null) {
                aobp.a(bundle, "ARG_ERROR_MESSAGE_FORMATTED_STRING", (anze) arml);
            }
            if (avaw != null) {
                aobp.a(bundle, "ARG_ENDSCREEN_RENDERER", (anze) avaw);
            }
            acoy.f(bundle);
            this.ac = acoy;
            or a = this.K.a();
            acnc acnc = this.N;
            if (acnc != null) {
                a.a(acnc);
            }
            String str2 = "POST_STREAM_FRAGMENT";
            a.a(R.id.stream_fragment_container, this.ac, str2);
            a.i = 4099;
            a.f();
            a.a();
            this.N = null;
            this.J.r = str2;
            M();
            this.U.a(true);
            if (w()) {
                this.x.postFrameCallback(this.aB);
            }
        }
    }

    public final void a(nf nfVar, String str) {
        a(nfVar, str, false);
    }

    public final void a(nf nfVar, String str, boolean z) {
        nf a = this.K.a(this.J.r);
        amqw.a((Object) nfVar);
        xvd.a(str);
        or a2 = this.K.a();
        if (!(a == null || !a.F_() || a.equals(nfVar))) {
            if (z) {
                a2.a(a);
            } else {
                a2.b(a);
            }
        }
        if (!nfVar.F_()) {
            a2.a(R.id.stream_fragment_container, nfVar, str);
        } else if (nfVar.C) {
            a2.c(nfVar);
        }
        a2.i = 4099;
        a2.a();
        this.J.r = str;
    }

    public final void r() {
        or a = this.K.a();
        for (nf nfVar : this.K.f()) {
            if (nfVar != null && nfVar.F_()) {
                a.b(nfVar);
            }
        }
        a.i = 4099;
        a.a();
    }

    private final void a(String str, String str2, awnx awnx) {
        if (this.au) {
            int ordinal = awnx.ordinal();
            int i = 2;
            if (ordinal == 0) {
                i = 1;
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    i = 3;
                } else {
                    str2 = String.valueOf(this.J.d.i);
                    StringBuilder stringBuilder = new StringBuilder(str2.length() + 24);
                    stringBuilder.append("Unhandled privacy enum: ");
                    stringBuilder.append(str2);
                    throw new AssertionError(stringBuilder.toString());
                }
            }
            amen amen = (amen) ameo.g.createBuilder();
            amen.a(xvd.b(xvd.f(str2)));
            amen.a(i);
            ameo ameo = (ameo) ((anxl) amen.build());
            alyf alyf = this.H;
            anjf.a(anjf.a(new alyg(alyf, str, this.o.c(), ameo), alyf.b), new alyp(alyf), aniv.a);
        }
    }

    public static void a(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.chrome");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(intent.setComponent(null));
        }
    }

    private final void b(aqhy aqhy) {
        arml arml;
        CharSequence a;
        CharSequence a2;
        int dimensionPixelSize;
        this.aa = new vaj(this, aqhy, this.n, new ackp(this), this);
        vaj vaj = this.aa;
        Builder builder = new Builder(vaj.a);
        aqhy aqhy2 = vaj.b;
        if ((aqhy2.a & 1) != 0) {
            arml = aqhy2.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        builder.setTitle(ajqy.a(arml));
        aphj aphj = vaj.b.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) == 0) {
            aqhy2 = vaj.b;
            if ((aqhy2.a & 32768) != 0) {
                arml = aqhy2.l;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a = ajqy.a(arml);
        } else {
            aphj = vaj.b.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
        }
        aphj aphj2 = vaj.b.f;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        arml arml2;
        if ((aphj2.a & 1) == 0) {
            aqhy aqhy3 = vaj.b;
            if ((aqhy3.a & 16384) != 0) {
                arml2 = aqhy3.k;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            a2 = ajqy.a(arml2);
        } else {
            aphj2 = vaj.b.f;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg aphg2 = aphj2.b;
            if (aphg2 == null) {
                aphg2 = aphg.s;
            }
            arml2 = aphg2.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            a2 = ajqy.a(arml2);
        }
        builder.setPositiveButton(a2, null);
        builder.setNegativeButton(a, null);
        View inflate = ((LayoutInflater) vaj.a.getSystemService("layout_inflater")).inflate(R.layout.verification_dialog_body, null);
        vaj.g = (YouTubeTextView) inflate.findViewById(R.id.message);
        vaj.f = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        vaj.g.setText(akcs.a(vaj.b, vaj.c));
        builder.setView(inflate);
        vaj.g.setMovementMethod(LinkMovementMethod.getInstance());
        vaj.e = builder.create();
        vaj.e.setOnShowListener(new vai(vaj));
        int i = 0;
        vaj.e.setCancelable(false);
        vaj.e.setCanceledOnTouchOutside(false);
        vaj.e.show();
        if (xss.b(vaj.a)) {
            dimensionPixelSize = vaj.a.getResources().getDimensionPixelSize(R.dimen.av_confirmation_dialog_height);
            i = vaj.a.getResources().getDimensionPixelSize(R.dimen.av_confirmation_dialog_width);
        } else {
            dimensionPixelSize = xss.f(vaj.a);
            int g = xss.g(vaj.a);
            dimensionPixelSize = (int) (((float) Math.min(dimensionPixelSize, g)) * vaj.a.getResources().getFraction(R.fraction.av_dialog_height_ratio, 1, 1));
        }
        LayoutParams attributes = vaj.e.getWindow().getAttributes();
        attributes.height = dimensionPixelSize;
        if (i == 0) {
            i = attributes.width;
        }
        attributes.width = i;
        vaj.e.getWindow().setAttributes(attributes);
        this.q.b(acwc.LIVE_TERMS_OF_SERVICE_DIALOG_AGREE_BUTTON, null);
        this.q.b(acwc.LIVE_TERMS_OF_SERVICE_DIALOG_DECLINE_BUTTON, null);
    }

    public final void a(String str, auyw auyw, Boolean bool) {
        this.m.d();
        this.J.g = (auyw) amqw.a((Object) auyw);
        if (!TextUtils.isEmpty(str)) {
            this.J.c = str;
        }
        aceo aceo = this.J;
        if (aceo.d == null) {
            aceo.d = new acgv();
        }
        if ((auyw.a & 16384) != 0) {
            acgv acgv = this.J.d;
            arml arml = auyw.p;
            if (arml == null) {
                arml = arml.f;
            }
            acgv.a = ajqy.a(arml).toString();
        }
        this.J.d.f = Boolean.valueOf(auyw.t);
        if (bool != null) {
            this.J.l = bool.booleanValue();
        }
        B();
    }

    public final void c(int i) {
        if (aclo.a((Context) this)) {
            s();
        } else if (i > 0) {
            new Handler().postDelayed(new ackd(this, i), 200);
        } else {
            xpr.a((Context) this, (int) R.string.lc_error_screen_overlay_permission_required, 1);
            finish();
        }
    }

    public final void s() {
        startActivityForResult(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent(), 1000);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            c(10);
        } else if (i == 1000) {
            if (i2 == -1 && intent != null) {
                aceo aceo = this.J;
                aceo.e = true;
                aceo.r = "LIVE_STREAM_FRAGMENT";
                this.k.execute(this.aA);
                aceo = this.J;
                String str = aceo.c;
                boolean z = aceo.l;
                str = aceo.p;
                str = aceo.q;
                avbq avbq = aceo.h;
                long j = aceo.j;
                boolean z2 = aceo.k;
                this.z.h();
                this.z.g();
                this.z.b();
                this.z.c();
                z2 = this.J.e;
                this.z.j();
                finishAffinity();
                startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
                return;
            }
            this.S = false;
        }
    }

    public final void u() {
        acpe acpe = this.ad;
        if (acpe != null && acpe.K != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.ad.K.getWindowToken(), 2);
        }
    }

    private final void j(boolean z) {
        this.ah = null;
        acpy acpy = this.af;
        if (acpy == null) {
            this.af = new acpy();
        } else {
            acpy.W();
        }
        a(this.af, "SCHEDULED_EVENTS_FRAGMENT_NAME", z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A:{SYNTHETIC, RETURN} */
    public final void v() {
        /*
        r6 = this;
        r0 = r6.J;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x0006:
        r0 = r0.d;
        if (r0 == 0) goto L_0x0015;
    L_0x000a:
        r0 = r0.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r0 = 1;
        goto L_0x0016;
    L_0x0015:
        r0 = 0;
    L_0x0016:
        r3 = r6.J;
        if (r3 == 0) goto L_0x0032;
    L_0x001a:
        r3 = r3.g;
        if (r3 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0032;
    L_0x001f:
        r3 = r3.p;
        if (r3 != 0) goto L_0x0025;
    L_0x0023:
        r3 = defpackage.arml.f;
    L_0x0025:
        r3 = defpackage.ajqy.a(r3);
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0032;
    L_0x0030:
        r3 = 1;
        goto L_0x0033;
    L_0x0032:
        r3 = 0;
    L_0x0033:
        if (r0 == 0) goto L_0x0036;
    L_0x0035:
        goto L_0x003a;
    L_0x0036:
        if (r3 == 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003a;
    L_0x0039:
        r1 = 0;
    L_0x003a:
        defpackage.amqw.a(r1);
        r6.Q();
        r0 = r6.J;
        r1 = r0.g;
        r0 = r0.c;
        r3 = r6.T;
        r4 = r6.at;
        r5 = r6.S();
        r0 = defpackage.aclq.a(r1, r0, r3, r4, r5);
        r6.M = r0;
        r6.at = r2;
        r0 = r6.M;
        r1 = "CHOOSE_THUMBNAIL_FRAGMENT";
        r6.a(r0, r1);
        r0 = r6.M;
        r1 = r6.R();
        r0.c(r1);
        r0 = r6.J;
        if (r0 == 0) goto L_0x007b;
    L_0x006a:
        r0 = r0.g;
        if (r0 != 0) goto L_0x006f;
    L_0x006e:
        goto L_0x007b;
    L_0x006f:
        r1 = r0.a;
        r2 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x007b;
    L_0x0076:
        r0 = r0.t;
        r6.e(r0);
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity.v():void");
    }

    private final void d(auyw auyw) {
        this.m.b();
        Q();
        this.ah = aclq.a(auyw, null, this.T, this.at, S());
        a(this.ah, "CONFIRM_THUMBNAIL_FRAGMENT");
    }

    private final void Q() {
        if (this.M != null) {
            this.K.a().a(this.M).a();
            this.M = null;
        }
        if (this.ah != null) {
            this.K.a().a(this.ah).a();
            this.ah = null;
        }
    }

    private final void d(String str) {
        amqw.a((Object) str);
        if (this.R == null) {
            this.R = new acmo();
        }
        acmo acmo = this.R;
        acmo.Z = new abzv(this, this.w).a(str);
        if (aclo.a(acmo.c)) {
            acmo.W();
        }
        this.aj = new alak(alan.a((nn) this), this.q, Arrays.asList(new alad[]{g}), R.string.lc_permission_open_settings_storage_description, R.string.lc_permissions_missing_storage, new ackg(this));
        this.aj.a();
    }

    private final void e(View view) {
        String R = R();
        if (R != null) {
            xrn.a(this, view, R);
        }
    }

    private final String R() {
        acrz acrz = this.U;
        if (acrz == null) {
            return null;
        }
        String str;
        int i = acrz.n.b;
        String str2 = "";
        if (i != -1) {
            Object[] objArr = new Object[1];
            if (i == 1) {
                str = this.al;
            } else {
                str = this.am;
            }
            objArr[0] = str;
            str = getString(R.string.lc_camera_facing_accessibility_string, objArr);
        } else {
            str = str2;
        }
        if (this.U.d() > 2) {
            str2 = getString(R.string.lc_camera_id_accessibility_string, new Object[]{Integer.valueOf(this.U.n.a)});
        }
        return getString(R.string.lc_stream_switch_camera_accessibility_string, new Object[]{str, str2});
    }

    public final boolean w() {
        return this.m.d && this.au;
    }

    public final void x() {
        q();
    }

    public final void a(auyw auyw) {
        d(auyw);
        e(auyw.t);
    }

    public final void y() {
        acpe acpe = this.ae;
        if (acpe != null && acpe.v()) {
            amqw.a(this.ah);
            e(this.ah.Z());
            a(this.ah, "CONFIRM_THUMBNAIL_FRAGMENT");
            if (this.ah.u()) {
                this.ah.B();
            }
        } else if (TextUtils.isEmpty(this.J.c)) {
            finish();
        } else if (c(this.J.d)) {
            this.J.a = true;
            d(false);
            finish();
        } else {
            acks acks = new acks(this);
            new Builder(this).setMessage(R.string.lc_confirm_abandon_streaming).setPositiveButton(17039370, acks).setNegativeButton(17039360, acks).setOnCancelListener(acks).show();
        }
    }

    private static boolean c(acgv acgv) {
        if (acgv != null) {
            Date date = acgv.k;
            if (date != null && date.getTime() > 0) {
                return true;
            }
        }
        return false;
    }

    public final asxv a(acgv acgv) {
        acgv acgv2 = acgv;
        aceo aceo = this.J;
        if (aceo.c == null) {
            return null;
        }
        acff acff;
        acff acff2;
        asjd asjd;
        asjf asjf;
        acgv acgv3 = aceo.d;
        String str = acgv2.a;
        String str2 = acgv2.b;
        awnx awnx = acgv2.i;
        zrb zrb = acgv2.j;
        Boolean bool = acgv2.c;
        Boolean bool2 = acgv2.d;
        Boolean bool3 = acgv2.e;
        Boolean bool4 = acgv2.f;
        asjd asjd2 = acgv2.g;
        Date date = acgv2.k;
        arog arog = acgv2.l;
        acff acff3 = acff.a;
        acff acff4 = acff.a;
        boolean equals = Objects.equals(str, acgv3.a);
        int i = equals ^ 1;
        String str3 = !equals ? str : null;
        boolean equals2 = Objects.equals(str2, acgv3.b);
        if (!equals2) {
            i = 1;
        }
        String str4 = !equals2 ? str2 : null;
        awnx awnx2 = acgv3.i;
        if (awnx != awnx2) {
            i = 1;
        }
        awnx awnx3 = awnx == awnx2 ? null : awnx;
        if (Objects.equals(zrb, acgv3.j)) {
            acff = acff3;
        } else {
            acff a;
            if (zrb != null) {
                a = acff.a(zrb);
            } else {
                a = acff.b;
            }
            acff = a;
            i = 1;
        }
        equals2 = Objects.equals(bool, acgv3.c);
        if (!equals2) {
            i = 1;
        }
        Boolean bool5 = !equals2 ? bool : null;
        boolean equals3 = Objects.equals(bool2, acgv3.d);
        if (!equals3) {
            i = 1;
        }
        Boolean bool6 = !equals3 ? bool2 : null;
        Boolean bool7 = !equals3 ? bool : bool5;
        equals2 = Objects.equals(bool3, acgv3.e);
        if (!equals2) {
            i = 1;
        }
        Boolean bool8 = !equals2 ? bool3 : null;
        equals2 = Objects.equals(bool4, acgv3.f);
        int i2 = equals2 ^ 1;
        if (!equals2) {
            i = 1;
        }
        Boolean bool9 = !equals2 ? bool4 : null;
        if (i2 == 0 && Objects.equals(arog, acgv3.l)) {
            acff2 = acff4;
        } else {
            acff acff5;
            if (!bool4.booleanValue() || arog == null || (arog.a & 4) == 0) {
                acff5 = acff.b;
            } else {
                acff5 = acff.a(arog.d);
            }
            acff2 = acff5;
            i = 1;
        }
        if (asjd2 == null || Objects.equals(asjd2, acgv3.g)) {
            asjd = null;
            asjf = null;
        } else {
            asjd asjd3 = acgv3.g;
            asje asje = (asje) asjf.h.createBuilder();
            if (asjd3 == null || asjd2.b != asjd3.b) {
                asje.a();
            }
            if ((asjd2.a & 8) != 0 && (asjd3 == null || !TextUtils.equals(asjd2.e, asjd3.e))) {
                asje.d();
            } else if ((asjd2.a & 4) != 0 && (asjd3 == null || asjd2.d != asjd3.d)) {
                asje.c();
            }
            if ((asjd2.a & 16) != 0 && (asjd3 == null || asjd2.f != asjd3.f)) {
                asje.e();
            }
            if ((asjd2.a & 32) != 0 && (asjd3 == null || !TextUtils.equals(asjd2.g, asjd3.g))) {
                asje.f();
            }
            if (asjd3 == null || asjd2.c != asjd3.c) {
                asje.b();
            }
            asjf = (asjf) ((anxl) asje.build());
            asjd = asjd2;
            i = 1;
        }
        boolean equals4 = Objects.equals(date, acgv3.k);
        if (!equals4) {
            i = 1;
        }
        Date date2 = !equals4 ? date : null;
        if (i == 0) {
            return null;
        }
        return this.v.a(this.J.c, str3, str4, bool7, bool6, bool8, bool9, asjd, asjf, awnx3, acff, date2, acff2, null);
    }

    public final void b(acgv acgv) {
        aceo aceo = this.J;
        acgv acgv2 = aceo.d;
        if (acgv2 == null) {
            aceo.d = acgv;
        } else {
            String str = acgv.a;
            if (str != null) {
                acgv2.a = str;
            }
            str = acgv.b;
            if (str != null) {
                acgv2.b = str;
            }
            Boolean bool = acgv.c;
            if (bool != null) {
                acgv2.c = bool;
            }
            bool = acgv.d;
            if (bool != null) {
                acgv2.d = bool;
            }
            bool = acgv.e;
            if (bool != null) {
                acgv2.e = bool;
            }
            bool = acgv.f;
            if (bool != null) {
                acgv2.f = bool;
            }
            asjd asjd = acgv.g;
            if (asjd != null) {
                acgv2.g = asjd;
            }
            asjf asjf = acgv.h;
            if (asjf != null) {
                acgv2.h = asjf;
            }
            awnx awnx = acgv.i;
            if (awnx != null) {
                acgv2.i = awnx;
            }
            zrb zrb = acgv.j;
            if (zrb != null) {
                acgv2.j = zrb;
            }
            Date date = acgv.k;
            if (date != null) {
                acgv2.k = date;
            }
            arog arog = acgv.l;
            if (arog != null) {
                acgv2.l = arog;
            }
        }
        this.m.b();
        if (this.M != null) {
            Boolean bool2 = acgv.f;
            boolean z = true;
            boolean z2 = bool2 != null && bool2.booleanValue();
            if (z2 == this.M.Z()) {
                z = false;
            }
            this.at = z;
        }
        v();
    }

    public final void a(String str, apxu apxu) {
        if (!isDestroyed()) {
            acef.a().e = str;
            this.at = true;
            aceo aceo = this.J;
            aceo.c = str;
            aceo.i = apxu;
            this.k.execute(this.aA);
            this.X.post(this.Y);
        }
    }

    public final void a(avxz avxz) {
        amqw.a((Object) avxz);
        boolean b = xss.b(this);
        this.ag = vap.a(avxz, b);
        String str = "LIVE_ENABLEMENT_FRAGMENT_NAME";
        if (b) {
            or a = this.K.a().a(this.ag, str);
            a.i = 4099;
            a.c();
            this.J.r = str;
        } else {
            a(this.ag, str);
        }
        if (avxz.f.size() > 0) {
            this.K.b();
            aqhy aqhy = ((avyb) avxz.f.get(0)).b;
            if (aqhy == null) {
                aqhy = aqhy.q;
            }
            b(aqhy);
        }
    }

    public final void a(aqhy aqhy) {
        b(aqhy);
    }

    public final void a(View view) {
        this.U.b();
        e(view);
        this.ad.a(R());
    }

    public final void z() {
        j(false);
    }

    public final void b(auyw auyw) {
        this.J.g = auyw;
        acef.a().h = auyw.t;
    }

    public final void A() {
        this.r.a(6);
    }

    public final void c(auyw auyw) {
        amqw.a(this.ah);
        this.at = auyw.t != this.ah.Z();
        d(auyw);
    }

    public final void a(azaj azaj) {
        this.J.t = azaj;
    }

    public final void e(boolean z) {
        if (z) {
            P();
        } else {
            O();
        }
    }

    public final void o_() {
        a(this.ad, "PRE_STREAM_FRAGMENT", true);
        this.m.b();
        this.ad.Z();
    }

    public final void p_() {
        Toast.makeText(this, getResources().getString(R.string.lc_error_generic), 0).show();
        finish();
    }

    public final void q_() {
        finish();
    }

    public final void r_() {
        amqw.a(this.aa);
        this.aa.a();
    }

    public final void b(boolean z) {
        amqw.a(this.aa);
        String string = getResources().getString(R.string.lc_error_generic);
        Toast.makeText(this, string, 0).show();
        xtl.c(String.valueOf(string).concat(", accept live streaming terms of service request failed."));
        if (z) {
            vaj vaj = this.aa;
            amqw.a(vaj.e, (Object) "showDialog() must be called before retryDialog().");
            vaj.h.setEnabled(true);
            vaj.i.setEnabled(true);
            vaj.f.a();
            return;
        }
        this.aa.a();
    }

    public final void B() {
        this.P.a(null);
        aclk aclk = this.m;
        aclk.b = true;
        aclk.e();
    }

    public final void b(View view) {
        O();
        this.U.a(false);
        this.P.a(view);
    }

    public final void f(boolean z) {
        this.U.a(true);
        this.P.a(null);
        if (z) {
            P();
        }
    }

    public final boolean a(int i, int i2, int i3, acmk acmk) {
        int i4;
        boolean z;
        int i5 = i3;
        if (!this.U.c()) {
            ((zji) this.D.get()).b();
        }
        acrz acrz = this.U;
        acmk.getClass();
        ackf ackf = new ackf(acmk);
        xak.a();
        View decorView = acrz.c.getWindow().getDecorView();
        Object rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int i6 = acrz.f.c;
        int width = (rect.width() * i6) / rect.height();
        if (acrz.b || !acrz.o) {
            i4 = i;
            z = false;
        } else {
            i4 = i;
            z = true;
        }
        int width2 = (int) ((((long) i4) * ((long) width)) / ((long) rect.width()));
        int height = (int) ((((long) i2) * ((long) i6)) / ((long) rect.height()));
        Object obj = acrz.c;
        amqw.a(obj);
        amqw.a(rect);
        amqw.a(i5 > 0);
        amqw.a(i6 > 0);
        amqw.a(rect.height() > 0);
        int integer = obj.getResources().getInteger(R.integer.lc_aspect_ratio_width);
        i4 = obj.getResources().getInteger(R.integer.lc_aspect_ratio_height);
        i5 = Math.round((((float) i5) * ((float) i6)) / ((float) rect.height())) / i4;
        Point point = new Point(integer * i5, i4 * i5);
        if (point.x < 4 || point.y < 4 || point.x + width2 > width || point.y + height > i6) {
            return false;
        }
        acrz.l.a(width, i6, new acsj(acrz, z, width2, height, point, ackf));
        return true;
    }

    public final void C() {
        aclq aclq = this.ah;
        if (aclq == null || !aclq.v()) {
            q();
            return;
        }
        this.ah = null;
        j(true);
    }

    public final void c(View view) {
        this.U.b();
        e(view);
        this.M.c(R());
    }

    public final void a(String str) {
        d(str);
    }

    public final void a(ajuw ajuw) {
        if (this.ah == null) {
            q();
            return;
        }
        this.ae = acpe.a(ajuw, this.T);
        a(this.ae, "EDIT_SETTINGS_PRE_STREAM_FRAGMENT");
    }

    public final void D() {
        aclq aclq = this.ah;
        if (aclq == null || !aclq.v()) {
            c(false);
            String str = this.J.r;
            this.J = new aceo();
            acef.a().b();
            this.J.r = str;
            q();
            return;
        }
        this.ah.ae();
    }

    public final void d(int i) {
        aclq aclq = this.M;
        if (aclq != null && aclq.v()) {
            this.J.f = i;
            this.k.execute(this.aA);
        }
    }

    public final void E() {
        nf nfVar = this.ah;
        if (nfVar != null) {
            a(nfVar, "CONFIRM_THUMBNAIL_FRAGMENT");
        } else {
            v();
        }
    }

    public final void a(Bitmap bitmap) {
        aclq aclq = this.ah;
        if (aclq != null) {
            aclq.a(bitmap);
            this.ah.f();
            a(this.ah, "CONFIRM_THUMBNAIL_FRAGMENT", true);
            return;
        }
        aclq = this.M;
        if (aclq != null) {
            aclq.a(bitmap);
            this.M.f();
            a(this.M, "CHOOSE_THUMBNAIL_FRAGMENT", true);
            return;
        }
        finish();
    }

    public final void d(View view) {
        this.U.b();
        e(view);
    }

    public final long F() {
        return !this.U.c() ? ((zji) this.D.get()).a() : 0;
    }

    public final void G() {
        this.U.a(false);
        N();
        xoa xoa = this.L;
        if (xoa != null) {
            xoa.enable();
        }
        if (aclo.a((Activity) this)) {
            this.U.a(getWindowManager().getDefaultDisplay().getRotation());
        }
    }

    public final void a(long j) {
        aceo aceo = this.J;
        aceo.j = j;
        if (aceo.l) {
            this.k.execute(new acki(this));
        }
        this.k.execute(this.aA);
    }

    private final int S() {
        return xly.a(this).getInt("SHARED_PREF_PORTRAIT_COUNT_KEY", 0);
    }

    public final void H() {
        this.U.a(true);
        M();
    }

    public final void I() {
        c(true);
    }

    public final float a(float f) {
        acrz acrz = this.U;
        xak.a();
        abyh abyh = acrz.f;
        if (abyh == null) {
            return -1.0f;
        }
        return abyh.a(f);
    }

    public final void a(float f, float f2, abyo abyo) {
        acrz acrz = this.U;
        xak.a();
        abyh abyh = acrz.f;
        if (abyh != null) {
            abyh.a(f, f2, acrz.n.c, abyo);
        }
    }

    public final boolean b(String str) {
        acrz acrz = this.U;
        xak.a();
        abyh abyh = acrz.f;
        if (abyh == null) {
            return false;
        }
        return abyh.a(str);
    }

    public final boolean c(String str) {
        acrz acrz = this.U;
        xak.a();
        abyh abyh = acrz.f;
        if (abyh == null) {
            return false;
        }
        return abyh.b(str);
    }

    public final void a(int i, avaw avaw, String str, arml arml, boolean z) {
        String.valueOf(str).length();
        setRequestedOrientation(-1);
        ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
        if (!(layoutParams.height == -1 || layoutParams.width == -1)) {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.Q.setLayoutParams(layoutParams);
        b("off");
        if (i == 0 || i == 26 || i == 31) {
            if (z) {
                this.m.c();
                if (i == 26 && avaw == null && str == null && arml == null) {
                    finish();
                    return;
                }
                ayva ayva;
                arvt b = this.z.a.b();
                if (b != null) {
                    ayva = b.j;
                    if (ayva == null) {
                        ayva = ayva.m;
                    }
                } else {
                    ayva = ayva.m;
                }
                if (ayva.d) {
                    if (avaw != null) {
                        aceo aceo = this.J;
                        String str2 = aceo.c;
                        String str3 = aceo.d.a;
                        awnx a = awnx.a(avaw.e);
                        if (a == null) {
                            a = awnx.PRIVATE;
                        }
                        a(str2, str3, a);
                    } else {
                        aswo aswo = (aswo) aswl.e.createBuilder();
                        aswo.a(this.J.c);
                        this.A.a(aswo, (afsw) this, null);
                    }
                }
                a(avaw, str, arml);
            } else {
                finish();
                if (this.J.d != null && Boolean.TRUE.equals(this.J.d.f)) {
                    startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
                }
            }
        } else if (i == 33) {
            this.m.c();
            a(avaw, str, arml);
        } else if (i == 21) {
            a(acmu.CUSTOM_MESSAGE, getString(R.string.lc_error_state_account_not_enabled));
        } else if (i != 22) {
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.lc_live_streaming_error);
            }
            if (z) {
                a(null, str, arml);
            } else {
                a(acmu.CUSTOM_MESSAGE, str);
            }
        } else {
            nf nfVar = this.ad;
            if (nfVar != null) {
                a(nfVar, "PRE_STREAM_FRAGMENT");
            }
            new Builder(this).setTitle(R.string.lc_live_streaming_error).setMessage(R.string.lc_live_streaming_account_blocked).setPositiveButton(R.string.lc_live_streaming_account_blocked_more_info, new ackh(this)).setNegativeButton(R.string.lc_live_streaming_not_enabled_no, new ackk(this)).setCancelable(false).show();
        }
        this.X.removeCallbacks(this.Y);
        d(false);
    }

    public final void a(bqn bqn) {
        aceo aceo = this.J;
        a(aceo.c, aceo.d.a, awnx.PUBLIC);
    }

    public final acic J() {
        return this.U.k;
    }

    public final void a(abyz abyz) {
        acrz acrz = this.U;
        if (acrz.i == null) {
            acrz.i = (abyz) amqw.a((Object) abyz);
            abzk abzk = acrz.i;
            boolean z = false;
            if (!acrz.b && acrz.o) {
                z = true;
            }
            abzk.a = z;
            acrz.d.a(abzk);
            return;
        }
        xtl.b("CameraStreamViewManager", "Pipeline render target already set.");
    }

    public final void g(boolean z) {
        acab acab = this.U.m;
        if (acab != null) {
            acab.a(z);
        }
    }

    public final void a(int i, String str, String str2, avbq avbq) {
        aceo aceo = this.J;
        aceo.s = i;
        aceo.p = str;
        aceo.q = str2;
        aceo.h = avbq;
    }

    public final void e(int i) {
        this.J.s = i;
    }

    public final void h(boolean z) {
        this.J.k = z;
    }

    public final void i(boolean z) {
        this.U.a(z);
        if (z) {
            M();
        } else {
            N();
        }
    }

    public final void a(zos zos, String str) {
        acrz acrz = this.U;
        znq b = this.F.b();
        boolean z = this.J.l;
        acab acab = acrz.m;
        if (acab != null) {
            acab.a(acrz.c, zos, b, z, str);
        } else {
            acrz.d.a.post(new acsd(acrz, zos, b, z, str));
        }
    }

    public final ArrayList K() {
        if (this.F.b.isEmpty()) {
            this.F.a(this.J.t);
        }
        return this.F.b;
    }

    /* JADX WARNING: Missing block: B:2:0x0013, code skipped:
            if (r3.h.a(r0.d) != false) goto L_0x0015;
     */
    public final void a(defpackage.apxu r3) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0015;
    L_0x0002:
        r0 = com.google.protos.youtube.api.innertube.VideoManagerEndpointOuterClass$VideoManagerEndpoint.videoManagerEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r3.a(r0);
        r1 = r3.h;
        r0 = r0.d;
        r0 = r1.a(r0);
        if (r0 == 0) goto L_0x0021;
    L_0x0015:
        r3 = "FEmy_videos";
        r3 = defpackage.aaax.a(r3);
        r0 = r2.q;
        r3 = r0.a(r3);
    L_0x0021:
        r0 = r2.n;
        r1 = 0;
        r0.a(r3, r1);
        r2.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity.a(apxu):void");
    }

    public final void L() {
        finish();
    }

    public final void s_() {
        this.av = false;
        this.j.post(new ackc(this));
    }

    public final void W() {
        finish();
    }

    public final void a(assd assd) {
        if (assd != null) {
            anxp anxp = assd.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(SuperchatContractRendererOuterClass.superchatContractRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = assd.c;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(SuperchatContractRendererOuterClass.superchatContractRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                anze anze = (axzb) b;
                if (anze != null) {
                    u();
                    if (this.ak == null) {
                        amqw.a((Object) anze);
                        acqj acqj = new acqj();
                        Bundle bundle = new Bundle();
                        aobp.a(bundle, "ARG_CONTRACT_RENDERER", anze);
                        acqj.f(bundle);
                        this.ak = acqj;
                    }
                    xoa xoa = this.L;
                    if (xoa != null) {
                        xoa.disable();
                    }
                    setRequestedOrientation(1);
                    a(this.ak, "SUPER_CHAT_CONTRACT_FRAGMENT_NAME");
                    return;
                }
                xtl.c("Received a null SuperchatContractRenderer");
            }
        }
    }

    public final void i() {
        xoa xoa = this.L;
        if (xoa != null) {
            xoa.enable();
        }
        setRequestedOrientation(-1);
        a(this.ad, "PRE_STREAM_FRAGMENT", true);
    }

    public final void t_() {
        Toast.makeText(this, getString(R.string.lc_error_generic), 0).show();
    }

    public final acvx t() {
        return this.q;
    }

    public final void a(boolean z) {
        T();
    }

    public final void c() {
        T();
    }

    public final void u_() {
        T();
    }

    public final void v_() {
        finish();
    }

    private final void T() {
        if (aclo.a(this.ad)) {
            this.ad.Z();
        }
    }
}
