package defpackage;

/* renamed from: agqs */
public enum agqs {
    DELETED(true),
    PLAYABLE(false),
    CANDIDATE(false),
    TRANSFER_IN_PROGRESS(false),
    TRANSFER_WAITING_IN_QUEUE(false),
    TRANSFER_PENDING_USER_APPROVAL(false),
    TRANSFER_PENDING_NETWORK(false),
    TRANSFER_PENDING_WIFI(false),
    TRANSFER_PENDING_CHARGER(false),
    TRANSFER_PENDING_TOOTHFAIRY(false),
    TRANSFER_PENDING_STORAGE(false),
    TRANSFER_PAUSED(false),
    OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE(false),
    ERROR_PENDING_PLAYABILITY_ACTION(true),
    ERROR_STREAMS_MISSING(true),
    ERROR_STREAMS_CORRUPT(true),
    ERROR_STREAMS_OUT_OF_DATE(true),
    ERROR_NOT_PLAYABLE(true),
    ERROR_POLICY(true),
    ERROR_EXPIRED(true),
    ERROR_NO_STORAGE(true),
    ERROR_NETWORK(true),
    ERROR_DISK(true),
    ERROR_GENERIC(true);
    
    public final boolean y;

    private agqs(boolean z) {
        this.y = z;
    }
}
