package defpackage;

/* renamed from: voh */
public final class voh implements afnt {
    public vol a;
    public vsm b;
    public int c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;

    public voh() {
        this(vol.ADSENSE_SKIPPABLE, vsm.PRE_ROLL, -1, 0, "", "", "", "", true, false);
    }

    private voh(vol vol, vsm vsm, int i, long j, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = vol;
        this.b = vsm;
        this.c = i;
        this.d = j;
        this.f = str2;
        this.e = str;
        this.g = str3;
        this.h = str4;
        this.j = z;
        this.i = z2;
    }

    public final String a() {
        int i = this.c;
        if (i == -1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(11);
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final vog c() {
        return new vog(this);
    }

    /* synthetic */ voh(vol vol, vsm vsm, int i, long j, String str, String str2, String str3, String str4, boolean z, boolean z2, byte b) {
        this(vol, vsm, i, j, str, str2, str3, str4, z, z2);
    }

    static {
        vog vog = new vog();
    }
}
