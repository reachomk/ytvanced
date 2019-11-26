package defpackage;

import java.util.UUID;

/* renamed from: eno */
final class eno implements enq {
    private final /* synthetic */ enl a;

    eno(enl enl) {
        this.a = enl;
    }

    public final UUID a(apxu apxu) {
        return (UUID) this.a.a.get(apxu);
    }

    public final void a(apxu apxu, UUID uuid) {
        this.a.a.put(apxu, uuid);
    }
}
