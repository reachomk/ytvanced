package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.accessibility.CaptioningManager;
import com.google.android.youtube.R;

/* renamed from: ici */
public final class ici implements ajgr, ejc {
    public final ajgn a;
    public final ajjl b;
    private final aifi c;
    private final CaptioningManager d;
    private final Context e;
    private boolean f;
    private ajji g;
    private ajis h;
    private Runnable i;

    public ici(Context context, ajgn ajgn, ajjl ajjl, aifi aifi) {
        String str = "captioning";
        CaptioningManager captioningManager = context.getSystemService(str) != null ? (CaptioningManager) context.getSystemService(str) : null;
        this.e = context;
        this.c = aifi;
        this.b = ajjl;
        this.d = captioningManager;
        this.a = ajgn;
        this.a.e.add(this);
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd.h() && !ejd2.h()) {
            this.i = new ich(this);
            if (this.h != null) {
                this.i.run();
                this.i = null;
                this.h = null;
            }
        } else if (!ejd.h() && ejd2.h()) {
            this.i = null;
        }
        if (ejd2.h() && this.b.a()) {
            CaptioningManager captioningManager = this.d;
            if (!(captioningManager == null || captioningManager.isEnabled())) {
                this.c.a(1.0f);
                aifi aifi = this.c;
                if (this.g == null) {
                    Resources resources = this.e.getResources();
                    Theme theme = this.e.getTheme();
                    this.g = new ajji(rz.b(resources, R.color.inline_muted_subtitles_background, theme), rz.b(resources, R.color.inline_muted_subtitles_window, theme), rz.b(resources, R.color.inline_muted_subtitles_edge, theme), 5, rz.b(resources, R.color.inline_muted_subtitles_text, theme), 8);
                }
                aifi.a(this.g);
                this.c.a(this.e.getResources().getDimensionPixelOffset(R.dimen.inline_muted_subtitles_padding), 0);
                this.f = true;
                return;
            }
        }
        if (this.f) {
            this.c.a(this.b.c());
            this.c.a(this.b.b());
            this.c.a(0, 0);
            this.f = false;
        }
    }

    public final void a() {
        this.h = this.a.g;
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
            this.i = null;
        }
    }
}
