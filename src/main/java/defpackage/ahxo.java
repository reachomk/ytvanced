package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.vr.sdk.base.HeadsetSelector.HeadsetInfo;

/* renamed from: ahxo */
public final class ahxo extends akyg {
    public static final String Z = ahxo.class.getSimpleName();
    public ahxs aa;
    private SharedPreferences ab;
    private TextView ac;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return 2;
    }

    /* Access modifiers changed, original: protected|final */
    public final String X() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final OnItemClickListener Y() {
        return null;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ ListAdapter Z() {
        return null;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vr_speed_bump, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        view.setVisibility(0);
        view.findViewById(R.id.vr_speed_bump_icon).setVisibility(8);
        ((TextView) view.findViewById(R.id.vr_speed_bump_title)).setText(R.string.vr_watch_in_vr_title);
        this.ac = (TextView) view.findViewById(R.id.vr_speed_bump_message);
        Button button = (Button) view.findViewById(R.id.vr_speed_bump_dismiss_button);
        button.setText(R.string.vr_select_viewers_label);
        button.setOnClickListener(new ahxr(this));
        Button button2 = (Button) view.findViewById(R.id.vr_speed_bump_action_button);
        button2.setText(R.string.vr_welcome_continue);
        button2.setOnClickListener(new ahxq(this));
        this.ab = ((wwz) p().getApplication()).i().ox();
    }

    public final void W_() {
        super.W_();
        HeadsetInfo b = ahxp.b(M_(), this.ab);
        String displayName = b != null ? b.getDisplayName() : "";
        this.ac.setText(Html.fromHtml(a((int) R.string.vr_watch_in_vr_message, displayName), 63));
    }
}
