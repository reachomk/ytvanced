package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: ainj */
public final class ainj {
    public final Bitmap a;
    private final Rect b;

    public static ainj a(Bitmap bitmap) {
        return new ainj(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    private ainj(Bitmap bitmap, Rect rect) {
        this.a = bitmap;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ainj) {
            ainj ainj = (ainj) obj;
            if (amqq.a(ainj.a, this.a) && amqq.a(ainj.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int i = 0;
        int hashCode = bitmap != null ? bitmap.hashCode() : 0;
        Rect rect = this.b;
        if (rect != null) {
            i = rect.hashCode();
        }
        return hashCode ^ i;
    }
}
