package defpackage;

/* renamed from: auxh */
public enum auxh implements anxv {
    RICH_METADATA_RENDERER_STYLE_UNSPECIFIED(0),
    RICH_METADATA_RENDERER_STYLE_TOPIC(1),
    RICH_METADATA_RENDERER_STYLE_BOX_ART(2),
    RICH_METADATA_RENDERER_STYLE_THUMBNAIL(3);
    
    private final int e;

    public final int getNumber() {
        return this.e;
    }

    public static auxh a(int i) {
        if (i == 0) {
            return RICH_METADATA_RENDERER_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return RICH_METADATA_RENDERER_STYLE_TOPIC;
        }
        if (i != 2) {
            return i != 3 ? null : RICH_METADATA_RENDERER_STYLE_THUMBNAIL;
        } else {
            return RICH_METADATA_RENDERER_STYLE_BOX_ART;
        }
    }

    public static anxx a() {
        return auxj.a;
    }

    private auxh(int i) {
        this.e = i;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
