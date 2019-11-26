package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: abon */
public final /* synthetic */ class abon implements Callable {
    private final abol a;

    public abon(abol abol) {
        this.a = abol;
    }

    public final Object call() {
        Collection collection;
        abol abol = this.a;
        aboc aboc = new aboc("");
        if (abol.a.d()) {
            aboo aboo = abol.b.b;
            abnp abnp = null;
            if (aboo != null) {
                abnq a = aboo.a();
                if (a != null) {
                    abnp = a.c();
                }
            }
            if (abnp != null) {
                abol.i.set(abnp.a.size());
                collection = abnp.a;
            } else {
                collection = Collections.emptyList();
            }
        } else {
            collection = Collections.emptySet();
        }
        aboc.c = collection;
        return aboc;
    }
}
