package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: hjw */
public final class hjw {
    private final Activity a;
    private final String b;
    private final flj c;
    private final agvz d;
    private final ffp e;
    private final TextView f;
    private final View g;
    private final TextView h;

    public hjw(Activity activity, agwc agwc, aaas aaas, hsy hsy, fll fll, ViewGroup viewGroup, String str) {
        this.a = activity;
        this.d = agwc.b();
        this.b = str;
        this.c = fll.a((FloatingActionButton) viewGroup.findViewById(R.id.playlist_fab));
        this.f = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.g = viewGroup.findViewById(R.id.settings_button);
        this.h = (TextView) viewGroup.findViewById(R.id.playlist_size);
        this.e = ffo.a(hsy.a(str), activity.getString(R.string.accessibility_playlist_play_all));
        this.g.setOnClickListener(new hjz(aaas));
        xpr.a(viewGroup.findViewById(R.id.playlist_channel), false);
        xpr.a(viewGroup.findViewById(R.id.playlist_description), false);
        xpr.a(viewGroup.findViewById(R.id.offline_sync_button), false);
        xpr.a(viewGroup.findViewById(R.id.like_button), false);
        xpr.a(viewGroup.findViewById(R.id.offline_button), false);
        xpr.a(viewGroup.findViewById(R.id.share_button), false);
        xpr.a(viewGroup.findViewById(R.id.edit_button), false);
    }

    public final void a() {
        if (this.b.equals(hpr.a)) {
            this.f.setText(R.string.auto_offline_videos_title);
            xpr.a(this.g, true);
            agwf o = this.d.o();
            if (o.a(this.b) != null) {
                List<agqy> b = o.b(this.b);
                for (agqy u : b) {
                    if (u.u() == agqs.PLAYABLE) {
                        this.c.a(this.e);
                        break;
                    }
                }
                b();
                if (b.isEmpty()) {
                    xpr.a(this.h, false);
                } else {
                    xpr.a(this.h, this.a.getResources().getQuantityString(R.plurals.playlist_size, b.size(), new Object[]{Integer.valueOf(b.size())}));
                    return;
                }
            }
            return;
        }
        xtl.c("Trying to present non-AO video list.");
    }

    public final void b() {
        this.c.a(null);
    }
}
