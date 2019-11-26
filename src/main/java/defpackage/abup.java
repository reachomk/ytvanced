package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abup */
public final class abup extends absz {
    private final akle c;

    public abup(Context context, akkq akkq) {
        super(context);
        this.c = new akle(akkq.c(), this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.layout.live_chat_legacy_paid_message;
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

    public final void a(akpb akpb) {
        this.c.b();
    }
}
