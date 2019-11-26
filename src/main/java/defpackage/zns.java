package defpackage;

/* renamed from: zns */
final /* synthetic */ class zns implements bqk {
    private final String a;

    zns(String str) {
        this.a = str;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(this.a);
        String str = "Error fetching asset: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        xtl.c(valueOf);
        if (bqn != null) {
            bqd bqd = bqn.b;
            if (bqd != null) {
                int i = bqd.a;
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Response status code: ");
                stringBuilder.append(i);
                xtl.c(stringBuilder.toString());
            }
        }
    }
}
