package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abtl */
public abstract class abtl implements akot {
    public final aaas a;
    public final View b;
    private final akvp c;
    private final TextView d = c();
    private final TextView e = d();
    private final ImageView f = e();
    private final ViewGroup g = f();

    public abtl(Context context, aaas aaas, akvp akvp) {
        this.a = aaas;
        this.c = akvp;
        this.b = View.inflate(context, b(), null);
        Resources resources = this.b.getResources();
        int h = h();
        i();
        View view = this.b;
        int g = g();
        h = h != 0 ? resources.getDimensionPixelOffset(h) : 0;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_metadata_horizontal_margin);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(g, -2);
        marginLayoutParams.topMargin = h;
        marginLayoutParams.bottomMargin = h;
        marginLayoutParams.leftMargin = dimensionPixelOffset;
        marginLayoutParams.rightMargin = dimensionPixelOffset;
        view.setLayoutParams(marginLayoutParams);
    }

    public abstract int b();

    public abstract TextView c();

    public abstract TextView d();

    public abstract ImageView e();

    public abstract ViewGroup f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A:{SYNTHETIC, RETURN} */
    public final /* synthetic */ void a_(defpackage.akor r6, java.lang.Object r7) {
        /*
        r5 = this;
        r7 = (defpackage.audv) r7;
        r6 = r5.d;
        r0 = r7.a;
        r0 = r0 & 16;
        r1 = 0;
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r0 = r7.e;
        if (r0 != 0) goto L_0x0013;
    L_0x000f:
        r0 = defpackage.arml.f;
        goto L_0x0013;
    L_0x0012:
        r0 = r1;
    L_0x0013:
        r2 = r5.a;
        r3 = 0;
        r0 = defpackage.aabb.a(r0, r2, r3);
        defpackage.xpr.a(r6, r0);
        r6 = r5.e;
        r0 = r7.a;
        r0 = r0 & 32;
        if (r0 == 0) goto L_0x002b;
    L_0x0025:
        r1 = r7.f;
        if (r1 != 0) goto L_0x002b;
    L_0x0029:
        r1 = defpackage.arml.f;
    L_0x002b:
        r0 = r5.a;
        r0 = defpackage.aabb.a(r1, r0, r3);
        defpackage.xpr.a(r6, r0);
        r6 = r7.a;
        r0 = 8;
        r6 = r6 & r0;
        if (r6 == 0) goto L_0x0088;
    L_0x003b:
        r6 = r7.d;
        if (r6 != 0) goto L_0x0041;
    L_0x003f:
        r6 = defpackage.arwf.c;
    L_0x0041:
        r6 = r6.b;
        r6 = defpackage.arwh.a(r6);
        if (r6 != 0) goto L_0x004b;
    L_0x0049:
        r6 = defpackage.arwh.UNKNOWN;
    L_0x004b:
        r1 = defpackage.arwh.UNKNOWN;
        if (r6 == r1) goto L_0x0088;
    L_0x004f:
        r6 = r5.c;
        r1 = r7.d;
        if (r1 != 0) goto L_0x0057;
    L_0x0055:
        r1 = defpackage.arwf.c;
    L_0x0057:
        r1 = r1.b;
        r1 = defpackage.arwh.a(r1);
        if (r1 != 0) goto L_0x0061;
    L_0x005f:
        r1 = defpackage.arwh.UNKNOWN;
    L_0x0061:
        r6 = r6.a(r1);
        if (r6 == 0) goto L_0x0088;
    L_0x0067:
        r6 = r5.f;
        r6.setVisibility(r3);
        r6 = r5.f;
        r1 = r5.c;
        r2 = r7.d;
        if (r2 != 0) goto L_0x0076;
    L_0x0074:
        r2 = defpackage.arwf.c;
    L_0x0076:
        r2 = r2.b;
        r2 = defpackage.arwh.a(r2);
        if (r2 != 0) goto L_0x0080;
    L_0x007e:
        r2 = defpackage.arwh.UNKNOWN;
    L_0x0080:
        r1 = r1.a(r2);
        r6.setImageResource(r1);
        goto L_0x008d;
    L_0x0088:
        r6 = r5.f;
        r6.setVisibility(r0);
    L_0x008d:
        r6 = r5.g;
        if (r6 != 0) goto L_0x0093;
    L_0x0091:
        goto L_0x0107;
    L_0x0093:
        r6 = r7.g;
        r6 = r6.size();
        if (r6 == 0) goto L_0x0102;
    L_0x009b:
        r6 = r5.g;
        r6.setVisibility(r3);
        r6 = 0;
    L_0x00a1:
        r0 = r7.g;
        r0 = r0.size();
        if (r6 >= r0) goto L_0x0107;
    L_0x00a9:
        r0 = r7.g;
        r0 = r0.get(r6);
        r0 = (defpackage.aphj) r0;
        r0 = r0.a;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x00ff;
    L_0x00b7:
        r0 = r7.g;
        r0 = r0.get(r6);
        r0 = (defpackage.aphj) r0;
        r0 = r0.b;
        if (r0 != 0) goto L_0x00c5;
    L_0x00c3:
        r0 = defpackage.aphg.s;
    L_0x00c5:
        r1 = r5.g;
        r1 = r1.getContext();
        r1 = android.view.LayoutInflater.from(r1);
        r2 = 2131034847; // 0x7f0502df float:1.7680223E38 double:1.052871108E-314;
        r4 = r5.g;
        r1 = r1.inflate(r2, r4, r3);
        r1 = (android.widget.Button) r1;
        r2 = r0.g;
        if (r2 != 0) goto L_0x00e0;
    L_0x00de:
        r2 = defpackage.arml.f;
    L_0x00e0:
        r2 = defpackage.ajqy.a(r2);
        r1.setText(r2);
        r2 = r5.a;
        if (r2 != 0) goto L_0x00ec;
    L_0x00eb:
        goto L_0x00fa;
    L_0x00ec:
        r2 = r0.a;
        r2 = r2 & 4096;
        if (r2 == 0) goto L_0x00fa;
    L_0x00f2:
        r2 = new abtk;
        r2.<init>(r5, r0);
        r1.setOnClickListener(r2);
    L_0x00fa:
        r0 = r5.g;
        r0.addView(r1);
    L_0x00ff:
        r6 = r6 + 1;
        goto L_0x00a1;
    L_0x0102:
        r6 = r5.g;
        r6.setVisibility(r0);
    L_0x0107:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abtl.a_(akor, java.lang.Object):void");
    }
}
