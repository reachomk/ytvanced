package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import com.google.android.youtube.R;

/* renamed from: kdb */
public final class kdb implements akot {
    private final View a;
    private final View b = this.a.findViewById(R.id.thumbnail_layout);
    private final View c = this.a.findViewById(R.id.title);
    private final View d = this.a.findViewById(R.id.author);
    private final View e = this.a.findViewById(R.id.numViews);

    public kdb(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.compact_video_ghost_card, null);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        kdb.a(this.b);
        kdb.a(this.c);
        kdb.a(this.d);
        kdb.a(this.e);
    }

    private static void a(View view, int i) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setStartOffset((long) (i * 75));
        alphaAnimation.setInterpolator(new CycleInterpolator(1.0f));
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        view.setAnimation(alphaAnimation);
    }

    private static void a(View view) {
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
            view.setAnimation(null);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        int i = ((ejb) obj).a * 3;
        kdb.a(this.b, i);
        kdb.a(this.c, i);
        kdb.a(this.d, i + 1);
        kdb.a(this.e, i + 2);
    }
}
