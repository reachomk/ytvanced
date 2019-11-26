package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: yxd */
public final class yxd {
    public final ImageView a;
    public final View b;
    public final yxc c;

    public yxd(Context context, View view, boolean z, boolean z2) {
        amqw.a((Object) view);
        this.a = (ImageView) view.findViewById(R.id.video_thumbnail);
        this.b = view.findViewById(R.id.main_content);
        Pair k = xss.k(context);
        int i = new Point(Math.min(((Integer) k.first).intValue(), ((Integer) k.second).intValue()), Math.max(((Integer) k.first).intValue(), ((Integer) k.second).intValue())).x;
        Resources resources = view.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.video_chat_message_thumbnail_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.chat_message_content_spacer) + resources.getDimensionPixelOffset(R.dimen.chat_message_heart_spacer);
        int dimensionPixelOffset3 = !z ? resources.getDimensionPixelOffset(R.dimen.chat_message_avatar_spacer) + resources.getDimensionPixelOffset(R.dimen.chat_message_author_avatar_size) : i - (dimensionPixelOffset + dimensionPixelOffset2);
        this.c = new yxc(i, dimensionPixelOffset, !z2 ? dimensionPixelOffset2 : dimensionPixelOffset3, !z2 ? dimensionPixelOffset3 : dimensionPixelOffset2, resources.getDimensionPixelOffset(R.dimen.video_chat_message_player_expanded_top_margin), !z ? 8388611 : 8388613);
    }
}
