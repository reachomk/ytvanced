package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* renamed from: kda */
public final class kda extends jxw implements jfy {
    private final akou A;
    private final LinearLayout B;
    private final RelativeLayout C = ((RelativeLayout) this.B.findViewById(R.id.thumbnail_layout));
    private final RelativeLayout D = ((RelativeLayout) this.B.findViewById(R.id.text_layout));
    private final ViewStub E = ((ViewStub) this.B.findViewById(R.id.offline_badge_beside_details));
    private final xsc F;
    private final ImageView G;
    private View H;
    private apdj I;
    private hlv J;
    private arss K;
    private final zzl L;
    private final Resources a;
    private final akvo b;
    private final akoj c;
    private final jfw d;
    private final gsa e;
    private final hmc z;

    kda(Context context, akkq akkq, akou akou, aaas aaas, akvo akvo, gal gal, xsc xsc, ViewGroup viewGroup, jfw jfw, gsa gsa, hmc hmc, zzl zzl, fas fas) {
        jfw jfw2 = jfw;
        super(context, akkq, aaas, akou, gal, (int) R.layout.compact_video_item, viewGroup, hmc, fas);
        this.a = context.getResources();
        this.A = (akou) amqw.a((Object) akou);
        this.b = (akvo) amqw.a((Object) akvo);
        akou akou2 = akou;
        this.c = new akoj(aaas, akou);
        this.F = xsc;
        this.d = jfw2;
        jfw2.a(this);
        this.e = gsa;
        this.z = hmc;
        View view = this.h;
        this.B = (LinearLayout) view.findViewById(R.id.video_info_view);
        this.G = (ImageView) view.findViewById(R.id.channel_avatar);
        abe.a(view, new kdd());
        this.L = zzl;
    }

    public final View K_() {
        return this.A.a();
    }

