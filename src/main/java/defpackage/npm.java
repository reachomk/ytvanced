package defpackage;

/* renamed from: npm */
public abstract class npm {
    public final long a;
    public final nom b;
    public final long c;
    public final String d;
    public final String e;
    public final npj f;

    /* synthetic */ npm(String str, long j, nom nom, String str2, npn npn, String str3) {
        this.a = j;
        this.b = nom;
        if (str3 == null) {
            String str4 = nom.a;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(str4).length());
            stringBuilder.append(str);
            str = ".";
            stringBuilder.append(str);
            stringBuilder.append(str4);
            stringBuilder.append(str);
            stringBuilder.append(j);
            str3 = stringBuilder.toString();
        }
        this.e = str3;
        this.f = npn.a(this);
        this.c = nxf.a(npn.c, 1000000, npn.b);
        this.d = str2;
    }

    public abstract npj c();

    public abstract npa d();
}
