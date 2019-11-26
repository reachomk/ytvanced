package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kbv */
public final class kbv implements akot {
    public final RadioButton a = ((RadioButton) this.k.findViewById(R.id.radio_button));
    public final Map b;
    public apxu c;
    public kby d;
    public acvx e;
    public asnn f;
    private final int g;
    private final int h;
    private final Context i;
    private final akou j;
    private final View k = LayoutInflater.from(this.i).inflate(R.layout.dismissal_reason_list_item, null);
    private final TextView l;
    private final ViewStub m;
    private View n;
    private final akkq o;

    public kbv(Context context, flu flu, aaas aaas, akkq akkq, albi albi) {
        this.i = (Context) amqw.a((Object) context);
        this.j = (akou) amqw.a((Object) flu);
        this.o = (akkq) amqw.a((Object) akkq);
        this.a.setOnClickListener(new kbx(this, aaas, albi, context));
        this.l = (TextView) this.k.findViewById(R.id.reason_text);
        this.m = (ViewStub) this.k.findViewById(R.id.video_layout);
        this.b = new HashMap();
        this.g = xwe.a(context, R.attr.ytTextSecondary);
        this.h = xwe.a(context, R.attr.ytCallToAction);
        this.j.a(this.k);
        this.j.a(true);
        this.j.a(new kbu(this));
    }

    public final View K_() {
        return this.j.a();
    }

    public final void a(akpb akpb) {
        this.b.clear();
    }

