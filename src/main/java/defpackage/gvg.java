package defpackage;

import android.app.AlertDialog;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: gvg */
public final class gvg extends fja implements uww, xcp {
    private View aA;
    private View aB;
    private View aC;
    private View aD;
    private View aE;
    private boolean aF;
    private boolean aG;
    public apnn ae;
    public afpu af;
    public xci ag;
    public xoi ah;
    public aaqn ai;
    public akkq aj;
    public uwx ak;
    public aaas al;
    public aldg am;
    public LoadingFrameLayout an;
    public TextView ao;
    public aaj ap;
    public int aq;
    private View ar;
    private ImageView as;
    private TextView at;
    private TextView au;
    private ImageView av;
    private TextView aw;
    private ImageView ax;
    private ImageView ay;
    private ImageView az;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((gvz) xse.a(this.a)).a(this);
        this.ap = new gvj();
        this.aq = 0;
        if (bundle != null) {
            this.aq = bundle.getInt("arg_photo_type_update", 0);
            this.aF = bundle.getBoolean("arg_has_profile_photo_endpoint");
            this.aG = bundle.getBoolean("arg_has_channel_banner_endpoint");
            String str = "arg_channel_profile_editor_renderer";
            if (bundle.containsKey(str)) {
                try {
                    this.ae = (apnn) anxl.parseFrom(apnn.i, bundle.getByteArray(str), anxa.c());
                } catch (anyg unused) {
                }
            }
        }
    }

    public final void e(Bundle bundle) {
        apnn apnn = this.ae;
        if (apnn != null) {
            bundle.putByteArray("arg_channel_profile_editor_renderer", apnn.toByteArray());
        }
        bundle.putInt("arg_photo_type_update", this.aq);
        bundle.putBoolean("arg_has_profile_photo_endpoint", this.aF);
        bundle.putBoolean("arg_has_channel_banner_endpoint", this.aG);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an = (LoadingFrameLayout) layoutInflater.inflate(R.layout.channel_profile_editor_fragment, viewGroup, false);
        this.ar = this.an.findViewById(R.id.add_description);
        this.as = (ImageView) this.an.findViewById(R.id.add_description_button);
        this.at = (TextView) this.an.findViewById(R.id.description_preview_title);
        this.au = (TextView) this.an.findViewById(R.id.description_preview_text);
        this.av = (ImageView) this.an.findViewById(R.id.description_edit_button);
        this.aw = (TextView) this.an.findViewById(R.id.name_preview_title);
        this.ao = (TextView) this.an.findViewById(R.id.name_preview_text);
        this.ax = (ImageView) this.an.findViewById(R.id.name_edit_button);
        this.ay = (ImageView) this.an.findViewById(R.id.profile_photo_image);
        this.aA = this.an.findViewById(R.id.profile_photo_camera_icon);
        this.aC = this.an.findViewById(R.id.profile_photo_progress_bar);
        this.az = (ImageView) this.an.findViewById(R.id.channel_banner_image);
        this.aB = this.an.findViewById(R.id.channel_banner_camera_icon);
        this.aD = this.an.findViewById(R.id.channel_banner_progress_bar);
        this.aE = this.an.findViewById(R.id.separator);
        this.an.a(new gvm(this));
        if (this.ae != null) {
            ak();
            this.an.b();
        } else {
            this.an.a();
            f();
        }
        return this.an;
    }

    public final void W_() {
        super.W_();
        if (this.af.a()) {
            this.ag.a((Object) this);
            this.ak.a((uww) this);
            d(this.ak.g());
            return;
        }
        this.ac.a(false);
    }

    public final void B() {
        super.B();
        if (!this.af.a()) {
            this.ac.a(false);
        }
    }

    public final void ad_() {
        super.ad_();
        xpr.a(this.K.findFocus());
    }

    public final void N_() {
        super.N_();
        this.ag.b(this);
        this.ak.b(this);
    }

    public final ezz W() {
        if (this.c == null) {
            faf i = this.ab.i();
            i.a = q().getString(R.string.channel_settings);
            this.c = i.a();
        }
        return this.c;
    }

    public final void d(int i) {
        if (i == 1) {
            this.aA.setVisibility(4);
            this.aC.setVisibility(4);
            this.aB.setVisibility(4);
            this.aD.setVisibility(4);
            f(this.aq);
        } else if (i == 2) {
            f();
        } else {
            e(1);
            e(2);
        }
    }

    public final void f() {
        aaqn aaqn = this.ai;
        aarc aarc = new aarc(aaqn.c, aaqn.d);
        aaqn = this.ai;
        gvp gvp = new gvp(this);
        if (aaqn.h == null) {
            aaqn.h = new aarf(aaqn.a, aaqn.e);
        }
        aaqn.h.b(aarc, gvp);
    }

    private static apnt a(apnn apnn) {
        apnv apnv = apnn.d;
        if (apnv == null) {
            apnv = apnv.c;
        }
        if (apnv.a != 105917786) {
            return null;
        }
        apnt apnt;
        apnv apnv2 = apnn.d;
        if (apnv2 == null) {
            apnv2 = apnv.c;
        }
        if (apnv2.a == 105917786) {
            apnt = (apnt) apnv2.b;
        } else {
            apnt = apnt.e;
        }
        return apnt;
    }

    private static apnt b(apnn apnn) {
        apnv apnv = apnn.e;
        if (apnv == null) {
            apnv = apnv.c;
        }
        if (apnv.a != 105917786) {
            return null;
        }
        apnt apnt;
        apnv apnv2 = apnn.e;
        if (apnv2 == null) {
            apnv2 = apnv.c;
        }
        if (apnv2.a == 105917786) {
            apnt = (apnt) apnv2.b;
        } else {
            apnt = apnt.e;
        }
        return apnt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e7 A:{LOOP_END, LOOP:0: B:124:0x02e5->B:125:0x02e7} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e7 A:{LOOP_END, LOOP:0: B:124:0x02e5->B:125:0x02e7} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0304  */
    public final void ak() {
        /*
        r11 = this;
        r0 = r11.ae;
        r1 = r0.a;
        r2 = 1;
        r1 = r1 & r2;
        r3 = 109219466; // 0x6828e8a float:4.911001E-35 double:5.3961586E-316;
        r4 = 0;
        if (r1 == 0) goto L_0x002b;
    L_0x000c:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0012;
    L_0x0010:
        r0 = defpackage.apnr.c;
    L_0x0012:
        r0 = r0.a;
        if (r0 == r3) goto L_0x0017;
    L_0x0016:
        goto L_0x002b;
    L_0x0017:
        r0 = r11.ae;
        r0 = r0.b;
        if (r0 != 0) goto L_0x001f;
    L_0x001d:
        r0 = defpackage.apnr.c;
    L_0x001f:
        r1 = r0.a;
        if (r1 != r3) goto L_0x0028;
    L_0x0023:
        r0 = r0.b;
        r0 = (defpackage.apnp) r0;
        goto L_0x002c;
    L_0x0028:
        r0 = defpackage.apnp.d;
        goto L_0x002c;
    L_0x002b:
        r0 = r4;
    L_0x002c:
        r1 = r11.ae;
        r5 = r1.a;
        r6 = 2;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x0053;
    L_0x0034:
        r1 = r1.c;
        if (r1 != 0) goto L_0x003a;
    L_0x0038:
        r1 = defpackage.apnr.c;
    L_0x003a:
        r1 = r1.a;
        if (r1 == r3) goto L_0x003f;
    L_0x003e:
        goto L_0x0053;
    L_0x003f:
        r1 = r11.ae;
        r1 = r1.c;
        if (r1 != 0) goto L_0x0047;
    L_0x0045:
        r1 = defpackage.apnr.c;
    L_0x0047:
        r5 = r1.a;
        if (r5 != r3) goto L_0x0050;
    L_0x004b:
        r1 = r1.b;
        r1 = (defpackage.apnp) r1;
        goto L_0x0054;
    L_0x0050:
        r1 = defpackage.apnp.d;
        goto L_0x0054;
    L_0x0053:
        r1 = r4;
    L_0x0054:
        r3 = 0;
        r5 = 8;
        if (r0 != 0) goto L_0x0069;
    L_0x0059:
        if (r1 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0069;
    L_0x005c:
        r0 = r11.an;
        r1 = 2131755891; // 0x7f100373 float:1.9142674E38 double:1.053227351E-314;
        r0 = r0.findViewById(r1);
        r0.setVisibility(r5);
        goto L_0x008e;
    L_0x0069:
        if (r0 == 0) goto L_0x0073;
    L_0x006b:
        r7 = r0.a;
        r7 = r7 & r6;
        if (r7 != 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0073;
    L_0x0071:
        r7 = 1;
        goto L_0x0074;
    L_0x0073:
        r7 = 0;
    L_0x0074:
        r11.aF = r7;
        r7 = r11.ay;
        r8 = r11.aA;
        r11.a(r0, r7, r8, r2);
        if (r1 == 0) goto L_0x0084;
    L_0x007f:
        r0 = r1.a;
        r0 = r0 & r6;
        if (r0 != 0) goto L_0x0085;
    L_0x0084:
        r2 = 0;
    L_0x0085:
        r11.aG = r2;
        r0 = r11.az;
        r2 = r11.aB;
        r11.a(r1, r0, r2, r6);
    L_0x008e:
        r0 = r11.ae;
        r0 = defpackage.gvg.a(r0);
        r1 = 17039360; // 0x1040000 float:2.424457E-38 double:8.4185624E-317;
        r2 = 17039370; // 0x104000a float:2.42446E-38 double:8.4185673E-317;
        if (r0 != 0) goto L_0x00ac;
    L_0x009b:
        r0 = r11.aw;
        r0.setVisibility(r5);
        r0 = r11.ao;
        r0.setVisibility(r5);
        r0 = r11.ax;
        r0.setVisibility(r5);
        goto L_0x0197;
    L_0x00ac:
        r0 = r11.aw;
        r0.setVisibility(r3);
        r0 = r11.ao;
        r0.setVisibility(r3);
        r0 = r11.ax;
        r0.setVisibility(r3);
        r0 = r11.ae;
        r0 = defpackage.gvg.a(r0);
        r6 = r11.aw;
        r7 = r0.b;
        r6.setText(r7);
        r6 = r11.ao;
        r7 = r0.a;
        r7 = r7 & 4;
        if (r7 == 0) goto L_0x00d7;
    L_0x00d0:
        r7 = r0.c;
        if (r7 != 0) goto L_0x00d8;
    L_0x00d4:
        r7 = defpackage.arml.f;
        goto L_0x00d8;
    L_0x00d7:
        r7 = r4;
    L_0x00d8:
        r7 = defpackage.ajqy.a(r7);
        r6.setText(r7);
        r6 = r0.d;
        if (r6 != 0) goto L_0x00e5;
    L_0x00e3:
        r6 = defpackage.apxu.d;
    L_0x00e5:
        r7 = com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint;
        r7 = defpackage.anxl.checkIsLite(r7);
        r6.a(r7);
        r6 = r6.h;
        r8 = r7.d;
        r6 = r6.b(r8);
        if (r6 != 0) goto L_0x00fb;
    L_0x00f8:
        r6 = r7.b;
        goto L_0x00ff;
    L_0x00fb:
        r6 = r7.a(r6);
    L_0x00ff:
        r6 = (com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) r6;
        r6 = r6.b;
        if (r6 != 0) goto L_0x0107;
    L_0x0105:
        r6 = defpackage.apog.c;
    L_0x0107:
        r6 = r6.a;
        r7 = 105915641; // 0x65024f9 float:3.9147615E-35 double:5.23292796E-316;
        if (r6 == r7) goto L_0x0115;
    L_0x010e:
        r0 = r11.ax;
        r0.setVisibility(r5);
        goto L_0x0197;
    L_0x0115:
        r6 = r11.ax;
        r6.setVisibility(r3);
        r6 = r11.a;
        r6 = android.view.LayoutInflater.from(r6);
        r8 = 2131034303; // 0x7f0500bf float:1.767912E38 double:1.052870839E-314;
        r6 = r6.inflate(r8, r4);
        r8 = new android.app.AlertDialog$Builder;
        r9 = r11.a;
        r8.<init>(r9);
        r8 = r8.setView(r6);
        r9 = r11.a;
        r9 = r9.getString(r2);
        r8 = r8.setPositiveButton(r9, r4);
        r9 = r11.a;
        r9 = r9.getString(r1);
        r8 = r8.setNegativeButton(r9, r4);
        r8 = r8.create();
        r9 = r11.ax;
        r10 = new gvr;
        r10.<init>(r11, r8);
        r9.setOnClickListener(r10);
        r0 = r0.d;
        if (r0 != 0) goto L_0x015a;
    L_0x0158:
        r0 = defpackage.apxu.d;
    L_0x015a:
        r9 = com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint;
        r9 = defpackage.anxl.checkIsLite(r9);
        r0.a(r9);
        r0 = r0.h;
        r10 = r9.d;
        r0 = r0.b(r10);
        if (r0 != 0) goto L_0x0170;
    L_0x016d:
        r0 = r9.b;
        goto L_0x0174;
    L_0x0170:
        r0 = r9.a(r0);
    L_0x0174:
        r0 = (com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) r0;
        r0 = r0.b;
        if (r0 != 0) goto L_0x017c;
    L_0x017a:
        r0 = defpackage.apog.c;
    L_0x017c:
        r9 = r0.a;
        if (r9 != r7) goto L_0x0185;
    L_0x0180:
        r0 = r0.b;
        r0 = (defpackage.apoi) r0;
        goto L_0x0187;
    L_0x0185:
        r0 = defpackage.apoi.f;
    L_0x0187:
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.apol) r0;
        r7 = new gvq;
        r7.<init>(r11, r6, r0);
        r8.setOnShowListener(r7);
    L_0x0197:
        r0 = r11.ae;
        r0 = defpackage.gvg.b(r0);
        if (r0 != 0) goto L_0x01b5;
    L_0x019f:
        r0 = r11.at;
        r0.setVisibility(r5);
        r0 = r11.au;
        r0.setVisibility(r5);
        r0 = r11.av;
        r0.setVisibility(r5);
        r0 = r11.ar;
        r0.setVisibility(r5);
        goto L_0x0286;
    L_0x01b5:
        r0 = r11.ae;
        r0 = defpackage.gvg.b(r0);
        r6 = r0.d;
        if (r6 == 0) goto L_0x01c0;
    L_0x01bf:
        goto L_0x01c2;
    L_0x01c0:
        r6 = defpackage.apxu.d;
    L_0x01c2:
        r7 = com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint;
        r7 = defpackage.anxl.checkIsLite(r7);
        r6.a(r7);
        r6 = r6.h;
        r8 = r7.d;
        r6 = r6.b(r8);
        if (r6 != 0) goto L_0x01d8;
    L_0x01d5:
        r6 = r7.b;
        goto L_0x01dc;
    L_0x01d8:
        r6 = r7.a(r6);
    L_0x01dc:
        r6 = (com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) r6;
        r6 = r6.b;
        if (r6 != 0) goto L_0x01e4;
    L_0x01e2:
        r6 = defpackage.apog.c;
    L_0x01e4:
        r6 = r6.a;
        r7 = r0.a;
        r7 = r7 & 4;
        r8 = 105915776; // 0x6502580 float:3.9148003E-35 double:5.23293463E-316;
        if (r7 == 0) goto L_0x0220;
    L_0x01ef:
        r7 = r11.ar;
        r7.setVisibility(r5);
        r7 = r11.at;
        r9 = r0.b;
        r7.setText(r9);
        r7 = r11.at;
        r7.setVisibility(r3);
        r7 = r11.au;
        r9 = r0.c;
        if (r9 != 0) goto L_0x0208;
    L_0x0206:
        r9 = defpackage.arml.f;
    L_0x0208:
        r9 = defpackage.ajqy.a(r9);
        r7.setText(r9);
        r7 = r11.au;
        r7.setVisibility(r3);
        r7 = r11.av;
        if (r6 == r8) goto L_0x021b;
    L_0x0218:
        r6 = 8;
        goto L_0x021c;
    L_0x021b:
        r6 = 0;
    L_0x021c:
        r7.setVisibility(r6);
        goto L_0x023a;
    L_0x0220:
        r7 = r11.at;
        r7.setVisibility(r5);
        r7 = r11.au;
        r7.setVisibility(r5);
        r7 = r11.av;
        r7.setVisibility(r5);
        r7 = r11.ar;
        if (r6 == r8) goto L_0x0236;
    L_0x0233:
        r6 = 8;
        goto L_0x0237;
    L_0x0236:
        r6 = 0;
    L_0x0237:
        r7.setVisibility(r6);
    L_0x023a:
        r6 = r11.a;
        r6 = android.view.LayoutInflater.from(r6);
        r7 = 2131034300; // 0x7f0500bc float:1.7679114E38 double:1.0528708377E-314;
        r6 = r6.inflate(r7, r4);
        r7 = new android.app.AlertDialog$Builder;
        r8 = r11.a;
        r7.<init>(r8);
        r7 = r7.setView(r6);
        r8 = r11.a;
        r2 = r8.getString(r2);
        r2 = r7.setPositiveButton(r2, r4);
        r7 = r11.a;
        r1 = r7.getString(r1);
        r1 = r2.setNegativeButton(r1, r4);
        r1 = r1.create();
        r2 = r11.as;
        r7 = new gvu;
        r7.<init>(r11, r1);
        r2.setOnClickListener(r7);
        r2 = r11.av;
        r7 = new gvi;
        r7.<init>(r11, r1);
        r2.setOnClickListener(r7);
        r2 = new gvl;
        r2.<init>(r11, r0, r6);
        r1.setOnShowListener(r2);
    L_0x0286:
        r0 = r11.ae;
        r0 = defpackage.gvg.a(r0);
        if (r0 != 0) goto L_0x029c;
    L_0x028e:
        r0 = r11.ae;
        r0 = defpackage.gvg.b(r0);
        if (r0 != 0) goto L_0x029c;
    L_0x0296:
        r0 = r11.aE;
        r0.setVisibility(r5);
        goto L_0x02a1;
    L_0x029c:
        r0 = r11.aE;
        r0.setVisibility(r3);
    L_0x02a1:
        r0 = r11.an;
        r1 = 2131755906; // 0x7f100382 float:1.9142704E38 double:1.0532273585E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r1 = r11.ae;
        r2 = r1.a;
        r2 = r2 & 16;
        if (r2 == 0) goto L_0x02bb;
    L_0x02b4:
        r1 = r1.f;
        if (r1 != 0) goto L_0x02bc;
    L_0x02b8:
        r1 = defpackage.arml.f;
        goto L_0x02bc;
    L_0x02bb:
        r1 = r4;
    L_0x02bc:
        r1 = defpackage.ajqy.a(r1);
        r0.setText(r1);
        r0 = r11.an;
        r1 = 2131755907; // 0x7f100383 float:1.9142707E38 double:1.053227359E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.LinearLayout) r0;
        r0.removeAllViews();
        r1 = new gvy;
        r2 = r11.a;
        r5 = r11.al;
        r6 = r11.ae;
        r6 = r6.g;
        r7 = r11.am;
        r1.<init>(r2, r5, r6, r7);
        r2 = r1.getCount();
        r5 = 0;
    L_0x02e5:
        if (r5 >= r2) goto L_0x02f1;
    L_0x02e7:
        r6 = r1.getView(r5, r4, r0);
        r0.addView(r6);
        r5 = r5 + 1;
        goto L_0x02e5;
    L_0x02f1:
        r0 = r11.an;
        r1 = 2131755908; // 0x7f100384 float:1.9142709E38 double:1.0532273595E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r1 = r11.ae;
        r2 = r1.a;
        r2 = r2 & 32;
        if (r2 == 0) goto L_0x030a;
    L_0x0304:
        r4 = r1.h;
        if (r4 != 0) goto L_0x030a;
    L_0x0308:
        r4 = defpackage.arml.f;
    L_0x030a:
        r1 = r11.al;
        r1 = defpackage.aabb.a(r4, r1, r3);
        defpackage.xpr.a(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvg.ak():void");
    }

    private final void a(apnp apnp, ImageView imageView, View view, int i) {
        if (apnp == null || (apnp.a & 2) == 0) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
            view.setOnClickListener(new gvo(this, i, apnp));
        }
        if (apnp == null || (apnp.a & 1) == 0) {
            e(i);
            gvg.a(imageView, i);
            return;
        }
        f(i);
        akkq akkq = this.aj;
        aygk aygk = apnp.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk, akko.h().a(new gvw(this, i)).a());
    }

    public static void a(ImageView imageView, int i) {
        if (i == 1) {
            imageView.setBackground(null);
            imageView.setImageResource(R.drawable.missing_avatar);
        } else if (i == 2) {
            imageView.setImageDrawable(null);
            imageView.setBackgroundResource(R.drawable.ic_default_channel_placeholder);
        } else {
            throw new IllegalArgumentException("Unknown photo type");
        }
    }

    public final void e(int i) {
        View view;
        View view2;
        ImageView imageView;
        boolean z;
        if (i != 1) {
            view = this.aB;
            view2 = this.aD;
            imageView = this.az;
            z = this.aG;
        } else {
            view = this.aA;
            view2 = this.aC;
            imageView = this.ay;
            z = this.aF;
        }
        view2.setVisibility(4);
        if (this.ak.g() == 1) {
            view.setVisibility(4);
        } else if (z) {
            imageView.setColorFilter(1291845632, Mode.DARKEN);
            view.setVisibility(0);
        } else {
            imageView.setColorFilter(null);
            view.setVisibility(4);
        }
    }

    private final void f(int i) {
        View view;
        View view2;
        ImageView imageView;
        boolean z;
        if (i != 1) {
            view = this.aB;
            view2 = this.aD;
            imageView = this.az;
            z = this.aG;
        } else {
            view = this.aA;
            view2 = this.aC;
            imageView = this.ay;
            z = this.aF;
        }
        view.setVisibility(4);
        view2.setVisibility(0);
        if (z) {
            imageView.setColorFilter(-1291845632, Mode.DARKEN);
        } else {
            imageView.setColorFilter(null);
        }
    }

    public final void a(AlertDialog alertDialog) {
        alertDialog.show();
        alertDialog.getWindow().setLayout((int) this.a.getResources().getDimension(R.dimen.channel_edit_dialog_width), -2);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqh.class};
        } else if (i == 0) {
            this.ac.a(false);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
