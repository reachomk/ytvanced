package defpackage;

import android.support.rastermill.FrameSequenceDrawable;
import android.support.rastermill.FrameSequenceDrawable.OnFinishedListener;
import android.widget.ImageView;

/* renamed from: gag */
final class gag implements OnFinishedListener {
    private final FrameSequenceDrawable a;
    private final ImageView b;
    private final boolean c = false;
    private final /* synthetic */ gaf d;

    public final void onFinished(FrameSequenceDrawable frameSequenceDrawable) {
        this.d.e.addListener(new gah(this.a, this.b));
        this.d.e.setDuration(200).start();
    }

    /* synthetic */ gag(gaf gaf, FrameSequenceDrawable frameSequenceDrawable, ImageView imageView) {
        this.d = gaf;
        this.a = frameSequenceDrawable;
        this.b = imageView;
    }
}
