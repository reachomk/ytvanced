package defpackage;

/* renamed from: apig */
public final class apig extends anxo implements anzf {
    private apig() {
        super(apid.f);
    }

    public final apig a(long j) {
        copyOnWrite();
        apid apid = (apid) this.instance;
        apid.a |= 2;
        apid.e = j;
        return this;
    }

    public final apig a(String str) {
        copyOnWrite();
        apid apid = (apid) this.instance;
        if (str != null) {
            apid.b = 3;
            apid.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final apig a(augl augl) {
        copyOnWrite();
        apid apid = (apid) this.instance;
        if (augl != null) {
            apid.c = augl;
            apid.b = 4;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ apig(byte b) {
        super(apid.f);
    }
}
