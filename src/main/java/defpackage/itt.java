package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: itt */
public final class itt extends akpl implements akok, xcp {
    private ajwc A;
    private final iuj B;
    private ese C;
    private final akod D;
    private boolean E;
    private final ViewGroup a;
    private final RecyclerView b;
    private final int c;
    private final RelativeLayout d = ((RelativeLayout) this.a.findViewById(R.id.header_layout));
    private final akpk e;
    private final fmx f;
    private final xci g;
    private final TextView h;
    private final akvo i;
    private final View j;
    private final View k;
    private final View l = this.a.findViewById(R.id.separator);
    private final int m;
    private final Context n;
    private final Resources o;
    private final ViewGroup p;
    private final TextView q;
    private final eso r;
    private final fnb s;
    private final aaas t;
    private final akpd u;
    private final ans v;
    private final itq w;
    private final esh x;
    private final eyq y;
    private final eyq z;

    public itt(Context context, akvz akvz, fmx fmx, xci xci, bcaa bcaa, est est, fna fna, esh esh, akvo akvo, aaas aaas, akpe akpe) {
        this.n = context;
        this.f = (fmx) amqw.a((Object) fmx);
        this.g = (xci) amqw.a((Object) xci);
        this.i = (akvo) amqw.a((Object) akvo);
        this.t = (aaas) amqw.a((Object) aaas);
        this.x = esh;
        this.a = (ViewGroup) ((LayoutInflater) amqw.a(LayoutInflater.from(context))).inflate(R.layout.horizontal_card_list, null);
        this.B = (iuj) bcaa.get();
        this.d.addView(this.B.a, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_header_top_bottom_padding_adjustment);
        View view = this.B.a;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + dimensionPixelSize, view.getPaddingRight(), view.getPaddingBottom() + dimensionPixelSize);
        this.m = context.getResources().getDimensionPixelOffset(R.dimen.horizontal_card_list_channel_peekaboo_adjustment);
        this.b = (RecyclerView) this.a.findViewById(R.id.card_list_container);
        this.c = this.b.getPaddingTop();
        this.v = new ans();
        this.v.b(0);
        this.b.a(this.v);
        RecyclerView recyclerView = this.b;
        recyclerView.a(new xpi(recyclerView));
        this.e = new akpk();
        this.u = akpe.a((akpb) akvz.get());
        this.u.a(this.e);
        this.D = new akod();
        this.u.a(this.D);
        this.w = new itq();
        this.u.a(this.w);
        this.y = new eyq(context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_item_spacing));
        this.z = new eyq(context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_narrow_item_spacing));
        this.o = context.getResources();
        this.h = (TextView) this.a.findViewById(R.id.card_list_button);
        this.s = fna.a(this.h);
        this.q = (TextView) this.a.findViewById(R.id.card_list_subscribe_button);
        this.r = est.a(this.q, null);
        this.j = this.a.findViewById(R.id.card_list_contextual_menu_anchor);
        this.k = this.a.findViewById(R.id.card_list_contextual_menu_anchor_wrapper);
        this.p = (ViewGroup) this.a.findViewById(R.id.sort_filter_sub_menu_container);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    public final boolean a(android.view.View r4) {
        /*
        r3 = this;
        r4 = r3.A;
        r0 = 0;
        if (r4 == 0) goto L_0x0015;
    L_0x0005:
        r4 = r4.f;
        if (r4 == 0) goto L_0x0015;
    L_0x0009:
        r1 = r4.a;
        r2 = 65153809; // 0x3e22b11 float:1.3292974E-36 double:3.21902587E-316;
        if (r1 != r2) goto L_0x0015;
    L_0x0010:
        r4 = r4.b;
        r4 = (defpackage.aphg) r4;
        goto L_0x0016;
    L_0x0015:
        r4 = r0;
    L_0x0016:
        if (r4 == 0) goto L_0x0029;
    L_0x0018:
        r1 = r4.a;
        r1 = r1 & 2048;
        if (r1 == 0) goto L_0x0029;
    L_0x001e:
        r1 = r3.t;
        r4 = r4.l;
        if (r4 != 0) goto L_0x0026;
    L_0x0024:
        r4 = defpackage.apxu.d;
    L_0x0026:
        r1.a(r4, r0);
    L_0x0029:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itt.a(android.view.View):boolean");
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.e.clear();
        this.g.b(this);
        this.B.a(akpb);
        this.r.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x025b A:{SYNTHETIC, EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x025b A:{SYNTHETIC, EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x025b A:{SYNTHETIC, EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x025b A:{SYNTHETIC, EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  , EDGE_INSN: B:177:0x025b->B:124:0x025b ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ed  */
    public final /* synthetic */ void a(defpackage.akor r11, java.lang.Object r12) {
        /*
        r10 = this;
        r12 = (defpackage.ajwc) r12;
        r10.A = r12;
        r0 = r10.A;
        r1 = r0.a;
        r6 = 0;
        if (r1 == 0) goto L_0x003e;
    L_0x000b:
        r2 = r1.length;
        if (r2 == 0) goto L_0x003e;
    L_0x000e:
        r1 = r1[r6];
        if (r1 == 0) goto L_0x003e;
    L_0x0012:
        r1 = r1.c;
        if (r1 == 0) goto L_0x003e;
    L_0x0016:
        r1 = r10.w;
        r0 = defpackage.aocf.toByteArray(r0);	 Catch:{ aocg -> 0x0022 }
        r0 = defpackage.ajwc.a(r0);	 Catch:{ aocg -> 0x0022 }
        r1.a = r0;	 Catch:{ aocg -> 0x0022 }
    L_0x0022:
        r0 = "refinement_selection_listener";
        r0 = r11.a(r0);
        r0 = (defpackage.iww) r0;
        if (r0 == 0) goto L_0x0030;
    L_0x002c:
        r1 = r10.w;
        r1.c = r0;
    L_0x0030:
        r0 = "refinement_selection_controller";
        r0 = r11.a(r0);
        r0 = (defpackage.iwz) r0;
        if (r0 == 0) goto L_0x003e;
    L_0x003a:
        r1 = r10.w;
        r1.b = r0;
    L_0x003e:
        r0 = r10.D;
        r1 = r11.a;
        r0.a = r1;
        r0 = r12.c;
        r1 = r10.n;
        r1 = r1.getResources();
        r2 = 2131625204; // 0x7f0e04f4 float:1.887761E38 double:1.053162783E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r7 = 8;
        if (r0 != 0) goto L_0x006a;
    L_0x0057:
        r0 = r10.d;
        r0.setVisibility(r7);
        r0 = r10.n;
        r0 = r0.getResources();
        r1 = 2131625205; // 0x7f0e04f5 float:1.8877611E38 double:1.0531627836E-314;
        r1 = r0.getDimensionPixelSize(r1);
        goto L_0x0085;
    L_0x006a:
        r0 = r0.a;
        r0 = r0 & 2;
        if (r0 != 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0080;
    L_0x0071:
        r0 = r10.B;
        r2 = r10.A;
        r2 = r2.c;
        r2 = r2.c;
        if (r2 != 0) goto L_0x007d;
    L_0x007b:
        r2 = defpackage.axbo.m;
    L_0x007d:
        r0.a_(r11, r2);
    L_0x0080:
        r0 = r10.d;
        r0.setVisibility(r6);
    L_0x0085:
        r0 = r10.b;
        r0 = r0.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r0.setMargins(r6, r1, r6, r6);
        r10.E = r6;
        r0 = r12.g;
        r1 = defpackage.axqn.class;
        r0 = defpackage.ajzv.b(r0, r1);
        r8 = 0;
        r9 = 1;
        if (r0 == 0) goto L_0x00d3;
    L_0x009e:
        r0 = r10.C;
        if (r0 != 0) goto L_0x00c2;
    L_0x00a2:
        r0 = r10.x;
        r1 = r10.p;
        r2 = 2131035370; // 0x7f0504ea float:1.7681284E38 double:1.0528713664E-314;
        r3 = 2131034671; // 0x7f05022f float:1.7679866E38 double:1.052871021E-314;
        r0 = r0.a(r1, r2, r3);
        r10.C = r0;
        r0 = r10.C;
        r0 = r0.c;
        r0.setBackground(r8);
        r0 = r10.p;
        r1 = r10.C;
        r1 = r1.c;
        r0.addView(r1);
    L_0x00c2:
        r0 = r10.C;
        r1 = r12.g;
        r2 = defpackage.axqn.class;
        r1 = defpackage.ajzv.a(r1, r2);
        r1 = (defpackage.axqn) r1;
        r0.a_(r11, r1);
        r10.E = r9;
    L_0x00d3:
        r0 = r10.p;
        r1 = r10.E;
        defpackage.xpr.a(r0, r1);
        r0 = r12.f;
        if (r0 != 0) goto L_0x00e2;
    L_0x00de:
        r0 = 0;
    L_0x00df:
        r1 = 0;
    L_0x00e0:
        r9 = 0;
        goto L_0x0140;
    L_0x00e2:
        r1 = r10.E;
        if (r1 == 0) goto L_0x00e7;
    L_0x00e6:
        goto L_0x00de;
    L_0x00e7:
        r1 = r0.a;
        r2 = 65153809; // 0x3e22b11 float:1.3292974E-36 double:3.21902587E-316;
        if (r1 != r2) goto L_0x0111;
    L_0x00ee:
        r0 = "sectionListController";
        r1 = r11.a(r0);
        r1 = (defpackage.akxv) r1;
        r3 = r10.s;
        r4 = r12.f;
        r5 = r4.a;
        if (r5 != r2) goto L_0x0103;
    L_0x00fe:
        r2 = r4.b;
        r2 = (defpackage.aphg) r2;
        goto L_0x0105;
    L_0x0103:
        r2 = defpackage.aphg.s;
    L_0x0105:
        r4 = r11.a;
        r0 = defpackage.amur.a(r0, r1);
        r3.a(r2, r4, r0);
        r0 = 0;
        r1 = 0;
        goto L_0x0140;
    L_0x0111:
        r2 = 66439850; // 0x3f5caaa float:1.4446335E-36 double:3.28256474E-316;
        if (r1 != r2) goto L_0x012d;
    L_0x0116:
        r1 = r10.i;
        r2 = r10.k;
        r3 = r10.j;
        r0 = r0.b;
        r4 = r0;
        r4 = (defpackage.auvn) r4;
        r5 = r11.a;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r12;
        r0.a(r1, r2, r3, r4, r5);
        r0 = 1;
        goto L_0x00df;
    L_0x012d:
        r2 = 55419609; // 0x34da2d9 float:6.0431025E-37 double:2.7380925E-316;
        if (r1 != r2) goto L_0x00de;
    L_0x0132:
        r1 = r10.r;
        r0 = r0.b;
        r0 = (defpackage.axwa) r0;
        r2 = r11.a;
        r1.a(r0, r2);
        r0 = 0;
        r1 = 1;
        goto L_0x00e0;
    L_0x0140:
        r2 = r10.h;
        defpackage.xpr.a(r2, r9);
        r2 = r10.j;
        defpackage.xpr.a(r2, r0);
        r2 = r10.k;
        defpackage.xpr.a(r2, r0);
        r0 = r10.q;
        defpackage.xpr.a(r0, r1);
        r0 = r10.e;
        r0.clear();
        r0 = r10.b;
        r1 = r10.u;
        r0.a(r1);
        r0 = r12.a;
        r1 = r0.length;
        r2 = 0;
    L_0x0164:
        if (r2 >= r1) goto L_0x01ad;
    L_0x0166:
        r3 = r0[r2];
        r4 = r10.e;
        if (r3 != 0) goto L_0x016e;
    L_0x016c:
        r5 = r8;
        goto L_0x01a7;
    L_0x016e:
        r5 = r3.e;
        if (r5 != 0) goto L_0x01a7;
    L_0x0172:
        r5 = r3.j;
        if (r5 != 0) goto L_0x01a7;
    L_0x0176:
        r5 = r3.k;
        if (r5 != 0) goto L_0x01a7;
    L_0x017a:
        r5 = r3.f;
        if (r5 != 0) goto L_0x01a7;
    L_0x017e:
        r5 = r3.i;
        if (r5 != 0) goto L_0x01a7;
    L_0x0182:
        r5 = r3.m;
        if (r5 != 0) goto L_0x01a7;
    L_0x0186:
        r5 = r3.l;
        if (r5 != 0) goto L_0x01a7;
    L_0x018a:
        r5 = r3.h;
        if (r5 != 0) goto L_0x01a7;
    L_0x018e:
        r5 = r3.c;
        if (r5 != 0) goto L_0x01a7;
    L_0x0192:
        r5 = r3.d;
        if (r5 != 0) goto L_0x01a7;
    L_0x0196:
        r5 = r3.n;
        if (r5 != 0) goto L_0x01a7;
    L_0x019a:
        r5 = r3.o;
        if (r5 != 0) goto L_0x01a7;
    L_0x019e:
        r5 = r3.b;
        if (r5 != 0) goto L_0x01a7;
    L_0x01a2:
        r3 = r3.g;
        if (r3 == 0) goto L_0x016c;
    L_0x01a6:
        r5 = r3;
    L_0x01a7:
        r4.add(r5);
        r2 = r2 + 1;
        goto L_0x0164;
    L_0x01ad:
        r0 = r12.d;
        if (r0 == 0) goto L_0x01ca;
    L_0x01b1:
        r1 = r10.f;
        r2 = r0.a;
        r3 = 102716411; // 0x61f53fb float:2.9966275E-35 double:5.074865E-316;
        if (r2 != r3) goto L_0x01bf;
    L_0x01ba:
        r0 = r0.b;
        r0 = (defpackage.aruh) r0;
        goto L_0x01c1;
    L_0x01bf:
        r0 = defpackage.aruh.j;
    L_0x01c1:
        r2 = r10.b;
        r3 = r12.d;
        r11 = r11.a;
        r1.a(r0, r2, r3, r11);
    L_0x01ca:
        r11 = r12.e;
        r0 = 2130772280; // 0x7f010138 float:1.7147674E38 double:1.0527413827E-314;
        r1 = 5;
        if (r11 != 0) goto L_0x01d3;
    L_0x01d2:
        goto L_0x01e9;
    L_0x01d3:
        r11 = r11.b;
        r11 = defpackage.arvf.a(r11);
        if (r11 == 0) goto L_0x01e9;
    L_0x01db:
        if (r11 != r1) goto L_0x01e9;
    L_0x01dd:
        r11 = r10.b;
        r2 = r10.n;
        r2 = defpackage.xwe.a(r2, r0, r6);
        r11.setBackgroundColor(r2);
        goto L_0x01ee;
    L_0x01e9:
        r11 = r10.b;
        r11.setBackground(r8);
    L_0x01ee:
        r11 = defpackage.ajwb.a;
        r11 = r12.hasExtension(r11);
        if (r11 == 0) goto L_0x025b;
    L_0x01f6:
        r11 = defpackage.ajwb.a;
        r11 = r12.getExtension(r11);
        r11 = (java.lang.Boolean) r11;
        r11 = r11.booleanValue();
        if (r11 == 0) goto L_0x025b;
    L_0x0204:
        r11 = r12.a;
        if (r11 == 0) goto L_0x025b;
    L_0x0208:
        r11 = 0;
    L_0x0209:
        r2 = r12.a;
        r3 = r2.length;
        if (r11 >= r3) goto L_0x025b;
    L_0x020e:
        r2 = r2[r11];
        r2 = r2.c;
        if (r2 == 0) goto L_0x0258;
    L_0x0214:
        r3 = defpackage.axdm.b;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r4 = r2.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 == 0) goto L_0x0258;
    L_0x0227:
        r3 = defpackage.axdm.b;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r4 = r3.d;
        r2 = r2.b(r4);
        if (r2 != 0) goto L_0x023d;
    L_0x023a:
        r2 = r3.b;
        goto L_0x0241;
    L_0x023d:
        r2 = r3.a(r2);
    L_0x0241:
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x0258;
    L_0x0249:
        r2 = r10.v;
        r3 = r10.o;
        r4 = 2131626860; // 0x7f0e0b6c float:1.8880968E38 double:1.0531636013E-314;
        r3 = r3.getDimensionPixelOffset(r4);
        r2.a_(r11, r3);
        goto L_0x025b;
    L_0x0258:
        r11 = r11 + 1;
        goto L_0x0209;
    L_0x025b:
        r11 = r10.c;
        r2 = r12.e;
        if (r2 != 0) goto L_0x0262;
    L_0x0261:
        goto L_0x027e;
    L_0x0262:
        r2 = r2.b;
        r2 = defpackage.arvf.a(r2);
        if (r2 == 0) goto L_0x027e;
    L_0x026a:
        if (r2 != r1) goto L_0x027e;
    L_0x026c:
        r1 = r12.c;
        if (r1 == 0) goto L_0x0272;
    L_0x0270:
        r11 = r10.m;
    L_0x0272:
        r1 = r10.d;
        r2 = r10.n;
        r0 = defpackage.xwe.a(r2, r0, r6);
        r1.setBackgroundColor(r0);
        goto L_0x02a1;
    L_0x027e:
        r0 = defpackage.ajwb.a;
        r0 = r12.hasExtension(r0);
        if (r0 == 0) goto L_0x029c;
    L_0x0286:
        r0 = defpackage.ajwb.a;
        r0 = r12.getExtension(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x029c;
    L_0x0294:
        r11 = r10.d;
        r11.setBackground(r8);
        r11 = 32;
        goto L_0x02a1;
    L_0x029c:
        r0 = r10.d;
        r0.setBackground(r8);
    L_0x02a1:
        r0 = r10.b;
        r1 = r0.getPaddingLeft();
        r2 = r10.b;
        r2 = r2.getPaddingRight();
        r3 = r10.b;
        r3 = r3.getPaddingBottom();
        r0.setPadding(r1, r11, r2, r3);
        r11 = r10.l;
        if (r11 == 0) goto L_0x02db;
    L_0x02ba:
        r11 = defpackage.ajwb.a;
        r11 = r12.hasExtension(r11);
        if (r11 == 0) goto L_0x02d6;
    L_0x02c2:
        r11 = defpackage.ajwb.a;
        r11 = r12.getExtension(r11);
        r11 = (java.lang.Boolean) r11;
        r11 = r11.booleanValue();
        if (r11 == 0) goto L_0x02d6;
    L_0x02d0:
        r11 = r10.l;
        r11.setVisibility(r6);
        goto L_0x02db;
    L_0x02d6:
        r11 = r10.l;
        r11.setVisibility(r7);
    L_0x02db:
        r11 = r10.b;
        r11 = r11.c();
        if (r11 <= 0) goto L_0x02e8;
    L_0x02e3:
        r11 = r10.b;
        r11.d();
    L_0x02e8:
        r11 = r12.e;
        if (r11 != 0) goto L_0x02ed;
    L_0x02ec:
        goto L_0x0300;
    L_0x02ed:
        r11 = r11.b;
        r11 = defpackage.arvf.a(r11);
        if (r11 == 0) goto L_0x0300;
    L_0x02f5:
        r12 = 7;
        if (r11 != r12) goto L_0x0300;
    L_0x02f8:
        r11 = r10.b;
        r12 = r10.z;
        r11.a(r12, r6);
        goto L_0x0307;
    L_0x0300:
        r11 = r10.b;
        r12 = r10.y;
        r11.a(r12, r6);
    L_0x0307:
        r11 = r10.g;
        r11.a(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itt.a(akor, java.lang.Object):void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{zyg.class};
        } else if (i == 0) {
            int indexOf = this.e.indexOf(((zyg) obj).d);
            if (indexOf >= 0) {
                this.e.remove(indexOf);
                ajwe[] ajweArr = this.A.a;
                ajwe[] ajweArr2 = new ajwe[(ajweArr.length - 1)];
                System.arraycopy(ajweArr, 0, ajweArr2, 0, indexOf);
                ajweArr = this.A.a;
                System.arraycopy(ajweArr, indexOf + 1, ajweArr2, indexOf, (ajweArr.length - indexOf) - 1);
                this.A.a = ajweArr2;
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
