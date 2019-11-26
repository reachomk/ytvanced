package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ilf */
public final class ilf implements akot, xcp {
    private final etb A;
    private final List B;
    private final flj C;
    private final ViewGroup D;
    private final TextView E = ((TextView) this.D.findViewById(R.id.playlist_title));
    private final TextView F = ((TextView) this.D.findViewById(R.id.playlist_subtitle));
    private final TextView G = ((TextView) this.D.findViewById(R.id.playlist_channel));
    private final TextView H = ((TextView) this.D.findViewById(R.id.playlist_tvshow_metadata));
    private final LinearLayout I = ((LinearLayout) this.D.findViewById(R.id.sub_header_row));
    private final TextView J = ((TextView) this.D.findViewById(R.id.playlist_size));
    private final ImageView K = ((ImageView) this.D.findViewById(R.id.share_button));
    private final ImageView L = ((ImageView) this.D.findViewById(R.id.edit_button));
    private final ImageView M = ((ImageView) this.D.findViewById(R.id.shuffle_button));
    private final ImageView N = ((ImageView) this.D.findViewById(R.id.private_playlist_indicator));
    private final ImageView O = ((ImageView) this.D.findViewById(R.id.hero_image));
    private final ImageView P = ((ImageView) this.D.findViewById(R.id.channel_avatar));
    private final OfflineArrowView Q = ((OfflineArrowView) this.D.findViewById(R.id.offline_button));
    private final ViewGroup R = ((ViewGroup) this.D.findViewById(R.id.sort_playlist_container));
    private final OnLayoutChangeListener S;
    private final TextView T = ((TextView) this.D.findViewById(R.id.playlist_description));
    private final FrameLayout U = ((FrameLayout) this.D.findViewById(R.id.primary_button_container));
    private final ViewStub V = ((ViewStub) this.D.findViewById(R.id.metadata_badge));
    private final TextView W = ((TextView) this.D.findViewById(R.id.action_button));
    private final TextView X = ((TextView) this.D.findViewById(R.id.offline_sync_button));
    private final FrameLayout Y = ((FrameLayout) this.D.findViewById(R.id.footer));
    private final PlaylistHeaderActionBarView Z = ((PlaylistHeaderActionBarView) this.D.findViewById(R.id.actions_bar));
    public final aaas a;
    private final fap aa;
    private ese ab;
    private hnb ac;
    public final ezd b;
    public final ezd c;
    public final LinearLayout d = ((LinearLayout) this.D.findViewById(R.id.playlist_data));
    public final TextView e = ((TextView) this.D.findViewById(R.id.seasons));
    public final View f = this.D.findViewById(R.id.expand_button);
    public final TextView g = ((TextView) this.D.findViewById(R.id.primary_button_label));
    public ajxx h;
    public apxu i;
    public Boolean j;
    private final Activity k;
    private final xci l;
    private final akkq m;
    private final fhu n;
    private final akyu o;
    private final esh p;
    private final akvp q;
    private final eki r;
    private final hpt s;
    private final bcaa t;
    private final acxi u;
    private final hna v;
    private final ekg w;
    private final int x;
    private final akyy y;
    private final akyy z;

