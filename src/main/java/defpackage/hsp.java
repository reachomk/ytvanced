package defpackage;

/* renamed from: hsp */
public final class hsp {
    public static hsq a(int i, boolean z) {
        if (i != 0) {
            return new hsq(i, z);
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }
}
