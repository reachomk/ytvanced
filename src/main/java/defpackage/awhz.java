package defpackage;

/* renamed from: awhz */
public enum awhz implements anxv {
    PLAYLIST_ENTITY_VISIBILITY_UNKNOWN(0),
    PLAYLIST_ENTITY_VISIBILITY_PUBLIC(1),
    PLAYLIST_ENTITY_VISIBILITY_PRIVATE(2),
    PLAYLIST_ENTITY_VISIBILITY_UNLISTED(3);
    
    private final int e;

    public final int getNumber() {
        return this.e;
    }

    public static awhz a(int i) {
        if (i == 0) {
            return PLAYLIST_ENTITY_VISIBILITY_UNKNOWN;
        }
        if (i == 1) {
            return PLAYLIST_ENTITY_VISIBILITY_PUBLIC;
        }
        if (i != 2) {
            return i != 3 ? null : PLAYLIST_ENTITY_VISIBILITY_UNLISTED;
        } else {
            return PLAYLIST_ENTITY_VISIBILITY_PRIVATE;
        }
    }

    public static anxx a() {
        return awhy.a;
    }

    private awhz(int i) {
        this.e = i;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
