package defpackage;

import com.google.vr.sdk.base.FieldOfView;
import java.util.Arrays;

/* renamed from: ahsh */
public final class ahsh {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ahsh(FieldOfView fieldOfView) {
        this(fieldOfView.getLeft(), fieldOfView.getTop(), fieldOfView.getRight(), fieldOfView.getBottom());
    }

    public ahsh(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahsh) {
            ahsh ahsh = (ahsh) obj;
            if (this.a == ahsh.a && this.c == ahsh.c && this.d == ahsh.d && this.b == ahsh.b) {
                return true;
            }
        }
        return false;
    }
}
