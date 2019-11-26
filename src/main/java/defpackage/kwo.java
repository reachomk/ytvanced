package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;

/* renamed from: kwo */
public final class kwo extends akpl {
    private final Context a;
    private final akkq b;
    private final CardView c;
    private final ImageView d = ((ImageView) amqw.a((ImageView) this.c.findViewById(R.id.thumbnail)));
    private final TextView e = ((TextView) amqw.a((TextView) this.c.findViewById(R.id.title)));
    private final TextView f = ((TextView) amqw.a((TextView) this.c.findViewById(R.id.subtitle)));
    private final TextView g = ((TextView) amqw.a((TextView) this.c.findViewById(R.id.auto_generated_notice)));
    private final akoj h;

    public kwo(Context context, akkq akkq, aaas aaas, ViewGroup viewGroup) {
        this.a = context;
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (CardView) LayoutInflater.from(context).inflate(R.layout.game_card, viewGroup, false);
        this.h = new akoj(aaas, this.c);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.h.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A:{SYNTHETIC, RETURN} */
    public final /* synthetic */ void a(defpackage.akor r7, java.lang.Object r8) {
        /*
        r6 = this;
        r8 = (defpackage.aroa) r8;
        r0 = 0;
        if (r8 != 0) goto L_0x0007;
    L_0x0005:
        r8 = r0;
        goto L_0x0044;
    L_0x0007:
        r1 = r8.b;
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x000e;
    L_0x000c:
        r1 = defpackage.axak.a;
    L_0x000e:
        r2 = com.google.protos.youtube.api.innertube.GamingSupportedRenderers.gameDetailsRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r2 = r2.d;
        r1 = r1.a(r2);
        if (r1 == 0) goto L_0x0005;
    L_0x0021:
        r8 = r8.b;
        if (r8 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0028;
    L_0x0026:
        r8 = defpackage.axak.a;
    L_0x0028:
        r1 = com.google.protos.youtube.api.innertube.GamingSupportedRenderers.gameDetailsRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r8.a(r1);
        r8 = r8.h;
        r2 = r1.d;
        r8 = r8.b(r2);
        if (r8 != 0) goto L_0x003e;
    L_0x003b:
        r8 = r1.b;
        goto L_0x0042;
    L_0x003e:
        r8 = r1.a(r8);
    L_0x0042:
        r8 = (defpackage.arqd) r8;
    L_0x0044:
        if (r8 != 0) goto L_0x0048;
    L_0x0046:
        goto L_0x0136;
    L_0x0048:
        r1 = r6.c;
        r1 = r1.getLayoutParams();
        r2 = r6.c;
        r3 = 2131756817; // 0x7f100711 float:1.9144552E38 double:1.0532278086E-314;
        r2 = r2.findViewById(r3);
        if (r1 == 0) goto L_0x0081;
    L_0x0059:
        r3 = r6.a;
        r3 = r3.getResources();
        r4 = 2131625081; // 0x7f0e0479 float:1.887736E38 double:1.0531627223E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r1.width = r3;
        r3 = r2.getLayoutParams();
        r4 = r1.width;
        r3.width = r4;
        r1 = (android.view.ViewGroup.MarginLayoutParams) r1;
        r3 = r6.a;
        r3 = r3.getResources();
        r4 = 2131625079; // 0x7f0e0477 float:1.8877356E38 double:1.0531627213E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r1.bottomMargin = r3;
    L_0x0081:
        r1 = r8.a;
        r1 = r1 & 32;
        if (r1 != 0) goto L_0x0088;
    L_0x0087:
        goto L_0x0099;
    L_0x0088:
        r1 = r6.h;
        r3 = r7.a;
        r4 = r8.e;
        if (r4 != 0) goto L_0x0092;
    L_0x0090:
        r4 = defpackage.apxu.d;
    L_0x0092:
        r5 = r7.b();
        r1.a(r3, r4, r5);
    L_0x0099:
        r1 = r8.c;
        if (r1 != 0) goto L_0x009f;
    L_0x009d:
        r1 = defpackage.aygk.f;
    L_0x009f:
        r3 = r6.b;
        r4 = r6.d;
        r3.a(r4, r1);
        if (r1 != 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00cf;
    L_0x00a9:
        r3 = r1.a;
        r3 = r3 & 4;
        if (r3 == 0) goto L_0x00cf;
    L_0x00af:
        r3 = r1.d;
        if (r3 != 0) goto L_0x00b5;
    L_0x00b3:
        r3 = defpackage.aodx.c;
    L_0x00b5:
        r3 = r3.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x00cf;
    L_0x00bb:
        r3 = r6.d;
        r1 = r1.d;
        if (r1 != 0) goto L_0x00c3;
    L_0x00c1:
        r1 = defpackage.aodx.c;
    L_0x00c3:
        r1 = r1.b;
        if (r1 != 0) goto L_0x00c9;
    L_0x00c7:
        r1 = defpackage.aodv.c;
    L_0x00c9:
        r1 = r1.b;
        r3.setContentDescription(r1);
        goto L_0x00d4;
    L_0x00cf:
        r1 = r6.d;
        r1.setContentDescription(r0);
    L_0x00d4:
        r1 = r6.e;
        r3 = r8.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x00e3;
    L_0x00dc:
        r3 = r8.b;
        if (r3 != 0) goto L_0x00e4;
    L_0x00e0:
        r3 = defpackage.arml.f;
        goto L_0x00e4;
    L_0x00e3:
        r3 = r0;
    L_0x00e4:
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r1, r3);
        r1 = r6.g;
        r3 = r8.a;
        r3 = r3 & 256;
        if (r3 == 0) goto L_0x00fa;
    L_0x00f3:
        r3 = r8.h;
        if (r3 != 0) goto L_0x00fb;
    L_0x00f7:
        r3 = defpackage.arml.f;
        goto L_0x00fb;
    L_0x00fa:
        r3 = r0;
    L_0x00fb:
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r1, r3);
        r1 = r6.f;
        r3 = r8.a;
        r3 = r3 & 128;
        if (r3 == 0) goto L_0x0110;
    L_0x010a:
        r0 = r8.g;
        if (r0 != 0) goto L_0x0110;
    L_0x010e:
        r0 = defpackage.arml.f;
    L_0x0110:
        r8 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r1, r8);
        r7 = defpackage.etj.a(r7);
        if (r7 == 0) goto L_0x0132;
    L_0x011d:
        r7 = r2.getLayoutParams();
        r8 = -1;
        r7.width = r8;
        r7 = r6.a;
        r7 = r7.getResources();
        r8 = 2131625080; // 0x7f0e0478 float:1.8877358E38 double:1.053162722E-314;
        r7 = r7.getDimensionPixelOffset(r8);
        goto L_0x0133;
    L_0x0132:
        r7 = 0;
    L_0x0133:
        defpackage.abe.a(r2, r7, r7, r7, r7);
    L_0x0136:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwo.a(akor, java.lang.Object):void");
    }
}
