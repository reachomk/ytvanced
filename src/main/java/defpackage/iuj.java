package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iuj */
public final class iuj implements akok, akot {
    public final View a;
    private final String b;
    private final Context c;
    private final Resources d;
    private final aaas e;
    private final akkq f;
    private final ImageView g;
    private final ImageView h;
    private final FrameLayout i;
    private final TextView j;
    private final TextView k;
    private final ViewGroup l;
    private final ImageView m;
    private final ChipCloudView n;
    private final akoj o;
    private final akoj p;
    private final LayoutParams q;
    private axbo r;
    private final List s = new ArrayList();
    private final List t = new ArrayList();
    private final akvp u;

    public iuj(Context context, aaas aaas, akvp akvp, akkq akkq) {
        this.c = (Context) amqw.a((Object) context);
        this.d = context.getResources();
        this.e = (aaas) amqw.a((Object) aaas);
        this.f = (akkq) amqw.a((Object) akkq);
        this.u = (akvp) amqw.a((Object) akvp);
        this.a = View.inflate(context, R.layout.rich_list_header, null);
        this.g = (ImageView) this.a.findViewById(R.id.channel_avatar);
        this.i = (FrameLayout) this.a.findViewById(R.id.box_art_layout);
        this.h = (ImageView) this.a.findViewById(R.id.box_art);
        this.j = (TextView) this.a.findViewById(R.id.title);
        this.k = (TextView) this.a.findViewById(R.id.subtitle);
        this.l = (ViewGroup) this.a.findViewById(R.id.standalone_badges_container);
        this.m = (ImageView) this.a.findViewById(R.id.icon);
        this.n = (ChipCloudView) this.a.findViewById(R.id.badges_container);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cloud_chip_margin);
        this.n.a(dimensionPixelSize, dimensionPixelSize);
        this.o = new akoj(aaas, this.g);
        this.p = new akoj(aaas, this.a);
        this.q = (LayoutParams) this.j.getLayoutParams();
        this.b = this.d.getString(R.string.accessibility_header_postfix);
    }

    public final View K_() {
        return this.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b4  */
    /* renamed from: a */
    public final void a_(defpackage.akor r12, defpackage.axbo r13) {
        /*
        r11 = this;
        r11.r = r13;
        r0 = r11.r;
        r1 = r0.b;
        r2 = 3;
        r3 = 0;
        r4 = 1;
        if (r1 != r2) goto L_0x001d;
    L_0x000b:
        r0 = r0.c;
        r0 = (defpackage.appu) r0;
        r1 = r0.a;
        r1 = r1 & r4;
        if (r1 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x001d;
    L_0x0015:
        r0 = r0.b;
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001e;
    L_0x001a:
        r0 = defpackage.appw.f;
        goto L_0x001e;
    L_0x001d:
        r0 = r3;
    L_0x001e:
        r1 = 2;
        if (r0 != 0) goto L_0x0023;
    L_0x0021:
        r5 = r3;
        goto L_0x002e;
    L_0x0023:
        r5 = r0.a;
        r5 = r5 & r1;
        if (r5 == 0) goto L_0x0021;
    L_0x0028:
        r5 = r0.c;
        if (r5 != 0) goto L_0x002e;
    L_0x002c:
        r5 = defpackage.apxu.d;
    L_0x002e:
        r6 = r11.o;
        r7 = r12.a;
        r8 = r12.b();
        r6.a(r7, r5, r8);
        r6 = -1;
        r7 = 0;
        r8 = 8;
        if (r0 != 0) goto L_0x008f;
    L_0x003f:
        r0 = r11.r;
        r0 = r0.b;
        r1 = 7;
        if (r0 == r1) goto L_0x005c;
    L_0x0046:
        r0 = r11.g;
        r0.setVisibility(r8);
        r0 = r11.i;
        r0.setVisibility(r8);
        r0 = r11.m;
        r0.setVisibility(r8);
        r0 = r11.j;
        defpackage.adl.a(r0, r7, r7);
        goto L_0x0119;
    L_0x005c:
        r0 = r11.g;
        r0.setVisibility(r8);
        r0 = r11.i;
        r0.setVisibility(r8);
        r0 = r11.m;
        r0.setVisibility(r7);
        r0 = r11.m;
        r5 = r11.u;
        r9 = r11.r;
        r10 = r9.b;
        if (r10 != r1) goto L_0x007a;
    L_0x0075:
        r1 = r9.c;
        r1 = (defpackage.arwf) r1;
        goto L_0x007c;
    L_0x007a:
        r1 = defpackage.arwf.c;
    L_0x007c:
        r1 = r1.b;
        r1 = defpackage.arwh.a(r1);
        if (r1 != 0) goto L_0x0086;
    L_0x0084:
        r1 = defpackage.arwh.UNKNOWN;
    L_0x0086:
        r1 = r5.a(r1);
        r0.setImageResource(r1);
        goto L_0x0119;
    L_0x008f:
        r9 = r0.e;
        r9 = defpackage.appq.a(r9);
        if (r9 == 0) goto L_0x0098;
    L_0x0097:
        goto L_0x0099;
    L_0x0098:
        r9 = 1;
    L_0x0099:
        r9 = r9 + r6;
        if (r9 == 0) goto L_0x009f;
    L_0x009c:
        r9 = r11.h;
        goto L_0x00a1;
    L_0x009f:
        r9 = r11.g;
    L_0x00a1:
        r10 = r11.j;
        defpackage.adl.a(r10, r7, r7);
        r10 = r11.m;
        r10.setVisibility(r8);
        r10 = r0.e;
        r10 = defpackage.appq.a(r10);
        if (r10 == 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00b5;
    L_0x00b4:
        r10 = 1;
    L_0x00b5:
        r10 = r10 + r6;
        if (r10 == 0) goto L_0x00c3;
    L_0x00b8:
        r5 = r11.g;
        r5.setVisibility(r8);
        r5 = r11.i;
        r5.setVisibility(r7);
        goto L_0x00d9;
    L_0x00c3:
        r10 = r11.g;
        r10.setVisibility(r7);
        r10 = r11.i;
        r10.setVisibility(r8);
        r10 = r11.g;
        if (r10 == 0) goto L_0x00d9;
    L_0x00d1:
        if (r5 == 0) goto L_0x00d5;
    L_0x00d3:
        r5 = 1;
        goto L_0x00d6;
    L_0x00d5:
        r5 = 2;
    L_0x00d6:
        defpackage.abe.b(r10, r5);
    L_0x00d9:
        if (r9 == 0) goto L_0x00e6;
    L_0x00db:
        r5 = r11.f;
        r10 = r0.b;
        if (r10 != 0) goto L_0x00e3;
    L_0x00e1:
        r10 = defpackage.aygk.f;
    L_0x00e3:
        r5.a(r9, r10);
    L_0x00e6:
        r5 = r0.d;
        if (r5 != 0) goto L_0x00ec;
    L_0x00ea:
        r5 = defpackage.aodx.c;
    L_0x00ec:
        r5 = r5.b;
        if (r5 != 0) goto L_0x00f2;
    L_0x00f0:
        r5 = defpackage.aodv.c;
    L_0x00f2:
        r5 = r5.a;
        r1 = r1 & r5;
        if (r1 != 0) goto L_0x0106;
    L_0x00f7:
        r0 = r11.g;
        r1 = r11.d;
        r5 = 2131951708; // 0x7f13005c float:1.9539838E38 double:1.0533240975E-314;
        r1 = r1.getString(r5);
        r0.setContentDescription(r1);
        goto L_0x0119;
    L_0x0106:
        r0 = r0.d;
        if (r0 != 0) goto L_0x010c;
    L_0x010a:
        r0 = defpackage.aodx.c;
    L_0x010c:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0112;
    L_0x0110:
        r0 = defpackage.aodv.c;
    L_0x0112:
        r0 = r0.b;
        r1 = r11.g;
        r1.setContentDescription(r0);
    L_0x0119:
        r0 = r11.p;
        r1 = r12.a;
        r5 = r13.g;
        if (r5 != 0) goto L_0x0123;
    L_0x0121:
        r5 = defpackage.apxu.d;
    L_0x0123:
        r9 = r12.b();
        r0.a(r1, r5, r9);
        r12 = r12.a;
        r13 = r13.l;
        r13 = r13.d();
        r12.a(r13, r3);
        r12 = r11.r;
        r13 = r12.a;
        r13 = r13 & r4;
        if (r13 == 0) goto L_0x0143;
    L_0x013c:
        r12 = r12.d;
        if (r12 != 0) goto L_0x0144;
    L_0x0140:
        r12 = defpackage.arml.f;
        goto L_0x0144;
    L_0x0143:
        r12 = r3;
    L_0x0144:
        r12 = defpackage.ajqy.a(r12);
        r13 = r11.j;
        r13.setText(r12);
        r13 = r11.j;
        r12 = java.lang.String.valueOf(r12);
        r0 = r11.b;
        r1 = r12.length();
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r9 = new java.lang.StringBuilder;
        r1 = r1 + r4;
        r1 = r1 + r5;
        r9.<init>(r1);
        r9.append(r12);
        r12 = " ";
        r9.append(r12);
        r9.append(r0);
        r12 = r9.toString();
        r13.setContentDescription(r12);
        r12 = r11.r;
        r13 = r12.a;
        r13 = r13 & 256;
        r0 = 2132017921; // 0x7f140301 float:1.9674134E38 double:1.053356811E-314;
        if (r13 == 0) goto L_0x01b2;
    L_0x0185:
        r12 = r12.k;
        if (r12 != 0) goto L_0x018b;
    L_0x0189:
        r12 = defpackage.axbh.c;
    L_0x018b:
        r12 = r12.b;
        r12 = defpackage.axbi.a(r12);
        if (r12 == 0) goto L_0x0194;
    L_0x0193:
        goto L_0x0195;
    L_0x0194:
        r12 = 1;
    L_0x0195:
        r12 = r12 + r6;
        if (r12 == r4) goto L_0x01a9;
    L_0x0198:
        if (r12 == r2) goto L_0x01a0;
    L_0x019a:
        r12 = r11.j;
        defpackage.adl.a(r12, r0);
        goto L_0x01b7;
    L_0x01a0:
        r12 = r11.j;
        r13 = 2132017899; // 0x7f1402eb float:1.967409E38 double:1.0533568E-314;
        defpackage.adl.a(r12, r13);
        goto L_0x01b7;
    L_0x01a9:
        r12 = r11.j;
        r13 = 2132018168; // 0x7f1403f8 float:1.9674635E38 double:1.053356933E-314;
        defpackage.adl.a(r12, r13);
        goto L_0x01b7;
    L_0x01b2:
        r12 = r11.j;
        defpackage.adl.a(r12, r0);
    L_0x01b7:
        r12 = r11.t;
        r12.clear();
        r12 = r11.s;
        r12.clear();
        r12 = r11.r;
        r12 = r12.j;
        r12 = r12.size();
        if (r12 > 0) goto L_0x01cc;
    L_0x01cb:
        goto L_0x022d;
    L_0x01cc:
        r12 = r11.r;
        r12 = r12.j;
        r12 = r12.iterator();
    L_0x01d4:
        r13 = r12.hasNext();
        if (r13 == 0) goto L_0x022d;
    L_0x01da:
        r13 = r12.next();
        r13 = (defpackage.axbk) r13;
        r0 = r13.a;
        r1 = 91394106; // 0x572903a float:1.14052756E-35 double:4.5154688E-316;
        if (r0 == r1) goto L_0x01f6;
    L_0x01e7:
        r1 = 90380189; // 0x563179d float:1.0677826E-35 double:4.46537464E-316;
        if (r0 != r1) goto L_0x01d4;
    L_0x01ec:
        r0 = r11.t;
        r13 = r13.b;
        r13 = (defpackage.axjt) r13;
        r0.add(r13);
        goto L_0x01d4;
    L_0x01f6:
        r0 = defpackage.apdx.g;
        r0 = r0.createBuilder();
        r0 = (defpackage.apdw) r0;
        r2 = r13.a;
        if (r2 != r1) goto L_0x0207;
    L_0x0202:
        r13 = r13.b;
        r13 = (defpackage.aped) r13;
        goto L_0x0209;
    L_0x0207:
        r13 = defpackage.aped.g;
    L_0x0209:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.apdx) r1;
        if (r13 == 0) goto L_0x0227;
    L_0x0212:
        r1.b = r13;
        r13 = r1.a;
        r13 = r13 | r4;
        r1.a = r13;
        r13 = r0.build();
        r13 = (defpackage.anxl) r13;
        r13 = (defpackage.apdx) r13;
        r0 = r11.s;
        r0.add(r13);
        goto L_0x01d4;
    L_0x0227:
        r12 = new java.lang.NullPointerException;
        r12.<init>();
        throw r12;
    L_0x022d:
        r12 = r11.t;
        r12 = r12.isEmpty();
        r13 = 15;
        if (r12 != 0) goto L_0x02b4;
    L_0x0237:
        r12 = r11.t;
        r12 = r12.iterator();
        r0 = 0;
    L_0x023e:
        r1 = r12.hasNext();
        if (r1 == 0) goto L_0x028b;
    L_0x0244:
        r1 = r12.next();
        r1 = (defpackage.axjt) r1;
        r2 = r11.n;
        r2 = r2.getChildCount();
        if (r0 < r2) goto L_0x025c;
    L_0x0252:
        r2 = r11.c;
        r5 = 2131035339; // 0x7f0504cb float:1.768122E38 double:1.052871351E-314;
        r6 = r11.n;
        android.view.View.inflate(r2, r5, r6);
    L_0x025c:
        r2 = r11.n;
        r2 = r2.getChildAt(r0);
        r2 = (android.widget.TextView) r2;
        r5 = r1.a;
        r5 = r5 & r4;
        if (r5 == 0) goto L_0x0270;
    L_0x0269:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0271;
    L_0x026d:
        r1 = defpackage.arml.f;
        goto L_0x0271;
    L_0x0270:
        r1 = r3;
    L_0x0271:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r2, r1);
        r1 = r11.c;
        r1 = r1.getResources();
        r5 = 2131624997; // 0x7f0e0425 float:1.887719E38 double:1.053162681E-314;
        r1 = r1.getDimension(r5);
        r2.setTextSize(r7, r1);
        r0 = r0 + 1;
        goto L_0x023e;
    L_0x028b:
        r12 = r11.n;
        r12 = r12.getChildCount();
        if (r0 >= r12) goto L_0x029f;
    L_0x0293:
        r12 = r11.n;
        r12 = r12.getChildAt(r0);
        r12.setVisibility(r8);
        r0 = r0 + 1;
        goto L_0x028b;
    L_0x029f:
        r12 = r11.n;
        r12.setVisibility(r7);
        r12 = r11.k;
        r12.setVisibility(r8);
        r12 = r11.q;
        r12.addRule(r13, r7);
        r12 = r11.l;
        r12.setVisibility(r8);
        return;
    L_0x02b4:
        r12 = r11.s;
        r12 = r12.isEmpty();
        if (r12 != 0) goto L_0x02e2;
    L_0x02bc:
        r12 = r11.c;
        r0 = r11.l;
        r1 = r11.s;
        defpackage.fan.a(r12, r0, r1);
        r12 = r11.n;
        r12.setVisibility(r8);
        r12 = r11.k;
        r12.setVisibility(r8);
        r12 = r11.q;
        r12.addRule(r13, r7);
        r12 = r11.l;
        r13 = r12.getChildCount();
        if (r13 <= 0) goto L_0x02dd;
    L_0x02dc:
        goto L_0x02de;
    L_0x02dd:
        r4 = 0;
    L_0x02de:
        defpackage.xpr.a(r12, r4);
        return;
    L_0x02e2:
        r12 = r11.r;
        r0 = r12.a;
        r0 = r0 & 4;
        if (r0 != 0) goto L_0x02ff;
    L_0x02ea:
        r12 = r11.n;
        r12.setVisibility(r8);
        r12 = r11.k;
        r12.setVisibility(r8);
        r12 = r11.q;
        r12.addRule(r13, r6);
        r12 = r11.l;
        r12.setVisibility(r8);
        return;
    L_0x02ff:
        r0 = r11.k;
        r12 = r12.f;
        if (r12 != 0) goto L_0x0307;
    L_0x0305:
        r12 = defpackage.arml.f;
    L_0x0307:
        r12 = defpackage.ajqy.a(r12);
        r0.setText(r12);
        r12 = r11.k;
        r12.setVisibility(r7);
        r12 = r11.n;
        r12.setVisibility(r8);
        r12 = r11.q;
        r12.addRule(r13, r7);
        r12 = r11.l;
        r12.setVisibility(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuj.a_(akor, axbo):void");
    }

    public final boolean a(View view) {
        axbo axbo = this.r;
        if (axbo != null) {
            axbm axbm = axbo.h;
            if (axbm == null) {
                axbm = axbm.c;
            }
            if (((axbm.a == 65153809 ? (aphg) axbm.b : aphg.s).a & 2048) != 0) {
                aphg aphg;
                aaas aaas = this.e;
                axbm axbm2 = this.r.h;
                if (axbm2 == null) {
                    axbm2 = axbm.c;
                }
                if (axbm2.a == 65153809) {
                    aphg = (aphg) axbm2.b;
                } else {
                    aphg = aphg.s;
                }
                apxu apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
        return false;
    }

    public final void a(akpb akpb) {
        this.o.a();
        this.p.a();
    }
}
