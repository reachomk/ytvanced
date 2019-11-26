package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EndorsementMetadataSwapRendererOuterClass;
import java.util.Map;

/* renamed from: kdr */
final class kdr extends jxw implements akok, jfy {
    private static final atst D;
    private static final atst E;
    public foq A;
    public Bitmap B;
    public boolean C;
    private final akoj F;
    private final akou G;
    private final akvo H;
    private final jup I;
    private final zyw J;
    private final ImageView K;
    private final View L;
    private final akko M;
    private final fga N;
    private final TextView O;
    private final klo P;
    private final akoa Q;
    private final jfw R;
    private final ViewGroup S;
    private final kfi T;
    private akor U;
    private final boolean V;
    private final boolean W;
    private apdj X;
    public final elv a;
    public final aaas b;
    public final View c;
    public final jty d;
    public final kfh e;
    public String z;

    public kdr(Context context, akkq akkq, akvp akvp, aaas aaas, gal gal, elv elv, akvo akvo, jty jty, fga fga, jup jup, klo klo, akoa akoa, hmc hmc, zyw zyw, jfw jfw, kfl kfl, akou akou, View view, kfi kfi, boolean z) {
        aaas aaas2 = aaas;
        jty jty2 = jty;
        jfw jfw2 = jfw;
        akou akou2 = akou;
        View view2 = view;
        boolean z2 = z;
        super(context, akkq, akou, view, aaas, gal, akvp, hmc, null);
        boolean z3 = z2 && context.getResources().getConfiguration().orientation == 2;
        this.W = z3;
        this.G = akou2;
        this.a = elv;
        this.H = akvo;
        this.F = new akoj(aaas2, akou2, this);
        this.b = aaas2;
        this.d = jty2;
        this.N = fga;
        this.I = jup;
        this.P = klo;
        this.Q = akoa;
        this.J = zyw;
        this.T = (kfi) amqw.a((Object) kfi);
        this.R = jfw2;
        jfw2.a(this);
        View view3 = view;
        boolean z4 = z2;
        this.c = view3.findViewById(R.id.thumbnail_layout);
        this.S = (ViewGroup) view3.findViewById(R.id.inline_muted_metadata);
        this.V = z4;
        kfh kfh = null;
        if (this.W) {
            this.O = (TextView) view3.findViewById(R.id.channel_name);
            this.K = (ImageView) view3.findViewById(R.id.channel_thumbnail);
        } else {
            this.O = null;
            this.K = (ImageView) view3.findViewById(R.id.channel_avatar);
            if (this.V) {
                ViewStub viewStub = (ViewStub) view3.findViewById(R.id.ad_attribution);
                if (viewStub != null) {
                    viewStub.inflate();
                }
            }
        }
        this.L = view3.findViewById(R.id.contextual_menu_anchor);
        this.M = akko.h().a(new kdt(this, jty2)).a();
        ViewSwitcher viewSwitcher = (ViewSwitcher) this.h.findViewById(R.id.avatar_switcher);
        ViewSwitcher viewSwitcher2 = (ViewSwitcher) this.h.findViewById(R.id.metadata_switcher);
        ImageView imageView = (ImageView) this.h.findViewById(R.id.channel_avatar_swap);
        TextView textView = (TextView) this.h.findViewById(R.id.metadata_text_swap);
        if (!(viewSwitcher == null || viewSwitcher2 == null || imageView == null || textView == null)) {
            kfh = kfl.a(viewSwitcher, viewSwitcher2, imageView, textView, this.T);
        }
        this.e = kfh;
        TextView textView2 = this.j;
        if (textView2 != null) {
            textView2.setTypeface(ajrc.ROBOTO_MEDIUM.a(this.f));
        }
        if (this.l != null) {
            int dimensionPixelSize;
            if (this.V) {
                dimensionPixelSize = this.f.getResources().getDimensionPixelSize(R.dimen.video_metadata_ads_inline_details_padding_top);
            } else {
                dimensionPixelSize = this.f.getResources().getDimensionPixelSize(R.dimen.video_metadata_no_ads_inline_details_padding_top);
            }
            TextView textView3 = this.l;
            textView3.setPadding(textView3.getPaddingLeft(), dimensionPixelSize, this.l.getPaddingRight(), this.l.getPaddingBottom());
        }
        if (kcb.a(this.J) && this.f.getResources().getConfiguration().orientation != 2 && (this.G instanceof flu)) {
            int dimensionPixelSize2;
            if (kcb.b(this.J)) {
                dimensionPixelSize2 = this.f.getResources().getDimensionPixelSize(R.dimen.smaller_divider_height_dp);
            } else {
                dimensionPixelSize2 = this.f.getResources().getDimensionPixelSize(R.dimen.bigger_divider_height_dp);
            }
            ((flu) this.G).a(xwe.a(this.f, R.attr.adSeparator1, 0));
            ((flu) this.G).a.c(dimensionPixelSize2);
            if (kcb.c(this.J)) {
                ViewGroup viewGroup = this.S;
                if (viewGroup != null && viewGroup.getLayoutParams() != null) {
                    ((MarginLayoutParams) this.S.getLayoutParams()).bottomMargin = this.f.getResources().getDimensionPixelSize(R.dimen.inline_metadata_exp_bot_margin_dp);
                    if (kcb.d(this.J)) {
                        dimensionPixelSize2 = this.f.getResources().getDimensionPixelSize(R.dimen.exp_layout_bot_padding_with_small_div);
                    } else {
                        dimensionPixelSize2 = this.f.getResources().getDimensionPixelSize(R.dimen.exp_layout_bot_padding_with_big_div);
                    }
                    ViewGroup viewGroup2 = this.S;
                    viewGroup2.setPadding(viewGroup2.getPaddingLeft(), this.S.getPaddingTop(), this.S.getPaddingRight(), dimensionPixelSize2);
                }
            }
        }
    }

