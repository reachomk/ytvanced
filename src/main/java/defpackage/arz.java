package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: arz */
public final class arz {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public static arz a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new arz(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static arz a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new arz(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static arz a(Context context, int i, int[] iArr) {
        return new arz(context, context.obtainStyledAttributes(i, iArr));
    }

    private arz(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public final Drawable a(int i) {
        if (this.b.hasValue(i)) {
            int resourceId = this.b.getResourceId(i, 0);
            if (resourceId != 0) {
                return agb.b(this.a, resourceId);
            }
        }
        return this.b.getDrawable(i);
    }

    public final Drawable b(int i) {
        if (this.b.hasValue(i)) {
            i = this.b.getResourceId(i, 0);
            if (i != 0) {
                return aky.b().b(this.a, i);
            }
        }
        return null;
    }

    public final CharSequence c(int i) {
        return this.b.getText(i);
    }

    public final String d(int i) {
        return this.b.getString(i);
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final int a(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final int e(int i) {
        return this.b.getColor(i, 0);
    }

    public final ColorStateList f(int i) {
        if (this.b.hasValue(i)) {
            int resourceId = this.b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = agb.a(this.a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.b.getColorStateList(i);
    }

    public final int b(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public final float g(int i) {
        return this.b.getDimension(i, -1.0f);
    }

    public final int c(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final int e(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public final int f(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final boolean h(int i) {
        return this.b.hasValue(i);
    }

    public final void a() {
        this.b.recycle();
    }
}
