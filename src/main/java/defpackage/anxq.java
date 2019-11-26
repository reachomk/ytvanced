package defpackage;

/* renamed from: anxq */
public class anxq extends anxo implements anzf {
    protected anxq(anxp anxp) {
        super(anxp);
    }

    public final void copyOnWrite() {
        if (this.isBuilt) {
            super.copyOnWrite();
            anxp anxp = (anxp) this.instance;
            anxp.h = (anxg) anxp.h.clone();
        }
    }

    private final anxg a() {
        anxg anxg = ((anxp) this.instance).h;
        if (!anxg.b) {
            return anxg;
        }
        anxg = (anxg) anxg.clone();
        ((anxp) this.instance).h = anxg;
        return anxg;
    }

    private final void a(anxr anxr) {
        if (anxr.a != ((anxl) getDefaultInstanceForType())) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public final boolean a(anwy anwy) {
        anxp anxp = (anxp) this.instance;
        anxr access$000 = anxl.checkIsLite(anwy);
        anxp.a(access$000);
        return anxp.h.a(access$000.d);
    }

    public final Object b(anwy anwy) {
        anxp anxp = (anxp) this.instance;
        anxr access$000 = anxl.checkIsLite(anwy);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            return access$000.b;
        }
        return access$000.a(b);
    }

    public final anxq a(anwy anwy, Object obj) {
        anxr access$000 = anxl.checkIsLite(anwy);
        a(access$000);
        copyOnWrite();
        anxg a = a();
        anxf anxf = access$000.d;
        if (anxf.f() == 8) {
            obj = Integer.valueOf(((anxv) obj).getNumber());
        }
        a.a(anxf, obj);
        return this;
    }

    public final anxq c(anwy anwy) {
        anxr access$000 = anxl.checkIsLite(anwy);
        a(access$000);
        copyOnWrite();
        anxg a = a();
        a.a.remove(access$000.d);
        if (a.a.isEmpty()) {
            a.c = false;
        }
        return this;
    }
}
