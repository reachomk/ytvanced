package defpackage;

/* renamed from: boe */
public enum boe {
    JSON(".json"),
    ZIP(".zip");
    
    public final String c;

    private boe(String str) {
        this.c = str;
    }

    public final String toString() {
        return this.c;
    }
}
