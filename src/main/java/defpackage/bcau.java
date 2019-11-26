package defpackage;

/* renamed from: bcau */
public final class bcau extends anxo implements anzf {
    private bcau() {
        super(bcar.e);
    }

    public final int a() {
        return ((bcar) this.instance).b;
    }

    public final bcau a(int i) {
        copyOnWrite();
        bcar bcar = (bcar) this.instance;
        bcar.a |= 1;
        bcar.b = i;
        return this;
    }

    public final bcau a(long j) {
        copyOnWrite();
        bcar bcar = (bcar) this.instance;
        bcar.a |= 2;
        bcar.c = j;
        return this;
    }

    public final bcau a(bcah bcah) {
        copyOnWrite();
        bcar bcar = (bcar) this.instance;
        if (bcah != null) {
            bcar.d = bcah;
            bcar.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final bcau a(bcak bcak) {
        copyOnWrite();
        bcar bcar = (bcar) this.instance;
        bcar.d = (bcah) ((anxl) bcak.build());
        bcar.a |= 4;
        return this;
    }

    /* synthetic */ bcau(byte b) {
        super(bcar.e);
    }
}
