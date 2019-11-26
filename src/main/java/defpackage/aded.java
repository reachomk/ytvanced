package defpackage;

/* renamed from: aded */
public final /* synthetic */ class aded implements bqk {
    private final adeg a;

    public aded(adeg adeg) {
        this.a = adeg;
    }

    public final void a(bqn bqn) {
        adeg adeg = this.a;
        String str = adeb.a;
        String valueOf = String.valueOf(bqn.getMessage());
        String str2 = "Failed getting crash report id: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        xtl.a(str, valueOf);
        adeg.a(null);
    }
}
