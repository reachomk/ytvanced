package defpackage;

import java.util.Observable;
import java.util.Observer;

/* renamed from: alqj */
final /* synthetic */ class alqj implements Observer {
    private final alqh a;

    alqj(alqh alqh) {
        this.a = alqh;
    }

    public final void update(Observable observable, Object obj) {
        this.a.f();
    }
}
