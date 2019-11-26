package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.textfield.TextInputEditText;
import android.support.design.textfield.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/* renamed from: gyb */
public final class gyb extends nd {
    public apxu Z;
    public ImageButton aa;
    public TextView ab;
    public TextInputEditText ac;
    public TextInputLayout ad;
    public aeh ae;
    public CharSequence af;
    public View ag;
    public aaas ah;
    public gyj ai;
    public acwa aj;
    public afpu ak;
    public afqe al;
    public xoi am;
    private ImageButton an;
    private TextView ao;
    private Toolbar ap;
    private byte[] aq;
    private View ar;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((gyg) xse.a(p())).a(this);
        if (xss.c(M_()) < 3) {
            a(1, 0);
        }
    }

    /* JADX WARNING: Missing block: B:11:0x004b, code skipped:
            if ((((com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint) r0).a & 1) == 0) goto L_0x004d;
     */
    public final android.view.View a(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
        r4 = this;
        if (r7 != 0) goto L_0x0004;
    L_0x0002:
        r7 = r4.j;
    L_0x0004:
        r0 = "navigation_endpoint";
        r0 = r7.getByteArray(r0);
        r0 = defpackage.aabc.a(r0);
        r4.Z = r0;
        r0 = r4.Z;
        r1 = 0;
        if (r0 == 0) goto L_0x004d;
    L_0x0015:
        r2 = com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint.flagEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x004d;
    L_0x0029:
        r0 = r4.Z;
        r2 = com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint.flagEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x0041;
    L_0x003e:
        r0 = r2.b;
        goto L_0x0045;
    L_0x0041:
        r0 = r2.a(r0);
    L_0x0045:
        r0 = (com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint) r0;
        r0 = r0.a;
        r0 = r0 & 1;
        if (r0 != 0) goto L_0x005a;
    L_0x004d:
        r0 = r4.p();
        r2 = 2131952122; // 0x7f1301fa float:1.9540678E38 double:1.053324302E-314;
        defpackage.xpr.a(r0, r2, r1);
        r4.dismiss();
    L_0x005a:
        r0 = 2131035308; // 0x7f0504ac float:1.7681158E38 double:1.052871336E-314;
        r5 = r5.inflate(r0, r6, r1);
        r4.ag = r5;
        r5 = r4.ag;
        r6 = 2131758277; // 0x7f100cc5 float:1.9147513E38 double:1.05322853E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.support.v7.widget.Toolbar) r5;
        r4.ap = r5;
        r5 = r4.ag;
        r6 = 2131758278; // 0x7f100cc6 float:1.9147515E38 double:1.0532285304E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.widget.ImageButton) r5;
        r4.an = r5;
        r5 = r4.ag;
        r6 = 2131758279; // 0x7f100cc7 float:1.9147518E38 double:1.053228531E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.widget.ImageButton) r5;
        r4.aa = r5;
        r5 = r4.ag;
        r6 = 2131757277; // 0x7f1008dd float:1.9145485E38 double:1.053228036E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.widget.TextView) r5;
        r4.ao = r5;
        r5 = r4.ag;
        r6 = 2131758283; // 0x7f100ccb float:1.9147526E38 double:1.053228533E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.widget.TextView) r5;
        r4.ab = r5;
        r5 = r4.ag;
        r6 = 2131758282; // 0x7f100cca float:1.9147524E38 double:1.0532285324E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.support.design.textfield.TextInputEditText) r5;
        r4.ac = r5;
        r5 = r4.ag;
        r6 = 2131758281; // 0x7f100cc9 float:1.9147522E38 double:1.053228532E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.support.design.textfield.TextInputLayout) r5;
        r4.ad = r5;
        r5 = r4.ao;
        r6 = "send_report_text";
        r0 = r7.getCharSequence(r6);
        r5.setText(r0);
        r5 = r4.ao;
        r6 = r7.getCharSequence(r6);
        r5.setContentDescription(r6);
        r5 = r4.ab;
        r6 = "footer_text";
        r0 = r7.getCharSequence(r6);
        r5.setText(r0);
        r5 = r4.ab;
        r6 = r7.getCharSequence(r6);
        r5.setContentDescription(r6);
        r5 = r4.ac;
        r6 = "text_placeholder";
        r0 = r7.getCharSequence(r6);
        r5.setHint(r0);
        r5 = r4.ac;
        r6 = r7.getCharSequence(r6);
        r5.setContentDescription(r6);
        r5 = "alert_text";
        r5 = r7.getCharSequence(r5);
        r4.af = r5;
        r5 = "ve_tracking_params";
        r5 = r7.getByteArray(r5);
        r4.aq = r5;
        r5 = r4.ag;
        r6 = 2131758280; // 0x7f100cc8 float:1.914752E38 double:1.0532285314E-314;
        r5 = r5.findViewById(r6);
        r4.ar = r5;
        r5 = r4.ap;
        r6 = r4.q();
        r7 = 2131559547; // 0x7f0d047b float:1.8744441E38 double:1.053130344E-314;
        r6 = r6.getColor(r7);
        r5.setBackgroundColor(r6);
        r5 = r4.ao;
        r6 = r4.q();
        r7 = 2131559549; // 0x7f0d047d float:1.8744445E38 double:1.053130345E-314;
        r6 = r6.getColor(r7);
        r5.setTextColor(r6);
        r5 = r4.an;
        r6 = r4.p();
        r7 = 2131558457; // 0x7f0d0039 float:1.874223E38 double:1.0531298057E-314;
        r6 = defpackage.ra.c(r6, r7);
        r7 = android.graphics.PorterDuff.Mode.MULTIPLY;
        r5.setColorFilter(r6, r7);
        r5 = android.os.Build.VERSION.SDK_INT;
        r6 = 21;
        if (r5 >= r6) goto L_0x0153;
    L_0x014d:
        r5 = r4.ar;
        r5.setVisibility(r1);
        goto L_0x0164;
    L_0x0153:
        r5 = r4.ap;
        r6 = r4.q();
        r7 = 2131626944; // 0x7f0e0bc0 float:1.8881138E38 double:1.053163643E-314;
        r6 = r6.getDimensionPixelSize(r7);
        r6 = (float) r6;
        r5.setElevation(r6);
    L_0x0164:
        r5 = r4.ac;
        r6 = new gyh;
        r6.<init>(r4);
        r5.addTextChangedListener(r6);
        r5 = r4.aa;
        r6 = new gya;
        r6.<init>(r4);
        r5.setOnClickListener(r6);
        r5 = r4.an;
        r6 = new gyd;
        r6.<init>(r4);
        r5.setOnClickListener(r6);
        r5 = r4.ag;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyb.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void W_() {
        super.W_();
        this.aj.t().a(this.aq);
        if (this.ak.a()) {
            W();
            return;
        }
        this.c.hide();
        this.al.a(p(), null, new gyf(this));
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ai.aA_();
        this.aj.t().a();
    }

    /* Access modifiers changed, original: final */
    public final void W() {
        this.ag.getViewTreeObserver().addOnGlobalLayoutListener(new gye(this));
    }
}
