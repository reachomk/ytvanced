package defpackage;

/* renamed from: akvd */
public abstract class akvd extends akun {
    public final Object E;
    public final akut L = new akvc(this);
    public akun a_;

    public akvd(akyd akyd, aana aana, xci xci, Object obj, xoi xoi, acvx acvx) {
        super(akyd, aana, xci, obj, xoi, acvx);
        this.E = obj;
    }

    public final ajtf c(ajti ajti) {
        if (this.a_ == null || ajti != ajti.NEXT) {
            return super.c(ajti);
        }
        return this.a_.c(ajti);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object q() {
        return this.E;
    }

    public final void a(ajti ajti) {
        if (this.a_ == null || ajti != ajti.NEXT) {
            super.a(ajti);
        } else {
            this.a_.a(ajti);
        }
    }

    public final boolean b(ajti ajti) {
        if (this.a_ == null || ajti != ajti.NEXT) {
            return super.b(ajti);
        }
        return this.a_.b(ajti);
    }
}
