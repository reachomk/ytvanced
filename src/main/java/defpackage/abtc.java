package defpackage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abtc */
final /* synthetic */ class abtc implements OnClickListener {
    private final abta a;
    private final aqwx b;

    abtc(abta abta, aqwx aqwx) {
        this.a = abta;
        this.b = aqwx;
    }

    public final void onClick(View view) {
        abta abta = this.a;
        aqwx aqwx = this.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Object obj = 1;
        for (arml arml : aqwx.e) {
            if (obj == null) {
                spannableStringBuilder.append("\n\n");
            }
            spannableStringBuilder.append(aabb.a(arml, abta.g, false));
            obj = null;
        }
        View inflate = View.inflate(abta.c, R.layout.live_chat_simple_text_view, null);
        Resources resources = abta.c.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_simple_dialog_text_padding);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        textView.setTextColor(xwe.a(abta.c, R.attr.ytTextSecondary, 0));
        adl.a(textView, (int) R.style.f372TextAppearance.AppCompat.Subhead);
        textView.setLineSpacing((float) resources.getDimensionPixelOffset(R.dimen.live_chat_dialog_message_line_spacing_extra), 1.0f);
        textView.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 0);
        textView.setText(spannableStringBuilder);
        aeg aeg = new aeg(abta.c);
        aeg.a(aqwx.c);
        aeg.b(17039370, null);
        aeg.a(inflate);
        aeg.a().show();
    }
}
