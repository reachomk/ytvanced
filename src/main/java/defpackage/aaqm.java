package defpackage;

/* renamed from: aaqm */
public final class aaqm extends aaml {
    public String a;

    public aaqm(aamd aamd, afpt afpt) {
        super("channel/delete_channel_post", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        asch asch = (asch) asce.d.createBuilder();
        String str = this.a;
        asch.copyOnWrite();
        asce asce = (asce) asch.instance;
        if (str != null) {
            asce.a |= 2;
            asce.c = str;
            return asch;
        }
        throw new NullPointerException();
    }
}
