package defpackage;

import android.app.Activity;
import android.app.Application;

/* renamed from: tvk */
final class tvk extends ttj implements ttw, ttx, tzh {
    private boolean d;

    tvk(udc udc, Application application, tzu tzu, tzu tzu2) {
        super(udc, application, tzu, tzu2, 1);
    }

    public final void f() {
    }

    public final void e() {
        g();
    }

    public final void b(Activity activity) {
        a(3);
        tyv.b("MagicEyeLogService", "Logging APP_TO_BACKGROUND", new Object[0]);
    }

    public final void a(Activity activity) {
        a(2);
        tyv.b("MagicEyeLogService", "Logging APP_TO_FOREGROUND", new Object[0]);
    }

    private final synchronized void g() {
        if (!this.d) {
            if (!this.c) {
                tty.a(this.a).a((ttp) this);
                this.d = true;
            }
        }
    }

    private final synchronized void h() {
        if (this.d) {
            tty.a(this.a).b(this);
            this.d = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        h();
    }

    private final void a(int i) {
        c().submit(new tvj(this, i));
    }
}
