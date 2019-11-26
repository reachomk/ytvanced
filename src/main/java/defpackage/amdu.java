package defpackage;

/* renamed from: amdu */
public final class amdu extends anxo implements anzf {
    private amdu() {
        super(amdr.r);
    }

    public final amdu a(int i) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        amdr.a |= 2;
        amdr.c = i;
        return this;
    }

    public final amdu b(int i) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        amdr.a |= 4;
        amdr.d = i;
        return this;
    }

    public final amdu a(atkw atkw) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        if (atkw != null) {
            amdr.a |= 16;
            amdr.f = atkw.f;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdu a(atku atku) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        if (atku != null) {
            amdr.a |= 32;
            amdr.g = atku.p;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdu a(atky atky) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        if (atky != null) {
            amdr.a |= 256;
            amdr.j = atky.f;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdu c(int i) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        amdr.a |= 2048;
        amdr.m = i;
        return this;
    }

    public final amdu d(int i) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        amdr.a |= 4096;
        amdr.n = i;
        return this;
    }

    public final amdu a(long j) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        amdr.a |= 32768;
        amdr.q = j;
        return this;
    }

    /* synthetic */ amdu(byte b) {
        super(amdr.r);
    }

    public final amdu e(int i) {
        copyOnWrite();
        amdr amdr = (amdr) this.instance;
        amdr.a |= 16384;
        amdr.p = i - 1;
        return this;
    }
}
