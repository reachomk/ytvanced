package defpackage;

import java.util.logging.Logger;

/* renamed from: anid */
class anid extends anhv {
    public static final Logger a = Logger.getLogger(anid.class.getName());
    public anig f;

    anid() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        anig anig = this.f;
        if (anig != null) {
            this.f = null;
            amuh amuh = anig.b;
            boolean d = d();
            if (d) {
                anig.c();
            }
            if ((isCancelled() & (amuh != null ? 1 : 0)) != 0) {
                amxo amxo = (amxo) amuh.iterator();
                while (amxo.hasNext()) {
                    ((anjv) amxo.next()).cancel(d);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        anig anig = this.f;
        if (anig != null) {
            amuh amuh = anig.b;
            if (amuh != null) {
                String valueOf = String.valueOf(amuh);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 10);
                stringBuilder.append("futures=[");
                stringBuilder.append(valueOf);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void a(anig anig) {
        this.f = anig;
        if (anig.b.isEmpty()) {
            anig.b();
            return;
        }
        boolean z = anig.c;
        amxo amxo = (amxo) anig.b.iterator();
        while (amxo.hasNext()) {
            ((anjv) amxo.next()).a(anig, aniv.a);
        }
    }
}
