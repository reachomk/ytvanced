package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* renamed from: kky */
public final class kky {
    private final akpb a;
    private final LinearLayout b;
    private final akne c;
    private final int d;
    private final boolean e;
    private WeakReference f;
    private int g;
    private kes h;

    public kky(Context context, akpb akpb, LinearLayout linearLayout) {
        this(context, akpb, linearLayout, false);
    }

    public kky(Context context, akpb akpb, LinearLayout linearLayout, boolean z) {
        klb klb = new klb(context, akpb);
        this.a = akpb;
        this.b = linearLayout;
        this.c = klb;
        this.e = z;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.slim_metadata_row_divider_margin);
        b(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x009b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    public final void a(defpackage.akor r8, defpackage.auxl r9, boolean r10) {
        /*
        r7 = this;
        r0 = r7.f;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = r0.get();
        r0 = (defpackage.auxl) r0;
        goto L_0x000d;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0012;
    L_0x0010:
        if (r9 == 0) goto L_0x00ad;
    L_0x0012:
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x001d;
    L_0x0015:
        r0 = r0.equals(r9);
        if (r0 == 0) goto L_0x001d;
    L_0x001b:
        goto L_0x00ad;
    L_0x001d:
        r0 = new java.lang.ref.WeakReference;
        r0.<init>(r9);
        r7.f = r0;
        r0 = r9.b;
        r2 = r0.isEmpty();
        if (r2 != 0) goto L_0x00ac;
    L_0x002c:
        r2 = 0;
        r3 = 0;
    L_0x002e:
        r4 = r0.size();
        if (r3 >= r4) goto L_0x009e;
    L_0x0034:
        r4 = r0.get(r3);
        r4 = (defpackage.auxr) r4;
        if (r4 == 0) goto L_0x005c;
    L_0x003c:
        r5 = r4.a;
        r6 = 71300886; // 0x43ff716 float:2.2565398E-36 double:3.52273183E-316;
        if (r5 != r6) goto L_0x0048;
    L_0x0043:
        r4 = r4.b;
        r4 = (defpackage.auxp) r4;
        goto L_0x005d;
    L_0x0048:
        r6 = 172034876; // 0xa410b3c float:9.294725E-33 double:8.4996522E-316;
        if (r5 != r6) goto L_0x0052;
    L_0x004d:
        r4 = r4.b;
        r4 = (defpackage.auxn) r4;
        goto L_0x005d;
    L_0x0052:
        r6 = 206077025; // 0xc487c61 float:1.5444868E-31 double:1.018155784E-315;
        if (r5 != r6) goto L_0x005c;
    L_0x0057:
        r4 = r4.b;
        r4 = (defpackage.auxx) r4;
        goto L_0x005d;
    L_0x005c:
        r4 = r1;
    L_0x005d:
        if (r4 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x009b;
    L_0x0060:
        r5 = r7.a;
        r5 = r5.a(r4);
        r6 = -1;
        if (r5 == r6) goto L_0x009b;
    L_0x0069:
        r5 = r4 instanceof defpackage.auxn;
        if (r5 == 0) goto L_0x0078;
    L_0x006d:
        r5 = r4;
        r5 = (defpackage.auxn) r5;
        r5 = r5.c;
        if (r5 != 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0078;
    L_0x0075:
        r7.a(r8);
    L_0x0078:
        r5 = r7.c;
        r5 = r5.a(r8, r4);
        r7.a(r5, r2);
        r5 = r4 instanceof defpackage.auxp;
        if (r5 == 0) goto L_0x008f;
    L_0x0085:
        r4 = (defpackage.auxp) r4;
        r4 = r4.d;
        if (r4 != 0) goto L_0x008c;
    L_0x008b:
        goto L_0x008f;
    L_0x008c:
        r7.a(r8);
    L_0x008f:
        r4 = r9.c;
        if (r3 >= r4) goto L_0x009b;
    L_0x0093:
        r4 = r7.b;
        r4 = r4.getChildCount();
        r7.g = r4;
    L_0x009b:
        r3 = r3 + 1;
        goto L_0x002e;
    L_0x009e:
        r8 = r8.a;
        r9 = r9.d;
        r9 = r9.d();
        r8.a(r9, r1);
        r7.a(r10);
    L_0x00ac:
        return;
    L_0x00ad:
        r7.a(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kky.a(akor, auxl, boolean):void");
    }

    public final void a() {
        this.g = 0;
        this.f = null;
        this.c.a(this.b);
        b(false);
    }

    private final void a(akor akor) {
        if (this.h == null) {
            this.h = new kes();
        }
        a(this.c.a(akor, this.h), true);
    }

    private final void a(View view, boolean z) {
        MarginLayoutParams marginLayoutParams;
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        } else {
            marginLayoutParams = new LayoutParams(-1, -2);
        }
        int i = z ? this.d : 0;
        if (z) {
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i;
        }
        view.setLayoutParams(marginLayoutParams);
        this.b.addView(view);
    }

    private final void a(boolean z) {
        int i = 0;
        int i2 = 0;
        while (i < this.b.getChildCount()) {
            boolean z2 = true;
            if (z && i >= this.g) {
                z2 = false;
            }
            xpr.a(this.b.getChildAt(i), z2);
            i2 |= z2;
            i++;
        }
        b(i2);
    }

    private final void b(boolean z) {
        if (this.e) {
            xpr.a(this.b, z);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = !z ? 1 : -2;
            this.b.setLayoutParams(layoutParams);
        }
    }
}
