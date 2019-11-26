package defpackage;

import android.os.Bundle;
import java.util.Map.Entry;

/* renamed from: beo */
public final class beo {
    public final bek a = new bek();
    private final ben b;

    private beo(ben ben) {
        this.b = ben;
    }

    public final void a(Bundle bundle) {
        x y_ = this.b.y_();
        if (y_.a() == z.INITIALIZED) {
            y_.a(new bei(this.b));
            bek bek = this.a;
            if (bek.c) {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            if (bundle != null) {
                bek.b = bundle.getBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key");
            }
            y_.a(new bej(bek));
            bek.c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void b(Bundle bundle) {
        bek bek = this.a;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bek.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m a = bek.a.a();
        while (a.hasNext()) {
            Entry entry = (Entry) a.next();
            bundle2.putBundle((String) entry.getKey(), ((bel) entry.getValue()).a());
        }
        bundle.putBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public static beo a(ben ben) {
        return new beo(ben);
    }
}
