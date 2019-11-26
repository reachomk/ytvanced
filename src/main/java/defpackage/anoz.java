package defpackage;

import android.os.Bundle;

/* renamed from: anoz */
final class anoz extends anox {
    anoz(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void a(Bundle bundle) {
        Object bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a(bundle2);
    }
}
