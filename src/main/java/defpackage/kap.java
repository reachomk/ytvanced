package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kap */
final class kap {
    private final int a;
    private final Context b;
    private final akkl c;
    private final akvo d;
    private final est e;
    private final View f;
    private View g;
    private TextView h;
    private TextView i;
    private View j;
    private ImageView k;
    private eso l;
    private akle m;
    private akle n;

    public kap(Context context, akkl akkl, est est, aklf aklf, akvo akvo, View view, int i) {
        this.f = view;
        this.b = (Context) amqw.a((Object) context);
        this.c = (akkl) amqw.a((Object) akkl);
        this.d = (akvo) amqw.a((Object) akvo);
        amqw.a((Object) aklf);
        this.e = (est) amqw.a((Object) est);
        this.a = i;
    }

    public final void a(ajsy ajsy, akor akor) {
        if (this.g == null) {
            this.g = ((ViewStub) this.f.findViewById(this.a)).inflate();
            this.h = (TextView) this.g.findViewById(R.id.channel_title);
            this.i = (TextView) this.g.findViewById(R.id.subscriber_count);
            this.j = this.g.findViewById(R.id.contextual_menu_anchor);
            this.k = (ImageView) this.g.findViewById(R.id.avatar_protection);
            this.m = aklf.a(this.c, (ImageView) this.g.findViewById(R.id.channel_avatar));
            this.m.a(ScaleType.CENTER_CROP);
            this.n = aklf.a(this.c, (ImageView) this.g.findViewById(R.id.background_view));
            this.n.a(ScaleType.CENTER_CROP);
            this.l = this.e.a((TextView) this.g.findViewById(R.id.subscribe_button), null);
        }
        this.g.setVisibility(0);
        int layoutDirection = this.b.getResources().getConfiguration().getLayoutDirection();
        if (this.g.getLayoutDirection() != layoutDirection) {
            this.g.setLayoutDirection(layoutDirection);
        }
        this.m.a(ajsy.e);
        this.n.a(ajsy.d);
        this.h.setText(ajqy.a(ajsy.a));
        this.i.setText(ajqy.a(ajsy.b));
        axwa axwa = ajsy.c.b;
        if (axwa == null) {
            axwa = axwa.M;
        }
        aqdw aqdw = ajsy.c;
        if (!(aqdw == null || (aqdw.a & 1) == 0)) {
            axwa = (axwa) ((anxl) evj.b(this.b, (axwd) ((anxo) axwa.toBuilder()), ajqy.a(ajsy.a)).build());
            aqdv aqdv = (aqdv) ((anxo) ajsy.c.toBuilder());
            aqdv.copyOnWrite();
            aqdw aqdw2 = (aqdw) aqdv.instance;
            if (axwa != null) {
                aqdw2.b = axwa;
                aqdw2.a |= 1;
                ajsy.c = (aqdw) ((anxl) aqdv.build());
            } else {
                throw new NullPointerException();
            }
        }
        this.l.a(axwa, akor.a);
        if (!(this.j == null || ajsy.j == null)) {
            akor akor2 = new akor(akor);
            akor2.b = ajsy.i;
            this.d.a(this.f, this.j, (auvn) ajzv.a(ajsy.j, auvn.class), ajsy, akor2.a);
        }
        if (this.k != null && ajsy.h != null) {
            kam kam = new kam();
            this.k.setColorFilter(ajsy.h.b, Mode.SRC_IN);
            this.k.setImageDrawable(kam);
        }
    }

    public final void a() {
        b();
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void b() {
        akle akle = this.m;
        if (akle != null) {
            akle.b();
        }
        akle = this.n;
        if (akle != null) {
            akle.b();
        }
        eso eso = this.l;
        if (eso != null) {
            eso.a();
        }
    }
}
