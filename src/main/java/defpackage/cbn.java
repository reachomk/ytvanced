package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: cbn */
public final class cbn extends cbm {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    public final int hashCode() {
        return -670243078;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bitmap a(bwd bwd, Bitmap bitmap, int i, int i2) {
        return ccr.c(bwd, bitmap, i, i2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof cbn;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