    public ilf(Activity activity, xci xci, akkq akkq, aaas aaas, iml iml, fhu fhu, esh esh, etd etd, akzb akzb, akyz akyz, akvp akvp, eki eki, hpt hpt, ahcd ahcd, bcaa bcaa, fll fll, acxi acxi, hna hna, ekg ekg, fas fas) {
        aaas aaas2 = aaas;
        fhu fhu2 = fhu;
        akzb akzb2 = akzb;
        this.k = activity;
        this.l = xci;
        this.m = akkq;
        this.a = aaas2;
        this.n = fhu2;
        this.p = esh;
        this.q = akvp;
        this.r = eki;
        this.s = hpt;
        this.t = bcaa;
        this.u = acxi;
        this.v = hna;
        this.w = ekg;
        this.D = (ViewGroup) View.inflate(activity, R.layout.playlist_header, null);
        this.aa = fas.a(this.k, this.V);
        fhu.a(this.D.findViewById(R.id.like_button));
        this.y = akzb2.a(this.W);
        this.z = akzb2.a(this.g);
        this.C = fll.a((FloatingActionButton) this.D.findViewById(R.id.playlist_fab));
        iml iml2 = iml;
        this.K.setOnClickListener(new ili(this, aaas, iml));
        this.L.setOnClickListener(new ilh(this, aaas));
        this.X.setOnClickListener(new ilk(this, ahcd));
        this.o = akyz.a(this.M);
        Resources resources = activity.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.x = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        this.A = etd.a(this.D.findViewById(R.id.toggle_button_icon));
        this.b = new ezd(this.E, resources.getInteger(R.integer.playlist_header_title_lines_collapsed), resources.getInteger(R.integer.playlist_header_title_lines_expanded));
        this.c = new ezd(this.T, resources.getInteger(R.integer.playlist_header_description_lines_collapsed), resources.getInteger(R.integer.playlist_header_description_lines_expanded));
        this.S = new ilm(this, new ilj(this));
        this.T.addOnLayoutChangeListener(this.S);
        this.E.addOnLayoutChangeListener(this.S);
        this.B = new ArrayList();
    }

    public final View K_() {
        return this.D;
    }

