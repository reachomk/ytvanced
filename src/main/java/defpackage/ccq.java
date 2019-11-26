package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: ccq */
public final class ccq extends cbm {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(a);
    private final int c;

    public ccq(int i) {
        chw.a(i > 0, "roundingRadius must be greater than 0.");
        this.c = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bitmap a(bwd bwd, Bitmap bitmap, int i, int i2) {
        return ccr.a(bwd, bitmap, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ccq) {
            if (this.c == ((ccq) obj).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return chv.b(-569625254, chv.b(this.c, 17));
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }
}
