package defpackage;

import java.util.Collection;

/* renamed from: hij */
final /* synthetic */ class hij implements Runnable {
    private final hig a;
    private final Collection b;

    hij(hig hig, Collection collection) {
        this.a = hig;
        this.b = collection;
    }

    public final void run() {
        hig hig = this.a;
        Collection collection = this.b;
        if (!hig.b.isEmpty()) {
            amxn amxn = (amxn) amul.a(hig.b).listIterator();
            while (amxn.hasNext()) {
                ((hii) amxn.next()).a(collection);
            }
        }
    }
}
