package defpackage;

/* renamed from: aust */
public final class aust extends anxo implements anzf {
    private aust() {
        super(ausu.l);
    }

    public final aust a(aute aute) {
        copyOnWrite();
        ausu ausu = (ausu) this.instance;
        if (aute != null) {
            if (!ausu.h.a()) {
                ausu.h = anxl.mutableCopy(ausu.h);
            }
            ausu.h.add(aute);
            return this;
        }
        throw new NullPointerException();
    }

    public final aust a() {
        copyOnWrite();
        ((ausu) this.instance).h = anxl.emptyProtobufList();
        return this;
    }

    public final aust a(ausw ausw) {
        copyOnWrite();
        ausu ausu = (ausu) this.instance;
        if (ausw != null) {
            if (!ausu.k.a()) {
                ausu.k = anxl.mutableCopy(ausu.k);
            }
            ausu.k.add(ausw);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aust(byte b) {
        super(ausu.l);
    }

    public final aust a(int i) {
        copyOnWrite();
        ausu ausu = (ausu) this.instance;
        ausu.a |= 1;
        ausu.d = 2;
        return this;
    }
}
