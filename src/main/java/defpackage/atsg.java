package defpackage;

/* renamed from: atsg */
public final class atsg extends anxo implements anzf {
    private atsg() {
        super(atsh.c);
    }

    /* synthetic */ atsg(byte b) {
        super(atsh.c);
    }

    public final atsg a(int i) {
        copyOnWrite();
        atsh atsh = (atsh) this.instance;
        atsh.a |= 1;
        atsh.b = i - 1;
        return this;
    }
}
