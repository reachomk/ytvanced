package defpackage;

/* renamed from: qna */
public enum qna implements rfd {
    PERSON_ACCOUNT(1),
    PLUS_PAGE(2),
    PMA(3);
    
    public final int a;

    public final int a() {
        return this.a;
    }

    public static qna a(int i) {
        if (i == 1) {
            return PERSON_ACCOUNT;
        }
        if (i != 2) {
            return i != 3 ? null : PMA;
        } else {
            return PLUS_PAGE;
        }
    }

    private qna(int i) {
        this.a = i;
    }

    static {
        qmz qmz = new qmz();
    }
}
