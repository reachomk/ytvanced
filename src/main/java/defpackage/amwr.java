package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

/* renamed from: amwr */
abstract class amwr extends AbstractSet {
    amwr() {
    }

    public boolean removeAll(Collection collection) {
        return amws.a((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        return super.retainAll((Collection) amqw.a((Object) collection));
    }
}
