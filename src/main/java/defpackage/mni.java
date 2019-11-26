package defpackage;

/* renamed from: mni */
public final class mni {
    public final String a;
    public final String b;
    public final String c;
    private int d;

    public mni(String str, String str2, String str3) {
        this.a = xvd.a(str, (Object) "App package name cannot be null or empty");
        this.b = xvd.a(str2, (Object) "App versionName cannot be null or empty");
        this.c = xvd.a(str3, (Object) "App developerKey cannot be null or empty");
    }

    public final int a() {
        return ((this.a.hashCode() + 527) * 31) + this.c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof mni)) {
            mni mni = (mni) obj;
            return this.a.equals(mni.a) && this.b.equals(mni.b) && this.c.equals(mni.c);
        }
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        i = ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        this.d = i;
        return i;
    }
}
