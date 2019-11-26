package defpackage;

/* renamed from: iag */
public final class iag implements iah {
    private final int a;

    public final awbe a() {
        awbe awbe = (awbe) awbf.g.createBuilder();
        int i = this.a;
        awbe.copyOnWrite();
        awbf awbf = (awbf) awbe.instance;
        if (i != 0) {
            awbf.a |= 1;
            awbf.b = i - 1;
            return awbe;
        }
        throw new NullPointerException();
    }

    iag(int i) {
        this.a = i;
    }
}
