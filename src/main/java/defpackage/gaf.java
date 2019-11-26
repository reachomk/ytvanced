package defpackage;

import android.animation.ObjectAnimator;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: gaf */
public final class gaf {
    private static final Property g = new gae(Float.class, "alpha");
    public final akvp a;
    public final ImageView b;
    public final ImageView c;
    public final gaj d;
    public final ObjectAnimator e;
    public boolean f;
    private final akkq h;
    private final ObjectAnimator i;

    public gaf(akkq akkq, akvp akvp, ImageView imageView, ImageView imageView2) {
        this.h = akkq;
        this.a = akvp;
        this.b = (ImageView) amqw.a((Object) imageView);
        this.c = imageView2;
        this.i = ObjectAnimator.ofFloat(imageView, g, new float[]{1.0f});
        this.e = ObjectAnimator.ofFloat(imageView, g, new float[]{0.0f});
        this.d = new gaj(imageView2);
    }

    public final void a(avdd avdd, akkw akkw, akka akka) {
        akkn b = this.h.a().g().b(false);
        if (akkw != null) {
            b.a(akkw);
        }
        if (avdd != null) {
            akkq akkq = this.h;
            ImageView imageView = this.b;
            aygk aygk = avdd.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk, b.a((akks) akka).a());
        }
    }

    public final void a() {
        if (this.b.getDrawable() instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) this.b.getDrawable();
            frameSequenceDrawable.setOnFinishedListener(new gag(this, frameSequenceDrawable, this.b));
            frameSequenceDrawable.setLoopBehavior(1);
            frameSequenceDrawable.start();
            this.b.setAlpha(0.0f);
            this.b.setVisibility(0);
            this.i.setDuration(500).start();
        }
    }
}
