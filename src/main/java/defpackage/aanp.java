package defpackage;

import java.util.Set;

/* renamed from: aanp */
public abstract class aanp extends aann {
    private final Set a;

    public aanp(aamn aamn, xhf xhf, Class cls, aald aald, wxm wxm) {
        this(aamn, xhf, cls, amuw.a((Object) aald), wxm);
    }

    public aanp(aamn aamn, xhf xhf, Class cls, Set set, wxm wxm) {
        super(aamn, xhf, cls, wxm);
        this.a = (Set) amqw.a((Object) set);
    }

    public final void b(aoca aoca) {
        for (aald a : this.a) {
            a.a(aoca);
        }
    }
}
