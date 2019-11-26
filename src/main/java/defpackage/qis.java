package defpackage;

import android.os.Bundle;

/* renamed from: qis */
public final class qis extends qiq {
    public qis(int i, Bundle bundle) {
        super(i, bundle);
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
        this.b.a(bundle2);
    }
}
