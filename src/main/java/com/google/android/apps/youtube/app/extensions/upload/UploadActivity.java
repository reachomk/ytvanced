package com.google.android.apps.youtube.app.extensions.upload;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.youtube.R;
import defpackage.aaax;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwa;
import defpackage.acwc;
import defpackage.acxj;
import defpackage.afpt;
import defpackage.afpu;
import defpackage.afqe;
import defpackage.ajrb;
import defpackage.alak;
import defpackage.alyb;
import defpackage.alyc;
import defpackage.alyd;
import defpackage.amjp;
import defpackage.amqw;
import defpackage.amqz;
import defpackage.anxl;
import defpackage.anxo;
import defpackage.anxr;
import defpackage.apxu;
import defpackage.apxx;
import defpackage.atst;
import defpackage.avjd;
import defpackage.avjf;
import defpackage.avjh;
import defpackage.aysp;
import defpackage.aytx;
import defpackage.azaj;
import defpackage.dvg;
import defpackage.dvk;
import defpackage.fpt;
import defpackage.gsn;
import defpackage.gso;
import defpackage.gsp;
import defpackage.gtq;
import defpackage.gts;
import defpackage.gtv;
import defpackage.nt;
import defpackage.urf;
import defpackage.uri;
import defpackage.urs;
import defpackage.urt;
import defpackage.uyw;
import defpackage.vap;
import defpackage.xci;
import defpackage.xcp;
import defpackage.xfc;
import defpackage.xpr;
import defpackage.xse;
import defpackage.xtl;
import defpackage.zjn;
import defpackage.zjo;
import defpackage.zqz;
import java.util.ArrayList;

