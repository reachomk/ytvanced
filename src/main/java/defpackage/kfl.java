package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/* renamed from: kfl */
public final class kfl {
    private final bcaa a;
    private final bcaa b;

    public kfl(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) kfl.a(bcaa, 1);
        this.b = (bcaa) kfl.a(bcaa2, 2);
    }

    public final kfh a(ViewSwitcher viewSwitcher, ViewSwitcher viewSwitcher2, ImageView imageView, TextView textView, kfi kfi) {
        return new kfh((Context) kfl.a((Context) this.a.get(), 1), (akkq) kfl.a((akkq) this.b.get(), 2), (ViewSwitcher) kfl.a(viewSwitcher, 3), (ViewSwitcher) kfl.a(viewSwitcher2, 4), (ImageView) kfl.a(imageView, 5), (TextView) kfl.a(textView, 6), kfi);
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
