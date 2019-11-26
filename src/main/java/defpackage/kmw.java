package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kmw */
final class kmw extends knb {
    public final etb a;
    public final etb b;
    public final /* synthetic */ kmx c;
    private final ViewGroup f = ((ViewGroup) this.d.findViewById(R.id.action_toolbar));
    private final View g = this.d.findViewById(R.id.bottom_margin);
    private final ViewGroup h = ((ViewGroup) this.d.findViewById(R.id.like_button));
    private final ViewGroup i = ((ViewGroup) this.d.findViewById(R.id.dislike_button));
    private final ImageView j = ((ImageView) this.d.findViewById(R.id.comment_button));
    private final ImageView k = ((ImageView) this.d.findViewById(R.id.live_chat_button));
    private final TextView l = ((TextView) this.d.findViewById(R.id.comment_count));
    private final View m = this.d.findViewById(R.id.contextual_menu_anchor);
    private final View n = this.d.findViewById(R.id.down_contextual_menu_anchor);
    private final akyu o;
    private final akyu p;

    public kmw(kmx kmx) {
        this.c = kmx;
        super(kmx, R.layout.video_feed_entry_top_aligned);
        this.o = kmx.i.a(this.j);
        this.p = kmx.i.a(this.k);
        this.a = kmx.h.a(this.h);
        this.b = kmx.h.a(this.i);
    }

    public final void a(akor akor) {
        aphg aphg;
        azdp azdp;
        aodv aodv;
        aphv aphv;
        aphv aphv2;
        int i;
        View view;
        b(akor);
        ham ham = this.c.n;
        azdp azdp2 = ham.a().G;
        if (azdp2 == null) {
            azdp2 = azdp.c;
        }
        if (azdp2.a != 65153809) {
            aphg = null;
        } else {
            azdp = ham.a().G;
            if (azdp == null) {
                azdp = azdp.c;
            }
            if (azdp.a == 65153809) {
                aphg = (aphg) azdp.b;
            } else {
                aphg = aphg.s;
            }
        }
        CharSequence charSequence = "";
        if (aphg != null) {
            arml arml;
            CharSequence charSequence2;
            this.o.a(aphg, akor.a);
            TextView textView = this.l;
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            ImageView imageView = this.j;
            if ((aphg.a & 16384) != 0) {
                aodv = aphg.p;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                charSequence2 = aodv.b;
            } else {
                charSequence2 = charSequence;
            }
            imageView.setContentDescription(charSequence2);
            a(true);
        } else {
            a(false);
        }
        ham = this.c.n;
        azdp azdp3 = ham.a().H;
        if (azdp3 == null) {
            azdp3 = azdp.c;
        }
        if (azdp3.a != 65153809) {
            aphg = null;
        } else {
            azdp = ham.a().H;
            if (azdp == null) {
                azdp = azdp.c;
            }
            if (azdp.a == 65153809) {
                aphg = (aphg) azdp.b;
            } else {
                aphg = aphg.s;
            }
        }
        if (aphg != null) {
            this.p.a(aphg, akor.a);
            ImageView imageView2 = this.k;
            if ((aphg.a & 16384) != 0) {
                aodv = aphg.p;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                charSequence = aodv.b;
            }
            imageView2.setContentDescription(charSequence);
            b(true);
        } else {
            b(false);
        }
        ham = this.c.n;
        azdp2 = ham.a().E;
        if (azdp2 == null) {
            azdp2 = azdp.c;
        }
        if (azdp2.a != 79971800) {
            aphv = null;
        } else {
            azdp = ham.a().E;
            if (azdp == null) {
                azdp = azdp.c;
            }
            if (azdp.a == 79971800) {
                aphv = (aphv) azdp.b;
            } else {
                aphv = aphv.s;
            }
        }
        ham ham2 = this.c.n;
        azdp azdp4 = ham2.a().F;
        if (azdp4 == null) {
            azdp4 = azdp.c;
        }
        if (azdp4.a != 79971800) {
            aphv2 = null;
        } else {
            azdp2 = ham2.a().F;
            if (azdp2 == null) {
                azdp2 = azdp.c;
            }
            if (azdp2.a == 79971800) {
                aphv2 = (aphv) azdp2.b;
            } else {
                aphv2 = aphv.s;
            }
        }
        this.a.a(aphv);
        this.b.a(aphv2);
        if (aphv == null || aphv2 == null) {
            etb etb = this.a;
            etb.c = null;
            this.b.c = null;
            etb.a();
            this.b.a();
        } else {
            this.a.c = new kmz(this, aphv2);
            this.b.c = new kmy(this, aphv);
        }
        for (i = 0; i < this.f.getChildCount(); i++) {
            if (this.f.getChildAt(i).getVisibility() == 0) {
                i = 0;
                break;
            }
        }
        i = 8;
        this.f.setVisibility(i);
        this.g.setVisibility(i == 0 ? 8 : 0);
        akor akor2 = new akor(akor);
        akor2.b = this.c.n.b();
        if (this.f.getVisibility() == 0) {
            this.n.setVisibility(0);
            this.m.setVisibility(8);
            view = this.n;
        } else {
            this.m.setVisibility(0);
            this.n.setVisibility(8);
            view = this.m;
        }
        a(view, akor2);
    }

    private final void a(boolean z) {
        int i = !z ? 4 : 0;
        this.j.setVisibility(i);
        this.j.setClickable(z);
        this.l.setVisibility(i);
    }

    private final void b(boolean z) {
        this.k.setVisibility(!z ? 4 : 0);
        this.k.setClickable(z);
    }
}
