package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wrv */
final class wrv implements akot, akyw {
    public final View a;
    public final int b;
    private final TextView c = ((TextView) this.a.findViewById(R.id.title));
    private final TextView d = ((TextView) this.a.findViewById(R.id.body));
    private final ImageView e = ((ImageView) this.a.findViewById(R.id.foreground));
    private final ImageView f = ((ImageView) this.a.findViewById(R.id.background));
    private final TextView g = ((TextView) this.a.findViewById(R.id.action));
    private final TextView h;
    private final ScrollView i = ((ScrollView) this.a.findViewById(R.id.scroll_view));
    private final akyy j;
    private final akyy k;
    private final /* synthetic */ wrt l;

    wrv(wrt wrt, int i) {
        this.l = wrt;
        this.b = i;
        this.a = LayoutInflater.from(wrt.b).inflate(i, wrt.f, false);
        this.j = wrt.e.a(this.g);
        this.h = (TextView) this.a.findViewById(R.id.dismiss);
        this.k = wrt.e.a(this.h);
        this.j.c = this;
        this.k.c = this;
        xpr.a(this.a, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f3  */
    public final void a(defpackage.ajwn r11) {
        /*
        r10 = this;
        r0 = r10.a;
        r1 = r10.l;
        r1 = r1.b();
        r2 = 1;
        r1 = r1 ^ r2;
        defpackage.xpr.a(r0, r1);
        r0 = defpackage.ajwq.a;
        r0 = r11.hasExtension(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0024;
    L_0x0016:
        r0 = defpackage.ajwq.a;
        r0 = r11.getExtension(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0055;
    L_0x0024:
        r0 = defpackage.ajwq.a;
        r3 = java.lang.Boolean.valueOf(r2);
        r11.setExtension(r0, r3);
        r0 = r10.l;
        r0 = r0.j;
        r0 = r0.h;
        if (r0 == 0) goto L_0x0055;
    L_0x0035:
        r3 = r0.length;
        r4 = 0;
    L_0x0037:
        if (r4 >= r3) goto L_0x0055;
    L_0x0039:
        r5 = r0[r4];
        if (r5 == 0) goto L_0x0052;
    L_0x003d:
        r6 = new java.util.HashMap;
        r6.<init>();
        r7 = r10.l;
        r7 = r7.j;
        r8 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r6.put(r8, r7);
        r7 = r10.l;
        r7 = r7.c;
        r7.a(r5, r6);
    L_0x0052:
        r4 = r4 + 1;
        goto L_0x0037;
    L_0x0055:
        r0 = r10.l;
        r0 = r0.h;
        r0 = r0.t();
        r3 = r11.f;
        r4 = 0;
        r0.a(r3, r4);
        r3 = r11.c;
        if (r3 != 0) goto L_0x0069;
    L_0x0067:
        r3 = r4;
        goto L_0x0074;
    L_0x0069:
        r5 = r3.a;
        r5 = r5 & r2;
        if (r5 == 0) goto L_0x0067;
    L_0x006e:
        r3 = r3.b;
        if (r3 != 0) goto L_0x0074;
    L_0x0072:
        r3 = defpackage.aphg.s;
    L_0x0074:
        r5 = r11.g;
        if (r5 != 0) goto L_0x007a;
    L_0x0078:
        r2 = r4;
        goto L_0x0085;
    L_0x007a:
        r6 = r5.a;
        r2 = r2 & r6;
        if (r2 == 0) goto L_0x0078;
    L_0x007f:
        r2 = r5.b;
        if (r2 != 0) goto L_0x0085;
    L_0x0083:
        r2 = defpackage.aphg.s;
    L_0x0085:
        r5 = r10.l;
        r5 = r5.b();
        if (r5 != 0) goto L_0x01f9;
    L_0x008d:
        r5 = r10.l;
        r6 = r5.j;
        r6 = r6.l;
        r7 = 2;
        if (r6 == r7) goto L_0x0097;
    L_0x0096:
        goto L_0x00bf;
    L_0x0097:
        r5 = r5.k;
        r5 = defpackage.wsb.a(r5);
        if (r5 != 0) goto L_0x00bf;
    L_0x009f:
        if (r2 == 0) goto L_0x00bf;
    L_0x00a1:
        r5 = r10.h;
        r5 = r5.getLayoutParams();
        r5 = (android.view.ViewGroup.MarginLayoutParams) r5;
        if (r3 == 0) goto L_0x00bb;
    L_0x00ab:
        r6 = r10.l;
        r6 = r6.b;
        r6 = r6.getResources();
        r8 = 2131626010; // 0x7f0e081a float:1.8879244E38 double:1.0531631813E-314;
        r6 = r6.getDimensionPixelSize(r8);
        goto L_0x00bc;
    L_0x00bb:
        r6 = 0;
    L_0x00bc:
        r5.setMarginStart(r6);
    L_0x00bf:
        r5 = r10.j;
        r5.a(r3, r0);
        r3 = r10.k;
        r3.a(r2, r0);
        r0 = r10.c;
        r2 = r11.a;
        r2 = defpackage.ajqy.a(r2);
        defpackage.xpr.a(r0, r2);
        r0 = r10.d;
        r11 = r11.b;
        r11 = defpackage.ajqy.a(r11);
        defpackage.xpr.a(r0, r11);
        r11 = r10.l;
        r11 = r11.d;
        r11 = r11.k();
        r0 = r10.c;
        r11 = r11.a(r0);
        r0 = r10.d;
        r11 = r11.b(r0);
        r11 = r11.b();
        r0 = r10.l;
        r0 = r0.j;
        r0 = r0.k;
        r2 = 118483990; // 0x70fec16 float:1.0827504E-34 double:5.8538869E-316;
        if (r0 == 0) goto L_0x010e;
    L_0x0102:
        r3 = r0.a;
        if (r3 != r2) goto L_0x010b;
    L_0x0106:
        r0 = r0.b;
        r0 = (defpackage.apfb) r0;
        goto L_0x010f;
    L_0x010b:
        r0 = defpackage.apfb.f;
        goto L_0x010f;
    L_0x010e:
        r0 = r4;
    L_0x010f:
        r11.a(r0);
        r11 = r10.l;
        r0 = r11.j;
        r3 = r0.d;
        if (r3 != 0) goto L_0x0122;
    L_0x011a:
        r11 = r10.e;
        r0 = 8;
        r11.setVisibility(r0);
        goto L_0x0190;
    L_0x0122:
        r0 = r0.l;
        if (r0 != r7) goto L_0x0127;
    L_0x0126:
        goto L_0x017e;
    L_0x0127:
        r11 = r11.k;
        r11 = defpackage.wsb.a(r11);
        if (r11 == 0) goto L_0x0153;
    L_0x012f:
        r11 = r10.l;
        r11 = r11.b;
        r0 = "window";
        r11 = r11.getSystemService(r0);
        r11 = (android.view.WindowManager) r11;
        r0 = new android.graphics.Point;
        r0.<init>();
        r11 = r11.getDefaultDisplay();
        r11.getSize(r0);
        r11 = r0.y;
        r5 = (double) r11;
        r8 = 4598175219545276416; // 0x3fd0000000000000 float:0.0 double:0.25;
        java.lang.Double.isNaN(r5);
        r5 = r5 * r8;
        r11 = (int) r5;
        goto L_0x016e;
    L_0x0153:
        r11 = r10.l;
        r11 = r11.b;
        r11 = defpackage.xss.b(r11);
        if (r11 == 0) goto L_0x016d;
    L_0x015d:
        r11 = r10.l;
        r11 = r11.b;
        r11 = r11.getResources();
        r0 = 2131625294; // 0x7f0e054e float:1.8877792E38 double:1.0531628276E-314;
        r11 = r11.getDimensionPixelSize(r0);
        goto L_0x016e;
    L_0x016d:
        r11 = 0;
    L_0x016e:
        r0 = r10.e;
        r0 = r0.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r0.setMargins(r1, r11, r1, r1);
        r11 = r10.e;
        r11.setLayoutParams(r0);
    L_0x017e:
        r11 = r10.e;
        r11.setVisibility(r1);
        r11 = r10.l;
        r0 = r11.a;
        r1 = r10.e;
        r11 = r11.j;
        r11 = r11.d;
        r0.a(r1, r11);
    L_0x0190:
        r11 = r10.l;
        r11 = r11.j;
        r11 = r11.j;
        if (r11 == 0) goto L_0x019f;
    L_0x0198:
        r11 = r11.b;
        if (r11 != 0) goto L_0x01a0;
    L_0x019c:
        r11 = defpackage.aygn.d;
        goto L_0x01a0;
    L_0x019f:
        r11 = r4;
    L_0x01a0:
        r0 = r10.l;
        r0 = r0.a;
        r1 = r10.f;
        r0.a(r1);
        if (r11 != 0) goto L_0x01ac;
    L_0x01ab:
        goto L_0x01cd;
    L_0x01ac:
        r11 = r11.a;
        r0 = r11 & 1;
        if (r0 == 0) goto L_0x01cd;
    L_0x01b2:
        r11 = r11 & r7;
        if (r11 == 0) goto L_0x01cd;
    L_0x01b5:
        r11 = r10.l;
        r0 = r11.a;
        r1 = r10.f;
        r2 = r11.j;
        r11 = r11.k;
        r11 = defpackage.wsb.a(r11);
        r11 = defpackage.wrt.a(r2, r11);
        r2 = defpackage.akko.h;
        r0.a(r1, r11, r2);
        goto L_0x01ef;
    L_0x01cd:
        r11 = r10.l;
        r11 = r11.j;
        r11 = r11.k;
        if (r11 == 0) goto L_0x01e1;
    L_0x01d5:
        r0 = r11.a;
        if (r0 != r2) goto L_0x01df;
    L_0x01d9:
        r11 = r11.b;
        r4 = r11;
        r4 = (defpackage.apfb) r4;
        goto L_0x01e1;
    L_0x01df:
        r4 = defpackage.apfb.f;
    L_0x01e1:
        r11 = r10.a;
        if (r4 != 0) goto L_0x01ea;
    L_0x01e5:
        r0 = r10.b();
        goto L_0x01ec;
    L_0x01ea:
        r0 = r4.b;
    L_0x01ec:
        r11.setBackgroundColor(r0);
    L_0x01ef:
        r11 = r10.i;
        if (r11 == 0) goto L_0x01f8;
    L_0x01f3:
        r0 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r11.fullScroll(r0);
    L_0x01f8:
        return;
    L_0x01f9:
        if (r3 != 0) goto L_0x01fc;
    L_0x01fb:
        goto L_0x0205;
    L_0x01fc:
        r1 = r3.r;
        r1 = r1.d();
        r0.a(r1, r4);
    L_0x0205:
        if (r2 != 0) goto L_0x0208;
    L_0x0207:
        goto L_0x0211;
    L_0x0208:
        r1 = r2.r;
        r1 = r1.d();
        r0.a(r1, r4);
    L_0x0211:
        r0 = r10.l;
        r0 = r0.g;
        r0 = r0.c();
        if (r0 == 0) goto L_0x023d;
    L_0x021b:
        r0 = r10.l;
        r0 = r0.g;
        r1 = r0.d;
        r11 = r1.contains(r11);
        if (r11 == 0) goto L_0x023d;
    L_0x0227:
        r11 = r0.f;
        r11 = r11.n();
        if (r11 == 0) goto L_0x023a;
    L_0x022f:
        r11 = r0.f;
        r1 = new wsc;
        r1.<init>(r0);
        r11.post(r1);
        goto L_0x023d;
    L_0x023a:
        r0.a();
    L_0x023d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrv.a(ajwn):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    private final int b() {
        /*
        r3 = this;
        r0 = r3.l;
        r1 = r0.j;
        r1 = r1.e;
        r2 = 0;
        if (r1 == 0) goto L_0x000e;
    L_0x0009:
        r2 = android.graphics.Color.parseColor(r1);	 Catch:{ Exception -> 0x0017 }
        goto L_0x0017;
    L_0x000e:
        r0 = r0.b;	 Catch:{  }
        r1 = 2130772333; // 0x7f01016d float:1.7147781E38 double:1.052741409E-314;
        r2 = defpackage.xwe.a(r0, r1, r2);	 Catch:{  }
    L_0x0017:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrv.b():int");
    }

    public final void a(aphf aphf) {
        akyw akyw = this.l.i;
        if (akyw != null) {
            akyw.a(aphf);
        }
        this.l.g.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((ajwn) obj);
    }
}
