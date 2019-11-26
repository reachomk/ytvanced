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

/* renamed from: agd */
public final class agd extends agp implements sw {
    private agf e;
    private agj f;
    private int g;
    private int h;
    private boolean i;

    public agd() {
        this(null, null);
    }

    public final boolean isStateful() {
        return true;
    }

    agd(agf agf, Resources resources) {
        super((byte) 0);
        this.g = -1;
        this.h = -1;
        a(new agf(agf, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x020d A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f5  */
    /* JADX WARNING: Missing block: B:41:0x0141, code skipped:
            throw new org.xmlpull.v1.XmlPullParserException(r1.toString());
     */
    public static defpackage.agd a(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
        r0 = r17;
        r1 = r18;
        r2 = r20;
        r3 = r21;
        r4 = r19.getName();
        r5 = "animated-selector";
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x022e;
    L_0x0014:
        r4 = new agd;
        r4.<init>();
        r5 = defpackage.agq.a;
        r5 = defpackage.sd.a(r1, r3, r2, r5);
        r6 = defpackage.agq.g;
        r7 = 1;
        r6 = r5.getBoolean(r6, r7);
        r4.setVisible(r6, r7);
        r6 = r4.e;
        r8 = android.os.Build.VERSION.SDK_INT;
        r9 = 21;
        if (r8 < r9) goto L_0x003a;
    L_0x0031:
        r8 = r6.c;
        r10 = r5.getChangingConfigurations();
        r8 = r8 | r10;
        r6.c = r8;
    L_0x003a:
        r8 = defpackage.agq.f;
        r10 = r6.g;
        r8 = r5.getBoolean(r8, r10);
        r6.g = r8;
        r8 = defpackage.agq.b;
        r10 = r6.j;
        r8 = r5.getBoolean(r8, r10);
        r6.j = r8;
        r8 = defpackage.agq.d;
        r10 = r6.v;
        r8 = r5.getInt(r8, r10);
        r6.v = r8;
        r8 = defpackage.agq.e;
        r10 = r6.w;
        r8 = r5.getInt(r8, r10);
        r6.w = r8;
        r8 = defpackage.agq.c;
        r6 = r6.t;
        r6 = r5.getBoolean(r8, r6);
        super.setDither(r6);
        r6 = r4.a;
        r6.a(r1);
        r5.recycle();
        r5 = r19.getDepth();
        r5 = r5 + r7;
    L_0x007a:
        r6 = r19.next();
        if (r6 == r7) goto L_0x0226;
    L_0x0080:
        r8 = r19.getDepth();
        if (r8 >= r5) goto L_0x0089;
    L_0x0086:
        r10 = 3;
        if (r6 == r10) goto L_0x0226;
    L_0x0089:
        r10 = 2;
        if (r6 != r10) goto L_0x007a;
    L_0x008c:
        if (r8 > r5) goto L_0x007a;
    L_0x008e:
        r6 = r19.getName();
        r8 = "item";
        r6 = r6.equals(r8);
        r8 = 4;
        r11 = 0;
        r12 = 0;
        r13 = -1;
        if (r6 != 0) goto L_0x015b;
    L_0x009e:
        r6 = r19.getName();
        r14 = "transition";
        r6 = r6.equals(r14);
        if (r6 == 0) goto L_0x007a;
    L_0x00aa:
        r6 = defpackage.agq.k;
        r6 = defpackage.sd.a(r1, r3, r2, r6);
        r14 = defpackage.agq.m;
        r14 = r6.getResourceId(r14, r13);
        r15 = defpackage.agq.o;
        r15 = r6.getResourceId(r15, r13);
        r7 = defpackage.agq.l;
        r7 = r6.getResourceId(r7, r13);
        if (r7 <= 0) goto L_0x00cc;
    L_0x00c4:
        r11 = defpackage.aqk.a();
        r11 = r11.a(r0, r7);
    L_0x00cc:
        r7 = defpackage.agq.n;
        r7 = r6.getBoolean(r7, r12);
        r6.recycle();
        r6 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (r11 != 0) goto L_0x0119;
    L_0x00d9:
        r11 = r19.next();
        if (r11 == r8) goto L_0x00d9;
    L_0x00df:
        if (r11 != r10) goto L_0x0100;
    L_0x00e1:
        r8 = r19.getName();
        r10 = "animated-vector";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x00f2;
    L_0x00ed:
        r11 = defpackage.lq.a(r17, r18, r19, r20, r21);
        goto L_0x0119;
    L_0x00f2:
        r8 = android.os.Build.VERSION.SDK_INT;
        if (r8 < r9) goto L_0x00fb;
    L_0x00f6:
        r11 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21);
        goto L_0x0119;
    L_0x00fb:
        r11 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20);
        goto L_0x0119;
    L_0x0100:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r19.getPositionDescription();
        r1.append(r2);
        r1.append(r6);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0119:
        if (r11 == 0) goto L_0x0142;
    L_0x011b:
        if (r14 == r13) goto L_0x0127;
    L_0x011d:
        if (r15 == r13) goto L_0x0127;
    L_0x011f:
        r6 = r4.e;
        r6.a(r14, r15, r11, r7);
        r7 = 1;
        goto L_0x007a;
    L_0x0127:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r19.getPositionDescription();
        r1.append(r2);
        r2 = ": <transition> tag requires 'fromId' & 'toId' attributes";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0142:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r19.getPositionDescription();
        r1.append(r2);
        r1.append(r6);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x015b:
        r6 = defpackage.agq.h;
        r6 = defpackage.sd.a(r1, r3, r2, r6);
        r7 = defpackage.agq.j;
        r7 = r6.getResourceId(r7, r12);
        r14 = defpackage.agq.i;
        r13 = r6.getResourceId(r14, r13);
        if (r13 <= 0) goto L_0x0177;
    L_0x016f:
        r11 = defpackage.aqk.a();
        r11 = r11.a(r0, r13);
    L_0x0177:
        r6.recycle();
        r6 = r20.getAttributeCount();
        r13 = new int[r6];
        r14 = 0;
        r15 = 0;
    L_0x0182:
        if (r14 >= r6) goto L_0x01a6;
    L_0x0184:
        r9 = r2.getAttributeNameResource(r14);
        if (r9 == 0) goto L_0x01a0;
    L_0x018a:
        r10 = 16842960; // 0x10100d0 float:2.369414E-38 double:8.321528E-317;
        if (r9 == r10) goto L_0x01a0;
    L_0x018f:
        r10 = 16843161; // 0x1010199 float:2.3694704E-38 double:8.321627E-317;
        if (r9 == r10) goto L_0x01a0;
    L_0x0194:
        r10 = r15 + 1;
        r16 = r2.getAttributeBooleanValue(r14, r12);
        if (r16 != 0) goto L_0x019d;
    L_0x019c:
        r9 = -r9;
    L_0x019d:
        r13[r15] = r9;
        r15 = r10;
    L_0x01a0:
        r14 = r14 + 1;
        r9 = 21;
        r10 = 2;
        goto L_0x0182;
    L_0x01a6:
        r6 = android.util.StateSet.trimStateSet(r13, r15);
        r9 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (r11 != 0) goto L_0x01f1;
    L_0x01ae:
        r10 = r19.next();
        if (r10 == r8) goto L_0x01ae;
    L_0x01b4:
        r12 = 2;
        if (r10 != r12) goto L_0x01d8;
    L_0x01b7:
        r8 = r19.getName();
        r10 = "vector";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x01c8;
    L_0x01c3:
        r11 = defpackage.lz.a(r18, r19, r20, r21);
        goto L_0x01f1;
    L_0x01c8:
        r8 = android.os.Build.VERSION.SDK_INT;
        r10 = 21;
        if (r8 < r10) goto L_0x01d3;
    L_0x01ce:
        r11 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21);
        goto L_0x01f3;
    L_0x01d3:
        r11 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20);
        goto L_0x01f3;
    L_0x01d8:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r19.getPositionDescription();
        r1.append(r2);
        r1.append(r9);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01f1:
        r10 = 21;
    L_0x01f3:
        if (r11 == 0) goto L_0x020d;
    L_0x01f5:
        r8 = r4.e;
        r9 = r8.a(r11);
        r11 = r8.E;
        r11[r9] = r6;
        r6 = r8.b;
        r7 = java.lang.Integer.valueOf(r7);
        r6.b(r9, r7);
        r7 = 1;
        r9 = 21;
        goto L_0x007a;
    L_0x020d:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r19.getPositionDescription();
        r1.append(r2);
        r1.append(r9);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0226:
        r0 = r4.getState();
        r4.onStateChange(r0);
        return r4;
    L_0x022e:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r19.getPositionDescription();
        r1.append(r2);
        r2 = ": invalid animated-selector tag ";
        r1.append(r2);
        r1.append(r4);
        r1 = r1.toString();
        r0.<init>(r1);
        goto L_0x024d;
    L_0x024c:
        throw r0;
    L_0x024d:
        goto L_0x024c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agd.a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):agd");
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        agj agj = this.f;
        if (agj != null && (visible || z2)) {
            if (z) {
                agj.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        agj agj = this.f;
        if (agj != null) {
            agj.b();
            this.f = null;
            a(this.g);
            this.g = -1;
            this.h = -1;
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5 A:{RETURN} */
    /* JADX WARNING: Missing block: B:36:0x00d7, code skipped:
            if (a(r2) == false) goto L_0x0010;
     */
    public final boolean onStateChange(int[] r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r0.e;
        r2 = r2.a(r1);
        r3 = r0.d;
        r4 = 0;
        r5 = 1;
        if (r2 != r3) goto L_0x0013;
    L_0x0010:
        r5 = 0;
        goto L_0x00db;
    L_0x0013:
        r6 = r0.f;
        if (r6 == 0) goto L_0x0035;
    L_0x0017:
        r3 = r0.g;
        if (r2 == r3) goto L_0x00db;
    L_0x001b:
        r3 = r0.h;
        if (r2 != r3) goto L_0x0030;
    L_0x001f:
        r3 = r6.c();
        if (r3 == 0) goto L_0x0030;
    L_0x0025:
        r6.d();
        r3 = r0.h;
        r0.g = r3;
        r0.h = r2;
        goto L_0x00db;
    L_0x0030:
        r3 = r0.g;
        r6.b();
    L_0x0035:
        r6 = 0;
        r0.f = r6;
        r6 = -1;
        r0.h = r6;
        r0.g = r6;
        r6 = r0.e;
        r7 = r6.a(r3);
        r8 = r6.a(r2);
        if (r8 != 0) goto L_0x004b;
    L_0x0049:
        goto L_0x00d3;
    L_0x004b:
        if (r7 == 0) goto L_0x00d3;
    L_0x004d:
        r9 = defpackage.agf.a(r7, r8);
        r11 = r6.a;
        r12 = -1;
        r12 = java.lang.Long.valueOf(r12);
        r9 = r11.a(r9, r12);
        r9 = (java.lang.Long) r9;
        r9 = r9.longValue();
        r10 = (int) r9;
        if (r10 < 0) goto L_0x00d3;
    L_0x0066:
        r13 = defpackage.agf.a(r7, r8);
        r9 = r6.a;
        r9 = r9.a(r13, r12);
        r9 = (java.lang.Long) r9;
        r13 = r9.longValue();
        r15 = 8589934592; // 0x200000000 float:0.0 double:4.243991582E-314;
        r13 = r13 & r15;
        r15 = 0;
        r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));
        if (r9 == 0) goto L_0x0084;
    L_0x0082:
        r9 = 1;
        goto L_0x0085;
    L_0x0084:
        r9 = 0;
    L_0x0085:
        r0.a(r10);
        r10 = r0.b;
        r11 = r10 instanceof android.graphics.drawable.AnimationDrawable;
        if (r11 != 0) goto L_0x00a6;
    L_0x008e:
        r6 = r10 instanceof defpackage.lq;
        if (r6 == 0) goto L_0x009a;
    L_0x0092:
        r4 = new age;
        r10 = (defpackage.lq) r10;
        r4.<init>(r10);
        goto L_0x00c9;
    L_0x009a:
        r6 = r10 instanceof android.graphics.drawable.Animatable;
        if (r6 == 0) goto L_0x00d3;
    L_0x009e:
        r4 = new agc;
        r10 = (android.graphics.drawable.Animatable) r10;
        r4.<init>(r10);
        goto L_0x00c9;
    L_0x00a6:
        r7 = defpackage.agf.a(r7, r8);
        r6 = r6.a;
        r6 = r6.a(r7, r12);
        r6 = (java.lang.Long) r6;
        r6 = r6.longValue();
        r11 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r6 = r6 & r11;
        r8 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1));
        if (r8 == 0) goto L_0x00c1;
    L_0x00c0:
        r4 = 1;
    L_0x00c1:
        r6 = new agh;
        r10 = (android.graphics.drawable.AnimationDrawable) r10;
        r6.<init>(r10, r4, r9);
        r4 = r6;
    L_0x00c9:
        r4.a();
        r0.f = r4;
        r0.h = r3;
        r0.g = r2;
        goto L_0x00db;
    L_0x00d3:
        r2 = r0.a(r2);
        if (r2 != 0) goto L_0x00db;
    L_0x00d9:
        goto L_0x0010;
    L_0x00db:
        r2 = r0.b;
        if (r2 == 0) goto L_0x00e5;
    L_0x00df:
        r1 = r2.setState(r1);
        r1 = r1 | r5;
        return r1;
    L_0x00e5:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agd.onStateChange(int[]):boolean");
    }

    public final Drawable mutate() {
        if (!this.i) {
            super.mutate();
            this.e.a();
            this.i = true;
        }
        return this;
    }

    private final agf c() {
        return new agf(this.e, this, null);
    }

    /* Access modifiers changed, original: final */
    public final void a(agn agn) {
        super.a(agn);
        if (agn instanceof agf) {
            this.e = (agf) agn;
        }
    }

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ ago a() {
        return c();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ agn b() {
        return c();
    }

    public final /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public final /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public final /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public final /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public final /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public final /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public final /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public final /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public final /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public final /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public final /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public final /* bridge */ /* synthetic */ int getAlpha() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public final /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public final /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    static {
        agd.class.getSimpleName();
    }
}
