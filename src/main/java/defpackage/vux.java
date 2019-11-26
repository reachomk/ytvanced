package defpackage;

/* renamed from: vux */
final class vux implements afsw {
    public boolean a;
    private final aakj b;
    private final String c;
    private final String d;
    private final /* synthetic */ vuv e;

    vux(vuv vuv, aakj aakj, String str, String str2) {
        this.e = vuv;
        this.b = aakj;
        this.c = str;
        this.d = str2;
    }

    public final void a(bqn bqn) {
        if (this.a) {
            for (vuu a : this.e.c) {
                a.a(this.b);
            }
        } else {
            String valueOf = String.valueOf(this.c);
            String str = "Couldn't retrieve ad overlay for video ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.a(valueOf, (Throwable) bqn);
            for (vuu a2 : this.e.c) {
                a2.a(bqn);
            }
        }
        this.e.a();
    }
}
