package defpackage;

/* renamed from: rwy */
public final class rwy extends pup {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;

    public rwy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp, ryl ryl) {
        rwo rwo = (rwo) psp;
        rwe rwe = new rwe(ryl);
        rwq rwq = (rwq) rwo.v();
        String str = this.a;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 9) + String.valueOf(str).length());
        stringBuilder.append("CURRENT:");
        stringBuilder.append(str2);
        stringBuilder.append(":");
        stringBuilder.append(str);
        rwq.a(rwe, stringBuilder.toString());
    }
}
