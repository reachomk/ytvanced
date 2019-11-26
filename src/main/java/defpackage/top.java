package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.support.rastermill.FrameSequenceDrawable.BitmapProvider;
import java.util.LinkedList;

/* renamed from: top */
public final class top implements BitmapProvider, bvw {
    private static final Config a = Config.ARGB_8888;
    private final FrameSequence b;
    private final bwd c;
    private final LinkedList d = new LinkedList();

    public top(FrameSequence frameSequence, bwd bwd) {
        this.b = frameSequence;
        this.c = bwd;
    }

    public final Class a() {
        return FrameSequenceDrawable.class;
    }

    public final int c() {
        double width = (double) (this.b.getWidth() * this.b.getHeight());
        double frameCount = (double) this.b.getFrameCount();
        Double.isNaN(frameCount);
        frameCount = (frameCount * 0.06d) + 16.0d;
        Double.isNaN(width);
        return (int) (width * frameCount);
    }

    public final void d() {
        while (!this.d.isEmpty()) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) this.d.poll();
            if (!frameSequenceDrawable.isDestroyed()) {
                frameSequenceDrawable.destroy();
            }
        }
    }

    public final Bitmap acquireBitmap(int i, int i2) {
        return this.c.a(i, i2, a);
    }

    public final void releaseBitmap(Bitmap bitmap) {
        this.c.a(bitmap);
    }

    public final /* synthetic */ Object b() {
        FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(this.b, this);
        this.d.add(frameSequenceDrawable);
        return frameSequenceDrawable;
    }
}
