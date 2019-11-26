package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* renamed from: wsp */
public final class wsp extends akpl {
    private final akkq a;
    private final aaas b;
    private final akvp c;
    private final ViewGroup d;
    private final CardView e = ((CardView) this.d.findViewById(R.id.card_view));
    private final FixedAspectRatioFrameLayout f = ((FixedAspectRatioFrameLayout) this.e.findViewById(R.id.header_container));
    private final akyy g;
    private final akyy h;
    private final xom i;
    private final View j = this.f.findViewById(R.id.header_scrim);
    private final ImageView k = ((ImageView) this.f.findViewById(R.id.header_image));
    private final TextView l = ((TextView) this.e.findViewById(R.id.title));
    private final TextView m = ((TextView) this.e.findViewById(R.id.description));
    private final TextView n = ((TextView) this.e.findViewById(R.id.additional_info));
    private final TextView o = ((TextView) this.e.findViewById(R.id.primary_button));
    private final TextView p = ((TextView) this.e.findViewById(R.id.secondary_button));
    private final ImageView q = ((ImageView) this.f.findViewById(R.id.logo));

    public wsp(Context context, akkq akkq, aaas aaas, akvp akvp, akzb akzb, ViewGroup viewGroup) {
        this.a = akkq;
        this.b = aaas;
        this.c = akvp;
        this.d = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.subscription_product_upsell_offer_card, viewGroup, false);
        this.g = akzb.a(this.o);
        this.h = akzb.a(this.p);
        this.i = xop.a(this.j);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.d;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018a  */
    public final /* synthetic */ void a(defpackage.akor r10, java.lang.Object r11) {
        /*
        r9 = this;
        r11 = (defpackage.axyb) r11;
        r0 = r9.f;
        r1 = r11.a;
        r1 = r1 & 8;
        r2 = 0;
        if (r1 == 0) goto L_0x0012;
    L_0x000b:
        r1 = r11.d;
        if (r1 != 0) goto L_0x0013;
    L_0x000f:
        r1 = defpackage.aygk.f;
        goto L_0x0013;
    L_0x0012:
        r1 = r2;
    L_0x0013:
        r1 = defpackage.aklb.g(r1);
        r0.a = r1;
        r0 = r9.a;
        r1 = r9.k;
        r3 = r11.a;
        r3 = r3 & 8;
        if (r3 == 0) goto L_0x002a;
    L_0x0023:
        r3 = r11.d;
        if (r3 != 0) goto L_0x002b;
    L_0x0027:
        r3 = defpackage.aygk.f;
        goto L_0x002b;
    L_0x002a:
        r3 = r2;
    L_0x002b:
        r0.a(r1, r3);
        r0 = r9.i;
        r1 = r11.e;
        r3 = 1;
        r4 = 0;
        if (r1 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0082;
    L_0x0037:
        r5 = r1.isEmpty();
        if (r5 != 0) goto L_0x0082;
    L_0x003d:
        r5 = r0.b;
        if (r5 != 0) goto L_0x004f;
    L_0x0041:
        r5 = new android.graphics.drawable.GradientDrawable;
        r5.<init>();
        r0.b = r5;
        r5 = r0.a;
        r6 = r0.b;
        r5.setBackground(r6);
    L_0x004f:
        r5 = r1.size();
        if (r5 != r3) goto L_0x006f;
    L_0x0055:
        r5 = r0.c;
        if (r5 != 0) goto L_0x005e;
    L_0x0059:
        r5 = 2;
        r5 = new int[r5];
        r0.c = r5;
    L_0x005e:
        r5 = r0.c;
        r1 = r1.get(r4);
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r5[r3] = r1;
        r5[r4] = r1;
        goto L_0x0075;
    L_0x006f:
        r1 = defpackage.anhe.a(r1);
        r0.c = r1;
    L_0x0075:
        r1 = r0.b;
        r5 = r0.c;
        r1.setColors(r5);
        r0 = r0.a;
        defpackage.xpr.a(r0, r3);
        goto L_0x0087;
    L_0x0082:
        r0 = r0.a;
        defpackage.xpr.a(r0, r4);
    L_0x0087:
        r0 = r11.b;
        r1 = 9;
        if (r0 != r1) goto L_0x00ce;
    L_0x008d:
        r0 = r11.c;
        r0 = (defpackage.aygk) r0;
        r5 = defpackage.aklb.c(r0);
        if (r5 == 0) goto L_0x00b9;
    L_0x0097:
        r6 = r9.q;
        r6 = r6.getLayoutParams();
        r7 = r5.c;
        r5 = r5.d;
        r7 = r7 / r5;
        r5 = (float) r7;
        r7 = r6.height;
        r7 = (float) r7;
        r5 = r5 * r7;
        r5 = (int) r5;
        r6.width = r5;
        r5 = r9.a;
        r7 = r6.width;
        r8 = r6.height;
        r5.a(r0, r7, r8);
        r0 = r9.q;
        r0.setLayoutParams(r6);
    L_0x00b9:
        r0 = r9.a;
        r5 = r9.q;
        r6 = r11.b;
        if (r6 != r1) goto L_0x00c6;
    L_0x00c1:
        r6 = r11.c;
        r6 = (defpackage.aygk) r6;
        goto L_0x00c8;
    L_0x00c6:
        r6 = defpackage.aygk.f;
    L_0x00c8:
        r7 = defpackage.akko.h;
        r0.a(r5, r6, r7);
        goto L_0x00ee;
    L_0x00ce:
        r5 = 10;
        if (r0 != r5) goto L_0x00ee;
    L_0x00d2:
        r0 = r9.c;
        r5 = r11.c;
        r5 = (defpackage.arwf) r5;
        r5 = r5.b;
        r5 = defpackage.arwh.a(r5);
        if (r5 != 0) goto L_0x00e2;
    L_0x00e0:
        r5 = defpackage.arwh.UNKNOWN;
    L_0x00e2:
        r0 = r0.a(r5);
        if (r0 == 0) goto L_0x00ef;
    L_0x00e8:
        r5 = r9.q;
        r5.setImageResource(r0);
        goto L_0x00ef;
    L_0x00ee:
        r0 = 0;
    L_0x00ef:
        r5 = r9.q;
        r6 = r11.b;
        if (r6 != r1) goto L_0x00f6;
    L_0x00f5:
        goto L_0x00fa;
    L_0x00f6:
        if (r0 == 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x00fa;
    L_0x00f9:
        r3 = 0;
    L_0x00fa:
        defpackage.xpr.a(r5, r3);
        r0 = r9.l;
        r1 = r11.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x010c;
    L_0x0105:
        r1 = r11.f;
        if (r1 != 0) goto L_0x010d;
    L_0x0109:
        r1 = defpackage.arml.f;
        goto L_0x010d;
    L_0x010c:
        r1 = r2;
    L_0x010d:
        r3 = r9.b;
        r1 = defpackage.aabb.a(r1, r3, r4);
        defpackage.xpr.a(r0, r1);
        r0 = r9.m;
        r1 = r11.a;
        r3 = 32;
        r1 = r1 & r3;
        if (r1 == 0) goto L_0x0126;
    L_0x011f:
        r1 = r11.g;
        if (r1 != 0) goto L_0x0127;
    L_0x0123:
        r1 = defpackage.arml.f;
        goto L_0x0127;
    L_0x0126:
        r1 = r2;
    L_0x0127:
        r5 = r9.b;
        r1 = defpackage.aabb.a(r1, r5, r4);
        defpackage.xpr.a(r0, r1);
        r0 = r9.n;
        r1 = r11.h;
        r5 = r9.b;
        r1 = defpackage.aabb.b(r1, r5);
        r5 = new android.text.SpannableStringBuilder;
        r5.<init>();
        r1 = r1.iterator();
    L_0x0143:
        r6 = r1.hasNext();
        if (r6 == 0) goto L_0x015a;
    L_0x0149:
        r6 = r1.next();
        r6 = (android.text.Spanned) r6;
        if (r4 <= 0) goto L_0x0154;
    L_0x0151:
        r5.append(r3);
    L_0x0154:
        r5.append(r6);
        r4 = r4 + 1;
        goto L_0x0143;
    L_0x015a:
        r1 = android.text.SpannableString.valueOf(r5);
        defpackage.xpr.a(r0, r1);
        r0 = r9.g;
        r1 = r11.a;
        r1 = r1 & 64;
        if (r1 == 0) goto L_0x0170;
    L_0x0169:
        r1 = r11.i;
        if (r1 != 0) goto L_0x0171;
    L_0x016d:
        r1 = defpackage.axak.a;
        goto L_0x0171;
    L_0x0170:
        r1 = r2;
    L_0x0171:
        r1 = defpackage.ajzv.a(r1);
        r3 = defpackage.aphg.class;
        r1 = defpackage.ajzv.a(r1, r3);
        r1 = (defpackage.aphg) r1;
        r3 = r10.a;
        r0.a(r1, r3);
        r0 = r9.h;
        r1 = r11.a;
        r1 = r1 & 128;
        if (r1 == 0) goto L_0x0190;
    L_0x018a:
        r2 = r11.j;
        if (r2 != 0) goto L_0x0190;
    L_0x018e:
        r2 = defpackage.axak.a;
    L_0x0190:
        r11 = defpackage.ajzv.a(r2);
        r1 = defpackage.aphg.class;
        r11 = defpackage.ajzv.a(r11, r1);
        r11 = (defpackage.aphg) r11;
        r10 = r10.a;
        r0.a(r11, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsp.a(akor, java.lang.Object):void");
    }
}
