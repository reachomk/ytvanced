package defpackage;

/* renamed from: z */
public enum z {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(z zVar) {
        return compareTo(zVar) >= 0;
    }
}
