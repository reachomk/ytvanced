package defpackage;

/* renamed from: aett */
public abstract class aett {
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;

    public aett(String str, int i, long j, long j2, String str2) {
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = str2;
    }

    public abstract long a();

    public boolean a(aett aett) {
        if (!b(aett) || aett.c > this.c) {
            return false;
        }
        return true;
    }

    public final boolean b(aett aett) {
        String str = this.b;
        return str != null && str.equals(aett.b);
    }
}