    private final void a(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.getMarginStart();
            marginLayoutParams.setMarginStart(this.k.getResources().getDimensionPixelSize(i));
            this.B.add(new ilr(view, amqp.b(Integer.valueOf(marginStart)), ampo.a));
        }
    }

    public final int b() {
        return this.r.a(this.h.a) ? ((agwc) this.t.get()).b().n().i(this.h.a) : 0;
    }

    public final void c() {
        View view = this.f;
        boolean z = true;
        if (!(this.b.b() || this.c.b())) {
            z = false;
        }
        xpr.a(view, z);
        view = this.f;
        float f = 180.0f;
        if (!(this.b.d || this.c.d)) {
            f = 360.0f;
        }
        view.setRotation(f);
    }

    private final void c(ajxx ajxx) {
        xpr.a(this.J, ajqy.a(ajxx.d));
    }

    private final void d(ajxx ajxx) {
        aphj aphj = ajxx.s;
        if (aphj == null || (aphj.a & 2) == 0) {
            this.A.a(null);
            return;
        }
        aphv aphv = aphj.c;
        if (aphv == null) {
            aphv = aphv.s;
        }
        this.A.a(aphv);
    }

    private final void e(ajxx ajxx) {
        fff ffh;
        awih awih = ajxx.v;
        if (awih != null) {
            artk artk = awih.b;
            if (artk == null) {
                artk = artk.f;
            }
            ffh = new ffh(artk);
        } else {
            ffh = null;
        }
        this.C.a(ffh);
    }

    public static boolean a(ajxx ajxx) {
        awir awir = ajxx.h;
        return awir != null && awir.b;
    }

    public static boolean b(ajxx ajxx) {
        awip awip = ajxx.t;
        if (awip != null) {
            aphg aphg = awip.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 4096) != 0) {
                return true;
            }
        }
        return false;
    }

    private final void d() {
        CharSequence quantityString;
        int b = b();
        TextView textView = this.X;
        if (b > 0) {
            quantityString = this.k.getResources().getQuantityString(R.plurals.download_new_videos_button_text, b, new Object[]{Integer.valueOf(b)});
        } else {
            quantityString = null;
        }
        xpr.a(textView, quantityString);
        this.ac.a();
    }

    public final void a(akpb akpb) {
        this.l.b(this);
        for (ilr ilr : this.B) {
            if (ilr.b.a()) {
                LayoutParams layoutParams = ilr.a.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    ((MarginLayoutParams) layoutParams).setMarginStart(((Integer) ilr.b.b()).intValue());
                }
            }
            if (ilr.c.a()) {
                ilr.a.setPaddingRelative(((Integer) ilr.c.b()).intValue(), ilr.a.getPaddingTop(), ilr.a.getPaddingEnd(), ilr.a.getPaddingBottom());
            }
        }
        this.B.clear();
        this.ac = null;
        this.j = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04f0  */
    public final /* synthetic */ void a_(defpackage.akor r18, java.lang.Object r19) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r2 = (defpackage.ajxx) r2;
        r3 = r0.l;
        r3.a(r0);
        r3 = r0.h;
        r0.h = r2;
        r10 = r1.a;
        r4 = r0.b;
        r4.a();
        r4 = r0.c;
        r4.a();
        r11 = 0;
        r4 = "nested_fragment_key";
        r4 = r1.a(r4, r11);
        if (r4 == 0) goto L_0x0078;
    L_0x0026:
        r4 = r0.d;
        r5 = r4.getPaddingStart();
        r6 = r0.k;
        r6 = r6.getResources();
        r7 = 2131626842; // 0x7f0e0b5a float:1.8880932E38 double:1.0531635924E-314;
        r6 = r6.getDimensionPixelSize(r7);
        r8 = r4.getPaddingTop();
        r9 = r4.getPaddingEnd();
        r12 = r4.getPaddingBottom();
        r4.setPaddingRelative(r6, r8, r9, r12);
        r6 = r0.B;
        r8 = new ilr;
        r9 = defpackage.ampo.a;
        r5 = java.lang.Integer.valueOf(r5);
        r5 = defpackage.amqp.b(r5);
        r8.<init>(r4, r9, r5);
        r6.add(r8);
        r4 = r0.Z;
        r5 = 2131626082; // 0x7f0e0862 float:1.887939E38 double:1.053163217E-314;
        r0.a(r4, r5);
        r4 = r0.H;
        r0.a(r4, r7);
        r4 = r0.T;
        r0.a(r4, r7);
        r4 = r0.W;
        r0.a(r4, r7);
        r4 = r0.Y;
        r0.a(r4, r7);
    L_0x0078:
        r4 = r0.O;
        r4 = r4.getLayoutParams();
        r5 = r0.h;
        r5 = r5.r;
        r12 = 0;
        if (r5 != 0) goto L_0x0087;
    L_0x0085:
        r5 = r12;
        goto L_0x008d;
    L_0x0087:
        r5 = r5.b;
        if (r5 != 0) goto L_0x008d;
    L_0x008b:
        r5 = defpackage.awkp.d;
    L_0x008d:
        r6 = r4 instanceof android.view.ViewGroup.MarginLayoutParams;
        r13 = 8;
        r14 = 1;
        if (r6 != 0) goto L_0x0095;
    L_0x0094:
        goto L_0x00c0;
    L_0x0095:
        if (r5 == 0) goto L_0x00c0;
    L_0x0097:
        r6 = r5.a;
        r6 = r6 & r14;
        if (r6 == 0) goto L_0x00c0;
    L_0x009c:
        r6 = r0.O;
        r6.setVisibility(r11);
        r4 = (android.view.ViewGroup.MarginLayoutParams) r4;
        r6 = r5.c;
        r7 = r0.x;
        r7 = (float) r7;
        r7 = r7 * r6;
        r6 = (int) r7;
        r4.height = r6;
        r6 = r0.O;
        r6.setLayoutParams(r4);
        r4 = r0.m;
        r6 = r0.O;
        r5 = r5.b;
        if (r5 != 0) goto L_0x00bc;
    L_0x00ba:
        r5 = defpackage.aygk.f;
    L_0x00bc:
        r4.a(r6, r5);
        goto L_0x00c5;
    L_0x00c0:
        r4 = r0.O;
        r4.setVisibility(r13);
    L_0x00c5:
        r4 = r0.P;
        r5 = r0.h;
        r5 = r5.C;
        if (r5 == 0) goto L_0x00cf;
    L_0x00cd:
        r5 = 1;
        goto L_0x00d0;
    L_0x00cf:
        r5 = 0;
    L_0x00d0:
        defpackage.xpr.a(r4, r5);
        r4 = r0.m;
        r5 = r0.P;
        r6 = r0.h;
        r6 = r6.C;
        r4.a(r5, r6);
        r4 = r0.h;
        r4 = r4.z;
        if (r4 != 0) goto L_0x00e6;
    L_0x00e4:
        r4 = r12;
        goto L_0x00f1;
    L_0x00e6:
        r5 = r4.a;
        r5 = r5 & r14;
        if (r5 == 0) goto L_0x00e4;
    L_0x00eb:
        r4 = r4.b;
        if (r4 != 0) goto L_0x00f1;
    L_0x00ef:
        r4 = defpackage.aphg.s;
    L_0x00f1:
        r5 = r0.y;
        r5.a(r4, r10);
        r4 = r0.h;
        r4 = r4.F;
        if (r4 == 0) goto L_0x0105;
    L_0x00fc:
        r5 = defpackage.aphg.class;
        r4 = defpackage.ajzv.a(r4, r5);
        r4 = (defpackage.aphg) r4;
        goto L_0x0106;
    L_0x0105:
        r4 = r12;
    L_0x0106:
        r5 = r0.z;
        r5.a(r4, r10);
        r4 = r0.U;
        r5 = r0.g;
        r5 = r5.getVisibility();
        r4.setVisibility(r5);
        r4 = r0.U;
        r5 = r0.g;
        r5 = r5.isClickable();
        r4.setClickable(r5);
        r4 = r0.U;
        r5 = r0.g;
        r5 = r5.isEnabled();
        r4.setEnabled(r5);
        r4 = r0.U;
        r5 = r0.g;
        r5 = r5.getContentDescription();
        r4.setContentDescription(r5);
        r4 = r0.g;
        r4.setClickable(r11);
        r4 = r0.g;
        r4.setContentDescription(r12);
        r4 = r0.g;
        r4 = r4.getBackground();
        r5 = r0.g;
        r5.setBackground(r12);
        r5 = r0.U;
        r5.setBackground(r4);
        r4 = r0.U;
        r5 = new ilq;
        r5.<init>(r0);
        r4.setOnClickListener(r5);
        r4 = r0.h;
        r15 = r4.a;
        r9 = r0.v;
        r8 = r0.Q;
        r4 = r4.m;
        r5 = 60572968; // 0x39c4528 float:9.184733E-37 double:2.99270226E-316;
        if (r4 == 0) goto L_0x017c;
    L_0x016a:
        r6 = r4.a;
        if (r6 != r5) goto L_0x0173;
    L_0x016e:
        r4 = r4.b;
        r4 = (defpackage.avsj) r4;
        goto L_0x0175;
    L_0x0173:
        r4 = defpackage.avsj.h;
    L_0x0175:
        r4 = r4.b;
        if (r4 != 0) goto L_0x017a;
    L_0x0179:
        goto L_0x017c;
    L_0x017a:
        r7 = 1;
        goto L_0x017d;
    L_0x017c:
        r7 = 0;
    L_0x017d:
        r4 = r0.w;
        r6 = r0.h;
        r6 = r6.m;
        if (r6 != 0) goto L_0x0187;
    L_0x0185:
        r6 = r12;
        goto L_0x0192;
    L_0x0187:
        r12 = r6.a;
        if (r12 != r5) goto L_0x0191;
    L_0x018b:
        r5 = r6.b;
        r5 = (defpackage.avsj) r5;
        r6 = r5;
        goto L_0x0192;
    L_0x0191:
        r6 = 0;
    L_0x0192:
        r12 = new ill;
        r12.<init>(r0);
        r5 = new ilo;
        r5.<init>(r0);
        r16 = r5;
        r5 = r15;
        r11 = r7;
        r7 = r12;
        r12 = r8;
        r8 = r16;
        r13 = r9;
        r9 = r10;
        r4 = r4.a(r5, r6, r7, r8, r9);
        r4 = r13.a(r15, r12, r11, r4);
        r0.ac = r4;
        r4 = r0.r;
        r4 = r4.a(r15);
        if (r4 == 0) goto L_0x01c8;
    L_0x01b8:
        r4 = r0.s;
        r5 = r0.k;
        r6 = new ilu;
        r6.<init>(r0, r15);
        r5 = defpackage.wxc.a(r5, r6);
        r4.a(r15, r5);
    L_0x01c8:
        r4 = r0.h;
        if (r4 == r3) goto L_0x0206;
    L_0x01cc:
        r3 = r4.i;
        if (r3 != 0) goto L_0x01d2;
    L_0x01d0:
        r12 = 0;
        goto L_0x01e6;
    L_0x01d2:
        r4 = r3.a;
        r4 = r4 & r14;
        if (r4 == 0) goto L_0x01d0;
    L_0x01d7:
        r3 = r3.b;
        if (r3 != 0) goto L_0x01dd;
    L_0x01db:
        r3 = defpackage.atzr.p;
    L_0x01dd:
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r12 = r3;
        r12 = (defpackage.atzq) r12;
    L_0x01e6:
        r3 = r0.n;
        r3.a(r12);
        if (r12 == 0) goto L_0x0206;
    L_0x01ed:
        r3 = r0.h;
        r4 = r3.i;
        r4 = r4.toBuilder();
        r4 = (defpackage.anxo) r4;
        r4 = (defpackage.atzs) r4;
        r4.a(r12);
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.atzt) r4;
        r3.i = r4;
    L_0x0206:
        r3 = r0.V;
        r4 = 8;
        r3.setVisibility(r4);
        r3 = r0.h;
        r3 = r3.G;
        if (r3 == 0) goto L_0x023b;
    L_0x0213:
        r4 = r3.length;
        if (r4 > 0) goto L_0x0217;
    L_0x0216:
        goto L_0x023b;
    L_0x0217:
        r5 = 0;
    L_0x0218:
        if (r5 >= r4) goto L_0x023b;
    L_0x021a:
        r6 = r3[r5];
        r7 = defpackage.auxa.class;
        r7 = defpackage.ajzv.b(r6, r7);
        if (r7 == 0) goto L_0x0238;
    L_0x0224:
        r3 = r0.aa;
        r4 = defpackage.auxa.class;
        r4 = defpackage.ajzv.a(r6, r4);
        r4 = (defpackage.auxa) r4;
        r3.a(r4);
        r3 = r0.V;
        r4 = 0;
        r3.setVisibility(r4);
        goto L_0x023b;
    L_0x0238:
        r5 = r5 + 1;
        goto L_0x0218;
    L_0x023b:
        r3 = r0.E;
        r4 = r0.h;
        r4 = r4.b;
        r4 = defpackage.ajqy.a(r4);
        defpackage.xpr.a(r3, r4);
        r3 = r0.T;
        r4 = r0.h;
        r4 = r4.e;
        r5 = 0;
        r4 = defpackage.ajqy.a(r5, r4, r14, r5);
        defpackage.xpr.a(r3, r4);
        r3 = r0.F;
        r4 = r0.h;
        r4 = r4.A;
        r4 = defpackage.ajqy.a(r4);
        defpackage.xpr.a(r3, r4);
        r3 = r0.H;
        r4 = r0.h;
        r4 = r4.B;
        r4 = defpackage.ajqy.a(r4);
        defpackage.xpr.a(r3, r4);
        r3 = r0.G;
        r4 = r0.h;
        r4 = r4.f;
        r4 = defpackage.ajqy.a(r4);
        defpackage.xpr.a(r3, r4);
        r3 = r0.h;
        r4 = r3.u;
        if (r4 == 0) goto L_0x02e0;
    L_0x0283:
        r4 = r4.a;
        if (r4 != 0) goto L_0x0288;
    L_0x0287:
        goto L_0x02e0;
    L_0x0288:
        r4 = r4.b;
        r4 = r4.size();
        if (r4 == 0) goto L_0x02e0;
    L_0x0290:
        r4 = r3.u;
        r4 = r4.a;
        r4 = r4.b;
        r6 = new eqf;
        r7 = r0.k;
        r6.<init>(r7);
        r7 = 0;
    L_0x029e:
        r8 = r4.size();
        if (r7 >= r8) goto L_0x02da;
    L_0x02a4:
        r8 = r4.get(r7);
        r8 = (defpackage.aqyb) r8;
        r8 = r8.g;
        if (r8 != 0) goto L_0x02b0;
    L_0x02ae:
        r8 = defpackage.aqyj.f;
    L_0x02b0:
        r9 = r8.a;
        r9 = r9 & r14;
        if (r9 == 0) goto L_0x02bc;
    L_0x02b5:
        r12 = r8.d;
        if (r12 != 0) goto L_0x02bd;
    L_0x02b9:
        r12 = defpackage.arml.f;
        goto L_0x02bd;
    L_0x02bc:
        r12 = r5;
    L_0x02bd:
        r9 = defpackage.ajqy.a(r12);
        r11 = r8.e;
        if (r11 != 0) goto L_0x02c6;
    L_0x02c5:
        goto L_0x02cb;
    L_0x02c6:
        r11 = r0.e;
        defpackage.xpr.a(r11, r9);
    L_0x02cb:
        r11 = r9.toString();
        r12 = new ilp;
        r12.<init>(r0, r9, r8);
        r6.a(r11, r12);
        r7 = r7 + 1;
        goto L_0x029e;
    L_0x02da:
        r4 = r0.e;
        defpackage.eqm.a(r6, r4, r3);
        goto L_0x02e6;
    L_0x02e0:
        r3 = r0.e;
        r4 = 0;
        defpackage.xpr.a(r3, r4);
    L_0x02e6:
        r3 = r0.R;
        r3.removeAllViews();
        r2 = r2.w;
        if (r2 == 0) goto L_0x02fc;
    L_0x02ef:
        r3 = r2.a;
        r4 = 76818770; // 0x4942952 float:3.483258E-36 double:3.7953515E-316;
        if (r3 != r4) goto L_0x02fc;
    L_0x02f6:
        r2 = r2.b;
        r12 = r2;
        r12 = (defpackage.axqn) r12;
        goto L_0x02fd;
    L_0x02fc:
        r12 = r5;
    L_0x02fd:
        r2 = r0.R;
        r3 = 8;
        r2.setVisibility(r3);
        if (r12 == 0) goto L_0x032f;
    L_0x0306:
        r2 = r0.ab;
        if (r2 != 0) goto L_0x031a;
    L_0x030a:
        r2 = r0.p;
        r3 = r0.D;
        r4 = 2131035091; // 0x7f0503d3 float:1.7680718E38 double:1.0528712285E-314;
        r6 = 2131035092; // 0x7f0503d4 float:1.768072E38 double:1.052871229E-314;
        r2 = r2.a(r3, r4, r6);
        r0.ab = r2;
    L_0x031a:
        r2 = r0.ab;
        r2.a_(r1, r12);
        r2 = r0.ab;
        r2 = r2.c;
        r3 = r0.R;
        r4 = -2;
        r3.addView(r2, r4, r4);
        r2 = r0.R;
        r3 = 0;
        r2.setVisibility(r3);
    L_0x032f:
        r2 = r0.h;
        r2 = defpackage.ilf.b(r2);
        if (r2 != 0) goto L_0x0342;
    L_0x0337:
        r2 = r0.h;
        r2 = defpackage.ilf.a(r2);
        if (r2 == 0) goto L_0x0340;
    L_0x033f:
        goto L_0x0342;
    L_0x0340:
        r2 = 0;
        goto L_0x0343;
    L_0x0342:
        r2 = 1;
    L_0x0343:
        r3 = r0.K;
        if (r2 != 0) goto L_0x034a;
    L_0x0347:
        r2 = 8;
        goto L_0x034b;
    L_0x034a:
        r2 = 0;
    L_0x034b:
        r3.setVisibility(r2);
        r2 = r0.h;
        r2 = r2.j;
        r2 = r2.ordinal();
        if (r2 == 0) goto L_0x03bc;
    L_0x0358:
        if (r2 == r14) goto L_0x039f;
    L_0x035a:
        r3 = 2;
        if (r2 != r3) goto L_0x037a;
    L_0x035d:
        r2 = r0.N;
        r3 = 2130839122; // 0x7f020652 float:1.7283246E38 double:1.052774407E-314;
        r2.setImageResource(r3);
        r2 = r0.N;
        r3 = 0;
        r2.setVisibility(r3);
        r2 = r0.N;
        r3 = r0.k;
        r4 = 2131951766; // 0x7f130096 float:1.9539956E38 double:1.053324126E-314;
        r3 = r3.getString(r4);
        r2.setContentDescription(r3);
        goto L_0x03d8;
    L_0x037a:
        r1 = new java.lang.IllegalArgumentException;
        r2 = r0.h;
        r2 = r2.j;
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 24;
        r4.<init>(r3);
        r3 = "Unknown privacy status: ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        r1.<init>(r2);
        throw r1;
    L_0x039f:
        r2 = r0.N;
        r3 = 2130839226; // 0x7f0206ba float:1.7283457E38 double:1.0527744584E-314;
        r2.setImageResource(r3);
        r2 = r0.N;
        r3 = 0;
        r2.setVisibility(r3);
        r2 = r0.N;
        r4 = r0.k;
        r6 = 2131951763; // 0x7f130093 float:1.953995E38 double:1.0533241247E-314;
        r4 = r4.getString(r6);
        r2.setContentDescription(r4);
        goto L_0x03d8;
    L_0x03bc:
        r3 = 0;
        r2 = r0.N;
        r4 = 2130839132; // 0x7f02065c float:1.7283266E38 double:1.052774412E-314;
        r2.setImageResource(r4);
        r2 = r0.N;
        r2.setVisibility(r3);
        r2 = r0.N;
        r3 = r0.k;
        r4 = 2131951762; // 0x7f130092 float:1.9539948E38 double:1.053324124E-314;
        r3 = r3.getString(r4);
        r2.setContentDescription(r3);
    L_0x03d8:
        r2 = r0.h;
        r0.d(r2);
        r2 = r0.h;
        r0.e(r2);
        r2 = r0.h;
        r0.c(r2);
        r2 = r0.h;
        r2 = r2.q;
        r0.i = r2;
        r2 = r0.L;
        r3 = r0.i;
        if (r3 == 0) goto L_0x0409;
    L_0x03f3:
        r4 = com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r4 = r4.d;
        r3 = r3.a(r4);
        if (r3 != 0) goto L_0x0407;
    L_0x0406:
        goto L_0x0409;
    L_0x0407:
        r3 = 0;
        goto L_0x040b;
    L_0x0409:
        r3 = 8;
    L_0x040b:
        r2.setVisibility(r3);
        r2 = r0.h;
        r2 = r2.E;
        if (r2 == 0) goto L_0x047a;
    L_0x0414:
        r3 = defpackage.aphg.class;
        r2 = defpackage.ajzv.a(r2, r3);
        r2 = (defpackage.aphg) r2;
        r3 = r2.a;
        r3 = r3 & 16;
        if (r3 != 0) goto L_0x0423;
    L_0x0422:
        goto L_0x0472;
    L_0x0423:
        r3 = r0.q;
        r4 = r2.e;
        if (r4 != 0) goto L_0x042b;
    L_0x0429:
        r4 = defpackage.arwf.c;
    L_0x042b:
        r4 = r4.b;
        r4 = defpackage.arwh.a(r4);
        if (r4 != 0) goto L_0x0435;
    L_0x0433:
        r4 = defpackage.arwh.UNKNOWN;
    L_0x0435:
        r3 = r3.a(r4);
        if (r3 == 0) goto L_0x0472;
    L_0x043b:
        r3 = r0.M;
        r4 = r0.q;
        r6 = r2.e;
        if (r6 != 0) goto L_0x0445;
    L_0x0443:
        r6 = defpackage.arwf.c;
    L_0x0445:
        r6 = r6.b;
        r6 = defpackage.arwh.a(r6);
        if (r6 != 0) goto L_0x044f;
    L_0x044d:
        r6 = defpackage.arwh.UNKNOWN;
    L_0x044f:
        r4 = r4.a(r6);
        r3.setImageResource(r4);
        r3 = new java.util.HashMap;
        r3.<init>();
        r4 = java.lang.Boolean.valueOf(r14);
        r6 = "START_SHUFFLED";
        r3.put(r6, r4);
        r4 = r0.o;
        r1 = r1.a;
        r4.a(r2, r1, r3);
        r1 = r0.M;
        r2 = 0;
        r1.setVisibility(r2);
        goto L_0x0481;
    L_0x0472:
        r1 = r0.M;
        r2 = 8;
        r1.setVisibility(r2);
        goto L_0x0481;
    L_0x047a:
        r2 = 8;
        r1 = r0.M;
        r1.setVisibility(r2);
    L_0x0481:
        r2 = r5;
        r3 = r2;
        r1 = 0;
    L_0x0484:
        r4 = r0.I;
        r4 = r4.getChildCount();
        if (r1 >= r4) goto L_0x04d2;
    L_0x048c:
        r4 = r0.I;
        r4 = r4.getChildAt(r1);
        r6 = r4.getId();
        r7 = 2131755768; // 0x7f1002f8 float:1.9142425E38 double:1.0532272903E-314;
        if (r6 == r7) goto L_0x04b0;
    L_0x049b:
        r6 = r4.getVisibility();
        if (r6 == 0) goto L_0x04a2;
    L_0x04a1:
        goto L_0x04a5;
    L_0x04a2:
        if (r2 != 0) goto L_0x04a7;
    L_0x04a4:
        r3 = r4;
    L_0x04a5:
        r6 = 0;
        goto L_0x04ad;
    L_0x04a7:
        r6 = 0;
        r2.setVisibility(r6);
        r3 = r4;
        r2 = r5;
    L_0x04ad:
        r7 = 8;
        goto L_0x04cf;
    L_0x04b0:
        r6 = 0;
        if (r3 != 0) goto L_0x04b6;
    L_0x04b3:
        r7 = 8;
        goto L_0x04cc;
    L_0x04b6:
        r7 = r0.I;
        r7 = r7.getChildCount();
        r7 = r7 + -1;
        if (r1 == r7) goto L_0x04b3;
    L_0x04c0:
        if (r2 == 0) goto L_0x04c8;
    L_0x04c2:
        r7 = 8;
        r2.setVisibility(r7);
        goto L_0x04ca;
    L_0x04c8:
        r7 = 8;
    L_0x04ca:
        r2 = r4;
        goto L_0x04cf;
    L_0x04cc:
        r4.setVisibility(r7);
    L_0x04cf:
        r1 = r1 + 1;
        goto L_0x0484;
    L_0x04d2:
        r7 = 8;
        if (r2 == 0) goto L_0x04d9;
    L_0x04d6:
        r2.setVisibility(r7);
    L_0x04d9:
        r17.d();
        r1 = r0.T;
        r2 = new iln;
        r2.<init>(r0);
        r1.post(r2);
        r1 = r0.u;
        r2 = r0.h;
        r1 = r1.a(r2);
        if (r1 == 0) goto L_0x04f7;
    L_0x04f0:
        r1 = r0.u;
        r2 = r0.h;
        r1.a(r10, r2);
    L_0x04f7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilf.a_(akor, java.lang.Object):void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        switch (i) {
            case -1:
                clsArr = new Class[]{fie.class, abgi.class, agkx.class, agla.class, agkz.class, aglb.class, agle.class, agld.class, aglg.class};
                break;
            case 0:
                fie fie = (fie) obj;
                ajxx ajxx = this.h;
                if (ajxx != null && TextUtils.equals(ajxx.a, fie.a)) {
                    fhu fhu = this.n;
                    if (fhu != null) {
                        fhu.a(fie.b);
                        return null;
                    }
                }
                break;
            case 1:
                ajxv ajxv = ((abgi) obj).a.a;
                if (ajxv != null) {
                    ajxx ajxx2 = ajxv.a;
                    d(ajxx2);
                    e(ajxx2);
                    c(ajxx2);
                    return null;
                }
                break;
            case 2:
                if (((agkx) obj).a.equals(this.h.a)) {
                    d();
                    return null;
                }
                break;
            case 3:
                if (((agla) obj).a.equals(this.h.a)) {
                    d();
                    return null;
                }
                break;
            case 4:
                if (((agkz) obj).a.equals(this.h.a)) {
                    d();
                    return null;
                }
                break;
            case 5:
                if (((aglb) obj).a.a().equals(this.h.a)) {
                    d();
                    return null;
                }
                break;
            case 6:
                if (((agle) obj).a.equals(this.h.a)) {
                    d();
                    return null;
                }
                break;
            case 7:
                if (((agld) obj).a.a().equals(this.h.a)) {
                    d();
                    return null;
                }
                break;
            case 8:
                if (((aglg) obj).a.equals(this.h.a)) {
                    d();
                    return null;
                }
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
