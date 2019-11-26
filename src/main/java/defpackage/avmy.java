package defpackage;

/* renamed from: avmy */
public enum avmy implements anxv {
    OFFLINE_CANDIDATE_TYPE_UNKNOWN(0),
    OFFLINE_CANDIDATE_TYPE_MAIN_DOWNLOAD_RECOMMENDATIONS(1),
    OFFLINE_CANDIDATE_TYPE_LITE_HOMEPAGE(2),
    OFFLINE_CANDIDATE_TYPE_LITE_NOTIFICATION(3),
    OFFLINE_CANDIDATE_TYPE_LITE_SUBSCRIPTION(4),
    OFFLINE_CANDIDATE_TYPE_LITE_SOCIAL(5),
    OFFLINE_CANDIDATE_TYPE_LITE_EPISODIC_RECOMMENDATION(6);
    
    public final int g;

    public final int getNumber() {
        return this.g;
    }

    public static avmy a(int i) {
        switch (i) {
            case 0:
                return OFFLINE_CANDIDATE_TYPE_UNKNOWN;
            case 1:
                return OFFLINE_CANDIDATE_TYPE_MAIN_DOWNLOAD_RECOMMENDATIONS;
            case 2:
                return OFFLINE_CANDIDATE_TYPE_LITE_HOMEPAGE;
            case 3:
                return OFFLINE_CANDIDATE_TYPE_LITE_NOTIFICATION;
            case 4:
                return OFFLINE_CANDIDATE_TYPE_LITE_SUBSCRIPTION;
            case 5:
                return OFFLINE_CANDIDATE_TYPE_LITE_SOCIAL;
            case 6:
                return OFFLINE_CANDIDATE_TYPE_LITE_EPISODIC_RECOMMENDATION;
            default:
                return null;
        }
    }

    public static anxx a() {
        return avnb.a;
    }

    private avmy(int i) {
        this.g = i;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
