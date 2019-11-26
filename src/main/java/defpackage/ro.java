package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: ro */
public final class ro {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    public ro(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    static ro a(int i) {
        return new ro(null, null, i);
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b() {
        if (this.a == null) {
            ColorStateList colorStateList = this.c;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(int[] iArr) {
        if (b()) {
            ColorStateList colorStateList = this.c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.b) {
                this.b = colorForState;
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return a() || this.b != 0;
    }
}
