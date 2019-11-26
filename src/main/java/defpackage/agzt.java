package defpackage;

import android.os.Process;

/* renamed from: agzt */
public final class agzt implements agya {
    private final agvz a;
    private final agxz b;
    private final agqz c;
    private final ahad d;
    private final Object e = new Object();
    private boolean f = false;

    public agzt(agvz agvz, agqz agqz, agxz agxz, ahad ahad) {
        this.a = agvz;
        this.b = agxz;
        this.c = agqz;
        this.d = ahad;
    }

    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this.e) {
            if (!this.f) {
                try {
                    this.b.a(this.c.a, 0, 0.0d, false);
                    this.d.a(this.a.h(), this.a.i(), this.c);
                    this.b.a(this.c.a, new agpw());
                } catch (agyc e) {
                    this.b.a(this.c.a, e, new agpw());
                }
            }
        }
    }

    public final void a(int i) {
        synchronized (this.e) {
            this.f = true;
        }
    }
}