    public final View K_() {
        return this.G.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:185:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x033d  */
    /* renamed from: a */
    public final void a_(defpackage.akor r18, defpackage.foq r19) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r0.A = r2;
        r3 = r2.b;
        r4 = r3.j;
        r0.z = r4;
        r4 = 0;
        r0.B = r4;
        r0.U = r1;
        r5 = r0.F;
        r6 = r1.a;
        r7 = r3.a;
        r7 = r7 & 64;
        if (r7 == 0) goto L_0x0024;
    L_0x001d:
        r7 = r3.h;
        if (r7 != 0) goto L_0x0025;
    L_0x0021:
        r7 = defpackage.apxu.d;
        goto L_0x0025;
    L_0x0024:
        r7 = r4;
    L_0x0025:
        r8 = r18.b();
        r5.a(r6, r7, r8, r0);
        r5 = r1.a;
        r6 = r3.g;
        r6 = r6.d();
        r7 = r0.N;
        r7 = r7.c();
        if (r7 == 0) goto L_0x003f;
    L_0x003c:
        r7 = D;
        goto L_0x0041;
    L_0x003f:
        r7 = E;
    L_0x0041:
        r5.a(r6, r7);
        r5 = r3.f;
        if (r5 != 0) goto L_0x004a;
    L_0x0048:
        r5 = defpackage.aryg.c;
    L_0x004a:
        r5 = r5.b;
        if (r5 != 0) goto L_0x0050;
    L_0x004e:
        r5 = defpackage.arye.u;
    L_0x0050:
        r6 = r5.a;
        r7 = 1;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x005d;
    L_0x0056:
        r6 = r5.b;
        if (r6 != 0) goto L_0x005e;
    L_0x005a:
        r6 = defpackage.arml.f;
        goto L_0x005e;
    L_0x005d:
        r6 = r4;
    L_0x005e:
        r6 = defpackage.ajqy.a(r6);
        r0.a(r6);
        r6 = r5.a;
        r6 = r6 & 2;
        if (r6 == 0) goto L_0x0072;
    L_0x006b:
        r6 = r5.c;
        if (r6 != 0) goto L_0x0073;
    L_0x006f:
        r6 = defpackage.arml.f;
        goto L_0x0073;
    L_0x0072:
        r6 = r4;
    L_0x0073:
        r6 = defpackage.ajqy.a(r6);
        r0.b(r6);
        r6 = r5.a;
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 & r8;
        if (r6 == 0) goto L_0x0088;
    L_0x0081:
        r6 = r5.t;
        if (r6 != 0) goto L_0x0089;
    L_0x0085:
        r6 = defpackage.arml.f;
        goto L_0x0089;
    L_0x0088:
        r6 = r4;
    L_0x0089:
        r6 = defpackage.ajqy.a(r6);
        r8 = r0.m;
        if (r8 != 0) goto L_0x00a8;
    L_0x0091:
        r8 = r0.h;
        r9 = 2131757011; // 0x7f1007d3 float:1.9144946E38 double:1.0532279044E-314;
        r8 = r8.findViewById(r9);
        r9 = r8 instanceof android.view.ViewStub;
        if (r9 == 0) goto L_0x00a8;
    L_0x009e:
        r8 = (android.view.ViewStub) r8;
        r8 = r8.inflate();
        r8 = (android.widget.TextView) r8;
        r0.m = r8;
    L_0x00a8:
        r8 = r0.m;
        defpackage.exx.a(r8, r6);
        r6 = r0.O;
        r8 = 0;
        if (r6 != 0) goto L_0x01d7;
    L_0x00b2:
        r6 = new java.lang.CharSequence[r7];
        r9 = r5.a;
        r9 = r9 & 4;
        if (r9 == 0) goto L_0x00c1;
    L_0x00ba:
        r9 = r5.d;
        if (r9 != 0) goto L_0x00c2;
    L_0x00be:
        r9 = defpackage.arml.f;
        goto L_0x00c2;
    L_0x00c1:
        r9 = r4;
    L_0x00c2:
        r9 = defpackage.ajqy.a(r9);
        r9 = defpackage.fpi.a(r9);
        r6[r8] = r9;
        r6 = defpackage.amvj.a(r6);
        r9 = r5.o;
        if (r9 == 0) goto L_0x00d5;
    L_0x00d4:
        goto L_0x00d7;
    L_0x00d5:
        r9 = defpackage.axak.a;
    L_0x00d7:
        r10 = com.google.protos.youtube.api.innertube.BadgeRenderers.standaloneRedBadgeRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r9.a(r10);
        r9 = r9.h;
        r10 = r10.d;
        r9 = r9.a(r10);
        if (r9 != 0) goto L_0x00ec;
    L_0x00ea:
        r9 = r4;
        goto L_0x010f;
    L_0x00ec:
        r9 = r5.o;
        if (r9 == 0) goto L_0x00f1;
    L_0x00f0:
        goto L_0x00f3;
    L_0x00f1:
        r9 = defpackage.axak.a;
    L_0x00f3:
        r10 = com.google.protos.youtube.api.innertube.BadgeRenderers.standaloneRedBadgeRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r9.a(r10);
        r9 = r9.h;
        r11 = r10.d;
        r9 = r9.b(r11);
        if (r9 != 0) goto L_0x0109;
    L_0x0106:
        r9 = r10.b;
        goto L_0x010d;
    L_0x0109:
        r9 = r10.a(r9);
    L_0x010d:
        r9 = (defpackage.apeb) r9;
    L_0x010f:
        if (r9 == 0) goto L_0x0113;
    L_0x0111:
        r10 = 1;
        goto L_0x0114;
    L_0x0113:
        r10 = 0;
    L_0x0114:
        r11 = r0.V;
        if (r11 == 0) goto L_0x011a;
    L_0x0118:
        goto L_0x01d3;
    L_0x011a:
        r11 = r5.a;
        r11 = r11 & 4096;
        if (r11 == 0) goto L_0x0127;
    L_0x0120:
        r11 = r5.k;
        if (r11 != 0) goto L_0x0128;
    L_0x0124:
        r11 = defpackage.arml.f;
        goto L_0x0128;
    L_0x0127:
        r11 = r4;
    L_0x0128:
        r11 = defpackage.ajqy.a(r11);
        r11 = defpackage.fpi.a(r11);
        r6.add(r11);
        r11 = r5.a;
        r11 = r11 & 8192;
        if (r11 == 0) goto L_0x0140;
    L_0x0139:
        r11 = r5.l;
        if (r11 != 0) goto L_0x0141;
    L_0x013d:
        r11 = defpackage.arml.f;
        goto L_0x0141;
    L_0x0140:
        r11 = r4;
    L_0x0141:
        r11 = defpackage.ajqy.a(r11);
        r11 = defpackage.fpi.a(r11);
        r6.add(r11);
        r11 = r5.n;
        if (r11 == 0) goto L_0x0151;
    L_0x0150:
        goto L_0x0153;
    L_0x0151:
        r11 = defpackage.axak.a;
    L_0x0153:
        r12 = com.google.protos.youtube.api.innertube.BadgeRenderers.standaloneCollectionBadgeRenderer;
        r12 = defpackage.anxl.checkIsLite(r12);
        r11.a(r12);
        r11 = r11.h;
        r12 = r12.d;
        r11 = r11.a(r12);
        if (r11 != 0) goto L_0x0168;
    L_0x0166:
        r11 = r4;
        goto L_0x018b;
    L_0x0168:
        r11 = r5.n;
        if (r11 == 0) goto L_0x016d;
    L_0x016c:
        goto L_0x016f;
    L_0x016d:
        r11 = defpackage.axak.a;
    L_0x016f:
        r12 = com.google.protos.youtube.api.innertube.BadgeRenderers.standaloneCollectionBadgeRenderer;
        r12 = defpackage.anxl.checkIsLite(r12);
        r11.a(r12);
        r11 = r11.h;
        r13 = r12.d;
        r11 = r11.b(r13);
        if (r11 != 0) goto L_0x0185;
    L_0x0182:
        r11 = r12.b;
        goto L_0x0189;
    L_0x0185:
        r11 = r12.a(r11);
    L_0x0189:
        r11 = (defpackage.apdz) r11;
    L_0x018b:
        r0.a(r11);
        r11 = r5.o;
        if (r11 == 0) goto L_0x0193;
    L_0x0192:
        goto L_0x0195;
    L_0x0193:
        r11 = defpackage.axak.a;
    L_0x0195:
        r12 = com.google.protos.youtube.api.innertube.BadgeRenderers.standaloneYpcBadgeRenderer;
        r12 = defpackage.anxl.checkIsLite(r12);
        r11.a(r12);
        r11 = r11.h;
        r12 = r12.d;
        r11 = r11.a(r12);
        if (r11 != 0) goto L_0x01aa;
    L_0x01a8:
        r11 = r4;
        goto L_0x01cd;
    L_0x01aa:
        r11 = r5.o;
        if (r11 == 0) goto L_0x01af;
    L_0x01ae:
        goto L_0x01b1;
    L_0x01af:
        r11 = defpackage.axak.a;
    L_0x01b1:
        r12 = com.google.protos.youtube.api.innertube.BadgeRenderers.standaloneYpcBadgeRenderer;
        r12 = defpackage.anxl.checkIsLite(r12);
        r11.a(r12);
        r11 = r11.h;
        r13 = r12.d;
        r11 = r11.b(r13);
        if (r11 != 0) goto L_0x01c7;
    L_0x01c4:
        r11 = r12.b;
        goto L_0x01cb;
    L_0x01c7:
        r11 = r12.a(r11);
    L_0x01cb:
        r11 = (defpackage.aped) r11;
    L_0x01cd:
        r0.a(r11);
        r0.a(r9);
    L_0x01d3:
        r0.a(r4, r6, r10);
        goto L_0x01f0;
    L_0x01d7:
        r9 = r5.a;
        r9 = r9 & 4;
        if (r9 == 0) goto L_0x01e4;
    L_0x01dd:
        r9 = r5.d;
        if (r9 != 0) goto L_0x01e5;
    L_0x01e1:
        r9 = defpackage.arml.f;
        goto L_0x01e5;
    L_0x01e4:
        r9 = r4;
    L_0x01e5:
        r9 = defpackage.ajqy.a(r9);
        r9 = defpackage.fpi.a(r9);
        defpackage.xpr.a(r6, r9);
    L_0x01f0:
        r6 = r3.a;
        r6 = r6 & 4;
        if (r6 == 0) goto L_0x01fd;
    L_0x01f6:
        r6 = r3.e;
        if (r6 != 0) goto L_0x01fe;
    L_0x01fa:
        r6 = defpackage.arml.f;
        goto L_0x01fe;
    L_0x01fd:
        r6 = r4;
    L_0x01fe:
        r6 = defpackage.ajqy.a(r6);
        r9 = r3.a;
        r9 = r9 & 4;
        if (r9 == 0) goto L_0x020f;
    L_0x0208:
        r9 = r3.e;
        if (r9 != 0) goto L_0x0210;
    L_0x020c:
        r9 = defpackage.arml.f;
        goto L_0x0210;
    L_0x020f:
        r9 = r4;
    L_0x0210:
        r9 = defpackage.ajqy.b(r9);
        r10 = r3.c;
        r0.a(r6, r9, r10, r4);
        r11 = r0.H;
        r12 = r17.K_();
        r13 = r0.L;
        r6 = r2.b;
        r6 = defpackage.fod.a(r6);
        if (r6 != 0) goto L_0x022b;
    L_0x0229:
        r14 = r4;
        goto L_0x0244;
    L_0x022b:
        r9 = r6.i;
        if (r9 != 0) goto L_0x0231;
    L_0x022f:
        r9 = defpackage.auvr.c;
    L_0x0231:
        r9 = r9.a;
        r9 = r9 & r7;
        if (r9 != 0) goto L_0x0237;
    L_0x0236:
        goto L_0x0229;
    L_0x0237:
        r6 = r6.i;
        if (r6 != 0) goto L_0x023d;
    L_0x023b:
        r6 = defpackage.auvr.c;
    L_0x023d:
        r6 = r6.b;
        if (r6 != 0) goto L_0x0243;
    L_0x0241:
        r6 = defpackage.auvn.l;
    L_0x0243:
        r14 = r6;
    L_0x0244:
        r15 = r2.c;
        r6 = r1.a;
        r16 = r6;
        r11.a(r12, r13, r14, r15, r16);
        r6 = r3.a;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0259;
    L_0x0252:
        r6 = r3.b;
        if (r6 != 0) goto L_0x025a;
    L_0x0256:
        r6 = defpackage.aygk.f;
        goto L_0x025a;
    L_0x0259:
        r6 = r4;
    L_0x025a:
        r9 = r0.M;
        r0.a(r6, r9);
        r6 = r3.c;
        r6 = defpackage.ipo.a(r6);
        r0.a(r6);
        r6 = r0.K;
        r9 = r5.a;
        r10 = 8;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0272;
    L_0x0271:
        r8 = 1;
    L_0x0272:
        defpackage.xpr.a(r6, r8);
        r6 = r5.a;
        r6 = r6 & r10;
        if (r6 == 0) goto L_0x0291;
    L_0x027a:
        r6 = r5.e;
        if (r6 != 0) goto L_0x0280;
    L_0x027e:
        r6 = defpackage.aygk.f;
    L_0x0280:
        r8 = r0.g;
        r9 = r0.K;
        r8.a(r9, r6);
        r6 = r0.K;
        r8 = new kdq;
        r8.<init>(r0, r5);
        r6.setOnClickListener(r8);
    L_0x0291:
        r6 = r5.a;
        r8 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r6 = r6 & r8;
        if (r6 == 0) goto L_0x029f;
    L_0x0298:
        r6 = r5.s;
        if (r6 != 0) goto L_0x02a0;
    L_0x029c:
        r6 = defpackage.axak.a;
        goto L_0x02a0;
    L_0x029f:
        r6 = r4;
    L_0x02a0:
        r6 = defpackage.ajzv.a(r6);
        r9 = r0.P;
        r11 = r0.Q;
        r0.a(r6, r1, r9, r11);
        r6 = r3.m;
        if (r6 != 0) goto L_0x02b1;
    L_0x02af:
        r6 = defpackage.ayym.c;
    L_0x02b1:
        r6 = r6.a;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x02c2;
    L_0x02b6:
        r6 = r3.m;
        if (r6 != 0) goto L_0x02bc;
    L_0x02ba:
        r6 = defpackage.ayym.c;
    L_0x02bc:
        defpackage.jxw.a(r1, r6);
        r0.a(r1, r4);
    L_0x02c2:
        r5 = r5.p;
        if (r5 != 0) goto L_0x02c8;
    L_0x02c6:
        r5 = r4;
        goto L_0x02e3;
    L_0x02c8:
        r5 = r5.iterator();
    L_0x02cc:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x02c6;
    L_0x02d2:
        r6 = r5.next();
        r6 = (defpackage.apdh) r6;
        r7 = r6.a;
        r7 = r7 & r8;
        if (r7 == 0) goto L_0x02cc;
    L_0x02dd:
        r5 = r6.q;
        if (r5 != 0) goto L_0x02e3;
    L_0x02e1:
        r5 = defpackage.apdj.c;
    L_0x02e3:
        r0.X = r5;
        r5 = r0.R;
        r6 = r0.p;
        r7 = r0.X;
        r5.a(r6, r7);
        r5 = r0.n;
        if (r5 == 0) goto L_0x02f5;
    L_0x02f2:
        r5.a();
    L_0x02f5:
        r5 = r3.d;
        if (r5 == 0) goto L_0x02fa;
    L_0x02f9:
        goto L_0x02fc;
    L_0x02fa:
        r5 = defpackage.axak.a;
    L_0x02fc:
        r6 = defpackage.ayez.a;
        r6 = defpackage.anxl.checkIsLite(r6);
        r5.a(r6);
        r5 = r5.h;
        r6 = r6.d;
        r5 = r5.a(r6);
        if (r5 == 0) goto L_0x0333;
    L_0x030f:
        r3 = r3.d;
        if (r3 == 0) goto L_0x0314;
    L_0x0313:
        goto L_0x0316;
    L_0x0314:
        r3 = defpackage.axak.a;
    L_0x0316:
        r5 = defpackage.ayez.a;
        r5 = defpackage.anxl.checkIsLite(r5);
        r3.a(r5);
        r3 = r3.h;
        r6 = r5.d;
        r3 = r3.b(r6);
        if (r3 != 0) goto L_0x032c;
    L_0x0329:
        r3 = r5.b;
        goto L_0x0330;
    L_0x032c:
        r3 = r5.a(r3);
    L_0x0330:
        r3 = (defpackage.ayfk) r3;
        goto L_0x0334;
    L_0x0333:
        r3 = r4;
    L_0x0334:
        if (r3 == 0) goto L_0x0339;
    L_0x0336:
        r0.a(r3, r10);
    L_0x0339:
        r3 = r0.e;
        if (r3 == 0) goto L_0x0391;
    L_0x033d:
        r3 = defpackage.kdr.a(r19);
        if (r3 == 0) goto L_0x038c;
    L_0x0343:
        r3 = r0.e;
        r5 = r2.b;
        r5 = r5.n;
        if (r5 == 0) goto L_0x034c;
    L_0x034b:
        goto L_0x034e;
    L_0x034c:
        r5 = defpackage.axak.a;
    L_0x034e:
        r6 = com.google.protos.youtube.api.innertube.EndorsementMetadataSwapRendererOuterClass.endorsementMetadataSwapRenderer;
        r6 = defpackage.anxl.checkIsLite(r6);
        r5.a(r6);
        r5 = r5.h;
        r6 = r6.d;
        r5 = r5.a(r6);
        if (r5 != 0) goto L_0x0362;
    L_0x0361:
        goto L_0x0388;
    L_0x0362:
        r2 = r2.b;
        r2 = r2.n;
        if (r2 == 0) goto L_0x0369;
    L_0x0368:
        goto L_0x036b;
    L_0x0369:
        r2 = defpackage.axak.a;
    L_0x036b:
        r4 = com.google.protos.youtube.api.innertube.EndorsementMetadataSwapRendererOuterClass.endorsementMetadataSwapRenderer;
        r4 = defpackage.anxl.checkIsLite(r4);
        r2.a(r4);
        r2 = r2.h;
        r5 = r4.d;
        r2 = r2.b(r5);
        if (r2 != 0) goto L_0x0381;
    L_0x037e:
        r2 = r4.b;
        goto L_0x0385;
    L_0x0381:
        r2 = r4.a(r2);
    L_0x0385:
        r4 = r2;
        r4 = (defpackage.aren) r4;
    L_0x0388:
        r3.a(r4);
        goto L_0x0391;
    L_0x038c:
        r2 = r0.e;
        r2.d();
    L_0x0391:
        r2 = r0.G;
        r2.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdr.a_(akor, foq):void");
    }

