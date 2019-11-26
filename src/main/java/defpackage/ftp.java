package defpackage;

import android.content.Intent;

/* renamed from: ftp */
final class ftp implements afsw {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ fto b;

    ftp(fto fto, Intent intent) {
        this.b = fto;
        this.a = intent;
    }

    public final void a(bqn bqn) {
        xtl.d("Failed to load get_settings response");
        this.b.a.startActivity(this.a);
    }
}
