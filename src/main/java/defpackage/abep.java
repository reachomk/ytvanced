package defpackage;

/* renamed from: abep */
public final class abep extends aaml {
    public byte[] a;

    public abep(aamd aamd, afpt afpt) {
        super("notification/record_interactions", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        atab atab = (atab) atac.d.createBuilder();
        anvu a = anvu.a(this.a);
        atab.copyOnWrite();
        atac atac = (atac) atab.instance;
        if (a != null) {
            atac.a |= 2;
            atac.c = a;
            return atab;
        }
        throw new NullPointerException();
    }
}
