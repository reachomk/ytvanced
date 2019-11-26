package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abwi */
public class abwi extends abvm {
    public final View r;
    private final akkq s;
    private final xwb t;
    private EditText u;
    private TextView v;
    private ImageView w;
    private ViewGroup x;
    private View y;

    public abwi(Context context, akkq akkq, akvz akvz, akvp akvp, aaas aaas, acwa acwa, abrq abrq, abru abru, abrf abrf, akti akti, abqz abqz, xwb xwb, akpi akpi, alck alck, View view, boolean z, boolean z2) {
        super(context, akvz, akvp, aaas, acwa.t(), abrq, abru, abrf, akti, abqz, akpi, alck, z, z2);
        this.s = (akkq) amqw.a((Object) akkq);
        this.r = (View) amqw.a((Object) view);
        this.t = xwb;
    }

    public final int o() {
        return R.layout.live_chat_button_subtext_light;
    }

    public final void a(aygk aygk) {
        this.s.a(w(), aygk);
    }

    public final ViewGroup n() {
        return (ViewGroup) this.r.findViewById(R.id.live_chat_button_menu);
    }

    public final View m() {
        return this.r.findViewById(R.id.live_chat_text_field_bar);
    }

    public final View h() {
        return this.r.findViewById(R.id.live_chat_action_panel);
    }

    public final View d() {
        return this.r;
    }

    public final EditText e() {
        if (this.u == null) {
            this.u = (EditText) this.r.findViewById(R.id.edit_text);
            this.u.setFocusable(true);
            this.u.setFocusableInTouchMode(true);
            this.u.setLongClickable(true);
        }
        return this.u;
    }

    public final TextView g() {
        if (this.v == null) {
            this.v = (TextView) this.r.findViewById(R.id.restricted_participation_bar);
        }
        return this.v;
    }

    public final ImageView i() {
        if (this.w == null) {
            this.w = (ImageView) this.r.findViewById(R.id.live_chat_send_button);
        }
        return this.w;
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView r() {
        return (TextView) this.r.findViewById(R.id.character_counter);
    }

    public final ViewGroup j() {
        if (this.x == null) {
            this.x = (ViewGroup) this.r.findViewById(R.id.inline_extra_buttons);
        }
        return this.x;
    }

    public final View k() {
        if (this.y == null) {
            this.y = this.r.findViewById(R.id.thumbnail_and_emoji_picker_container);
        }
        return this.y;
    }

    public final void l() {
        this.u.getText().clear();
        xpr.a(this.u);
    }

    public final View a(arwf arwf) {
        akvp akvp = this.d;
        arwh a = arwh.a(arwf.b);
        if (a == null) {
            a = arwh.UNKNOWN;
        }
        int a2 = akvp.a(a);
        arwh a3 = arwh.a(arwf.b);
        if (a3 == null) {
            a3 = arwh.UNKNOWN;
        }
        if (a3 != arwh.SUPER_CHAT_FOR_GOOD) {
            return a(a2);
        }
        AppCompatImageView y = y();
        if (a2 != 0) {
            y.setImageResource(a2);
            y.setColorFilter(ra.c(this.a, R.color.yt_grey3));
        }
        return y;
    }

    public final View a(int i) {
        View y = y();
        if (i != 0) {
            Drawable d = st.d(agb.b(this.a, i));
            st.a(d, d(false));
            xpr.a(y, y.getBackground(), 1);
            y.setImageDrawable(d);
            y.setVisibility(0);
        }
        return y;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(int i) {
        TextView r = r();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, this.t.a);
        if (r != null) {
            if (e().getLineCount() <= 1) {
                r.setVisibility(8);
                return;
            }
            int a;
            if (i <= 0) {
                a = xwe.a(contextThemeWrapper, R.attr.liveChatActionPanelChipBackgroundOverlimit, 0);
            } else {
                a = xwe.a(contextThemeWrapper, R.attr.liveChatActionPanelChipBackground, 0);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Integer.toString(i));
            spannableStringBuilder.setSpan(new absb(contextThemeWrapper, xwe.a(contextThemeWrapper, R.attr.ytStaticBrandWhite, 0), a, null), 0, spannableStringBuilder.length(), 33);
            r.setText(spannableStringBuilder.append(" "));
            r.setVisibility(0);
        }
    }

    public final void a(boolean z) {
        Drawable d = st.d(agb.b(this.a, R.drawable.ic_emoji_white_24));
        st.a(d, d(z));
        x().setContentDescription(this.a.getResources().getString(!z ? R.string.open_emoji_picker_button_cd : R.string.close_emoji_picker_button_cd));
        x().setImageDrawable(d);
    }

    private final int d(boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, this.t.a);
        int i = !q() ? R.attr.ytIconInactive : R.attr.ytStaticWhite;
        if (z) {
            i = R.attr.liveChatEmojiPickerActiveIconColor;
        }
        return xwe.a(contextThemeWrapper, i, 0);
    }

    private final AppCompatImageView y() {
        return (AppCompatImageView) LayoutInflater.from(this.a).inflate(R.layout.live_chat_action_button_menu_toggle, j(), false);
    }
}