    private static apeb a(arss arss) {
        apdx apdx = arss.s;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 2) == 0) {
            return null;
        }
        apdx apdx2 = arss.s;
        if (apdx2 == null) {
            apdx2 = apdx.g;
        }
        apeb apeb = apdx2.c;
        if (apeb == null) {
            apeb = apeb.e;
        }
        return apeb;
    }

    public final epu c() {
        return this.p;
    }

    public final apdj d() {
        return this.I;
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.K = null;
        hlv hlv = this.J;
        if (hlv != null) {
            hlv.a();
        }
        this.c.a();
    }

    private static boolean a(auma auma) {
        if (auma != null) {
            int a = aumc.a(auma.b);
            if (a != 0 && a == 11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:201:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0367  */
    public final /* synthetic */ void a_(defpackage.akor r17, java.lang.Object r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r8 = r18;
        r8 = (defpackage.arss) r8;
        r0.K = r8;
        r2 = r0.c;
        r3 = r1.a;
        r4 = r8.a;
        r4 = r4 & 2048;
        r9 = 0;
        if (r4 == 0) goto L_0x001c;
    L_0x0015:
        r4 = r8.m;
        if (r4 != 0) goto L_0x001d;
    L_0x0019:
        r4 = defpackage.apxu.d;
        goto L_0x001d;
    L_0x001c:
        r4 = r9;
    L_0x001d:
        r5 = r17.b();
        r2.a(r3, r4, r5, r0);
        r10 = -1;
        r2 = "fixed_width";
        r2 = r1.a(r2, r10);
        r3 = r16.K_();
        r3 = r3.getLayoutParams();
        if (r3 == 0) goto L_0x003e;
    L_0x0035:
        r3.width = r2;
        r2 = r16.K_();
        r2.setLayoutParams(r3);
    L_0x003e:
        r2 = r1.a;
        r3 = r8.B;
        r3 = r3.d();
        r2.a(r3, r9);
        r2 = r0.C;
        r2 = r2.getLayoutParams();
        r2 = (android.widget.LinearLayout.LayoutParams) r2;
        r3 = r0.D;
        r3 = r3.getLayoutParams();
        r3 = (android.widget.LinearLayout.LayoutParams) r3;
        r4 = r0.f;
        r5 = r0.F;
        r6 = r8.a;
        r6 = r6 & 8192;
        if (r6 == 0) goto L_0x006a;
    L_0x0063:
        r6 = r8.o;
        if (r6 != 0) goto L_0x006b;
    L_0x0067:
        r6 = defpackage.ayri.d;
        goto L_0x006b;
    L_0x006a:
        r6 = r9;
    L_0x006b:
        r4 = defpackage.joc.a(r4, r5, r6);
        r5 = r8.a;
        r5 = r5 & 16;
        if (r5 == 0) goto L_0x007c;
    L_0x0075:
        r5 = r8.e;
        if (r5 != 0) goto L_0x007d;
    L_0x0079:
        r5 = defpackage.arml.f;
        goto L_0x007d;
    L_0x007c:
        r5 = r9;
    L_0x007d:
        r5 = defpackage.ajqy.a(r5);
        r6 = android.text.TextUtils.isEmpty(r4);
        r7 = " · ";
        r11 = 3;
        r12 = 2;
        r13 = 1;
        r14 = 0;
        if (r6 != 0) goto L_0x008e;
    L_0x008d:
        goto L_0x00db;
    L_0x008e:
        r4 = r8.a;
        r4 = r4 & 128;
        if (r4 != 0) goto L_0x0096;
    L_0x0094:
        r4 = r9;
        goto L_0x00a0;
    L_0x0096:
        r4 = r8.i;
        if (r4 != 0) goto L_0x009c;
    L_0x009a:
        r4 = defpackage.arml.f;
    L_0x009c:
        r4 = defpackage.ajqy.a(r4);
    L_0x00a0:
        r6 = r8.a;
        r15 = r6 & 512;
        if (r15 != 0) goto L_0x00b7;
    L_0x00a6:
        r6 = r6 & 256;
        if (r6 == 0) goto L_0x00b5;
    L_0x00aa:
        r6 = r8.j;
        if (r6 != 0) goto L_0x00b0;
    L_0x00ae:
        r6 = defpackage.arml.f;
    L_0x00b0:
        r6 = defpackage.ajqy.a(r6);
        goto L_0x00c1;
    L_0x00b5:
        r6 = r9;
        goto L_0x00c1;
    L_0x00b7:
        r6 = r8.k;
        if (r6 != 0) goto L_0x00bd;
    L_0x00bb:
        r6 = defpackage.arml.f;
    L_0x00bd:
        r6 = defpackage.ajqy.a(r6);
    L_0x00c1:
        r15 = android.text.TextUtils.isEmpty(r6);
        if (r15 != 0) goto L_0x00db;
    L_0x00c7:
        r15 = android.text.TextUtils.isEmpty(r4);
        if (r15 != 0) goto L_0x00da;
    L_0x00cd:
        r15 = new java.lang.CharSequence[r11];
        r15[r14] = r4;
        r15[r13] = r7;
        r15[r12] = r6;
        r4 = android.text.TextUtils.concat(r15);
        goto L_0x00db;
    L_0x00da:
        r4 = r6;
    L_0x00db:
        r6 = defpackage.etj.a(r17);
        r15 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        if (r6 == 0) goto L_0x00e4;
    L_0x00e3:
        goto L_0x0116;
    L_0x00e4:
        r6 = r8.z;
        if (r6 != 0) goto L_0x00ea;
    L_0x00e8:
        r6 = defpackage.auma.c;
    L_0x00ea:
        r6 = defpackage.kcz.a(r6);
        if (r6 != 0) goto L_0x0116;
    L_0x00f0:
        r6 = r0.B;
        r6.setOrientation(r14);
        r6 = r0.a;
        r9 = r8.a;
        r9 = r9 & r15;
        if (r9 == 0) goto L_0x0103;
    L_0x00fc:
        r9 = r8.z;
        if (r9 != 0) goto L_0x0104;
    L_0x0100:
        r9 = defpackage.auma.c;
        goto L_0x0104;
    L_0x0103:
        r9 = 0;
    L_0x0104:
        defpackage.kcz.a(r6, r9, r2, r3);
        r3 = r0.a;
        r6 = r8.z;
        if (r6 != 0) goto L_0x010f;
    L_0x010d:
        r6 = defpackage.auma.c;
    L_0x010f:
        r3 = defpackage.kcz.a(r3, r6);
        r0.w = r3;
        goto L_0x0128;
    L_0x0116:
        r3 = r0.B;
        r3.setOrientation(r13);
        r2.width = r10;
        r3 = r0.a;
        r6 = 2131820573; // 0x7f11001d float:1.9273865E38 double:1.053259308E-314;
        r3 = r3.getInteger(r6);
        r0.w = r3;
    L_0x0128:
        r3 = r0.B;
        r6 = 2131755081; // 0x7f100049 float:1.9141031E38 double:1.053226951E-314;
        r3 = r3.findViewById(r6);
        if (r3 == 0) goto L_0x0145;
    L_0x0133:
        r3 = r3.getLayoutParams();
        r3 = (android.view.ViewGroup.MarginLayoutParams) r3;
        r6 = r0.a;
        r9 = 2131625191; // 0x7f0e04e7 float:1.8877583E38 double:1.0531627767E-314;
        r6 = r6.getDimensionPixelSize(r9);
        r3.setMarginEnd(r6);
    L_0x0145:
        r3 = r0.B;
        r6 = r0.a;
        r9 = 2131624698; // 0x7f0e02fa float:1.8876583E38 double:1.053162533E-314;
        r6 = r6.getDimensionPixelSize(r9);
        r9 = r0.a;
        r10 = 2131624694; // 0x7f0e02f6 float:1.8876575E38 double:1.053162531E-314;
        r9 = r9.getDimensionPixelSize(r10);
        defpackage.abe.a(r3, r6, r14, r14, r9);
        r3 = r0.a;
        r6 = 2131624700; // 0x7f0e02fc float:1.8876587E38 double:1.053162534E-314;
        r3 = r3.getDimensionPixelSize(r6);
        r2.setMarginEnd(r3);
        r2 = r0.D;
        r3 = defpackage.abe.j(r2);
        r6 = r0.D;
        r6 = r6.getPaddingTop();
        r9 = r0.a;
        r10 = 2131624696; // 0x7f0e02f8 float:1.887658E38 double:1.053162532E-314;
        r9 = r9.getDimensionPixelSize(r10);
        r10 = r0.D;
        r10 = r10.getPaddingBottom();
        defpackage.abe.a(r2, r3, r6, r9, r10);
        r2 = r8.a;
        r2 = r2 & r15;
        if (r2 == 0) goto L_0x0192;
    L_0x018b:
        r9 = r8.z;
        if (r9 != 0) goto L_0x0193;
    L_0x018f:
        r9 = defpackage.auma.c;
        goto L_0x0193;
    L_0x0192:
        r9 = 0;
    L_0x0193:
        r2 = defpackage.kda.a(r9);
        if (r2 == 0) goto L_0x01b0;
    L_0x0199:
        if (r5 == 0) goto L_0x019c;
    L_0x019b:
        goto L_0x019e;
    L_0x019c:
        r5 = "";
    L_0x019e:
        if (r4 == 0) goto L_0x01ae;
    L_0x01a0:
        r2 = new java.lang.CharSequence[r11];
        r2[r14] = r5;
        r2[r13] = r7;
        r2[r12] = r4;
        r2 = android.text.TextUtils.concat(r2);
        r4 = r2;
        goto L_0x01af;
    L_0x01ae:
        r4 = r5;
    L_0x01af:
        r5 = 0;
    L_0x01b0:
        r2 = defpackage.kda.a(r8);
        if (r2 == 0) goto L_0x01b8;
    L_0x01b6:
        r2 = 1;
        goto L_0x01b9;
    L_0x01b8:
        r2 = 0;
    L_0x01b9:
        r0.a(r5, r4, r2);
        r2 = r0.k;
        r3 = r8.a;
        r3 = r3 & 32;
        if (r3 == 0) goto L_0x01cb;
    L_0x01c4:
        r9 = r8.f;
        if (r9 != 0) goto L_0x01cc;
    L_0x01c8:
        r9 = defpackage.armh.d;
        goto L_0x01cc;
    L_0x01cb:
        r9 = 0;
    L_0x01cc:
        defpackage.gsa.a(r2, r9);
        r9 = new akor;
        r9.<init>(r1);
        r2 = r8.B;
        r2 = r2.d();
        r9.b = r2;
        r2 = r8.a;
        r2 = r2 & 4;
        if (r2 == 0) goto L_0x01e9;
    L_0x01e2:
        r2 = r8.c;
        if (r2 != 0) goto L_0x01ea;
    L_0x01e6:
        r2 = defpackage.arml.f;
        goto L_0x01ea;
    L_0x01e9:
        r2 = 0;
    L_0x01ea:
        r2 = defpackage.ajqy.a(r2);
        r0.a(r2);
        r2 = r8.a;
        r2 = r2 & 1024;
        if (r2 == 0) goto L_0x01fe;
    L_0x01f7:
        r2 = r8.l;
        if (r2 != 0) goto L_0x01ff;
    L_0x01fb:
        r2 = defpackage.arml.f;
        goto L_0x01ff;
    L_0x01fe:
        r2 = 0;
    L_0x01ff:
        r2 = defpackage.ajqy.a(r2);
        r3 = r8.a;
        r3 = r3 & 1024;
        if (r3 == 0) goto L_0x0210;
    L_0x0209:
        r3 = r8.l;
        if (r3 != 0) goto L_0x0211;
    L_0x020d:
        r3 = defpackage.arml.f;
        goto L_0x0211;
    L_0x0210:
        r3 = 0;
    L_0x0211:
        r3 = defpackage.ajqy.b(r3);
        r4 = r8.w;
        r5 = new defpackage.ayfu[r14];
        r4 = r4.toArray(r5);
        r4 = (defpackage.ayfu[]) r4;
        r5 = r8.a;
        r5 = r5 & 8192;
        if (r5 == 0) goto L_0x022c;
    L_0x0225:
        r5 = r8.o;
        if (r5 != 0) goto L_0x022d;
    L_0x0229:
        r5 = defpackage.ayri.d;
        goto L_0x022d;
    L_0x022c:
        r5 = 0;
    L_0x022d:
        r0.a(r2, r3, r4, r5);
        r2 = r8.a;
        r2 = r2 & r12;
        if (r2 == 0) goto L_0x023c;
    L_0x0235:
        r2 = r8.b;
        if (r2 != 0) goto L_0x023d;
    L_0x0239:
        r2 = defpackage.aygk.f;
        goto L_0x023d;
    L_0x023c:
        r2 = 0;
    L_0x023d:
        r0.a(r2);
        r2 = r8.a;
        r2 = r2 & r15;
        if (r2 == 0) goto L_0x024c;
    L_0x0245:
        r2 = r8.z;
        if (r2 != 0) goto L_0x024d;
    L_0x0249:
        r2 = defpackage.auma.c;
        goto L_0x024d;
    L_0x024c:
        r2 = 0;
    L_0x024d:
        r2 = defpackage.kda.a(r2);
        r10 = 8;
        if (r2 != 0) goto L_0x025b;
    L_0x0255:
        r2 = r0.G;
        r2.setVisibility(r10);
        goto L_0x027c;
    L_0x025b:
        r2 = r8.g;
        if (r2 != 0) goto L_0x0261;
    L_0x025f:
        r2 = defpackage.aygk.f;
    L_0x0261:
        r3 = r0.G;
        r4 = r8.a;
        r4 = r4 & 64;
        if (r4 == 0) goto L_0x026b;
    L_0x0269:
        r4 = 1;
        goto L_0x026c;
    L_0x026b:
        r4 = 0;
    L_0x026c:
        defpackage.xpr.a(r3, r4);
        r3 = r8.a;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x027c;
    L_0x0275:
        r3 = r0.g;
        r4 = r0.G;
        r3.a(r4, r2);
    L_0x027c:
        r2 = r8.v;
        if (r2 != 0) goto L_0x0288;
    L_0x0280:
        r2 = r0.H;
        if (r2 == 0) goto L_0x02a3;
    L_0x0284:
        r2.setVisibility(r10);
        goto L_0x02a3;
    L_0x0288:
        r2 = r0.H;
        if (r2 == 0) goto L_0x028d;
    L_0x028c:
        goto L_0x029e;
    L_0x028d:
        r2 = r0.h;
        r3 = 2131757008; // 0x7f1007d0 float:1.914494E38 double:1.053227903E-314;
        r2 = r2.findViewById(r3);
        r2 = (android.view.ViewStub) r2;
        r2 = r2.inflate();
        r0.H = r2;
    L_0x029e:
        r2 = r0.H;
        r2.setVisibility(r14);
    L_0x02a3:
        r7 = r9.a;
        r2 = r0.b;
        r3 = r0.B;
        r4 = r0.v;
        r5 = r8.x;
        if (r5 != 0) goto L_0x02b1;
    L_0x02af:
        r5 = defpackage.auvr.c;
    L_0x02b1:
        r5 = r5.a;
        r5 = r5 & r13;
        if (r5 != 0) goto L_0x02b8;
    L_0x02b6:
        r5 = 0;
        goto L_0x02c4;
    L_0x02b8:
        r5 = r8.x;
        if (r5 != 0) goto L_0x02be;
    L_0x02bc:
        r5 = defpackage.auvr.c;
    L_0x02be:
        r5 = r5.b;
        if (r5 != 0) goto L_0x02c4;
    L_0x02c2:
        r5 = defpackage.auvn.l;
    L_0x02c4:
        r6 = r8;
        r2.a(r3, r4, r5, r6, r7);
        r2 = r8.r;
        if (r2 != 0) goto L_0x02ce;
    L_0x02cc:
        r2 = defpackage.apdx.g;
    L_0x02ce:
        r2 = r2.a;
        r2 = r2 & r13;
        if (r2 != 0) goto L_0x02d5;
    L_0x02d3:
        r2 = 0;
        goto L_0x02e1;
    L_0x02d5:
        r2 = r8.r;
        if (r2 != 0) goto L_0x02db;
    L_0x02d9:
        r2 = defpackage.apdx.g;
    L_0x02db:
        r2 = r2.b;
        if (r2 != 0) goto L_0x02e1;
    L_0x02df:
        r2 = defpackage.aped.g;
    L_0x02e1:
        r0.a(r2);
        r2 = defpackage.kda.a(r8);
        r0.a(r2);
        r2 = r8.q;
        if (r2 != 0) goto L_0x02f1;
    L_0x02ef:
        r2 = defpackage.apdx.g;
    L_0x02f1:
        r2 = r2.a;
        r2 = r2 & 4;
        if (r2 != 0) goto L_0x02f9;
    L_0x02f7:
        r2 = 0;
        goto L_0x0305;
    L_0x02f9:
        r2 = r8.q;
        if (r2 != 0) goto L_0x02ff;
    L_0x02fd:
        r2 = defpackage.apdx.g;
    L_0x02ff:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0305;
    L_0x0303:
        r2 = defpackage.apdz.e;
    L_0x0305:
        r0.a(r2);
        r2 = r8.p;
        if (r2 == 0) goto L_0x032a;
    L_0x030c:
        r2 = r2.iterator();
    L_0x0310:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x032a;
    L_0x0316:
        r3 = r2.next();
        r3 = (defpackage.apdh) r3;
        r4 = r3.a;
        r5 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0310;
    L_0x0323:
        r2 = r3.q;
        if (r2 != 0) goto L_0x032b;
    L_0x0327:
        r2 = defpackage.apdj.c;
        goto L_0x032b;
    L_0x032a:
        r2 = 0;
    L_0x032b:
        r0.I = r2;
        r2 = r0.d;
        r3 = r0.p;
        r4 = r0.I;
        r2.a(r3, r4);
        r2 = r8.s;
        if (r2 != 0) goto L_0x033c;
    L_0x033a:
        r2 = defpackage.apdx.g;
    L_0x033c:
        r2 = r2.a;
        r2 = r2 & r10;
        if (r2 == 0) goto L_0x034e;
    L_0x0341:
        r2 = r8.s;
        if (r2 != 0) goto L_0x0347;
    L_0x0345:
        r2 = defpackage.apdx.g;
    L_0x0347:
        r2 = r2.e;
        if (r2 != 0) goto L_0x034f;
    L_0x034b:
        r2 = defpackage.auxa.f;
        goto L_0x034f;
    L_0x034e:
        r2 = 0;
    L_0x034f:
        r0.a(r2);
        r2 = r8.w;
        r2 = defpackage.ipo.a(r2);
        r0.a(r2);
        r2 = r8.A;
        if (r2 != 0) goto L_0x0361;
    L_0x035f:
        r2 = defpackage.ayym.c;
    L_0x0361:
        r2 = r2.a;
        r2 = r2 & r13;
        if (r2 != 0) goto L_0x0367;
    L_0x0366:
        goto L_0x0393;
    L_0x0367:
        r2 = r8.A;
        if (r2 != 0) goto L_0x036d;
    L_0x036b:
        r2 = defpackage.ayym.c;
    L_0x036d:
        defpackage.jxw.a(r1, r2);
        r2 = r0.E;
        if (r2 == 0) goto L_0x0393;
    L_0x0374:
        r3 = r0.K;
        r3 = r3.a;
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x0381;
    L_0x037c:
        r3 = 0;
        super.a(r1, r3);
        goto L_0x0393;
    L_0x0381:
        r3 = 0;
        r4 = r0.J;
        if (r4 != 0) goto L_0x038e;
    L_0x0386:
        r4 = r0.z;
        r2 = r4.a(r2, r3);
        r0.J = r2;
    L_0x038e:
        r2 = r0.J;
        r2.a(r1);
    L_0x0393:
        r1 = r0.f;
        r1 = defpackage.xss.b(r1);
        if (r1 == 0) goto L_0x04b9;
    L_0x039b:
        r1 = r0.L;
        r1 = defpackage.foh.s(r1);
        if (r1 == 0) goto L_0x04b9;
    L_0x03a3:
        r1 = r0.f;
        r1 = r1.getResources();
        r2 = 2131625173; // 0x7f0e04d5 float:1.8877546E38 double:1.053162768E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r0.G;
        r2 = r2.getLayoutParams();
        r2.height = r1;
        r2.width = r1;
        r1 = r0.i;
        r2 = 2132017563; // 0x7f14019b float:1.9673408E38 double:1.053356634E-314;
        defpackage.adl.a(r1, r2);
        r1 = r0.i;
        r2 = r0.f;
        r2 = r2.getResources();
        r3 = 2131625183; // 0x7f0e04df float:1.8877567E38 double:1.0531627727E-314;
        r2 = r2.getDimension(r3);
        r1.setTextSize(r14, r2);
        r1 = r0.i;
        r2 = r0.f;
        r2 = r2.getResources();
        r3 = 2131625182; // 0x7f0e04de float:1.8877565E38 double:1.053162772E-314;
        r2 = r2.getDimension(r3);
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.setLineSpacing(r2, r3);
        r1 = r0.i;
        r1 = r1.getLayoutParams();
        r1 = (android.view.ViewGroup.MarginLayoutParams) r1;
        r2 = r0.f;
        r2 = r2.getResources();
        r4 = 2131625181; // 0x7f0e04dd float:1.8877563E38 double:1.0531627717E-314;
        r2 = r2.getDimensionPixelSize(r4);
        r1.setMargins(r14, r14, r14, r2);
        r1 = r0.f;
        r1 = r1.getResources();
        r2 = 2131625180; // 0x7f0e04dc float:1.887756E38 double:1.0531627712E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = new android.widget.LinearLayout$LayoutParams;
        r4 = -2;
        r5 = -1;
        r2.<init>(r5, r4);
        r2.setMargins(r1, r1, r1, r1);
        r1 = r0.C;
        r1.setLayoutParams(r2);
        r1 = r0.v;
        r2 = r0.f;
        r2 = r2.getResources();
        r4 = 2131625177; // 0x7f0e04d9 float:1.8877555E38 double:1.05316277E-314;
        r2 = r2.getDimensionPixelSize(r4);
        r4 = r0.f;
        r4 = r4.getResources();
        r5 = 2131625176; // 0x7f0e04d8 float:1.8877553E38 double:1.0531627693E-314;
        r4 = r4.getDimensionPixelSize(r5);
        r1.setPadding(r2, r14, r4, r14);
        r1 = r0.f;
        r1 = r1.getResources();
        r2 = 2131625179; // 0x7f0e04db float:1.8877559E38 double:1.053162771E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r0.D;
        r4 = r2.getPaddingStart();
        r5 = r0.D;
        r5 = r5.getPaddingEnd();
        r6 = r0.D;
        r6 = r6.getPaddingBottom();
        r2.setPadding(r4, r1, r5, r6);
        r1 = r0.f;
        r1 = r1.getResources();
        r2 = 2131625178; // 0x7f0e04da float:1.8877557E38 double:1.0531627703E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = new android.widget.LinearLayout$LayoutParams;
        r4 = -2;
        r5 = -1;
        r2.<init>(r5, r4);
        r2.setMargins(r14, r1, r14, r1);
        r1 = r0.D;
        r1.setLayoutParams(r2);
        r1 = r0.l;
        r2 = r0.f;
        r2 = r2.getResources();
        r4 = 2131625175; // 0x7f0e04d7 float:1.887755E38 double:1.053162769E-314;
        r2 = r2.getDimension(r4);
        r1.setTextSize(r14, r2);
        r1 = r0.l;
        r2 = r0.f;
        r2 = r2.getResources();
        r4 = 2131625174; // 0x7f0e04d6 float:1.8877549E38 double:1.0531627683E-314;
        r2 = r2.getDimension(r4);
        r1.setLineSpacing(r2, r3);
        r1 = r0.l;
        r1.setSingleLine(r14);
        r1 = r0.l;
        r1.setMaxLines(r12);
        r1 = r0.f;
        r1 = r1.getResources();
        r2 = 2131625184; // 0x7f0e04e0 float:1.8877569E38 double:1.053162773E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r0.B;
        r2.setPadding(r1, r1, r1, r1);
    L_0x04b9:
        r1 = r0.A;
        r1.a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kda.a_(akor, java.lang.Object):void");
    }
}
