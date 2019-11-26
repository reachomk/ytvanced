package defpackage;

import android.os.Bundle;
import java.util.concurrent.ExecutionException;

/* renamed from: ebh */
public final class ebh implements wxx {
    private final /* synthetic */ ebf a;

    public ebh(ebf ebf) {
        this.a = ebf;
    }

    public final int a(Bundle bundle) {
        try {
            abim abim = (abim) this.a.b.get();
            ((eav) this.a.c.get()).a((abif) abim.a(abim.a(null)).get());
            ((afpp) this.a.e.get()).b();
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            xtl.a("Failed to fetch settings", e);
            return 1;
        }
    }
}
