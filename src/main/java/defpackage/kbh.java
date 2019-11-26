package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: kbh */
public final class kbh extends jxw implements jfy {
    private final aaas A;
    private final hmc B;
    private apdj C;
    private final int D;
    private final int E;
    private final LinearLayout F;
    private final RelativeLayout G = ((RelativeLayout) this.F.findViewById(R.id.thumbnail_layout));
    private final SwipeLayout H;
    private final ViewStub I;
    private final akpb J;
    private akoj K;
    private View L;
    private hrf M;
    private xrg N;
    private List O;
    private hlv P;
    private aqgs Q;
    private final xsc a;
    private final akou b;
    private final akvo c;
    private final jfw d;
    private final hrl e;
    private final gsa z;

    public kbh(Context context, akkq akkq, aaas aaas, xsc xsc, akvo akvo, gal gal, hmc hmc, jfw jfw, hrl hrl, gsa gsa, akph akph, fas fas) {
        jfw jfw2 = jfw;
        Context context2 = context;
        flu flu = new flu(context, true);
        super(context, akkq, flu, LayoutInflater.from(context).inflate(R.layout.compact_video_item, null, false), aaas, gal, hmc, fas);
        this.a = xsc;
        this.b = flu;
        this.c = (akvo) amqw.a((Object) akvo);
        this.A = aaas;
        this.B = hmc;
        this.d = jfw2;
        this.e = hrl;
        jfw2.a(this);
        this.z = gsa;
        this.D = context.getResources().getDimensionPixelSize(R.dimen.compact_video_padding_start);
        this.E = context.getResources().getDimensionPixelSize(R.dimen.compact_video_padding_bottom);
        this.J = akph;
        View view = this.h;
        this.F = (LinearLayout) view.findViewById(R.id.video_info_view);
        this.H = (SwipeLayout) view.findViewById(R.id.compact_swipe_layout);
        this.I = (ViewStub) this.F.findViewById(R.id.offline_badge_beside_details);
        flu.a(this.F);
    }

    public final View K_() {
        return this.h;
    }

    public final epu c() {
        return this.p;
    }

