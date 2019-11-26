package defpackage;

import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.youtube.conversation.ui.ConversationRoundedLinearLayout;
import com.google.android.youtube.R;

/* renamed from: yzq */
public class yzq implements zar {
    private final ConversationRoundedLinearLayout a;
    private final View b;
    private final TextView c;
    private final boolean d;
    public zau f;

    public yzq(View view, int i) {
        this.a = (ConversationRoundedLinearLayout) amqw.a((ConversationRoundedLinearLayout) view.findViewById(R.id.bubble));
        boolean z = i != 0;
        this.d = z;
        if (z) {
            this.a.setBackgroundColor(xwe.a(view.getContext(), i, 0));
        }
        this.b = (View) amqw.a(view.findViewById(R.id.error_retry));
        this.c = (TextView) amqw.a((TextView) view.findViewById(R.id.timestamp));
        view.setOnClickListener(new yzt(this));
        view.setOnLongClickListener(new yzs(this));
    }

    public final void a(zau zau) {
        this.f = zau;
    }

    public final void a(boolean z) {
        xpr.a(this.b, z);
        this.a.setEnabled(z ^ 1);
        this.a.animate().alpha(!z ? 1.0f : 0.3f).start();
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (!this.d) {
            ConversationRoundedLinearLayout conversationRoundedLinearLayout = this.a;
            conversationRoundedLinearLayout.setBackgroundColor(xwe.a(conversationRoundedLinearLayout.getContext(), yxo.a(z), 0));
        }
        this.a.a(z2, z3, !z ? 2 : 3);
        LayoutParams layoutParams = (LayoutParams) this.a.getLayoutParams();
        layoutParams.gravity = !z ? 8388611 : 8388613;
        this.a.setLayoutParams(layoutParams);
    }

    public final void a(String str) {
        xpr.a(this.c, (CharSequence) str);
    }
}
