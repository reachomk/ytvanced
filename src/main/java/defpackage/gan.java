package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: gan */
public final class gan extends DialogFragment {
    public TextView a;
    public gaf b;
    public boolean c;
    public gal d;
    public akkq e;
    private GridLayout f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private TextView j;
    private TextView k;
    private Activity l;
    private azem m;
    private avdf n;
    private akkw o;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0179  */
    public final void onCreate(android.os.Bundle r6) {
        /*
        r5 = this;
        r0 = "VIDEOMODEL";
        super.onCreate(r6);
        r6 = r5.getActivity();
        r5.l = r6;
        r6 = r5.l;
        r6 = defpackage.xse.a(r6);
        r6 = (defpackage.gap) r6;
        r6.a(r5);
        r6 = r5.l;
        r6 = r6.getLayoutInflater();
        r1 = r5.l;
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r1 = r1.findViewById(r2);
        r1 = (android.view.ViewGroup) r1;
        r2 = 0;
        r3 = 2131034939; // 0x7f05033b float:1.768041E38 double:1.0528711534E-314;
        r6 = r6.inflate(r3, r1, r2);
        r6 = (android.widget.GridLayout) r6;
        r5.f = r6;
        r6 = r5.f;
        r1 = 2131757587; // 0x7f100a13 float:1.9146114E38 double:1.053228189E-314;
        r6 = r6.findViewById(r1);
        r6 = (android.view.ViewStub) r6;
        if (r6 == 0) goto L_0x0043;
    L_0x0040:
        r6.inflate();
    L_0x0043:
        r6 = r5.f;
        r1 = 2131757583; // 0x7f100a0f float:1.9146106E38 double:1.053228187E-314;
        r6 = r6.findViewById(r1);
        r6 = (android.widget.ImageView) r6;
        r5.g = r6;
        r6 = r5.f;
        r1 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r6 = r6.findViewById(r1);
        r6 = (android.widget.ImageView) r6;
        r5.h = r6;
        r6 = r5.f;
        r1 = 2131755070; // 0x7f10003e float:1.9141009E38 double:1.0532269454E-314;
        r6 = r6.findViewById(r1);
        r6 = (android.widget.ImageView) r6;
        r5.i = r6;
        r6 = r5.f;
        r1 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r6 = r6.findViewById(r1);
        r6 = (android.widget.TextView) r6;
        r5.j = r6;
        r6 = r5.f;
        r1 = 2131755951; // 0x7f1003af float:1.9142796E38 double:1.0532273807E-314;
        r6 = r6.findViewById(r1);
        r6 = (android.widget.TextView) r6;
        r5.k = r6;
        r6 = r5.f;
        r1 = 2131757588; // 0x7f100a14 float:1.9146116E38 double:1.0532281895E-314;
        r6 = r6.findViewById(r1);
        r6 = (android.widget.TextView) r6;
        r5.a = r6;
        r6 = r5.getArguments();	 Catch:{ anyg -> 0x01e4 }
        r6 = r6.containsKey(r0);	 Catch:{ anyg -> 0x01e4 }
        if (r6 == 0) goto L_0x01e3;
    L_0x009b:
        r6 = r5.getArguments();	 Catch:{ anyg -> 0x01e4 }
        r6 = r6.getByteArray(r0);	 Catch:{ anyg -> 0x01e4 }
        r0 = defpackage.anxa.c();	 Catch:{ anyg -> 0x01e4 }
        r1 = defpackage.azem.D;	 Catch:{ anyg -> 0x01e4 }
        r6 = defpackage.anxl.parseFrom(r1, r6, r0);	 Catch:{ anyg -> 0x01e4 }
        r6 = (defpackage.azem) r6;	 Catch:{ anyg -> 0x01e4 }
        r5.m = r6;	 Catch:{ anyg -> 0x01e4 }
        r6 = r5.m;
        r0 = r6.a;
        r0 = r0 & 8192;
        r1 = 0;
        r3 = 1;
        if (r0 == 0) goto L_0x00dd;
    L_0x00bb:
        r6 = r6.p;
        if (r6 != 0) goto L_0x00c1;
    L_0x00bf:
        r6 = defpackage.azeq.c;
    L_0x00c1:
        r6 = r6.a;
        r6 = r6 & r3;
        if (r6 == 0) goto L_0x00dd;
    L_0x00c6:
        r6 = r5.m;
        r6 = r6.p;
        if (r6 != 0) goto L_0x00ce;
    L_0x00cc:
        r6 = defpackage.azeq.c;
    L_0x00ce:
        r6 = r6.b;
        if (r6 != 0) goto L_0x00d4;
    L_0x00d2:
        r6 = defpackage.avdd.d;
    L_0x00d4:
        r6 = r6.toBuilder();
        r6 = (defpackage.anxo) r6;
        r6 = (defpackage.avdf) r6;
        goto L_0x00de;
    L_0x00dd:
        r6 = r1;
    L_0x00de:
        r5.n = r6;
        r6 = r5.m;
        r6 = r6.r;
        r6 = defpackage.akkw.a(r6);
        r5.o = r6;
        r6 = r5.d;
        r0 = r5.g;
        r6 = r6.a(r0, r1);
        r5.b = r6;
        r6 = defpackage.akko.h();
        r6 = r6.b(r2);
        r0 = r5.o;
        if (r0 == 0) goto L_0x0103;
    L_0x0100:
        r6.a(r0);
    L_0x0103:
        r6 = r6.a();
        r0 = r5.j;
        r2 = r5.m;
        r4 = r2.a;
        r4 = r4 & r3;
        if (r4 == 0) goto L_0x0117;
    L_0x0110:
        r2 = r2.b;
        if (r2 != 0) goto L_0x0118;
    L_0x0114:
        r2 = defpackage.arml.f;
        goto L_0x0118;
    L_0x0117:
        r2 = r1;
    L_0x0118:
        r2 = defpackage.ajqy.a(r2);
        r0.setText(r2);
        r0 = r5.k;
        r2 = r5.m;
        r4 = r2.a;
        r4 = r4 & 8;
        if (r4 == 0) goto L_0x012f;
    L_0x0129:
        r1 = r2.e;
        if (r1 != 0) goto L_0x012f;
    L_0x012d:
        r1 = defpackage.arml.f;
    L_0x012f:
        r1 = defpackage.ajqy.a(r1);
        r0.setText(r1);
        r0 = r5.m;
        r1 = r0.a;
        r1 = r1 & 32;
        if (r1 == 0) goto L_0x0165;
    L_0x013e:
        r0 = r0.f;
        if (r0 != 0) goto L_0x0144;
    L_0x0142:
        r0 = defpackage.appu.c;
    L_0x0144:
        r0 = r0.a;
        r0 = r0 & r3;
        if (r0 != 0) goto L_0x014a;
    L_0x0149:
        goto L_0x0165;
    L_0x014a:
        r0 = r5.e;
        r1 = r5.i;
        r2 = r5.m;
        r2 = r2.f;
        if (r2 != 0) goto L_0x0156;
    L_0x0154:
        r2 = defpackage.appu.c;
    L_0x0156:
        r2 = r2.b;
        if (r2 != 0) goto L_0x015c;
    L_0x015a:
        r2 = defpackage.appw.f;
    L_0x015c:
        r2 = r2.b;
        if (r2 != 0) goto L_0x0162;
    L_0x0160:
        r2 = defpackage.aygk.f;
    L_0x0162:
        r0.a(r1, r2, r6);
    L_0x0165:
        r0 = r5.e;
        r1 = r5.h;
        r2 = r5.m;
        r2 = r2.d;
        if (r2 != 0) goto L_0x0171;
    L_0x016f:
        r2 = defpackage.aygk.f;
    L_0x0171:
        r0.a(r1, r2, r6);
        r6 = r5.n;
        if (r6 != 0) goto L_0x0179;
    L_0x0178:
        goto L_0x01d1;
    L_0x0179:
        r0 = r6.instance;
        r0 = (defpackage.avdd) r0;
        r1 = r0.a;
        r1 = r1 & r3;
        if (r1 == 0) goto L_0x01d1;
    L_0x0182:
        r1 = r0.c;
        if (r1 != 0) goto L_0x0187;
    L_0x0186:
        goto L_0x01ba;
    L_0x0187:
        r0 = r0.b;
        if (r0 != 0) goto L_0x018d;
    L_0x018b:
        r0 = defpackage.aygk.f;
    L_0x018d:
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.aygj) r0;
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.aygk) r1;
        r2 = r1.a;
        r2 = r2 | 2;
        r1.a = r2;
        r1.c = r3;
        r6.copyOnWrite();
        r6 = r6.instance;
        r6 = (defpackage.avdd) r6;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aygk) r0;
        r6.b = r0;
        r0 = r6.a;
        r0 = r0 | r3;
        r6.a = r0;
    L_0x01ba:
        r6 = r5.b;
        r0 = r5.n;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.avdd) r0;
        r1 = r5.o;
        r2 = new gam;
        r2.<init>(r5);
        r6.a(r0, r1, r2);
        return;
    L_0x01d1:
        r6 = r5.a;
        r0 = r5.l;
        r0 = r0.getResources();
        r1 = 2131952878; // 0x7f1304ee float:1.9542211E38 double:1.0533246756E-314;
        r0 = r0.getString(r1);
        defpackage.xpr.a(r6, r0);
    L_0x01e3:
        return;
    L_0x01e4:
        r5.dismiss();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gan.onCreate(android.os.Bundle):void");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        aeg aeg = new aeg(getActivity());
        aeg.a(this.f);
        return aeg.a();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.setVisibility(8);
        if (this.f.getParent() != null) {
            ((ViewGroup) this.f.getParent()).removeView(this.f);
        }
        this.a.setVisibility(8);
        this.e.a(this.g);
        this.e.a(this.h);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        dismiss();
    }
}
