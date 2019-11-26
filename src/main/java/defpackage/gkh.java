package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import com.google.android.youtube.R;

/* renamed from: gkh */
public final class gkh extends apa {
    private static final anhb g = new anhb(new int[]{R.layout.reel_add_text_basic_colors_page, R.layout.reel_add_text_advanced_colors_page, R.layout.reel_add_text_grey_colors});
    public Integer c;
    public int d;
    public OnClickListener e;
    private final int f;
    private RecyclerView h;

    public gkh(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.f = point.x;
    }

    public final int a() {
        return g.a;
    }
}
