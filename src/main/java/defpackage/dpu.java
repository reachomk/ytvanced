package defpackage;

import java.io.File;

/* renamed from: dpu */
final class dpu implements Runnable {
    private final /* synthetic */ dos a;

    dpu(dos dos) {
        this.a = dos;
    }

    public final void run() {
        if (((Boolean) this.a.f.get()).booleanValue()) {
            for (File delete : ((File) this.a.af.get()).listFiles()) {
                delete.delete();
            }
        }
    }
}
