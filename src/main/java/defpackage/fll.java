package defpackage;

import com.google.android.libraries.quantum.fab.FloatingActionButton;

/* renamed from: fll */
public final class fll {
    private final bcaa a;
    private final bcaa b;

    public fll(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) fll.a(bcaa, 1);
        this.b = (bcaa) fll.a(bcaa2, 2);
    }

    public final flj a(FloatingActionButton floatingActionButton) {
        return new flj((aaas) fll.a((aaas) this.a.get(), 1), (akvp) fll.a((akvp) this.b.get(), 2), (FloatingActionButton) fll.a(floatingActionButton, 3));
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
