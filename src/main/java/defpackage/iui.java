package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* renamed from: iui */
public final class iui extends akpl implements akok, iww {
    private final akkq a;
    private final CardView b;
    private final ImageView c = ((ImageView) amqw.a((ImageView) this.b.findViewById(R.id.thumbnail)));
    private final TextView d = ((TextView) amqw.a((TextView) this.b.findViewById(R.id.query)));
    private final View e;
    private final FixedAspectRatioFrameLayout f;
    private final akoj g;
    private final Activity h;
    private final Resources i;
    private axdo j;
    private akor k;
    private final SharedPreferences l;

    public iui(Activity activity, akkq akkq, aaas aaas, ViewGroup viewGroup, SharedPreferences sharedPreferences) {
        this.a = (akkq) amqw.a((Object) akkq);
        this.h = activity;
        this.i = activity.getResources();
        this.b = (CardView) LayoutInflater.from(activity).inflate(R.layout.search_refinement_card, viewGroup, false);
        this.g = new akoj(aaas, this.b, (akok) this);
        this.e = this.b.findViewById(R.id.card_content_container);
        this.f = (FixedAspectRatioFrameLayout) this.b.findViewById(R.id.thumbnail_layout);
        this.l = sharedPreferences;
    }

    public final void a(akpb akpb) {
        this.g.a();
    }

    public final View K_() {
        return this.b;
    }

