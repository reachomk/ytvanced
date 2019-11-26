package com.google.android.libraries.youtube.comment.image;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.ex.photo.views.PhotoView;
import defpackage.acvx;
import defpackage.afnw;
import defpackage.akkq;
import defpackage.ampo;
import defpackage.amqp;
import defpackage.amqw;
import defpackage.ankx;
import defpackage.anuz;
import defpackage.anva;
import defpackage.anvd;
import defpackage.anve;
import defpackage.anvg;
import defpackage.nn;
import defpackage.tpm;
import defpackage.tpn;
import defpackage.tpo;
import defpackage.tpp;
import defpackage.whu;
import defpackage.whv;
import defpackage.wlg;
import defpackage.wlm;
import defpackage.wlp;
import defpackage.xev;
import defpackage.xfc;
import defpackage.xse;
import defpackage.xvt;
import java.util.Map;
import java.util.concurrent.Executor;

public class ImageViewerActivity extends nn implements OnLayoutChangeListener, wlp, xfc {
    public static Map k;
    public static wlm l;
    private TextView A;
    private wlg B;
    public PhotoView g;
    public View h;
    public View i;
    public ViewGroup j;
    public acvx m;
    public akkq n;
    public afnw o;
    public Executor p;
    private whv q;
    private ImageView r;
    private ImageView s;
    private ImageView t;
    private ImageView u;
    private TextView v;
    private ImageView w;
    private TextView x;
    private TextView y;
    private TextView z;

