package defpackage;

/* renamed from: aupo */
public final class aupo extends anxo implements anzf {
    private aupo() {
        super(aupl.e);
    }

    public final aupo a(boolean z) {
        copyOnWrite();
        aupl aupl = (aupl) this.instance;
        aupl.a |= 2;
        aupl.c = z;
        return this;
    }

    public final aupo b(boolean z) {
        copyOnWrite();
        aupl aupl = (aupl) this.instance;
        aupl.a |= 4;
        aupl.d = z;
        return this;
    }

    /* synthetic */ aupo(byte b) {
        super(aupl.e);
    }

    public final aupo a(int i) {
        copyOnWrite();
        aupl aupl = (aupl) this.instance;
        if (i != 0) {
            aupl.a |= 1;
            aupl.b = i - 1;
            return this;
        }
        throw new NullPointerException();
    }
}
