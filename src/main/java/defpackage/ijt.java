package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ijt */
public final class ijt {
    public final Context a;
    public View b;
    public View c;
    public TextView d;
    public AnimatorListener e;
    public AnimatorListener f;
    public alcg g;
    private final ViewStub h;
    private final SparseArray i = new SparseArray();
    private final Map j = new HashMap();
    private boolean k;

    public ijt(Context context, ViewStub viewStub) {
        this.a = context;
        this.h = viewStub;
        b();
    }

    public final void a() {
        if (!this.k) {
            this.b = this.h.inflate();
            this.c = this.b.findViewById(R.id.video_zoom_snap_indicator);
            this.d = (TextView) this.b.findViewById(R.id.video_zoom_title);
            this.e = new ijw(this);
            this.f = new ijv(this);
            abe.b(this.d, 1);
            this.k = true;
        }
    }

    public final void b() {
        if (this.k) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            a(this.c);
            a(this.d);
        }
    }

    public final void c() {
        if (this.k) {
            a(this.c, R.animator.video_zoom_snap_threshold_indicator_hide, null);
            this.d.setVisibility(8);
        }
    }

    public final void a(View view, int i, AnimatorListener animatorListener) {
        view.setVisibility(0);
        if (this.i.get(i) == null) {
            this.i.put(i, AnimatorInflater.loadAnimator(this.a, i));
        }
        Animator animator = (Animator) this.i.get(i);
        a(view);
        this.j.put(view, animator);
        animator.setTarget(view);
        animator.removeAllListeners();
        if (animatorListener != null) {
            animator.addListener(animatorListener);
        }
        animator.start();
    }

    private final void a(View view) {
        if (this.j.containsKey(view) && this.j.get(view) != null) {
            Animator animator = (Animator) this.j.get(view);
            animator.removeAllListeners();
            this.j.put(view, null);
            animator.cancel();
        }
    }
}
