package defpackage;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: mvk */
public abstract class mvk extends Drawable {
    public static final int[] a = new int[]{0};
    public static final int[] b = new int[]{1};
    public static final int[] c = new int[]{2};
    public static final int d = Color.rgb(127, 127, 127);
    private static final int h = Color.rgb(218, 0, 14);
    private static final int i = Color.rgb(130, 1, 10);
    private static final int j = Color.rgb(255, 204, 48);
    private static final int k = Color.rgb(185, 148, 34);
    public Shader e;
    public int f;
    public int g;
    private Shader l;
    private Shader m;

    public abstract void a();

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Rect rect, int[] iArr) {
        Rect rect2 = rect;
        this.l = new LinearGradient(0.0f, (float) rect2.top, 0.0f, (float) rect2.bottom, h, i, TileMode.CLAMP);
        this.m = new LinearGradient(0.0f, (float) rect2.top, 0.0f, (float) rect2.bottom, j, k, TileMode.CLAMP);
        this.e = iArr != b ? this.l : this.m;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onLevelChange(int i) {
        if (getState() == c) {
            this.g = 100;
            this.f = 100;
        } else {
            this.g = i / 1000;
            this.f = i % 1000;
        }
        a();
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        a(getBounds(), iArr);
        return true;
    }
}
