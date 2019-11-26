package defpackage;

import java.util.concurrent.Executor;

/* renamed from: amne */
public final class amne {
    public Object a;
    public amnf b;
    public aniy c = new aniy();
    private boolean d;

    private amne() {
    }

    public final boolean a(Object obj) {
        this.d = true;
        amnf amnf = this.b;
        boolean z = false;
        if (amnf != null && amnf.a_(obj)) {
            z = true;
        }
        if (z) {
            a();
        }
        return z;
    }

    public final boolean a(Throwable th) {
        this.d = true;
        amnf amnf = this.b;
        boolean z = false;
        if (amnf != null && amnf.a(th)) {
            z = true;
        }
        if (z) {
            a();
        }
        return z;
    }

    public final void a(Runnable runnable, Executor executor) {
        aniy aniy = this.c;
        if (aniy != null) {
            aniy.a(runnable, executor);
        }
    }

    private final void a() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        amnf amnf = this.b;
        if (!(amnf == null || amnf.isDone())) {
            String valueOf = String.valueOf(this.a);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 102);
            stringBuilder.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            stringBuilder.append(valueOf);
            amnf.a(new amnd(stringBuilder.toString()));
        }
        if (!this.d) {
            aniy aniy = this.c;
            if (aniy != null) {
                aniy.a();
            }
        }
    }

    /* synthetic */ amne(byte b) {
    }
}
