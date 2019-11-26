package defpackage;

/* renamed from: arjh */
public final class arjh extends anxo implements anzf {
    private arjh() {
        super(arje.e);
    }

    public final int a() {
        return ((arje) this.instance).b.size();
    }

    public final axak a(int i) {
        return (axak) ((arje) this.instance).b.get(i);
    }

    public final arjh a(int i, axaj axaj) {
        copyOnWrite();
        arje arje = (arje) this.instance;
        arje.a();
        arje.b.set(i, (axak) ((anxl) axaj.build()));
        return this;
    }

    /* synthetic */ arjh(byte b) {
        super(arje.e);
    }
}
