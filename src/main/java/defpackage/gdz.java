package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelCreationTrayRendererOuterClass;

/* renamed from: gdz */
public final class gdz implements OnClickListener, ggb, zon {
    public final gfs a;
    public boolean b;
    public acvx c;
    public RelativeLayout d;
    public ImageView e;
    public ImageButton f;
    public ImageButton g;
    public LinearLayout h;
    public ImageButton i;
    public ImageButton j;
    public ImageButton k;
    public gdy l;
    public zin m;
    public boolean n;
    public float o;
    private final gdx p;

    public gdz(gdx gdx, gfs gfs) {
        this.p = gdx;
        this.a = gfs;
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void a(awxb awxb) {
        if (awxb != null) {
            anxp anxp = awxb.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ReelCreationTrayRendererOuterClass.reelCreationTrayRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                gfs gfs = this.a;
                ViewGroup viewGroup = this.h;
                anxp anxp2 = awxb.c;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(ReelCreationTrayRendererOuterClass.reelCreationTrayRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                gfs.a(viewGroup, (awwx) b);
            }
        }
        this.n = true;
    }

    public final void onClick(View view) {
        if (view == this.e) {
            amqw.a(this.p);
            this.c.a(3, new acvs(acwc.MOBILE_BACK_BUTTON), null);
            this.p.b(this.m);
        } else if (view == this.f) {
            this.c.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_TRIM_BUTTON), null);
            this.l.ar();
        } else if (view == this.g) {
            this.l.aq();
        } else if (view == this.i) {
            this.c.a(3, new acvs(acwc.REELS_VIDEO_LINK_BUTTON), null);
            this.l.as();
        } else if (view == this.k) {
            this.l.ap();
        }
    }

    public final View a() {
        return this.d;
    }

    public final float b() {
        return !this.n ? -this.o : 0.0f;
    }

    public final float c() {
        return this.n ? -this.o : 0.0f;
    }

    public final void a(boolean z) {
        ImageButton imageButton = this.g;
        imageButton.setImageDrawable(imageButton.getContext().getResources().getDrawable(!z ? R.drawable.quantum_ic_volume_up_white_24 : R.drawable.quantum_ic_volume_off_white_24));
    }
}
