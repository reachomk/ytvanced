package defpackage;

/* renamed from: ausz */
public final class ausz extends anxo implements anzf {
    private ausz() {
        super(auta.d);
    }

    public final ausz a(int i) {
        copyOnWrite();
        auta auta = (auta) this.instance;
        auta.a |= 1;
        auta.b = i;
        return this;
    }

    public final ausz b(int i) {
        copyOnWrite();
        auta auta = (auta) this.instance;
        auta.a |= 2;
        auta.c = i;
        return this;
    }

    /* synthetic */ ausz(byte b) {
        super(auta.d);
    }
}
