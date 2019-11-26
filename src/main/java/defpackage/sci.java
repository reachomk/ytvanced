package defpackage;

import java.util.TimerTask;

/* renamed from: sci */
final class sci extends TimerTask {
    public final /* synthetic */ scf a;
    private final Thread b;

    public sci(scf scf, Thread thread) {
        this.a = scf;
        this.b = thread;
    }

    public final void run() {
        Thread thread = this.b;
        if (thread != null) {
            thread.interrupt();
            this.a.aa.post(new scl(this));
        }
    }
}
