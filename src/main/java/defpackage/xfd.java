package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: xfd */
abstract class xfd implements xfi {
    private final Iterable a;
    private boolean b = false;

    xfd(Set set) {
        this.a = amuw.a((Collection) amqw.a((Object) set));
    }

    public abstract void a(Object obj);

    public final void a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    for (Object a : this.a) {
                        a(a);
                    }
                }
            }
        }
    }
}
