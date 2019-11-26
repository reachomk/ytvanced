package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yxu */
public final class yxu {
    public final TextView a = ((TextView) amqw.a((TextView) this.b.findViewById(R.id.pending_chat_members_text)));
    private final View b;
    private final TextView c = ((TextView) amqw.a((TextView) this.b.findViewById(R.id.pending_chat_members_button)));

    public yxu(View view, yxw yxw) {
        this.b = (View) amqw.a(view.findViewById(R.id.pending_chat_members));
        this.c.setOnClickListener(new yxx(yxw));
        a(false);
    }

    public final void a(boolean z) {
        xpr.a(this.b, z);
    }

    public final void a(String str) {
        this.c.setText(str);
    }

    public final void b(boolean z) {
        this.c.setEnabled(z);
    }
}
