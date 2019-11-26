package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: khd */
public final class khd extends jxw implements jhk, jhm {
    private final Resources A = this.f.getResources();
    private final akvo B;
    private final akyy C;
    private final akoj D;
    private final akou E;
    private final xsc F;
    private final akpb G;
    private final View H;
    private final FrameLayout I;
    private final TextView J;
    private final Drawable K;
    private final Drawable L;
    private final fmx M;
    private final hrp N;
    private final Handler O;
    private final float P;
    private View Q;
    private final TextView R;
    private final TextView S;
    private final ImageView T;
    private View U;
    private ViewStub V;
    private Integer W;
    private Integer X;
    private CharSequence Y;
    private xrg Z;
    public final SwipeLayout a;
    private List aa;
    private jhf ab;
    private xrk ac;
    private hro ad;
    public final acxi b;
    public aqwj c;
    public akor d;
    public awlq e;
    private final View z;

    public khd(Context context, akkq akkq, flu flu, aaas aaas, xsc xsc, gal gal, akzb akzb, akvo akvo, akpb akpb, fmx fmx, hmc hmc, hrp hrp, acxi acxi) {
        super(context, akkq, aaas, gal, (akou) flu, (int) R.layout.playlist_video_item, hmc);
        this.E = (akou) amqw.a((Object) flu);
        this.B = (akvo) amqw.a((Object) akvo);
        flu flu2 = flu;
        this.D = new akoj(aaas, (akou) flu, new khc(this));
        this.F = xsc;
        this.G = akpb;
        this.M = fmx;
        this.N = hrp;
        this.b = acxi;
        View view = this.h;
        this.a = (SwipeLayout) view.findViewById(R.id.swipe_layout);
        this.H = view.findViewById(R.id.playlist_video_item);
        this.S = (TextView) view.findViewById(R.id.contributor_name);
        this.T = (ImageView) view.findViewById(R.id.contributor_avatar);
        View findViewById = view.findViewById(R.id.video_info_view);
        this.I = (FrameLayout) findViewById.findViewById(R.id.body_start_container);
        this.J = (TextView) findViewById.findViewById(R.id.index);
        this.R = (TextView) findViewById.findViewById(R.id.offer_button);
        this.z = findViewById.findViewById(R.id.thumbnail_layout);
        findViewById.findViewById(R.id.duration_text);
        this.C = akzb.a(this.R);
        this.V = (ViewStub) view.findViewById(R.id.drag_handle);
        TextView textView = this.i;
        this.P = textView != null ? textView.getTextSize() : 0.0f;
        this.K = this.H.getBackground();
        Context context2 = context;
        this.L = new ColorDrawable(xwe.a(context, R.attr.ytGeneralBackgroundA, 0));
        this.L.setAlpha(this.A.getInteger(R.integer.list_item_dragging_background_alpha));
        this.O = new Handler(Looper.getMainLooper());
    }

    public final View K_() {
        return this.E.a();
    }

    private static int a(View view, int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int marginStart = marginLayoutParams.getMarginStart();
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
        return marginStart;
    }

    public final void a(akot akot, akpk akpk, int i) {
        if (akot == this) {
            this.H.setBackground(this.L);
        }
    }

    public final void a(akot akot, akpk akpk, int i, int i2) {
        if (akot == this) {
            this.H.setBackground(this.K);
        }
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        jhf jhf = this.ab;
        if (jhf != null) {
            jhf.a(jhf.g, (Object) this);
            jhf.a(this.ab.e, (Object) this);
            this.ab.b.remove(this);
            this.ab = null;
        }
        View view = this.U;
        if (view != null) {
            view.setOnTouchListener(null);
            this.U.setOnClickListener(null);
        }
        xrk xrk = this.ac;
        if (xrk != null) {
            xrk.a();
        }
        Integer num = this.W;
        if (num != null) {
            khd.a(this.U, num.intValue());
            this.W = null;
        }
        num = this.X;
        if (num != null) {
            khd.a(this.I, num.intValue());
            this.X = null;
        }
        this.D.a();
        klv.a(this.Z, this.a, this.aa, akpb);
        this.Z = null;
        this.c = null;
        hro hro = this.ad;
        if (hro != null) {
            hro.b.b(hro);
            hro.b.b(hro.d);
            hro.d.b(hro.j);
            hro.c.b(hro.i);
            hro.f.setTextColor(xwe.a(hro.a, R.attr.ytTextSecondary, 0));
            hro.f.setMaxLines(1);
            hro.e.getViewTreeObserver().removeOnGlobalLayoutListener(hro.h);
            xpr.a(hro.e, true);
            xpr.a(hro.g, false);
            hro.k = null;
            hro.l = null;
            this.ad = null;
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setTextSize(0, this.P);
        }
        this.d = null;
        this.e = null;
    }

