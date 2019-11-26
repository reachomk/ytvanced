package defpackage;

import android.content.ComponentName;

/* renamed from: pgm */
final class pgm implements Runnable {
    private final /* synthetic */ ComponentName a;
    private final /* synthetic */ pgk b;

    pgm(pgk pgk, ComponentName componentName) {
        this.b = pgk;
        this.a = componentName;
    }

    public final void run() {
        pgi pgi = this.b.c;
        ComponentName componentName = this.a;
        pgv.a();
        if (pgi.b != null) {
            pgi.b = null;
            pgi.a("Disconnected from device AnalyticsService", componentName);
            pgi.m().b();
        }
    }
}