public class UploadActivity extends dvg implements acwa, gts, urt, xcp, xfc {
    public urf l;
    public xci m;
    public afpu n;
    public afqe o;
    public acxj p;
    public urs q;
    public gso r;
    public zqz s;
    public fpt t;
    private gsn u;
    private boolean v;
    private boolean w;
    private boolean x;
    private String y;
    private boolean z;

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0129  */
    public final void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        super.onCreate(r12);
        r0 = 2131035487; // 0x7f05055f float:1.7681521E38 double:1.052871424E-314;
        r11.setContentView(r0);
        r0 = 0;
        r1 = 0;
        if (r12 == 0) goto L_0x0024;
    L_0x000d:
        r2 = "account_has_channel";
        r2 = r12.getBoolean(r2, r0);
        r11.x = r2;
        r2 = "channel_checked_identity";
        r2 = r12.getString(r2, r1);
        r11.y = r2;
        r2 = "interaction_bundle";
        r2 = r12.getBundle(r2);
        goto L_0x0025;
    L_0x0024:
        r2 = r1;
    L_0x0025:
        r3 = r11.getIntent();
        if (r2 == 0) goto L_0x002d;
    L_0x002b:
        r4 = r1;
        goto L_0x0041;
    L_0x002d:
        if (r3 == 0) goto L_0x002b;
    L_0x002f:
        r4 = r3.getExtras();
        if (r4 == 0) goto L_0x002b;
    L_0x0035:
        r5 = "navigation_endpoint";
        r4 = r4.getByteArray(r5);
        if (r4 == 0) goto L_0x002b;
    L_0x003d:
        r4 = defpackage.aaax.b(r4);
    L_0x0041:
        r5 = r11.p;
        r5.a(r2, r4);
        if (r3 == 0) goto L_0x0059;
    L_0x0048:
        r2 = "video_time_limit_seconds";
        r2 = r3.getIntExtra(r2, r0);
        r3 = r11.r;
        r4 = java.util.concurrent.TimeUnit.SECONDS;
        r5 = (long) r2;
        r4 = r4.toMicros(r5);
        r3.ab = r4;
    L_0x0059:
        r2 = r11.r;
        if (r12 != 0) goto L_0x005f;
    L_0x005d:
        goto L_0x0110;
    L_0x005f:
        r3 = "helper_should_show_tags";
        r3 = r12.getBoolean(r3);
        r2.j = r3;
        r3 = "helper_active_account_identity";
        r3 = r12.getString(r3);
        r2.af = r3;
        r3 = "helper_upload_active_account_header";
        r3 = r12.getByteArray(r3);
        if (r3 != 0) goto L_0x0078;
    L_0x0077:
        goto L_0x0098;
    L_0x0078:
        r4 = defpackage.aysp.f;	 Catch:{ anyg -> 0x0097 }
        r4 = r4.createBuilder();	 Catch:{ anyg -> 0x0097 }
        r4 = (defpackage.ayso) r4;	 Catch:{ anyg -> 0x0097 }
        r5 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0097 }
        r3 = r4.mergeFrom(r3, r5);	 Catch:{ anyg -> 0x0097 }
        r3 = (defpackage.anvi) r3;	 Catch:{ anyg -> 0x0097 }
        r3 = (defpackage.ayso) r3;	 Catch:{ anyg -> 0x0097 }
        r3 = r3.build();	 Catch:{ anyg -> 0x0097 }
        r3 = (defpackage.anxl) r3;	 Catch:{ anyg -> 0x0097 }
        r3 = (defpackage.aysp) r3;	 Catch:{ anyg -> 0x0097 }
        r2.k = r3;	 Catch:{ anyg -> 0x0097 }
        goto L_0x0098;
    L_0x0098:
        r3 = "helper_video_effects_settings";
        r3 = r12.getByteArray(r3);
        if (r3 != 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00c1;
    L_0x00a1:
        r4 = defpackage.azaj.h;	 Catch:{ anyg -> 0x00c0 }
        r4 = r4.createBuilder();	 Catch:{ anyg -> 0x00c0 }
        r4 = (defpackage.azam) r4;	 Catch:{ anyg -> 0x00c0 }
        r5 = defpackage.anxa.c();	 Catch:{ anyg -> 0x00c0 }
        r3 = r4.mergeFrom(r3, r5);	 Catch:{ anyg -> 0x00c0 }
        r3 = (defpackage.anvi) r3;	 Catch:{ anyg -> 0x00c0 }
        r3 = (defpackage.azam) r3;	 Catch:{ anyg -> 0x00c0 }
        r3 = r3.build();	 Catch:{ anyg -> 0x00c0 }
        r3 = (defpackage.anxl) r3;	 Catch:{ anyg -> 0x00c0 }
        r3 = (defpackage.azaj) r3;	 Catch:{ anyg -> 0x00c0 }
        r2.l = r3;	 Catch:{ anyg -> 0x00c0 }
        goto L_0x00c1;
    L_0x00c1:
        r3 = "helper_was_cellular_dialog_dismissed_by_user";
        r3 = r12.getBoolean(r3);
        r2.n = r3;
        r3 = "helper_location_edit_renderer";
        r3 = r12.getParcelable(r3);
        r3 = (defpackage.ajrb) r3;
        if (r3 != 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x00de;
    L_0x00d4:
        r4 = defpackage.auka.i;
        r3 = r3.a(r4);
        r3 = (defpackage.auka) r3;
        r2.m = r3;
    L_0x00de:
        r3 = "location_permission_enabled_key";
        r3 = r12.getBoolean(r3);
        r2.o = r3;
        r2.ac = r0;
        r0 = r2.a;
        r0 = r0.f();
        r3 = "verification_host_fragment_key";
        r0 = r0.a(r12, r3);
        r0 = (defpackage.vap) r0;
        r2.q = r0;
        r0 = "max_known_video_length_key";
        r3 = r12.getLong(r0);
        r2.s = r3;
        r0 = "required_length_for_verification_key";
        r3 = r12.getLong(r0);
        r2.t = r3;
        r0 = "user_verification_eligible_key";
        r12 = r12.getBoolean(r0);
        r2.r = r12;
    L_0x0110:
        r12 = r11.r;
        r0 = r11.p;
        r0 = defpackage.amqw.a(r0);
        r0 = (defpackage.acvx) r0;
        r12.g = r0;
        r12 = r11.r;
        r0 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r0 = r11.findViewById(r0);
        r2 = r12.aj;
        if (r2 != 0) goto L_0x02e2;
    L_0x0129:
        r2 = 1;
        r12.aj = r2;
        r3 = 2131755599; // 0x7f10024f float:1.9142082E38 double:1.053227207E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r12.N = r3;
        r3 = 2131756649; // 0x7f100669 float:1.9144211E38 double:1.0532277256E-314;
        r3 = r0.findViewById(r3);
        r3 = (com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper) r3;
        r12.J = r3;
        r3 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        r12.L = r3;
        r3 = 2131756650; // 0x7f10066a float:1.9144214E38 double:1.053227726E-314;
        r4 = r0.findViewById(r3);
        r4 = (android.widget.ScrollView) r4;
        r12.K = r4;
        r4 = r12.a;
        r5 = 2131758547; // 0x7f100dd3 float:1.9148061E38 double:1.0532286633E-314;
        r4 = r4.findViewById(r5);
        r6 = 8;
        r4.setVisibility(r6);
        r4 = r12.u;
        if (r4 == 0) goto L_0x01c9;
    L_0x016a:
        r4 = r12.a;
        r4 = r4.f();
        r6 = "videoEditFragment";
        r7 = r4.a(r6);
        r7 = (defpackage.zrr) r7;
        r12.T = r7;
        r7 = r12.T;
        if (r7 == 0) goto L_0x017f;
    L_0x017e:
        goto L_0x01c2;
    L_0x017f:
        r7 = new zrr;
        r7.<init>();
        r12.T = r7;
        r7 = r12.T;
        r8 = r12.v;
        r7.aw = r8;
        r8 = r12.w;
        r9 = r12.ab;
        r7.a(r9);
        r7 = r12.T;
        r7.ax = r8;
        r8 = r12.x;
        r7.az = r8;
        r8 = r12.b;
        r8 = r8.x;
        r7.aA = r8;
        r7 = r4.a();
        r8 = r12.T;
        r5 = r7.a(r5, r8, r6);
        r5.a();
        r4.b();
        r4 = r12.h;
        r5 = r12.a;
        r5 = r5.getApplicationContext();
        r5 = defpackage.xrn.c(r5);
        r6 = "UPLOADS";
        r4.a(r5, r6);
    L_0x01c2:
        r4 = r12.T;
        r5 = r12.g;
        r4.a(r5);
    L_0x01c9:
        r4 = 2131758543; // 0x7f100dcf float:1.9148053E38 double:1.0532286613E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.LinearLayout) r4;
        r12.C = r4;
        r4 = 2131758544; // 0x7f100dd0 float:1.9148055E38 double:1.053228662E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.view.ViewGroup) r4;
        r12.D = r4;
        r4 = 2131755482; // 0x7f1001da float:1.9141845E38 double:1.053227149E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.ImageView) r4;
        r12.E = r4;
        r4 = defpackage.akko.h();
        r5 = new gtt;
        r5.<init>(r12);
        r4 = r4.a(r5);
        r4 = r4.a();
        r12.F = r4;
        r4 = 2131755484; // 0x7f1001dc float:1.9141849E38 double:1.05322715E-314;
        r4 = r0.findViewById(r4);
        r4 = (com.google.android.libraries.youtube.common.ui.YouTubeTextView) r4;
        r12.G = r4;
        r4 = 2131758546; // 0x7f100dd2 float:1.914806E38 double:1.053228663E-314;
        r4 = r0.findViewById(r4);
        r4 = (com.google.android.libraries.youtube.common.ui.YouTubeTextView) r4;
        r12.H = r4;
        r4 = 2131758545; // 0x7f100dd1 float:1.9148057E38 double:1.0532286623E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.ImageView) r4;
        r12.I = r4;
        r4 = 2131757829; // 0x7f100b05 float:1.9146605E38 double:1.0532283086E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.EditText) r4;
        r12.O = r4;
        r4 = 2131755889; // 0x7f100371 float:1.914267E38 double:1.05322735E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.EditText) r4;
        r12.P = r4;
        r4 = 2131758561; // 0x7f100de1 float:1.914809E38 double:1.05322867E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.EditText) r4;
        r12.Q = r4;
        r4 = 2131758560; // 0x7f100de0 float:1.9148087E38 double:1.0532286697E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.support.design.textfield.TextInputLayout) r4;
        r12.R = r4;
        r4 = 2131758562; // 0x7f100de2 float:1.9148092E38 double:1.0532286707E-314;
        r4 = r0.findViewById(r4);
        r4 = (com.google.android.libraries.youtube.edit.geo.EditLocation) r4;
        r12.S = r4;
        r4 = 2131758559; // 0x7f100ddf float:1.9148085E38 double:1.053228669E-314;
        r0 = r0.findViewById(r4);
        r0 = (com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner) r0;
        r12.M = r0;
        r0 = r12.M;
        r4 = defpackage.flr.UPLOAD;
        r0.a(r4);
        r0 = r12.M;
        r4 = r12.X;
        r0.a(r4);
        r0 = r12.J;
        r4 = new gtc;
        r4.<init>(r12);
        r0.a(r3, r4);
        r0 = r12.J;
        r3 = new gtf;
        r3.<init>(r12);
        r4 = 2131756651; // 0x7f10066b float:1.9144216E38 double:1.0532277266E-314;
        r0.a(r4, r3);
        r0 = r12.J;
        r3 = new gte;
        r3.<init>(r12);
        r4 = 2131758548; // 0x7f100dd4 float:1.9148063E38 double:1.053228664E-314;
        r0.a(r4, r3);
        r0 = r12.q;
        if (r0 == 0) goto L_0x02a1;
    L_0x0296:
        r0 = r0.F_();
        if (r0 == 0) goto L_0x02a1;
    L_0x029c:
        r12 = r12.J;
        r12.a(r4);
    L_0x02a1:
        r12 = r11.r;
        r12.y = r11;
        r12 = r11.p();
        r0 = r11.r;
        r12.a(r0);
        r12 = r11.p();
        r0 = r11.getResources();
        r3 = 2131558541; // 0x7f0d008d float:1.87424E38 double:1.053129847E-314;
        r0 = r0.getColor(r3);
        r12.a(r0);
        r12 = r11.g();
        r12.b(r2);
        r0 = 2130838017; // 0x7f020201 float:1.7281004E38 double:1.052773861E-314;
        r0 = defpackage.ra.a(r11, r0);
        r12.a(r0);
        r12.i();
        r12 = r11.p;
        r0 = defpackage.acwl.aw;
        r2 = r11.r;
        r2 = r2.e();
        r12.a(r0, r1, r2);
        return;
    L_0x02e2:
        r12 = new java.lang.IllegalStateException;
        r0 = "Helper UI has already been initialized";
        r12.<init>(r0);
        goto L_0x02eb;
    L_0x02ea:
        throw r12;
    L_0x02eb:
        goto L_0x02ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.upload.UploadActivity.onCreate(android.os.Bundle):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void b_(int i) {
        if (i == 2) {
            setTheme(R.style.f549Theme.YouTube.UploadActivity.Dark);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        u().a(this);
    }

    private final gsn u() {
        if (this.u == null) {
            this.u = ((gsp) xse.a(getApplication())).a(new dvk(this), new gtv(this));
        }
        return this.u;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("account_has_channel", this.x);
        bundle.putString("channel_checked_identity", this.y);
        bundle.putBundle("interaction_bundle", this.p.e());
        gso gso = this.r;
        bundle.putBoolean("helper_should_show_tags", gso.j);
        bundle.putString("helper_active_account_identity", gso.af);
        bundle.putLong("max_known_video_length_key", gso.s);
        bundle.putLong("required_length_for_verification_key", gso.t);
        bundle.putBoolean("user_verification_eligible_key", gso.r);
        aysp aysp = gso.k;
        byte[] bArr = null;
        bundle.putByteArray("helper_upload_active_account_header", aysp != null ? aysp.toByteArray() : null);
        azaj azaj = gso.l;
        if (azaj != null) {
            bArr = azaj.toByteArray();
        }
        bundle.putByteArray("helper_video_effects_settings", bArr);
        bundle.putBoolean("helper_was_cellular_dialog_dismissed_by_user", gso.n);
        bundle.putParcelable("helper_location_edit_renderer", new ajrb(gso.m));
        bundle.putBoolean("location_permission_enabled_key", gso.o);
        nt f = gso.a.f();
        vap vap = gso.q;
        if (vap != null && vap.F_()) {
            f.a(bundle, "verification_host_fragment_key", gso.q);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        this.v = true;
        if (this.n.a()) {
            v();
        } else {
            this.o.a((Activity) this, null, null);
        }
    }

    private final void v() {
        amqw.a(this.n.a());
        if (!this.n.c().a().equals(this.y)) {
            this.x = false;
            this.z = false;
        }
        if (this.x) {
            w();
        } else if (!this.z) {
            this.z = true;
            this.y = this.n.c().a();
            urf urf = this.l;
            if (urf.b.a()) {
                afpt c = urf.b.c();
                urf.c.a(c, new uri(urf, c, 2), null, 1);
            } else {
                urf.a.u_();
            }
        }
    }

    private final void w() {
        if (this.v && this.n.a()) {
            afpt c = this.n.c();
            if (this.w) {
                this.r.a(c);
                return;
            }
            gso gso = this.r;
            Object intent = getIntent();
            Object obj = this.o;
            amqw.a(obj);
            amqw.a(intent);
            gso.z = new gtq(gso, obj);
            gso.a(c);
            atst a = alyc.a(gso.Y, gso.ak);
            gso.g.b(acwc.UPLOAD_VIDEO_EDITING_COMPLETED_BUTTON, a);
            gso.g.b(acwc.UPLOAD_VIDEO_EDITING_CANCEL_BUTTON, a);
            gso.a(acwc.UPLOAD_VIDEO_ACTION_UPLOAD_INTENT, a);
            gso.a(acwc.UPLOAD_VIDEO_ACTION_SEND_MULTIPLE_INTENT, a);
            gso.a(acwc.UPLOAD_VIDEO_ACTION_SEND_INTENT, a);
            gso.a(acwc.UPLOAD_VIDEO_RECEIVED_EMPTY_INTENT, a);
            gso.a(acwc.UPLOAD_VIDEO_RECEIVED_PRIVATE_URI, a);
            gso.a(acwc.UPLOAD_VIDEO_RECEIVED_PUBLIC_URI, a);
            gso.al = alyd.a(intent);
            acvx acvx = gso.g;
            String str = gso.ak;
            amjp amjp = gso.A;
            ArrayList arrayList = new ArrayList();
            String action = intent.getAction();
            if (action != null) {
                aytx a2 = alyd.a(intent);
                if (action.equals("com.google.android.youtube.intent.action.UPLOAD") || action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                    acvx.a(3, new acvs(acwc.UPLOAD_VIDEO_ACTION_UPLOAD_INTENT), alyc.a(str, null));
                    Uri data = intent.getData();
                    if (data != null) {
                        if (intent.getData() != null) {
                            amjp.b = (Bitmap) intent.getParcelableExtra("data");
                        }
                        arrayList.add(new alyb(data, a2, str));
                    }
                } else {
                    String str2 = "android.intent.extra.STREAM";
                    Bundle extras;
                    if (action.equals("android.intent.action.SEND_MULTIPLE") && intent.hasExtra(str2)) {
                        acvx.a(3, new acvs(acwc.UPLOAD_VIDEO_ACTION_SEND_MULTIPLE_INTENT), atst.q);
                        extras = intent.getExtras();
                        if (extras != null) {
                            Object obj2 = extras.get(str2);
                            if (obj2 instanceof ArrayList) {
                                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(str2);
                                if (parcelableArrayListExtra != null) {
                                    int size = parcelableArrayListExtra.size();
                                    for (int i = 0; i < size; i++) {
                                        Parcelable parcelable = (Parcelable) parcelableArrayListExtra.get(i);
                                        if (parcelable instanceof Uri) {
                                            arrayList.add(new alyb((Uri) parcelable, a2, null));
                                        }
                                    }
                                }
                            } else if (obj2 instanceof String) {
                                CharSequence stringExtra = intent.getStringExtra(str2);
                                if (stringExtra != null) {
                                    for (String str3 : amqz.a(',').a(stringExtra)) {
                                        arrayList.add(new alyb(Uri.parse(str3), a2, null));
                                    }
                                }
                            }
                        }
                    } else if (action.equals("android.intent.action.SEND")) {
                        acvx.a(3, new acvs(acwc.UPLOAD_VIDEO_ACTION_SEND_INTENT), atst.q);
                        extras = intent.getExtras();
                        if (extras != null) {
                            Parcelable parcelable2 = extras.getParcelable(str2);
                            if (parcelable2 instanceof Uri) {
                                arrayList.add(new alyb((Uri) parcelable2, a2, null));
                            }
                        }
                    }
                }
            }
            gso.ai = arrayList;
            if (gso.ai.isEmpty()) {
                xtl.d("no media content uri(s)");
                gso.g.a(3, new acvs(acwc.UPLOAD_VIDEO_RECEIVED_EMPTY_INTENT), gso.e());
                xpr.a(gso.a, (int) R.string.error_generic, 1);
                gso.a.finish();
            } else {
                if (gso.ac) {
                    gso.ac = false;
                    gso.U = intent.getStringExtra("android.intent.extra.TITLE");
                    gso.V = intent.getStringExtra("android.intent.extra.SUBJECT");
                    gso.W = intent.getStringExtra("android.intent.extra.TEXT");
                    gso.O.setText(gso.U);
                    gso.P.setText(gso.V);
                    String str4 = gso.W;
                    if (!(str4 == null || str4.isEmpty())) {
                        gso.Q.setText(gso.W);
                        gso.j = true;
                    }
                }
                if (gso.j) {
                    gso.R.setVisibility(0);
                }
                gso.ae = true;
                gso.n();
            }
            this.w = true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        this.m.a((Object) this);
        this.m.c(new zjo());
    }

    /* Access modifiers changed, original: protected|final */
    public final void aY_() {
        super.aY_();
        this.q.f();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        super.onPause();
        this.m.c(new zjn());
        this.m.b(this);
        this.q.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        super.onStop();
        this.v = false;
        if (this.w) {
            this.r.j();
            this.w = false;
        }
        this.s.d();
    }

    public final boolean o() {
        this.r.i();
        return true;
    }

    public final void onBackPressed() {
        this.r.i();
    }

    /* Access modifiers changed, original: protected|final */
    public final Dialog e(int i) {
        Dialog dialog;
        gso gso = this.r;
        if (i != 1021) {
            dialog = null;
        } else {
            dialog = gso.d.d;
        }
        if (dialog == null) {
            return null;
        }
        return dialog;
    }

    public final void a(String[] strArr) {
        xpr.a(getCurrentFocus());
        Intent intent = new Intent();
        intent.putExtra("frontend_ids", strArr);
        setResult(-1, intent);
        finish();
        Intent intent2 = getIntent();
        if (intent2 == null || intent2.getBooleanExtra("navigate_to_my_uploads", true)) {
            avjh avjh;
            apxu apxu = (apxu) ((anxl) ((apxx) ((anxo) aaax.a("FEmy_videos").toBuilder())).build());
            anxr access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(avjd.b);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                avjh = (avjh) ((anxo) ((avjf) obj).toBuilder());
            } else {
                avjh = (avjh) avjf.h.createBuilder();
            }
            avjh.a(acwc.UPLOAD_VIDEO_EDITING_COMPLETED_BUTTON.dU);
            avjh.build();
            apxx apxx = (apxx) ((anxo) apxu.toBuilder());
            apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
            apxx = (apxx) ((anxo) this.p.a((apxu) ((anxl) apxx.build())).toBuilder());
            intent = this.t.a();
            intent.setFlags(67108864);
            intent.putExtra("navigation_endpoint", ((apxu) ((anxl) apxx.build())).toByteArray());
            startActivity(intent);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDestroy() {
        super.onDestroy();
        gso gso = this.r;
        if (gso != null) {
            gso.i = true;
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        alak alak = this.r.am;
        if (alak == null || !alak.a(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final acvx t() {
        return this.p;
    }

    public final void a(boolean z) {
        this.x = true;
        w();
    }

    public final void c() {
        this.x = true;
        w();
    }

    public final void u_() {
        this.z = false;
        v();
    }

    public final void v_() {
        finish();
    }

    public final /* synthetic */ Object n() {
        return u();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{uyw.class};
        } else if (i == 0) {
            int ordinal = ((uyw) obj).a.ordinal();
            if (ordinal != 1 && ordinal != 2) {
                return null;
            }
            if (this.n.a()) {
                v();
                return null;
            }
            finish();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
