package defpackage;

import android.os.Bundle;

/* renamed from: anoy */
public final class anoy extends anox {
    public anoy(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a(null);
        } else {
            a(new anpa(4, "Invalid response to one way request"));
        }
    }
}
