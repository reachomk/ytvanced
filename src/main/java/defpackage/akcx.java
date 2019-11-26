package defpackage;

/* renamed from: akcx */
public final class akcx extends sxd {
    private final sxg a;

    public akcx(sxg sxg) {
        this.a = sxg;
    }

    private static int a(int i) {
        return i + -1 != 1 ? 2 : 1;
    }

    public final void a(int i, String str, Throwable th) {
        if (th != null) {
            afpc.a(akcx.a(i), afpf.elements, str, th);
            sxg sxg = this.a;
            String localizedMessage = th.getLocalizedMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(localizedMessage).length());
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(localizedMessage);
            sxg.a(i, stringBuilder.toString());
            return;
        }
        afpc.a(akcx.a(i), afpf.elements, str);
        this.a.a(i, str);
    }

    public final void b(int i, String str, Throwable th) {
        String str2 = ": ";
        if (th != null) {
            afpf afpf = afpf.elements;
            String a = azsk.a(i);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 2) + String.valueOf(str).length());
            stringBuilder.append(a);
            stringBuilder.append(str2);
            stringBuilder.append(str);
            afpc.a(2, afpf, stringBuilder.toString(), th);
            sxg sxg = this.a;
            String localizedMessage = th.getLocalizedMessage();
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(localizedMessage).length());
            stringBuilder2.append(str);
            stringBuilder2.append(" ");
            stringBuilder2.append(localizedMessage);
            sxg.b(i, stringBuilder2.toString());
            return;
        }
        afpf afpf2 = afpf.elements;
        String a2 = azsk.a(i);
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(a2).length() + 2) + String.valueOf(str).length());
        stringBuilder3.append(a2);
        stringBuilder3.append(str2);
        stringBuilder3.append(str);
        afpc.a(2, afpf2, stringBuilder3.toString());
        this.a.b(i, str);
    }
}
