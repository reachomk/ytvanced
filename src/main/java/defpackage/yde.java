package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.conversation.ui.FacePileView;
import com.google.android.libraries.youtube.conversation.ui.HeartView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: yde */
public abstract class yde implements akmz, akot, yag {
    private static final long a = TimeUnit.DAYS.toMillis(1);
    private final aloz A;
    private int B;
    private int C;
    private int D;
    private View E;
    private FacePileView F;
    private TextView G;
    private aqnl H;
    private ViewGroup I;
    public akor b;
    public final View c = this.i.findViewById(R.id.conversation_user_thumbnail_wrapper);
    public final int d;
    public final int e;
    public final Context f;
    public final aaas g;
    public final akmx h;
    public final ViewGroup i = ((ViewGroup) View.inflate(this.f, R.layout.chat_bubble_item, null));
    public ViewGroup j;
    public Object k;
    public boolean l;
    private final View m;
    private final akkq n;
    private final HeartView o = ((HeartView) this.i.findViewById(R.id.conversation_item_heart));
    private final View p = this.i.findViewById(R.id.conversation_item_error);
    private final TextView q = ((TextView) this.i.findViewById(R.id.chat_item_timestamp));
    private final TextView r = ((TextView) this.i.findViewById(R.id.conversation_reference_user_view));
    private final View s = this.i.findViewById(R.id.conversation_last_item_padding);
    private final yem t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final Rect y;
    private final Rect z;

    public yde(View view, aaas aaas, akkq akkq, ygu ygu, akmx akmx) {
        this.m = (View) amqw.a((Object) view);
        this.f = (Context) amqw.a(view.getContext());
        this.g = (aaas) amqw.a((Object) aaas);
        this.h = (akmx) amqw.a((Object) akmx);
        this.n = (akkq) amqw.a((Object) akkq);
        this.A = new aloz(akkq, (ImageView) this.c.findViewById(R.id.conversation_user_thumbnail));
        this.t = new yem(this.o, ygu, this, akmx);
        this.c.setOnClickListener(new ydf(this));
        this.p.setOnClickListener(new ydd(this));
        this.x = this.f.getResources().getDimensionPixelOffset(R.dimen.conversation_padding);
        this.d = this.f.getResources().getDimensionPixelOffset(R.dimen.conversation_padding_aggregate);
        int dimensionPixelOffset = this.f.getResources().getDimensionPixelOffset(R.dimen.conversation_avatar_size);
        int i = this.x;
        this.v = dimensionPixelOffset + (i + i);
        dimensionPixelOffset = this.f.getResources().getDimensionPixelOffset(R.dimen.conversation_heart_size);
        this.w = dimensionPixelOffset;
        i = this.v;
        this.u = dimensionPixelOffset + i;
        this.e = i;
        this.y = new Rect();
        this.z = new Rect();
    }

    /* Access modifiers changed, original: protected */
    public Object a(Object obj) {
        return obj;
    }

    /* Access modifiers changed, original: protected */
    public void a(Parcelable parcelable) {
    }

    public abstract TextView f();

    /* Access modifiers changed, original: protected */
    public void m() {
    }

    public final View K_() {
        return this.i;
    }

