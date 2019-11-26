package defpackage;

/* renamed from: auri */
public final class auri extends anxo implements anzf {
    private auri() {
        super(aurg.e);
    }

    public final auri a(String str) {
        copyOnWrite();
        aurg aurg = (aurg) this.instance;
        if (str != null) {
            aurg.a |= 1;
            aurg.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ auri(byte b) {
        super(aurg.e);
    }
}
