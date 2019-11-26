package defpackage;

import java.util.List;

/* renamed from: amxe */
public final class amxe extends amxg implements amvk {
    public static final long serialVersionUID = 0;

    public amxe(amvk amvk) {
        super(amvk);
    }

    public final List c(Object obj) {
        throw null;
    }

    private final amvk b() {
        return (amvk) super.a();
    }

    /* renamed from: d */
    public final List b(Object obj) {
        List d;
        synchronized (this.b) {
            d = b().d(obj);
        }
        return d;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ amvz a() {
        return b();
    }
}
