package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.infocards.ui.InfoCardsPlaylistThumbnailView;
import com.google.android.youtube.R;

/* renamed from: zuo */
final class zuo extends aqj {
    public final InfoCardsPlaylistThumbnailView p;
    public final TextView q;
    public final View r;
    public final TextView s;
    public final TextView t;
    public final TextView u;

    public zuo(View view) {
        super(view);
        this.p = (InfoCardsPlaylistThumbnailView) view.findViewById(R.id.playlist_thumbnail);
        this.q = (TextView) view.findViewById(R.id.custom_message);
        this.r = view.findViewById(R.id.custom_message_divider);
        this.s = (TextView) view.findViewById(R.id.title);
        this.t = (TextView) view.findViewById(R.id.owner);
        this.u = (TextView) view.findViewById(R.id.video_count);
    }
}
