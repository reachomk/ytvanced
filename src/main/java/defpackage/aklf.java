package defpackage;

import android.widget.ImageView;

/* renamed from: aklf */
public final class aklf {
    public static akle a(xnk xnk, ImageView imageView) {
        return new akle((xnk) aklf.a((Object) xnk, 1), (ImageView) aklf.a((Object) imageView, 2));
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
