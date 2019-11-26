package defpackage;

import java.util.Locale;

/* renamed from: alrr */
final class alrr implements afsw {
    private final /* synthetic */ String a;
    private final /* synthetic */ alrp b;

    alrr(alrp alrp, String str) {
        this.b = alrp;
        this.a = str;
    }

    public final void a(bqn bqn) {
        acum acum = this.b.e;
        alta alta = new alta();
        alta.b(5);
        alta.a("mdns");
        alta.a(bqn);
        acum.a(alta.a());
        xtl.a(String.format(Locale.US, "Failed to obtain summary for %s", new Object[]{this.a}), (Throwable) bqn);
    }
}
