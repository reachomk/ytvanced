package defpackage;

/* renamed from: airu */
final /* synthetic */ class airu implements Runnable {
    private final airv a;
    private final String b;
    private final String c;
    private final int d = -1;
    private final String e;
    private final byte[] f;
    private final int g;
    private final wxg h;

    airu(airv airv, String str, String str2, String str3, byte[] bArr, int i, wxg wxg) {
        this.a = airv;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = bArr;
        this.g = i;
        this.h = wxg;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
