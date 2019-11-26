package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* renamed from: cci */
public final class cci implements bsr {
    private final bsr b;
    private final boolean c;

    public cci(bsr bsr, boolean z) {
        this.b = bsr;
        this.c = z;
    }

    public final bvw a(Context context, bvw bvw, int i, int i2) {
        Drawable drawable = (Drawable) bvw.b();
        bvw a = ccg.a(bqy.a(context).a, drawable, i, i2);
        if (a != null) {
            bvw a2 = this.b.a(context, a, i, i2);
            if (!a2.equals(a)) {
                return ccm.a(context.getResources(), a2);
            }
            a2.d();
            return bvw;
        } else if (!this.c) {
            return bvw;
        } else {
            String valueOf = String.valueOf(drawable);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
            stringBuilder.append("Unable to convert ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" to a Bitmap");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cci)) {
            return false;
        }
        return this.b.equals(((cci) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
}
