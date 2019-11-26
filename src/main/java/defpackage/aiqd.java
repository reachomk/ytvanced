package defpackage;

import java.util.Observable;
import java.util.Observer;

/* renamed from: aiqd */
public final class aiqd extends Observable implements Observer {
    private final boolean a;
    private final afjv b;
    private final afjv c;
    private final afjv d;
    private final afjv e;

    @Deprecated
    public aiqd() {
        this(aiqc.a, aiqc.a, aiqc.a, aiqc.a, (byte) 0);
    }

    private final afjs a(afjs afjs) {
        return afjs;
    }

    public aiqd(afjv afjv, afjv afjv2, afjv afjv3, afjv afjv4) {
        this(afjv, afjv2, afjv3, afjv4, (byte) 0);
    }

    private aiqd(afjv afjv, afjv afjv2, afjv afjv3, afjv afjv4, byte b) {
        this.a = false;
        this.b = (afjv) amqw.a((Object) afjv);
        this.c = (afjv) amqw.a((Object) afjv2);
        this.d = (afjv) amqw.a((Object) afjv3);
        this.e = (afjv) amqw.a((Object) afjv4);
        this.b.addObserver(this);
        this.c.addObserver(this);
        this.d.addObserver(this);
        this.e.addObserver(this);
    }

    /* Access modifiers changed, original: final */
    public final afjs a() {
        return a((afjs) this.b.get());
    }

    /* Access modifiers changed, original: final */
    public final afjs b() {
        return a((afjs) this.c.get());
    }

    /* Access modifiers changed, original: final */
    public final afjs c() {
        return a((afjs) this.d.get());
    }

    /* Access modifiers changed, original: final */
    public final afjs d() {
        return a((afjs) this.e.get());
    }

    public final void update(Observable observable, Object obj) {
        setChanged();
        if (observable == this.b) {
            notifyObservers(Integer.valueOf(0));
        } else if (observable == this.c) {
            notifyObservers(Integer.valueOf(1));
        } else if (observable == this.d) {
            notifyObservers(Integer.valueOf(2));
        } else if (observable == this.e) {
            notifyObservers(Integer.valueOf(3));
        }
    }
}
