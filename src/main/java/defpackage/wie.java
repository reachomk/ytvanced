package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: wie */
public final class wie implements akot {
    private final View a;
    private wdn b;

    public wie(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.comment_ghost_card, null);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        wdn wdn = this.b;
        if (wdn != null) {
            wdn.a(this.a);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        wkz wkz = (wkz) obj;
        this.b = (wdn) akor.a("commentGhostCardAnimController");
        wdn wdn = this.b;
        if (wdn != null) {
            View view = this.a;
            int i = wkz.a;
            wdn.a(view);
            long b = wdn.a.b();
            long j = wdn.c;
            if (j == -1) {
                wdn.c = b;
                j = b;
            }
            Animator a = wdn.a(view, ((((b - j) - ((long) (i * 225))) % 2200) + 2200) % 2200);
            if (a != null) {
                a.addListener(new wds(wdn, view));
                a.start();
                wdn.b.put(view, a);
            }
        }
    }
}
