package defpackage;

import java.util.Observable;
import java.util.Observer;

/* renamed from: ainu */
final class ainu implements Observer {
    private final /* synthetic */ azkm a;
    private final /* synthetic */ aink b;

    ainu(aink aink, azkm azkm) {
        this.b = aink;
        this.a = azkm;
    }

    public final void update(Observable observable, Object obj) {
        this.b.f.deleteObserver(this);
        aink aink = this.b;
        azkm azkm = this.a;
        aink.h.postDelayed(new ains(aink), 300);
        aink.g.a(azkm);
        this.b.a();
        this.b.a(5, this.a);
    }
}
