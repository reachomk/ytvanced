package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.conversation.ui.TypingIndicatorView;
import com.google.android.youtube.R;

/* renamed from: yyh */
final class yyh extends aqj {
    public final ImageView p;
    public final TypingIndicatorView q;

    yyh(View view) {
        super(view);
        this.p = (ImageView) amqw.a((ImageView) view.findViewById(R.id.avatar));
        this.q = (TypingIndicatorView) amqw.a((TypingIndicatorView) view.findViewById(R.id.typing_indicator));
    }
}
