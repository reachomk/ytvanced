package defpackage;

import android.view.View;

/* renamed from: epd */
final class epd implements fgz, fhc {
    private final eow a;
    private final String b;
    private final /* synthetic */ epa c;

    epd(epa epa, String str, eow eow) {
        this.c = epa;
        this.b = str;
        this.a = eow;
    }

    public final View a() {
        return null;
    }

    public final fhc b() {
        return this;
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a.a(this.b);
        } else {
            this.a.a(false);
        }
    }

    public final void c() {
        this.a.a(true);
    }
}
