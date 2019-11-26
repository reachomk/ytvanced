package defpackage;

import android.widget.ImageView;

/* renamed from: gal */
public final class gal {
    private final bcaa a;
    private final bcaa b;

    public gal(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) gal.a((Object) bcaa, 1);
        this.b = (bcaa) gal.a((Object) bcaa2, 2);
    }

    public final gaf a(ImageView imageView, ImageView imageView2) {
        return new gaf((akkq) gal.a((akkq) this.a.get(), 1), (akvp) gal.a((akvp) this.b.get(), 2), (ImageView) gal.a((Object) imageView, 3), imageView2);
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
