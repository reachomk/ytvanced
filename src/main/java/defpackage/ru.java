package defpackage;

import android.graphics.Shader.TileMode;

/* renamed from: ru */
final class ru {
    public static TileMode a(int i) {
        if (i == 1) {
            return TileMode.REPEAT;
        }
        if (i != 2) {
            return TileMode.CLAMP;
        }
        return TileMode.MIRROR;
    }
}
