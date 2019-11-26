package defpackage;

/* renamed from: adaw */
final class adaw extends Thread {
    private final /* synthetic */ adas a;

    adaw(adas adas, String str) {
        this.a = adas;
        super(str);
    }

    public final void run() {
        try {
            this.a.e.set(false);
            if (this.a.n.compareAndSet(true, false)) {
                this.a.b(false);
            }
            new adaz(this.a, "mdxBufferedProxy").start();
            adas adas = this.a;
            try {
                adas.i = adas.c.a(adas.j);
                adas.i.a(adas.b);
                adas.i.a();
                adas.n.set(true);
                adas.g();
                synchronized (adas.k) {
                    Thread thread = adas.l;
                    if (!(thread == null || thread.isInterrupted())) {
                        adas.l.interrupt();
                    }
                    adas.l = new aday(adas, "mdxHangingGet");
                    adas.l.start();
                }
            } catch (adbi e) {
                String str = adas.a;
                int i = e.a;
                StringBuilder stringBuilder = new StringBuilder(53);
                stringBuilder.append("Unexpected response when binding channel: ");
                stringBuilder.append(i);
                xtl.a(str, stringBuilder.toString(), e);
                int i2 = e.a;
                if (i2 == 401 || i2 == 403) {
                    adas.a(false);
                }
                adas.i();
            } catch (Exception e2) {
                xtl.a(adas.a, "Error connecting to Remote Control server:", e2);
                adas.i();
            }
            if (this.a.n.get()) {
                this.a.h();
            }
            this.a.c(false);
            this.a.q.countDown();
        } catch (Throwable th) {
            this.a.c(false);
            this.a.q.countDown();
        }
    }
}
