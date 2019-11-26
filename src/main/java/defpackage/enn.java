package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: enn */
final class enn implements enq {
    private final /* synthetic */ enl a;

    enn(enl enl) {
        this.a = enl;
    }

    public final UUID a(apxu apxu) {
        String a = elq.a(apxu);
        return !TextUtils.isEmpty(a) ? (UUID) this.a.b.get(a) : null;
    }

    public final void a(apxu apxu, UUID uuid) {
        String a = elq.a(apxu);
        if (!TextUtils.isEmpty(a)) {
            this.a.b.put(a, uuid);
        }
    }
}