    public static boolean a(foq foq) {
        if (foq != null) {
            aryi aryi = foq.b;
            if (aryi != null) {
                anxp anxp = aryi.n;
                if (anxp == null) {
                    anxp = axak.a;
                }
                anxr access$000 = anxl.checkIsLite(EndorsementMetadataSwapRendererOuterClass.endorsementMetadataSwapRenderer);
                anxp.a(access$000);
                return anxp.h.a(access$000.d);
            }
        }
        return false;
    }

    public final epu c() {
        return this.p;
    }

    public final apdj d() {
        return this.X;
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.c.setAlpha(1.0f);
        this.C = false;
        this.F.a();
        kfh kfh = this.e;
        if (kfh != null) {
            kfh.c();
        }
    }

    public final void a(Map map) {
        Object obj;
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", this.c);
        aryi aryi = this.A.b;
        if ((aryi.a & 1) != 0) {
            obj = aryi.b;
            if (obj == null) {
                obj = aygk.f;
            }
        } else {
            obj = null;
        }
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", obj);
        this.I.a(this.A, map);
    }

    public final boolean a(View view) {
        jup jup = this.I;
        foq foq = this.A;
        aaas aaas = this.b;
        akor akor = this.U;
        return jup.a(foq, aaas, akor.a, akor.b(), this);
    }

    static {
        atss atss = (atss) atst.q.createBuilder();
        atsq atsq = (atsq) atsr.c.createBuilder();
        atsq.a(true);
        atss.a(atsq);
        D = (atst) ((anxl) atss.build());
        atss = (atss) atst.q.createBuilder();
        atsq = (atsq) atsr.c.createBuilder();
        atsq.a(false);
        atss.a(atsq);
        E = (atst) ((anxl) atss.build());
    }
}
