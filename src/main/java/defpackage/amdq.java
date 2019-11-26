package defpackage;

/* renamed from: amdq */
public final class amdq extends anxo implements anzf {
    private amdq() {
        super(amdl.h);
    }

    /* synthetic */ amdq(byte b) {
        super(amdl.h);
    }

    public final amdq a(int i) {
        copyOnWrite();
        amdl amdl = (amdl) this.instance;
        amdl.a |= 1;
        amdl.b = i - 1;
        return this;
    }
}
