package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kjy */
final class kjy {
    public final View a;
    public final aaas b;
    public final ImageView c = ((ImageView) this.a.findViewById(R.id.thumbnail));
    public final ImageView d = ((ImageView) this.a.findViewById(R.id.channel_avatar));
    public final akkq e;
    public final akvo f;
    public final View g;
    public final View h;
    public final View i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final ipk m;
    public axmk n;
    public CharSequence o;
    public esv p;
    public fnk q;

    /* synthetic */ kjy(Context context, akkq akkq, aaas aaas, akvo akvo) {
        amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.e = (akkq) amqw.a((Object) akkq);
        this.f = (akvo) amqw.a((Object) akvo);
        this.a = LayoutInflater.from(context).inflate(R.layout.show_item, null);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setOnClickListener(new kkb(this));
        }
        this.g = this.a.findViewById(R.id.contextual_menu_anchor);
        this.j = (TextView) this.a.findViewById(R.id.title);
        this.k = (TextView) this.a.findViewById(R.id.short_byline);
        this.l = (TextView) this.a.findViewById(R.id.long_byline);
        this.m = new ipk((ViewStub) this.a.findViewById(R.id.bottom_title_standalone_red_badge));
        this.i = this.a.findViewById(R.id.bottom_panel_overlay);
        this.h = this.a.findViewById(R.id.resume_playback_overlay);
    }
}
