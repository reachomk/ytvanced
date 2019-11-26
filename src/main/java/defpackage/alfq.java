package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: alfq */
final class alfq implements alch {
    private final int a;
    private final int b;

    public alfq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a(Resources resources) {
        return resources.getColor(this.a);
    }

    public final Drawable b(Resources resources) {
        int i = this.b;
        if (i == 0) {
            return null;
        }
        return resources.getDrawable(i);
    }
}
