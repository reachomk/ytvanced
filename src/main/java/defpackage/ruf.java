package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ruf */
final class ruf implements rso {
    private final Status a;
    private final run b;

    public ruf(Status status, run run) {
        this.a = status;
        this.b = run;
    }

    public final run c() {
        return this.b;
    }

    public final Status a() {
        return this.a;
    }

    public final void b() {
        run run = this.b;
        if (run != null) {
            run.b();
        }
    }
}
