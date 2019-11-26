package defpackage;

/* renamed from: aaql */
public final class aaql extends aaml {
    public byte[] a;
    public int b;

    public aaql(aamd aamd, afpt afpt) {
        super("channel/get_channel_creation_form", aamd, afpt);
        g();
    }

    private final asdh n() {
        asdh asdh = (asdh) asde.e.createBuilder();
        int i = this.b;
        asdh.copyOnWrite();
        asde asde = (asde) asdh.instance;
        if (i != 0) {
            asde.a |= 4;
            asde.d = i - 1;
            byte[] bArr = this.a;
            if (bArr != null) {
                anvu a = anvu.a(bArr);
                asdh.copyOnWrite();
                asde = (asde) asdh.instance;
                if (a != null) {
                    asde.a |= 2;
                    asde.c = a;
                } else {
                    throw new NullPointerException();
                }
            }
            return asdh;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b((((asde) n().instance).a & 2) != 0);
    }

    public final /* synthetic */ anzd c() {
        return n();
    }
}
