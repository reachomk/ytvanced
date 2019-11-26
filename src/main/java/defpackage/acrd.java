package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acrd */
public final class acrd extends absz {
    private final akle c;

    public acrd(Context context, akkq akkq) {
        super(context);
        this.c = new akle(akkq.c(), this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.layout.live_chat_light_overlay_legacy_paid_message;
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView c() {
        return (TextView) this.a.findViewById(R.id.event_text);
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView d() {
        return (TextView) this.a.findViewById(R.id.detail_text);
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.sponsor_thumbnail);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aygk aygk) {
        this.c.a(aygk);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.a.setLayoutParams(marginLayoutParams);
    }

    public final void a(akpb akpb) {
        this.c.b();
    }
}
