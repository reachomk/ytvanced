package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: flu */
public final class flu implements akou {
    public final eza a;
    public View b;
    private OnClickListener c;
    private boolean d;

    public flu(Context context) {
        this(context, false);
    }

    public flu(Context context, boolean z) {
        amqw.a((Object) context);
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        this.a = new eza(context.getTheme().resolveAttribute(!z ? R.attr.selectableItemBackground : R.attr.selectableItemBackgroundSolid, typedValue, true) ? ra.a(context, typedValue.resourceId) : null, xwe.a(context, R.attr.listItemChrome, 0), resources.getDimensionPixelSize(R.dimen.line_separator_height));
    }

    public final void a(View view) {
        amqw.a((Object) view);
        this.b = view;
        this.b.setOnClickListener(this.c);
        this.b.setClickable(this.d);
    }

    public final View a() {
        return this.b;
    }

    public final void a(OnClickListener onClickListener) {
        this.c = onClickListener;
        View view = this.b;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void a(boolean z) {
        this.d = z;
        View view = this.b;
        if (view != null) {
            view.setClickable(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Missing block: B:10:0x002d, code skipped:
            if (r4.a("showLineSeparator", false) == false) goto L_0x002f;
     */
    public final android.view.View a(defpackage.akor r4) {
        /*
        r3 = this;
        r0 = r3.b;
        defpackage.amqw.a(r0);
        r0 = defpackage.akno.a(r4);
        r0 = r0.a();
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x002f;
    L_0x0011:
        r0 = "lineSeparatorOverride";
        r0 = r4.a(r0, r2);
        if (r0 == 0) goto L_0x0027;
    L_0x0019:
        if (r0 == r1) goto L_0x0030;
    L_0x001b:
        r1 = 2;
        if (r0 != r1) goto L_0x001f;
    L_0x001e:
        goto L_0x002f;
    L_0x001f:
        r4 = new java.lang.IllegalArgumentException;
        r0 = "LineSeparatorOverrideOps not supported";
        r4.<init>(r0);
        throw r4;
    L_0x0027:
        r0 = "showLineSeparator";
        r0 = r4.a(r0, r2);
        if (r0 != 0) goto L_0x0030;
    L_0x002f:
        r1 = 0;
    L_0x0030:
        r0 = r3.a;
        r0.a(r1);
        r0 = "setBackgroundColor";
        r4 = r4.a(r0, r2);
        r0 = r3.a;
        r1 = r0.a;
        if (r1 == r4) goto L_0x0046;
    L_0x0041:
        r0.a = r4;
        r0.invalidateSelf();
    L_0x0046:
        r4 = r3.b;
        r0 = r3.a;
        defpackage.xpv.a(r4, r0);
        r4 = r3.b;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flu.a(akor):android.view.View");
    }

    public final void a(int i) {
        this.a.b(i);
    }
}
