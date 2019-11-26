package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kcj */
public final class kcj implements akot {
    public final View a = this.d.findViewById(R.id.more);
    public final TextView b = ((TextView) this.d.findViewById(R.id.message_text));
    public kck c;
    private final View d;

    public kcj(Context context) {
        amqw.a((Object) context);
        this.d = View.inflate(context, R.layout.expandable_message_item, null);
        this.a.setOnClickListener(new kci(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.d;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        CharSequence charSequence;
        kck kck = (kck) obj;
        this.c = kck;
        this.a.setVisibility(!kck.c ? 0 : 8);
        TextView textView = this.b;
        if (kck.c) {
            charSequence = kck.b;
        } else {
            charSequence = kck.a;
        }
        xpr.a(textView, charSequence);
    }
}
