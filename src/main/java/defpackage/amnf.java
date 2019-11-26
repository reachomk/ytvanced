package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: amnf */
final class amnf extends anhl {
    private final WeakReference a;

    public final boolean cancel(boolean z) {
        amne amne = (amne) this.a.get();
        z = super.cancel(z);
        if (!z || amne == null) {
            return z;
        }
        amne.a = null;
        amne.b = null;
        amne.c.a();
        return true;
    }

    public final boolean a_(Object obj) {
        return super.a_(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(Throwable th) {
        return super.a(th);
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        amne amne = (amne) this.a.get();
        if (amne == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        String valueOf = String.valueOf(amne.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 6);
        stringBuilder.append("tag=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* synthetic */ amnf(amne amne) {
        this.a = new WeakReference(amne);
    }
}
