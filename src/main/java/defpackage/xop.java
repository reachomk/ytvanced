package defpackage;

import android.view.View;

/* renamed from: xop */
public final class xop {
    public static xom a(View view) {
        if (view != null) {
            return new xom(view);
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }
}
