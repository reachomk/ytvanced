package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abuc */
public final class abuc implements akot {
    public akor a;
    public final aaas b;
    private final ViewGroup c;
    private final Context d;
    private final abru e;

    public abuc(Context context, aaas aaas, abru abru) {
        this.d = context;
        this.b = aaas;
        this.e = abru;
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.live_chat_purchase_menu, null);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_creator_support_menu_padding);
        abe.a(this.c, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    public final View K_() {
        return this.c;
    }

    /* JADX WARNING: Missing block: B:3:0x0011, code skipped:
            if (r0 != 0) goto L_0x0015;
     */
    private final android.widget.Button a(defpackage.aphg r6) {
        /*
        r5 = this;
        r0 = r6.b;
        r1 = 1;
        if (r0 != r1) goto L_0x0014;
    L_0x0005:
        r0 = r6.c;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = defpackage.aphh.a(r0);
        if (r0 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0015;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        r2 = r0 + -1;
        r3 = 0;
        if (r0 == 0) goto L_0x0079;
    L_0x001a:
        r0 = 4;
        if (r2 == r0) goto L_0x0028;
    L_0x001d:
        r0 = 6;
        if (r2 == r0) goto L_0x0024;
    L_0x0020:
        r0 = 2131034802; // 0x7f0502b2 float:1.7680132E38 double:1.052871086E-314;
        goto L_0x0030;
    L_0x0024:
        r0 = 2131034801; // 0x7f0502b1 float:1.768013E38 double:1.0528710853E-314;
        goto L_0x0030;
    L_0x0028:
        r0 = r5.e;
        r2 = 13;
        r0 = r0.a(r2);
    L_0x0030:
        r2 = r5.d;
        r2 = android.view.LayoutInflater.from(r2);
        r4 = 0;
        r0 = r2.inflate(r0, r3, r4);
        r0 = (android.widget.Button) r0;
        r2 = r0.getBackground();
        defpackage.xpr.a(r0, r2);
        r2 = r6.f;
        if (r2 != 0) goto L_0x0062;
    L_0x0048:
        r0.setEnabled(r1);
        r1 = r6.a;
        r1 = r1 & 4096;
        if (r1 == 0) goto L_0x0058;
    L_0x0051:
        r1 = r6.m;
        if (r1 != 0) goto L_0x0059;
    L_0x0055:
        r1 = defpackage.apxu.d;
        goto L_0x0059;
    L_0x0058:
        r1 = r3;
    L_0x0059:
        r2 = new abuf;
        r2.<init>(r5, r1);
        r0.setOnClickListener(r2);
        goto L_0x0065;
    L_0x0062:
        r0.setEnabled(r4);
    L_0x0065:
        r1 = r6.a;
        r1 = r1 & 128;
        if (r1 == 0) goto L_0x0071;
    L_0x006b:
        r3 = r6.g;
        if (r3 != 0) goto L_0x0071;
    L_0x006f:
        r3 = defpackage.arml.f;
    L_0x0071:
        r6 = defpackage.ajqy.a(r3);
        r0.setText(r6);
        return r0;
    L_0x0079:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abuc.a(aphg):android.widget.Button");
    }

    public final void a(akpb akpb) {
        this.c.removeAllViews();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        auck auck = (auck) obj;
        this.a = akor;
        Resources resources = this.d.getResources();
        for (auci auci : auck.c) {
            int i = auci.a;
            if (i == 65153809) {
                this.c.addView(a((aphg) auci.b), -1, resources.getDimensionPixelOffset(R.dimen.live_chat_button_height));
            } else if (i == 138897108) {
                ViewGroup viewGroup = this.c;
                aphj aphj = ((aucg) auci.b).b;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                viewGroup.addView(a(aphg), -1, resources.getDimensionPixelOffset(R.dimen.live_chat_button_height));
                if (((auci.a == 138897108 ? (aucg) auci.b : aucg.d).a & 2) != 0) {
                    arml arml = (auci.a == 138897108 ? (aucg) auci.b : aucg.d).c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    TextView textView = (TextView) LayoutInflater.from(this.d).inflate(this.e.a(12), null, false);
                    textView.setText(ajqy.a(arml));
                    this.c.addView(textView);
                }
            }
        }
        aphj aphj2 = auck.d;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        if ((aphj2.a & 1) != 0) {
            aphj2 = auck.d;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg aphg2 = aphj2.b;
            if (aphg2 == null) {
                aphg2 = aphg.s;
            }
            this.c.addView(a(aphg2), -1, this.d.getResources().getDimensionPixelOffset(R.dimen.live_chat_button_height));
        }
        this.c.setVisibility(0);
    }
}
