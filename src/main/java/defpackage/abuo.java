package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abuo */
public class abuo extends absy {
    public abuo(Context context, akkq akkq, aktl aktl, aaas aaas, akvp akvp) {
        super(context, akkq, aktl, aaas, akvp);
    }

    /* Access modifiers changed, original: protected */
    public int b() {
        return R.layout.live_chat_membership_item;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageView c() {
        return (ImageView) this.b.findViewById(R.id.avatar);
    }

    /* Access modifiers changed, original: protected|final */
    public final View d() {
        return this.b.findViewById(R.id.top_bar);
    }

    /* Access modifiers changed, original: protected|final */
    public final View e() {
        return this.b.findViewById(R.id.bottom_bar);
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView f() {
        return (TextView) this.b.findViewById(R.id.author);
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView g() {
        return (TextView) this.b.findViewById(R.id.header_text);
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView h() {
        return (TextView) this.b.findViewById(R.id.header_subtext);
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView i() {
        return (TextView) this.b.findViewById(R.id.message);
    }
}
