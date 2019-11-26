package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import com.google.android.libraries.video.preview.VideoWithPreviewView;

/* renamed from: geb */
public final class geb implements OnClickListener, und {
    public gea a;
    public View b;
    public View c;
    public VideoWithPreviewView d;
    private final Context e;

    public geb(Context context) {
        this.e = context;
    }

    public final void onClick(View view) {
        this.a.ao();
    }

    public final void a(Point point) {
        if (point.x > 0 && point.y > 0) {
            boolean z = true;
            amqw.a(point.x > 0);
            if (point.y <= 0) {
                z = false;
            }
            amqw.a(z);
            float f = ((float) point.x) / ((float) point.y);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) this.e.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f2 = (float) i;
            float f3 = (float) i2;
            if (f >= f2 / f3) {
                i = (int) (f3 * f);
            } else {
                i2 = (int) (f2 / f);
            }
            point.x = i;
            point.y = i2;
        }
    }
}
