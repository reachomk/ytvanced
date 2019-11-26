package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

/* renamed from: agi */
class agi extends Drawable implements Callback {
    public agn a;
    public Drawable b;
    public int c = 255;
    public int d = -1;
    private Rect e;
    private Drawable f;
    private boolean g;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private agk l;

    agi() {
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    public boolean getPadding(Rect rect) {
        Rect rect2;
        boolean padding;
        agn agn = this.a;
        if (agn.g) {
            rect2 = null;
        } else {
            rect2 = agn.i;
            if (rect2 == null && !agn.h) {
                agn.c();
                rect2 = new Rect();
                int i = agn.f;
                Drawable[] drawableArr = agn.e;
                Rect rect3 = null;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect2)) {
                        if (rect3 == null) {
                            rect3 = new Rect(0, 0, 0, 0);
                        }
                        if (rect2.left > rect3.left) {
                            rect3.left = rect2.left;
                        }
                        if (rect2.top > rect3.top) {
                            rect3.top = rect2.top;
                        }
                        if (rect2.right > rect3.right) {
                            rect3.right = rect2.right;
                        }
                        if (rect2.bottom > rect3.bottom) {
                            rect3.bottom = rect2.bottom;
                        }
                    }
                }
                agn.h = true;
                agn.i = rect3;
                rect2 = rect3;
            }
        }
        if (rect2 == null) {
            Drawable drawable = this.b;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        } else {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        }
        if (isAutoMirrored() && st.f(this) == 1) {
            int i3 = rect.left;
            rect.left = rect.right;
            rect.right = i3;
        }
        return padding;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
        if (!this.g || this.c != i) {
            this.g = true;
            this.c = i;
            Drawable drawable = this.b;
            if (drawable == null) {
                return;
            }
            if (this.j == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    public int getAlpha() {
        return this.c;
    }

    public void setDither(boolean z) {
        agn agn = this.a;
        if (agn.t != z) {
            agn.t = z;
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        agn agn = this.a;
        agn.z = true;
        if (agn.y != colorFilter) {
            agn.y = colorFilter;
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        agn agn = this.a;
        agn.C = true;
        if (agn.A != colorStateList) {
            agn.A = colorStateList;
            st.a(this.b, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        agn agn = this.a;
        agn.D = true;
        if (agn.B != mode) {
            agn.B = mode;
            st.a(this.b, mode);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean isStateful() {
        agn agn = this.a;
        if (agn.r) {
            return agn.s;
        }
        agn.c();
        int i = agn.f;
        Drawable[] drawableArr = agn.e;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            }
        }
        agn.s = z;
        agn.r = true;
        return z;
    }

    public void setAutoMirrored(boolean z) {
        agn agn = this.a;
        if (agn.x != z) {
            agn.x = z;
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.a.x;
    }

    public void jumpToCurrentState() {
        Object obj;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f = null;
            obj = 1;
        } else {
            obj = null;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.b.setAlpha(this.c);
            }
        }
        if (this.k != 0) {
            this.k = 0;
            obj = 1;
        }
        if (this.j != 0) {
            this.j = 0;
        } else if (obj == null) {
            return;
        }
        invalidateSelf();
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            st.a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.e;
        if (rect == null) {
            this.e = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            st.a(drawable, i, i2, i3, i4);
        }
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        drawable = this.b;
        if (drawable == null) {
            return false;
        }
        return drawable.setState(iArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        drawable = this.b;
        if (drawable == null) {
            return false;
        }
        return drawable.setLevel(i);
    }

    public boolean onLayoutDirectionChanged(int i) {
        agn agn = this.a;
        int i2 = this.d;
        int i3 = agn.f;
        Drawable[] drawableArr = agn.e;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        agn.u = i;
        return z;
    }

    public int getIntrinsicWidth() {
        agn agn = this.a;
        if (agn.j) {
            if (!agn.k) {
                agn.d();
            }
            return agn.l;
        }
        Drawable drawable = this.b;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getIntrinsicHeight() {
        agn agn = this.a;
        if (agn.j) {
            if (!agn.k) {
                agn.d();
            }
            return agn.m;
        }
        Drawable drawable = this.b;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getMinimumWidth() {
        agn agn = this.a;
        if (agn.j) {
            if (!agn.k) {
                agn.d();
            }
            return agn.n;
        }
        Drawable drawable = this.b;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getMinimumHeight() {
        agn agn = this.a;
        if (agn.j) {
            if (!agn.k) {
                agn.d();
            }
            return agn.o;
        }
        Drawable drawable = this.b;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public void invalidateDrawable(Drawable drawable) {
        agn agn = this.a;
        if (agn != null) {
            agn.b();
        }
        if (drawable == this.b && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.b && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.b && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        drawable = this.b;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        return visible;
    }

    public int getOpacity() {
        Drawable drawable = this.b;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        int i2;
        agn agn = this.a;
        if (agn.p) {
            i2 = agn.q;
        } else {
            agn.c();
            int i3 = agn.f;
            Drawable[] drawableArr = agn.e;
            if (i3 > 0) {
                i = drawableArr[0].getOpacity();
            }
            int i4 = i;
            for (i = 1; i < i3; i++) {
                i4 = Drawable.resolveOpacity(i4, drawableArr[i].getOpacity());
            }
            agn.q = i4;
            agn.p = true;
            i2 = i4;
        }
        return i2;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    public final boolean a(int r10) {
        /*
        r9 = this;
        r0 = r9.d;
        r1 = 0;
        if (r10 == r0) goto L_0x007c;
    L_0x0005:
        r2 = android.os.SystemClock.uptimeMillis();
        r0 = r9.a;
        r0 = r0.w;
        r4 = 0;
        r5 = 0;
        if (r0 <= 0) goto L_0x002d;
    L_0x0012:
        r0 = r9.f;
        if (r0 == 0) goto L_0x0019;
    L_0x0016:
        r0.setVisible(r1, r1);
    L_0x0019:
        r0 = r9.b;
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r9.f = r0;
        r0 = r9.a;
        r0 = r0.w;
        r0 = (long) r0;
        r0 = r0 + r2;
        r9.k = r0;
        goto L_0x0034;
    L_0x0028:
        r9.f = r4;
        r9.k = r5;
        goto L_0x0034;
    L_0x002d:
        r0 = r9.b;
        if (r0 == 0) goto L_0x0034;
    L_0x0031:
        r0.setVisible(r1, r1);
    L_0x0034:
        if (r10 < 0) goto L_0x0054;
    L_0x0036:
        r0 = r9.a;
        r1 = r0.f;
        if (r10 >= r1) goto L_0x0054;
    L_0x003c:
        r0 = r0.b(r10);
        r9.b = r0;
        r9.d = r10;
        if (r0 == 0) goto L_0x0059;
    L_0x0046:
        r10 = r9.a;
        r10 = r10.v;
        if (r10 <= 0) goto L_0x0050;
    L_0x004c:
        r7 = (long) r10;
        r2 = r2 + r7;
        r9.j = r2;
    L_0x0050:
        r9.a(r0);
        goto L_0x0059;
    L_0x0054:
        r9.b = r4;
        r10 = -1;
        r9.d = r10;
    L_0x0059:
        r0 = r9.j;
        r10 = 1;
        r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r2 != 0) goto L_0x0066;
    L_0x0060:
        r0 = r9.k;
        r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r2 == 0) goto L_0x0078;
    L_0x0066:
        r0 = r9.i;
        if (r0 != 0) goto L_0x0072;
    L_0x006a:
        r0 = new agl;
        r0.<init>(r9);
        r9.i = r0;
        goto L_0x0075;
    L_0x0072:
        r9.unscheduleSelf(r0);
    L_0x0075:
        r9.a(r10);
    L_0x0078:
        r9.invalidateSelf();
        return r10;
    L_0x007c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agi.a(int):boolean");
    }

    private final void a(Drawable drawable) {
        if (this.l == null) {
            this.l = new agk();
        }
        agk agk = this.l;
        agk.a = drawable.getCallback();
        drawable.setCallback(agk);
        try {
            if (this.a.v <= 0 && this.g) {
                drawable.setAlpha(this.c);
            }
            agn agn = this.a;
            if (agn.z) {
                drawable.setColorFilter(agn.y);
            } else {
                if (agn.C) {
                    st.a(drawable, agn.A);
                }
                agn = this.a;
                if (agn.D) {
                    st.a(drawable, agn.B);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.t);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.a.x);
            Rect rect = this.e;
            if (VERSION.SDK_INT >= 21) {
                if (rect != null) {
                    drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
                }
            }
            drawable.setCallback(this.l.a());
        } catch (Throwable th) {
            drawable.setCallback(this.l.a());
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A:{SKIP} */
    public final void a(boolean r14) {
        /*
        r13 = this;
        r0 = 1;
        r13.g = r0;
        r1 = android.os.SystemClock.uptimeMillis();
        r3 = r13.b;
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r6 = 0;
        r7 = 0;
        if (r3 == 0) goto L_0x0038;
    L_0x0010:
        r9 = r13.j;
        r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r11 == 0) goto L_0x003a;
    L_0x0016:
        r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1));
        if (r11 <= 0) goto L_0x0030;
    L_0x001a:
        r9 = r9 - r1;
        r9 = r9 * r4;
        r10 = (int) r9;
        r9 = r13.a;
        r9 = r9.v;
        r10 = r10 / r9;
        r9 = 255 - r10;
        r10 = r13.c;
        r9 = r9 * r10;
        r9 = r9 / 255;
        r3.setAlpha(r9);
        r3 = 1;
        goto L_0x003b;
    L_0x0030:
        r9 = r13.c;
        r3.setAlpha(r9);
        r13.j = r7;
        goto L_0x003a;
    L_0x0038:
        r13.j = r7;
    L_0x003a:
        r3 = 0;
    L_0x003b:
        r9 = r13.f;
        if (r9 == 0) goto L_0x0065;
    L_0x003f:
        r10 = r13.k;
        r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1));
        if (r12 == 0) goto L_0x0067;
    L_0x0045:
        r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1));
        if (r12 <= 0) goto L_0x005c;
    L_0x0049:
        r10 = r10 - r1;
        r10 = r10 * r4;
        r3 = (int) r10;
        r4 = r13.a;
        r4 = r4.w;
        r3 = r3 / r4;
        r4 = r13.c;
        r3 = r3 * r4;
        r3 = r3 / 255;
        r9.setAlpha(r3);
        goto L_0x0068;
    L_0x005c:
        r9.setVisible(r6, r6);
        r0 = 0;
        r13.f = r0;
        r13.k = r7;
        goto L_0x0067;
    L_0x0065:
        r13.k = r7;
    L_0x0067:
        r0 = r3;
    L_0x0068:
        if (r14 == 0) goto L_0x0074;
    L_0x006a:
        if (r0 == 0) goto L_0x0074;
    L_0x006c:
        r14 = r13.i;
        r3 = 16;
        r1 = r1 + r3;
        r13.scheduleSelf(r14, r1);
    L_0x0074:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agi.a(boolean):void");
    }

    public Drawable getCurrent() {
        return this.b;
    }

    public void applyTheme(Theme theme) {
        agn agn = this.a;
        if (theme != null) {
            agn.c();
            int i = agn.f;
            Drawable[] drawableArr = agn.e;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    agn.d |= drawableArr[i2].getChangingConfigurations();
                }
            }
            agn.a(theme.getResources());
        }
    }

    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final ConstantState getConstantState() {
        if (!this.a.e()) {
            return null;
        }
        this.a.c = getChangingConfigurations();
        return this.a;
    }

    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            agn b = b();
            b.a();
            a(b);
            this.h = true;
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public agn b() {
        return this.a;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(agn agn) {
        this.a = agn;
        int i = this.d;
        if (i >= 0) {
            this.b = agn.b(i);
            Drawable drawable = this.b;
            if (drawable != null) {
                a(drawable);
            }
        }
        this.f = null;
    }

    static int a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        return i == 0 ? 160 : i;
    }
}
