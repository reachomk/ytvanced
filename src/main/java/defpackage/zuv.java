package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zuv */
public final class zuv implements zwh {
    private final akkq a;

    public zuv(akkq akkq) {
        this.a = (akkq) amqw.a((Object) akkq);
    }

    private static zva a(View view) {
        if (view == null) {
            return null;
        }
        zva zva = new zva();
        zva.a = view;
        zva.b = view.findViewById(R.id.sponsored_region);
        zva.c = (TextView) zva.b.findViewById(R.id.sponsored_text);
        zva.d = (TextView) view.findViewById(R.id.title);
        zva.e = (TextView) view.findViewById(R.id.price);
        zva.f = (TextView) view.findViewById(R.id.merchant);
        zva.g = (ImageView) view.findViewById(R.id.image);
        zva.h = (RatingBar) view.findViewById(R.id.rating);
        zva.i = (TextView) view.findViewById(R.id.review_text);
        zva.j = new vqx(view, (byte) 0);
        return zva;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0181  */
    public final void a(android.content.Context r10, defpackage.zud r11, defpackage.aqj r12, defpackage.zwj r13) {
        /*
        r9 = this;
        r0 = r12;
        r0 = (defpackage.zuz) r0;
        r11 = r11.h();
        r1 = r11.m;
        if (r1 != 0) goto L_0x000d;
    L_0x000b:
        r1 = defpackage.arxh.c;
    L_0x000d:
        r1 = r1.b;
        r1 = defpackage.arxj.a(r1);
        if (r1 == 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0017;
    L_0x0016:
        r1 = 2;
    L_0x0017:
        r12 = r12.a;
        r2 = r0.p;
        r3 = 3;
        r4 = 0;
        if (r2 != 0) goto L_0x0094;
    L_0x001f:
        if (r1 == r3) goto L_0x0038;
    L_0x0021:
        r10 = r0.r;
        if (r10 != 0) goto L_0x0035;
    L_0x0025:
        r10 = 2131756972; // 0x7f1007ac float:1.9144867E38 double:1.053227885E-314;
        r2 = 2131756973; // 0x7f1007ad float:1.9144869E38 double:1.0532278856E-314;
        r10 = defpackage.xpr.a(r12, r10, r2);
        r10 = defpackage.zuv.a(r10);
        r0.r = r10;
    L_0x0035:
        r10 = r0.r;
        goto L_0x00a0;
    L_0x0038:
        r2 = r0.q;
        if (r2 != 0) goto L_0x0091;
    L_0x003c:
        r2 = 2131756971; // 0x7f1007ab float:1.9144865E38 double:1.0532278847E-314;
        r5 = 2131755722; // 0x7f1002ca float:1.9142331E38 double:1.0532272676E-314;
        r2 = defpackage.xpr.a(r12, r2, r5);
        r2 = defpackage.zuv.a(r2);
        r0.q = r2;
        r2 = r0.q;
        r2 = r2.h;
        if (r2 == 0) goto L_0x0091;
    L_0x0052:
        r2 = r2.getProgressDrawable();
        r2 = (android.graphics.drawable.LayerDrawable) r2;
        r5 = 16908301; // 0x102000d float:2.3877265E-38 double:8.3538107E-317;
        r6 = r2.findDrawableByLayerId(r5);
        r6 = defpackage.st.d(r6);
        r7 = r10.getResources();
        r8 = 2131558855; // 0x7f0d01c7 float:1.8743038E38 double:1.0531300023E-314;
        r7 = r7.getColor(r8);
        defpackage.st.a(r6, r7);
        r2.setDrawableByLayerId(r5, r6);
        r5 = 16908288; // 0x1020000 float:2.387723E-38 double:8.353804E-317;
        r6 = r2.findDrawableByLayerId(r5);
        r6 = defpackage.st.d(r6);
        r7 = 2130772283; // 0x7f01013b float:1.714768E38 double:1.052741384E-314;
        r10 = defpackage.xwe.a(r10, r7, r4);
        defpackage.st.a(r6, r10);
        r2.setDrawableByLayerId(r5, r6);
        r10 = 16908303; // 0x102000f float:2.387727E-38 double:8.3538116E-317;
        r2.setDrawableByLayerId(r10, r6);
    L_0x0091:
        r10 = r0.q;
        goto L_0x00a0;
    L_0x0094:
        r10 = r0.r;
        if (r10 != 0) goto L_0x009e;
    L_0x0098:
        r10 = defpackage.zuv.a(r12);
        r0.r = r10;
    L_0x009e:
        r10 = r0.r;
    L_0x00a0:
        r2 = 8;
        if (r1 != r3) goto L_0x00ae;
    L_0x00a4:
        r1 = r0.r;
        if (r1 == 0) goto L_0x00ae;
    L_0x00a8:
        r0 = r1.a;
        r0.setVisibility(r2);
        goto L_0x00b7;
    L_0x00ae:
        r0 = r0.q;
        if (r0 == 0) goto L_0x00b7;
    L_0x00b2:
        r0 = r0.a;
        r0.setVisibility(r2);
    L_0x00b7:
        r0 = r10.a;
        r0.setVisibility(r4);
        r0 = r10.d;
        r1 = r11.a;
        r1 = r1 & r2;
        r3 = 0;
        if (r1 == 0) goto L_0x00cb;
    L_0x00c4:
        r1 = r11.e;
        if (r1 != 0) goto L_0x00cc;
    L_0x00c8:
        r1 = defpackage.arml.f;
        goto L_0x00cc;
    L_0x00cb:
        r1 = r3;
    L_0x00cc:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r10.e;
        r1 = r11.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x00e2;
    L_0x00db:
        r1 = r11.f;
        if (r1 != 0) goto L_0x00e3;
    L_0x00df:
        r1 = defpackage.arml.f;
        goto L_0x00e3;
    L_0x00e2:
        r1 = r3;
    L_0x00e3:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r10.f;
        r1 = r11.a;
        r1 = r1 & 32;
        if (r1 == 0) goto L_0x00f9;
    L_0x00f2:
        r1 = r11.g;
        if (r1 != 0) goto L_0x00fa;
    L_0x00f6:
        r1 = defpackage.arml.f;
        goto L_0x00fa;
    L_0x00f9:
        r1 = r3;
    L_0x00fa:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r11.a;
        r1 = 4;
        r0 = r0 & r1;
        if (r0 != 0) goto L_0x0108;
    L_0x0107:
        goto L_0x0115;
    L_0x0108:
        r0 = r9.a;
        r5 = r10.g;
        r6 = r11.d;
        if (r6 != 0) goto L_0x0112;
    L_0x0110:
        r6 = defpackage.aygk.f;
    L_0x0112:
        r0.a(r5, r6);
    L_0x0115:
        r0 = r10.h;
        r5 = 1;
        if (r0 != 0) goto L_0x011b;
    L_0x011a:
        goto L_0x0167;
    L_0x011b:
        r0 = r11.k;
        r6 = 0;
        r0 = java.lang.Float.compare(r0, r6);
        if (r0 <= 0) goto L_0x015d;
    L_0x0124:
        r0 = r10.h;
        r0.setVisibility(r4);
        r0 = r10.h;
        r2 = r11.k;
        r0.setRating(r2);
        r0 = r10.h;
        r2 = new java.lang.Object[r5];
        r6 = r11.k;
        r6 = java.lang.Float.valueOf(r6);
        r2[r4] = r6;
        r6 = "%.1f";
        r2 = java.lang.String.format(r6, r2);
        r0.setContentDescription(r2);
        r0 = r10.i;
        r2 = r11.a;
        r2 = r2 & 2048;
        if (r2 == 0) goto L_0x0154;
    L_0x014d:
        r2 = r11.l;
        if (r2 != 0) goto L_0x0155;
    L_0x0151:
        r2 = defpackage.arml.f;
        goto L_0x0155;
    L_0x0154:
        r2 = r3;
    L_0x0155:
        r2 = defpackage.ajqy.a(r2);
        defpackage.xpr.a(r0, r2);
        goto L_0x0167;
    L_0x015d:
        r0 = r10.h;
        r0.setVisibility(r2);
        r0 = r10.i;
        r0.setVisibility(r2);
    L_0x0167:
        r0 = r11.a;
        r0 = r0 & r5;
        if (r0 == 0) goto L_0x0172;
    L_0x016c:
        r3 = r11.b;
        if (r3 != 0) goto L_0x0172;
    L_0x0170:
        r3 = defpackage.arml.f;
    L_0x0172:
        r0 = defpackage.ajqy.a(r3);
        r2 = r10.c;
        defpackage.xpr.a(r2, r0);
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0187;
    L_0x0181:
        r0 = r10.b;
        r0.setVisibility(r1);
        goto L_0x0196;
    L_0x0187:
        r0 = r10.b;
        r0.setVisibility(r4);
        r0 = r10.b;
        r1 = new zuy;
        r1.<init>(r11, r10, r13);
        r0.setOnClickListener(r1);
    L_0x0196:
        r0 = new zux;
        r0.<init>(r11, r13, r10);
        r12.setOnClickListener(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuv.a(android.content.Context, zud, aqj, zwj):void");
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return new zuz(LayoutInflater.from(context).inflate(!z ? R.layout.info_card_shopping_container_watch_next : R.layout.info_card_shopping, viewGroup, false), z);
    }
}
