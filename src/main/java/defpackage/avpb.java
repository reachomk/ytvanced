package defpackage;

/* renamed from: avpb */
public enum avpb implements anxv {
    OFFLINE_REFRESH_ACTION_UNKNOWN(0),
    OFFLINE_REFRESH_ACTION_REFRESH_PLAYER_RESPONSE(1),
    OFFLINE_REFRESH_ACTION_REFRESH_ADS(2),
    OFFLINE_REFRESH_ACTION_DELETE_ADS(3),
    OFFLINE_REFRESH_ACTION_REFRESH_STREAMS(4),
    OFFLINE_REFRESH_ACTION_REFRESH_METADATA(5),
    OFFLINE_REFRESH_ACTION_REFRESH_STORYBOARDS(6);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static avpb a(int i) {
        switch (i) {
            case 0:
                return OFFLINE_REFRESH_ACTION_UNKNOWN;
            case 1:
                return OFFLINE_REFRESH_ACTION_REFRESH_PLAYER_RESPONSE;
            case 2:
                return OFFLINE_REFRESH_ACTION_REFRESH_ADS;
            case 3:
                return OFFLINE_REFRESH_ACTION_DELETE_ADS;
            case 4:
                return OFFLINE_REFRESH_ACTION_REFRESH_STREAMS;
            case 5:
                return OFFLINE_REFRESH_ACTION_REFRESH_METADATA;
            case 6:
                return OFFLINE_REFRESH_ACTION_REFRESH_STORYBOARDS;
            default:
                return null;
        }
    }

    public static anxx a() {
        return avpa.a;
    }

    private avpb(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
