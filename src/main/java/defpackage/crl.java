package defpackage;

/* renamed from: crl */
public abstract class crl implements Runnable {
    public final Throwable a;

    public crl() {
        Thread currentThread = Thread.currentThread();
        StringBuilder stringBuilder = new StringBuilder("Runnable instantiated on thread id: ");
        stringBuilder.append(currentThread.getId());
        stringBuilder.append(", name: ");
        stringBuilder.append(currentThread.getName());
        this.a = new Throwable(stringBuilder.toString());
    }

    public abstract void a(Throwable th);

    public crl(Throwable th) {
        this();
        this.a.initCause(th);
    }

    public final void run() {
        a(this.a);
    }
}
