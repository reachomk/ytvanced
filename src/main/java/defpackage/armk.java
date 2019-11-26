package defpackage;

/* renamed from: armk */
public final class armk extends anxo implements anzf {
    private armk() {
        super(arml.f);
    }

    public final armk a(armp armp) {
        copyOnWrite();
        arml arml = (arml) this.instance;
        if (armp != null) {
            arml.a();
            arml.b.add(armp);
            return this;
        }
        throw new NullPointerException();
    }

    public final armk a(armo armo) {
        copyOnWrite();
        arml arml = (arml) this.instance;
        arml.a();
        arml.b.add((armp) ((anxl) armo.build()));
        return this;
    }

    public final armk a(String str) {
        copyOnWrite();
        arml arml = (arml) this.instance;
        if (str != null) {
            arml.a |= 1;
            arml.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ armk(byte b) {
        super(arml.f);
    }
}
