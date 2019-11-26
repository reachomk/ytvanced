package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: wsk */
public class wsk extends akpl {
    public final HashMap a;
    public auvn b;
    private final TextView c = ((TextView) this.j.findViewById(R.id.metadata));
    private final TextView d = ((TextView) this.j.findViewById(R.id.additional_info));
    private final TextView e = ((TextView) this.j.findViewById(R.id.description));
    private final View f = this.j.findViewById(R.id.red_bar);
    private final ImageView g = ((ImageView) this.j.findViewById(R.id.logo));
    private final View h = this.j.findViewById(R.id.contextual_menu_anchor);
    private final ViewGroup i;
    private final CardView j = ((CardView) this.i.findViewById(R.id.card_view));
    private final TextView k = ((TextView) this.j.findViewById(R.id.primary_button));
    private final TextView l;
    private final akyy m;
    private final akyy n;
    private final aaas o;
    private final akvp p;
    private final akkq q;

    public wsk(nn nnVar, akzb akzb, aaas aaas, akvp akvp, akkq akkq, ViewGroup viewGroup) {
        this.i = (ViewGroup) LayoutInflater.from(nnVar).inflate(R.layout.subscription_product_card, viewGroup, false);
        this.m = akzb.a(this.k);
        this.l = (TextView) this.j.findViewById(R.id.secondary_button);
        this.n = akzb.a(this.l);
        akvu akvu = new akvu(this.j, this.h);
        this.h.setOnClickListener(new wsn(this, nnVar, aaas));
        this.o = aaas;
        this.p = akvp;
        this.q = akkq;
        this.a = new HashMap();
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.i;
    }

