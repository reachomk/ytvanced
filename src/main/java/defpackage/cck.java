package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: cck */
public final class cck extends cbm {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    public final int hashCode() {
        return 1572326941;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bitmap a(bwd bwd, Bitmap bitmap, int i, int i2) {
        return ccr.b(bwd, bitmap, i, i2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof cck;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
