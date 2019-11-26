package defpackage;

/* renamed from: yki */
public class yki extends yie {
    public final boolean b;
    public final boolean c;

    public yki(String str, apsk apsk, boolean z, boolean z2) {
        super(str, apsk);
        this.b = z;
        this.c = z2;
    }

    public apsk getEntity() {
        return (apsk) super.getEntity();
    }

    public long g() {
        return ((apsk) getEntity()).getCreated().longValue();
    }
}
