package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: gnz */
public final class gnz {
    public final gob a;
    private final View b;
    private View c;

    public gnz(View view, gob gob) {
        this.b = (View) amqw.a((Object) view);
        this.a = (gob) amqw.a((Object) gob);
    }

    public final void a(auvr auvr, int i) {
        this.c = this.b.findViewById(i);
        View view = this.c;
        if (!(view == null || this.a == null)) {
            view.setOnClickListener(new goc(this));
        }
        ggh.a(this.c, auvr != null);
    }

    public final void a() {
        View view = this.b;
        if (view != null) {
            ggh.a(view.findViewById(R.id.reel_legacy_menu_button), false);
            ggh.a(this.b.findViewById(R.id.reel_creator_menu_button), false);
            ggh.a(this.b.findViewById(R.id.reel_viewer_menu_button), false);
        }
    }
}
