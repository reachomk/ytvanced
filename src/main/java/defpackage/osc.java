package defpackage;

/* renamed from: osc */
final class osc extends orq {
    private final /* synthetic */ osa a;

    public final void release() {
        osa osa = this.a;
        clear();
        osa.b.add(this);
    }

    /* synthetic */ osc(osa osa) {
        this.a = osa;
    }
}
