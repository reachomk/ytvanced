package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import java.util.ArrayList;

/* renamed from: jrr */
public abstract class jrr implements vdb {
    public final aaas a;
    public final acvx b;
    public vqx c;
    public final zwj d;
    public axkp e;
    public boolean f;
    public boolean g;
    private final Context h;
    private final jse i;
    private final akkq j;
    private final akvo k;
    private View l;
    private final ArrayList m = new ArrayList(5);
    private jru n;
    private jrv o;

    protected jrr(akkq akkq, akvo akvo, aaas aaas, acvx acvx, Context context, zwj zwj, jse jse) {
        this.j = akkq;
        this.k = akvo;
        this.a = aaas;
        this.b = acvx;
        this.h = context;
        this.d = zwj;
        this.i = (jse) amqw.a((Object) jse);
    }

    /* JADX WARNING: Missing block: B:67:0x018d, code skipped:
            if (r9 <= 2) goto L_0x018f;
     */
    public final void a(android.view.View r14, defpackage.akor r15) {
        /*
        r13 = this;
        r15 = r13.e;
        if (r15 == 0) goto L_0x0251;
    L_0x0004:
        r15 = r15.k;
        r13.g = r15;
        r15 = r13.l;
        if (r15 == 0) goto L_0x0012;
    L_0x000c:
        r15 = r15.getParent();
        if (r15 == r14) goto L_0x001e;
    L_0x0012:
        r15 = 2131758717; // 0x7f100e7d float:1.9148406E38 double:1.0532287473E-314;
        r0 = 2131758718; // 0x7f100e7e float:1.9148408E38 double:1.053228748E-314;
        r14 = defpackage.xpr.a(r14, r15, r0);
        r13.l = r14;
    L_0x001e:
        r14 = r13.l;
        r15 = 2131755081; // 0x7f100049 float:1.9141031E38 double:1.053226951E-314;
        r2 = r14.findViewById(r15);
        r14 = r13.l;
        r15 = 2131756963; // 0x7f1007a3 float:1.9144848E38 double:1.0532278807E-314;
        r14 = r14.findViewById(r15);
        r15 = r13.l;
        r0 = 2131758321; // 0x7f100cf1 float:1.9147603E38 double:1.0532285516E-314;
        r15 = r15.findViewById(r0);
        r15 = (android.widget.TextView) r15;
        r0 = r13.e;
        r0 = r0.b;
        if (r0 != 0) goto L_0x0043;
    L_0x0041:
        r0 = defpackage.arml.f;
    L_0x0043:
        r0 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r15, r0);
        r15 = r13.l;
        r0 = 2131757711; // 0x7f100a8f float:1.9146365E38 double:1.0532282503E-314;
        r15 = r15.findViewById(r0);
        r15 = (android.widget.TextView) r15;
        r0 = r13.e;
        r0 = r0.c;
        if (r0 != 0) goto L_0x005d;
    L_0x005b:
        r0 = defpackage.arml.f;
    L_0x005d:
        r0 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r15, r0);
        r15 = r13.n;
        if (r15 != 0) goto L_0x006f;
    L_0x0068:
        r15 = new jru;
        r15.<init>(r13);
        r13.n = r15;
    L_0x006f:
        r15 = r13.l;
        r0 = r13.n;
        r15.setOnClickListener(r0);
        r15 = r13.g;
        r0 = 2131755509; // 0x7f1001f5 float:1.91419E38 double:1.0532271623E-314;
        r1 = 8;
        r6 = 1;
        r7 = 0;
        if (r15 == 0) goto L_0x00bb;
    L_0x0081:
        r15 = r13.l;
        r15 = r15.findViewById(r0);
        r15.setVisibility(r1);
        r15 = r13.l;
        r0 = 2131756964; // 0x7f1007a4 float:1.914485E38 double:1.053227881E-314;
        r15 = r15.findViewById(r0);
        r15 = (android.widget.TextView) r15;
        r0 = r13.e;
        r0 = r0.i;
        if (r0 != 0) goto L_0x009d;
    L_0x009b:
        r0 = defpackage.arml.f;
    L_0x009d:
        r0 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r15, r0);
        r2.setVisibility(r1);
        r14.setVisibility(r7);
        r15 = r13.o;
        if (r15 != 0) goto L_0x00b5;
    L_0x00ae:
        r15 = new jrv;
        r15.<init>(r13);
        r13.o = r15;
    L_0x00b5:
        r15 = r13.o;
        r14.setOnClickListener(r15);
        goto L_0x00f7;
    L_0x00bb:
        r15 = r13.l;
        r15 = r15.findViewById(r0);
        r15.setVisibility(r7);
        r2.setVisibility(r7);
        if (r14 == 0) goto L_0x00cc;
    L_0x00c9:
        r14.setVisibility(r1);
    L_0x00cc:
        r14 = r13.e;
        r14 = r14.d;
        if (r14 != 0) goto L_0x00d4;
    L_0x00d2:
        r14 = defpackage.auvr.c;
    L_0x00d4:
        r14 = r14.a;
        r14 = r14 & r6;
        if (r14 == 0) goto L_0x00f7;
    L_0x00d9:
        r0 = r13.k;
        r14 = r13.l;
        r1 = r14.getRootView();
        r14 = r13.e;
        r14 = r14.d;
        if (r14 != 0) goto L_0x00e9;
    L_0x00e7:
        r14 = defpackage.auvr.c;
    L_0x00e9:
        r14 = r14.b;
        if (r14 != 0) goto L_0x00ef;
    L_0x00ed:
        r14 = defpackage.auvn.l;
    L_0x00ef:
        r3 = r14;
        r4 = r13.e;
        r5 = defpackage.acvx.g;
        r0.a(r1, r2, r3, r4, r5);
    L_0x00f7:
        r14 = r13.h;
        r15 = 4;
        r0 = 5;
        if (r14 == 0) goto L_0x0105;
    L_0x00fd:
        r14 = defpackage.xss.b(r14);
        if (r14 != 0) goto L_0x0104;
    L_0x0103:
        goto L_0x0105;
    L_0x0104:
        r0 = 4;
    L_0x0105:
        r14 = r13.l;
        r1 = 2131758322; // 0x7f100cf2 float:1.9147605E38 double:1.053228552E-314;
        r14 = r14.findViewById(r1);
        r14 = (android.view.ViewGroup) r14;
        r1 = new android.widget.LinearLayout$LayoutParams;
        r2 = r13.e;
        r2 = r2.f;
        r2 = r2.size();
        r3 = 2;
        if (r2 != r3) goto L_0x011f;
    L_0x011d:
        r2 = 1;
        goto L_0x0120;
    L_0x011f:
        r2 = 0;
    L_0x0120:
        r2 = (float) r2;
        r4 = -2;
        r1.<init>(r4, r4, r2);
        r2 = 0;
    L_0x0126:
        r4 = r13.e;
        r4 = r4.f;
        r4 = r4.size();
        r4 = java.lang.Math.min(r0, r4);
        r5 = 0;
        if (r2 >= r4) goto L_0x01c0;
    L_0x0135:
        r4 = r13.m;
        r4 = r4.size();
        if (r4 != r2) goto L_0x014d;
    L_0x013d:
        r4 = r13.m;
        r8 = new jrt;
        r9 = r13.h;
        r10 = r13.l;
        r11 = r13.j;
        r8.<init>(r9, r10, r11);
        r4.add(r8);
    L_0x014d:
        r4 = r13.m;
        r4 = r4.get(r2);
        r4 = (defpackage.jrt) r4;
        r8 = r13.e;
        r8 = r8.f;
        r8 = r8.get(r2);
        r8 = (defpackage.axkr) r8;
        r9 = r13.e;
        r9 = r9.f;
        r9 = r9.size();
        r10 = r4.a;
        r11 = r4.e;
        r12 = r8.b;
        if (r12 != 0) goto L_0x0171;
    L_0x016f:
        r12 = defpackage.aygk.f;
    L_0x0171:
        r10.a(r11, r12);
        if (r9 != r6) goto L_0x018d;
    L_0x0176:
        r9 = r4.c;
        r10 = r8.a;
        r10 = r10 & r15;
        if (r10 == 0) goto L_0x0184;
    L_0x017d:
        r10 = r8.d;
        if (r10 != 0) goto L_0x0185;
    L_0x0181:
        r10 = defpackage.arml.f;
        goto L_0x0185;
    L_0x0184:
        r10 = r5;
    L_0x0185:
        r10 = defpackage.ajqy.a(r10);
        defpackage.xpr.a(r9, r10);
        goto L_0x018f;
    L_0x018d:
        if (r9 > r3) goto L_0x01a3;
    L_0x018f:
        r9 = r4.d;
        r10 = r8.a;
        r10 = r10 & r3;
        if (r10 == 0) goto L_0x019c;
    L_0x0196:
        r5 = r8.c;
        if (r5 != 0) goto L_0x019c;
    L_0x019a:
        r5 = defpackage.arml.f;
    L_0x019c:
        r5 = defpackage.ajqy.a(r5);
        defpackage.xpr.a(r9, r5);
    L_0x01a3:
        r5 = r4.b;
        r5.setVisibility(r7);
        r4 = r4.b;
        r5 = r4.getParent();
        if (r5 == 0) goto L_0x01b9;
    L_0x01b0:
        r5 = r4.getParent();
        r5 = (android.view.ViewGroup) r5;
        r5.removeView(r4);
    L_0x01b9:
        r14.addView(r4, r1);
        r2 = r2 + 1;
        goto L_0x0126;
    L_0x01c0:
        r14 = new vqx;
        r15 = r13.l;
        r14.<init>(r15, r7);
        r13.c = r14;
        r14 = r13.e;
        r15 = r14.a;
        r15 = r15 & 8192;
        if (r15 == 0) goto L_0x0215;
    L_0x01d1:
        r15 = r13.i;
        r0 = r13.l;
        r14 = r14.n;
        if (r14 != 0) goto L_0x01db;
    L_0x01d9:
        r14 = defpackage.axak.a;
    L_0x01db:
        r1 = com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r14.a(r1);
        r14 = r14.h;
        r1 = r1.d;
        r14 = r14.a(r1);
        if (r14 != 0) goto L_0x01f0;
    L_0x01ee:
        r14 = r5;
        goto L_0x0212;
    L_0x01f0:
        r14 = r13.e;
        r14 = r14.n;
        if (r14 != 0) goto L_0x01f8;
    L_0x01f6:
        r14 = defpackage.axak.a;
    L_0x01f8:
        r1 = com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r14.a(r1);
        r14 = r14.h;
        r2 = r1.d;
        r14 = r14.b(r2);
        if (r14 != 0) goto L_0x020e;
    L_0x020b:
        r14 = r1.b;
        goto L_0x0212;
    L_0x020e:
        r14 = r1.a(r14);
    L_0x0212:
        r15.a(r0, r14);
    L_0x0215:
        r14 = r13.l;
        r14.setVisibility(r7);
        r14 = r13.b;
        r15 = r13.e;
        r15 = r15.g;
        r15 = r15.d();
        r14.a(r15, r5);
        r14 = r13.a;
        r15 = r13.e;
        r0 = r15.l;
        defpackage.aabd.a(r14, r0, r15);
        r14 = r13.e;
        r14 = r14.toBuilder();
        r14 = (defpackage.anxo) r14;
        r14 = (defpackage.axks) r14;
        r14.copyOnWrite();
        r15 = r14.instance;
        r15 = (defpackage.axkp) r15;
        r0 = defpackage.anxl.emptyProtobufList();
        r15.l = r0;
        r14 = r14.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.axkp) r14;
        r13.e = r14;
    L_0x0251:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrr.a(android.view.View, akor):void");
    }

    public final void a() {
        this.f = true;
        c();
    }

    public final void b() {
        c();
    }

    public final void a(View view) {
        if (view != null) {
            xpr.a(view, (int) R.id.shopping_companion_card_stub, (int) R.id.shopping_companion_card).setVisibility(8);
        }
        view = this.l;
        if (view != null) {
            view.setVisibility(8);
            ((ViewGroup) this.l.findViewById(R.id.product_container)).removeAllViews();
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jrt jrt = (jrt) arrayList.get(i);
                jrt.b.setVisibility(8);
                jrt.d.setVisibility(8);
                jrt.c.setVisibility(8);
            }
            axkp axkp = this.e;
            if (!(axkp == null || (axkp.a & 8192) == 0)) {
                Object b;
                jse jse = this.i;
                anxp anxp = axkp.n;
                if (anxp == null) {
                    anxp = axak.a;
                }
                anxr access$000 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    anxp = this.e.n;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    access$000 = anxl.checkIsLite(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                    anxp.a(access$000);
                    b = anxp.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                } else {
                    b = null;
                }
                jse.a(b);
            }
        }
        vqx vqx = this.c;
        if (vqx != null) {
            vqx.b();
        }
        this.l = null;
        this.e = null;
        this.f = false;
    }

    private final void c() {
        if (this.f && this.e != null) {
            View view = this.l;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }
}
