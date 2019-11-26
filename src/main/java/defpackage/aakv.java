package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aakv */
public final class aakv implements xcp {
    public final afpi a;
    private final Executor b;

    public aakv(Executor executor, afpi afpi) {
        this.b = (Executor) amqw.a((Object) executor);
        this.a = (afpi) amqw.a((Object) afpi);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aakt.class};
        } else if (i == 0) {
            aakt aakt = (aakt) obj;
            if (aakt.a == null) {
                this.a.f();
                return null;
            }
            this.b.execute(new aaku(this, aakt));
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
