package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vjx */
public class vjx {
    private final AtomicReference a;

    public vjx(vjw vjw) {
        this.a = new AtomicReference(vjw);
    }

    public final vjw a() {
        return (vjw) this.a.get();
    }

    public final void a(vjw vjw) {
        vjw a = a();
        if (a != vjw) {
            String valueOf = String.valueOf(vjw);
            String valueOf2 = String.valueOf(a);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 34) + valueOf2.length());
            stringBuilder.append("Expected ad stage to be ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", but was ");
            stringBuilder.append(valueOf2);
            xtl.c(stringBuilder.toString());
        }
    }

    public final void b(vjw vjw) {
        vjw vjw2 = (vjw) this.a.getAndSet(vjw);
        String valueOf;
        String valueOf2;
        if (vjw2.a(vjw)) {
            valueOf = String.valueOf(vjw2);
            valueOf2 = String.valueOf(vjw);
            valueOf.length();
            valueOf2.length();
            return;
        }
        valueOf = String.valueOf(vjw2);
        valueOf2 = String.valueOf(vjw);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 31) + valueOf2.length());
        stringBuilder.append("Unexpected transition from ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" to ");
        stringBuilder.append(valueOf2);
        xtl.c(stringBuilder.toString());
    }
}
