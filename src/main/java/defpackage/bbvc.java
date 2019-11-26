package defpackage;

/* renamed from: bbvc */
public final class bbvc extends bbmi implements bbpe {
    private final Object a;

    public bbvc(Object obj) {
        this.a = obj;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmo bbmo) {
        bbnc bbvu = new bbvu(bbmo, this.a);
        bbmo.a(bbvu);
        bbvu.run();
    }

    public final Object call() {
        return this.a;
    }
}
