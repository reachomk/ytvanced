package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wxo */
public abstract class wxo {
    public volatile int i = 1;

    public abstract void a();

    public final void a(Executor executor) {
        if (this.i == 1) {
            executor.execute(new wxn(this));
        }
    }

    public final int b() {
        if (this.i == 1) {
            synchronized (this) {
                if (this.i == 1) {
                    try {
                        this.i = 2;
                        a();
                        this.i = 3;
                    } catch (Throwable unused) {
                        this.i = 4;
                    }
                }
            }
        }
        return this.i;
    }
}
