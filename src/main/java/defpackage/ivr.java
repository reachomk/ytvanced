package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ivr */
public final class ivr implements akot {
    public final TextView a;
    private final LinearLayout b;
    private final FrameLayout c;
    private final ImageView d = ((ImageView) this.b.findViewById(R.id.button));
    private final Drawable e;
    private final Drawable f;
    private final Resources g;

    public ivr(Context context) {
        amqw.a((Object) context);
        this.g = context.getResources();
        this.b = (LinearLayout) View.inflate(context, R.layout.watch_card_expand_collapse_button, null);
        this.e = ra.a(context, (int) R.drawable.ic_arrow_expand);
        this.f = ra.a(context, (int) R.drawable.ic_arrow_collapse);
        this.a = (TextView) this.b.findViewById(R.id.label);
        this.c = (FrameLayout) this.b.findViewById(R.id.expand_collapse_button);
        abe.a(this.b, new ivq(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ist ist = (ist) obj;
        Resources resources = this.d.getResources();
        LinearLayout linearLayout;
        if (ist.a == 0 && ist.d) {
            linearLayout = this.b;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) this.g.getDimension(R.dimen.expand_button_top_padding_for_multiple_season_show), this.b.getPaddingRight(), this.b.getPaddingBottom());
        } else {
            linearLayout = this.b;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) this.g.getDimension(R.dimen.collapse_button_top_padding_all_shows), this.b.getPaddingRight(), this.b.getPaddingBottom());
        }
        int i = ist.a;
        String str = "";
        if (i == 0) {
            this.b.setOnClickListener(ist.b);
            this.d.setImageDrawable(this.e);
            this.d.setVisibility(0);
            this.a.setVisibility(0);
            TextView textView = this.a;
            CharSequence charSequence = ist.c;
            if (charSequence == null) {
                charSequence = resources.getString(R.string.watch_card_expand_text);
            }
            textView.setText(charSequence);
            this.c.setContentDescription(str);
        } else if (i == 1) {
            this.b.setOnClickListener(ist.b);
            this.d.setImageDrawable(this.f);
            this.d.setVisibility(0);
            this.a.setVisibility(8);
            this.a.setText(null);
            this.c.setContentDescription(this.g.getString(R.string.universal_watch_card_collapse_button_accessibility_label));
        } else {
            this.b.setOnClickListener(null);
            this.d.setImageDrawable(null);
            this.d.setVisibility(8);
            this.a.setText(null);
            this.a.setVisibility(8);
            this.c.setContentDescription(str);
        }
    }
}
