package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: afol */
public class afol {
    public final afoi a;
    public final afop b;
    private tub c;
    private ttx d;
    private final Application e;
    private final ScheduledExecutorService f;

    public afol(ScheduledExecutorService scheduledExecutorService, afoi afoi, afop afop, Application application) {
        this.a = afoi;
        this.b = afop;
        this.e = application;
        this.f = scheduledExecutorService;
    }

    public void a() {
        if (this.c == null) {
            this.d = new afom(this);
            this.c = new tub();
            this.c.a(this.e);
        }
        this.c.a(this.d);
        if (!ucv.b(this.e.getApplicationContext())) {
            b();
        }
    }

    public final void b() {
        this.f.execute(new afok(this));
        this.f.execute(new afon(this));
    }
}
