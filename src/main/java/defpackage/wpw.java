package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.RadioGroup;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wpw */
public final class wpw implements aaap {
    public final Context a;
    public final aaas b;
    public final acvx c;
    private RadioGroup d;

    public wpw(Context context, aaas aaas, acvx acvx) {
        this.a = context;
        this.b = aaas;
        this.c = acvx;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
    public final void a(defpackage.apxu r12, java.util.Map r13) {
        /*
        r11 = this;
        r13 = com.google.protos.youtube.api.innertube.YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.ypcCancelSurveyEndpoint;
        r13 = defpackage.anxl.checkIsLite(r13);
        r12.a(r13);
        r12 = r12.h;
        r0 = r13.d;
        r12 = r12.b(r0);
        if (r12 != 0) goto L_0x0016;
    L_0x0013:
        r12 = r13.b;
        goto L_0x001a;
    L_0x0016:
        r12 = r13.a(r12);
    L_0x001a:
        r12 = (com.google.protos.youtube.api.innertube.YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint) r12;
        r13 = r12.a;
        r0 = 1;
        r13 = r13 & r0;
        r1 = 0;
        if (r13 == 0) goto L_0x0030;
    L_0x0023:
        r12 = r12.b;
        if (r12 != 0) goto L_0x0029;
    L_0x0027:
        r12 = defpackage.aybc.f;
    L_0x0029:
        r12 = r12.d;
        if (r12 != 0) goto L_0x0031;
    L_0x002d:
        r12 = defpackage.ayae.g;
        goto L_0x0031;
    L_0x0030:
        r12 = r1;
    L_0x0031:
        r13 = r11.a;
        r13 = android.view.LayoutInflater.from(r13);
        r2 = 2131035189; // 0x7f050435 float:1.7680917E38 double:1.052871277E-314;
        r2 = r13.inflate(r2, r1);
        r3 = 2131757983; // 0x7f100b9f float:1.9146917E38 double:1.0532283846E-314;
        r3 = r2.findViewById(r3);
        r3 = (android.widget.RadioGroup) r3;
        r11.d = r3;
        r3 = r12.a;
        r4 = 2;
        r3 = r3 & r4;
        r5 = 0;
        if (r3 == 0) goto L_0x0064;
    L_0x0050:
        r3 = r12.c;
        if (r3 != 0) goto L_0x0056;
    L_0x0054:
        r3 = defpackage.ayag.d;
    L_0x0056:
        r3 = r3.c;
        r3 = defpackage.axzo.a(r3);
        if (r3 == 0) goto L_0x0064;
    L_0x005e:
        r6 = 3;
        if (r3 == r6) goto L_0x0062;
    L_0x0061:
        goto L_0x0064;
    L_0x0062:
        r3 = 1;
        goto L_0x0065;
    L_0x0064:
        r3 = 0;
    L_0x0065:
        r6 = r12.c;
        if (r6 != 0) goto L_0x006b;
    L_0x0069:
        r6 = defpackage.ayag.d;
    L_0x006b:
        r6 = r6.b;
        r7 = r6.iterator();
    L_0x0071:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x00b4;
    L_0x0077:
        r8 = r7.next();
        r8 = (defpackage.ayas) r8;
        if (r8 == 0) goto L_0x008b;
    L_0x007f:
        r9 = r8.a;
        r10 = 131108496; // 0x7d08e90 float:3.1380152E-34 double:6.47762038E-316;
        if (r9 != r10) goto L_0x008b;
    L_0x0086:
        r8 = r8.b;
        r8 = (defpackage.ayac) r8;
        goto L_0x008c;
    L_0x008b:
        r8 = r1;
    L_0x008c:
        if (r8 == 0) goto L_0x0071;
    L_0x008e:
        r9 = 2131035190; // 0x7f050436 float:1.7680919E38 double:1.0528712775E-314;
        r9 = r13.inflate(r9, r1);
        r9 = (android.widget.RadioButton) r9;
        r9.setTag(r8);
        r10 = r8.a;
        r10 = r10 & r0;
        if (r10 == 0) goto L_0x00a6;
    L_0x009f:
        r8 = r8.b;
        if (r8 != 0) goto L_0x00a7;
    L_0x00a3:
        r8 = defpackage.arml.f;
        goto L_0x00a7;
    L_0x00a6:
        r8 = r1;
    L_0x00a7:
        r8 = defpackage.ajqy.a(r8);
        r9.setText(r8);
        r8 = r11.d;
        r8.addView(r9);
        goto L_0x0071;
    L_0x00b4:
        r13 = -1;
        if (r3 == 0) goto L_0x00c7;
    L_0x00b7:
        r7 = r11.d;
        r6 = r6.size();
        r6 = r6 + r13;
        r6 = r7.getChildAt(r6);
        r6 = (android.widget.RadioButton) r6;
        r6.setChecked(r0);
    L_0x00c7:
        r6 = new wpy;
        r6.<init>(r11, r12);
        r7 = new android.app.AlertDialog$Builder;
        r8 = r11.a;
        r7.<init>(r8);
        r8 = r12.a;
        r0 = r0 & r8;
        if (r0 == 0) goto L_0x00de;
    L_0x00d8:
        r1 = r12.b;
        if (r1 != 0) goto L_0x00de;
    L_0x00dc:
        r1 = defpackage.arml.f;
    L_0x00de:
        r0 = defpackage.ajqy.a(r1);
        r0 = r7.setTitle(r0);
        r0 = r0.setView(r2);
        r1 = r12.e;
        if (r1 != 0) goto L_0x00f0;
    L_0x00ee:
        r1 = defpackage.aphj.d;
    L_0x00f0:
        r1 = defpackage.wpw.b(r1);
        r0 = r0.setPositiveButton(r1, r6);
        r1 = r12.d;
        if (r1 != 0) goto L_0x00fe;
    L_0x00fc:
        r1 = defpackage.aphj.d;
    L_0x00fe:
        r1 = defpackage.wpw.b(r1);
        r0 = r0.setNegativeButton(r1, r6);
        r0 = r0.create();
        r0.show();
        if (r3 == 0) goto L_0x0110;
    L_0x010f:
        goto L_0x0122;
    L_0x0110:
        r12 = r12.f;
        r12 = defpackage.axzq.a(r12);
        if (r12 != 0) goto L_0x0119;
    L_0x0118:
        goto L_0x011b;
    L_0x0119:
        if (r12 == r4) goto L_0x0122;
    L_0x011b:
        r12 = r0.getButton(r13);
        r12.setEnabled(r5);
    L_0x0122:
        r12 = r11.d;
        r13 = new wpz;
        r13.<init>(r0);
        r12.setOnCheckedChangeListener(r13);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpw.a(apxu, java.util.Map):void");
    }

    private static Spanned b(aphj aphj) {
        if ((aphj.a & 1) == 0) {
            return null;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        arml arml = aphg.g;
        if (arml == null) {
            arml = arml.f;
        }
        return ajqy.a(arml);
    }

    public static aqhy a(aphj aphj) {
        if ((aphj.a & 1) != 0) {
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            anxp anxp = aphg.m;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = aphg.m;
                if (anxp2 == null) {
                    anxp2 = apxu.d;
                }
                anxr access$0002 = anxl.checkIsLite(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint) b;
                if ((confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.a & 1) != 0) {
                    aqhu aqhu = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.b;
                    if (aqhu == null) {
                        aqhu = aqhu.c;
                    }
                    aqhy aqhy = aqhu.b;
                    if (aqhy == null) {
                        aqhy = aqhy.q;
                    }
                    return aqhy;
                }
            }
        }
        return null;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        int checkedRadioButtonId = this.d.getCheckedRadioButtonId();
        if (checkedRadioButtonId != -1) {
            View findViewById = this.d.findViewById(checkedRadioButtonId);
            if (findViewById != null) {
                anxp anxp = ((ayac) findViewById.getTag()).c;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                arrayList.add(((arjq) b).b);
            }
        }
        return arrayList;
    }
}
