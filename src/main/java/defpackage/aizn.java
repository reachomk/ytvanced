package defpackage;

/* renamed from: aizn */
public enum aizn {
    NEXT(2),
    PREVIOUS(3),
    AUTOPLAY(4),
    AUTONAV(5),
    JUMP(7),
    INSERT(8);
    
    public final int g;

    private aizn(int i) {
        this.g = i;
    }
}
