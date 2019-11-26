package defpackage;

/* renamed from: auag */
public final class auag extends anxo implements anzf {
    private auag() {
        super(auad.d);
    }

    public final auag a(String str) {
        copyOnWrite();
        auad auad = (auad) this.instance;
        if (str != null) {
            auad.a |= 1;
            auad.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final auag b(String str) {
        copyOnWrite();
        auad auad = (auad) this.instance;
        if (str != null) {
            auad.a |= 2;
            auad.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ auag(byte b) {
        super(auad.d);
    }
}
