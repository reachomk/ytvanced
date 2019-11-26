package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.youtube.R;

/* renamed from: hes */
public final class hes extends adt {
    private final /* synthetic */ MdxWatchDrawerLayout a;

    public final boolean a(View view, int i) {
        return view == this.a.d;
    }

    public final int a() {
        return this.a.h;
    }

    public final int d(View view, int i) {
        int paddingTop = this.a.getPaddingTop();
        return Math.min(Math.max(i, paddingTop), this.a.h);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (r4 <= (r3 / 2)) goto L_0x001c;
     */
    public final void a(android.view.View r2, float r3, float r4) {
        /*
        r1 = this;
        r2 = 0;
        r3 = 1137180672; // 0x43c80000 float:400.0 double:5.61841903E-315;
        r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x000c;
    L_0x0007:
        r3 = r1.a;
        r3 = r3.h;
        goto L_0x001d;
    L_0x000c:
        r3 = -1010302976; // 0xffffffffc3c80000 float:-400.0 double:NaN;
        r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r3 < 0) goto L_0x001c;
    L_0x0012:
        r3 = r1.a;
        r4 = r3.g;
        r3 = r3.h;
        r0 = r3 / 2;
        if (r4 > r0) goto L_0x001d;
    L_0x001c:
        r3 = 0;
    L_0x001d:
        r4 = r1.a;
        r4 = r4.c;
        r2 = r4.a(r2, r3);
        if (r2 == 0) goto L_0x002c;
    L_0x0027:
        r2 = r1.a;
        defpackage.abe.e(r2);
    L_0x002c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hes.a(android.view.View, float, float):void");
    }

    public final void a(View view, int i, int i2, int i3) {
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a;
        hex hex = mdxWatchDrawerLayout.b;
        if (hex != null) {
            hex.a(1.0f - (((float) i2) / ((float) mdxWatchDrawerLayout.h)));
        }
        this.a.a(i2, false);
    }

    public final void a(int i) {
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a;
        boolean z = i != 0;
        mdxWatchDrawerLayout.j = z;
        if (!z) {
            if (mdxWatchDrawerLayout.l) {
                if (xrn.c(mdxWatchDrawerLayout.getContext())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
                    obtain.setContentDescription(mdxWatchDrawerLayout.getContext().getString(R.string.mdx_minibar_accessibility_queue_opened_action));
                    xrn.a(mdxWatchDrawerLayout.getContext(), obtain);
                    mdxWatchDrawerLayout.a(false);
                }
                InputMethodManager inputMethodManager = (InputMethodManager) mdxWatchDrawerLayout.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(mdxWatchDrawerLayout.getWindowToken(), 0);
                }
                mdxWatchDrawerLayout.f.requestFocus();
                return;
            }
            if (mdxWatchDrawerLayout.k) {
                mdxWatchDrawerLayout.k = false;
                mdxWatchDrawerLayout.b();
            }
            MdxWatchDrawerLayout mdxWatchDrawerLayout2 = this.a;
            if (xrn.c(mdxWatchDrawerLayout2.getContext())) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain(32);
                obtain2.setContentDescription(mdxWatchDrawerLayout2.getContext().getString(R.string.mdx_minibar_accessibility_queue_closed_action));
                xrn.a(mdxWatchDrawerLayout2.getContext(), obtain2);
                mdxWatchDrawerLayout2.a(true);
            }
            mdxWatchDrawerLayout2.e.requestFocus();
        }
    }

    public /* synthetic */ hes(MdxWatchDrawerLayout mdxWatchDrawerLayout) {
        this.a = mdxWatchDrawerLayout;
    }
}
