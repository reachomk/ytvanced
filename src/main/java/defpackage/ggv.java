package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: ggv */
final /* synthetic */ class ggv implements Runnable {
    private final ggs a;
    private final Uri b;
    private final Drawable c;

    ggv(ggs ggs, Uri uri, Drawable drawable) {
        this.a = ggs;
        this.b = uri;
        this.c = drawable;
    }

    public final void run() {
        ggs ggs = this.a;
        Uri uri = this.b;
        Drawable drawable = this.c;
        ggq ggq = ggs.a;
        xak.a();
        ggq.q.a(uri);
        ggq.p.setImageDrawable(drawable);
        ggq.p.setOnClickListener(new ggt(ggq));
        if (ggq.q.b() != null) {
            acvx b = ggq.q.b();
            anze anze = ggq.r;
            b.a(anze, gie.a(anze));
        }
        ImageView imageView = ggq.p;
        axuj axuj = ggq.r;
        CharSequence charSequence = null;
        if (axuj != null) {
            aodx aodx;
            aodv aodv;
            if ((axuj.a & 1) != 0) {
                aygk aygk = axuj.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                aodx = aygk.d;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                charSequence = aodv.b;
            } else if (axuj.c.size() != 0) {
                aodx = ((aygk) axuj.c.get(0)).d;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                charSequence = aodv.b;
            }
        }
        imageView.setContentDescription(charSequence);
    }
}
