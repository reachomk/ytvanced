package defpackage;

import java.util.Locale;

/* renamed from: ajei */
final class ajei implements ajev {
    public final /* synthetic */ ajee a;

    public final int a() {
        return 20;
    }

    public final void a(ajeu ajeu) {
        String b = b();
        if (b != null) {
            ajeu.b("bat", b);
        }
    }

    public final String b() {
        if (this.a.d.a() == -1.0f) {
            return null;
        }
        return String.format(Locale.US, "%s:%.3f:%d", new Object[]{this.a.f(), Float.valueOf(r0), Integer.valueOf(this.a.d.b())});
    }

    /* synthetic */ ajei(ajee ajee) {
        this.a = ajee;
    }
}