    public final apdj d() {
        return this.C;
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.Q = null;
        this.K.a();
        hrf hrf = this.M;
        if (hrf != null) {
            hrf.b.b(hrf);
            hrf.h.b(hrf.s);
            hrf.g.b(hrf.r);
            hrf.j.setTextColor(hrf.t);
            hrf.m.setTextColor(hrf.u);
            hrf.k.getViewTreeObserver().removeOnGlobalLayoutListener(hrf.q);
            xpr.a(hrf.l, false);
            hrf.c();
            xpr.a(hrf.n, false);
            xpr.a(hrf.p, false);
            hrf.o.setOnClickListener(null);
            akou akou = hrf.w;
            if (akou != null) {
                akou.a(hrf.e);
                hrf.w = null;
            }
            hrf.v = null;
            hrf.x = null;
            hrf.y = null;
            hrf.z = null;
            hrf.A = null;
            hrf.i.a = null;
            this.M = null;
        }
        klv.a(this.N, this.H, this.O, akpb);
        this.N = null;
        hlv hlv = this.P;
        if (hlv != null) {
            hlv.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:260:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04d7  */
    public final /* synthetic */ void a_(defpackage.akor r33, java.lang.Object r34) {
        /*
        r32 = this;
        r0 = r32;
        r1 = r33;
        r8 = r34;
        r8 = (defpackage.aqgs) r8;
        r0.Q = r8;
        r2 = r8.u;
        if (r2 != 0) goto L_0x0010;
    L_0x000e:
        r2 = defpackage.apdx.g;
    L_0x0010:
        r2 = r2.a;
        r9 = 2;
        r2 = r2 & r9;
        r10 = 0;
        if (r2 != 0) goto L_0x0019;
    L_0x0017:
        r11 = r10;
        goto L_0x0026;
    L_0x0019:
        r2 = r8.u;
        if (r2 != 0) goto L_0x001f;
    L_0x001d:
        r2 = defpackage.apdx.g;
    L_0x001f:
        r2 = r2.c;
        if (r2 != 0) goto L_0x0025;
    L_0x0023:
        r2 = defpackage.apeb.e;
    L_0x0025:
        r11 = r2;
    L_0x0026:
        r12 = 1;
        r2 = 0;
        if (r11 == 0) goto L_0x002c;
    L_0x002a:
        r3 = 1;
        goto L_0x002d;
    L_0x002c:
        r3 = 0;
    L_0x002d:
        r4 = r8.a;
        r4 = r4 & 8192;
        if (r4 == 0) goto L_0x003a;
    L_0x0033:
        r4 = r8.p;
        if (r4 != 0) goto L_0x0040;
    L_0x0037:
        r4 = defpackage.apxu.d;
        goto L_0x0040;
    L_0x003a:
        r4 = r8.o;
        if (r4 != 0) goto L_0x0040;
    L_0x003e:
        r4 = defpackage.apxu.d;
    L_0x0040:
        r5 = "yt_click_intercept_tag";
        r5 = r1.a(r5);
        r6 = r5 instanceof defpackage.akok;
        if (r6 == 0) goto L_0x004d;
    L_0x004a:
        r5 = (defpackage.akok) r5;
        goto L_0x004e;
    L_0x004d:
        r5 = r10;
    L_0x004e:
        r6 = new akoj;
        r7 = r0.A;
        r13 = r0.b;
        r6.<init>(r7, r13, r5);
        r0.K = r6;
        r5 = r0.K;
        r6 = r1.a;
        r7 = r33.b();
        r5.a(r6, r4, r7, r0);
        r4 = r1.a;
        r5 = r8.E;
        r5 = r5.d();
        r4.a(r5, r10);
        r4 = r0.G;
        r4 = r4.getLayoutParams();
        r4 = (android.widget.LinearLayout.LayoutParams) r4;
        r5 = r0.f;
        r5 = r5.getResources();
        r6 = defpackage.etj.a(r33);
        r13 = -1;
        if (r6 == 0) goto L_0x0096;
    L_0x0084:
        r6 = r0.F;
        r6.setOrientation(r12);
        r4.width = r13;
        r6 = 2131820573; // 0x7f11001d float:1.9273865E38 double:1.053259308E-314;
        r5 = r5.getInteger(r6);
        r0.w = r5;
        r5 = 0;
        goto L_0x00d5;
    L_0x0096:
        r6 = r0.F;
        r6.setOrientation(r2);
        r6 = "postsV2FullToolbarStyle";
        r6 = r1.a(r6, r2);
        r7 = r0.F;
        if (r6 != 0) goto L_0x00a8;
    L_0x00a5:
        r14 = r0.D;
        goto L_0x00a9;
    L_0x00a8:
        r14 = 0;
    L_0x00a9:
        r15 = r7.getPaddingTop();
        r10 = r0.F;
        r10 = defpackage.abe.k(r10);
        if (r6 != 0) goto L_0x00b8;
    L_0x00b5:
        r6 = r0.E;
        goto L_0x00b9;
    L_0x00b8:
        r6 = 0;
    L_0x00b9:
        defpackage.abe.a(r7, r14, r15, r10, r6);
        r6 = 2131625503; // 0x7f0e061f float:1.8878216E38 double:1.053162931E-314;
        r6 = r5.getDimensionPixelSize(r6);
        r4.width = r6;
        r6 = 2131820574; // 0x7f11001e float:1.9273867E38 double:1.0532593087E-314;
        r6 = r5.getInteger(r6);
        r0.w = r6;
        r6 = 2131624700; // 0x7f0e02fc float:1.8876587E38 double:1.053162534E-314;
        r5 = r5.getDimensionPixelSize(r6);
    L_0x00d5:
        r4.setMarginEnd(r5);
        r10 = new akor;
        r10.<init>(r1);
        r4 = r8.E;
        r4 = r4.d();
        r10.b = r4;
        r4 = r8.a;
        r14 = 4;
        r4 = r4 & r14;
        if (r4 == 0) goto L_0x00f2;
    L_0x00eb:
        r4 = r8.e;
        if (r4 != 0) goto L_0x00f3;
    L_0x00ef:
        r4 = defpackage.arml.f;
        goto L_0x00f3;
    L_0x00f2:
        r4 = 0;
    L_0x00f3:
        r4 = defpackage.ajqy.a(r4);
        r0.a(r4);
        r4 = r0.f;
        r5 = r0.a;
        r6 = r8.a;
        r6 = r6 & 16384;
        if (r6 == 0) goto L_0x010b;
    L_0x0104:
        r6 = r8.q;
        if (r6 != 0) goto L_0x010c;
    L_0x0108:
        r6 = defpackage.ayri.d;
        goto L_0x010c;
    L_0x010b:
        r6 = 0;
    L_0x010c:
        r4 = defpackage.joc.a(r4, r5, r6);
        r5 = r8.a;
        r5 = r5 & 16;
        if (r5 == 0) goto L_0x011d;
    L_0x0116:
        r5 = r8.g;
        if (r5 != 0) goto L_0x011e;
    L_0x011a:
        r5 = defpackage.arml.f;
        goto L_0x011e;
    L_0x011d:
        r5 = 0;
    L_0x011e:
        r5 = defpackage.ajqy.a(r5);
        r6 = android.text.TextUtils.isEmpty(r4);
        if (r6 != 0) goto L_0x0129;
    L_0x0128:
        goto L_0x016a;
    L_0x0129:
        r4 = r8.a;
        r4 = r4 & 1024;
        if (r4 == 0) goto L_0x0136;
    L_0x012f:
        r4 = r8.m;
        if (r4 != 0) goto L_0x0137;
    L_0x0133:
        r4 = defpackage.arml.f;
        goto L_0x0137;
    L_0x0136:
        r4 = 0;
    L_0x0137:
        r4 = defpackage.ajqy.a(r4);
        r6 = android.text.TextUtils.isEmpty(r4);
        if (r6 == 0) goto L_0x0143;
    L_0x0141:
        r4 = 0;
        goto L_0x016a;
    L_0x0143:
        r6 = r8.a;
        r6 = r6 & 256;
        if (r6 == 0) goto L_0x0150;
    L_0x0149:
        r6 = r8.k;
        if (r6 != 0) goto L_0x0151;
    L_0x014d:
        r6 = defpackage.arml.f;
        goto L_0x0151;
    L_0x0150:
        r6 = 0;
    L_0x0151:
        r6 = defpackage.ajqy.a(r6);
        r7 = android.text.TextUtils.isEmpty(r6);
        if (r7 != 0) goto L_0x016a;
    L_0x015b:
        r7 = 3;
        r7 = new java.lang.CharSequence[r7];
        r7[r2] = r6;
        r6 = " · ";
        r7[r12] = r6;
        r7[r9] = r4;
        r4 = android.text.TextUtils.concat(r7);
    L_0x016a:
        r0.a(r5, r4, r3);
        r3 = r0.k;
        r4 = r8.i;
        if (r4 != 0) goto L_0x0175;
    L_0x0173:
        r4 = defpackage.armh.d;
    L_0x0175:
        defpackage.gsa.a(r3, r4);
        r3 = r8.a;
        r3 = r3 & 2048;
        if (r3 == 0) goto L_0x0185;
    L_0x017e:
        r3 = r8.n;
        if (r3 != 0) goto L_0x0186;
    L_0x0182:
        r3 = defpackage.arml.f;
        goto L_0x0186;
    L_0x0185:
        r3 = 0;
    L_0x0186:
        r3 = defpackage.ajqy.a(r3);
        r4 = r8.a;
        r4 = r4 & 2048;
        if (r4 == 0) goto L_0x0197;
    L_0x0190:
        r4 = r8.n;
        if (r4 != 0) goto L_0x0198;
    L_0x0194:
        r4 = defpackage.arml.f;
        goto L_0x0198;
    L_0x0197:
        r4 = 0;
    L_0x0198:
        r4 = defpackage.ajqy.b(r4);
        r5 = r8.B;
        r6 = new defpackage.ayfu[r2];
        r5 = r5.toArray(r6);
        r5 = (defpackage.ayfu[]) r5;
        r6 = r8.a;
        r6 = r6 & 16384;
        if (r6 == 0) goto L_0x01b3;
    L_0x01ac:
        r6 = r8.q;
        if (r6 != 0) goto L_0x01b4;
    L_0x01b0:
        r6 = defpackage.ayri.d;
        goto L_0x01b4;
    L_0x01b3:
        r6 = 0;
    L_0x01b4:
        r0.a(r3, r4, r5, r6);
        r3 = r8.d;
        if (r3 != 0) goto L_0x01bd;
    L_0x01bb:
        r3 = defpackage.aygk.f;
    L_0x01bd:
        r0.a(r3);
        r3 = r8.A;
        r15 = 8;
        if (r3 != 0) goto L_0x01ce;
    L_0x01c6:
        r2 = r0.L;
        if (r2 == 0) goto L_0x01e9;
    L_0x01ca:
        r2.setVisibility(r15);
        goto L_0x01e9;
    L_0x01ce:
        r3 = r0.L;
        if (r3 == 0) goto L_0x01d3;
    L_0x01d2:
        goto L_0x01e4;
    L_0x01d3:
        r3 = r0.h;
        r4 = 2131757008; // 0x7f1007d0 float:1.914494E38 double:1.053227903E-314;
        r3 = r3.findViewById(r4);
        r3 = (android.view.ViewStub) r3;
        r3 = r3.inflate();
        r0.L = r3;
    L_0x01e4:
        r3 = r0.L;
        r3.setVisibility(r2);
    L_0x01e9:
        r7 = r10.a;
        r2 = r0.c;
        r3 = r0.F;
        r4 = r0.v;
        r5 = r8.z;
        if (r5 != 0) goto L_0x01f7;
    L_0x01f5:
        r5 = defpackage.auvr.c;
    L_0x01f7:
        r5 = r5.a;
        r5 = r5 & r12;
        if (r5 != 0) goto L_0x01fe;
    L_0x01fc:
        r5 = 0;
        goto L_0x020a;
    L_0x01fe:
        r5 = r8.z;
        if (r5 != 0) goto L_0x0204;
    L_0x0202:
        r5 = defpackage.auvr.c;
    L_0x0204:
        r5 = r5.b;
        if (r5 != 0) goto L_0x020a;
    L_0x0208:
        r5 = defpackage.auvn.l;
    L_0x020a:
        r6 = r8;
        r2.a(r3, r4, r5, r6, r7);
        r2 = r8.t;
        if (r2 != 0) goto L_0x0214;
    L_0x0212:
        r2 = defpackage.apdx.g;
    L_0x0214:
        r2 = r2.a;
        r2 = r2 & r12;
        if (r2 != 0) goto L_0x021b;
    L_0x0219:
        r2 = 0;
        goto L_0x0227;
    L_0x021b:
        r2 = r8.t;
        if (r2 != 0) goto L_0x0221;
    L_0x021f:
        r2 = defpackage.apdx.g;
    L_0x0221:
        r2 = r2.b;
        if (r2 != 0) goto L_0x0227;
    L_0x0225:
        r2 = defpackage.aped.g;
    L_0x0227:
        r0.a(r2);
        r0.a(r11);
        r2 = r8.s;
        if (r2 != 0) goto L_0x0233;
    L_0x0231:
        r2 = defpackage.apdx.g;
    L_0x0233:
        r2 = r2.a;
        r2 = r2 & r14;
        if (r2 != 0) goto L_0x023a;
    L_0x0238:
        r2 = 0;
        goto L_0x0246;
    L_0x023a:
        r2 = r8.s;
        if (r2 != 0) goto L_0x0240;
    L_0x023e:
        r2 = defpackage.apdx.g;
    L_0x0240:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0246;
    L_0x0244:
        r2 = defpackage.apdz.e;
    L_0x0246:
        r3 = r8.u;
        if (r3 != 0) goto L_0x024c;
    L_0x024a:
        r3 = defpackage.apdx.g;
    L_0x024c:
        r3 = r3.a;
        r3 = r3 & r14;
        if (r3 != 0) goto L_0x0253;
    L_0x0251:
        r3 = 0;
        goto L_0x025f;
    L_0x0253:
        r3 = r8.u;
        if (r3 != 0) goto L_0x0259;
    L_0x0257:
        r3 = defpackage.apdx.g;
    L_0x0259:
        r3 = r3.d;
        if (r3 != 0) goto L_0x025f;
    L_0x025d:
        r3 = defpackage.apdz.e;
    L_0x025f:
        r4 = r0.r;
        if (r4 == 0) goto L_0x027f;
    L_0x0263:
        r4.a(r2);
        r4 = r0.s;
        if (r4 == 0) goto L_0x026d;
    L_0x026a:
        r4.a(r3);
    L_0x026d:
        r4 = r0.i;
        if (r4 == 0) goto L_0x027f;
    L_0x0271:
        if (r2 == 0) goto L_0x0274;
    L_0x0273:
        goto L_0x0279;
    L_0x0274:
        if (r3 != 0) goto L_0x0279;
    L_0x0276:
        r2 = r0.w;
        goto L_0x027c;
    L_0x0279:
        r2 = r0.w;
        r2 = r2 + r13;
    L_0x027c:
        r4.setMaxLines(r2);
    L_0x027f:
        r2 = r8.u;
        if (r2 != 0) goto L_0x0285;
    L_0x0283:
        r2 = defpackage.apdx.g;
    L_0x0285:
        r2 = r2.a;
        r2 = r2 & r15;
        if (r2 == 0) goto L_0x0297;
    L_0x028a:
        r2 = r8.u;
        if (r2 != 0) goto L_0x0290;
    L_0x028e:
        r2 = defpackage.apdx.g;
    L_0x0290:
        r2 = r2.e;
        if (r2 != 0) goto L_0x0298;
    L_0x0294:
        r2 = defpackage.auxa.f;
        goto L_0x0298;
    L_0x0297:
        r2 = 0;
    L_0x0298:
        r0.a(r2);
        r2 = r8.r;
        r3 = r2.isEmpty();
        if (r3 != 0) goto L_0x02c1;
    L_0x02a3:
        r2 = r2.iterator();
    L_0x02a7:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x02c1;
    L_0x02ad:
        r3 = r2.next();
        r3 = (defpackage.apdh) r3;
        r4 = r3.a;
        r5 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x02a7;
    L_0x02ba:
        r2 = r3.q;
        if (r2 != 0) goto L_0x02c2;
    L_0x02be:
        r2 = defpackage.apdj.c;
        goto L_0x02c2;
    L_0x02c1:
        r2 = 0;
    L_0x02c2:
        r0.C = r2;
        r2 = r0.d;
        r3 = r0.p;
        r4 = r0.C;
        r2.a(r3, r4);
        r2 = r8.r;
        r3 = r2.isEmpty();
        if (r3 != 0) goto L_0x02f2;
    L_0x02d5:
        r2 = r2.iterator();
    L_0x02d9:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x02f2;
    L_0x02df:
        r3 = r2.next();
        r3 = (defpackage.apdh) r3;
        r4 = r3.a;
        r4 = r4 & 256;
        if (r4 == 0) goto L_0x02d9;
    L_0x02eb:
        r2 = r3.h;
        if (r2 != 0) goto L_0x02f3;
    L_0x02ef:
        r2 = defpackage.apdv.c;
        goto L_0x02f3;
    L_0x02f2:
        r2 = 0;
    L_0x02f3:
        r3 = r0.t;
        if (r3 == 0) goto L_0x02fa;
    L_0x02f7:
        r3.a(r2);
    L_0x02fa:
        r2 = r8.B;
        r2 = defpackage.ipo.a(r2);
        r0.a(r2);
        r2 = r8.x;
        if (r2 != 0) goto L_0x0309;
    L_0x0307:
        r2 = defpackage.ayym.c;
    L_0x0309:
        r2 = r2.a;
        r2 = r2 & r12;
        if (r2 != 0) goto L_0x030f;
    L_0x030e:
        goto L_0x0343;
    L_0x030f:
        r2 = r8.B;
        r2 = defpackage.ipo.b(r2);
        if (r2 == 0) goto L_0x0343;
    L_0x0317:
        r2 = r8.x;
        if (r2 != 0) goto L_0x031d;
    L_0x031b:
        r2 = defpackage.ayym.c;
    L_0x031d:
        defpackage.jxw.a(r1, r2);
        r2 = r0.Q;
        r2 = r2.a;
        r2 = r2 & 16;
        if (r2 == 0) goto L_0x032d;
    L_0x0328:
        r2 = 0;
        super.a(r1, r2);
        goto L_0x0343;
    L_0x032d:
        r2 = 0;
        r3 = r0.I;
        if (r3 == 0) goto L_0x0343;
    L_0x0332:
        r4 = r0.P;
        if (r4 != 0) goto L_0x033e;
    L_0x0336:
        r4 = r0.B;
        r3 = r4.a(r3, r2);
        r0.P = r3;
    L_0x033e:
        r2 = r0.P;
        r2.a(r1);
    L_0x0343:
        r2 = r0.M;
        if (r2 == 0) goto L_0x0349;
    L_0x0347:
        goto L_0x043a;
    L_0x0349:
        r2 = r8.x;
        if (r2 != 0) goto L_0x034f;
    L_0x034d:
        r2 = defpackage.ayym.c;
    L_0x034f:
        r2 = r2.a;
        r2 = r2 & r12;
        if (r2 == 0) goto L_0x04b4;
    L_0x0354:
        r2 = r0.e;
        r3 = r0.h;
        r4 = r0.K;
        r5 = new hrf;
        r6 = r2.a;
        r6 = r6.get();
        r6 = (android.content.Context) r6;
        r6 = defpackage.hrl.a(r6, r12);
        r17 = r6;
        r17 = (android.content.Context) r17;
        r6 = r2.b;
        r6 = r6.get();
        r6 = (defpackage.eki) r6;
        r6 = defpackage.hrl.a(r6, r9);
        r18 = r6;
        r18 = (defpackage.eki) r18;
        r6 = r2.c;
        r7 = r2.d;
        r7 = r7.get();
        r7 = (defpackage.hmj) r7;
        r7 = defpackage.hrl.a(r7, r14);
        r20 = r7;
        r20 = (defpackage.hmj) r20;
        r7 = r2.e;
        r7 = r7.get();
        r7 = (defpackage.xci) r7;
        r9 = 5;
        r7 = defpackage.hrl.a(r7, r9);
        r21 = r7;
        r21 = (defpackage.xci) r21;
        r7 = r2.f;
        r7 = r7.get();
        r7 = (defpackage.akop) r7;
        r9 = 6;
        r7 = defpackage.hrl.a(r7, r9);
        r22 = r7;
        r22 = (defpackage.akop) r22;
        r7 = r2.g;
        r7 = r7.get();
        r7 = (defpackage.hqp) r7;
        r9 = 7;
        r7 = defpackage.hrl.a(r7, r9);
        r23 = r7;
        r23 = (defpackage.hqp) r23;
        r7 = r2.h;
        r7 = r7.get();
        r7 = (defpackage.zyw) r7;
        r7 = defpackage.hrl.a(r7, r15);
        r24 = r7;
        r24 = (defpackage.zyw) r24;
        r7 = r2.i;
        r7 = r7.get();
        r7 = (defpackage.hln) r7;
        r9 = 9;
        r7 = defpackage.hrl.a(r7, r9);
        r25 = r7;
        r25 = (defpackage.hln) r25;
        r7 = r2.j;
        r9 = r2.k;
        r9 = r9.get();
        r9 = (defpackage.acwa) r9;
        r11 = 11;
        r9 = defpackage.hrl.a(r9, r11);
        r27 = r9;
        r27 = (defpackage.acwa) r27;
        r9 = r2.l;
        r9 = r9.get();
        r9 = (defpackage.hng) r9;
        r11 = 12;
        r9 = defpackage.hrl.a(r9, r11);
        r28 = r9;
        r28 = (defpackage.hng) r28;
        r2 = r2.m;
        r2 = r2.get();
        r2 = (defpackage.ejv) r2;
        r9 = 13;
        r2 = defpackage.hrl.a(r2, r9);
        r29 = r2;
        r29 = (defpackage.ejv) r29;
        r2 = 14;
        r2 = defpackage.hrl.a(r3, r2);
        r30 = r2;
        r30 = (android.view.View) r30;
        r2 = 15;
        r2 = defpackage.hrl.a(r4, r2);
        r31 = r2;
        r31 = (defpackage.akoj) r31;
        r16 = r5;
        r19 = r6;
        r26 = r7;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
        r0.M = r5;
    L_0x043a:
        r2 = r0.M;
        r3 = r0.b;
        r4 = r8.x;
        if (r4 != 0) goto L_0x0444;
    L_0x0442:
        r4 = defpackage.ayym.c;
    L_0x0444:
        r4 = r4.b;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x04b4;
    L_0x044c:
        r4 = r2.a;
        r4 = r4.b();
        if (r4 == 0) goto L_0x04b4;
    L_0x0454:
        r4 = "sectionListController";
        r4 = r1.a(r4);
        r4 = r4 instanceof defpackage.hsf;
        if (r4 == 0) goto L_0x04b4;
    L_0x045e:
        r2.v = r1;
        r2.w = r3;
        r2.x = r8;
        r3 = r8.x;
        if (r3 != 0) goto L_0x046a;
    L_0x0468:
        r3 = defpackage.ayym.c;
    L_0x046a:
        r3 = r3.b;
        r2.y = r3;
        r3 = r2.c;
        r4 = r2.w;
        r5 = r2.i;
        r3 = r3.a(r4, r5);
        r2.z = r3;
        r3 = r2.z;
        r4 = r1.a;
        r5 = r8.a;
        r5 = r5 & 8192;
        if (r5 == 0) goto L_0x048b;
    L_0x0484:
        r5 = r8.p;
        if (r5 != 0) goto L_0x0491;
    L_0x0488:
        r5 = defpackage.apxu.d;
        goto L_0x0491;
    L_0x048b:
        r5 = r8.o;
        if (r5 != 0) goto L_0x0491;
    L_0x048f:
        r5 = defpackage.apxu.d;
    L_0x0491:
        r6 = r33.b();
        r3.a(r4, r5, r6);
        r3 = 0;
        r2.A = r3;
        r2.b();
        r3 = r2.b;
        r3.a(r2);
        r3 = r2.h;
        r4 = r2.s;
        r3.a(r4);
        r3 = r2.g;
        r2 = r2.r;
        r3.a(r2);
        defpackage.hkq.a(r1, r8);
    L_0x04b4:
        r2 = defpackage.xrg.class;
        r3 = "SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY";
        r2 = defpackage.akoo.a(r1, r2, r3);
        r2 = (defpackage.xrg) r2;
        r0.N = r2;
        r3 = new java.util.ArrayList;
        r2 = r8.G;
        r2 = r2.size();
        r3.<init>(r2);
        r2 = r8.G;
        r2 = r2.iterator();
    L_0x04d1:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x04fd;
    L_0x04d7:
        r4 = r2.next();
        r4 = (defpackage.axak) r4;
        r5 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r4.a(r5);
        r4 = r4.h;
        r6 = r5.d;
        r4 = r4.b(r6);
        if (r4 != 0) goto L_0x04f3;
    L_0x04f0:
        r4 = r5.b;
        goto L_0x04f7;
    L_0x04f3:
        r4 = r5.a(r4);
    L_0x04f7:
        r4 = (defpackage.aphg) r4;
        r3.add(r4);
        goto L_0x04d1;
    L_0x04fd:
        r4 = r0.J;
        r5 = r0.N;
        r6 = r0.H;
        r1 = r33;
        r2 = r8;
        r1 = defpackage.klv.a(r1, r2, r3, r4, r5, r6);
        r0.O = r1;
        r1 = r0.b;
        r1.a(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbh.a_(akor, java.lang.Object):void");
    }
}
