package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: ucf */
public final class ucf {
    public uci a;
    public ucg b;
    private final ucj c;
    private boolean d = false;

    public ucf(boolean z) {
        Object ucj = new ucj(z);
        this.c = (ucj) uhy.a(ucj);
    }

    public final synchronized void a(Object obj, String str) {
        if (this.d) {
            if (this.a == null) {
                ucj ucj = this.c;
                this.a = new uci(new ReferenceQueue(), new uck(), this.b, ucj.a);
                this.a.start();
                tyv.b("LeakWatcher", "Starting leak watcher thread.", new Object[0]);
            }
            uci uci = this.a;
            uhy.a((Object) str);
            uhy.a(obj);
            tyv.b("LeakWatcherThread", "Watching %s", str);
            uce a = uci.d.a(obj, str, uci.a);
            synchronized (uci.c) {
                a.a(uci.c);
            }
        }
    }

    public final synchronized void a() {
        this.d = true;
    }

    public final synchronized void b() {
        if (this.d) {
            this.d = false;
            uci uci = this.a;
            if (uci != null) {
                uci.interrupt();
                this.a = null;
            }
            tyv.b("LeakWatcher", "Stopping leak watcher thread.", new Object[0]);
        }
    }
}
