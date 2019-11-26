package defpackage;

/* renamed from: brk */
public final class brk extends brg {
    public brk(Class cls) {
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 46);
        stringBuilder.append("Failed to find source encoder for data class: ");
        stringBuilder.append(valueOf);
        super(stringBuilder.toString());
    }
}
