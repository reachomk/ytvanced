package defpackage;

/* renamed from: brh */
public final class brh extends brg {
    public brh(Class cls) {
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 227);
        stringBuilder.append("Failed to find result encoder for resource class: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        super(stringBuilder.toString());
    }
}
