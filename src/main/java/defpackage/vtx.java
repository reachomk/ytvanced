package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vtx */
public final class vtx implements xcp {
    public final ajkp a;
    public final Set b;
    public int c = 2;
    public vrh d = vrh.g;
    public boolean e;
    private final Bitmap f;
    private final ajkr g;

    public vtx(Context context, ajkr ajkr, ajkp ajkp, bctz bctz) {
        this.g = ajkr;
        this.a = ajkp;
        this.f = BitmapFactory.decodeResource(context.getResources(), R.drawable.quantum_ic_cast_connected_white_24);
        this.b = new HashSet();
        bctz.c().a(new vtw(this));
    }

    private final void a(aaft aaft) {
        if (aaft != null) {
            this.a.a(aaft);
            this.g.a(aaft);
            return;
        }
        ajkp ajkp = this.a;
        ajkp.a(ajkp.l, this.f);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{voy.class, vpa.class, vvk.class};
        } else if (i == 0) {
            voy voy = (voy) obj;
            this.d = voy.a;
            int i2 = this.c;
            int i3 = voy.b;
            if (i2 == i3) {
                return null;
            }
            this.c = i3;
            for (vua a : this.b) {
                a.a();
            }
            return null;
        } else if (i == 1) {
            vpa vpa = (vpa) obj;
            if (vpa.a == vpb.AD_VIDEO_ENDED) {
                this.a.c();
                a(null);
                return null;
            }
            aaga aaga = vpa.f;
            aakj q = aaga != null ? aaga.q() : null;
            CharSequence c = q != null ? q.c() : null;
            ajkp ajkp = this.a;
            ajkp.a(c, ajkp.j);
            if (this.a.m != null) {
                return null;
            }
            a(q != null ? q.g() : null);
            return null;
        } else if (i == 2) {
            vvk vvk = (vvk) obj;
            ajkp ajkp2 = this.a;
            ajkp2.a(ajkp2.i, vvk.a());
            a(vvk.b() != null ? new aaft(vvk.b()) : null);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
