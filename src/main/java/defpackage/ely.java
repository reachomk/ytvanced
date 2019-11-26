package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView.ScaleType;
import java.lang.ref.SoftReference;

/* renamed from: ely */
public final class ely {
    public final long a;
    public final ScaleType b;
    private final SoftReference c;

    public final Bitmap a() {
        return (Bitmap) this.c.get();
    }

    /* synthetic */ ely(long j, Bitmap bitmap, ScaleType scaleType) {
        this.a = j;
        this.c = new SoftReference(bitmap);
        this.b = scaleType;
    }
}
