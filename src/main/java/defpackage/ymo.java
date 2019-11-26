package defpackage;

/* renamed from: ymo */
public final class ymo extends anxo implements anzf {
    private ymo() {
        super(yml.d);
    }

    public final ymo a(boolean z) {
        copyOnWrite();
        yml yml = (yml) this.instance;
        yml.a |= 1;
        yml.b = z;
        return this;
    }

    public final ymo b(boolean z) {
        copyOnWrite();
        yml yml = (yml) this.instance;
        yml.a |= 2;
        yml.c = z;
        return this;
    }

    /* synthetic */ ymo(byte b) {
        super(yml.d);
    }
}
