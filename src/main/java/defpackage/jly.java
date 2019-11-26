package defpackage;

import java.util.Observable;
import java.util.Observer;

/* renamed from: jly */
final class jly implements Observer {
    public final /* synthetic */ jlv a;

    public final void update(Observable observable, Object obj) {
        if (this.a.a.equals(observable) && (obj instanceof azdi)) {
            this.a.d.post(new jlx(this, obj));
        }
    }

    /* synthetic */ jly(jlv jlv) {
        this.a = jlv;
    }
}
