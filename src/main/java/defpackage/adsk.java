package defpackage;

import java.util.Set;

/* renamed from: adsk */
final class adsk implements addr {
    private final Set a;
    private final /* synthetic */ adsg b;

    public adsk(adsg adsg, Set set) {
        this.b = adsg;
        this.a = set;
    }

    public final void a(adiq adiq) {
        adqe c = ((adqf) this.b.c.get()).c();
        if (c == null || c.b() || !adiq.equals(c.h()) || adiq.k.b() != 2) {
            this.b.e.put(adiq.d(), Integer.valueOf(0));
            adiq a = this.b.a(adiq.d());
            if (a != null) {
                adhw adhw = adiq.k;
                adhw adhw2 = a.k;
                if (!(adhw == adhw2 || ((adhw2 != null && amqq.a(adhw.g(), adhw2.g()) && adhw.d() == adhw2.d() && adhw.i().equals(adhw2.i())) || (c != null && (c.h() instanceof adiq) && adiq.d().equals(((adiq) c.h()).d()))))) {
                    this.b.a(adiq);
                }
            } else {
                this.b.a(adiq);
            }
            this.a.remove(adiq);
            return;
        }
        String.valueOf(adiq).length();
        this.b.b(adiq);
        this.a.remove(adiq);
    }
}
