package defpackage;

import android.os.Handler;
import java.util.List;

/* renamed from: nei */
public final class nei extends naf {
    public final aifi a;
    private final Handler b;

    public nei(aifi aifi, Handler handler) {
        this.a = (aifi) amqw.a((Object) aifi, (Object) "target cannot be null");
        this.b = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void a(List list) {
        this.b.post(new neh(this, list));
    }

    public final void a() {
        this.b.post(new nek(this));
    }

    public final void b() {
        this.b.post(new nej(this));
    }

    public final void a(float f) {
        this.b.post(new nem(this, f));
    }

    public final void a(ajji ajji) {
        this.b.post(new nel(this, ajji));
    }

    public final void a(int i, int i2) {
        this.b.post(new neo(this, i, i2));
    }
}
