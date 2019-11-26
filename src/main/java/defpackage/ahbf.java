package defpackage;

import com.google.android.youtube.R;

/* renamed from: ahbf */
final class ahbf implements ahcu {
    private final /* synthetic */ String a;
    private final /* synthetic */ ahbc b;

    ahbf(ahbc ahbc, String str) {
        this.b = ahbc;
        this.a = str;
    }

    public final void a() {
        if (this.b.b.c()) {
            if (this.b.a().a(this.a, this.b.d.b())) {
                this.b.a(this.a, (int) R.string.sync_playlist_start);
            }
            return;
        }
        this.b.c.a();
    }

    public final void b() {
        this.b.a().g(this.a);
    }
}
