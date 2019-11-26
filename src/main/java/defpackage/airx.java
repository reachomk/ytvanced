package defpackage;

/* renamed from: airx */
public final /* synthetic */ class airx implements Runnable {
    private final airv a;
    private final aiqq b;
    private final String c;
    private final String d;
    private final int e = -1;
    private final aiqw f;

    public airx(airv airv, aiqq aiqq, String str, String str2, aiqw aiqw) {
        this.a = airv;
        this.b = aiqq;
        this.c = str;
        this.d = str2;
        this.f = aiqw;
    }

    public final void run() {
        airv airv = this.a;
        aiqq aiqq = this.b;
        String str = this.c;
        String str2 = this.d;
        int i = this.e;
        aiqw aiqw = this.f;
        aaje a = aiqq.a(str);
        if (a != null) {
            a.a(str2);
            a.l = true;
            airv.a(aiqq, str, i, null, a, true, aiqw);
        }
    }
}
