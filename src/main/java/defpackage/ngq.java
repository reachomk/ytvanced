package defpackage;

import android.os.Parcelable.Creator;

/* renamed from: ngq */
public enum ngq {
    RELATED_VIDEOS_SCREEN(nhf.CREATOR),
    RELATED_VIDEO_ITEM(nhd.CREATOR),
    MUTED_AUTOPLAY_STATE(ngz.CREATOR),
    VIDEO_DETAILS(nhp.CREATOR),
    VIDEO_CHANNEL_THUMBNAIL(nhn.CREATOR),
    PLAYBACK_EVENT_DATA(nhb.CREATOR),
    ERROR_DATA(ngr.CREATOR),
    HOT_CONFIG_DATA(ngv.CREATOR);
    
    public final Creator i;

    public static ngq a(String str) {
        return (ngq) Enum.valueOf(ngq.class, str);
    }

    private ngq(Creator creator) {
        this.i = creator;
    }
}
