package defpackage;

import java.util.Collection;

/* renamed from: amug */
public abstract class amug extends amur implements amsp {
    amug() {
    }

    public /* bridge */ /* synthetic */ amsp a() {
        throw null;
    }

    public abstract amug b();

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new amui(this);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ amuh c() {
        throw new AssertionError("should never be called");
    }

    public final /* synthetic */ amuh d() {
        return (amuw) values();
    }

    public final /* synthetic */ Collection values() {
        return (amuw) b().keySet();
    }
}
