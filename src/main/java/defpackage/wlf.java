package defpackage;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* renamed from: wlf */
final class wlf implements wxg {
    public final ImageView a;
    public final Animation b;
    public final boolean c;
    private final afnw d;
    private final Executor e;

    public wlf(ImageView imageView, afnw afnw, Executor executor, boolean z) {
        this.a = (ImageView) amqw.a((Object) imageView);
        this.d = (afnw) amqw.a((Object) afnw);
        this.e = (Executor) amqw.a((Object) executor);
        imageView.setTag(R.id.bitmap_loader_tag, this);
        this.b = AnimationUtils.loadAnimation(imageView.getContext(), 17432576);
        this.b.setDuration((long) imageView.getContext().getResources().getInteger(17694720));
        this.c = z;
    }

    private final void a() {
        this.a.setTag(R.id.bitmap_loader_tag, null);
    }
}
