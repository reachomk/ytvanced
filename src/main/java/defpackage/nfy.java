package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: nfy */
public final class nfy extends aiua {
    public final TextView a;
    public final TextView b;
    public final nga c;
    public bcuo d = bdfz.a;

    public nfy(Context context, bctz bctz) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.preview_to_player_transition_overlay, this);
        this.a = (TextView) findViewById(R.id.embed_title);
        this.b = (TextView) findViewById(R.id.embed_subtitle);
        ImageView imageView = (ImageView) findViewById(R.id.embed_preview_thumbnail);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.preview_to_player_fade_animation);
        nga nga = new nga(imageView, loadAnimation);
        loadAnimation.setAnimationListener(nga);
        this.c = nga;
        this.d = bctz.c().a(bcut.a()).a(new nfx(this));
        d();
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void c() {
        nga nga = this.c;
        nga.a.clearAnimation();
        nga.a.setAlpha(nga.c);
        nga.a.setVisibility(0);
        setVisibility(0);
    }

    public final void d() {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        nga nga = this.c;
        nga.a.clearAnimation();
        nga.a.setVisibility(8);
        setVisibility(8);
    }
}
