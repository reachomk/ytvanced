package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: cbo */
public final class cbo extends cbm {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    public final int hashCode() {
        return -599754482;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bitmap a(bwd bwd, Bitmap bitmap, int i, int i2) {
        return ccr.a(bwd, bitmap, i, i2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof cbo;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
