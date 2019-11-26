package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: cbm */
public abstract class cbm implements bsr {
    public abstract Bitmap a(bwd bwd, Bitmap bitmap, int i, int i2);

    public final bvw a(Context context, bvw bvw, int i, int i2) {
        if (chv.a(i, i2)) {
            bwd bwd = bqy.a(context).a;
            Bitmap bitmap = (Bitmap) bvw.b();
            if (i == aocf.UNSET_ENUM_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == aocf.UNSET_ENUM_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = a(bwd, bitmap, i, i2);
            if (bitmap.equals(a)) {
                return bvw;
            }
            return cbj.a(a, bwd);
        }
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("Cannot apply transformation on width: ");
        stringBuilder.append(i);
        stringBuilder.append(" or height: ");
        stringBuilder.append(i2);
        stringBuilder.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
