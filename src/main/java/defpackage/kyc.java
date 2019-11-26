package defpackage;

/* renamed from: kyc */
public abstract class kyc implements akot, lsx {
    public akor c;
    public Object d;
    public lsy e;

    public void aD_() {
    }

    public void aE_() {
    }

    public abstract void b();

    public abstract void c();

    public final void a_(akor akor, Object obj) {
        this.c = akor;
        this.d = obj;
        this.e = (lsy) akor.a("sectionController");
        b();
        this.e.e.add(this);
    }

    public final void a(akpb akpb) {
        this.e.e.remove(this);
        c();
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