    /* JADX WARNING: Missing block: B:40:0x00d0, code skipped:
            if (r2.c == false) goto L_0x00ff;
     */
    public final boolean a(android.view.View r6) {
        /*
        r5 = this;
        r6 = r5.k;
        r0 = 0;
        if (r6 == 0) goto L_0x00ff;
    L_0x0005:
        r6 = r5.j;
        r1 = defpackage.axdm.b;
        r1 = defpackage.anxl.checkIsLite(r1);
        r6.a(r1);
        r6 = r6.h;
        r1 = r1.d;
        r6 = r6.a(r1);
        r1 = 1;
        if (r6 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0041;
    L_0x001c:
        r6 = r5.j;
        r2 = defpackage.axdm.b;
        r2 = defpackage.anxl.checkIsLite(r2);
        r6.a(r2);
        r6 = r6.h;
        r3 = r2.d;
        r6 = r6.b(r3);
        if (r6 != 0) goto L_0x0034;
    L_0x0031:
        r6 = r2.b;
        goto L_0x0038;
    L_0x0034:
        r6 = r2.a(r6);
    L_0x0038:
        r6 = (java.lang.Boolean) r6;
        r6 = r6.booleanValue();
        if (r6 == 0) goto L_0x0041;
    L_0x0040:
        return r1;
    L_0x0041:
        r6 = r5.k;
        r2 = "HORIZONTAL_CARD_LIST";
        r6 = r6.a(r2);
        r6 = (defpackage.ajwc) r6;
        if (r6 == 0) goto L_0x0091;
    L_0x004d:
        r2 = defpackage.ajwb.a;
        r2 = r6.hasExtension(r2);
        if (r2 == 0) goto L_0x0091;
    L_0x0055:
        r2 = defpackage.ajwb.a;
        r2 = r6.getExtension(r2);
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x0091;
    L_0x0063:
        r6 = r5.k;
        r2 = "REFINEMENT_SELECTION_LISTENER";
        r6 = r6.a(r2);
        r6 = (defpackage.iww) r6;
        r2 = r5.j;
        if (r2 == 0) goto L_0x007c;
    L_0x0071:
        r2 = r2.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.axdr) r2;
        r6.a(r2);
    L_0x007c:
        r6 = r5.b;
        r2 = new android.graphics.Rect;
        r3 = r6.getWidth();
        r4 = r5.b;
        r4 = r4.getHeight();
        r2.<init>(r0, r0, r3, r4);
        r6.requestRectangleOnScreen(r2);
        return r1;
    L_0x0091:
        r2 = r5.l;
        if (r2 == 0) goto L_0x009d;
    L_0x0095:
        r3 = "force_enable_sticky_browsy_bars";
        r2 = r2.getBoolean(r3, r0);
        if (r2 != 0) goto L_0x00d3;
    L_0x009d:
        r2 = r5.j;
        r2 = r2.d;
        if (r2 == 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00a6;
    L_0x00a4:
        r2 = defpackage.apxu.d;
    L_0x00a6:
        r3 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r4 = r3.d;
        r2 = r2.b(r4);
        if (r2 != 0) goto L_0x00bc;
    L_0x00b9:
        r2 = r3.b;
        goto L_0x00c0;
    L_0x00bc:
        r2 = r3.a(r2);
    L_0x00c0:
        r2 = (defpackage.axcv) r2;
        r2 = r2.d;
        if (r2 != 0) goto L_0x00c8;
    L_0x00c6:
        r2 = defpackage.axda.c;
    L_0x00c8:
        r2 = r2.b;
        if (r2 != 0) goto L_0x00ce;
    L_0x00cc:
        r2 = defpackage.axcy.d;
    L_0x00ce:
        r2 = r2.c;
        if (r2 != 0) goto L_0x00d3;
    L_0x00d2:
        goto L_0x00ff;
    L_0x00d3:
        r2 = r5.k;
        r3 = -1;
        r4 = "REFINEMENT_POSITION";
        r2 = r2.a(r4, r3);
        if (r2 == r3) goto L_0x00ff;
    L_0x00de:
        r6 = r6.a;
        r6 = r6[r2];
        r2 = r6.c;
        r2 = r2.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.axdr) r2;
        r3 = defpackage.axdm.b;
        r1 = java.lang.Boolean.valueOf(r1);
        r2.a(r3, r1);
        r1 = r2.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.axdo) r1;
        r6.c = r1;
    L_0x00ff:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iui.a(android.view.View):boolean");
    }

    public final void a(axdr axdr) {
        a((axdo) ((anxl) axdr.build()));
    }

    /* JADX WARNING: Missing block: B:39:0x01d6, code skipped:
            if (r1 == 5) goto L_0x01d9;
     */
    private final void a(defpackage.axdo r17) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r1.e;
        if (r2 != 0) goto L_0x000a;
    L_0x0008:
        r2 = defpackage.axdq.c;
    L_0x000a:
        r3 = 5;
        r4 = 4;
        r5 = 1;
        r6 = 0;
        if (r2 == 0) goto L_0x016f;
    L_0x0010:
        r2 = r2.b;
        r2 = defpackage.axds.a(r2);
        if (r2 == 0) goto L_0x0019;
    L_0x0018:
        goto L_0x001a;
    L_0x0019:
        r2 = 1;
    L_0x001a:
        r2 = r2 + -1;
        r7 = 2131689500; // 0x7f0f001c float:1.9008017E38 double:1.0531945496E-314;
        r8 = 3;
        r9 = 2131626711; // 0x7f0e0ad7 float:1.8880666E38 double:1.0531635277E-314;
        r10 = 8388627; // 0x800013 float:1.175497E-38 double:4.1445324E-317;
        r11 = 2131626712; // 0x7f0e0ad8 float:1.8880668E38 double:1.053163528E-314;
        r12 = 2130772279; // 0x7f010137 float:1.7147672E38 double:1.052741382E-314;
        r13 = 2131626714; // 0x7f0e0ada float:1.8880672E38 double:1.053163529E-314;
        r14 = 2131626704; // 0x7f0e0ad0 float:1.8880652E38 double:1.053163524E-314;
        r15 = 2130839442; // 0x7f020792 float:1.7283895E38 double:1.052774565E-314;
        if (r2 == r8) goto L_0x010c;
    L_0x0037:
        if (r2 == r4) goto L_0x00a5;
    L_0x0039:
        if (r2 == r3) goto L_0x0040;
    L_0x003b:
        r16.b();
        goto L_0x0172;
    L_0x0040:
        r2 = r0.e;
        r8 = r0.i;
        r8 = r8.getDrawable(r15);
        r2.setBackground(r8);
        r2 = r0.i;
        r2 = r2.getDimensionPixelSize(r14);
        r8 = r0.e;
        r8.setPadding(r2, r2, r2, r2);
        r2 = r0.i;
        r8 = 2131626707; // 0x7f0e0ad3 float:1.8880658E38 double:1.0531635257E-314;
        r2 = r2.getDimensionPixelSize(r8);
        r0.a(r2);
        r2 = r0.b;
        r8 = r0.i;
        r8 = r8.getDimensionPixelOffset(r13);
        r8 = (float) r8;
        r2.a(r8);
        r2 = r0.b;
        r8 = r0.h;
        r8 = defpackage.xwe.a(r8, r12, r6);
        r2.a(r8);
        r2 = r0.f;
        r8 = r0.i;
        r7 = r8.getFraction(r7, r5, r5);
        r2.a = r7;
        r2 = r0.d;
        r7 = 2;
        r2.setLines(r7);
        r2 = r0.d;
        r7 = r0.i;
        r7 = r7.getDimensionPixelSize(r11);
        r7 = (float) r7;
        r2.setTextSize(r6, r7);
        r2 = r0.d;
        r2.setGravity(r10);
        r2 = r0.i;
        r2 = r2.getDimensionPixelSize(r9);
        r0.a(r2, r2);
        goto L_0x0172;
    L_0x00a5:
        r2 = r0.e;
        r7 = r0.i;
        r7 = r7.getDrawable(r15);
        r2.setBackground(r7);
        r2 = r0.i;
        r2 = r2.getDimensionPixelSize(r14);
        r7 = r0.e;
        r7.setPadding(r2, r2, r2, r2);
        r2 = r0.i;
        r7 = 2131626715; // 0x7f0e0adb float:1.8880674E38 double:1.0531635296E-314;
        r2 = r2.getDimensionPixelSize(r7);
        r0.a(r2);
        r2 = r0.b;
        r7 = r0.h;
        r7 = defpackage.xwe.a(r7, r12, r6);
        r2.a(r7);
        r2 = r0.b;
        r7 = r0.i;
        r7 = r7.getDimensionPixelOffset(r13);
        r7 = (float) r7;
        r2.a(r7);
        r2 = r0.f;
        r7 = r0.i;
        r8 = 2131689475; // 0x7f0f0003 float:1.9007966E38 double:1.053194537E-314;
        r7 = r7.getFraction(r8, r5, r5);
        r2.a = r7;
        r2 = r0.d;
        r7 = 2;
        r2.setLines(r7);
        r2 = r0.d;
        r7 = r0.i;
        r7 = r7.getDimensionPixelSize(r11);
        r7 = (float) r7;
        r2.setTextSize(r6, r7);
        r2 = r0.d;
        r2.setGravity(r10);
        r2 = r0.i;
        r2 = r2.getDimensionPixelSize(r9);
        r0.a(r2, r2);
        goto L_0x0172;
    L_0x010c:
        r2 = r0.e;
        r3 = r0.i;
        r3 = r3.getDrawable(r15);
        r2.setBackground(r3);
        r2 = r0.i;
        r2 = r2.getDimensionPixelSize(r14);
        r3 = r0.e;
        r3.setPadding(r2, r2, r2, r2);
        r2 = r0.i;
        r3 = 2131626713; // 0x7f0e0ad9 float:1.888067E38 double:1.0531635287E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r0.a(r2);
        r2 = r0.b;
        r3 = r0.i;
        r3 = r3.getDimensionPixelOffset(r13);
        r3 = (float) r3;
        r2.a(r3);
        r2 = r0.b;
        r3 = r0.h;
        r3 = defpackage.xwe.a(r3, r12, r6);
        r2.a(r3);
        r2 = r0.f;
        r3 = r0.i;
        r3 = r3.getFraction(r7, r5, r5);
        r2.a = r3;
        r2 = r0.d;
        r2.setLines(r8);
        r2 = r0.d;
        r3 = r0.i;
        r3 = r3.getDimensionPixelSize(r11);
        r3 = (float) r3;
        r2.setTextSize(r6, r3);
        r2 = r0.d;
        r2.setGravity(r10);
        r2 = r0.i;
        r2 = r2.getDimensionPixelSize(r9);
        r0.a(r2, r2);
        goto L_0x0172;
    L_0x016f:
        r16.b();
    L_0x0172:
        r2 = defpackage.axdm.b;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r3 = r1.h;
        r2 = r2.d;
        r2 = r3.a(r2);
        r3 = 0;
        r7 = 2130772333; // 0x7f01016d float:1.7147781E38 double:1.052741409E-314;
        if (r2 != 0) goto L_0x018b;
    L_0x0189:
        goto L_0x021a;
    L_0x018b:
        r2 = defpackage.axdm.b;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r8 = r1.h;
        r9 = r2.d;
        r8 = r8.b(r9);
        if (r8 != 0) goto L_0x01a1;
    L_0x019e:
        r2 = r2.b;
        goto L_0x01a5;
    L_0x01a1:
        r2 = r2.a(r8);
    L_0x01a5:
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x021a;
    L_0x01ad:
        r1 = r1.e;
        if (r1 != 0) goto L_0x01b3;
    L_0x01b1:
        r1 = defpackage.axdq.c;
    L_0x01b3:
        if (r1 == 0) goto L_0x01f6;
    L_0x01b5:
        r2 = r1.b;
        r2 = defpackage.axds.a(r2);
        if (r2 != 0) goto L_0x01be;
    L_0x01bd:
        goto L_0x01c2;
    L_0x01be:
        r8 = 6;
        if (r2 != r8) goto L_0x01c2;
    L_0x01c1:
        goto L_0x01d9;
    L_0x01c2:
        r2 = r1.b;
        r2 = defpackage.axds.a(r2);
        if (r2 != 0) goto L_0x01cb;
    L_0x01ca:
        goto L_0x01cd;
    L_0x01cb:
        if (r2 == r4) goto L_0x01d9;
    L_0x01cd:
        r1 = r1.b;
        r1 = defpackage.axds.a(r1);
        if (r1 == 0) goto L_0x01f6;
    L_0x01d5:
        r2 = 5;
        if (r1 == r2) goto L_0x01d9;
    L_0x01d8:
        goto L_0x01f6;
    L_0x01d9:
        r1 = r0.b;
        r2 = r0.h;
        r4 = 2130772263; // 0x7f010127 float:1.714764E38 double:1.0527413743E-314;
        r2 = defpackage.xwe.a(r2, r4, r6);
        r1.a(r2);
        r1 = r0.d;
        r2 = r0.h;
        r4 = 2130772278; // 0x7f010136 float:1.714767E38 double:1.0527413817E-314;
        r2 = defpackage.xwe.a(r2, r4, r6);
        r1.setTextColor(r2);
        goto L_0x020f;
    L_0x01f6:
        r1 = r0.b;
        r2 = r0.h;
        r4 = 2130772281; // 0x7f010139 float:1.7147676E38 double:1.052741383E-314;
        r2 = defpackage.xwe.a(r2, r4, r6);
        r1.a(r2);
        r1 = r0.d;
        r2 = r0.h;
        r2 = defpackage.xwe.a(r2, r7, r6);
        r1.setTextColor(r2);
    L_0x020f:
        r1 = r0.d;
        r1.setTypeface(r3, r5);
        r1 = r0.b;
        r1.setEnabled(r6);
        return;
    L_0x021a:
        r1 = r0.d;
        r2 = r0.h;
        r2 = defpackage.xwe.a(r2, r7, r6);
        r1.setTextColor(r2);
        r1 = r0.d;
        r1.setTypeface(r3, r6);
        r1 = r0.b;
        r1.setEnabled(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iui.a(axdo):void");
    }

    private final void b() {
        this.e.setBackground(this.i.getDrawable(R.drawable.search_refinement_card_background));
        this.e.setPadding(0, 0, 0, 0);
        a(this.i.getDimensionPixelSize(R.dimen.search_refinement_card_default_width));
        this.b.a((float) this.i.getDimensionPixelSize(R.dimen.search_refinement_card_default_corner_radius));
        this.b.a(xwe.a(this.h, R.attr.ytBrandBackgroundSolid, 0));
        this.f.a = this.i.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        this.d.setLines(2);
        this.d.setTextSize(0, (float) this.i.getDimensionPixelOffset(R.dimen.search_refinement_card_query_default_text_size));
        this.d.setGravity(8388611);
        a(this.i.getDimensionPixelSize(R.dimen.search_refinement_card_query_default_horizontal_margin), this.i.getDimensionPixelSize(R.dimen.search_refinement_card_query_default_vertical_margin));
    }

    private final void a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.e.getLayoutParams();
        layoutParams.width = i;
        this.e.setLayoutParams(layoutParams);
    }

    private final void a(int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.d.getLayoutParams();
        marginLayoutParams.setMargins(i, i2, i, i2);
        this.d.setLayoutParams(marginLayoutParams);
    }
}
