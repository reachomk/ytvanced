package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yzg */
public final class yzg implements yyg {
    private final View a;
    private final View b;
    private final TextView c;
    private final View d;
    private final View e;

    public yzg(yyj yyj, View view) {
        amqw.a((Object) yyj);
        this.a = view.findViewById(R.id.loading_indicator);
        this.b = view.findViewById(R.id.error_container);
        this.c = (TextView) view.findViewById(R.id.error_message);
        this.d = view.findViewById(R.id.reply_box);
        this.e = view.findViewById(R.id.technodrome_marker);
        view.findViewById(R.id.error_retry_button).setOnClickListener(new yzj(yyj));
        xpr.a(this.a, false);
        xpr.a(this.b, false);
        xpr.a(this.d, false);
    }

    public final void a(boolean z) {
        this.a.setVisibility(!z ? 8 : 0);
    }

    public final void a(CharSequence charSequence) {
        xpr.a(this.b, TextUtils.isEmpty(charSequence) ^ 1);
        this.c.setText(charSequence);
    }

    public final void b(boolean z) {
        xpr.a(this.d, z);
    }

    public final void a() {
        xpr.a(this.e, false);
    }
}
