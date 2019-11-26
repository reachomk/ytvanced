package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: gtr */
final class gtr implements amjs {
    private final /* synthetic */ alya a;
    private final /* synthetic */ gso b;

    gtr(gso gso, alya alya) {
        this.b = gso;
        this.a = alya;
    }

    public final void a(Bitmap bitmap) {
        gso gso = this.b;
        if ((gso.ad ^ 1) != 0) {
            alya alya = this.a;
            alya.e = bitmap;
            ImageView imageView = gso.L;
            if (imageView != null) {
                imageView.setVisibility(0);
                if (bitmap == null || gso.Y.size() != 1) {
                    gso.L.setImageResource(R.drawable.ic_unsupported_file_format);
                } else {
                    gso.L.setImageBitmap(bitmap);
                }
            }
            TextView textView = gso.N;
            if (textView != null) {
                if (alya.g != null) {
                    int toSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(alya.g.longValue());
                    if (toSeconds > 0) {
                        gso.N.setVisibility(0);
                        gso.N.setText(xvd.b((long) toSeconds));
                    } else {
                        gso.N.setVisibility(8);
                    }
                } else {
                    textView.setVisibility(8);
                }
            }
        }
        this.b.a(5);
    }
}