    public void a(akpb akpb) {
        a(false);
        ViewGroup viewGroup = this.I;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0320  */
    public void a_(defpackage.akor r21, java.lang.Object r22) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = defpackage.yde.c(r22);
        r0.k = r2;
        r0.b = r1;
        r2 = r0.b;
        r3 = 1;
        r4 = 0;
        r5 = 0;
        if (r2 == 0) goto L_0x0061;
    L_0x0013:
        r2 = r0.k;
        if (r2 == 0) goto L_0x0061;
    L_0x0017:
        r2 = r20.f();
        r6 = r0.i;
        if (r6 == 0) goto L_0x0021;
    L_0x001f:
        r6 = 1;
        goto L_0x0022;
    L_0x0021:
        r6 = 0;
    L_0x0022:
        defpackage.amqw.b(r6);
        r6 = r0.j;
        if (r6 == 0) goto L_0x002b;
    L_0x0029:
        r6 = 1;
        goto L_0x002c;
    L_0x002b:
        r6 = 0;
    L_0x002c:
        defpackage.amqw.b(r6);
        if (r2 == 0) goto L_0x0033;
    L_0x0031:
        r6 = 1;
        goto L_0x0034;
    L_0x0033:
        r6 = 0;
    L_0x0034:
        defpackage.amqw.b(r6);
        r6 = r0.b;
        r7 = "ConversationItemListener";
        r6 = r6.a(r7);
        r6 = (defpackage.yen) r6;
        if (r6 == 0) goto L_0x0059;
    L_0x0043:
        r7 = r0.k;
        r6 = r6.b(r7);
        if (r6 == 0) goto L_0x0059;
    L_0x004b:
        r6 = r0.j;
        r7 = new ydk;
        r7.<init>(r0);
        r6.setOnLongClickListener(r7);
        r2.setTextIsSelectable(r5);
        goto L_0x0061;
    L_0x0059:
        r6 = r0.j;
        r6.setOnLongClickListener(r4);
        r2.setTextIsSelectable(r3);
    L_0x0061:
        r2 = r0.k;
        r6 = r2 instanceof defpackage.aqoj;
        r7 = 16;
        if (r6 == 0) goto L_0x007a;
    L_0x0069:
        r2 = (defpackage.aqoj) r2;
        r6 = r2.a;
        r6 = r6 & 32;
        if (r6 == 0) goto L_0x0078;
    L_0x0071:
        r2 = r2.g;
        if (r2 != 0) goto L_0x00ba;
    L_0x0075:
        r2 = defpackage.aygk.f;
        goto L_0x00ba;
    L_0x0078:
        r2 = r4;
        goto L_0x00ba;
    L_0x007a:
        r6 = r2 instanceof defpackage.ajtu;
        if (r6 == 0) goto L_0x0083;
    L_0x007e:
        r2 = (defpackage.ajtu) r2;
        r2 = r2.c;
        goto L_0x00ba;
    L_0x0083:
        r6 = r2 instanceof defpackage.aqnr;
        if (r6 == 0) goto L_0x0095;
    L_0x0087:
        r2 = (defpackage.aqnr) r2;
        r6 = r2.a;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0078;
    L_0x008e:
        r2 = r2.f;
        if (r2 != 0) goto L_0x00ba;
    L_0x0092:
        r2 = defpackage.aygk.f;
        goto L_0x00ba;
    L_0x0095:
        r6 = r2 instanceof defpackage.aqnx;
        if (r6 == 0) goto L_0x00a8;
    L_0x0099:
        r2 = (defpackage.aqnx) r2;
        r6 = r2.a;
        r6 = r6 & 32;
        if (r6 == 0) goto L_0x0078;
    L_0x00a1:
        r2 = r2.g;
        if (r2 != 0) goto L_0x00ba;
    L_0x00a5:
        r2 = defpackage.aygk.f;
        goto L_0x00ba;
    L_0x00a8:
        r6 = r2 instanceof defpackage.aqmx;
        if (r6 == 0) goto L_0x0078;
    L_0x00ac:
        r2 = (defpackage.aqmx) r2;
        r6 = r2.a;
        r6 = r6 & 32;
        if (r6 == 0) goto L_0x0078;
    L_0x00b4:
        r2 = r2.g;
        if (r2 != 0) goto L_0x00ba;
    L_0x00b8:
        r2 = defpackage.aygk.f;
    L_0x00ba:
        r0.a(r2);
        r2 = "conversation_id";
        r2 = r1.b(r2);
        r6 = r0.h;
        r6.a(r0);
        r6 = r0.k;
        r6 = defpackage.zcz.f(r6);
        r8 = r20.o();
        if (r8 == 0) goto L_0x00f6;
    L_0x00d4:
        r9 = r0.h;
        r10 = new ycl;
        r11 = r0.k;
        r12 = defpackage.zdb.a(r6);
        r10.<init>(r2, r11, r12);
        r10 = r10.a();
        r9.b(r8, r10);
        r9 = r0.h;
        r8 = r9.a(r8, r0);
        r8 = (defpackage.ycm) r8;
        r9 = r8.h;
        r0.a(r9);
        goto L_0x00f7;
    L_0x00f6:
        r8 = r4;
    L_0x00f7:
        r9 = 8;
        if (r6 == 0) goto L_0x015a;
    L_0x00fb:
        r10 = r0.o;
        r10.setVisibility(r5);
        r10 = r0.t;
        r11 = r0.k;
        r12 = r0.b;
        r12 = r12.a;
        r10.d = r2;
        r10.e = r11;
        r10.f = r6;
        r10.c = r12;
        r13 = r6.i;
        r13 = r13.d();
        r12.a(r13, r4);
        r12 = r10.b;
        r12.a(r10);
        r12 = defpackage.ycp.a(r11);
        r12 = defpackage.zcz.b(r12);
        r13 = android.text.TextUtils.isEmpty(r2);
        if (r13 != 0) goto L_0x014d;
    L_0x012c:
        r13 = android.text.TextUtils.isEmpty(r12);
        if (r13 != 0) goto L_0x014d;
    L_0x0132:
        r12 = defpackage.ycq.a(r2, r12);
        r13 = r10.b;
        r13.a(r12, r10);
        r13 = new ycl;
        r6 = defpackage.zdb.a(r6);
        r13.<init>(r2, r11, r6);
        r2 = r13.a();
        r6 = r10.b;
        r6.b(r12, r2);
    L_0x014d:
        r2 = r0.o;
        r2 = r2.getLayoutParams();
        r2 = (android.widget.FrameLayout.LayoutParams) r2;
        r6 = r0.d;
        r2.topMargin = r6;
        goto L_0x0164;
    L_0x015a:
        r2 = r0.t;
        r2.a(r5, r5);
        r2 = r0.o;
        r2.setVisibility(r9);
    L_0x0164:
        r2 = r0.k;
        r2 = defpackage.zcz.i(r2);
        r0.H = r2;
        r2 = r0.k;
        r10 = defpackage.zcz.d(r2);
        r2 = r0.k;
        r6 = r2 instanceof defpackage.aqoj;
        if (r6 == 0) goto L_0x018a;
    L_0x0178:
        r2 = (defpackage.aqoj) r2;
        r6 = r2.a;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0185;
    L_0x017f:
        r4 = r2.f;
        if (r4 != 0) goto L_0x0185;
    L_0x0183:
        r4 = defpackage.arml.f;
    L_0x0185:
        r4 = defpackage.ajqy.a(r4);
        goto L_0x01e9;
    L_0x018a:
        r6 = r2 instanceof defpackage.aqof;
        if (r6 == 0) goto L_0x019b;
    L_0x018e:
        r2 = (defpackage.aqof) r2;
        r2 = r2.b;
        if (r2 != 0) goto L_0x0196;
    L_0x0194:
        r2 = defpackage.arml.f;
    L_0x0196:
        r4 = defpackage.ajqy.a(r2);
        goto L_0x01e9;
    L_0x019b:
        r6 = r2 instanceof defpackage.ajtu;
        if (r6 == 0) goto L_0x01a8;
    L_0x019f:
        r2 = (defpackage.ajtu) r2;
        r2 = r2.b;
        r4 = defpackage.ajqy.a(r2);
        goto L_0x01e9;
    L_0x01a8:
        r6 = r2 instanceof defpackage.aqnr;
        if (r6 == 0) goto L_0x01be;
    L_0x01ac:
        r2 = (defpackage.aqnr) r2;
        r6 = r2.a;
        r6 = r6 & r9;
        if (r6 == 0) goto L_0x01b9;
    L_0x01b3:
        r4 = r2.e;
        if (r4 != 0) goto L_0x01b9;
    L_0x01b7:
        r4 = defpackage.arml.f;
    L_0x01b9:
        r4 = defpackage.ajqy.a(r4);
        goto L_0x01e9;
    L_0x01be:
        r6 = r2 instanceof defpackage.aqnx;
        if (r6 == 0) goto L_0x01d4;
    L_0x01c2:
        r2 = (defpackage.aqnx) r2;
        r6 = r2.a;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x01cf;
    L_0x01c9:
        r4 = r2.f;
        if (r4 != 0) goto L_0x01cf;
    L_0x01cd:
        r4 = defpackage.arml.f;
    L_0x01cf:
        r4 = defpackage.ajqy.a(r4);
        goto L_0x01e9;
    L_0x01d4:
        r6 = r2 instanceof defpackage.aqmx;
        if (r6 == 0) goto L_0x01e9;
    L_0x01d8:
        r2 = (defpackage.aqmx) r2;
        r6 = r2.a;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x01e5;
    L_0x01df:
        r4 = r2.f;
        if (r4 != 0) goto L_0x01e5;
    L_0x01e3:
        r4 = defpackage.arml.f;
    L_0x01e5:
        r4 = defpackage.ajqy.a(r4);
    L_0x01e9:
        r2 = r0.H;
        r6 = r0.b;
        r12 = "AGGREGATE_TIME_TO_PREVIOUS_ITEM";
        r6 = r6.a(r12, r5);
        r13 = 3;
        if (r6 != 0) goto L_0x0274;
    L_0x01f6:
        r6 = r0.l;
        if (r6 != 0) goto L_0x0274;
    L_0x01fa:
        r14 = 0;
        r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r6 != 0) goto L_0x0201;
    L_0x0200:
        goto L_0x0274;
    L_0x0201:
        r6 = r0.q;
        r6.setVisibility(r5);
        r6 = r0.q;
        r14 = r0.f;
        r15 = java.util.concurrent.TimeUnit.MICROSECONDS;
        r10 = r15.toMillis(r10);
        r15 = defpackage.yde.b(r5);
        r17 = -1;
        r17 = defpackage.yde.b(r17);
        r9 = "%s %s %s";
        r12 = 2131952179; // 0x7f130233 float:1.9540793E38 double:1.05332433E-314;
        r19 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1));
        if (r19 >= 0) goto L_0x0242;
    L_0x0223:
        r15 = new java.lang.Object[r13];
        r7 = android.text.format.DateUtils.formatDateTime(r14, r10, r7);
        r15[r5] = r7;
        r7 = r14.getResources();
        r7 = r7.getString(r12);
        r15[r3] = r7;
        r7 = android.text.format.DateUtils.formatDateTime(r14, r10, r3);
        r10 = 2;
        r15[r10] = r7;
        r7 = java.lang.String.format(r9, r15);
        r12 = 2;
        goto L_0x0270;
    L_0x0242:
        r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1));
        if (r7 >= 0) goto L_0x026b;
    L_0x0246:
        r7 = new java.lang.Object[r13];
        r15 = r14.getResources();
        r13 = 2131952184; // 0x7f130238 float:1.9540804E38 double:1.0533243327E-314;
        r13 = r15.getString(r13);
        r7[r5] = r13;
        r13 = r14.getResources();
        r12 = r13.getString(r12);
        r7[r3] = r12;
        r10 = android.text.format.DateUtils.formatDateTime(r14, r10, r3);
        r12 = 2;
        r7[r12] = r10;
        r7 = java.lang.String.format(r9, r7);
        goto L_0x0270;
    L_0x026b:
        r12 = 2;
        r7 = android.text.format.DateUtils.formatDateTime(r14, r10, r3);
    L_0x0270:
        r6.setText(r7);
        goto L_0x027c;
    L_0x0274:
        r12 = 2;
        r6 = r0.q;
        r7 = 8;
        r6.setVisibility(r7);
    L_0x027c:
        r6 = r0.b;
        r7 = "AGGREGATE_TO_NEXT_ITEM";
        r6 = r6.a(r7, r5);
        if (r6 == 0) goto L_0x0287;
    L_0x0286:
        goto L_0x02a3;
    L_0x0287:
        if (r2 == 0) goto L_0x02a3;
    L_0x0289:
        r2 = r2.b;
        r2 = defpackage.atwm.a(r2);
        if (r2 == 0) goto L_0x0294;
    L_0x0291:
        r6 = 3;
        if (r2 == r6) goto L_0x02a3;
    L_0x0294:
        r2 = r0.l;
        if (r2 != 0) goto L_0x02a3;
    L_0x0298:
        r2 = r0.r;
        r2.setVisibility(r5);
        r2 = r0.r;
        r2.setText(r4);
        goto L_0x02aa;
    L_0x02a3:
        r2 = r0.r;
        r4 = 8;
        r2.setVisibility(r4);
    L_0x02aa:
        r2 = r20.n();
        r4 = r0.j;
        if (r4 == 0) goto L_0x02ba;
    L_0x02b2:
        r6 = new android.graphics.drawable.ColorDrawable;
        r6.<init>(r2);
        r4.setBackground(r6);
    L_0x02ba:
        r4 = r20.j();
        if (r4 == 0) goto L_0x02ce;
    L_0x02c0:
        r4 = 8388661; // 0x800035 float:1.1755018E-38 double:4.144549E-317;
        r0.D = r4;
        r4 = r0.u;
        r0.B = r4;
        r4 = r0.x;
        r0.C = r4;
        goto L_0x02db;
    L_0x02ce:
        r4 = 8388659; // 0x800033 float:1.1755015E-38 double:4.144548E-317;
        r0.D = r4;
        r4 = r0.v;
        r0.B = r4;
        r4 = r0.w;
        r0.C = r4;
    L_0x02db:
        r20.k();
        if (r8 != 0) goto L_0x02e7;
    L_0x02e0:
        r4 = r0.k;
        r4 = defpackage.zcz.j(r4);
        goto L_0x02e9;
    L_0x02e7:
        r4 = r8.j;
    L_0x02e9:
        r6 = r0.k;
        r6 = defpackage.zcz.g(r6);
        r0.a(r4, r2, r6);
        r2 = r0.H;
        if (r2 == 0) goto L_0x0301;
    L_0x02f6:
        r2 = r2.b;
        r2 = defpackage.atwm.a(r2);
        if (r2 == 0) goto L_0x02ff;
    L_0x02fe:
        goto L_0x0302;
    L_0x02ff:
        r2 = 1;
        goto L_0x0302;
    L_0x0301:
        r2 = 2;
    L_0x0302:
        r4 = r0.j;
        if (r4 == 0) goto L_0x032d;
    L_0x0306:
        r6 = r4 instanceof com.google.android.libraries.youtube.conversation.ui.ConversationRoundedLinearLayout;
        if (r6 == 0) goto L_0x032d;
    L_0x030a:
        r4 = (com.google.android.libraries.youtube.conversation.ui.ConversationRoundedLinearLayout) r4;
        r6 = r0.b;
        if (r6 == 0) goto L_0x031b;
    L_0x0310:
        r8 = "AGGREGATE_USER_TO_PREVIOUS_ITEM";
        r6 = r6.a(r8, r5);
        if (r6 != 0) goto L_0x0319;
    L_0x0318:
        goto L_0x031b;
    L_0x0319:
        r6 = 1;
        goto L_0x031c;
    L_0x031b:
        r6 = 0;
    L_0x031c:
        r8 = r0.b;
        if (r8 == 0) goto L_0x0329;
    L_0x0320:
        r7 = r8.a(r7, r5);
        if (r7 != 0) goto L_0x0327;
    L_0x0326:
        goto L_0x0329;
    L_0x0327:
        r7 = 1;
        goto L_0x032a;
    L_0x0329:
        r7 = 0;
    L_0x032a:
        r4.a(r6, r7, r2);
    L_0x032d:
        r2 = r0.s;
        r4 = "isLastItem";
        r1 = r1.a(r4, r5);
        if (r1 == 0) goto L_0x0341;
    L_0x0337:
        r1 = r0.r;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x0340;
    L_0x033f:
        goto L_0x0341;
    L_0x0340:
        r5 = 1;
    L_0x0341:
        defpackage.xpr.a(r2, r5);
        r1 = r0.y;
        r1.setEmpty();
        r1 = r0.z;
        r1.setEmpty();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yde.a_(akor, java.lang.Object):void");
    }

    public final void a(Uri uri, Uri uri2) {
        akmw a = this.h.a(uri);
        if (a == null) {
            this.h.a((akmz) this);
            return;
        }
        ycm ycm = (ycm) a;
        a(ycm.h);
        a(ycm.j, n(), ycm.d);
    }

    public final void b(Object obj) {
        this.b.a("IS_HEARTING_UPDATE", Boolean.valueOf(true));
        a_(this.b, a(obj));
    }

    /* Access modifiers changed, original: protected|final */
    public final View a(int i) {
        View.inflate(this.f, i, (ViewGroup) this.i.findViewById(R.id.chat_main_container));
        this.j = (ViewGroup) this.i.findViewById(R.id.chat_bubble_content);
        this.E = this.j.findViewById(R.id.conversation_facepile_container);
        if (this.E != null) {
            this.F = (FacePileView) this.j.findViewById(R.id.conversation_facepile);
            this.F.a = this.n;
            this.G = (TextView) this.j.findViewById(R.id.overflow_text);
            this.E.setOnClickListener(new ydi(this));
        } else {
            this.F = null;
            this.G = null;
        }
        return this.j;
    }

    /* Access modifiers changed, original: protected */
    public void a(aygk aygk) {
        if (aygk == null || this.b.a("AGGREGATE_USER_TO_PREVIOUS_ITEM", false)) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        layoutParams.gravity = 8388659;
        this.c.setLayoutParams(layoutParams);
        b(aygk);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(aygk aygk) {
        this.A.a(aygk);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean e() {
        return abe.g(this.m) == 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean g() {
        akor akor = this.b;
        if (akor != null) {
            yen yen = (yen) akor.a("ConversationItemListener");
            if (yen != null && yen.a(this.k)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final int h() {
        if (e()) {
            return this.B;
        }
        return this.C;
    }

    /* Access modifiers changed, original: protected|final */
    public final int i() {
        if (e()) {
            return this.C;
        }
        return this.B;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean j() {
        aqnl aqnl = this.H;
        if (aqnl != null) {
            int a = atwm.a(aqnl.b);
            if (a != 0 && a == 3) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void k() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.topMargin = this.d;
        layoutParams.leftMargin = h();
        layoutParams.rightMargin = i();
        a(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LayoutParams layoutParams) {
        layoutParams.gravity = this.D;
        this.j.setLayoutParams(layoutParams);
    }

    public final ViewGroup l() {
        if (this.I == null) {
            ViewStub viewStub = (ViewStub) this.i.findViewById(R.id.rvr_stub);
            if (viewStub != null) {
                this.I = (ViewGroup) viewStub.inflate();
            }
            ViewGroup viewGroup = this.I;
            if (viewGroup != null) {
                RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.related_video_replies_items);
                recyclerView.a(new ans(0, false));
                recyclerView.a(new ydj(this.f.getResources().getDimensionPixelOffset(R.dimen.related_video_divider_space), e()));
                recyclerView.a(new ydh(this));
                this.I.findViewById(R.id.close_rvr_button).setOnClickListener(new ydg(this));
                this.I.setVisibility(8);
            }
        }
        return this.I;
    }

    /* Access modifiers changed, original: protected|final */
    public final int n() {
        Object obj = this.k;
        if (obj == null) {
            return xwe.a(this.f, R.attr.ytBrandBackgroundSolid, 0);
        }
        aqnl i = zcz.i(obj);
        if (i == null) {
            return xwe.a(this.f, R.attr.ytBrandBackgroundSolid, 0);
        }
        int a = aqmg.a(i.d);
        if (a != 0 && a == 4) {
            return xwe.a(this.f, R.attr.ytStaticBlue, 0);
        }
        a = aqmg.a(i.d);
        if (a != 0 && a == 2) {
            return xwe.a(this.f, R.attr.ytGeneralBackgroundC, 0);
        }
        a = aqmg.a(i.d);
        if (a != 0 && a == 3) {
            return xwe.a(this.f, R.attr.ytBrandBackgroundSolid, 0);
        }
        if (TextUtils.isEmpty(i.c)) {
            return xwe.a(this.f, R.attr.ytBrandBackgroundSolid, 0);
        }
        return Color.parseColor(i.c);
    }

    public final Uri o() {
        akor akor = this.b;
        if (akor != null) {
            String b = akor.b("conversation_id");
            String b2 = zcz.b(this.k);
            if (!(TextUtils.isEmpty(b) || TextUtils.isEmpty(b2))) {
                return ycq.a(b, b2);
            }
        }
        return null;
    }

    private final void a(aqmz aqmz, int i, boolean z) {
        View view = this.E;
        if (!(view == null || this.F == null)) {
            view.setVisibility(8);
            if (aqmz != null) {
                CharSequence a;
                Object obj = aqmz.b.size() <= 0 ? null : 1;
                arml arml;
                if (z) {
                    arml = aqmz.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    a = ajqy.a(arml);
                } else {
                    arml = aqmz.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    a = ajqy.a(arml);
                }
                if (z || obj != null) {
                    FacePileView facePileView = this.F;
                    int i2 = aqmz.e;
                    ArrayList arrayList = new ArrayList(aqmz.b);
                    if (z) {
                        i2--;
                    }
                    while (arrayList.size() > i2) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                    if (z) {
                        int i3 = aqmz.g ? aqmz.h : 0;
                        Object obj2 = aqmz.f;
                        if (obj2 == null) {
                            obj2 = aygk.f;
                        }
                        arrayList.add(i3, obj2);
                    }
                    facePileView.a(arrayList, i);
                    this.E.setVisibility(0);
                }
                if (this.G != null) {
                    if (TextUtils.isEmpty(a) || obj == null) {
                        this.G.setText(null);
                    } else {
                        this.G.setText(a);
                        this.E.setVisibility(0);
                    }
                }
            }
        }
    }

    private final void a(boolean z) {
        if (z) {
            this.p.setVisibility(0);
            this.o.setVisibility(8);
            this.j.setAlpha(0.3f);
            return;
        }
        this.p.setVisibility(8);
        Object obj = this.k;
        if (obj == null || zcz.f(yde.c(obj)) == null) {
            this.o.setVisibility(8);
        } else {
            this.o.setVisibility(0);
        }
        this.j.setAlpha(1.0f);
    }

    public static Object c(Object obj) {
        if (obj instanceof ycp) {
            return ((ycp) obj).a;
        }
        if (obj instanceof ycs) {
            obj = ((ycs) obj).a;
        }
        return obj;
    }

    private static long b(int i) {
        Calendar instance = Calendar.getInstance();
        instance.set(10, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis() + (((long) i) * a);
    }
}
