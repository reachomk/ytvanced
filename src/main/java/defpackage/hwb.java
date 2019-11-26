package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hwb */
public final class hwb implements hvg {
    public hvx a;
    private final Context b;
    private final acvx c;
    private final akkq d;
    private TextView e;
    private TextView f;
    private ImageView g;
    private hvh h;
    private boolean i;
    private ejd j;
    private long k;
    private awfe l;

    public hwb(Context context, acvx acvx, akkq akkq) {
        this.b = context;
        this.c = acvx;
        this.d = akkq;
    }

    public final int a() {
        return 0;
    }

    public final void a(hvx hvx, ViewGroup viewGroup) {
        this.a = hvx;
        LayoutInflater.from(this.b).inflate(R.layout.minimalist_autonav_view, viewGroup, true);
        this.e = (TextView) viewGroup.findViewById(R.id.countdown_text);
        this.f = (TextView) viewGroup.findViewById(R.id.title);
        this.g = (ImageView) viewGroup.findViewById(R.id.close_button);
        this.g.setOnClickListener(new hwe(this));
        this.h = new hvh(new hvi(viewGroup.findViewById(R.id.info_panel), this.d), new hvi(viewGroup.findViewById(R.id.info_panel_fullscreen), this.d), new hvi(viewGroup.findViewById(R.id.info_panel_portrait_fullscreen), this.d));
    }

    public final void a(awfe awfe, boolean z) {
        xpr.a(this.e, z ^ 1);
        xpr.a(this.f, z);
        if (!amqq.a(this.l, awfe)) {
            arml arml;
            this.l = awfe;
            hvh hvh = this.h;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= hvh.a.size()) {
                    break;
                }
                hvi hvi = (hvi) hvh.a.valueAt(i);
                if (hvh.a.keyAt(i) != hvh.b) {
                    z2 = false;
                }
                hvi.a(awfe, z2);
                i++;
            }
            aphg b = ahlr.b(awfe);
            if (b != null) {
                this.h.a(new hwd(this));
                this.c.a(new acvs(b.r.d()), null);
            } else {
                this.h.a(null);
            }
            TextView textView = this.f;
            if ((awfe.a & 1) != 0) {
                arml = awfe.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            aphg c = ahlr.c(awfe);
            if (c != null) {
                CharSequence charSequence;
                ImageView imageView = this.g;
                if ((c.a & 16384) != 0) {
                    aodv aodv = c.p;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    charSequence = aodv.b;
                } else {
                    charSequence = null;
                }
                imageView.setContentDescription(charSequence);
                this.c.a(new acvs(c.r.d()), null);
                return;
            }
            ImageView imageView2 = this.g;
            imageView2.setContentDescription(imageView2.getResources().getString(R.string.accessibility_close_button));
        }
    }

    public final void a(long j, long j2) {
        j = hwn.a(j, j2);
        if (this.k != j) {
            this.k = j;
            hwn.a(this.e, R.string.up_next_in, j);
        }
    }

    public final void a(ejd ejd) {
        if (this.j != ejd) {
            this.j = ejd;
            b();
        }
    }

    public final void a(int i, int i2) {
        boolean z = false;
        if (this.i != (i2 > i)) {
            if (i2 > i) {
                z = true;
            }
            this.i = z;
            ejd ejd = this.j;
            if (ejd != null && ejd.a()) {
                b();
            }
        }
    }

    private final void b() {
        hvh hvh = this.h;
        ejd ejd = this.j;
        boolean z = this.i;
        if (ejd != null) {
            int i = ejd.f() ? 0 : ejd.a() ? z ? 3 : 2 : 1;
            if (i != hvh.b) {
                hvh.b = i;
                hvh.a();
            }
        }
    }
}
