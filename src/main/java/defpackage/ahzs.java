package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ahzs */
final class ahzs extends ahzj {
    public ahzs(Context context, ahys ahys, ajuh ajuh) {
        super(context, ahys, ajuh);
    }

    public final void a(View view) {
        super.a(view);
        view.findViewById(R.id.endscreen_element_duration).setVisibility(8);
        view.findViewById(R.id.endscreen_playlist_bar).setVisibility(0);
        ((TextView) view.findViewById(R.id.playlist_text)).setText(this.a.getString(R.string.endscreen_element_playlist_count, new Object[]{ajqy.a(this.b.d)}));
    }
}
