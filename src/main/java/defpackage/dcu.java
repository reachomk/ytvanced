package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.yoga.YogaDirection;

/* renamed from: dcu */
final class dcu {
    public static final ColorStateList a = new ColorStateList(g, h);
    public static final int b = f.getStyle();
    public static final Typeface c = f;
    public static final int d = 1;
    public static final int e = dct.a;
    private static final Typeface f = Typeface.DEFAULT;
    private static final int[][] g;
    private static final int[] h = new int[]{-16777216};
    private static final Path i = new Path();
    private static final Rect j = new Rect();
    private static final RectF k = new RectF();

    static dcp a() {
        return new dcp();
    }

    static void a(dcp dcp, ColorStateList colorStateList, int i, int i2, boolean z, CharSequence charSequence, Layout layout, Float f, ClickableSpan[] clickableSpanArr, ImageSpan[] imageSpanArr) {
        float floatValue = f != null ? f.floatValue() : 0.0f;
        dcp.b = layout;
        dcp.c = floatValue;
        dcp.d = z;
        dcp.f = charSequence;
        dcp.j = clickableSpanArr;
        if (dcp.o == null && clickableSpanArr != null) {
            for (ClickableSpan clickableSpan : clickableSpanArr) {
                if (clickableSpan instanceof czw) {
                    dcp.o = new Handler();
                    break;
                }
            }
        }
        dcp.p = null;
        dcp.l = null;
        boolean z2 = clickableSpanArr != null && clickableSpanArr.length > 0;
        dcp.e = z2;
        dcp.i = 0;
        dcp.m = 0.0f;
        if (colorStateList == null) {
            colorStateList = a;
        }
        dcp.g = colorStateList;
        dcp.h = dcp.g.getDefaultColor();
        Layout layout2 = dcp.b;
        if (layout2 != null) {
            layout2.getPaint().setColor(dcp.g.getColorForState(dcp.getState(), dcp.h));
        }
        if (i >= 0 && i2 <= charSequence.length() && i < i2) {
            dcp.a(i, i2);
        } else {
            dcp.a();
        }
        if (imageSpanArr != null) {
            for (ImageSpan drawable : imageSpanArr) {
                Drawable drawable2 = drawable.getDrawable();
                drawable2.setCallback(dcp);
                drawable2.setVisible(true, false);
            }
        }
        dcp.k = imageSpanArr;
        dcp.invalidateSelf();
        if (charSequence instanceof czv) {
            ((czv) charSequence).a();
        }
    }

