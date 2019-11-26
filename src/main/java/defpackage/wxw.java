package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wxw */
public final class wxw {
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public final void a(String str, wxx wxx) {
        amqw.a(wxz.c(str), "Tag %s not allowed.", (Object) str);
        if (this.b.putIfAbsent(str, wxx) != null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 27);
            stringBuilder.append("Tag ");
            stringBuilder.append(str);
            stringBuilder.append(" is already registered.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final wxx a(String str) {
        return (wxx) this.b.get(wxz.e(str));
    }
}
