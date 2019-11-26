package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hvn */
public final class hvn extends hwk {
    private final akkq a;
    private final acvx b;
    private final zyw c;
    private ProgressBar d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private ImageView k;
    private boolean l = false;

    public hvn(Context context, akkq akkq, acvx acvx, zyw zyw) {
        super(context);
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (acvx) amqw.a((Object) acvx);
        this.c = zyw;
    }

    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.autonav_overlay, null, false);
        this.d = (ProgressBar) inflate.findViewById(R.id.countdown);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.video_title);
        this.g = (TextView) inflate.findViewById(R.id.byline);
        this.h = (ImageView) inflate.findViewById(R.id.play);
        this.h.setOnClickListener(new hvq(this));
        this.i = (TextView) inflate.findViewById(R.id.cancel);
        this.i.setOnClickListener(new hvp(this));
        View view = this.h;
        xpr.a(view, view.getBackground());
        view = this.i;
        xpr.a(view, view.getBackground());
        this.j = (TextView) inflate.findViewById(R.id.paused_text);
        this.k = (ImageView) inflate.findViewById(R.id.thumbnail);
        return inflate;
    }

    /* Access modifiers changed, original: final */
    public final void a(awfe awfe, boolean z) {
        arml arml;
        akkq akkq = this.a;
        ImageView imageView = this.k;
        aygk aygk = awfe.k;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.e;
        if ((awfe.a & 1) != 0) {
            arml = awfe.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.f;
        if ((awfe.a & 2) != 0) {
            arml = awfe.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.g;
        if ((awfe.a & 4) != 0) {
            arml = awfe.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        aphg b = ahlr.b(awfe);
        if (b == null) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.b.a(b.r.d(), null);
        }
        this.l = false;
        awfc a = ahlr.a(awfe);
        aphg c = ahlr.c(awfe);
        if (z && a != null) {
            arml arml2;
            this.j.setVisibility(0);
            TextView textView2 = this.j;
            if ((a.a & 1) != 0) {
                arml2 = a.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            textView2.setText(ajqy.a(arml2));
            this.b.a(a.e.d(), null);
            this.i.setVisibility(8);
            this.l = true;
            return;
        }
        TextView textView3 = this.i;
        if (textView3 != null) {
            textView3.setVisibility(0);
            if (c != null) {
                arml arml3;
                CharSequence charSequence;
                textView3 = this.i;
                if ((c.a & 128) != 0) {
                    arml3 = c.g;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                textView3.setText(ajqy.a(arml3));
                textView3 = this.i;
                aodv aodv = c.p;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                if ((aodv.a & 2) == 0) {
                    charSequence = null;
                } else {
                    aodv = c.p;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    charSequence = aodv.b;
                }
                textView3.setContentDescription(charSequence);
                this.b.a((c.a & 262144) != 0 ? c.r.d() : null, null);
            } else {
                this.i.setText(null);
                this.i.setContentDescription(null);
            }
            this.j.setVisibility(8);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(ejd ejd) {
        boolean z = false;
        int i = (ejd.f() || ejd.n()) ? 1 : 0;
        boolean z2 = i ^ 1;
        xpr.a(this.e, z2);
        xpr.a(this.f, z2);
        xpr.a(this.g, z2);
        View view = this.i;
        if (!this.l && i == 0) {
            z = true;
        }
        xpr.a(view, z);
        xpr.a(this.j, this.l);
        if (foh.o(this.c)) {
            xpr.a(this.d, z2);
            xpr.a(this.h, z2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, long j2) {
        this.d.setMax((int) j2);
        this.d.setProgress((int) j);
    }
}
