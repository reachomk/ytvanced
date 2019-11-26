package defpackage;

/* renamed from: aako */
public enum aako {
    MS(-2),
    NO_OP(-1),
    C(1),
    CPN(2),
    CONN(8),
    CMT(10);
    
    public final int d;

    private aako(int i) {
        this.d = i;
    }
}
