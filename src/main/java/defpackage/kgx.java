package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kgx */
public final class kgx implements akot {
    public final View a = this.c.findViewById(R.id.thumbnail_layout);
    private final Context b;
    private final View c;
    private final akkq d;
    private final TextView e = ((TextView) this.c.findViewById(R.id.title));
    private final ImageView f = ((ImageView) this.c.findViewById(R.id.selected_position_indicator));
    private final TextView g = ((TextView) this.c.findViewById(R.id.duration));
    private final ImageView h = ((ImageView) this.c.findViewById(R.id.thumbnail));
    private final View i = this.c.findViewById(R.id.thumbnail_border);
    private final View j = this.c.findViewById(R.id.contextual_menu_anchor);
    private final akvo k;
    private final akoj l;
    private final akko m;
    private final hmc n;
    private final far o;
    private TextView p = ((TextView) this.c.findViewById(R.id.unplayable_reason));
    private ImageView q = ((ImageView) this.c.findViewById(R.id.unplayable_overlay));
    private hlv r;

    public kgx(Context context, akkq akkq, aaas aaas, akvo akvo, hmc hmc, ViewGroup viewGroup) {
        this.b = (Context) amqw.a((Object) context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.c = LayoutInflater.from(context).inflate(R.layout.set_bar_video_item, viewGroup, false);
        this.k = (akvo) amqw.a((Object) akvo);
        this.n = hmc;
        this.m = akkq.a().g().a(new kgz(this)).a();
        this.l = new akoj(aaas, this.c);
        this.o = new far((ViewStub) this.c.findViewById(R.id.standalone_ypc_badge), 0);
        if (this.n != null) {
            ViewStub viewStub = (ViewStub) this.a.findViewById(R.id.offline_thumbnail_badge);
            hlv hlv = null;
            if (viewStub != null) {
                hlv = this.n.a(viewStub, null);
            }
            this.r = hlv;
        }
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    private final void b() {
        ImageView imageView = this.q;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajyc ajyc = (ajyc) obj;
        acvx acvx = akor.a;
        aaas aaas = (aaas) akor.a("endpointResolver");
        if (aaas != null) {
            this.l.a = aaas;
        }
        auvn auvn = null;
        this.l.a(acvx, ajyc.f, null);
        acvx.a(ajyc.k, null);
        this.e.setText(ajqy.a(ajyc.a));
        this.g.setText(ajqy.a(ajyc.c));
        this.g.setContentDescription(ajqy.b(ajyc.c));
        this.f.setVisibility(4);
        this.a.setBackgroundResource(R.drawable.bg_video_thumb);
        if (ajyc.g == null) {
            aped aped;
            this.e.setMaxLines(2);
            this.g.setVisibility(0);
            far far = this.o;
            apdx apdx = ajyc.m;
            if (apdx == null) {
                aped = null;
            } else {
                aped = apdx.b;
                if (aped == null) {
                    aped = aped.g;
                }
            }
            far.a(aped);
            b();
            TextView textView = this.p;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            this.e.setMaxLines(1);
            this.g.setVisibility(8);
            this.o.a(null);
            if (aklb.a(ajyc.b)) {
                b();
            } else {
                if (this.q == null) {
                    this.q = (ImageView) ((ViewStub) this.c.findViewById(R.id.unplayable_overlay_stub)).inflate();
                }
                this.q.setVisibility(0);
            }
            Spanned a = ajqy.a(ajyc.g);
            if (this.p == null) {
                this.p = (TextView) ((ViewStub) this.c.findViewById(R.id.unplayable_reason_stub)).inflate();
            }
            this.p.setText(a);
            this.p.setVisibility(0);
        }
        if (ajyc.e) {
            this.c.setBackgroundResource(R.drawable.bg_set_row_selected);
            this.e.setTextColor(ra.c(this.b, R.color.yt_white1));
            this.f.setVisibility(0);
            xoq.a(this.h, (int) (this.b.getResources().getFraction(R.dimen.set_bar_video_item_thumb_selected_alpha, 1, 1) * 255.0f));
            this.g.setTextColor(xwe.a(this.b, R.attr.ytOverlayTextPrimary, 0));
            xpr.a(this.i, true);
        } else {
            this.c.setBackgroundResource(R.drawable.bg_set_row);
            this.e.setTextColor(ra.c(this.b, R.color.yt_grey2));
            this.f.setVisibility(4);
            xoq.a(this.h, (int) (this.b.getResources().getFraction(R.dimen.set_bar_video_item_thumb_alpha, 1, 1) * 255.0f));
            this.g.setTextColor(xwe.a(this.b, R.attr.ytOverlayTextSecondary, 0));
            xpr.a(this.i, false);
        }
        this.a.setBackgroundResource(R.drawable.bg_video_thumb);
        this.d.a(this.h, ajyc.b, this.m);
        this.j.setVisibility(0);
        akvo akvo = this.k;
        View view = this.j;
        auvr auvr = ajyc.l;
        if (!(auvr == null || (auvr.a & 1) == 0)) {
            auvn = auvr.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
        }
        akvo.a(view, auvn, ajyc, acvx);
        ayym ayym = ajyc.n;
        if (ayym != null && (ayym.a & 1) != 0) {
            akor.a("VideoPresenterConstants.VIDEO_ID", ayym.b);
            hlv hlv = this.r;
            if (hlv != null) {
                hlv.a(akor);
            }
        }
    }
}
