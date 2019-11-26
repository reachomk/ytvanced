package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;

/* renamed from: jxa */
public abstract class jxa implements akot {
    public final Context a;
    public final View b;
    public final TextView c = ((TextView) this.b.findViewById(R.id.channel_name));
    public final WrappingTextView d = ((WrappingTextView) this.b.findViewById(R.id.channel_byline));
    public Object e;
    private final eus f;
    private final eso g;
    private final akoj h;
    private final akkq i;
    private final akko j;
    private final akou k;
    private final akvo l;
    private final Runnable m;
    private final TextView n = ((TextView) this.b.findViewById(R.id.video_count));
    private final TextView o = ((TextView) this.b.findViewById(R.id.subscriber_count));
    private final ImageView p = ((ImageView) this.b.findViewById(R.id.channel_avatar));
    private final View q = this.b.findViewById(R.id.contextual_menu_anchor);
    private final View r = this.b.findViewById(R.id.channel_subscribe_button_container);
    private boolean s;
    private TextView t;

    public jxa(Context context, akkq akkq, flu flu, akop akop, akvo akvo, est est, eur eur) {
        this.a = (Context) amqw.a((Object) context);
        this.i = (akkq) amqw.a((Object) akkq);
        this.k = (akou) amqw.a((Object) flu);
        this.l = akvo;
        this.b = LayoutInflater.from(context).inflate(R.layout.compact_channel_item, null);
        this.j = akkq.a().g().a((int) R.drawable.missing_avatar).a();
        TextView textView = (TextView) this.b.findViewById(R.id.subscribe_button);
        this.f = eur.a(this.b.findViewById(R.id.subscription_notification_view));
        this.g = est.a(textView, this.f);
        if (flu.b == null) {
            flu.a(this.b);
        }
        this.h = akop.a(flu);
        this.m = new jxd(this);
    }

    public abstract apxu a(Object obj);

    public abstract void a(Object obj, axwa axwa);

    public abstract axwa b(Object obj);

    public abstract CharSequence c(Object obj);

    public abstract CharSequence d(Object obj);

    public abstract CharSequence e(Object obj);

    public abstract CharSequence f(Object obj);

    public abstract CharSequence g(Object obj);

    public abstract aygk h(Object obj);

    public abstract apdh[] i(Object obj);

    public abstract auvr j(Object obj);

    public abstract byte[] k(Object obj);

