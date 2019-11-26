package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: jq */
public final class jq {
    public final WeakReference a;
    public int b;
    public boolean c;

    public jq(int i, jn jnVar) {
        this.a = new WeakReference(jnVar);
        this.b = i;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(jn jnVar) {
        return jnVar != null && this.a.get() == jnVar;
    }
}
