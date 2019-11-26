package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;

/* renamed from: kjs */
public final class kjs implements akot {
    private final int A = this.q.getDimensionPixelSize(R.dimen.shelf_header_badge_padding_bottom);
    private final int B = this.q.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_bottom);
    private final int C = this.q.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_top_linear_grid_tablet);
    private final int D = this.q.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_bottom_linear_grid_tablet);
    private final int E = this.q.getDimensionPixelSize(R.dimen.shelf_header_menu_anchor_margin_offset);
    private final int F = this.q.getDimensionPixelSize(R.dimen.shelf_header_menu_anchor_margin_offset_default);
    public final TextView a;
    public kjw b;
    private final Context c;
    private final akkq d;
    private final aaas e;
    private final akou f;
    private final hwl g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;
    private final View m;
    private final akvo n;
    private final ChipCloudView o;
    private final CompoundButton p;
    private final Resources q;
    private final zzl r;
    private final ahlo s;
    private akao t;
    private final akoj u;
    private final int v = this.q.getDimensionPixelSize(R.dimen.shelf_header_normal_padding_top);
    private final int w = this.q.getDimensionPixelSize(R.dimen.shelf_header_autonav_padding_top);
    private final int x = this.q.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_top);
    private final int y = this.q.getDimensionPixelSize(R.dimen.shelf_header_normal_padding_bottom);
    private final int z = this.q.getDimensionPixelSize(R.dimen.shelf_header_autonav_padding_bottom);

    public kjs(Context context, flu flu, akkq akkq, aaas aaas, akvo akvo, hwl hwl, zzl zzl) {
        this.u = new akoj(aaas, (akou) flu);
        this.c = (Context) amqw.a((Object) context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.e = (aaas) amqw.a((Object) aaas);
        this.f = (akou) amqw.a((Object) flu);
        this.n = (akvo) amqw.a((Object) akvo);
        this.g = (hwl) amqw.a((Object) hwl);
        this.r = zzl;
        this.q = context.getResources();
        this.h = View.inflate(context, R.layout.shelf_header, null);
        this.i = (TextView) this.h.findViewById(R.id.title);
        this.a = (TextView) this.h.findViewById(R.id.autonav_title);
        this.j = (TextView) this.h.findViewById(R.id.autonav_toggle_title);
        this.k = (TextView) this.h.findViewById(R.id.subtitle);
        this.o = (ChipCloudView) this.h.findViewById(R.id.badges_container);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cloud_chip_margin);
        this.o.a(dimensionPixelSize, dimensionPixelSize);
        this.l = (ImageView) this.h.findViewById(R.id.thumbnail);
        this.m = this.h.findViewById(R.id.contextual_menu_anchor);
        this.p = (CompoundButton) this.h.findViewById(R.id.autonav_toggle);
        this.s = new kjv(this);
        this.p.setOnCheckedChangeListener(new kju(this, hwl));
        this.h.addOnLayoutChangeListener(new kjx(this));
        flu.a(this.h);
    }

    public final View K_() {
        return this.f.a();
    }

    public final void b() {
        boolean a = this.g.a();
        this.p.setChecked(a);
        kjw kjw = this.b;
        if (kjw != null) {
            kjw.a(a);
        }
    }

    public final void a(akpb akpb) {
        this.u.a();
        this.g.b(this.s);
    }

    private static aphv a(akao akao) {
        axjl axjl = akao.m;
        if (axjl == null || (axjl.a & 1) == 0) {
            return null;
        }
        aphv aphv = axjl.b;
        if (aphv == null) {
            aphv = aphv.s;
        }
        return aphv;
    }

    private static CharSequence a(aodx aodx, CharSequence charSequence) {
        if (!(aodx == null || (aodx.a & 1) == 0)) {
            aodv aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            if ((aodv.a & 2) != 0) {
                return aodv.b;
            }
        }
        return charSequence;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c1  */
    /* JADX WARNING: Missing block: B:3:0x002a, code skipped:
            if (r2 != 0) goto L_0x002e;
     */
    /* JADX WARNING: Missing block: B:14:0x003d, code skipped:
            if (r3 != 4) goto L_0x005a;
     */
    public final /* synthetic */ void a_(defpackage.akor r17, java.lang.Object r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r8 = r18;
        r8 = (defpackage.akao) r8;
        r2 = r0.u;
        r3 = r1.a;
        r4 = r8.c;
        r5 = r17.b();
        r2.a(r3, r4, r5);
        r0.t = r8;
        r2 = r1.a;
        r3 = r8.g;
        r9 = 0;
        r2.a(r3, r9);
        r2 = r8.k;
        r10 = 1;
        if (r2 == 0) goto L_0x002d;
    L_0x0024:
        r2 = r2.b;
        r2 = defpackage.axjx.a(r2);
        if (r2 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x002e;
    L_0x002d:
        r2 = 1;
    L_0x002e:
        r3 = r2 + -1;
        if (r2 == 0) goto L_0x0376;
    L_0x0032:
        r2 = 4;
        if (r3 == 0) goto L_0x0052;
    L_0x0035:
        if (r3 == r10) goto L_0x0052;
    L_0x0037:
        r4 = 2;
        if (r3 == r4) goto L_0x0049;
    L_0x003a:
        r4 = 3;
        if (r3 == r4) goto L_0x0040;
    L_0x003d:
        if (r3 == r2) goto L_0x0052;
    L_0x003f:
        goto L_0x005a;
    L_0x0040:
        r3 = r0.i;
        r4 = 2132017747; // 0x7f140253 float:1.9673781E38 double:1.053356725E-314;
        defpackage.adl.a(r3, r4);
        goto L_0x005a;
    L_0x0049:
        r3 = r0.i;
        r4 = 2132017748; // 0x7f140254 float:1.9673783E38 double:1.0533567256E-314;
        defpackage.adl.a(r3, r4);
        goto L_0x005a;
    L_0x0052:
        r3 = r0.i;
        r4 = 2132017746; // 0x7f140252 float:1.967378E38 double:1.0533567246E-314;
        defpackage.adl.a(r3, r4);
    L_0x005a:
        r3 = r0.t;
        r3 = defpackage.kjs.a(r3);
        r11 = 8;
        r12 = 0;
        if (r3 != 0) goto L_0x00af;
    L_0x0065:
        r3 = r8.a;
        r3 = defpackage.ajqy.a(r3);
        r4 = r0.i;
        r4.setText(r3);
        r4 = r0.i;
        r3 = java.lang.String.valueOf(r3);
        r5 = r0.q;
        r6 = 2131951711; // 0x7f13005f float:1.9539844E38 double:1.053324099E-314;
        r5 = r5.getString(r6);
        r6 = r3.length();
        r7 = java.lang.String.valueOf(r5);
        r7 = r7.length();
        r13 = new java.lang.StringBuilder;
        r6 = r6 + r10;
        r6 = r6 + r7;
        r13.<init>(r6);
        r13.append(r3);
        r3 = " ";
        r13.append(r3);
        r13.append(r5);
        r3 = r13.toString();
        r4.setContentDescription(r3);
        r3 = r0.i;
        r3.setVisibility(r12);
        r3 = r0.a;
        r3.setVisibility(r11);
        goto L_0x00c4;
    L_0x00af:
        r3 = r0.a;
        r4 = r8.a;
        r4 = defpackage.ajqy.a(r4);
        r3.setText(r4);
        r3 = r0.i;
        r3.setVisibility(r11);
        r3 = r0.a;
        r3.setVisibility(r12);
    L_0x00c4:
        r3 = r0.c;
        r3 = defpackage.xss.b(r3);
        if (r3 == 0) goto L_0x00ef;
    L_0x00cc:
        r3 = r0.r;
        r3 = defpackage.foh.p(r3);
        if (r3 == 0) goto L_0x00ef;
    L_0x00d4:
        r3 = r8.a;
        if (r3 != 0) goto L_0x00ef;
    L_0x00d8:
        r3 = r0.i;
        r3.setVisibility(r11);
        r3 = r0.h;
        r4 = r0.c;
        r4 = r4.getResources();
        r5 = 2131626781; // 0x7f0e0b1d float:1.8880808E38 double:1.0531635622E-314;
        r4 = r4.getDimensionPixelSize(r5);
        r3.setMinimumHeight(r4);
    L_0x00ef:
        r3 = r0.c;
        r3 = defpackage.xss.b(r3);
        if (r3 == 0) goto L_0x0119;
    L_0x00f7:
        r3 = r0.r;
        r3 = defpackage.foh.p(r3);
        if (r3 == 0) goto L_0x0119;
    L_0x00ff:
        r3 = r0.t;
        r3 = r3.a;
        if (r3 != 0) goto L_0x0119;
    L_0x0105:
        r2 = r0.h;
        r3 = r2.getPaddingLeft();
        r4 = r0.C;
        r5 = r0.h;
        r5 = r5.getPaddingRight();
        r6 = r0.D;
        r2.setPadding(r3, r4, r5, r6);
        goto L_0x0135;
    L_0x0119:
        r3 = r0.t;
        r4 = r3.j;
        if (r4 == 0) goto L_0x0137;
    L_0x011f:
        r4 = r4.length;
        if (r4 <= 0) goto L_0x0137;
    L_0x0122:
        r2 = r0.h;
        r3 = r2.getPaddingLeft();
        r4 = r0.v;
        r5 = r0.h;
        r5 = r5.getPaddingRight();
        r6 = r0.A;
        r2.setPadding(r3, r4, r5, r6);
    L_0x0135:
        r2 = 0;
        goto L_0x019e;
    L_0x0137:
        r4 = r3.h;
        if (r4 != 0) goto L_0x013c;
    L_0x013b:
        goto L_0x0156;
    L_0x013c:
        r4 = r4.a;
        r4 = r4 & r10;
        if (r4 == 0) goto L_0x0156;
    L_0x0141:
        r2 = r0.h;
        r3 = r2.getPaddingLeft();
        r4 = r0.x;
        r5 = r0.h;
        r5 = r5.getPaddingRight();
        r6 = r0.B;
        r2.setPadding(r3, r4, r5, r6);
        r2 = 1;
        goto L_0x019e;
    L_0x0156:
        r3 = defpackage.kjs.a(r3);
        if (r3 != 0) goto L_0x018a;
    L_0x015c:
        r3 = r0.v;
        r4 = r0.t;
        r4 = r4.k;
        if (r4 != 0) goto L_0x0165;
    L_0x0164:
        goto L_0x0178;
    L_0x0165:
        r4 = r4.b;
        r4 = defpackage.axjx.a(r4);
        if (r4 == 0) goto L_0x0178;
    L_0x016d:
        if (r4 != r2) goto L_0x0178;
    L_0x016f:
        r2 = r0.q;
        r3 = 2131626784; // 0x7f0e0b20 float:1.8880814E38 double:1.0531635637E-314;
        r3 = r2.getDimensionPixelSize(r3);
    L_0x0178:
        r2 = r0.h;
        r4 = r2.getPaddingLeft();
        r5 = r0.h;
        r5 = r5.getPaddingRight();
        r6 = r0.y;
        r2.setPadding(r4, r3, r5, r6);
        goto L_0x0135;
    L_0x018a:
        r2 = r0.h;
        r3 = r2.getPaddingLeft();
        r4 = r0.w;
        r5 = r0.h;
        r5 = r5.getPaddingRight();
        r6 = r0.z;
        r2.setPadding(r3, r4, r5, r6);
        goto L_0x0135;
    L_0x019e:
        r3 = r0.m;
        r3 = r3.getLayoutParams();
        r3 = (android.view.ViewGroup.MarginLayoutParams) r3;
        if (r2 != 0) goto L_0x01ab;
    L_0x01a8:
        r2 = r0.F;
        goto L_0x01ad;
    L_0x01ab:
        r2 = r0.E;
    L_0x01ad:
        r3.topMargin = r2;
        r2 = r0.m;
        r2.setLayoutParams(r3);
        r2 = r8.f;
        r2 = defpackage.ajqy.a(r2);
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x01cb;
    L_0x01c0:
        r3 = r0.k;
        r3.setText(r2);
        r2 = r0.k;
        r2.setVisibility(r12);
        goto L_0x01e7;
    L_0x01cb:
        r2 = r8.e;
        r2 = defpackage.ajqy.a(r2);
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x01e2;
    L_0x01d7:
        r3 = r0.k;
        r3.setText(r2);
        r2 = r0.k;
        r2.setVisibility(r12);
        goto L_0x01e7;
    L_0x01e2:
        r2 = r0.k;
        r2.setVisibility(r11);
    L_0x01e7:
        r2 = r0.d;
        r3 = r0.l;
        r4 = r8.b;
        r2.a(r3, r4);
        r2 = r0.l;
        r3 = r8.b;
        r3 = defpackage.aklb.a(r3);
        if (r3 != 0) goto L_0x01fd;
    L_0x01fa:
        r3 = 8;
        goto L_0x01fe;
    L_0x01fd:
        r3 = 0;
    L_0x01fe:
        r2.setVisibility(r3);
        r2 = r0.n;
        r3 = r0.f;
        r3 = r3.a();
        r4 = r0.m;
        r5 = r8.h;
        if (r5 != 0) goto L_0x0211;
    L_0x020f:
        r5 = r9;
        goto L_0x021c;
    L_0x0211:
        r6 = r5.a;
        r6 = r6 & r10;
        if (r6 == 0) goto L_0x020f;
    L_0x0216:
        r5 = r5.b;
        if (r5 != 0) goto L_0x021c;
    L_0x021a:
        r5 = defpackage.auvn.l;
    L_0x021c:
        r7 = r1.a;
        r6 = r8;
        r2.a(r3, r4, r5, r6, r7);
        r2 = r0.t;
        r2 = defpackage.kjs.a(r2);
        if (r2 == 0) goto L_0x02aa;
    L_0x022a:
        r3 = r0.g;
        r3 = r3.a();
        r4 = r2.a;
        r4 = r4 & 64;
        if (r4 == 0) goto L_0x023d;
    L_0x0236:
        r4 = r2.e;
        if (r4 != 0) goto L_0x023e;
    L_0x023a:
        r4 = defpackage.arml.f;
        goto L_0x023e;
    L_0x023d:
        r4 = r9;
    L_0x023e:
        r4 = defpackage.ajqy.a(r4);
        r5 = r2.a;
        r5 = r5 & 4096;
        if (r5 == 0) goto L_0x024f;
    L_0x0248:
        r5 = r2.k;
        if (r5 != 0) goto L_0x0250;
    L_0x024c:
        r5 = defpackage.arml.f;
        goto L_0x0250;
    L_0x024f:
        r5 = r9;
    L_0x0250:
        r5 = defpackage.ajqy.a(r5);
        r6 = android.text.TextUtils.isEmpty(r5);
        if (r6 != 0) goto L_0x025b;
    L_0x025a:
        goto L_0x025c;
    L_0x025b:
        r5 = r4;
    L_0x025c:
        r6 = r0.p;
        r6.setVisibility(r12);
        r6 = r0.j;
        r6.setVisibility(r12);
        r6 = r0.j;
        if (r3 != 0) goto L_0x026c;
    L_0x026a:
        r3 = r4;
        goto L_0x026d;
    L_0x026c:
        r3 = r5;
    L_0x026d:
        r6.setText(r3);
        r3 = r0.g;
        r6 = r0.s;
        r3.a(r6);
        r3 = r2.a;
        r6 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r3 = r3 & r6;
        if (r3 == 0) goto L_0x0285;
    L_0x027e:
        r3 = r2.o;
        if (r3 != 0) goto L_0x0286;
    L_0x0282:
        r3 = defpackage.aodx.c;
        goto L_0x0286;
    L_0x0285:
        r3 = r9;
    L_0x0286:
        r3 = defpackage.kjs.a(r3, r5);
        r5 = r2.a;
        r6 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x0298;
    L_0x0291:
        r2 = r2.n;
        if (r2 != 0) goto L_0x0299;
    L_0x0295:
        r2 = defpackage.aodx.c;
        goto L_0x0299;
    L_0x0298:
        r2 = r9;
    L_0x0299:
        r2 = defpackage.kjs.a(r2, r4);
        r4 = new kjw;
        r5 = r0.p;
        r4.<init>(r5, r2, r3);
        r0.b = r4;
        r16.b();
        goto L_0x02bd;
    L_0x02aa:
        r2 = r0.p;
        r2.setVisibility(r11);
        r2 = r0.j;
        r2.setVisibility(r11);
        r2 = r0.g;
        r3 = r0.s;
        r2.b(r3);
        r0.b = r9;
    L_0x02bd:
        r2 = r8.j;
        if (r2 == 0) goto L_0x0364;
    L_0x02c1:
        r2 = r2.length;
        if (r2 != 0) goto L_0x02c6;
    L_0x02c4:
        goto L_0x0364;
    L_0x02c6:
        r2 = r0.o;
        r2.setVisibility(r12);
        r2 = r8.j;
        r3 = r2.length;
        r4 = 0;
        r5 = 0;
    L_0x02d0:
        if (r4 >= r3) goto L_0x0350;
    L_0x02d2:
        r6 = r2[r4];
        r7 = r6.a;
        r7 = r7 & r10;
        if (r7 != 0) goto L_0x02da;
    L_0x02d9:
        goto L_0x034b;
    L_0x02da:
        r7 = r0.o;
        r7 = r7.getChildCount();
        if (r5 < r7) goto L_0x02ec;
    L_0x02e2:
        r7 = r0.c;
        r13 = 2131035339; // 0x7f0504cb float:1.768122E38 double:1.052871351E-314;
        r14 = r0.o;
        android.view.View.inflate(r7, r13, r14);
    L_0x02ec:
        r7 = r0.o;
        r7 = r7.getChildAt(r5);
        r7 = (android.widget.TextView) r7;
        r13 = r0.r;
        r13 = defpackage.foh.o(r13);
        if (r13 == 0) goto L_0x0313;
    L_0x02fc:
        r13 = r0.q;
        r13 = r13.getConfiguration();
        r13 = r13.orientation;
        if (r13 != r10) goto L_0x0313;
    L_0x0306:
        r13 = r0.q;
        r13 = r13.getDisplayMetrics();
        r14 = 16;
        r13 = defpackage.xss.a(r13, r14);
        goto L_0x0314;
    L_0x0313:
        r13 = 0;
    L_0x0314:
        r14 = r0.o;
        r15 = r14.getPaddingLeft();
        r12 = r0.o;
        r12 = r12.getPaddingTop();
        r9 = r0.o;
        r9 = r9.getPaddingRight();
        r14.setPadding(r15, r12, r9, r13);
        r9 = r6.b;
        if (r9 != 0) goto L_0x032f;
    L_0x032d:
        r9 = defpackage.axjt.c;
    L_0x032f:
        r9 = r9.a;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0341;
    L_0x0334:
        r6 = r6.b;
        if (r6 != 0) goto L_0x033a;
    L_0x0338:
        r6 = defpackage.axjt.c;
    L_0x033a:
        r9 = r6.b;
        if (r9 != 0) goto L_0x0342;
    L_0x033e:
        r9 = defpackage.arml.f;
        goto L_0x0342;
    L_0x0341:
        r9 = 0;
    L_0x0342:
        r6 = defpackage.ajqy.a(r9);
        defpackage.xpr.a(r7, r6);
        r5 = r5 + 1;
    L_0x034b:
        r4 = r4 + 1;
        r9 = 0;
        r12 = 0;
        goto L_0x02d0;
    L_0x0350:
        r2 = r0.o;
        r2 = r2.getChildCount();
        if (r5 >= r2) goto L_0x0369;
    L_0x0358:
        r2 = r0.o;
        r2 = r2.getChildAt(r5);
        r2.setVisibility(r11);
        r5 = r5 + 1;
        goto L_0x0350;
    L_0x0364:
        r2 = r0.o;
        r2.setVisibility(r11);
    L_0x0369:
        r2 = r0.e;
        r3 = r8.l;
        defpackage.aabd.a(r2, r3, r8);
        r2 = r0.f;
        r2.a(r1);
        return;
    L_0x0376:
        r1 = r9;
        goto L_0x0379;
    L_0x0378:
        throw r1;
    L_0x0379:
        goto L_0x0378;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjs.a_(akor, java.lang.Object):void");
    }
}
