package defpackage;

/* renamed from: adbs */
final /* synthetic */ class adbs implements tbt {
    private final adbp a;

    adbs(adbp adbp) {
        this.a = adbp;
    }

    public final void a(String str, String str2) {
        adbp adbp = this.a;
        String.valueOf(str).length();
        String.valueOf(str2).length();
        adbl adbl = adbp.a.e;
        if (adbl == null) {
            xtl.b(adbq.a, "No handler set, dropped message.");
        } else {
            adbl.a(str2);
        }
    }
}