    public final View K_() {
        return this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100  */
    public void a_(defpackage.akor r12, java.lang.Object r13) {
        /*
        r11 = this;
        r11.e = r13;
        r0 = r12.a;
        r1 = r11.k(r13);
        r2 = 0;
        r0.a(r1, r2);
        r0 = r11.c;
        r1 = r11.c(r13);
        r0.setText(r1);
        r0 = r11.b(r13);
        r1 = r12.a;
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 0;
        r5 = 26;
        if (r3 >= r5) goto L_0x002b;
    L_0x0022:
        r3 = r11.a;
        r3 = defpackage.xrn.b(r3);
        if (r3 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x0064;
    L_0x002b:
        if (r0 == 0) goto L_0x0064;
    L_0x002d:
        r0 = r11.a(r0, r1);
        r11.a(r13, r0);
        r0 = r11.d;
        r1 = r11.e(r13);
        r3 = r11.g(r13);
        r1 = defpackage.jxa.a(r1, r3);
        r0.a(r1);
        r0 = r11.d;
        r1 = r11.m;
        r0.post(r1);
        r0 = r11.n;
        defpackage.xpr.a(r0, r4);
        r0 = r11.o;
        defpackage.xpr.a(r0, r4);
        r0 = r11.d;
        r1 = r0.a;
        r1 = r1.isEmpty();
        r1 = r1 ^ 1;
        defpackage.xpr.a(r0, r1);
        goto L_0x007e;
    L_0x0064:
        r11.a(r2, r1);
        r0 = r11.n;
        r1 = r11.f(r13);
        defpackage.xpr.a(r0, r1);
        r0 = r11.o;
        r1 = r11.d(r13);
        defpackage.xpr.a(r0, r1);
        r0 = r11.d;
        defpackage.xpr.a(r0, r4);
    L_0x007e:
        r0 = r11.i;
        r1 = r11.p;
        r3 = r11.h(r13);
        r5 = r11.j;
        r0.a(r1, r3, r5);
        r0 = r11.i(r13);
        r1 = r0.length;
        r3 = 0;
    L_0x0091:
        if (r3 >= r1) goto L_0x00a5;
    L_0x0093:
        r5 = r0[r3];
        r6 = r5.a;
        r6 = r6 & 2;
        if (r6 != 0) goto L_0x009e;
    L_0x009b:
        r3 = r3 + 1;
        goto L_0x0091;
    L_0x009e:
        r0 = r5.c;
        if (r0 != 0) goto L_0x00a6;
    L_0x00a2:
        r0 = defpackage.apdn.d;
        goto L_0x00a6;
    L_0x00a5:
        r0 = r2;
    L_0x00a6:
        if (r0 == 0) goto L_0x00bb;
    L_0x00a8:
        r1 = r0.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x00b5;
    L_0x00ae:
        r0 = r0.b;
        if (r0 != 0) goto L_0x00b6;
    L_0x00b2:
        r0 = defpackage.arml.f;
        goto L_0x00b6;
    L_0x00b5:
        r0 = r2;
    L_0x00b6:
        r0 = defpackage.ajqy.a(r0);
        goto L_0x00bc;
    L_0x00bb:
        r0 = r2;
    L_0x00bc:
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x00df;
    L_0x00c2:
        r1 = r11.t;
        if (r1 != 0) goto L_0x00d9;
    L_0x00c6:
        r1 = r11.b;
        r3 = 2131756107; // 0x7f10044b float:1.9143112E38 double:1.053227458E-314;
        r1 = r1.findViewById(r3);
        r1 = (android.view.ViewStub) r1;
        r1 = r1.inflate();
        r1 = (android.widget.TextView) r1;
        r11.t = r1;
    L_0x00d9:
        r1 = r11.t;
        defpackage.xpr.a(r1, r0);
        goto L_0x00e6;
    L_0x00df:
        r0 = r11.t;
        if (r0 == 0) goto L_0x00e6;
    L_0x00e3:
        defpackage.xpr.a(r0, r4);
    L_0x00e6:
        r10 = r12.a;
        r0 = r11.j(r13);
        r5 = r11.l;
        r6 = r11.b;
        r7 = r11.q;
        if (r0 != 0) goto L_0x00f6;
    L_0x00f4:
        r8 = r2;
        goto L_0x0103;
    L_0x00f6:
        r1 = r0.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x00f4;
    L_0x00fc:
        r2 = r0.b;
        if (r2 != 0) goto L_0x00f4;
    L_0x0100:
        r2 = defpackage.auvn.l;
        goto L_0x00f4;
    L_0x0103:
        r9 = r13;
        r5.a(r6, r7, r8, r9, r10);
        r0 = r11.k;
        r0.a(r12);
        r0 = r11.h;
        r1 = r12.a;
        r13 = r11.a(r13);
        r12 = r12.b();
        r0.a(r1, r13, r12);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxa.a_(akor, java.lang.Object):void");
    }

    public static amul a(CharSequence charSequence, CharSequence charSequence2) {
        amuo a = amul.a(2);
        if (!TextUtils.isEmpty(charSequence)) {
            a.c(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            a.c(charSequence2);
        }
        return a.a();
    }

    private final axwa a(axwa axwa, acvx acvx) {
        View b;
        if (axwa != null) {
            axwd axwd = (axwd) ((anxo) axwa.toBuilder());
            evj.a(this.a, axwd, this.c.getText());
            axwa = (axwa) ((anxl) axwd.build());
        }
        this.g.a(axwa, acvx);
        boolean z = true;
        if (!this.s) {
            b = this.f.b();
            if (b != null) {
                int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_vertical_padding);
                int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_horizontal_padding);
                int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notification_bell_min_size) - dimensionPixelOffset2;
                b.setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, 0, dimensionPixelOffset);
                if (b instanceof TextView) {
                    TextView textView = (TextView) b;
                    if (textView.getMinWidth() > dimensionPixelSize) {
                        textView.setMinWidth(dimensionPixelSize);
                    }
                }
                if (b.getMinimumWidth() > dimensionPixelSize) {
                    b.setMinimumWidth(dimensionPixelSize);
                }
                this.s = true;
            }
        }
        b = this.r;
        if (axwa == null) {
            z = false;
        }
        xpr.a(b, z);
        return axwa;
    }

    public final void a(akpb akpb) {
        this.h.a();
        this.g.a();
    }
}