    private final SpannableString a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (arml arml : list) {
            if (i > 0) {
                spannableStringBuilder.append(System.getProperty("line.separator"));
            }
            spannableStringBuilder.append(aabb.a(arml, this.o, false));
            i++;
        }
        return SpannableString.valueOf(spannableStringBuilder);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A:{SYNTHETIC, RETURN} */
    public final /* synthetic */ void a(defpackage.akor r9, java.lang.Object r10) {
        /*
        r8 = this;
        r10 = (defpackage.axxz) r10;
        r0 = r10.b;
        r1 = 8;
        r2 = 0;
        r3 = 1;
        if (r0 != r3) goto L_0x004b;
    L_0x000a:
        r0 = r10.c;
        r0 = (defpackage.aygk) r0;
        r4 = defpackage.aklb.c(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x0014:
        r5 = r8.g;
        r5 = r5.getLayoutParams();
        r6 = r4.c;
        r4 = r4.d;
        r6 = r6 / r4;
        r4 = (float) r6;
        r6 = r5.height;
        r6 = (float) r6;
        r4 = r4 * r6;
        r4 = (int) r4;
        r5.width = r4;
        r4 = r8.q;
        r6 = r5.width;
        r7 = r5.height;
        r4.a(r0, r6, r7);
        r0 = r8.g;
        r0.setLayoutParams(r5);
    L_0x0036:
        r0 = r8.q;
        r4 = r8.g;
        r5 = r10.b;
        if (r5 != r3) goto L_0x0043;
    L_0x003e:
        r5 = r10.c;
        r5 = (defpackage.aygk) r5;
        goto L_0x0045;
    L_0x0043:
        r5 = defpackage.aygk.f;
    L_0x0045:
        r6 = defpackage.akko.h;
        r0.a(r4, r5, r6);
        goto L_0x0069;
    L_0x004b:
        if (r0 != r1) goto L_0x0069;
    L_0x004d:
        r0 = r8.p;
        r4 = r10.c;
        r4 = (defpackage.arwf) r4;
        r4 = r4.b;
        r4 = defpackage.arwh.a(r4);
        if (r4 != 0) goto L_0x005d;
    L_0x005b:
        r4 = defpackage.arwh.UNKNOWN;
    L_0x005d:
        r0 = r0.a(r4);
        if (r0 == 0) goto L_0x006a;
    L_0x0063:
        r4 = r8.g;
        r4.setImageResource(r0);
        goto L_0x006a;
    L_0x0069:
        r0 = 0;
    L_0x006a:
        r4 = r8.g;
        r5 = r10.b;
        if (r5 != r3) goto L_0x0072;
    L_0x0070:
        r0 = 1;
        goto L_0x0076;
    L_0x0072:
        if (r0 == 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0070;
    L_0x0075:
        r0 = 0;
    L_0x0076:
        defpackage.xpr.a(r4, r0);
        r0 = r10.a;
        r0 = r0 & r1;
        r1 = 0;
        if (r0 == 0) goto L_0x0086;
    L_0x007f:
        r0 = r10.d;
        if (r0 != 0) goto L_0x0087;
    L_0x0083:
        r0 = defpackage.axak.a;
        goto L_0x0087;
    L_0x0086:
        r0 = r1;
    L_0x0087:
        r0 = defpackage.ajzv.a(r0);
        r4 = defpackage.auvn.class;
        r0 = defpackage.ajzv.a(r0, r4);
        r0 = (defpackage.auvn) r0;
        r8.b = r0;
        r0 = r8.h;
        r4 = r8.b;
        if (r4 == 0) goto L_0x009d;
    L_0x009b:
        r4 = 1;
        goto L_0x009e;
    L_0x009d:
        r4 = 0;
    L_0x009e:
        defpackage.xpr.a(r0, r4);
        r0 = r8.c;
        r4 = r10.e;
        r4 = r8.a(r4);
        defpackage.xpr.a(r0, r4);
        r0 = r8.d;
        r4 = r10.f;
        r4 = r8.a(r4);
        defpackage.xpr.a(r0, r4);
        r0 = r8.e;
        r4 = r10.a;
        r4 = r4 & 16;
        if (r4 == 0) goto L_0x00c6;
    L_0x00bf:
        r4 = r10.g;
        if (r4 != 0) goto L_0x00c7;
    L_0x00c3:
        r4 = defpackage.arml.f;
        goto L_0x00c7;
    L_0x00c6:
        r4 = r1;
    L_0x00c7:
        r5 = r8.o;
        r4 = defpackage.aabb.a(r4, r5, r2);
        defpackage.xpr.a(r0, r4);
        r0 = r8.f;
        r4 = r8.e;
        r4 = r4.getVisibility();
        r0.setVisibility(r4);
        r0 = r8.m;
        r4 = r10.a;
        r4 = r4 & 32;
        if (r4 == 0) goto L_0x00ea;
    L_0x00e3:
        r4 = r10.h;
        if (r4 != 0) goto L_0x00eb;
    L_0x00e7:
        r4 = defpackage.axak.a;
        goto L_0x00eb;
    L_0x00ea:
        r4 = r1;
    L_0x00eb:
        r4 = defpackage.ajzv.a(r4);
        r5 = defpackage.aphg.class;
        r4 = defpackage.ajzv.a(r4, r5);
        r4 = (defpackage.aphg) r4;
        r5 = r9.a;
        r6 = r8.a;
        r0.a(r4, r5, r6);
        r0 = r8.n;
        r4 = r10.a;
        r4 = r4 & 64;
        if (r4 == 0) goto L_0x010c;
    L_0x0106:
        r1 = r10.i;
        if (r1 != 0) goto L_0x010c;
    L_0x010a:
        r1 = defpackage.axak.a;
    L_0x010c:
        r10 = defpackage.ajzv.a(r1);
        r1 = defpackage.aphg.class;
        r10 = defpackage.ajzv.a(r10, r1);
        r10 = (defpackage.aphg) r10;
        r9 = r9.a;
        r1 = r8.a;
        r0.a(r10, r9, r1);
        r9 = r8.l;
        r9 = r9.getVisibility();
        if (r9 != 0) goto L_0x0143;
    L_0x0127:
        r9 = r8.k;
        r9 = r9.getVisibility();
        if (r9 != 0) goto L_0x0130;
    L_0x012f:
        r2 = 2;
    L_0x0130:
        r9 = r8.l;
        r9 = r9.getLayoutParams();
        r9 = (android.widget.GridLayout.LayoutParams) r9;
        r10 = android.widget.GridLayout.spec(r2, r3);
        r9.columnSpec = r10;
        r10 = r8.l;
        r10.setLayoutParams(r9);
    L_0x0143:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsk.a(akor, java.lang.Object):void");
    }
}
