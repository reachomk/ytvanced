package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;

/* renamed from: abst */
public final class abst extends nd implements abrt, OnShowListener {
    public akvz Z;
    public akvz aa;
    public abrq ab;
    public int ac;
    public int ad;
    public Integer ae;
    private Activity af;
    private View ag;
    private Object ah;
    private akot ai;
    private akvz aj;
    private apxu ak;

    public final void a(Activity activity) {
        super.a(activity);
        this.af = activity;
    }

    public final void b(Bundle bundle) {
        akvz akvz;
        super.b(bundle);
        ((absv) xse.a(this.af)).a(this);
        a(2, (int) R.style.show_live_chat_item_dialog);
        bundle = this.j;
        if (this.ab.c) {
            akvz = this.aa;
        } else {
            akvz = this.Z;
        }
        this.aj = akvz;
        this.aj.a(ajxa.class);
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray("applied_action");
            if (byteArray != null) {
                try {
                    this.ak = (apxu) anxl.parseFrom(apxu.d, byteArray, anxa.c());
                } catch (anyg unused) {
                }
            }
            byte[] byteArray2 = bundle.getByteArray("endpoint");
            if (byteArray2 != null) {
                try {
                    ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint = (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint) anxl.parseFrom(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.c, byteArray2);
                    if (!(showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint == null || (showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a & 1) == 0)) {
                        audp audp = showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.b;
                        if (audp == null) {
                            audp = audp.c;
                        }
                        int i = audp.a;
                        Object obj = i == 117300536 ? (auej) audp.b : i != 117300816 ? i != 129492606 ? i != 130661514 ? i != 132496275 ? i != 133279312 ? i != 146948953 ? i != 146966970 ? i != 165252689 ? i != 232396290 ? i == 197064214 ? (aufj) audp.b : null : (audt) audp.b : (auel) audp.b : (audn) audp.b : (auef) audp.b : (audx) audp.b : (aued) audp.b : (audr) audp.b : (audv) audp.b : (aueh) audp.b;
                        this.ah = obj;
                        if (this.ah != null) {
                            return;
                        }
                    }
                } catch (anyg unused2) {
                }
            }
        }
        dismiss();
    }

    public final void W_() {
        super.W_();
        a();
        this.ab.a(this);
        if (this.ab.c) {
            Window window = this.c.getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    public final void N_() {
        super.N_();
        this.ab.b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    public final android.view.View a(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
        r6 = this;
        r7 = r7.getContext();
        r8 = new android.widget.FrameLayout;
        r8.<init>(r7);
        r9 = new android.view.ViewGroup$LayoutParams;
        r0 = -1;
        r9.<init>(r0, r0);
        r8.setLayoutParams(r9);
        r9 = new abss;
        r9.<init>(r6);
        r8.setOnClickListener(r9);
        r9 = r6.aj;
        r9 = r9.get();
        r9 = (defpackage.akpb) r9;
        r1 = r6.ah;
        r9 = defpackage.akoz.a(r9, r1, r8);
        r6.ai = r9;
        r9 = r6.ai;
        if (r9 == 0) goto L_0x00f8;
    L_0x002e:
        r7 = r7.getResources();
        r9 = r6.ai;
        r9 = r9.K_();
        r6.ag = r9;
        r9 = r6.ag;
        r1 = 2131625633; // 0x7f0e06a1 float:1.887848E38 double:1.053162995E-314;
        r1 = r7.getDimensionPixelOffset(r1);
        r2 = 2131625561; // 0x7f0e0659 float:1.8878333E38 double:1.0531629595E-314;
        r2 = r7.getDimensionPixelOffset(r2);
        r3 = 2131625649; // 0x7f0e06b1 float:1.8878512E38 double:1.053163003E-314;
        r3 = r7.getDimensionPixelOffset(r3);
        r3 = r3 + r3;
        r4 = new android.widget.FrameLayout$LayoutParams;
        r5 = -2;
        r4.<init>(r0, r5);
        r0 = r6.ah;
        r0 = r0 instanceof defpackage.aufj;
        if (r0 == 0) goto L_0x0072;
    L_0x005e:
        r0 = r6.ae;
        r0 = r0.intValue();
        r5 = 2131625650; // 0x7f0e06b2 float:1.8878514E38 double:1.0531630035E-314;
        r5 = r7.getDimensionPixelOffset(r5);
        r0 = r0 + r5;
        r0 = java.lang.Integer.valueOf(r0);
        r6.ae = r0;
    L_0x0072:
        r0 = r6.ab;
        r0 = r0.c;
        if (r0 == 0) goto L_0x00bf;
    L_0x0078:
        r0 = r6.ae;
        if (r0 == 0) goto L_0x0082;
    L_0x007c:
        r0 = r0.intValue();
        r4.topMargin = r0;
    L_0x0082:
        r0 = r6.ah;
        r0 = r0 instanceof defpackage.aufj;
        r2 = 2131625602; // 0x7f0e0682 float:1.8878417E38 double:1.0531629797E-314;
        if (r0 == 0) goto L_0x0096;
    L_0x008b:
        r0 = r6.q();
        r0 = r0.getDimension(r2);
        r0 = (int) r0;
        r4.width = r0;
    L_0x0096:
        r0 = r6.ab;
        r0 = r0.c;
        if (r0 == 0) goto L_0x00ce;
    L_0x009c:
        r0 = r6.ad;
        if (r0 == 0) goto L_0x00ce;
    L_0x00a0:
        r0 = r7.getDimensionPixelOffset(r2);
        r7 = r7.getDisplayMetrics();
        r7 = r7.widthPixels;
        r2 = r6.ad;
        r2 = r2 / 2;
        r3 = r6.ac;
        r2 = r2 + r3;
        r3 = r0 / 2;
        r2 = r2 - r3;
        if (r2 < r1) goto L_0x00ce;
    L_0x00b6:
        r7 = r7 - r1;
        r3 = r2 + r0;
        if (r7 >= r3) goto L_0x00bd;
    L_0x00bb:
        r7 = r7 - r0;
        goto L_0x00cf;
    L_0x00bd:
        r7 = r2;
        goto L_0x00cf;
    L_0x00bf:
        r7 = r6.ae;
        if (r7 != 0) goto L_0x00c8;
    L_0x00c3:
        r2 = r2 + r1;
        r2 = r2 + r3;
        r4.topMargin = r2;
        goto L_0x00ce;
    L_0x00c8:
        r7 = r7.intValue();
        r4.topMargin = r7;
    L_0x00ce:
        r7 = r1;
    L_0x00cf:
        r4.bottomMargin = r1;
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 17;
        if (r0 < r2) goto L_0x00de;
    L_0x00d7:
        r4.setMarginStart(r7);
        r4.setMarginEnd(r1);
        goto L_0x00e2;
    L_0x00de:
        r4.leftMargin = r7;
        r4.rightMargin = r1;
    L_0x00e2:
        r8.addView(r9, r4);
        r7 = new akor;
        r7.<init>();
        r9 = r6.ak;
        r0 = "live_chat_item_action";
        r7.a(r0, r9);
        r9 = r6.ai;
        r0 = r6.ah;
        r9.a_(r7, r0);
    L_0x00f8:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abst.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        akot akot = this.ai;
        if (akot != null) {
            akot.a((akpb) this.aj.get());
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((!xss.b(M_()) && configuration.orientation == 2) || this.ab.c) {
            dismiss();
        }
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        a.setOnShowListener(this);
        return a;
    }

    /* JADX WARNING: Missing block: B:10:0x0042, code skipped:
            if (r5.ae != null) goto L_0x0044;
     */
    public final void a() {
        /*
        r5 = this;
        r0 = r5.c;
        if (r0 == 0) goto L_0x004f;
    L_0x0004:
        r0 = r0.getWindow();
        if (r0 == 0) goto L_0x004f;
    L_0x000a:
        r1 = r0.getContext();
        r2 = r1.getResources();
        r3 = 2131689490; // 0x7f0f0012 float:1.9007997E38 double:1.0531945446E-314;
        r4 = 1;
        r2 = r2.getFraction(r3, r4, r4);
        r3 = defpackage.xss.g(r1);
        r4 = defpackage.xss.f(r1);
        r4 = (float) r4;
        r4 = r4 / r2;
        r2 = (int) r4;
        r3 = r3 - r2;
        r2 = r5.ab;
        r2 = r2.c;
        r4 = -1;
        if (r2 != 0) goto L_0x0044;
    L_0x002d:
        r1 = r1.getResources();
        r1 = r1.getConfiguration();
        r1 = r1.orientation;
        r2 = 2;
        if (r1 != r2) goto L_0x0040;
    L_0x003a:
        r1 = r5.ab;
        r1 = r1.a;
        r4 = r1;
        goto L_0x0044;
    L_0x0040:
        r1 = r5.ae;
        if (r1 == 0) goto L_0x0045;
    L_0x0044:
        r3 = -1;
    L_0x0045:
        r0.setLayout(r4, r3);
        r1 = r5.ab;
        r1 = r1.b;
        r0.setGravity(r1);
    L_0x004f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abst.a():void");
    }

    public final void onShow(DialogInterface dialogInterface) {
        View view = this.ag;
        if (view != null && this.ae != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[1];
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.ag.getLayoutParams();
            int intValue = this.ae.intValue() - i;
            if (intValue != 0) {
                marginLayoutParams.topMargin += intValue;
                this.K.requestLayout();
            }
        }
    }
}
