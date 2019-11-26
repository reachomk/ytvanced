package defpackage;

import java.util.Locale;

/* renamed from: alrj */
final class alrj implements afsw {
    private final /* synthetic */ alrg a;

    alrj(alrg alrg) {
        this.a = alrg;
    }

    public final void a(bqn bqn) {
        String.format(Locale.US, "%s is still unavailable.", new Object[]{this.a.b.c});
        alrh alrh = this.a.b;
        if (!alrh.a) {
            acum acum = alrh.c.j;
            alta alta = new alta();
            alta.b(5);
            alta.a("reprobe");
            alta.a(this.a.b.c.h);
            alta.a(bqn);
            alta.a(this.a.a);
            acum.a(alta.a());
        }
        this.a.b.c.a(1, bqn);
    }
}
