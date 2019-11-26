package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yeb */
public final class yeb {
    public final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.bottom_sheet_header_large_text));
    private final TextView c = ((TextView) this.a.findViewById(R.id.bottom_sheet_header_medium_text));
    private final aloz d;

    public yeb(Context context, akkq akkq) {
        amqw.a((Object) akkq);
        this.a = View.inflate(context, R.layout.conversation_bottom_sheet_header, null);
        this.d = new aloz(akkq, (ImageView) this.a.findViewById(R.id.bottom_sheet_user_thumbnail));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, aygk aygk) {
        this.a.setVisibility(0);
        this.b.setVisibility(0);
        this.b.setText(charSequence);
        xpr.a(this.c, charSequence2);
        this.d.a(aygk);
    }
}
