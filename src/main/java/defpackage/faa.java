package defpackage;

/* renamed from: faa */
public abstract class faa {
    public abstract ezo a();

    public abstract ezo b();

    public abstract int c();

    public abstract ezo d();

    public abstract int e();

    public abstract ezo f();

    public abstract ezo g();

    public abstract ezo h();

    public abstract int i();

    public abstract fac k();

    public static fac j() {
        fad fad = new fad();
        fad.a(new ezo());
        fad.b(new ezo());
        fad.a(0);
        fad.c(new ezo());
        fad.b(0);
        fad.d(new ezo());
        fad.e(new ezo());
        fad.f(new ezo());
        fad.c(0);
        return fad;
    }

    public final String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(b());
        String valueOf3 = String.valueOf(d());
        String valueOf4 = String.valueOf(f());
        String valueOf5 = String.valueOf(g());
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 19) + length2) + length3) + valueOf4.length()) + valueOf5.length());
        stringBuilder.append("ab ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" sb ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" pt ");
        stringBuilder.append(valueOf3);
        stringBuilder.append(" st ");
        stringBuilder.append(valueOf4);
        stringBuilder.append(" it ");
        stringBuilder.append(valueOf5);
        return stringBuilder.toString();
    }
}
