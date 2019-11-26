package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/* renamed from: euu */
public final class euu implements OnClickListener {
    public final ImageView a;
    private final euy b;
    private final akvp c;
    private final fmx d;
    private final akpi e;
    private axxl f;
    private acvx g;

    public euu(euy euy, akvp akvp, fmx fmx, akpi akpi, ImageView imageView) {
        this.b = (euy) amqw.a((Object) euy);
        this.c = (akvp) amqw.a((Object) akvp);
        this.d = fmx;
        this.e = akpi;
        this.a = (ImageView) amqw.a((Object) imageView);
        this.a.setOnClickListener(this);
    }

    public final void a() {
        this.a.setVisibility(8);
    }

    public final void b() {
        if (this.f != null) {
            this.a.setVisibility(0);
            axxl axxl = this.f;
            if ((axxl.a & 128) != 0) {
                aruh aruh;
                fmx fmx = this.d;
                axxj axxj = axxl.i;
                if (axxj == null) {
                    axxj = axxj.c;
                }
                if (axxj.a == 102716411) {
                    aruh = (aruh) axxj.b;
                } else {
                    aruh = aruh.j;
                }
                ImageView imageView = this.a;
                Object obj = this.f.i;
                if (obj == null) {
                    obj = axxj.c;
                }
                fmx.a(aruh, imageView, obj, this.g);
            }
        }
    }

    public final void a(axxl axxl, acvx acvx) {
        this.f = axxl;
        this.g = acvx;
        if (axxl == null || (axxl.a & 16) == 0) {
            a();
            return;
        }
        if (acvx != null) {
            acvx.a(axxl.d.d(), null);
        }
        ImageView imageView = this.a;
        akvp akvp = this.c;
        arwf arwf = axxl.f;
        if (arwf == null) {
            arwf = arwf.c;
        }
        arwh a = arwh.a(arwf.b);
        if (a == null) {
            a = arwh.UNKNOWN;
        }
        imageView.setImageResource(akvp.a(a));
        aodx aodx = axxl.j;
        if (aodx == null) {
            aodx = aodx.c;
        }
        if ((aodx.a & 1) == 0) {
            this.a.setContentDescription(null);
        } else {
            imageView = this.a;
            aodx aodx2 = axxl.j;
            if (aodx2 == null) {
                aodx2 = aodx.c;
            }
            aodv aodv = aodx2.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            imageView.setContentDescription(aodv.b);
        }
        b();
        this.e.a(axxl, this.a);
    }

    public final void onClick(View view) {
        axxl axxl = this.f;
        if (axxl != null) {
            acvx acvx = this.g;
            if (!(acvx == null || (axxl.a & 4) == 0)) {
                acvx.a(3, new acvs(axxl.d), null);
            }
            this.b.a(this.f);
        }
    }
}
