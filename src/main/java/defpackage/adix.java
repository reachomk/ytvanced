package defpackage;

/* renamed from: adix */
public enum adix {
    MANUAL("manual"),
    DIAL("dial"),
    IN_APP_DIAL("in_app_dial"),
    CAST("cast");
    
    public final String e;

    private adix(String str) {
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