    public final byte[] b() {
        asnn asnn = this.f;
        if (((asnn.a == 106353983 ? (asnp) asnn.b : asnp.f).a & 2) == 0) {
            asnr asnr;
            asnn = this.f;
            if (asnn.a == 106118680) {
                asnr = (asnr) asnn.b;
            } else {
                asnr = asnr.j;
            }
            if ((asnr.a & 2) == 0) {
                return null;
            }
            asnn = this.f;
            if (asnn.a == 106118680) {
                asnr = (asnr) asnn.b;
            } else {
                asnr = asnr.j;
            }
            return asnr.d.d();
        }
        asnp asnp;
        asnn = this.f;
        if (asnn.a == 106353983) {
            asnp = (asnp) asnn.b;
        } else {
            asnp = asnp.f;
        }
        return asnp.d.d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0155  */
    public final /* synthetic */ void a_(defpackage.akor r10, java.lang.Object r11) {
        /*
        r9 = this;
        r11 = (defpackage.asnn) r11;
        r0 = r10.a;
        r9.e = r0;
        r9.f = r11;
        r0 = r10.a;
        r1 = r9.b();
        r2 = 0;
        r0.a(r1, r2);
        r0 = r9.a;
        r1 = 0;
        r0.setChecked(r1);
        r0 = "selection_listener";
        r0 = r10.a(r0);
        r0 = (defpackage.kby) r0;
        r9.d = r0;
        r0 = "parent_renderer";
        r10 = r10.a(r0);
        r10 = (defpackage.asnl) r10;
        r0 = 1;
        if (r10 == 0) goto L_0x003b;
    L_0x002d:
        r10 = r10.i;
        r10 = defpackage.aqxa.a(r10);
        if (r10 == 0) goto L_0x003b;
    L_0x0035:
        r3 = 2;
        if (r10 == r3) goto L_0x0039;
    L_0x0038:
        goto L_0x003b;
    L_0x0039:
        r10 = 1;
        goto L_0x003c;
    L_0x003b:
        r10 = 0;
    L_0x003c:
        if (r10 != 0) goto L_0x005f;
    L_0x003e:
        r3 = r9.a;
        r3 = r3.getBackground();
        if (r3 == 0) goto L_0x0057;
    L_0x0046:
        r4 = r9.a;
        r3 = r3.mutate();
        r5 = r9.g;
        r6 = android.graphics.PorterDuff.Mode.SRC_IN;
        r3 = defpackage.xoe.a(r3, r5, r6);
        r4.setBackground(r3);
    L_0x0057:
        r3 = r9.l;
        r4 = r9.g;
        r3.setTextColor(r4);
        goto L_0x007f;
    L_0x005f:
        r3 = r9.a;
        r3 = r3.getBackground();
        if (r3 == 0) goto L_0x0078;
    L_0x0067:
        r4 = r9.a;
        r3 = r3.mutate();
        r5 = r9.h;
        r6 = android.graphics.PorterDuff.Mode.SRC_IN;
        r3 = defpackage.xoe.a(r3, r5, r6);
        r4.setBackground(r3);
    L_0x0078:
        r3 = r9.l;
        r4 = r9.h;
        r3.setTextColor(r4);
    L_0x007f:
        r3 = r11.a;
        r4 = 106353983; // 0x656d53f float:4.0405595E-35 double:5.25458493E-316;
        r5 = 8;
        r6 = 4;
        if (r3 != r4) goto L_0x00b7;
    L_0x0089:
        r10 = r11.b;
        r10 = (defpackage.asnp) r10;
        r0 = r10.a;
        r0 = r0 & r6;
        if (r0 != 0) goto L_0x0093;
    L_0x0092:
        goto L_0x009a;
    L_0x0093:
        r2 = r10.e;
        if (r2 == 0) goto L_0x0098;
    L_0x0097:
        goto L_0x009a;
    L_0x0098:
        r2 = defpackage.arml.f;
    L_0x009a:
        r10 = defpackage.ajqy.a(r2);
        r0 = r11.a;
        if (r0 != r4) goto L_0x00a7;
    L_0x00a2:
        r0 = r11.b;
        r0 = (defpackage.asnp) r0;
        goto L_0x00a9;
    L_0x00a7:
        r0 = defpackage.asnp.f;
    L_0x00a9:
        r2 = r0.b;
        if (r2 != r6) goto L_0x00b2;
    L_0x00ad:
        r0 = r0.c;
        r0 = (defpackage.apxu) r0;
        goto L_0x00b4;
    L_0x00b2:
        r0 = defpackage.apxu.d;
    L_0x00b4:
        r9.c = r0;
        goto L_0x00be;
    L_0x00b7:
        r4 = 106118680; // 0x6533e18 float:3.973031E-35 double:5.2429594E-316;
        if (r3 == r4) goto L_0x00c1;
    L_0x00bc:
        r10 = "";
    L_0x00be:
        r0 = 0;
        goto L_0x0151;
    L_0x00c1:
        r3 = r11.b;
        r3 = (defpackage.asnr) r3;
        r4 = r3.a;
        r4 = r4 & r6;
        if (r4 == 0) goto L_0x00d0;
    L_0x00ca:
        r2 = r3.e;
        if (r2 != 0) goto L_0x00d0;
    L_0x00ce:
        r2 = defpackage.arml.f;
    L_0x00d0:
        r2 = defpackage.ajqy.a(r2);
        r4 = r3.b;
        if (r4 != r5) goto L_0x00dd;
    L_0x00d8:
        r4 = r3.c;
        r4 = (defpackage.apxu) r4;
        goto L_0x00df;
    L_0x00dd:
        r4 = defpackage.apxu.d;
    L_0x00df:
        r9.c = r4;
        r4 = r3.a;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x014e;
    L_0x00e6:
        r4 = r9.n;
        if (r4 != 0) goto L_0x00f2;
    L_0x00ea:
        r4 = r9.m;
        r4 = r4.inflate();
        r9.n = r4;
    L_0x00f2:
        r4 = r9.n;
        r6 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r4 = r4.findViewById(r6);
        r4 = (android.widget.ImageView) r4;
        r6 = r9.n;
        r7 = 2131756590; // 0x7f10062e float:1.9144092E38 double:1.0532276964E-314;
        r6 = r6.findViewById(r7);
        r6 = (android.widget.TextView) r6;
        r7 = r9.n;
        r8 = 2131755632; // 0x7f100270 float:1.9142149E38 double:1.053227223E-314;
        r7 = r7.findViewById(r8);
        r7 = (android.widget.TextView) r7;
        if (r10 == 0) goto L_0x011b;
    L_0x0115:
        r10 = r9.h;
        r7.setTextColor(r10);
        goto L_0x0127;
    L_0x011b:
        r10 = r9.i;
        r8 = 2130772333; // 0x7f01016d float:1.7147781E38 double:1.052741409E-314;
        r10 = defpackage.xwe.a(r10, r8);
        r7.setTextColor(r10);
    L_0x0127:
        r10 = r3.g;
        if (r10 != 0) goto L_0x012d;
    L_0x012b:
        r10 = defpackage.arml.f;
    L_0x012d:
        r10 = defpackage.ajqy.a(r10);
        defpackage.xpr.a(r6, r10);
        r10 = r3.h;
        if (r10 != 0) goto L_0x013a;
    L_0x0138:
        r10 = defpackage.arml.f;
    L_0x013a:
        r10 = defpackage.ajqy.a(r10);
        defpackage.xpr.a(r7, r10);
        r10 = r9.o;
        r3 = r3.f;
        if (r3 != 0) goto L_0x0149;
    L_0x0147:
        r3 = defpackage.aygk.f;
    L_0x0149:
        r10.a(r4, r3);
        r10 = r2;
        goto L_0x0151;
    L_0x014e:
        r10 = r2;
        goto L_0x00be;
    L_0x0151:
        r2 = r9.m;
        if (r0 != 0) goto L_0x0157;
    L_0x0155:
        r1 = 8;
    L_0x0157:
        r2.setVisibility(r1);
        r0 = r9.b;
        r1 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r0.put(r1, r11);
        r11 = r9.l;
        defpackage.xpr.a(r11, r10);
        r11 = r9.a;
        r11.setContentDescription(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbv.a_(akor, java.lang.Object):void");
    }
}
