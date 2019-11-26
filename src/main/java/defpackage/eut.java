package defpackage;

import android.widget.ImageView;

/* renamed from: eut */
public final class eut {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public eut(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) eut.a(bcaa, 1);
        this.b = (bcaa) eut.a(bcaa2, 2);
        this.c = (bcaa) eut.a(bcaa3, 3);
        this.d = (bcaa) eut.a(bcaa4, 4);
    }

    public final euu a(ImageView imageView) {
        return new euu((euy) eut.a((euy) this.a.get(), 1), (akvp) eut.a((akvp) this.b.get(), 2), (fmx) eut.a((fmx) this.c.get(), 3), (akpi) eut.a((akpi) this.d.get(), 4), (ImageView) eut.a(imageView, 5));
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
