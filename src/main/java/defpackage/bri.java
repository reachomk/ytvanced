package defpackage;

/* renamed from: bri */
public final class bri extends brg {
    public bri(Object obj) {
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 43);
        stringBuilder.append("Failed to find any ModelLoaders for model: ");
        stringBuilder.append(valueOf);
        super(stringBuilder.toString());
    }

    public bri(Class cls, Class cls2) {
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 54) + valueOf2.length());
        stringBuilder.append("Failed to find any ModelLoaders for model: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" and data: ");
        stringBuilder.append(valueOf2);
        super(stringBuilder.toString());
    }
}