    private static apeb a(awlq awlq) {
        apdx apdx = awlq.l;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 2) == 0) {
            return null;
        }
        apdx apdx2 = awlq.l;
        if (apdx2 == null) {
            apdx2 = apdx.g;
        }
        apeb apeb = apdx2.c;
        if (apeb == null) {
            apeb = apeb.e;
        }
        return apeb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:234:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x054d  */
    public final /* synthetic */ void a_(defpackage.akor r27, java.lang.Object r28) {
        /*
        r26 = this;
        r6 = r26;
        r7 = r27;
        r15 = r28;
        r15 = (defpackage.awlq) r15;
        r0 = defpackage.khd.a(r15);
        r14 = 1;
        r13 = 0;
        if (r0 == 0) goto L_0x0012;
    L_0x0010:
        r0 = 1;
        goto L_0x0013;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        r6.d = r7;
        r6.e = r15;
        r1 = r15.a;
        r12 = 8;
        r1 = r1 & r12;
        r11 = 0;
        if (r1 == 0) goto L_0x0026;
    L_0x001f:
        r1 = r15.e;
        if (r1 != 0) goto L_0x0027;
    L_0x0023:
        r1 = defpackage.arml.f;
        goto L_0x0027;
    L_0x0026:
        r1 = r11;
    L_0x0027:
        r1 = defpackage.ajqy.a(r1);
        r6.Y = r1;
        r1 = r6.D;
        r2 = r7.a;
        r3 = r15.a;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x003e;
    L_0x0037:
        r3 = r15.i;
        if (r3 != 0) goto L_0x003f;
    L_0x003b:
        r3 = defpackage.apxu.d;
        goto L_0x003f;
    L_0x003e:
        r3 = r11;
    L_0x003f:
        r4 = r27.b();
        r1.a(r2, r3, r4, r6);
        r1 = r7.a;
        r2 = r15.q;
        r2 = r2.d();
        r1.a(r2, r11);
        r10 = new akor;
        r10.<init>(r7);
        r1 = r15.q;
        r1 = r1.d();
        r10.b = r1;
        r1 = r6.b;
        r1 = r1.a(r15);
        if (r1 == 0) goto L_0x0075;
    L_0x0066:
        r1 = r6.b;
        r2 = r7.a;
        r1.a(r2, r15);
        r1 = r6.b;
        r1 = r1.b(r15);
        r10.c = r1;
    L_0x0075:
        r1 = r6.z;
        r1 = r1.getLayoutParams();
        r2 = r6.A;
        r3 = 2131625503; // 0x7f0e061f float:1.8878216E38 double:1.053162931E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r1.width = r2;
        r1 = r15.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x0093;
    L_0x008c:
        r1 = r15.d;
        if (r1 != 0) goto L_0x0094;
    L_0x0090:
        r1 = defpackage.arml.f;
        goto L_0x0094;
    L_0x0093:
        r1 = r11;
    L_0x0094:
        r1 = defpackage.ajqy.a(r1);
        r2 = r6.i;
        r3 = "nested_fragment_key";
        if (r2 == 0) goto L_0x00bb;
    L_0x009e:
        r2 = r7.a(r3, r13);
        if (r2 == 0) goto L_0x00b6;
    L_0x00a4:
        r2 = r6.i;
        r4 = r6.f;
        r4 = r4.getResources();
        r5 = 2131626815; // 0x7f0e0b3f float:1.8880877E38 double:1.053163579E-314;
        r4 = r4.getDimension(r5);
        r2.setTextSize(r13, r4);
    L_0x00b6:
        r2 = r6.i;
        r2.setText(r1);
    L_0x00bb:
        r1 = r15.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x00c8;
    L_0x00c1:
        r1 = r15.f;
        if (r1 != 0) goto L_0x00c9;
    L_0x00c5:
        r1 = defpackage.arml.f;
        goto L_0x00c9;
    L_0x00c8:
        r1 = r11;
    L_0x00c9:
        r1 = defpackage.ajqy.a(r1);
        r2 = r6.f;
        r4 = r6.F;
        r5 = r15.a;
        r8 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r5 = r5 & r8;
        if (r5 == 0) goto L_0x00df;
    L_0x00d8:
        r5 = r15.w;
        if (r5 != 0) goto L_0x00e0;
    L_0x00dc:
        r5 = defpackage.ayri.d;
        goto L_0x00e0;
    L_0x00df:
        r5 = r11;
    L_0x00e0:
        r2 = defpackage.joc.a(r2, r4, r5);
        r6.a(r1, r2, r0);
        r0 = r15.a;
        r1 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x00f5;
    L_0x00ee:
        r0 = r15.t;
        if (r0 != 0) goto L_0x00f6;
    L_0x00f2:
        r0 = defpackage.arml.f;
        goto L_0x00f6;
    L_0x00f5:
        r0 = r11;
    L_0x00f6:
        r0 = defpackage.ajqy.a(r0);
        r1 = r15.r;
        if (r1 != 0) goto L_0x0100;
    L_0x00fe:
        r1 = defpackage.aygk.f;
    L_0x0100:
        if (r0 == 0) goto L_0x010f;
    L_0x0102:
        r2 = r6.T;
        r2.setVisibility(r13);
        r2 = r6.g;
        r4 = r6.T;
        r2.a(r4, r1);
        goto L_0x0114;
    L_0x010f:
        r1 = r6.T;
        r1.setVisibility(r12);
    L_0x0114:
        r1 = r6.S;
        defpackage.xpr.a(r1, r0);
        r0 = r15.a;
        r0 = r0 & 32;
        if (r0 == 0) goto L_0x0126;
    L_0x011f:
        r0 = r15.g;
        if (r0 != 0) goto L_0x0127;
    L_0x0123:
        r0 = defpackage.arml.f;
        goto L_0x0127;
    L_0x0126:
        r0 = r11;
    L_0x0127:
        r0 = defpackage.ajqy.a(r0);
        r1 = r15.a;
        r1 = r1 & 32;
        if (r1 == 0) goto L_0x013c;
    L_0x0131:
        r1 = r15.g;
        if (r1 != 0) goto L_0x0137;
    L_0x0135:
        r1 = defpackage.arml.f;
    L_0x0137:
        r1 = defpackage.ajqy.b(r1);
        goto L_0x013d;
    L_0x013c:
        r1 = r11;
    L_0x013d:
        r2 = r15.v;
        r4 = new defpackage.ayfu[r13];
        r2 = r2.toArray(r4);
        r2 = (defpackage.ayfu[]) r2;
        r4 = r15.a;
        r4 = r4 & r8;
        if (r4 == 0) goto L_0x0153;
    L_0x014c:
        r4 = r15.w;
        if (r4 != 0) goto L_0x0154;
    L_0x0150:
        r4 = defpackage.ayri.d;
        goto L_0x0154;
    L_0x0153:
        r4 = r11;
    L_0x0154:
        r6.a(r0, r1, r2, r4);
        r0 = r15.a;
        r9 = 2;
        r0 = r0 & r9;
        if (r0 == 0) goto L_0x0164;
    L_0x015d:
        r0 = r15.c;
        if (r0 != 0) goto L_0x0165;
    L_0x0161:
        r0 = defpackage.aygk.f;
        goto L_0x0165;
    L_0x0164:
        r0 = r11;
    L_0x0165:
        r6.a(r0);
        r0 = r15.u;
        if (r0 != 0) goto L_0x0174;
    L_0x016c:
        r0 = r6.Q;
        if (r0 == 0) goto L_0x018f;
    L_0x0170:
        r0.setVisibility(r12);
        goto L_0x018f;
    L_0x0174:
        r0 = r6.Q;
        if (r0 == 0) goto L_0x0179;
    L_0x0178:
        goto L_0x018a;
    L_0x0179:
        r0 = r6.h;
        r1 = 2131757008; // 0x7f1007d0 float:1.914494E38 double:1.053227903E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.view.ViewStub) r0;
        r0 = r0.inflate();
        r6.Q = r0;
    L_0x018a:
        r0 = r6.Q;
        r0.setVisibility(r13);
    L_0x018f:
        r0 = r15.k;
        if (r0 != 0) goto L_0x0195;
    L_0x0193:
        r0 = defpackage.apdx.g;
    L_0x0195:
        r0 = r0.a;
        r0 = r0 & r14;
        if (r0 != 0) goto L_0x019c;
    L_0x019a:
        r0 = r11;
        goto L_0x01a8;
    L_0x019c:
        r0 = r15.k;
        if (r0 != 0) goto L_0x01a2;
    L_0x01a0:
        r0 = defpackage.apdx.g;
    L_0x01a2:
        r0 = r0.b;
        if (r0 != 0) goto L_0x01a8;
    L_0x01a6:
        r0 = defpackage.aped.g;
    L_0x01a8:
        r6.a(r0);
        r0 = r15.m;
        if (r0 != 0) goto L_0x01b1;
    L_0x01af:
        r0 = defpackage.aphj.d;
    L_0x01b1:
        r0 = r0.a;
        r0 = r0 & r14;
        if (r0 != 0) goto L_0x01b8;
    L_0x01b6:
        r0 = r11;
        goto L_0x01c4;
    L_0x01b8:
        r0 = r15.m;
        if (r0 != 0) goto L_0x01be;
    L_0x01bc:
        r0 = defpackage.aphj.d;
    L_0x01be:
        r0 = r0.b;
        if (r0 != 0) goto L_0x01c4;
    L_0x01c2:
        r0 = defpackage.aphg.s;
    L_0x01c4:
        r1 = r6.C;
        r2 = r7.a;
        r1.a(r0, r2);
        r0 = r15.j;
        if (r0 != 0) goto L_0x01d1;
    L_0x01cf:
        r0 = defpackage.apdx.g;
    L_0x01d1:
        r0 = r0.a;
        r0 = r0 & 4;
        if (r0 != 0) goto L_0x01d9;
    L_0x01d7:
        r0 = r11;
        goto L_0x01e5;
    L_0x01d9:
        r0 = r15.j;
        if (r0 != 0) goto L_0x01df;
    L_0x01dd:
        r0 = defpackage.apdx.g;
    L_0x01df:
        r0 = r0.d;
        if (r0 != 0) goto L_0x01e5;
    L_0x01e3:
        r0 = defpackage.apdz.e;
    L_0x01e5:
        r6.a(r0);
        r0 = defpackage.khd.a(r15);
        r6.a(r0);
        r0 = r15.v;
        r0 = defpackage.ipo.a(r0);
        r6.a(r0);
        r0 = r6.H;
        r1 = r6.K;
        r0.setBackground(r1);
        r0 = defpackage.jhf.class;
        r1 = "DragReorderCoordinator.PRESENT_CONTEXT_KEY";
        r0 = defpackage.jhf.a(r7, r1, r0);
        r0 = (defpackage.jhf) r0;
        r6.ab = r0;
        r0 = defpackage.akpk.class;
        r1 = "DragReorderCoordinator.DATA_ADAPTER_KEY";
        r0 = defpackage.jhf.a(r7, r1, r0);
        r0 = (defpackage.akpk) r0;
        r1 = r6.ab;
        if (r1 != 0) goto L_0x021b;
    L_0x0219:
        r1 = 0;
        goto L_0x021f;
    L_0x021b:
        if (r0 != 0) goto L_0x021e;
    L_0x021d:
        goto L_0x0219;
    L_0x021e:
        r1 = 1;
    L_0x021f:
        r8 = r7.a(r3, r13);
        r2 = r6.U;
        if (r2 == 0) goto L_0x0228;
    L_0x0227:
        goto L_0x0247;
    L_0x0228:
        if (r1 == 0) goto L_0x037f;
    L_0x022a:
        r1 = r6.V;
        r1 = r1.inflate();
        r2 = 2131757858; // 0x7f100b22 float:1.9146664E38 double:1.053228323E-314;
        r1 = r1.findViewById(r2);
        r6.U = r1;
        r1 = r6.U;
        if (r1 == 0) goto L_0x023f;
    L_0x023d:
        r2 = 1;
        goto L_0x0240;
    L_0x023f:
        r2 = 0;
    L_0x0240:
        r6.V = r11;
        r25 = r2;
        r2 = r1;
        r1 = r25;
    L_0x0247:
        if (r1 == 0) goto L_0x037f;
    L_0x0249:
        r1 = r6.J;
        if (r1 == 0) goto L_0x0250;
    L_0x024d:
        r1.setVisibility(r12);
    L_0x0250:
        r1 = r6.U;
        r1.setVisibility(r13);
        r1 = r6.ab;
        r1 = r1.b;
        r1.put(r6, r0);
        r0 = r6.ab;
        r0.a(r6);
        r0 = r6.ab;
        r0.a(r6);
        r5 = r6.U;
        r4 = new jhr;
        r2 = r6.ab;
        r3 = r6.O;
        r0 = r6.A;
        r1 = 2131820644; // 0x7f110064 float:1.9274009E38 double:1.0532593433E-314;
        r16 = r0.getInteger(r1);
        r0 = r4;
        r1 = r5;
        r17 = r3;
        r3 = r26;
        r9 = r4;
        r4 = r17;
        r11 = r5;
        r5 = r16;
        r0.<init>(r1, r2, r3, r4, r5);
        r11.setOnTouchListener(r9);
        r0 = r6.U;
        r1 = new khf;
        r1.<init>(r6);
        r0.setOnClickListener(r1);
        if (r8 == 0) goto L_0x02bb;
    L_0x0295:
        r0 = r6.I;
        if (r0 != 0) goto L_0x029a;
    L_0x0299:
        goto L_0x02bb;
    L_0x029a:
        r0 = r6.U;
        r1 = r6.A;
        r2 = 2131626072; // 0x7f0e0858 float:1.887937E38 double:1.053163212E-314;
        r1 = r1.getDimensionPixelOffset(r2);
        r0 = defpackage.khd.a(r0, r1);
        r0 = java.lang.Integer.valueOf(r0);
        r6.W = r0;
        r0 = r6.I;
        r0 = defpackage.khd.a(r0, r13);
        r0 = java.lang.Integer.valueOf(r0);
        r6.X = r0;
    L_0x02bb:
        r0 = r6.ac;
        if (r0 != 0) goto L_0x02f5;
    L_0x02bf:
        r0 = new xrk;
        r0.<init>();
        r1 = r6.A;
        r2 = 2131626075; // 0x7f0e085b float:1.8879376E38 double:1.0531632134E-314;
        r1 = r1.getDimensionPixelOffset(r2);
        r2 = r6.A;
        r3 = 2131626076; // 0x7f0e085c float:1.8879378E38 double:1.053163214E-314;
        r2 = r2.getDimensionPixelOffset(r3);
        r3 = r6.A;
        r4 = 2131626074; // 0x7f0e085a float:1.8879374E38 double:1.053163213E-314;
        r3 = r3.getDimensionPixelOffset(r4);
        r4 = r6.A;
        r5 = 2131626073; // 0x7f0e0859 float:1.8879372E38 double:1.0531632124E-314;
        r4 = r4.getDimensionPixelOffset(r5);
        r0.d = r1;
        r0.e = r2;
        r0.f = r3;
        r0.g = r4;
        r0.b();
        r6.ac = r0;
    L_0x02f5:
        r0 = r6.ac;
        r1 = r6.U;
        r2 = r6.H;
        defpackage.amqw.a(r1);
        defpackage.amqw.a(r2);
        if (r1 == r2) goto L_0x0305;
    L_0x0303:
        r3 = 1;
        goto L_0x0306;
    L_0x0305:
        r3 = 0;
    L_0x0306:
        defpackage.amqw.a(r3);
        r3 = r0.b;
        if (r1 != r3) goto L_0x0311;
    L_0x030d:
        r3 = r0.c;
        if (r2 == r3) goto L_0x0322;
    L_0x0311:
        r0.a();
        r0.b = r1;
        r0.c = r2;
        r1 = r0.c;
        r2 = r0.a;
        r1.addOnLayoutChangeListener(r2);
        r0.b();
    L_0x0322:
        r0 = r15.z;
        if (r0 == 0) goto L_0x0327;
    L_0x0326:
        goto L_0x0329;
    L_0x0327:
        r0 = defpackage.axak.a;
    L_0x0329:
        r1 = com.google.protos.youtube.api.innertube.HintRendererOuterClass.hintRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r1 = r1.d;
        r0 = r0.a(r1);
        if (r0 != 0) goto L_0x0343;
    L_0x033c:
        r5 = r10;
        r0 = 0;
        r1 = 0;
        r4 = 8;
    L_0x0341:
        r9 = 1;
        goto L_0x03a0;
    L_0x0343:
        r0 = r15.z;
        if (r0 == 0) goto L_0x0348;
    L_0x0347:
        goto L_0x034a;
    L_0x0348:
        r0 = defpackage.axak.a;
    L_0x034a:
        r1 = com.google.protos.youtube.api.innertube.HintRendererOuterClass.hintRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r2 = r1.d;
        r0 = r0.b(r2);
        if (r0 != 0) goto L_0x0360;
    L_0x035d:
        r0 = r1.b;
        goto L_0x0364;
    L_0x0360:
        r0 = r1.a(r0);
    L_0x0364:
        r9 = r0;
        r9 = (defpackage.aruh) r9;
        r8 = r6.M;
        r0 = r6.U;
        r1 = r7.a;
        r2 = 0;
        r3 = 1;
        r4 = 2;
        r5 = r10;
        r10 = r0;
        r0 = 0;
        r11 = r15;
        r4 = 8;
        r12 = r1;
        r1 = 0;
        r13 = r2;
        r2 = 1;
        r14 = r3;
        r8.a(r9, r10, r11, r12, r13, r14);
        goto L_0x0341;
    L_0x037f:
        r5 = r10;
        r0 = r11;
        r1 = 0;
        r4 = 8;
        r9 = 1;
        if (r2 == 0) goto L_0x038a;
    L_0x0387:
        r2.setVisibility(r4);
    L_0x038a:
        r2 = r6.ac;
        if (r2 == 0) goto L_0x0391;
    L_0x038e:
        r2.a();
    L_0x0391:
        r2 = r6.J;
        if (r2 == 0) goto L_0x03a0;
    L_0x0395:
        if (r8 == 0) goto L_0x039b;
    L_0x0397:
        r2.setVisibility(r4);
        goto L_0x03a0;
    L_0x039b:
        r3 = r6.Y;
        defpackage.xpr.a(r2, r3);
    L_0x03a0:
        r2 = r15.x;
        if (r2 != 0) goto L_0x03a6;
    L_0x03a4:
        r2 = defpackage.awlm.c;
    L_0x03a6:
        r3 = r2.a;
        r8 = 135739233; // 0x8173761 float:4.5505007E-34 double:6.7064092E-316;
        if (r3 != r8) goto L_0x03b2;
    L_0x03ad:
        r2 = r2.b;
        r2 = (defpackage.ayym) r2;
        goto L_0x03b4;
    L_0x03b2:
        r2 = defpackage.ayym.c;
    L_0x03b4:
        r2 = r2.a;
        r2 = r2 & r9;
        if (r2 != 0) goto L_0x03ba;
    L_0x03b9:
        goto L_0x03d1;
    L_0x03ba:
        r2 = r15.x;
        if (r2 != 0) goto L_0x03c0;
    L_0x03be:
        r2 = defpackage.awlm.c;
    L_0x03c0:
        r3 = r2.a;
        if (r3 != r8) goto L_0x03c9;
    L_0x03c4:
        r2 = r2.b;
        r2 = (defpackage.ayym) r2;
        goto L_0x03cb;
    L_0x03c9:
        r2 = defpackage.ayym.c;
    L_0x03cb:
        defpackage.jxw.a(r7, r2);
        r6.a(r7, r0);
    L_0x03d1:
        r2 = r6.ad;
        if (r2 == 0) goto L_0x03d7;
    L_0x03d5:
        goto L_0x0470;
    L_0x03d7:
        r2 = r15.x;
        if (r2 != 0) goto L_0x03dd;
    L_0x03db:
        r2 = defpackage.awlm.c;
    L_0x03dd:
        r3 = r2.a;
        if (r3 != r8) goto L_0x03e6;
    L_0x03e1:
        r2 = r2.b;
        r2 = (defpackage.ayym) r2;
        goto L_0x03e8;
    L_0x03e6:
        r2 = defpackage.ayym.c;
    L_0x03e8:
        r2 = r2.b;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x04bf;
    L_0x03f0:
        r2 = r6.N;
        r3 = r26.K_();
        r10 = new hro;
        r11 = r2.a;
        r11 = r11.get();
        r11 = (android.content.Context) r11;
        r11 = defpackage.hrp.a(r11, r9);
        r17 = r11;
        r17 = (android.content.Context) r17;
        r11 = r2.b;
        r11 = r11.get();
        r11 = (defpackage.zyw) r11;
        r12 = 2;
        r11 = defpackage.hrp.a(r11, r12);
        r18 = r11;
        r18 = (defpackage.zyw) r18;
        r11 = r2.c;
        r11 = r11.get();
        r11 = (defpackage.xci) r11;
        r12 = 3;
        r11 = defpackage.hrp.a(r11, r12);
        r19 = r11;
        r19 = (defpackage.xci) r19;
        r11 = r2.d;
        r12 = r2.e;
        r12 = r12.get();
        r12 = (defpackage.hmj) r12;
        r13 = 5;
        r12 = defpackage.hrp.a(r12, r13);
        r21 = r12;
        r21 = (defpackage.hmj) r21;
        r12 = r2.f;
        r12 = r12.get();
        r12 = (defpackage.hng) r12;
        r13 = 6;
        r12 = defpackage.hrp.a(r12, r13);
        r22 = r12;
        r22 = (defpackage.hng) r22;
        r2 = r2.g;
        r2 = r2.get();
        r2 = (defpackage.ejv) r2;
        r12 = 7;
        r2 = defpackage.hrp.a(r2, r12);
        r23 = r2;
        r23 = (defpackage.ejv) r23;
        r2 = defpackage.hrp.a(r3, r4);
        r24 = r2;
        r24 = (android.view.View) r24;
        r16 = r10;
        r20 = r11;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24);
        r6.ad = r10;
    L_0x0470:
        r2 = r6.ad;
        r3 = r15.x;
        if (r3 != 0) goto L_0x0478;
    L_0x0476:
        r3 = defpackage.awlm.c;
    L_0x0478:
        r4 = r3.a;
        if (r4 != r8) goto L_0x0481;
    L_0x047c:
        r3 = r3.b;
        r3 = (defpackage.ayym) r3;
        goto L_0x0483;
    L_0x0481:
        r3 = defpackage.ayym.c;
    L_0x0483:
        r3 = r3.b;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x04bf;
    L_0x048b:
        r2.k = r15;
        r3 = r15.x;
        if (r3 != 0) goto L_0x0493;
    L_0x0491:
        r3 = defpackage.awlm.c;
    L_0x0493:
        r4 = r3.a;
        if (r4 != r8) goto L_0x049c;
    L_0x0497:
        r3 = r3.b;
        r3 = (defpackage.ayym) r3;
        goto L_0x049e;
    L_0x049c:
        r3 = defpackage.ayym.c;
    L_0x049e:
        r3 = r3.b;
        r2.l = r3;
        r2.a();
        r3 = r2.b;
        r3.a(r2);
        r3 = r2.b;
        r4 = r2.d;
        r3.a(r4);
        r3 = r2.d;
        r4 = r2.j;
        r3.a(r4);
        r3 = r2.c;
        r2 = r2.i;
        r3.a(r2);
    L_0x04bf:
        r2 = defpackage.xrg.class;
        r3 = "SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY";
        r2 = defpackage.akoo.a(r7, r2, r3);
        r2 = (defpackage.xrg) r2;
        r6.Z = r2;
        r2 = new java.util.ArrayList;
        r3 = r15.y;
        r3 = r3.size();
        r2.<init>(r3);
        r3 = r15.y;
        r3 = r3.iterator();
    L_0x04dc:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x04ff;
    L_0x04e2:
        r4 = r3.next();
        r4 = (defpackage.awls) r4;
        if (r4 == 0) goto L_0x04fa;
    L_0x04ea:
        r8 = r4.a;
        r10 = 65153809; // 0x3e22b11 float:1.3292974E-36 double:3.21902587E-316;
        if (r8 != r10) goto L_0x04f7;
    L_0x04f1:
        r4 = r4.b;
        r11 = r4;
        r11 = (defpackage.aphg) r11;
        goto L_0x04fb;
    L_0x04f7:
        r11 = defpackage.aphg.s;
        goto L_0x04fb;
    L_0x04fa:
        r11 = r0;
    L_0x04fb:
        r2.add(r11);
        goto L_0x04dc;
    L_0x04ff:
        r3 = r6.G;
        r4 = r6.Z;
        r8 = r6.a;
        r10 = r0;
        r0 = r27;
        r7 = 0;
        r1 = r15;
        r11 = r5;
        r5 = r8;
        r0 = defpackage.klv.a(r0, r1, r2, r3, r4, r5);
        r6.aa = r0;
        r0 = r6.B;
        r1 = r6.H;
        r2 = r6.v;
        r3 = r15.o;
        if (r3 != 0) goto L_0x051e;
    L_0x051c:
        r3 = defpackage.auvr.c;
    L_0x051e:
        r3 = r3.a;
        r3 = r3 & r9;
        if (r3 != 0) goto L_0x0525;
    L_0x0523:
        r3 = r10;
        goto L_0x0531;
    L_0x0525:
        r3 = r15.o;
        if (r3 != 0) goto L_0x052b;
    L_0x0529:
        r3 = defpackage.auvr.c;
    L_0x052b:
        r3 = r3.b;
        if (r3 != 0) goto L_0x0531;
    L_0x052f:
        r3 = defpackage.auvn.l;
    L_0x0531:
        r5 = r11.a;
        r4 = r15;
        r0.a(r1, r2, r3, r4, r5);
        r0 = r6.E;
        r0.a(r11);
        r0 = r6.R;
        defpackage.xpv.a(r0, r10);
        r0 = r6.R;
        r0.setClickable(r7);
        r0 = r15.a;
        r1 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x0554;
    L_0x054d:
        r11 = r15.A;
        if (r11 != 0) goto L_0x0555;
    L_0x0551:
        r11 = defpackage.aqwj.c;
        goto L_0x0555;
    L_0x0554:
        r11 = r10;
    L_0x0555:
        r6.c = r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khd.a_(akor, java.lang.Object):void");
    }
}
