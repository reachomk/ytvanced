package defpackage;

/* renamed from: amym */
public enum amym {
    SMALL(10),
    MEDIUM(20),
    LARGE(50),
    FULL(-1),
    NONE(0);
    
    public final int a;

    private amym(int i) {
        this.a = i;
    }
}
