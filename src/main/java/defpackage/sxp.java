package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Objects;

/* renamed from: sxp */
public final class sxp {
    public Drawable a = null;
    public float b = 0.0f;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public final boolean equals(Object obj) {
        if (obj instanceof sxp) {
            sxp sxp = (sxp) obj;
            if (Objects.equals(this.a, sxp.a)) {
                if (((long) (Float.valueOf(this.b).floatValue() * 10000.0f)) == ((long) (Float.valueOf(sxp.b).floatValue() * 10000.0f))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 69);
        stringBuilder.append("StyleBuilderImpl(backgroundDrawable:");
        stringBuilder.append(valueOf);
        stringBuilder.append(", cornerRadiusPx:");
        stringBuilder.append(f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
