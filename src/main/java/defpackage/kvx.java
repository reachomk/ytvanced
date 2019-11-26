package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kvx */
public final class kvx implements akot {
    public final Context a;
    public final Resources b;
    public final aaas c;
    public ajzj d;
    private final akkq e;
    private final akvo f;
    private final kqv g;
    private final zyw h;
    private final FrameLayout i;
    private kvw j;
    private kvw k;
    private kvw l;
    private eza m;
    private int n;

    public kvx(Context context, akkq akkq, aaas aaas, akvo akvo, tpu tpu, zyw zyw, dwk dwk) {
        this.a = (Context) amqw.a((Object) context);
        this.b = context.getResources();
        this.e = (akkq) amqw.a((Object) akkq);
        this.f = (akvo) amqw.a((Object) akvo);
        this.c = (aaas) amqw.a((Object) aaas);
        this.i = new FrameLayout(context);
        this.h = zyw;
        this.g = new kqv(aaas, tpu, dwk, this.i);
    }

    public final View K_() {
        return this.i;
    }

    public final void a(akpb akpb) {
        this.g.a();
    }

    private static void a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        int i;
        ajyl ajyl = (ajzj) obj;
        this.i.removeAllViews();
        this.d = (ajzj) amqw.a((Object) ajyl);
        this.g.a(akor.a, ajyl, ajyl.o, kqv.a(ajyl.i), ajyl, ajyl.n, ajyl.k);
        if (this.b.getBoolean(R.bool.promoted_video_use_landscape_layout)) {
            if (this.k == null) {
                if (xss.b(this.a) && foh.L(this.h)) {
                    this.k = new kvw(this, R.layout.promoted_video_item_linear_feed_tablet);
                } else {
                    this.k = new kvw(this, R.layout.promoted_video_item_land);
                }
            }
            this.l = this.k;
        } else {
            if (this.j == null || this.n != ajyl.p) {
                i = ajyl.p;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 >= 0) {
                    this.n = i;
                    if (i == 0) {
                        throw null;
                    } else if (i2 == 2) {
                        this.j = new kvw(this, R.layout.promoted_video_item_full_bleed);
                    } else if (i2 == 3) {
                        this.j = new kvw(this, R.layout.promoted_video_item_full_bleed_compact_row);
                    } else if (i2 != 5) {
                        this.j = new kvw(this, R.layout.promoted_video_item);
                    } else {
                        this.j = new kvw(this, R.layout.promoted_video_item_half_bleed);
                    }
                } else {
                    this.j = new kvw(this, R.layout.promoted_video_item);
                }
            }
            this.l = this.j;
        }
        if (kcb.a(this.h) && this.b.getConfiguration().orientation == 1) {
            if (kcb.b(this.h)) {
                i = this.b.getDimensionPixelSize(R.dimen.smaller_divider_height_dp);
            } else {
                i = this.b.getDimensionPixelSize(R.dimen.bigger_divider_height_dp);
            }
            this.m = this.l.a(i);
            if (kcb.c(this.h)) {
                if (kcb.d(this.h)) {
                    i = this.b.getDimensionPixelSize(R.dimen.exp_layout_bot_padding_with_small_div);
                } else {
                    i = this.b.getDimensionPixelSize(R.dimen.exp_layout_bot_padding_with_big_div);
                }
                kvw kvw = this.l;
                TextView textView = kvw.h;
                if (textView != null) {
                    textView.setPadding(textView.getPaddingLeft(), kvw.h.getPaddingTop(), kvw.h.getPaddingRight(), i);
                }
            }
        } else {
            this.m = this.l.a(this.a.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        }
        if (xss.b(this.a) && foh.L(this.h)) {
            this.m.a(false);
        }
        kvw kvw2 = this.l;
        aygk aygk = ajyl.a;
        if (aygk != null) {
            kvw2.j.e.a(kvw2.f, aygk);
            kvw2.f.setVisibility(0);
        } else {
            kvw2.f.setVisibility(8);
        }
        arml arml = ajyl.f;
        if (arml != null) {
            kvw2.c.setText(ajqy.a(arml));
            kvw2.c.setContentDescription(ajqy.b(ajyl.f));
            kvw2.c.setVisibility(0);
        } else {
            kvw2.c.setVisibility(8);
        }
        aygk = ajyl.e;
        if (aygk != null) {
            kvw2.j.e.a(kvw2.g, aygk);
            kvw2.g.setVisibility(0);
        } else {
            kvw2.g.setVisibility(8);
        }
        xpr.a(kvw2.b, ajqy.a(ajyl.b));
        xpr.a(kvw2.e, ajqy.a(ajyl.c));
        xpr.a(kvw2.d, ajqy.a(ajyl.d));
        awsw awsw = ajyl.h;
        if (awsw == null) {
            kvx.a(kvw2.h, 8);
        } else {
            if (awsw.a == 62897987) {
                awtc awtc = (awtc) awsw.b;
                if ((awtc.a & 1) == 0) {
                    kvw2.h.setText(null);
                    adl.a(kvw2.h, 0, R.drawable.ad_feed_call_to_action_arrow);
                } else {
                    TextView textView2 = kvw2.h;
                    arml = awtc.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    textView2.setText(ajqy.a(arml));
                    kvw2.h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            kvx.a(kvw2.h, 0);
        }
        auvr auvr = ajyl.m;
        if (auvr == null || (auvr.a & 1) == 0) {
            kvw2.i.setVisibility(8);
        } else {
            akvo akvo = kvw2.j.f;
            View view = kvw2.a;
            View view2 = kvw2.i;
            auvn auvn = auvr.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
            auvn auvn2 = auvn;
            akvo.a(view, view2, auvn2, ajyl, akor.a);
            kvw2.i.setVisibility(0);
        }
        this.i.addView(this.l.a);
    }
}
