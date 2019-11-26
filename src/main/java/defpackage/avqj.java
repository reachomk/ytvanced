package defpackage;

/* renamed from: avqj */
public final class avqj extends anxo implements anzf {
    private avqj() {
        super(avqk.g);
    }

    public final avqj a(boolean z) {
        copyOnWrite();
        avqk avqk = (avqk) this.instance;
        avqk.a |= 1;
        avqk.b = z;
        return this;
    }

    public final avqj a(int i) {
        copyOnWrite();
        avqk avqk = (avqk) this.instance;
        avqk.a |= 2;
        avqk.c = i;
        return this;
    }

    public final avqj a(long j) {
        copyOnWrite();
        avqk avqk = (avqk) this.instance;
        avqk.a |= 4;
        avqk.d = j;
        return this;
    }

    public final avqj b(boolean z) {
        copyOnWrite();
        avqk avqk = (avqk) this.instance;
        avqk.a |= 16;
        avqk.f = z;
        return this;
    }

    /* synthetic */ avqj(byte b) {
        super(avqk.g);
    }
}
