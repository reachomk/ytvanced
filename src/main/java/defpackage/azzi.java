package defpackage;

/* renamed from: azzi */
public enum azzi {
    BAD_URL(false),
    CANCELED(false),
    REQUEST_BODY_READ_ERROR(false),
    CONNECTION_ERROR(true),
    SERVER_ERROR(true),
    UNKNOWN(false);
    
    public final boolean g;

    private azzi(boolean z) {
        this.g = z;
    }
}
