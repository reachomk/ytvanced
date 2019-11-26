package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wgm */
public final class wgm {
    public final Context a;
    public int b;
    public ViewGroup c;
    public wfx[] d;
    public final wgi e;

    public wgm(Context context, wgi wgi) {
        this.a = context;
        this.e = wgi;
    }

    public final void a() {
        for (int i = 0; i < this.c.getChildCount(); i++) {
            TextView textView = (TextView) this.c.getChildAt(i).findViewById(R.id.filter_text);
            LayoutParams layoutParams = textView.getLayoutParams();
            if (i == this.b) {
                layoutParams.height = -1;
            } else {
                layoutParams.height = -2;
            }
            textView.setLayoutParams(layoutParams);
        }
    }
}
