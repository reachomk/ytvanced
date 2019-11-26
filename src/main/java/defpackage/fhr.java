package defpackage;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import com.google.android.youtube.R;
import java.util.EnumMap;

/* renamed from: fhr */
public final class fhr implements akvp {
    private final EnumMap a = new EnumMap(arwh.class);
    private final EnumMap b = new EnumMap(arwh.class);
    private final Context c;
    private final akvp d;

    public fhr(Context context, akvp akvp) {
        this.c = context;
        this.d = akvp;
        a(arwh.DOWNLOADS_PAGE_EMPTY, R.attr.downloadsPageEmptyIcon, R.drawable.ic_downloads_page_empty_light);
        a(arwh.YOUTUBE_RED_ORIGINALS_BUTTON_RED, R.attr.youtubeRedOriginalsButtonRedIcon, R.drawable.youtube_originals_red);
        a(arwh.CREATE_LIVE_STREAM, R.attr.createLiveIcon, R.drawable.ic_yt_create_live_light);
        a(arwh.CREATE_POST, R.attr.createPostIcon, R.drawable.ic_yt_create_post_light);
        a(arwh.CREATE_REEL_ITEM, R.attr.createReelIcon, R.drawable.ic_yt_create_reel_light);
        a(arwh.CREATE_VIDEO, R.attr.createVodIcon, R.drawable.ic_yt_create_vod_light);
        a(arwh.SHOW_MORE, R.attr.expandButtonIcon, R.drawable.btn_expand_light);
        a(arwh.REELS_ADD, R.attr.reelsAddIcon, R.drawable.ic_yt_stories_add_light);
        a(arwh.LOGGED_OUT_LIBRARY, R.attr.loggedOutLibrary, R.drawable.ic_logged_out_library_light);
        a(arwh.WATCH_HISTORY_PAUSED, R.attr.watchHistoryPausedIcon, R.drawable.ic_watch_history_paused_light);
    }

    public final int a(arwh arwh) {
        if (!this.a.containsKey(arwh)) {
            return this.d.a(arwh);
        }
        TypedValue typedValue = new TypedValue();
        Theme theme = this.c.getTheme();
        if (theme == null || !theme.resolveAttribute(((Integer) this.a.get(arwh)).intValue(), typedValue, true)) {
            return ((Integer) this.b.get(arwh)).intValue();
        }
        return typedValue.resourceId;
    }

    private final void a(arwh arwh, int i, int i2) {
        this.a.put(arwh, Integer.valueOf(i));
        this.b.put(arwh, Integer.valueOf(i2));
    }
}
