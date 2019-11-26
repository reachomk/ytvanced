package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: sjw */
final class sjw extends URLSpan {
    private final /* synthetic */ Context a;

    sjw(String str, Context context) {
        this.a = context;
        super(str);
    }

    public final void updateDrawState(TextPaint textPaint) {
        int color;
        Resources resources = this.a.getResources();
        if (VERSION.SDK_INT >= 23) {
            color = resources.getColor(R.color.gdi_link_color, null);
        } else {
            color = resources.getColor(R.color.gdi_link_color);
        }
        textPaint.setColor(color);
        textPaint.setUnderlineText(false);
    }

    public final void onClick(View view) {
        sjy.a(view.getContext(), getURL());
    }
}
