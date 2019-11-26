package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: hef */
public final class hef extends adqq implements adqi {
    public final adqf a;
    public adqe b;
    public final ImageView c;
    public final ImageView d;

    hef(adqf adqf, ViewGroup viewGroup) {
        this.a = (adqf) amqw.a((Object) adqf);
        this.c = (ImageView) amqw.a((ImageView) viewGroup.findViewById(R.id.mdx_loop));
        this.d = (ImageView) amqw.a((ImageView) viewGroup.findViewById(R.id.mdx_shuffle));
        hei hei = new hei(this);
        this.c.setOnClickListener(hei);
        this.d.setOnClickListener(hei);
    }

    public final void b(adqe adqe) {
    }

    public final void a() {
        this.c.setSelected(this.b.y());
        this.d.setSelected(this.b.z());
    }

    public final void b() {
        a();
    }

    public final void a(adqe adqe) {
        this.b = adqe;
        this.b.a((adqg) this);
        a();
    }

    public final void c(adqe adqe) {
        this.b.b((adqg) this);
        this.b = null;
    }
}
