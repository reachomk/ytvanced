package defpackage;

@Deprecated
/* renamed from: cc */
public final class cc {
    @Deprecated
    private final bz a;
    @Deprecated
    private final bz b;

    @Deprecated
    public cc(bz bzVar, bz bzVar2) {
        if (bzVar.b == bzVar2.b) {
            this.a = bzVar;
            this.b = bzVar2;
            return;
        }
        String valueOf = String.valueOf(bzVar);
        String valueOf2 = String.valueOf(bzVar2);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 55) + valueOf2.length());
        stringBuilder.append("Ranges must have the same number of visible decimals: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("~");
        stringBuilder.append(valueOf2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Deprecated
    public final String toString() {
        Object stringBuilder;
        String valueOf = String.valueOf(this.a);
        bz bzVar = this.b;
        if (bzVar != this.a) {
            String valueOf2 = String.valueOf(bzVar);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 1);
            stringBuilder2.append("~");
            stringBuilder2.append(valueOf2);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        StringBuilder stringBuilder3 = new StringBuilder(valueOf.length() + String.valueOf(stringBuilder).length());
        stringBuilder3.append(valueOf);
        stringBuilder3.append(stringBuilder);
        return stringBuilder3.toString();
    }
}
