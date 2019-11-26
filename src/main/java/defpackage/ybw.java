package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ybw */
public final class ybw implements zcp {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final TextView d;

    public ybw(OnClickListener onClickListener, ViewGroup viewGroup) {
        this.a = (View) amqw.a((Object) viewGroup);
        this.b = (ImageView) viewGroup.findViewById(R.id.pending_chat_members_icon);
        this.c = (TextView) viewGroup.findViewById(R.id.pending_chat_members_text);
        this.d = (TextView) viewGroup.findViewById(R.id.pending_chat_members_button);
        this.d.setOnClickListener((OnClickListener) amqw.a((Object) onClickListener));
    }

    public final void a(boolean z) {
        xpr.a(this.a, z);
    }

    public final void a(int i) {
        this.b.setImageResource(i);
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void b(int i) {
        this.d.setTextColor(i);
    }
}
