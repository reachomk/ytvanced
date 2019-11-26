package defpackage;

import java.io.File;

/* renamed from: wvm */
final /* synthetic */ class wvm implements Runnable {
    private final wvn a;
    private final File b;

    wvm(wvn wvn, File file) {
        this.a = wvn;
        this.b = file;
    }

    public final void run() {
        wvn wvn = this.a;
        for (File file : this.b.listFiles()) {
            if (file.isDirectory() && file.getName().startsWith("failovercache-")) {
                wvn.a(file);
            }
        }
    }
}
