package defpackage;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: hde */
public final class hde extends aiua {
    public final YouTubeTextView a;
    private final yx b = yx.a();

    public hde(Context context, int i) {
        super(context);
        this.a = (YouTubeTextView) LayoutInflater.from(context).inflate(R.layout.playing_on_tv_text, this, false);
        this.a.setPadding(0, i, 0, 0);
        addView(this.a);
        setBackgroundColor(ra.c(context, R.color.mdx_background_scrim));
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(String str) {
        this.a.setText(a(R.string.mdx_connected_to_screen, str));
    }

    public final String a(int i, String str) {
        str = this.b.a(str);
        return Html.fromHtml(getContext().getString(i, new Object[]{str})).toString();
    }
}
