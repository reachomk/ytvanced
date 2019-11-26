package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acsw */
public final class acsw extends RelativeLayout {
    public final TextView a = ((TextView) findViewById(R.id.stat_title_text_view));
    public final TextView b = ((TextView) findViewById(R.id.stat_value_text_view));

    public acsw(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.lc_stat_item, this, true);
        setPaddingRelative((int) getResources().getDimension(R.dimen.lc_post_stream_containers_margin), (int) getResources().getDimension(R.dimen.lc_post_stream_stat_margin_top), 0, 0);
    }
}
