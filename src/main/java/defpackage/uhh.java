package defpackage;

import android.app.Application;
import android.app.Service;

/* renamed from: uhh */
public final class uhh implements uhf {
    private final Service a;
    private Object b;

    public uhh(Service service) {
        this.a = service;
    }

    public final Object b() {
        if (this.b == null) {
            Application application = this.a.getApplication();
            amqw.b(application instanceof uhf, "Sting service must be attached to an @Sting Application. Found: %s", application.getClass());
            this.b = ((uha) ((uhf) application).b()).a(new uhk());
        }
        return this.b;
    }
}
