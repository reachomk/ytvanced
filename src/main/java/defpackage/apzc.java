package defpackage;

/* renamed from: apzc */
public enum apzc implements anxv {
    COMMENT_POLL_STATUS_UNKNOWN(0),
    COMMENT_POLL_STATUS_NO_VOTE(10),
    COMMENT_POLL_STATUS_VOTE_NO_COMMENT(20),
    COMMENT_POLL_STATUS_VOTE_AND_COMMENT(30),
    COMMENT_POLL_STATUS_VOTING(40);
    
    public final int f;

    public final int getNumber() {
        return this.f;
    }

    public static apzc a(int i) {
        if (i == 0) {
            return COMMENT_POLL_STATUS_UNKNOWN;
        }
        if (i == 10) {
            return COMMENT_POLL_STATUS_NO_VOTE;
        }
        if (i == 20) {
            return COMMENT_POLL_STATUS_VOTE_NO_COMMENT;
        }
        if (i != 30) {
            return i != 40 ? null : COMMENT_POLL_STATUS_VOTING;
        } else {
            return COMMENT_POLL_STATUS_VOTE_AND_COMMENT;
        }
    }

    public static anxx a() {
        return apzf.a;
    }

    private apzc(int i) {
        this.f = i;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
