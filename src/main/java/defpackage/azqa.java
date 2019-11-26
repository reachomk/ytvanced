package defpackage;

/* renamed from: azqa */
public final class azqa extends anxo implements anzf {
    private azqa() {
        super(azqb.b);
    }

    public final int a() {
        return ((azqb) this.instance).a.size();
    }

    public final azqd a(int i) {
        return (azqd) ((azqb) this.instance).a.get(i);
    }

    public final azqa b() {
        copyOnWrite();
        ((azqb) this.instance).a = anxl.emptyProtobufList();
        return this;
    }

    /* synthetic */ azqa(byte b) {
        super(azqb.b);
    }
}
