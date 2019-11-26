package defpackage;

import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: gtt */
public final class gtt extends akka {
    private final /* synthetic */ gso a;

    public final void a(ImageView imageView) {
        this.a.E.setBackground(null);
    }

    public final void b(ImageView imageView) {
        xtl.d("Upload active account header thumbnail could not be loaded.");
        this.a.E.setBackgroundResource(R.drawable.missing_avatar);
    }

    public /* synthetic */ gtt(gso gso) {
        this.a = gso;
    }
}
