package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: bbkr */
public abstract class bbkr {
    private static final Set c = Collections.unmodifiableSet(EnumSet.noneOf(bbku.class));
    private final Set a = c;
    public final bbkv b;

    protected bbkr(bbkv bbkv) {
        this.b = (bbkv) bbit.a((Object) bbkv, (Object) "context");
        bble bble = bbkv.a;
        bbit.a(true, (Object) "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public abstract void a(bbko bbko);

    public void a(bbkq bbkq) {
        throw null;
    }

    static {
        Collections.emptyMap();
    }
}
