package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: cbq */
public final class cbq extends cbm {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    public final int hashCode() {
        return 1101716364;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bitmap a(bwd bwd, Bitmap bitmap, int i, int i2) {
        return ccr.d(bwd, bitmap, i, i2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof cbq;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
