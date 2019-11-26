package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: knf */
public final class knf implements akot, fhn, gai, jfy, xcp {
    private final Context a;
    private final aaas b;
    private final xci c;
    private final ffw d;
    private final akvo e;
    private final boolean f;
    private final jfw g;
    private final hnh h;
    private final klo i;
    private final akoa j;
    private apdj k;
    private final akpb l;
    private kfh m;
    private final zyw n;
    private final kfl o;
    private final eza p;
    private knq q;
    private final FrameLayout r;
    private azem s;

    public knf(Context context, xci xci, aaas aaas, ffw ffw, akvo akvo, zyw zyw, jfw jfw, hnh hnh, klo klo, akoa akoa, akpb akpb, kfl kfl) {
        this.a = (Context) amqw.a((Object) context);
        this.c = xci;
        this.b = aaas;
        this.d = ffw;
        this.e = (akvo) amqw.a((Object) akvo);
        this.i = klo;
        this.j = akoa;
        this.p = new eza(xwe.a(context, R.attr.ytSeparator, 0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.r = new FrameLayout(context);
        this.r.setBackground(this.p);
        this.f = foh.i(zyw);
        this.g = jfw;
        jfw.a(this);
        this.h = hnh;
        this.l = akpb;
        this.n = zyw;
        this.o = kfl;
    }

    public final View K_() {
        return this.r;
    }

    public final void a(akpb akpb) {
        this.s = null;
        this.c.b(this);
        knq knq = this.q;
        if (knq != null) {
            knq.a(akpb);
            this.r.removeAllViews();
            akpb.a(this.q.h);
        }
        kfh kfh = this.m;
        if (kfh != null) {
            kfh.c();
        }
    }

    public final bblt a(int i) {
        if (this.m != null) {
            if ((i == 1 || i == 2) && knf.a(this.s)) {
                this.m.a();
            } else if (i == 0 && knf.a(this.s)) {
                this.m.b();
            }
        }
        return bblt.a();
    }

    public final boolean a(fhn fhn) {
        return fhn instanceof knf ? amqq.a(((knf) fhn).s, this.s) : false;
    }

    private static boolean a(azem azem) {
        if (azem != null) {
            ajzw a;
            if ((azem.a & 1073741824) != 0) {
                axak axak = azem.C;
                if (axak == null) {
                    axak = axak.a;
                }
                a = ajzv.a(axak);
            } else {
                a = null;
            }
            if (ajzv.b(a, aren.class)) {
                return true;
            }
        }
        return false;
    }

    private static apeb b(azem azem) {
        if ((azem.a & 2097152) == 0) {
            return null;
        }
        apdx apdx = azem.u;
        if (apdx == null) {
            apdx = apdx.g;
        }
        apeb apeb = apdx.c;
        if (apeb == null) {
            apeb = apeb.e;
        }
        return apeb;
    }

    public final epu c() {
        knq knq = this.q;
        return knq != null ? knq.p : null;
    }

    public final apdj d() {
        return this.k;
    }

    public final gaf b() {
        return this.q.h();
    }

    private final int e() {
        return this.a.getResources().getConfiguration().orientation;
    }

    /* JADX WARNING: Removed duplicated region for block: B:348:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:399:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0676 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0676 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:399:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:399:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0676 A:{SKIP} */
    /* JADX WARNING: Missing block: B:114:0x026c, code skipped:
            if (r9 == 10) goto L_0x026e;
     */
    public final /* synthetic */ void a_(defpackage.akor r17, java.lang.Object r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r5 = r18;
        r5 = (defpackage.azem) r5;
        r0.s = r5;
        r2 = r1.a;
        r3 = r5.q;
        r4 = r0.r;
        r2.a(r5, r3, r4);
        r2 = defpackage.knf.b(r5);
        r3 = 1;
        r4 = 0;
        if (r2 == 0) goto L_0x001d;
    L_0x001b:
        r2 = 1;
        goto L_0x001e;
    L_0x001d:
        r2 = 0;
    L_0x001e:
        r6 = r0.r;
        r6.removeAllViews();
        r6 = r16.e();
        r7 = r0.n;
        r8 = r0.a;
        r9 = 9;
        r10 = 7;
        r11 = 5;
        r12 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r13 = 2;
        if (r6 != r13) goto L_0x004d;
    L_0x0034:
        r6 = defpackage.xss.b(r8);
        if (r6 == 0) goto L_0x0046;
    L_0x003a:
        r6 = defpackage.foh.L(r7);
        if (r6 == 0) goto L_0x0046;
    L_0x0040:
        r6 = new kne;
        r6.<init>();
        goto L_0x004b;
    L_0x0046:
        r6 = new knh;
        r6.<init>();
    L_0x004b:
        r7 = r6;
        goto L_0x00a3;
    L_0x004d:
        r6 = r5.a;
        r6 = r6 & r12;
        if (r6 == 0) goto L_0x008b;
    L_0x0052:
        r6 = r5.y;
        if (r6 != 0) goto L_0x0058;
    L_0x0056:
        r6 = defpackage.azes.c;
    L_0x0058:
        r6 = r6.b;
        r6 = defpackage.azeu.a(r6);
        if (r6 == 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0062;
    L_0x0061:
        r6 = 1;
    L_0x0062:
        r6 = r6 + -1;
        if (r6 == r11) goto L_0x0085;
    L_0x0066:
        r7 = 6;
        if (r6 == r7) goto L_0x007f;
    L_0x0069:
        if (r6 == r10) goto L_0x0079;
    L_0x006b:
        if (r6 == r9) goto L_0x0073;
    L_0x006d:
        r6 = new knp;
        r6.<init>();
        goto L_0x004b;
    L_0x0073:
        r6 = new knn;
        r6.<init>();
        goto L_0x004b;
    L_0x0079:
        r6 = new kni;
        r6.<init>();
        goto L_0x004b;
    L_0x007f:
        r6 = new knl;
        r6.<init>();
        goto L_0x004b;
    L_0x0085:
        r6 = new knk;
        r6.<init>();
        goto L_0x004b;
    L_0x008b:
        r6 = defpackage.xss.b(r8);
        if (r6 == 0) goto L_0x009d;
    L_0x0091:
        r6 = defpackage.foh.L(r7);
        if (r6 == 0) goto L_0x009d;
    L_0x0097:
        r6 = new knm;
        r6.<init>();
        goto L_0x004b;
    L_0x009d:
        r6 = new knp;
        r6.<init>();
        goto L_0x004b;
    L_0x00a3:
        r7.a = r5;
        r6 = r0.l;
        r8 = 0;
        r6 = defpackage.akoz.a(r6, r7, r8);
        r6 = (defpackage.knr) r6;
        if (r6 == 0) goto L_0x06c7;
    L_0x00b0:
        r14 = r6.a;
        r0.q = r14;
        r14 = r0.q;
        r14 = r14.h;
        r15 = r0.l;
        r15 = r15.a(r7);
        defpackage.akoz.a(r14, r6, r15);
        r6 = r7 instanceof defpackage.knl;
        if (r6 == 0) goto L_0x00e9;
    L_0x00c5:
        r6 = r0.q;
        r14 = r6.e;
        if (r14 == 0) goto L_0x00e9;
    L_0x00cb:
        r14 = r14.getLayoutParams();
        r14 = r14 instanceof android.view.ViewGroup.MarginLayoutParams;
        if (r14 == 0) goto L_0x00e9;
    L_0x00d3:
        r14 = r6.e;
        r14 = r14.getLayoutParams();
        r14 = (android.view.ViewGroup.MarginLayoutParams) r14;
        r14.setMargins(r4, r4, r4, r4);
        r14.setMarginStart(r4);
        r14.setMarginEnd(r4);
        r6 = r6.e;
        r6.requestLayout();
    L_0x00e9:
        r6 = r0.n;
        r6 = defpackage.kcb.a(r6);
        if (r6 == 0) goto L_0x017a;
    L_0x00f1:
        r6 = r0.a;
        r6 = r6.getResources();
        r6 = r6.getConfiguration();
        r6 = r6.orientation;
        if (r6 != r3) goto L_0x017a;
    L_0x00ff:
        r6 = r0.n;
        r6 = defpackage.kcb.b(r6);
        if (r6 == 0) goto L_0x0115;
    L_0x0107:
        r6 = r0.a;
        r6 = r6.getResources();
        r14 = 2131626818; // 0x7f0e0b42 float:1.8880883E38 double:1.0531635805E-314;
        r6 = r6.getDimensionPixelSize(r14);
        goto L_0x0122;
    L_0x0115:
        r6 = r0.a;
        r6 = r6.getResources();
        r14 = 2131624182; // 0x7f0e00f6 float:1.8875536E38 double:1.053162278E-314;
        r6 = r6.getDimensionPixelSize(r14);
    L_0x0122:
        r14 = r0.p;
        r15 = r0.a;
        r9 = 2130771975; // 0x7f010007 float:1.7147055E38 double:1.052741232E-314;
        r9 = defpackage.xwe.a(r15, r9, r4);
        r14.b(r9);
        r9 = r0.p;
        r9.c(r6);
        r6 = r0.n;
        r6 = defpackage.kcb.c(r6);
        if (r6 == 0) goto L_0x019a;
    L_0x013d:
        r6 = r0.n;
        r6 = defpackage.kcb.d(r6);
        if (r6 == 0) goto L_0x0153;
    L_0x0145:
        r6 = r0.a;
        r6 = r6.getResources();
        r9 = 2131624992; // 0x7f0e0420 float:1.887718E38 double:1.0531626784E-314;
        r6 = r6.getDimensionPixelSize(r9);
        goto L_0x0160;
    L_0x0153:
        r6 = r0.a;
        r6 = r6.getResources();
        r9 = 2131624991; // 0x7f0e041f float:1.8877177E38 double:1.053162678E-314;
        r6 = r6.getDimensionPixelSize(r9);
    L_0x0160:
        r9 = r0.q;
        r14 = r9.d;
        if (r14 == 0) goto L_0x019a;
    L_0x0166:
        r15 = r14.getPaddingLeft();
        r11 = r9.d;
        r11 = r11.getPaddingTop();
        r9 = r9.d;
        r9 = r9.getPaddingRight();
        r14.setPadding(r15, r11, r9, r6);
        goto L_0x019a;
    L_0x017a:
        r6 = r0.p;
        r9 = r0.a;
        r11 = 2130772305; // 0x7f010151 float:1.7147725E38 double:1.052741395E-314;
        r9 = defpackage.xwe.a(r9, r11, r4);
        r6.b(r9);
        r6 = r0.p;
        r9 = r0.a;
        r9 = r9.getResources();
        r11 = 2131625489; // 0x7f0e0611 float:1.8878187E38 double:1.053162924E-314;
        r9 = r9.getDimensionPixelSize(r11);
        r6.c(r9);
    L_0x019a:
        r6 = r0.a;
        r6 = defpackage.xss.b(r6);
        if (r6 == 0) goto L_0x01af;
    L_0x01a2:
        r6 = r0.n;
        r6 = defpackage.foh.L(r6);
        if (r6 == 0) goto L_0x01af;
    L_0x01aa:
        r6 = r0.p;
        r6.a(r4);
    L_0x01af:
        r6 = r0.r;
        r9 = r0.p;
        r6.setBackground(r9);
        r6 = r0.q;
        r9 = r16.e();
        r6.D = r9;
        r6 = r0.q;
        r9 = r5.n;
        r11 = 8;
        if (r9 != 0) goto L_0x01ce;
    L_0x01c6:
        r6 = r6.C;
        if (r6 == 0) goto L_0x01e8;
    L_0x01ca:
        r6.setVisibility(r11);
        goto L_0x01e8;
    L_0x01ce:
        r9 = r6.C;
        if (r9 != 0) goto L_0x01e3;
    L_0x01d2:
        r9 = r6.e;
        r14 = 2131757008; // 0x7f1007d0 float:1.914494E38 double:1.053227903E-314;
        r9 = r9.findViewById(r14);
        r9 = (android.view.ViewStub) r9;
        r9 = r9.inflate();
        r6.C = r9;
    L_0x01e3:
        r6 = r6.C;
        r6.setVisibility(r4);
    L_0x01e8:
        r6 = r0.q;
        r9 = r5.o;
        r9 = defpackage.ipo.a(r9);
        r6.a(r9);
        r6 = r0.q;
        r9 = r5.a;
        r9 = r9 & r3;
        if (r9 == 0) goto L_0x0201;
    L_0x01fa:
        r9 = r5.b;
        if (r9 != 0) goto L_0x0202;
    L_0x01fe:
        r9 = defpackage.arml.f;
        goto L_0x0202;
    L_0x0201:
        r9 = r8;
    L_0x0202:
        r14 = r0.b;
        r9 = defpackage.aabb.a(r9, r14, r4);
        r6.a(r9);
        r6 = r0.q;
        r9 = r5.a;
        r9 = r9 & r13;
        if (r9 != 0) goto L_0x0214;
    L_0x0212:
        r9 = r8;
        goto L_0x021a;
    L_0x0214:
        r9 = r5.c;
        if (r9 != 0) goto L_0x021a;
    L_0x0218:
        r9 = defpackage.arml.f;
    L_0x021a:
        r14 = r0.b;
        r9 = defpackage.aabb.a(r9, r14, r4);
        r6 = r6.A;
        defpackage.xpr.a(r6, r9);
        r6 = r0.q;
        r9 = r5.a;
        r9 = r9 & r12;
        r14 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r15 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r12 = 3;
        r8 = 4;
        if (r9 != 0) goto L_0x0235;
    L_0x0232:
        r8 = 5;
        goto L_0x0321;
    L_0x0235:
        r9 = r6.D;
        if (r9 != r3) goto L_0x0232;
    L_0x0239:
        r9 = r5.y;
        if (r9 != 0) goto L_0x023f;
    L_0x023d:
        r9 = defpackage.azes.c;
    L_0x023f:
        r9 = r9.b;
        r9 = defpackage.azeu.a(r9);
        if (r9 != 0) goto L_0x0248;
    L_0x0247:
        goto L_0x024b;
    L_0x0248:
        if (r9 != r10) goto L_0x024b;
    L_0x024a:
        goto L_0x026e;
    L_0x024b:
        r9 = r5.y;
        if (r9 != 0) goto L_0x0251;
    L_0x024f:
        r9 = defpackage.azes.c;
    L_0x0251:
        r9 = r9.b;
        r9 = defpackage.azeu.a(r9);
        if (r9 != 0) goto L_0x025a;
    L_0x0259:
        goto L_0x025c;
    L_0x025a:
        if (r9 == r11) goto L_0x026e;
    L_0x025c:
        r9 = r5.y;
        if (r9 != 0) goto L_0x0262;
    L_0x0260:
        r9 = defpackage.azes.c;
    L_0x0262:
        r9 = r9.b;
        r9 = defpackage.azeu.a(r9);
        if (r9 == 0) goto L_0x0232;
    L_0x026a:
        r10 = 10;
        if (r9 != r10) goto L_0x0232;
    L_0x026e:
        r9 = new java.lang.CharSequence[r8];
        r10 = r5.a;
        r10 = r10 & r11;
        if (r10 == 0) goto L_0x027c;
    L_0x0275:
        r10 = r5.e;
        if (r10 != 0) goto L_0x027d;
    L_0x0279:
        r10 = defpackage.arml.f;
        goto L_0x027d;
    L_0x027c:
        r10 = 0;
    L_0x027d:
        r10 = defpackage.ajqy.a(r10);
        r10 = defpackage.fpi.a(r10);
        r9[r4] = r10;
        r10 = r5.a;
        r10 = r10 & 256;
        if (r10 == 0) goto L_0x0294;
    L_0x028d:
        r10 = r5.j;
        if (r10 != 0) goto L_0x0295;
    L_0x0291:
        r10 = defpackage.arml.f;
        goto L_0x0295;
    L_0x0294:
        r10 = 0;
    L_0x0295:
        r10 = defpackage.ajqy.a(r10);
        r10 = defpackage.fpi.a(r10);
        r9[r3] = r10;
        r10 = r5.a;
        r10 = r10 & r14;
        if (r10 == 0) goto L_0x02ab;
    L_0x02a4:
        r10 = r5.v;
        if (r10 != 0) goto L_0x02ac;
    L_0x02a8:
        r10 = defpackage.arml.f;
        goto L_0x02ac;
    L_0x02ab:
        r10 = 0;
    L_0x02ac:
        r10 = defpackage.ajqy.a(r10);
        r10 = defpackage.fpi.a(r10);
        r9[r13] = r10;
        r10 = r6.f;
        r14 = r6.a;
        r8 = r5.a;
        r8 = r8 & r15;
        if (r8 == 0) goto L_0x02c6;
    L_0x02bf:
        r8 = r5.w;
        if (r8 != 0) goto L_0x02c7;
    L_0x02c3:
        r8 = defpackage.ayri.d;
        goto L_0x02c7;
    L_0x02c6:
        r8 = 0;
    L_0x02c7:
        r8 = defpackage.joc.a(r10, r14, r8);
        r8 = defpackage.fpi.a(r8);
        r9[r12] = r8;
        r8 = defpackage.amvj.a(r9);
        r9 = 0;
        r6.a(r9, r8, r2);
        r2 = r5.a;
        r2 = r2 & 128;
        if (r2 == 0) goto L_0x02e6;
    L_0x02df:
        r8 = r5.i;
        if (r8 != 0) goto L_0x02e7;
    L_0x02e3:
        r8 = defpackage.arml.f;
        goto L_0x02e7;
    L_0x02e6:
        r8 = 0;
    L_0x02e7:
        r2 = defpackage.ajqy.a(r8);
        r6 = r6.o;
        if (r6 == 0) goto L_0x031e;
    L_0x02ef:
        r8 = r6.a;
        r8 = r8.getResources();
        r8 = r8.getConfiguration();
        r8 = r8.orientation;
        if (r8 != r13) goto L_0x02fe;
    L_0x02fd:
        goto L_0x0319;
    L_0x02fe:
        if (r2 == 0) goto L_0x0319;
    L_0x0300:
        r8 = r6.c;
        if (r8 == 0) goto L_0x0307;
    L_0x0304:
        r6 = r6.d;
        goto L_0x0315;
    L_0x0307:
        r8 = r6.b;
        r8 = r8.inflate();
        r8 = (android.widget.TextView) r8;
        r6.d = r8;
        r6.c = r3;
        r6 = r6.d;
    L_0x0315:
        defpackage.xpr.a(r6, r2);
        goto L_0x031e;
    L_0x0319:
        r2 = r6.b;
        r2.setVisibility(r11);
    L_0x031e:
        r9 = 0;
        goto L_0x03a5;
    L_0x0321:
        r8 = new java.lang.CharSequence[r8];
        r9 = r5.a;
        r9 = r9 & r11;
        if (r9 == 0) goto L_0x032f;
    L_0x0328:
        r9 = r5.e;
        if (r9 != 0) goto L_0x0330;
    L_0x032c:
        r9 = defpackage.arml.f;
        goto L_0x0330;
    L_0x032f:
        r9 = 0;
    L_0x0330:
        r9 = defpackage.ajqy.a(r9);
        r9 = defpackage.fpi.a(r9);
        r8[r4] = r9;
        r9 = r5.a;
        r9 = r9 & 128;
        if (r9 == 0) goto L_0x0347;
    L_0x0340:
        r9 = r5.i;
        if (r9 != 0) goto L_0x0348;
    L_0x0344:
        r9 = defpackage.arml.f;
        goto L_0x0348;
    L_0x0347:
        r9 = 0;
    L_0x0348:
        r9 = defpackage.ajqy.a(r9);
        r9 = defpackage.fpi.a(r9);
        r8[r3] = r9;
        r9 = r5.a;
        r9 = r9 & 256;
        if (r9 == 0) goto L_0x035f;
    L_0x0358:
        r9 = r5.j;
        if (r9 != 0) goto L_0x0360;
    L_0x035c:
        r9 = defpackage.arml.f;
        goto L_0x0360;
    L_0x035f:
        r9 = 0;
    L_0x0360:
        r9 = defpackage.ajqy.a(r9);
        r9 = defpackage.fpi.a(r9);
        r8[r13] = r9;
        r9 = r5.a;
        r9 = r9 & r14;
        if (r9 == 0) goto L_0x0376;
    L_0x036f:
        r9 = r5.v;
        if (r9 != 0) goto L_0x0377;
    L_0x0373:
        r9 = defpackage.arml.f;
        goto L_0x0377;
    L_0x0376:
        r9 = 0;
    L_0x0377:
        r9 = defpackage.ajqy.a(r9);
        r9 = defpackage.fpi.a(r9);
        r8[r12] = r9;
        r9 = r6.f;
        r10 = r6.a;
        r14 = r5.a;
        r14 = r14 & r15;
        if (r14 == 0) goto L_0x0391;
    L_0x038a:
        r14 = r5.w;
        if (r14 != 0) goto L_0x0392;
    L_0x038e:
        r14 = defpackage.ayri.d;
        goto L_0x0392;
    L_0x0391:
        r14 = 0;
    L_0x0392:
        r9 = defpackage.joc.a(r9, r10, r14);
        r9 = defpackage.fpi.a(r9);
        r10 = 4;
        r8[r10] = r9;
        r8 = defpackage.amvj.a(r8);
        r9 = 0;
        r6.a(r9, r8, r2);
    L_0x03a5:
        r2 = r0.q;
        r6 = r5.a;
        r6 = r6 & 64;
        if (r6 == 0) goto L_0x03b4;
    L_0x03ad:
        r8 = r5.g;
        if (r8 != 0) goto L_0x03b5;
    L_0x03b1:
        r8 = defpackage.arml.f;
        goto L_0x03b5;
    L_0x03b4:
        r8 = r9;
    L_0x03b5:
        r6 = defpackage.ajqy.a(r8);
        r8 = r5.a;
        r8 = r8 & 64;
        if (r8 == 0) goto L_0x03c6;
    L_0x03bf:
        r8 = r5.g;
        if (r8 != 0) goto L_0x03c7;
    L_0x03c3:
        r8 = defpackage.arml.f;
        goto L_0x03c7;
    L_0x03c6:
        r8 = r9;
    L_0x03c7:
        r8 = defpackage.ajqy.b(r8);
        r10 = r5.o;
        r14 = new defpackage.ayfu[r4];
        r10 = r10.toArray(r14);
        r10 = (defpackage.ayfu[]) r10;
        r14 = r5.a;
        r14 = r14 & r15;
        if (r14 == 0) goto L_0x03e1;
    L_0x03da:
        r14 = r5.w;
        if (r14 != 0) goto L_0x03e2;
    L_0x03de:
        r14 = defpackage.ayri.d;
        goto L_0x03e2;
    L_0x03e1:
        r14 = r9;
    L_0x03e2:
        r2.a(r6, r8, r10, r14);
        r2 = r0.q;
        r6 = r5.a;
        r8 = 4;
        r6 = r6 & r8;
        if (r6 == 0) goto L_0x03f4;
    L_0x03ed:
        r8 = r5.d;
        if (r8 != 0) goto L_0x03f5;
    L_0x03f1:
        r8 = defpackage.aygk.f;
        goto L_0x03f5;
    L_0x03f4:
        r8 = r9;
    L_0x03f5:
        r6 = r5.a;
        r10 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r6 = r6 & r10;
        if (r6 == 0) goto L_0x03ff;
    L_0x03fc:
        r6 = r5.r;
        goto L_0x0400;
    L_0x03ff:
        r6 = r9;
    L_0x0400:
        r6 = defpackage.akkw.a(r6);
        r2.a(r8, r6);
        r2 = r0.q;
        r2 = r2.n;
        r2.a();
        r2 = r5.o;
        r2 = r2.iterator();
        r6 = 0;
    L_0x0415:
        r8 = r2.hasNext();
        if (r8 == 0) goto L_0x047c;
    L_0x041b:
        r8 = r2.next();
        r8 = (defpackage.ayfu) r8;
        r10 = r8.a;
        r14 = r10 & 8;
        if (r14 == 0) goto L_0x045e;
    L_0x0427:
        r10 = r0.q;
        r8 = r8.e;
        if (r8 != 0) goto L_0x042f;
    L_0x042d:
        r8 = defpackage.ayfi.d;
    L_0x042f:
        r10 = r10.h();
        if (r8 != 0) goto L_0x0436;
    L_0x0435:
        goto L_0x0415;
    L_0x0436:
        r14 = r8.a;
        r14 = r14 & r13;
        if (r14 != 0) goto L_0x043c;
    L_0x043b:
        goto L_0x0415;
    L_0x043c:
        r14 = r10.c;
        if (r14 == 0) goto L_0x0415;
    L_0x0440:
        r14 = r10.a;
        r8 = r8.c;
        if (r8 != 0) goto L_0x0448;
    L_0x0446:
        r8 = defpackage.arwf.c;
    L_0x0448:
        r8 = r8.b;
        r8 = defpackage.arwh.a(r8);
        if (r8 != 0) goto L_0x0452;
    L_0x0450:
        r8 = defpackage.arwh.UNKNOWN;
    L_0x0452:
        r8 = r14.a(r8);
        if (r8 <= 0) goto L_0x0415;
    L_0x0458:
        r10 = r10.c;
        r10.setImageResource(r8);
        goto L_0x0415;
    L_0x045e:
        r10 = r10 & 512;
        if (r10 != 0) goto L_0x0463;
    L_0x0462:
        goto L_0x0415;
    L_0x0463:
        r6 = r0.q;
        r8 = r8.k;
        if (r8 != 0) goto L_0x046b;
    L_0x0469:
        r8 = defpackage.ayfk.d;
    L_0x046b:
        r10 = r0.d;
        r10 = r10.a();
        if (r10 != 0) goto L_0x0476;
    L_0x0473:
        r10 = 8;
        goto L_0x0477;
    L_0x0476:
        r10 = 0;
    L_0x0477:
        r6.a(r8, r10);
        r6 = 1;
        goto L_0x0415;
    L_0x047c:
        r2 = r0.q;
        r8 = r5.o;
        if (r8 == 0) goto L_0x049f;
    L_0x0482:
        r8 = r8.iterator();
    L_0x0486:
        r10 = r8.hasNext();
        if (r10 == 0) goto L_0x049f;
    L_0x048c:
        r10 = r8.next();
        r10 = (defpackage.ayfu) r10;
        r14 = r10.a;
        r14 = r14 & 16384;
        if (r14 == 0) goto L_0x0486;
    L_0x0498:
        r8 = r10.o;
        if (r8 != 0) goto L_0x04a0;
    L_0x049c:
        r8 = defpackage.ayge.c;
        goto L_0x04a0;
    L_0x049f:
        r8 = r9;
    L_0x04a0:
        r2 = r2.y;
        if (r2 == 0) goto L_0x04bd;
    L_0x04a4:
        if (r8 == 0) goto L_0x04b8;
    L_0x04a6:
        r10 = r2.c;
        r8 = r8.b;
        if (r8 != 0) goto L_0x04ae;
    L_0x04ac:
        r8 = defpackage.arml.f;
    L_0x04ae:
        r2 = r2.a;
        r2 = defpackage.aabb.a(r8, r2, r4);
        defpackage.xpr.a(r10, r2);
        goto L_0x04bd;
    L_0x04b8:
        r2 = r2.b;
        r2.setVisibility(r11);
    L_0x04bd:
        if (r6 == 0) goto L_0x04c4;
    L_0x04bf:
        r2 = r0.c;
        r2.a(r0);
    L_0x04c4:
        r2 = r5.z;
        if (r2 != 0) goto L_0x04ca;
    L_0x04c8:
        r2 = defpackage.ayym.c;
    L_0x04ca:
        r2 = r2.a;
        r2 = r2 & r3;
        if (r2 != 0) goto L_0x04d0;
    L_0x04cf:
        goto L_0x050f;
    L_0x04d0:
        r2 = r5.z;
        if (r2 != 0) goto L_0x04d6;
    L_0x04d4:
        r2 = defpackage.ayym.c;
    L_0x04d6:
        defpackage.jxw.a(r1, r2);
        r2 = r0.h;
        r6 = new hnf;
        r8 = r2.a;
        r8 = r8.get();
        r8 = (android.content.Context) r8;
        r8 = defpackage.hnh.a(r8, r3);
        r8 = (android.content.Context) r8;
        r10 = r2.b;
        r10 = r10.get();
        r10 = (defpackage.albv) r10;
        r10 = defpackage.hnh.a(r10, r13);
        r10 = (defpackage.albv) r10;
        r2 = r2.c;
        r2 = r2.get();
        r2 = (defpackage.afpu) r2;
        r2 = defpackage.hnh.a(r2, r12);
        r2 = (defpackage.afpu) r2;
        r6.<init>(r8, r10, r2);
        r2 = r0.q;
        r2.a(r1, r6);
    L_0x050f:
        r2 = r0.f;
        if (r2 == 0) goto L_0x0527;
    L_0x0513:
        r2 = r0.q;
        r6 = new kng;
        r8 = r2.h;
        r10 = r2.c;
        r6.<init>(r5, r8, r10);
        r2.B = r6;
        r6 = r2.h;
        r2 = r2.B;
        r6.setOnTouchListener(r2);
    L_0x0527:
        r2 = r0.q;
        r6 = r5.f;
        if (r6 != 0) goto L_0x052f;
    L_0x052d:
        r6 = defpackage.appu.c;
    L_0x052f:
        r6 = r6.b;
        if (r6 != 0) goto L_0x0535;
    L_0x0533:
        r6 = defpackage.appw.f;
    L_0x0535:
        r6 = r6.a;
        r6 = r6 & r3;
        if (r6 == 0) goto L_0x054d;
    L_0x053a:
        r6 = r5.f;
        if (r6 != 0) goto L_0x0540;
    L_0x053e:
        r6 = defpackage.appu.c;
    L_0x0540:
        r6 = r6.b;
        if (r6 != 0) goto L_0x0546;
    L_0x0544:
        r6 = defpackage.appw.f;
    L_0x0546:
        r8 = r6.b;
        if (r8 != 0) goto L_0x054e;
    L_0x054a:
        r8 = defpackage.aygk.f;
        goto L_0x054e;
    L_0x054d:
        r8 = r9;
    L_0x054e:
        r6 = r5.a;
        r10 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r6 = r6 & r10;
        if (r6 == 0) goto L_0x056e;
    L_0x0555:
        r6 = r5.y;
        if (r6 != 0) goto L_0x055b;
    L_0x0559:
        r6 = defpackage.azes.c;
    L_0x055b:
        r6 = r6.b;
        r6 = defpackage.azeu.a(r6);
        if (r6 == 0) goto L_0x056e;
    L_0x0563:
        r10 = 9;
        if (r6 == r10) goto L_0x0568;
    L_0x0567:
        goto L_0x056e;
    L_0x0568:
        r2 = r2.z;
        r2.setVisibility(r11);
        goto L_0x058b;
    L_0x056e:
        r6 = r2.z;
        if (r8 == 0) goto L_0x0574;
    L_0x0572:
        r10 = 1;
        goto L_0x0575;
    L_0x0574:
        r10 = 0;
    L_0x0575:
        defpackage.xpr.a(r6, r10);
        if (r8 == 0) goto L_0x058b;
    L_0x057a:
        r6 = r2.g;
        r10 = r2.z;
        r6.a(r10, r8);
        r6 = r2.z;
        r8 = new knt;
        r8.<init>(r2, r5);
        r6.setOnClickListener(r8);
    L_0x058b:
        r2 = r0.q;
        r6 = r5.A;
        if (r6 != 0) goto L_0x0593;
    L_0x0591:
        r6 = defpackage.axak.a;
    L_0x0593:
        r6 = defpackage.ajzv.a(r6);
        r8 = r0.i;
        r10 = r0.j;
        r2.a(r6, r1, r8, r10);
        r2 = new akor;
        r2.<init>(r1);
        r6 = r5.q;
        r6 = r6.d();
        r2.b = r6;
        r2 = r0.q;
        r6 = defpackage.knf.b(r5);
        r2.a(r6);
        r2 = r0.q;
        r6 = r5.t;
        if (r6 != 0) goto L_0x05bc;
    L_0x05ba:
        r6 = defpackage.apdx.g;
    L_0x05bc:
        r6 = r6.a;
        r6 = r6 & r3;
        if (r6 != 0) goto L_0x05c3;
    L_0x05c1:
        r8 = r9;
        goto L_0x05cf;
    L_0x05c3:
        r6 = r5.t;
        if (r6 != 0) goto L_0x05c9;
    L_0x05c7:
        r6 = defpackage.apdx.g;
    L_0x05c9:
        r8 = r6.b;
        if (r8 != 0) goto L_0x05cf;
    L_0x05cd:
        r8 = defpackage.aped.g;
    L_0x05cf:
        r2.a(r8);
        r2 = r5.x;
        r6 = new defpackage.apdh[r4];
        r2 = r2.toArray(r6);
        r2 = (defpackage.apdh[]) r2;
        if (r2 == 0) goto L_0x05f4;
    L_0x05de:
        r6 = r2.length;
    L_0x05df:
        if (r4 >= r6) goto L_0x05f4;
    L_0x05e1:
        r8 = r2[r4];
        r10 = r8.a;
        r11 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r10 = r10 & r11;
        if (r10 != 0) goto L_0x05ed;
    L_0x05ea:
        r4 = r4 + 1;
        goto L_0x05df;
    L_0x05ed:
        r8 = r8.q;
        if (r8 != 0) goto L_0x05f5;
    L_0x05f1:
        r8 = defpackage.apdj.c;
        goto L_0x05f5;
    L_0x05f4:
        r8 = r9;
    L_0x05f5:
        r0.k = r8;
        r2 = r0.g;
        r4 = r0.q;
        r4 = r4.p;
        r6 = r0.k;
        r2.a(r4, r6);
        r2 = r0.q;
        r2.a_(r1, r5);
        r2 = r5.m;
        if (r2 != 0) goto L_0x060d;
    L_0x060b:
        r2 = defpackage.auvr.c;
    L_0x060d:
        r2 = r2.a;
        r2 = r2 & r3;
        if (r2 != 0) goto L_0x0614;
    L_0x0612:
        r8 = r9;
        goto L_0x0620;
    L_0x0614:
        r2 = r5.m;
        if (r2 != 0) goto L_0x061a;
    L_0x0618:
        r2 = defpackage.auvr.c;
    L_0x061a:
        r8 = r2.b;
        if (r8 != 0) goto L_0x0620;
    L_0x061e:
        r8 = defpackage.auvn.l;
    L_0x0620:
        if (r8 == 0) goto L_0x0629;
    L_0x0622:
        r2 = r8.j;
        if (r2 != 0) goto L_0x0627;
    L_0x0626:
        goto L_0x0629;
    L_0x0627:
        r4 = r9;
        goto L_0x062a;
    L_0x0629:
        r4 = r8;
    L_0x062a:
        r2 = r0.q;
        r3 = r2.v;
        r6 = r0.e;
        r2 = r2.h;
        r8 = r1.a;
        r1 = r6;
        r6 = r8;
        r1.a(r2, r3, r4, r5, r6);
        r1 = r7 instanceof defpackage.knh;
        if (r1 != 0) goto L_0x0641;
    L_0x063d:
        r1 = r7 instanceof defpackage.knk;
        if (r1 == 0) goto L_0x0653;
    L_0x0641:
        r1 = r0.q;
        r2 = r1.j;
        if (r2 != 0) goto L_0x0648;
    L_0x0647:
        goto L_0x0653;
    L_0x0648:
        r3 = defpackage.ajrc.ROBOTO_MEDIUM;
        r1 = r1.f;
        r1 = r3.a(r1);
        r2.setTypeface(r1);
    L_0x0653:
        r1 = r0.r;
        r2 = r0.q;
        r2 = r2.h;
        r1.addView(r2);
        r1 = r0.r;
        r2 = 2131757003; // 0x7f1007cb float:1.914493E38 double:1.0532279005E-314;
        r1 = r1.findViewById(r2);
        r3 = r1;
        r3 = (android.widget.ViewSwitcher) r3;
        r1 = r0.r;
        r2 = 2131757005; // 0x7f1007cd float:1.9144934E38 double:1.0532279015E-314;
        r1 = r1.findViewById(r2);
        r4 = r1;
        r4 = (android.widget.ViewSwitcher) r4;
        if (r3 == 0) goto L_0x06c7;
    L_0x0676:
        if (r4 == 0) goto L_0x06c7;
    L_0x0678:
        r2 = r0.o;
        r1 = r0.r;
        r5 = 2131757004; // 0x7f1007cc float:1.9144932E38 double:1.053227901E-314;
        r1 = r1.findViewById(r5);
        r5 = r1;
        r5 = (android.widget.ImageView) r5;
        r1 = r0.r;
        r6 = 2131757007; // 0x7f1007cf float:1.9144938E38 double:1.0532279024E-314;
        r1 = r1.findViewById(r6);
        r6 = r1;
        r6 = (android.widget.TextView) r6;
        r7 = 0;
        r1 = r2.a(r3, r4, r5, r6, r7);
        r0.m = r1;
        r1 = r0.s;
        r1 = defpackage.knf.a(r1);
        if (r1 == 0) goto L_0x06c2;
    L_0x06a1:
        r1 = r0.m;
        r2 = r0.s;
        r3 = r2.a;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x06b7;
    L_0x06ac:
        r2 = r2.C;
        if (r2 != 0) goto L_0x06b2;
    L_0x06b0:
        r2 = defpackage.axak.a;
    L_0x06b2:
        r8 = defpackage.ajzv.a(r2);
        goto L_0x06b8;
    L_0x06b7:
        r8 = r9;
    L_0x06b8:
        r2 = defpackage.ajzv.b(r8);
        r2 = (defpackage.aren) r2;
        r1.a(r2);
        goto L_0x06c7;
    L_0x06c2:
        r1 = r0.m;
        r1.d();
    L_0x06c7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knf.a_(akor, java.lang.Object):void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        int i2 = 0;
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ffz.class};
        } else if (i == 0) {
            boolean z = ((ffz) obj).a;
            knq knq = this.q;
            if (knq != null) {
                esw esw = knq.n;
                if (esw != null) {
                    if (!z) {
                        i2 = 8;
                    }
                    if (esw.e) {
                        View view = esw.f;
                        if (view != null && esw.c) {
                            view.setVisibility(i2);
                            return null;
                        }
                    }
                }
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
