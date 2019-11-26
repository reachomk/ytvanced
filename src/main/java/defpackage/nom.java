package defpackage;

/* renamed from: nom */
public class nom {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;

    public nom(String str, String str2, int i, int i2, int i3, int i4) {
        this(str, str2, i, i2, -1.0f, i3, i4, -1, null, null);
    }

    public nom(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        this.a = (String) nwf.a((Object) str);
        this.b = str2;
        this.d = i;
        this.e = i2;
        this.f = f;
        this.g = i3;
        this.h = i4;
        this.c = i5;
        this.j = str3;
        this.i = str4;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj == null || getClass() != obj.getClass()) ? false : ((nom) obj).a.equals(this.a);
    }
}
