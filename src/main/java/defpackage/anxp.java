package defpackage;

/* renamed from: anxp */
public abstract class anxp extends anxl implements anzf {
    public anxg h = anxg.d;

    /* Access modifiers changed, original: final */
    public final anxg a() {
        anxg anxg = this.h;
        if (anxg.b) {
            this.h = (anxg) anxg.clone();
        }
        return this.h;
    }

    public final void a(anxr anxr) {
        if (anxr.a != ((anxl) getDefaultInstanceForType())) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
