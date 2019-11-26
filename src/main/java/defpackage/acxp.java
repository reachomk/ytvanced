package defpackage;

/* renamed from: acxp */
final class acxp {
    public final boolean a;
    private final String b;

    public final void a(String str) {
        if (this.a) {
            String str2 = this.b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 32) + String.valueOf(str).length());
            stringBuilder.append("[DefaultLatencyActionLogger] <");
            stringBuilder.append(str2);
            stringBuilder.append("> ");
            stringBuilder.append(str);
            xtl.e(stringBuilder.toString());
        }
    }

    /* synthetic */ acxp(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
