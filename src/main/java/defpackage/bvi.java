package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bvi */
final class bvi {
    public final cgf a;
    public final Executor b;

    bvi(cgf cgf, Executor executor) {
        this.a = cgf;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bvi)) {
            return false;
        }
        return this.a.equals(((bvi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
