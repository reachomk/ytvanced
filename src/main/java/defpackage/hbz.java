package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hbz */
public final class hbz extends abtl {
    public hbz(Context context, aaas aaas, akvp akvp) {
        super(context, aaas, akvp);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.layout.live_chat_light_metadata_item;
    }

    /* Access modifiers changed, original: protected|final */
    public final int g() {
        return -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final int h() {
        return R.dimen.live_chat_metadata_vertical_margin;
    }

    /* Access modifiers changed, original: protected|final */
    public final int i() {
        return R.dimen.live_chat_metadata_horizontal_margin;
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView c() {
        return (TextView) this.b.findViewById(R.id.title);
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView d() {
        return (TextView) this.b.findViewById(R.id.subtitle);
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageView e() {
        return (ImageView) this.b.findViewById(R.id.icon);
    }

    /* Access modifiers changed, original: protected|final */
    public final ViewGroup f() {
        return (ViewGroup) this.b.findViewById(R.id.buttons_container);
    }
}