    public final void g() {
        finish();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0269  */
    public final void onCreate(android.os.Bundle r17) {
        /*
        r16 = this;
        r12 = r16;
        super.onCreate(r17);
        r0 = r16.h();
        r0.a(r12);
        r0 = r16.getWindow();
        r1 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r0.setFlags(r1, r1);
        r0 = r16.getWindow();
        r1 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r0.setFlags(r1, r1);
        r0 = 2131034682; // 0x7f05023a float:1.7679888E38 double:1.0528710265E-314;
        r12.setContentView(r0);
        r0 = 2131756932; // 0x7f100784 float:1.9144785E38 double:1.0532278654E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r12.j = r0;
        r0 = r16.getIntent();
        r0 = r0.getExtras();
        if (r0 == 0) goto L_0x0040;
    L_0x0039:
        r1 = "commentRenderer";
        r0 = r0.getByteArray(r1);
        goto L_0x0041;
    L_0x0040:
        r0 = 0;
    L_0x0041:
        r1 = new ajsn;	 Catch:{ aocg -> 0x004d }
        r1.<init>();	 Catch:{ aocg -> 0x004d }
        r0 = defpackage.aocf.mergeFrom(r1, r0);	 Catch:{ aocg -> 0x004d }
        r0 = (defpackage.ajsn) r0;	 Catch:{ aocg -> 0x004d }
        goto L_0x0054;
    L_0x004d:
        r0 = move-exception;
        r1 = "Unable to deserialize CommentRenderer.";
        defpackage.xtl.a(r1, r0);
        r0 = 0;
    L_0x0054:
        r1 = 2131756927; // 0x7f10077f float:1.9144775E38 double:1.053227863E-314;
        r1 = r12.findViewById(r1);
        r2 = r1.getViewTreeObserver();
        r3 = new whs;
        r3.<init>(r12, r1);
        r2.addOnGlobalLayoutListener(r3);
        r1 = 2131756933; // 0x7f100785 float:1.9144788E38 double:1.053227866E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r12.s = r1;
        r1 = r12.s;
        r2 = 2130839001; // 0x7f0205d9 float:1.7283E38 double:1.052774347E-314;
        r1.setImageResource(r2);
        r1 = r12.s;
        r14 = 0;
        r1.setVisibility(r14);
        r1 = r12.s;
        r2 = new who;
        r2.<init>(r12);
        r1.setOnClickListener(r2);
        r1 = 2131756935; // 0x7f100787 float:1.9144792E38 double:1.053227867E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r12.z = r1;
        r1 = 2131756039; // 0x7f100407 float:1.9142974E38 double:1.053227424E-314;
        r1 = r12.findViewById(r1);
        r2 = r16.getIntent();
        r3 = "authorText";
        r2 = r2.getCharSequenceExtra(r3);
        r3 = android.text.TextUtils.isEmpty(r2);
        r15 = 8;
        if (r3 != 0) goto L_0x00bc;
    L_0x00ae:
        r3 = r12.z;
        r3.setText(r2);
        r2 = r12.z;
        r2.setVisibility(r14);
        r1.setVisibility(r14);
        goto L_0x00c4;
    L_0x00bc:
        r2 = r12.z;
        r2.setVisibility(r15);
        r1.setVisibility(r15);
    L_0x00c4:
        r1 = 2131756936; // 0x7f100788 float:1.9144794E38 double:1.0532278674E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r12.y = r1;
        r1 = r16.getIntent();
        r2 = "timestamp";
        r1 = r1.getCharSequenceExtra(r2);
        r2 = r12.y;
        r2.setText(r1);
        r1 = 2131756934; // 0x7f100786 float:1.914479E38 double:1.0532278664E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r12.A = r1;
        r11 = 1;
        if (r0 != 0) goto L_0x00f2;
    L_0x00ec:
        r1 = r12.A;
        r1.setVisibility(r15);
        goto L_0x0117;
    L_0x00f2:
        r1 = r0.d;
        r2 = l;
        r2 = r2.a;
        r1 = defpackage.aabb.a(r1, r2, r14);
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 != 0) goto L_0x0112;
    L_0x0102:
        r2 = r12.A;
        r2.setText(r1);
        r1 = r12.A;
        r1.setSingleLine(r11);
        r1 = r12.A;
        r1.setVisibility(r14);
        goto L_0x0117;
    L_0x0112:
        r1 = r12.A;
        r1.setVisibility(r15);
    L_0x0117:
        r1 = 2131756939; // 0x7f10078b float:1.91448E38 double:1.053227869E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r12.v = r1;
        r1 = r16.getIntent();
        r2 = "likeCount";
        r1 = r1.getCharSequenceExtra(r2);
        r2 = r12.v;
        r2.setText(r1);
        if (r0 == 0) goto L_0x017b;
    L_0x0133:
        r1 = 2131756938; // 0x7f10078a float:1.9144798E38 double:1.0532278683E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r12.t = r1;
        r1 = 2131756940; // 0x7f10078c float:1.9144802E38 double:1.0532278693E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r12.u = r1;
        r1 = r16.getIntent();
        r2 = "isInDetailView";
        r4 = r1.getBooleanExtra(r2, r11);
        r1 = r0.h;
        r2 = r1.a;
        r1 = l;
        r3 = k;
        r6 = r12.t;
        r7 = r12.u;
        r8 = r12.v;
        r9 = r12.m;
        r5 = java.lang.Integer.valueOf(r11);
        r10 = "com.google.android.apps.youtube.app.endpoint.flags";
        r3.put(r10, r5);
        r10 = defpackage.acwi.a;
        r3.put(r10, r5);
        r10 = r1.f;
        r5 = r0;
        r13 = 1;
        r11 = r16;
        r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        goto L_0x017c;
    L_0x017b:
        r13 = 1;
    L_0x017c:
        r1 = 2131756941; // 0x7f10078d float:1.9144804E38 double:1.05322787E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r12.w = r1;
        r1 = r0.h;
        if (r1 == 0) goto L_0x018e;
    L_0x018b:
        r1 = r1.a;
        goto L_0x018f;
    L_0x018e:
        r1 = 0;
    L_0x018f:
        r2 = 4;
        if (r1 == 0) goto L_0x01c9;
    L_0x0192:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0197;
    L_0x0196:
        goto L_0x01c9;
    L_0x0197:
        r3 = r1.a;
        r3 = r3 & r13;
        if (r3 == 0) goto L_0x01a3;
    L_0x019c:
        r1 = r1.b;
        if (r1 != 0) goto L_0x01a4;
    L_0x01a0:
        r1 = defpackage.aphg.s;
        goto L_0x01a4;
    L_0x01a3:
        r1 = 0;
    L_0x01a4:
        if (r1 == 0) goto L_0x01c3;
    L_0x01a6:
        r2 = r12.w;
        r3 = r1.p;
        if (r3 != 0) goto L_0x01ae;
    L_0x01ac:
        r3 = defpackage.aodv.c;
    L_0x01ae:
        r3 = r3.b;
        r2.setContentDescription(r3);
        r2 = r12.w;
        r3 = new whq;
        r3.<init>(r12, r1);
        r2.setOnClickListener(r3);
        r1 = r12.w;
        r1.setVisibility(r14);
        goto L_0x01ce;
    L_0x01c3:
        r1 = r12.w;
        r1.setVisibility(r2);
        goto L_0x01ce;
    L_0x01c9:
        r1 = r12.w;
        r1.setVisibility(r2);
    L_0x01ce:
        r1 = 2131756942; // 0x7f10078e float:1.9144806E38 double:1.0532278703E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r12.x = r1;
        r0 = r0.h;
        if (r0 == 0) goto L_0x01e0;
    L_0x01dd:
        r0 = r0.a;
        goto L_0x01e1;
    L_0x01e0:
        r0 = 0;
    L_0x01e1:
        r1 = "";
        if (r0 == 0) goto L_0x0229;
    L_0x01e5:
        r0 = r0.b;
        if (r0 != 0) goto L_0x01ea;
    L_0x01e9:
        goto L_0x0229;
    L_0x01ea:
        r2 = r0.a;
        r2 = r2 & r13;
        if (r2 == 0) goto L_0x01f6;
    L_0x01ef:
        r0 = r0.b;
        if (r0 != 0) goto L_0x01f7;
    L_0x01f3:
        r0 = defpackage.aphg.s;
        goto L_0x01f7;
    L_0x01f6:
        r0 = 0;
    L_0x01f7:
        if (r0 == 0) goto L_0x020c;
    L_0x01f9:
        r2 = r0.a;
        r2 = r2 & 128;
        if (r2 == 0) goto L_0x0206;
    L_0x01ff:
        r0 = r0.g;
        if (r0 != 0) goto L_0x0207;
    L_0x0203:
        r0 = defpackage.arml.f;
        goto L_0x0207;
    L_0x0206:
        r0 = 0;
    L_0x0207:
        r0 = defpackage.ajqy.a(r0);
        goto L_0x020d;
    L_0x020c:
        r0 = 0;
    L_0x020d:
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x021e;
    L_0x0213:
        r1 = r12.x;
        r1.setText(r0);
        r0 = r12.x;
        r0.setVisibility(r14);
        goto L_0x0233;
    L_0x021e:
        r0 = r12.x;
        r0.setText(r1);
        r0 = r12.x;
        r0.setVisibility(r15);
        goto L_0x0233;
    L_0x0229:
        r0 = r12.x;
        r0.setText(r1);
        r0 = r12.x;
        r0.setVisibility(r15);
    L_0x0233:
        r0 = r16.getIntent();
        r1 = "shouldAnimate";
        r0 = r0.getBooleanExtra(r1, r14);
        r1 = new whp;
        r1.<init>(r12);
        if (r0 == 0) goto L_0x0269;
    L_0x0244:
        r0 = 2131756929; // 0x7f100781 float:1.914478E38 double:1.053227864E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r12.r = r0;
        r0 = r12.r;
        r0.setOnClickListener(r1);
        r0 = r12.r;
        r0.addOnLayoutChangeListener(r12);
        r0 = new wlg;
        r1 = r12.n;
        r2 = r12.o;
        r3 = r12.r;
        r4 = r12.p;
        r0.<init>(r1, r2, r3, r4);
        r12.B = r0;
        goto L_0x02ab;
    L_0x0269:
        r0 = 2131756928; // 0x7f100780 float:1.9144777E38 double:1.0532278634E-314;
        r0 = r12.findViewById(r0);
        r0 = (com.android.ex.photo.views.PhotoView) r0;
        r12.g = r0;
        r0 = r12.g;
        r0.d = r14;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.e = r2;
        r2 = r0.c;
        if (r2 == r13) goto L_0x0288;
    L_0x0280:
        r0.c = r13;
        r0.requestLayout();
        r0.invalidate();
    L_0x0288:
        r0 = r12.g;
        r0.g = r13;
        r0.f = r1;
        r0 = r16.getIntent();
        r1 = "imageUrl";
        r0 = r0.getStringExtra(r1);
        r1 = r12.g;
        r1.setTag(r0);
        r0 = a(r0);
        r1 = r12.n;
        r2 = new wht;
        r2.<init>(r12);
        r1.c(r0, r2);
    L_0x02ab:
        r0 = 2131756930; // 0x7f100782 float:1.9144781E38 double:1.0532278644E-314;
        r0 = r12.findViewById(r0);
        r12.h = r0;
        r0 = 2131756931; // 0x7f100783 float:1.9144783E38 double:1.053227865E-314;
        r0 = r12.findViewById(r0);
        r12.i = r0;
        r0 = r12.h;
        r0.setVisibility(r14);
        r0 = r12.i;
        r0.setVisibility(r14);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.comment.image.ImageViewerActivity.onCreate(android.os.Bundle):void");
    }

    public final void a(boolean z) {
        View decorView = getWindow().getDecorView();
        if (decorView != null) {
            if (z) {
                decorView.setSystemUiVisibility(1792);
                return;
            }
            decorView.setSystemUiVisibility(3846);
        }
    }

    private final whv h() {
        if (this.q == null) {
            this.q = ((whu) xse.a(getApplication())).c(new xev(this));
        }
        return this.q;
    }

    private static Uri a(String str) {
        Uri d = xvt.d(str);
        tpn tpn = new tpn();
        tpm tpm = new tpm(d);
        amqw.a(true);
        if (!anvg.a(tpm.toString())) {
            return d;
        }
        anve tpo = new tpo();
        tpo.a(0);
        anvd anvd = tpo.a;
        amqp b = amqp.b(Boolean.valueOf(true));
        if (!b.a()) {
            anvd.c = ampo.a;
        } else if (((Boolean) b.b()).booleanValue()) {
            anvd.c = b;
        } else {
            anvd.c = ampo.a;
            anvd.d = false;
        }
        tpo.a.d = false;
        try {
            return (Uri) anva.a(tpo, new tpm(d), false);
        } catch (anuz e) {
            throw new tpp(e);
        } catch (tpp e2) {
            ankx.a(e2);
            return d;
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String stringExtra = getIntent().getStringExtra("imageUrl");
        if (!TextUtils.isEmpty(stringExtra) && this.r != null) {
            Uri a = a(stringExtra);
            this.r.setTag(stringExtra);
            this.B.a(a);
            this.r.removeOnLayoutChangeListener(this);
        }
    }

    public final /* synthetic */ Object n() {
        return h();
    }
}
