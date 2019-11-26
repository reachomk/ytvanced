package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Layout.Alignment;
import android.text.TextUtils.TruncateAt;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cyt */
final class cyt {
    public static final ColorStateList a = new ColorStateList(h, i);
    public static final ColorStateList b = new ColorStateList(j, k);
    public static final int c = g.getStyle();
    public static final Typeface d = g;
    public static final Alignment e = Alignment.ALIGN_NORMAL;
    public static final int f = 1;
    private static final Typeface g = Typeface.DEFAULT;
    private static final int[][] h;
    private static final int[] i = new int[]{-16777216};
    private static final int[][] j;
    private static final int[] k = new int[]{-3355444};

    static void a(cmg cmg, cmn cmn, int i, int i2, crd crd, CharSequence charSequence, CharSequence charSequence2, int i3, int i4, int i5, int i6, ColorStateList colorStateList, ColorStateList colorStateList2, int i7, float f, int i8, Typeface typeface, Alignment alignment, int i9, boolean z, int i10, int i11, boolean z2, int i12, CharSequence charSequence3) {
        Drawable drawable;
        cmg cmg2 = cmg;
        crd crd2 = crd;
        EditText cyv = new cyv(cmg2.b);
        EditText editText = cyv;
        cyt.a(cyv, charSequence3 != null ? charSequence3 : charSequence, charSequence2, i3, i4, i5, i6, colorStateList, colorStateList2, i7, f, i8, typeface, alignment, i9, z, i10, i11, z2, i12);
        cvu g = cmn.g();
        if (g == null) {
            drawable = null;
        } else {
            Context context = cmg2.b;
            drawable = (Drawable) cvu.a(g);
        }
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            Context context2 = cmg2.b;
            if (!(rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0)) {
                editText.setPadding(0, 0, 0, 0);
                editText.setBackground(null);
            }
        }
        editText.measure(cya.a(i), cya.a(i2));
        int measuredWidth = editText.getMeasuredWidth();
        EditText editText2 = editText;
        crd2 = crd;
        crd2.a = measuredWidth;
        crd2.b = editText2.getMeasuredHeight();
    }

    protected static cyy a(Context context) {
        return new cyy(context);
    }

    static void a(cyy cyy, CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, int i4, ColorStateList colorStateList, ColorStateList colorStateList2, int i5, float f, int i6, Typeface typeface, Alignment alignment, int i7, boolean z, int i8, int i9, boolean z2, int i10, AtomicReference atomicReference, AtomicBoolean atomicBoolean, CharSequence charSequence3) {
        atomicReference.set(cyy);
        CharSequence charSequence4 = charSequence3 != null ? charSequence3 : charSequence;
        atomicBoolean.getAndSet(true);
        cyt.a(cyy, charSequence4, charSequence2, i, i2, i3, i4, colorStateList, colorStateList2, i5, f, i6, typeface, alignment, i7, z, i8, i9, z2, i10);
    }

    static void a(cyy cyy) {
        cyx cyx = cyy.a;
        cyx.a = null;
        cyy.removeTextChangedListener(cyx);
        cyy.f = f;
        cyy.b = null;
        cyy.c = null;
        cyy.d = null;
        cyy.e = null;
    }

    static void a(AtomicReference atomicReference) {
        atomicReference.set(null);
    }

    static void a(cri cri, CharSequence charSequence) {
        cri.a = charSequence;
    }

    static void a(cri cri, cri cri2) {
        cri.a = new AtomicReference();
        cri2.a = new AtomicBoolean();
    }

    private static void a(EditText editText, CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, int i4, ColorStateList colorStateList, ColorStateList colorStateList2, int i5, float f, int i6, Typeface typeface, Alignment alignment, int i7, boolean z, int i8, int i9, boolean z2, int i10) {
        EditText editText2 = editText;
        CharSequence charSequence3 = charSequence;
        ColorStateList colorStateList3 = colorStateList;
        ColorStateList colorStateList4 = colorStateList2;
        int i11 = i7;
        boolean z3 = z;
        int i12 = i8;
        int i13 = i9 | 131072;
        if (i13 != editText.getInputType()) {
            editText.setSingleLine(false);
            editText.setInputType(i13);
        }
        editText.setFilters(new InputFilter[]{new LengthFilter(i3)});
        if (!((charSequence3 instanceof String) && charSequence.equals(editText.getText().toString()))) {
            editText.setText(charSequence);
        }
        charSequence3 = charSequence2;
        editText.setHint(charSequence2);
        editText.setEllipsize(null);
        i13 = i;
        editText.setMinLines(i);
        i13 = i2;
        editText.setMaxLines(i2);
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, i4);
        editText.setLinkTextColor(0);
        editText.setHighlightColor(0);
        editText.setTextSize(0, (float) i5);
        editText.setLineSpacing(0.0f, f);
        editText.setTypeface(typeface, i6);
        editText.setGravity(i11);
        editText.setImeOptions(0);
        editText.setOnEditorActionListener(null);
        editText.setFocusable(z3);
        editText.setFocusableInTouchMode(z3);
        editText.setClickable(z3);
        editText.setLongClickable(z3);
        editText.setCursorVisible(z3);
        Editable text = editText.getText();
        int length = text != null ? text.length() : -1;
        if (i12 >= 0 && i12 <= length) {
            editText.setSelection(i12);
        }
        if (colorStateList3 == null) {
            editText.setTextColor(0);
        } else {
            editText.setTextColor(colorStateList3);
        }
        if (colorStateList4 == null) {
            editText.setHintTextColor(0);
        } else {
            editText.setHintTextColor(colorStateList4);
        }
        if (z2) {
            editText.requestFocus();
        }
        if (i10 != -1) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(editText, Integer.valueOf(i10));
            } catch (Exception unused) {
            }
        }
        length = cyw.a[alignment.ordinal()];
        if (length != 1) {
            if (length != 2) {
                if (length == 3) {
                    if (VERSION.SDK_INT < 17) {
                        editText.setGravity(i11 | 1);
                    } else {
                        editText.setTextAlignment(4);
                    }
                }
            } else if (VERSION.SDK_INT < 17) {
                editText.setGravity(i11 | 5);
            } else {
                editText.setTextAlignment(3);
            }
        } else if (VERSION.SDK_INT >= 17) {
            editText.setTextAlignment(2);
        } else {
            editText.setGravity(i11 | 3);
        }
    }

    static {
        Alignment.values();
        TruncateAt.values();
        int[][] iArr = new int[1][];
        iArr[0] = new int[]{0};
        h = iArr;
        iArr = new int[1][];
        iArr[0] = new int[]{0};
        j = iArr;
    }

    static void a(cmg cmg, cyy cyy, int i) {
        cyy.b = cmg;
        cyy.c = cyq.a(cmg);
        cyy.d = cyq.g(cmg);
        cyy.e = cyq.h(cmg);
        cyy.f = i;
        cyx cyx = cyy.a;
        cyx.a = null;
        cyy.addTextChangedListener(cyx);
    }
}