    static void a(dcp dcp, CharSequence charSequence) {
        dcp.b = null;
        dcp.c = 0.0f;
        dcp.f = null;
        dcp.j = null;
        dcp.e = false;
        dcp.i = 0;
        dcp.p = null;
        dcp.l = null;
        dcp.g = null;
        dcp.h = 0;
        ImageSpan[] imageSpanArr = dcp.k;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = dcp.k[i].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            dcp.k = null;
        }
        if (charSequence instanceof czv) {
            ((czv) charSequence).b();
        }
    }

    static void a(View view, aca aca, CharSequence charSequence) {
        if (abe.f(view) == 0) {
            abe.b(view, 1);
        }
        CharSequence j = aca.j();
        if (j == null) {
            j = charSequence;
        }
        aca.b(j);
        aca.d(j);
        aca.a(256);
        aca.a(512);
        aca.a.setMovementGranularities(11);
        aca.a.setMultiLine(true);
    }

    static int a(boolean z, ClickableSpan[] clickableSpanArr) {
        return (!z || clickableSpanArr == null) ? 0 : clickableSpanArr.length;
    }

    static void a(aca aca, int i, int i2, int i3, CharSequence charSequence, Layout layout, ClickableSpan[] clickableSpanArr) {
        Spanned spanned = (Spanned) charSequence;
        Object obj = clickableSpanArr[i];
        int spanStart = spanned.getSpanStart(obj);
        int spanEnd = spanned.getSpanEnd(obj);
        int lineForOffset = layout.getLineForOffset(spanStart);
        layout.getSelectionPath(spanStart, lineForOffset != layout.getLineForOffset(spanEnd) ? layout.getLineVisibleEnd(lineForOffset) : spanEnd, i);
        i.computeBounds(k, true);
        j.set(((int) k.left) + i2, ((int) k.top) + i3, i2 + ((int) k.right), i3 + ((int) k.bottom));
        if (j.isEmpty()) {
            j.set(0, 0, 1, 1);
            aca.b(j);
            aca.d((CharSequence) "");
            return;
        }
        aca.b(j);
        aca.f(true);
        aca.c(true);
        aca.g(true);
        aca.d(true);
        CharSequence charSequence2 = "android.widget.Button";
        if (obj instanceof ddk) {
            aca.b(null);
            aca.a(charSequence2);
            return;
        }
        aca.b(spanned.subSequence(spanStart, spanEnd));
        aca.a(charSequence2);
    }

    static int a(int i, int i2, CharSequence charSequence, Layout layout, ClickableSpan[] clickableSpanArr) {
        Spanned spanned = (Spanned) charSequence;
        for (int i3 = 0; i3 < clickableSpanArr.length; i3++) {
            Object obj = clickableSpanArr[i3];
            layout.getSelectionPath(spanned.getSpanStart(obj), spanned.getSpanEnd(obj), i);
            i.computeBounds(k, true);
            if (k.contains((float) i, (float) i2)) {
                return i3;
            }
        }
        return aocf.UNSET_ENUM_VALUE;
    }

    static {
        int[][] iArr = new int[1][];
        iArr[0] = new int[]{0};
        g = iArr;
    }

    static void a(cmg cmg, cmn cmn, int i, int i2, crd crd, CharSequence charSequence, TruncateAt truncateAt, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, ColorStateList colorStateList, int i9, int i10, float f, float f2, int i11, Typeface typeface, int i12, int i13, float f3, cqp cqp, cqp cqp2, cqp cqp3) {
        cmg cmg2 = cmg;
        crd crd2 = crd;
        int i14 = i3;
        cqp cqp4 = cqp;
        if (TextUtils.isEmpty(charSequence)) {
            cqp4.a = null;
            crd2.a = 0;
            crd2.b = 0;
            return;
        }
        int i15 = i;
        Layout a = dcu.a(i15, truncateAt, z, i4, i8, charSequence, colorStateList, i9, i10, f, f2, i11, typeface, i12, cmn.h(), i5, i6, i7, cmg2.b.getResources().getDisplayMetrics().density, i13, f3);
        cqp4.a = a;
        crd2.a = crc.a(i15, a.getWidth());
        int a2 = clk.a(a);
        i15 = a.getLineCount();
        if (i15 < i14) {
            a2 += Math.round((((float) a.getPaint().getFontMetricsInt(null)) * f2) + f) * (i14 - i15);
        }
        i14 = crc.a(i2, a2);
        crd2.b = i14;
        a2 = crd2.a;
        if (a2 < 0 || i14 < 0) {
            crd2.a = Math.max(a2, 0);
            crd2.b = Math.max(crd2.b, 0);
            cnh cnh = cmg2.d;
            if (cnh != null) {
                cnh.a(2, "Text layout measured to less than 0 pixels");
            }
        }
        cqp2.a = Integer.valueOf(crd2.a);
        cqp3.a = Integer.valueOf(crd2.b);
    }

    private static Layout a(int i, TruncateAt truncateAt, boolean z, int i2, int i3, CharSequence charSequence, ColorStateList colorStateList, int i4, int i5, float f, float f2, int i6, Typeface typeface, int i7, YogaDirection yogaDirection, int i8, int i9, int i10, float f3, int i11, float f4) {
        int i12;
        yy yyVar;
        TruncateAt truncateAt2 = truncateAt;
        boolean z2 = z;
        int i13 = i2;
        int i14 = i3;
        CharSequence charSequence2 = charSequence;
        int i15 = i4;
        float f5 = f;
        float f6 = f2;
        Typeface typeface2 = typeface;
        YogaDirection yogaDirection2 = yogaDirection;
        int i16 = i8;
        int i17 = i9;
        float f7 = f3;
        int i18 = i11;
        float f8 = f4;
        clf clf = new clf();
        clf.g = false;
        int mode = MeasureSpec.getMode(i);
        if (mode == aocf.UNSET_ENUM_VALUE) {
            i12 = 2;
        } else if (mode == 0) {
            i12 = 0;
        } else if (mode == 1073741824) {
            i12 = 1;
        } else {
            int mode2 = MeasureSpec.getMode(i);
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Unexpected size mode: ");
            stringBuilder.append(mode2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (clf.e.a.density != f7) {
            clf.e.a();
            clf.e.a.density = f7;
            clf.f = null;
        }
        cli cli = clf.e;
        if (cli.n != truncateAt2) {
            cli.n = truncateAt2;
            clf.f = null;
        }
        if (cli.p != i13) {
            cli.p = i13;
            clf.f = null;
        }
        cli.a();
        cli cli2 = clf.e;
        cli2.d = 0.0f;
        cli2.b = 0.0f;
        cli2.c = 0.0f;
        cli2.e = i14;
        cli2.a.setShadowLayer(0.0f, 0.0f, 0.0f, i14);
        clf.f = null;
        CharSequence charSequence3 = clf.e.h;
        if (charSequence2 != charSequence3 && (charSequence2 == null || charSequence3 == null || !charSequence2.equals(charSequence3))) {
            clf.e.h = charSequence2;
            clf.f = null;
        }
        float f9 = (float) i5;
        if (clf.e.a.getTextSize() != f9) {
            clf.e.a();
            clf.e.a.setTextSize(f9);
            clf.f = null;
        }
        int size = MeasureSpec.getSize(i);
        cli cli3 = clf.e;
        if (!(cli3.f == size && cli3.g == i12)) {
            cli3.f = size;
            cli3.g = i12;
            clf.f = null;
        }
        if (cli3.m != z2) {
            cli3.m = z2;
            clf.f = null;
        }
        f9 = cli3.l;
        if (f9 == Float.MAX_VALUE && cli3.k != f5) {
            cli3.k = f5;
            clf.f = null;
        }
        if (f9 == Float.MAX_VALUE && cli3.j != f6) {
            cli3.j = f6;
            clf.f = null;
        }
        if (cli3.a.linkColor != i15) {
            clf.e.a();
            clf.e.a.linkColor = i15;
            clf.f = null;
        }
        cli2 = clf.e;
        cli2 = clf.e;
        if (cli2.s != i18) {
            cli2.s = i18;
            clf.f = null;
        }
        if (f8 != Float.MAX_VALUE) {
            cli2 = clf.e;
            if (cli2.l != f8) {
                cli2.l = f8;
                cli2.k = f8 - cli2.a.getFontMetrics(null);
                clf.e.j = 1.0f;
                clf.f = null;
            }
        }
        if (VERSION.SDK_INT >= 21 && clf.e.a.getLetterSpacing() != 0.0f) {
            clf.e.a();
            clf.e.a.setLetterSpacing(0.0f);
            clf.f = null;
        }
        if (i16 != -1) {
            clf.a = i16;
            z2 = true;
            clf.b = 1;
            i14 = i9;
        } else {
            z2 = true;
            clf.a = 0;
            clf.b = 2;
            i14 = i9;
        }
        if (i14 != -1) {
            clf.c = i14;
            clf.d = z2;
        } else {
            clf.c = i10;
            clf.d = 2;
        }
        clf.e.a();
        cli2 = clf.e;
        cli2.i = colorStateList;
        TextPaint textPaint = cli2.a;
        ColorStateList colorStateList2 = cli2.i;
        textPaint.setColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : -16777216);
        clf.f = null;
        Typeface typeface3 = typeface;
        if (f.equals(typeface3)) {
            clf.a(Typeface.defaultFromStyle(i6));
        } else {
            clf.a(typeface3);
        }
        YogaDirection yogaDirection3 = yogaDirection;
        if (yogaDirection3 == YogaDirection.RTL) {
            yyVar = zb.d;
        } else {
            yyVar = zb.c;
        }
        cli3 = clf.e;
        if (cli3.r != yyVar) {
            cli3.r = yyVar;
            clf.f = null;
        }
        i14 = i7 - 1;
        if (i7 != 0) {
            Alignment alignment;
            switch (i14) {
                case 1:
                    alignment = Alignment.ALIGN_OPPOSITE;
                    break;
                case 2:
                    if (yogaDirection3 != YogaDirection.RTL) {
                        z2 = false;
                    }
                    if (z2 == yyVar.a(charSequence2, charSequence.length())) {
                        alignment = Alignment.ALIGN_NORMAL;
                        break;
                    }
                    alignment = Alignment.ALIGN_OPPOSITE;
                    break;
                case 3:
                    if (yogaDirection3 != YogaDirection.RTL) {
                        z2 = false;
                    }
                    if (z2 == yyVar.a(charSequence2, charSequence.length())) {
                        alignment = Alignment.ALIGN_OPPOSITE;
                        break;
                    }
                    alignment = Alignment.ALIGN_NORMAL;
                    break;
                case 4:
                    if (!yyVar.a(charSequence2, charSequence.length())) {
                        alignment = Alignment.ALIGN_NORMAL;
                        break;
                    }
                    alignment = Alignment.ALIGN_OPPOSITE;
                    break;
                case 5:
                    if (!yyVar.a(charSequence2, charSequence.length())) {
                        alignment = Alignment.ALIGN_OPPOSITE;
                        break;
                    }
                    alignment = Alignment.ALIGN_NORMAL;
                    break;
                case 6:
                    alignment = Alignment.ALIGN_CENTER;
                    break;
                default:
                    alignment = Alignment.ALIGN_NORMAL;
                    break;
            }
            cli cli4 = clf.e;
            if (cli4.q != alignment) {
                cli4.q = alignment;
                clf.f = null;
            }
            return clf.a();
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x019f  */
    /* JADX WARNING: Missing block: B:37:0x0136, code skipped:
            if (r7 <= r5) goto L_0x0138;
     */
    static void a(defpackage.cmg r24, defpackage.cmn r25, java.lang.CharSequence r26, android.text.TextUtils.TruncateAt r27, boolean r28, int r29, int r30, int r31, int r32, int r33, android.content.res.ColorStateList r34, int r35, int r36, float r37, float r38, int r39, int r40, android.graphics.Typeface r41, int r42, int r43, java.lang.CharSequence r44, float r45, android.text.Layout r46, java.lang.Integer r47, java.lang.Integer r48, defpackage.cqp r49, defpackage.cqp r50, defpackage.cqp r51, defpackage.cqp r52, defpackage.cqp r53) {
        /*
        r0 = r24;
        r14 = r26;
        r13 = r44;
        r1 = r46;
        r12 = r49;
        r11 = r50;
        r10 = r51;
        r12.a = r14;
        r2 = android.text.TextUtils.isEmpty(r26);
        if (r2 != 0) goto L_0x01c5;
    L_0x0016:
        r2 = r25.a();
        r3 = r25.f();
        r2 = r2 - r3;
        r3 = r25.d();
        r2 = r2 - r3;
        r9 = (float) r2;
        r2 = r25.b();
        r3 = r25.c();
        r2 = r2 - r3;
        r3 = r25.e();
        r2 = r2 - r3;
        r8 = (float) r2;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 == 0) goto L_0x0053;
    L_0x0038:
        r2 = r47.intValue();
        r2 = (float) r2;
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 == 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0053;
    L_0x0042:
        r2 = r48.intValue();
        r2 = (float) r2;
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 != 0) goto L_0x0053;
    L_0x004b:
        r11.a = r1;
        r22 = r8;
        r47 = r9;
        r0 = r11;
        goto L_0x009d;
    L_0x0053:
        r1 = (int) r9;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7);
        r15 = r25.h();
        r2 = r0.b;
        r2 = r2.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.density;
        r19 = r2;
        r2 = r27;
        r3 = r28;
        r4 = r29;
        r5 = r33;
        r6 = r26;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r34;
        r22 = r8;
        r8 = r35;
        r0 = r9;
        r9 = r36;
        r47 = r0;
        r0 = r10;
        r10 = r37;
        r0 = r11;
        r11 = r38;
        r12 = r40;
        r13 = r41;
        r14 = r42;
        r16 = r30;
        r17 = r31;
        r18 = r32;
        r20 = r43;
        r21 = r45;
        r1 = defpackage.dcu.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        r0.a = r1;
    L_0x009d:
        r1 = r0.a;
        r1 = (android.text.Layout) r1;
        r1 = defpackage.clk.a(r1);
        r1 = (float) r1;
        r2 = r39 + -1;
        if (r39 == 0) goto L_0x01c3;
    L_0x00aa:
        r3 = 2;
        r4 = 1;
        if (r2 == r4) goto L_0x00c5;
    L_0x00ae:
        if (r2 == r3) goto L_0x00ba;
    L_0x00b0:
        r1 = 0;
        r1 = java.lang.Float.valueOf(r1);
        r2 = r51;
        r2.a = r1;
        goto L_0x00d2;
    L_0x00ba:
        r2 = r51;
        r8 = r22 - r1;
        r1 = java.lang.Float.valueOf(r8);
        r2.a = r1;
        goto L_0x00d2;
    L_0x00c5:
        r2 = r51;
        r8 = r22 - r1;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = r8 / r1;
        r1 = java.lang.Float.valueOf(r8);
        r2.a = r1;
    L_0x00d2:
        r1 = 0;
        r2 = r44;
        if (r2 == 0) goto L_0x0195;
    L_0x00d7:
        r5 = "";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00e1;
    L_0x00df:
        goto L_0x0195;
    L_0x00e1:
        r5 = r0.a;
        r5 = (android.text.Layout) r5;
        r6 = 0;
    L_0x00e6:
        r7 = r5.getLineCount();
        r8 = -1;
        if (r6 >= r7) goto L_0x00f6;
    L_0x00ed:
        r7 = r5.getEllipsisCount(r6);
        if (r7 > 0) goto L_0x00f7;
    L_0x00f3:
        r6 = r6 + 1;
        goto L_0x00e6;
    L_0x00f6:
        r6 = -1;
    L_0x00f7:
        if (r6 == r8) goto L_0x0195;
    L_0x00f9:
        r5 = r0.a;
        r5 = (android.text.Layout) r5;
        r7 = new android.graphics.Rect;
        r7.<init>();
        r9 = r5.getPaint();
        r10 = r44.toString();
        r11 = r44.length();
        r9.getTextBounds(r10, r1, r11, r7);
        r9 = r5.getLineMax(r6);
        r7 = r7.width();
        r7 = (float) r7;
        r9 = r9 - r7;
        r7 = r5.getOffsetForHorizontal(r6, r9);
        if (r7 > 0) goto L_0x0126;
    L_0x0121:
        r15 = r26;
    L_0x0123:
        r2 = r47;
        goto L_0x014b;
    L_0x0126:
        r7 = r7 + r8;
        r8 = r5.getEllipsisCount(r6);
        if (r8 <= 0) goto L_0x0138;
    L_0x012d:
        r8 = r5.getLineStart(r6);
        r5 = r5.getEllipsisStart(r6);
        r5 = r5 + r8;
        if (r7 > r5) goto L_0x0139;
    L_0x0138:
        r5 = r7;
    L_0x0139:
        r3 = new java.lang.CharSequence[r3];
        r6 = r26;
        r5 = r6.subSequence(r1, r5);
        r3[r1] = r5;
        r3[r4] = r2;
        r2 = android.text.TextUtils.concat(r3);
        r15 = r2;
        goto L_0x0123;
    L_0x014b:
        r2 = (int) r2;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        r17 = r25.h();
        r2 = r24;
        r2 = r2.b;
        r2 = r2.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.density;
        r21 = r2;
        r4 = r27;
        r5 = r28;
        r6 = r29;
        r7 = r33;
        r8 = r15;
        r9 = r34;
        r10 = r35;
        r11 = r36;
        r12 = r37;
        r13 = r38;
        r14 = r40;
        r2 = r15;
        r15 = r41;
        r16 = r42;
        r18 = r30;
        r19 = r31;
        r20 = r32;
        r22 = r43;
        r23 = r45;
        r3 = defpackage.dcu.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        r4 = r49;
        r4.a = r2;
        r0.a = r3;
        goto L_0x0197;
    L_0x0195:
        r4 = r49;
    L_0x0197:
        r0 = r4.a;
        r0 = (java.lang.CharSequence) r0;
        r2 = r0 instanceof android.text.Spanned;
        if (r2 == 0) goto L_0x01c2;
    L_0x019f:
        r2 = r0;
        r2 = (android.text.Spanned) r2;
        r3 = r0.length();
        r4 = android.text.style.ClickableSpan.class;
        r3 = r2.getSpans(r1, r3, r4);
        r3 = (android.text.style.ClickableSpan[]) r3;
        r4 = r52;
        r4.a = r3;
        r0 = r0.length();
        r3 = android.text.style.ImageSpan.class;
        r0 = r2.getSpans(r1, r0, r3);
        r0 = (android.text.style.ImageSpan[]) r0;
        r1 = r53;
        r1.a = r0;
    L_0x01c2:
        return;
    L_0x01c3:
        r0 = 0;
        throw r0;
    L_0x01c5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcu.a(cmg, cmn, java.lang.CharSequence, android.text.TextUtils$TruncateAt, boolean, int, int, int, int, int, android.content.res.ColorStateList, int, int, float, float, int, int, android.graphics.Typeface, int, int, java.lang.CharSequence, float, android.text.Layout, java.lang.Integer, java.lang.Integer, cqp, cqp, cqp, cqp, cqp):void");
    }
}
