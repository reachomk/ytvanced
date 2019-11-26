package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: cdv */
public final class cdv implements bsr {
    private final bsr b;

    public cdv(bsr bsr) {
        this.b = (bsr) chw.a((Object) bsr);
    }

    public final bvw a(Context context, bvw bvw, int i, int i2) {
        cdr cdr = (cdr) bvw.b();
        cbj cbj = new cbj(cdr.a(), bqy.a(context).a);
        bvw a = this.b.a(context, cbj, i, i2);
        if (!cbj.equals(a)) {
            cbj.d();
        }
        Bitmap bitmap = (Bitmap) a.b();
        cdr.a.a.a(this.b, bitmap);
        return bvw;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cdv)) {
            return false;
        }
        return this.b.equals(((cdv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
}
