package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: lz */
public final class lz extends ma {
    public static final Mode a = Mode.SRC_IN;
    public mi b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    lz() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new mi();
    }

    lz(mi miVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = miVar;
        this.d = a(miVar.c, miVar.d);
    }

    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new mi(this.b);
            this.g = true;
        }
        return this;
    }

    public final ConstantState getConstantState() {
        if (this.e != null && VERSION.SDK_INT >= 24) {
            return new mh(this.e.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter = this.f;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float abs = Math.abs(this.h[0]);
            float abs2 = Math.abs(this.h[4]);
            float abs3 = Math.abs(this.h[1]);
            float abs4 = Math.abs(this.h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = this.j.width();
            int height = this.j.height();
            int min = Math.min(2048, (int) (((float) width) * abs));
            int min2 = Math.min(2048, (int) (((float) height) * abs2));
            if (min > 0 && min2 > 0) {
                mi miVar;
                Paint paint;
                width = canvas.save();
                canvas.translate((float) this.j.left, (float) this.j.top);
                if (VERSION.SDK_INT >= 17 && isAutoMirrored() && st.f(this) == 1) {
                    canvas.translate((float) this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                mi miVar2 = this.b;
                Bitmap bitmap = miVar2.f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == miVar2.f.getHeight())) {
                    miVar2.f = Bitmap.createBitmap(min, min2, Config.ARGB_8888);
                    miVar2.k = true;
                }
                if (this.c) {
                    miVar2 = this.b;
                    if (!(!miVar2.k && miVar2.g == miVar2.c && miVar2.h == miVar2.d && miVar2.j == miVar2.e && miVar2.i == miVar2.b.getRootAlpha())) {
                        this.b.a(min, min2);
                        miVar = this.b;
                        miVar.g = miVar.c;
                        miVar.h = miVar.d;
                        miVar.i = miVar.b.getRootAlpha();
                        miVar.j = miVar.e;
                        miVar.k = false;
                    }
                } else {
                    this.b.a(min, min2);
                }
                miVar = this.b;
                Rect rect = this.j;
                if (miVar.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (miVar.l == null) {
                        miVar.l = new Paint();
                        miVar.l.setFilterBitmap(true);
                    }
                    miVar.l.setAlpha(miVar.b.getRootAlpha());
                    miVar.l.setColorFilter(colorFilter);
                    paint = miVar.l;
                }
                canvas.drawBitmap(miVar.f, null, rect, paint);
                canvas.restoreToCount(width);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return this.b.b.getRootAlpha();
        }
        return drawable.getAlpha();
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return st.b(drawable);
        }
        return this.f;
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        return (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, colorStateList);
            return;
        }
        mi miVar = this.b;
        if (miVar.c != colorStateList) {
            miVar.c = colorStateList;
            this.d = a(colorStateList, miVar.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, mode);
            return;
        }
        mi miVar = this.b;
        if (miVar.d != mode) {
            miVar.d = mode;
            this.d = a(miVar.c, mode);
            invalidateSelf();
        }
    }

    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        boolean z = true;
        if (!super.isStateful()) {
            mi miVar = this.b;
            if (miVar != null) {
                if (!miVar.a()) {
                    ColorStateList colorStateList = this.b.c;
                    if (colorStateList != null) {
                        if (colorStateList.isStateful()) {
                            return z;
                        }
                        return false;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        mi miVar = this.b;
        ColorStateList colorStateList = miVar.c;
        boolean z = false;
        if (colorStateList != null) {
            Mode mode = miVar.d;
            if (mode != null) {
                this.d = a(colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (miVar.a()) {
            boolean a = miVar.b.d.a(iArr);
            miVar.k |= a;
            if (a) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return -3;
        }
        return drawable.getOpacity();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.b.b.e;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.b.b.f;
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable);
        }
        return false;
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return this.b.e;
        }
        return drawable.isAutoMirrored();
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable == null) {
            this.b.e = z;
        } else {
            drawable.setAutoMirrored(z);
        }
    }

    public static lz a(Resources resources, int i, Theme theme) {
        String str = "parser error";
        String str2 = "VectorDrawableCompat";
        if (VERSION.SDK_INT >= 24) {
            lz lzVar = new lz();
            lzVar.e = rz.a(resources, i, theme);
            mh mhVar = new mh(lzVar.e.getConstantState());
            return lzVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                int next = xml.next();
                if (next == 2) {
                    return lz.a(resources, xml, asAttributeSet, theme);
                }
                if (next == 1) {
                    throw new XmlPullParserException("No start tag found");
                }
            }
        } catch (XmlPullParserException e) {
            Log.e(str2, str, e);
            return null;
        } catch (IOException e2) {
            Log.e(str2, str, e2);
            return null;
        }
    }

    public static lz a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        lz lzVar = new lz();
        lzVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return lzVar;
    }

    static int a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03d7  */
    public final void inflate(android.content.res.Resources r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21, android.content.res.Resources.Theme r22) {
        /*
        r18 = this;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r4 = r21;
        r5 = r22;
        r0 = r1.e;
        if (r0 == 0) goto L_0x0012;
    L_0x000e:
        defpackage.st.a(r0, r2, r3, r4, r5);
        return;
    L_0x0012:
        r6 = r1.b;
        r0 = new mf;
        r0.<init>();
        r6.b = r0;
        r0 = defpackage.lm.a;
        r7 = defpackage.sd.a(r2, r5, r4, r0);
        r8 = r1.b;
        r9 = r8.b;
        r10 = -1;
        r11 = 6;
        r0 = "tintMode";
        r0 = defpackage.sd.a(r7, r3, r0, r11, r10);
        r12 = android.graphics.PorterDuff.Mode.SRC_IN;
        r13 = 9;
        r14 = 5;
        r15 = 3;
        if (r0 == r15) goto L_0x004c;
    L_0x0035:
        if (r0 == r14) goto L_0x0049;
    L_0x0037:
        if (r0 == r13) goto L_0x0046;
    L_0x0039:
        switch(r0) {
            case 14: goto L_0x0043;
            case 15: goto L_0x0040;
            case 16: goto L_0x003d;
            default: goto L_0x003c;
        };
    L_0x003c:
        goto L_0x004e;
    L_0x003d:
        r12 = android.graphics.PorterDuff.Mode.ADD;
        goto L_0x004e;
    L_0x0040:
        r12 = android.graphics.PorterDuff.Mode.SCREEN;
        goto L_0x004e;
    L_0x0043:
        r12 = android.graphics.PorterDuff.Mode.MULTIPLY;
        goto L_0x004e;
    L_0x0046:
        r12 = android.graphics.PorterDuff.Mode.SRC_ATOP;
        goto L_0x004e;
    L_0x0049:
        r12 = android.graphics.PorterDuff.Mode.SRC_IN;
        goto L_0x004e;
    L_0x004c:
        r12 = android.graphics.PorterDuff.Mode.SRC_OVER;
    L_0x004e:
        r8.d = r12;
        r0 = "tint";
        r0 = defpackage.sd.a(r3, r0);
        r11 = 0;
        r13 = 2;
        r10 = 1;
        if (r0 == 0) goto L_0x00ac;
    L_0x005b:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r7.getValue(r10, r0);
        r12 = r0.type;
        if (r12 == r13) goto L_0x0095;
    L_0x0067:
        r12 = r0.type;
        r13 = 28;
        if (r12 < r13) goto L_0x007b;
    L_0x006d:
        r12 = r0.type;
        r13 = 31;
        if (r12 <= r13) goto L_0x0074;
    L_0x0073:
        goto L_0x007b;
    L_0x0074:
        r0 = r0.data;
        r12 = android.content.res.ColorStateList.valueOf(r0);
        goto L_0x00ad;
    L_0x007b:
        r0 = r7.getResources();
        r12 = r7.getResourceId(r10, r11);
        r12 = r0.getXml(r12);	 Catch:{ Exception -> 0x008c }
        r12 = defpackage.rp.a(r0, r12, r5);	 Catch:{ Exception -> 0x008c }
        goto L_0x00ad;
    L_0x008c:
        r0 = move-exception;
        r12 = "CSLCompat";
        r13 = "Failed to inflate ColorStateList.";
        android.util.Log.e(r12, r13, r0);
        goto L_0x00ac;
    L_0x0095:
        r2 = new java.lang.UnsupportedOperationException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Failed to resolve attribute at index 1: ";
        r3.append(r4);
        r3.append(r0);
        r0 = r3.toString();
        r2.<init>(r0);
        throw r2;
    L_0x00ac:
        r12 = 0;
    L_0x00ad:
        if (r12 == 0) goto L_0x00b1;
    L_0x00af:
        r8.c = r12;
    L_0x00b1:
        r0 = r8.e;
        r12 = "autoMirrored";
        r12 = defpackage.sd.a(r3, r12);
        if (r12 == 0) goto L_0x00bf;
    L_0x00bb:
        r0 = r7.getBoolean(r14, r0);
    L_0x00bf:
        r8.e = r0;
        r0 = r9.g;
        r8 = 7;
        r12 = "viewportWidth";
        r0 = defpackage.sd.a(r7, r3, r12, r8, r0);
        r9.g = r0;
        r0 = r9.h;
        r12 = 8;
        r13 = "viewportHeight";
        r0 = defpackage.sd.a(r7, r3, r13, r12, r0);
        r9.h = r0;
        r13 = r9.g;
        r16 = 0;
        r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1));
        if (r13 <= 0) goto L_0x03d7;
    L_0x00e0:
        r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r0 <= 0) goto L_0x03bc;
    L_0x00e4:
        r0 = r9.e;
        r0 = r7.getDimension(r15, r0);
        r9.e = r0;
        r0 = r9.f;
        r13 = 2;
        r0 = r7.getDimension(r13, r0);
        r9.f = r0;
        r13 = r9.e;
        r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1));
        if (r13 <= 0) goto L_0x03a1;
    L_0x00fb:
        r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r0 <= 0) goto L_0x0386;
    L_0x00ff:
        r0 = r9.getAlpha();
        r13 = 4;
        r14 = "alpha";
        r0 = defpackage.sd.a(r7, r3, r14, r13, r0);
        r9.setAlpha(r0);
        r0 = r7.getString(r11);
        if (r0 == 0) goto L_0x011a;
    L_0x0113:
        r9.i = r0;
        r14 = r9.k;
        r14.put(r0, r9);
    L_0x011a:
        r7.recycle();
        r0 = r18.getChangingConfigurations();
        r6.a = r0;
        r6.k = r10;
        r0 = r1.b;
        r7 = r0.b;
        r9 = new java.util.ArrayDeque;
        r9.<init>();
        r14 = r7.d;
        r9.push(r14);
        r14 = r20.getEventType();
        r17 = r20.getDepth();
        r8 = r17 + 1;
        r17 = 1;
    L_0x013f:
        if (r14 == r10) goto L_0x0371;
    L_0x0141:
        r13 = r20.getDepth();
        if (r13 >= r8) goto L_0x014b;
    L_0x0147:
        if (r14 != r15) goto L_0x014b;
    L_0x0149:
        goto L_0x0371;
    L_0x014b:
        r13 = "group";
        r15 = 2;
        if (r14 != r15) goto L_0x034f;
    L_0x0150:
        r14 = r20.getName();
        r15 = r9.peek();
        r15 = (defpackage.me) r15;
        r12 = "path";
        r12 = r12.equals(r14);
        r10 = "pathData";
        if (r12 == 0) goto L_0x025f;
    L_0x0164:
        r12 = new mb;
        r12.<init>();
        r13 = defpackage.lm.c;
        r13 = defpackage.sd.a(r2, r5, r4, r13);
        r14 = 0;
        r12.a = r14;
        r10 = defpackage.sd.a(r3, r10);
        if (r10 == 0) goto L_0x0238;
    L_0x0178:
        r10 = r13.getString(r11);
        if (r10 == 0) goto L_0x0180;
    L_0x017e:
        r12.n = r10;
    L_0x0180:
        r10 = 2;
        r14 = r13.getString(r10);
        if (r14 != 0) goto L_0x0188;
    L_0x0187:
        goto L_0x018e;
    L_0x0188:
        r10 = defpackage.se.b(r14);
        r12.m = r10;
    L_0x018e:
        r10 = "fillColor";
        r14 = 1;
        r10 = defpackage.sd.a(r13, r3, r5, r10, r14);
        r12.d = r10;
        r10 = 12;
        r14 = r12.f;
        r11 = "fillAlpha";
        r10 = defpackage.sd.a(r13, r3, r11, r10, r14);
        r12.f = r10;
        r10 = "strokeLineCap";
        r11 = 8;
        r14 = -1;
        r10 = defpackage.sd.a(r13, r3, r10, r11, r14);
        r14 = r12.j;
        if (r10 == 0) goto L_0x01bd;
    L_0x01b0:
        r11 = 1;
        if (r10 == r11) goto L_0x01ba;
    L_0x01b3:
        r11 = 2;
        if (r10 == r11) goto L_0x01b7;
    L_0x01b6:
        goto L_0x01bf;
    L_0x01b7:
        r14 = android.graphics.Paint.Cap.SQUARE;
        goto L_0x01bf;
    L_0x01ba:
        r14 = android.graphics.Paint.Cap.ROUND;
        goto L_0x01bf;
    L_0x01bd:
        r14 = android.graphics.Paint.Cap.BUTT;
    L_0x01bf:
        r12.j = r14;
        r10 = "strokeLineJoin";
        r11 = 9;
        r14 = -1;
        r10 = defpackage.sd.a(r13, r3, r10, r11, r14);
        r11 = r12.k;
        if (r10 == 0) goto L_0x01db;
    L_0x01ce:
        r14 = 1;
        if (r10 == r14) goto L_0x01d8;
    L_0x01d1:
        r14 = 2;
        if (r10 == r14) goto L_0x01d5;
    L_0x01d4:
        goto L_0x01dd;
    L_0x01d5:
        r11 = android.graphics.Paint.Join.BEVEL;
        goto L_0x01dd;
    L_0x01d8:
        r11 = android.graphics.Paint.Join.ROUND;
        goto L_0x01dd;
    L_0x01db:
        r11 = android.graphics.Paint.Join.MITER;
    L_0x01dd:
        r12.k = r11;
        r10 = 10;
        r11 = r12.l;
        r14 = "strokeMiterLimit";
        r10 = defpackage.sd.a(r13, r3, r14, r10, r11);
        r12.l = r10;
        r10 = "strokeColor";
        r11 = 3;
        r10 = defpackage.sd.a(r13, r3, r5, r10, r11);
        r12.b = r10;
        r10 = 11;
        r11 = r12.e;
        r14 = "strokeAlpha";
        r10 = defpackage.sd.a(r13, r3, r14, r10, r11);
        r12.e = r10;
        r10 = r12.c;
        r11 = "strokeWidth";
        r14 = 4;
        r10 = defpackage.sd.a(r13, r3, r11, r14, r10);
        r12.c = r10;
        r10 = r12.h;
        r11 = "trimPathEnd";
        r14 = 6;
        r10 = defpackage.sd.a(r13, r3, r11, r14, r10);
        r12.h = r10;
        r10 = r12.i;
        r11 = "trimPathOffset";
        r14 = 7;
        r10 = defpackage.sd.a(r13, r3, r11, r14, r10);
        r12.i = r10;
        r10 = r12.g;
        r11 = "trimPathStart";
        r14 = 5;
        r10 = defpackage.sd.a(r13, r3, r11, r14, r10);
        r12.g = r10;
        r10 = 13;
        r11 = r12.o;
        r14 = "fillType";
        r10 = defpackage.sd.a(r13, r3, r14, r10, r11);
        r12.o = r10;
    L_0x0238:
        r13.recycle();
        r10 = r15.b;
        r10.add(r12);
        r10 = r12.getPathName();
        if (r10 == 0) goto L_0x024f;
    L_0x0246:
        r10 = r7.k;
        r11 = r12.getPathName();
        r10.put(r11, r12);
    L_0x024f:
        r10 = r0.a;
        r11 = r12.p;
        r10 = r10 | r11;
        r0.a = r10;
        r2 = 7;
        r10 = 4;
        r11 = 3;
        r12 = 0;
        r15 = 1;
        r17 = 0;
        goto L_0x0363;
    L_0x025f:
        r11 = -1;
        r12 = "clip-path";
        r12 = r12.equals(r14);
        if (r12 == 0) goto L_0x02be;
    L_0x0268:
        r12 = new mc;
        r12.<init>();
        r10 = defpackage.sd.a(r3, r10);
        if (r10 == 0) goto L_0x029d;
    L_0x0273:
        r10 = defpackage.lm.d;
        r10 = defpackage.sd.a(r2, r5, r4, r10);
        r13 = 0;
        r14 = r10.getString(r13);
        if (r14 == 0) goto L_0x0282;
    L_0x0280:
        r12.n = r14;
    L_0x0282:
        r13 = 1;
        r14 = r10.getString(r13);
        if (r14 != 0) goto L_0x028a;
    L_0x0289:
        goto L_0x0290;
    L_0x028a:
        r13 = defpackage.se.b(r14);
        r12.m = r13;
    L_0x0290:
        r13 = "fillType";
        r11 = 2;
        r14 = 0;
        r13 = defpackage.sd.a(r10, r3, r13, r11, r14);
        r12.o = r13;
        r10.recycle();
    L_0x029d:
        r10 = r15.b;
        r10.add(r12);
        r10 = r12.getPathName();
        if (r10 == 0) goto L_0x02b1;
    L_0x02a8:
        r10 = r7.k;
        r11 = r12.getPathName();
        r10.put(r11, r12);
    L_0x02b1:
        r10 = r0.a;
        r11 = r12.p;
        r10 = r10 | r11;
        r0.a = r10;
        r2 = 7;
        r10 = 4;
        r11 = 3;
        r12 = 0;
        goto L_0x034d;
    L_0x02be:
        r10 = r13.equals(r14);
        if (r10 == 0) goto L_0x0349;
    L_0x02c4:
        r10 = new me;
        r10.<init>();
        r11 = defpackage.lm.b;
        r11 = defpackage.sd.a(r2, r5, r4, r11);
        r12 = 0;
        r10.l = r12;
        r13 = r10.c;
        r14 = "rotation";
        r12 = 5;
        r13 = defpackage.sd.a(r11, r3, r14, r12, r13);
        r10.c = r13;
        r13 = r10.d;
        r14 = 1;
        r13 = r11.getFloat(r14, r13);
        r10.d = r13;
        r13 = r10.e;
        r12 = 2;
        r13 = r11.getFloat(r12, r13);
        r10.e = r13;
        r13 = r10.f;
        r12 = "scaleX";
        r14 = 3;
        r12 = defpackage.sd.a(r11, r3, r12, r14, r13);
        r10.f = r12;
        r12 = r10.g;
        r13 = "scaleY";
        r14 = 4;
        r12 = defpackage.sd.a(r11, r3, r13, r14, r12);
        r10.g = r12;
        r12 = r10.h;
        r13 = "translateX";
        r2 = 6;
        r12 = defpackage.sd.a(r11, r3, r13, r2, r12);
        r10.h = r12;
        r12 = r10.i;
        r13 = "translateY";
        r2 = 7;
        r12 = defpackage.sd.a(r11, r3, r13, r2, r12);
        r10.i = r12;
        r12 = 0;
        r13 = r11.getString(r12);
        if (r13 == 0) goto L_0x0324;
    L_0x0322:
        r10.m = r13;
    L_0x0324:
        r10.b();
        r11.recycle();
        r11 = r15.b;
        r11.add(r10);
        r9.push(r10);
        r11 = r10.getGroupName();
        if (r11 == 0) goto L_0x0341;
    L_0x0338:
        r11 = r7.k;
        r13 = r10.getGroupName();
        r11.put(r13, r10);
    L_0x0341:
        r11 = r0.a;
        r10 = r10.k;
        r10 = r10 | r11;
        r0.a = r10;
        goto L_0x034b;
    L_0x0349:
        r2 = 7;
        r12 = 0;
    L_0x034b:
        r10 = 4;
        r11 = 3;
    L_0x034d:
        r15 = 1;
        goto L_0x0363;
    L_0x034f:
        r2 = 7;
        r10 = 4;
        r11 = 3;
        r12 = 0;
        r15 = 1;
        if (r14 != r11) goto L_0x0363;
    L_0x0356:
        r14 = r20.getName();
        r13 = r13.equals(r14);
        if (r13 == 0) goto L_0x0363;
    L_0x0360:
        r9.pop();
    L_0x0363:
        r14 = r20.next();
        r2 = r19;
        r10 = 1;
        r11 = 0;
        r12 = 8;
        r13 = 4;
        r15 = 3;
        goto L_0x013f;
    L_0x0371:
        if (r17 != 0) goto L_0x037e;
    L_0x0373:
        r0 = r6.c;
        r2 = r6.d;
        r0 = r1.a(r0, r2);
        r1.d = r0;
        return;
    L_0x037e:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r2 = "no path defined";
        r0.<init>(r2);
        throw r0;
    L_0x0386:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r7.getPositionDescription();
        r2.append(r3);
        r3 = "<vector> tag requires height > 0";
        r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r2);
        throw r0;
    L_0x03a1:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r7.getPositionDescription();
        r2.append(r3);
        r3 = "<vector> tag requires width > 0";
        r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r2);
        throw r0;
    L_0x03bc:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r7.getPositionDescription();
        r2.append(r3);
        r3 = "<vector> tag requires viewportHeight > 0";
        r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r2);
        throw r0;
    L_0x03d7:
        r0 = new org.xmlpull.v1.XmlPullParserException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r7.getPositionDescription();
        r2.append(r3);
        r3 = "<vector> tag requires viewportWidth > 0";
        r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r2);
        goto L_0x03f3;
    L_0x03f2:
        throw r0;
    L_0x03f3:
        goto L_0x03f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final /* synthetic */ void applyTheme(Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, theme);
        }
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }
}
