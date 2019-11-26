package defpackage;

import android.view.ViewGroup;
import android.widget.Spinner;

/* renamed from: esl */
public final class esl {
    public static esk a(ViewGroup viewGroup, Spinner spinner, int i, int i2, int i3) {
        return new esk((ViewGroup) esl.a(viewGroup, 1), (Spinner) esl.a(spinner, 2), i, i2, i3);
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
